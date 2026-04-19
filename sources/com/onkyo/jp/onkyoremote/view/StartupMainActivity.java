package com.onkyo.jp.onkyoremote.view;

import a.b.k.h;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import b.b.a.a.f.a0;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;

/* loaded from: classes.dex */
public class StartupMainActivity extends h {
    public RemoteApplication p;
    public g0 q;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StartupMainActivity startupMainActivity = StartupMainActivity.this;
            startupMainActivity.q.a(1, 0, 100, new a0(startupMainActivity));
        }
    }

    @Override // a.b.k.h, a.h.a.d, androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.activity_startup_main);
        h().d();
        this.p = (RemoteApplication) getApplication();
        this.q = new g0(new Handler(), 2);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // a.h.a.d, android.app.Activity
    public void onPause() {
        super.onPause();
        this.q.a(0);
        this.q.a(1);
    }

    @Override // a.b.k.h, a.h.a.d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.q.a(0, 750, new a());
    }

    @Override // a.h.a.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.p.a((RemoteApplication.c) null);
    }
}
