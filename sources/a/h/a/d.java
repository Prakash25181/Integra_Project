package a.h.a;

import a.e.d.a;
import a.j.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class d extends ComponentActivity implements a.b, a.d {
    public final f g;
    public final a.j.i h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public a.d.i<String> m;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class a extends h<d> implements a.j.u, a.a.c {
        public a() {
            super(d.this);
        }

        @Override // a.j.h
        public a.j.e a() {
            return d.this.h;
        }

        @Override // a.a.c
        public OnBackPressedDispatcher b() {
            return d.this.f;
        }

        @Override // a.j.u
        public a.j.t d() {
            return d.this.d();
        }

        @Override // a.h.a.e
        public boolean e() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // a.h.a.e
        public View a(int i) {
            return d.this.findViewById(i);
        }
    }

    public d() {
        a aVar = new a();
        a.b.k.r.a(aVar, "callbacks == null");
        this.g = new f(aVar);
        this.h = new a.j.i(this);
        this.k = true;
    }

    public static void b(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // a.e.d.a.d
    public final void a(int i) {
        if (i != -1) {
            b(i);
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print(" mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.k);
        if (getApplication() != null) {
            a.k.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.g.f494a.f.a(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void f() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.g.a();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a2 = this.m.a(i4);
            this.m.c(i4);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            } else {
                if (this.g.f494a.f.a(a2) == null) {
                    Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
                    return;
                }
                return;
            }
        }
        a.e.d.a.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.a();
        this.g.f494a.f.a(configuration);
    }

    @Override // androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        h<?> hVar = this.g.f494a;
        hVar.f.a(hVar, hVar, (Fragment) null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            h<?> hVar2 = this.g.f494a;
            if (hVar2 instanceof a.j.u) {
                hVar2.f.a(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.l = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                        this.m = new a.d.i<>(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.m.c(intArray[i], stringArray[i]);
                        }
                    } else {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.m == null) {
            this.m = new a.d.i<>(10);
            this.l = 0;
        }
        super.onCreate(bundle);
        this.h.a(e.a.ON_CREATE);
        this.g.f494a.f.d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            f fVar = this.g;
            return onCreatePanelMenu | fVar.f494a.f.a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.g.f494a.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.g.f494a.f.e();
        this.h.a(e.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.g.f494a.f.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.g.f494a.f.b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.g.f494a.f.a(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.g.f494a.f.a(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.g.a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.g.f494a.f.a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.j = false;
        this.g.f494a.f.a(3);
        this.h.a(e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.g.f494a.f.b(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.h.a(e.a.ON_RESUME);
        j jVar = this.g.f494a.f;
        jVar.u = false;
        jVar.v = false;
        jVar.a(4);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.g.f494a.f.b(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, a.e.d.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.g.a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a2 = this.m.a(i3);
            this.m.c(i3);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.g.f494a.f.a(a2) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.j = true;
        this.g.a();
        this.g.f494a.f.g();
    }

    @Override // androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (a(this.g.f494a.f, e.b.CREATED));
        this.h.a(e.a.ON_STOP);
        Parcelable k = this.g.f494a.f.k();
        if (k != null) {
            bundle.putParcelable("android:support:fragments", k);
        }
        if (this.m.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] iArr = new int[this.m.b()];
            String[] strArr = new String[this.m.b()];
            for (int i = 0; i < this.m.b(); i++) {
                iArr[i] = this.m.b(i);
                strArr[i] = this.m.d(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.k = false;
        if (!this.i) {
            this.i = true;
            j jVar = this.g.f494a.f;
            jVar.u = false;
            jVar.v = false;
            jVar.a(2);
        }
        this.g.a();
        this.g.f494a.f.g();
        this.h.a(e.a.ON_START);
        j jVar2 = this.g.f494a.f;
        jVar2.u = false;
        jVar2.v = false;
        jVar2.a(3);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.g.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.k = true;
        do {
        } while (a(this.g.f494a.f, e.b.CREATED));
        j jVar = this.g.f494a.f;
        jVar.v = true;
        jVar.a(2);
        this.h.a(e.a.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public static boolean a(i iVar, e.b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.a()) {
            if (fragment != null) {
                if (fragment.S.f569b.a(e.b.STARTED)) {
                    fragment.S.a(bVar);
                    z = true;
                }
                h hVar = fragment.t;
                if ((hVar == null ? null : d.this) != null) {
                    z |= a(fragment.i(), bVar);
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.g.f494a.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
