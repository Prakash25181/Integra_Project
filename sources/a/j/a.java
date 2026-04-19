package a.j;

import a.j.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f559c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class, C0022a> f560a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class, Boolean> f561b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    /* renamed from: a.j.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0022a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<e.a, List<b>> f562a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map<b, e.a> f563b;

        public C0022a(Map<b, e.a> map) {
            this.f563b = map;
            for (Map.Entry<b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<b> list = this.f562a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f562a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, h hVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    if (bVar != null) {
                        try {
                            int i = bVar.f564a;
                            if (i == 0) {
                                bVar.f565b.invoke(obj, new Object[0]);
                            } else if (i == 1) {
                                bVar.f565b.invoke(obj, hVar);
                            } else if (i == 2) {
                                bVar.f565b.invoke(obj, hVar, aVar);
                            }
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException("Failed to call observer method", e2.getCause());
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f564a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f565b;

        public b(int i, Method method) {
            this.f564a = i;
            this.f565b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f564a == bVar.f564a && this.f565b.getName().equals(bVar.f565b.getName());
        }

        public int hashCode() {
            return this.f565b.getName().hashCode() + (this.f564a * 31);
        }
    }

    public C0022a a(Class cls) {
        C0022a c0022a = this.f560a.get(cls);
        return c0022a != null ? c0022a : a(cls, null);
    }

    public final void a(Map<b, e.a> map, b bVar, e.a aVar, Class cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f565b;
        StringBuilder a2 = b.a.a.a.a.a("Method ");
        a2.append(method.getName());
        a2.append(" in ");
        a2.append(cls.getName());
        a2.append(" already declared with different @OnLifecycleEvent value: previous value ");
        a2.append(aVar2);
        a2.append(", new value ");
        a2.append(aVar);
        throw new IllegalArgumentException(a2.toString());
    }

    public final C0022a a(Class cls, Method[] methodArr) {
        int i;
        C0022a a2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (a2 = a(superclass)) != null) {
            hashMap.putAll(a2.f563b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.a> entry : a(cls2).f563b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(h.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                e.a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(e.a.class)) {
                        if (value != e.a.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0022a c0022a = new C0022a(hashMap);
        this.f560a.put(cls, c0022a);
        this.f561b.put(cls, Boolean.valueOf(z));
        return c0022a;
    }
}
