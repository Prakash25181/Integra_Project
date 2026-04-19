import React, { createContext, useContext } from 'react';
import { StatusBar } from 'expo-status-bar';
import { View, Text, StyleSheet } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { SafeAreaProvider, useSafeAreaInsets } from 'react-native-safe-area-context';
import { Ionicons } from '@expo/vector-icons';

import ListenScreen from './screens/ListenScreen';
import MediaScreen from './screens/MediaScreen';
import RemoteScreen from './screens/RemoteScreen';
import DeviceScreen from './screens/DeviceScreen';
import { Colors, Radius } from './theme';
import { useReceiverConnection } from './connection';

// Global app context — passes connection state to all screens
export const AppContext = createContext({});

const Tab = createBottomTabNavigator();

function TabBar({ state, descriptors, navigation }) {
  const insets = useSafeAreaInsets();

  const tabs = [
    { name: 'Listen', icon: 'musical-note', iconOutline: 'musical-note-outline' },
    { name: 'Media', icon: 'list', iconOutline: 'list-outline' },
    { name: 'Remote', icon: 'phone-portrait', iconOutline: 'phone-portrait-outline' },
    { name: 'Device', icon: 'radio', iconOutline: 'radio-outline' },
  ];

  return (
    <View style={[styles.tabBar, { paddingBottom: insets.bottom + 4 }]}>
      {state.routes.map((route, index) => {
        const focused = state.index === index;
        const tab = tabs[index];

        return (
          <View
            key={route.key}
            style={[styles.tabItem, focused && styles.tabItemActive]}
          >
            {focused && <View style={styles.tabActiveIndicator} />}
            <Ionicons
              name={focused ? tab.icon : tab.iconOutline}
              size={22}
              color={focused ? Colors.accent2 : Colors.text3}
              onPress={() => navigation.navigate(route.name)}
              style={{ padding: 4 }}
            />
            <Text
              style={[styles.tabLabel, focused && styles.tabLabelActive]}
              onPress={() => navigation.navigate(route.name)}
            >
              {route.name}
            </Text>
          </View>
        );
      })}
    </View>
  );
}

function AppHeader() {
  const insets = useSafeAreaInsets();
  const { connected, deviceInfo, sendCommand } = useContext(AppContext);
  const { Commands } = require('./connection');

  return (
    <View style={[styles.header, { paddingTop: insets.top + 8 }]}>
      <View>
        <Text style={styles.headerDevice}>{deviceInfo.name || 'Onkyo Remote'}</Text>
        <View style={styles.headerStatus}>
          <View style={[styles.statusDot, { backgroundColor: connected ? Colors.green : Colors.red }]} />
          <Text style={[styles.headerStatusText, { color: connected ? Colors.green : Colors.red }]}>
            {connected ? 'Connected' : 'Not Connected'}
          </Text>
        </View>
      </View>
      <View style={styles.headerRight}>
        <Ionicons
          name="search-outline"
          size={18}
          color={Colors.text2}
          style={styles.headerIcon}
          onPress={() => {}}
        />
        <Ionicons
          name={connected ? 'power' : 'power-outline'}
          size={18}
          color={connected ? Colors.accent2 : Colors.text3}
          style={[styles.headerIcon, connected && styles.headerIconActive]}
          onPress={() => sendCommand(Commands.POWER_OFF)}
        />
      </View>
    </View>
  );
}

export default function App() {
  const connection = useReceiverConnection();

  return (
    <SafeAreaProvider>
      <AppContext.Provider value={connection}>
        <StatusBar style="light" backgroundColor={Colors.bg} />
        <NavigationContainer
          theme={{
            dark: true,
            colors: {
              primary: Colors.accent,
              background: Colors.bg,
              card: Colors.bg,
              text: Colors.text1,
              border: Colors.border,
              notification: Colors.accent,
            },
          }}
        >
          <View style={styles.container}>
            <AppHeader />
            <Tab.Navigator
              tabBar={(props) => <TabBar {...props} />}
              screenOptions={{ headerShown: false }}
            >
              <Tab.Screen name="Listen" component={ListenScreen} />
              <Tab.Screen name="Media" component={MediaScreen} />
              <Tab.Screen name="Remote" component={RemoteScreen} />
              <Tab.Screen name="Device" component={DeviceScreen} />
            </Tab.Navigator>
          </View>
        </NavigationContainer>
      </AppContext.Provider>
    </SafeAreaProvider>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.bg },

  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: 20,
    paddingBottom: 10,
    backgroundColor: Colors.bg,
    borderBottomWidth: 0.5,
    borderBottomColor: Colors.border,
  },
  headerDevice: {
    fontSize: 18,
    fontWeight: '700',
    color: Colors.text1,
    letterSpacing: -0.3,
  },
  headerStatus: { flexDirection: 'row', alignItems: 'center', gap: 5, marginTop: 2 },
  statusDot: { width: 6, height: 6, borderRadius: 3 },
  headerStatusText: { fontSize: 12 },
  headerRight: { flexDirection: 'row', gap: 8 },
  headerIcon: {
    width: 36,
    height: 36,
    borderRadius: 12,
    backgroundColor: Colors.card,
    borderWidth: 0.5,
    borderColor: Colors.border,
    alignItems: 'center',
    justifyContent: 'center',
    textAlign: 'center',
    textAlignVertical: 'center',
    paddingTop: 9,
    paddingLeft: 9,
  },
  headerIconActive: {
    backgroundColor: 'rgba(108,99,255,0.2)',
    borderColor: 'rgba(108,99,255,0.4)',
  },

  tabBar: {
    flexDirection: 'row',
    backgroundColor: Colors.bg,
    borderTopWidth: 0.5,
    borderTopColor: Colors.border,
    paddingTop: 8,
    paddingHorizontal: 12,
    gap: 4,
  },
  tabItem: {
    flex: 1,
    alignItems: 'center',
    paddingVertical: 6,
    borderRadius: Radius.sm,
    position: 'relative',
  },
  tabItemActive: {},
  tabActiveIndicator: {
    position: 'absolute',
    top: 0,
    left: '20%',
    right: '20%',
    height: 2,
    backgroundColor: Colors.accent,
    borderRadius: 2,
  },
  tabLabel: { fontSize: 10, fontWeight: '500', color: Colors.text3, marginTop: 3 },
  tabLabelActive: { color: Colors.accent2 },
});
