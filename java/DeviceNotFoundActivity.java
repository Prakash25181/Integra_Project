package com.onkyo.jp.onkyoremote.view.discovery;

import a.b.k.h;
import a.b.k.r;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import com.onkyo.integraRemote4A.R;

/* loaded from: classes.dex */
public class DeviceNotFoundActivity extends h {
    @Override // a.b.k.h, a.h.a.d, androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.b(this);
        setContentView(R.layout.activity_device_not_found);
        h().c(true);
        WebView webView = (WebView) findViewById(R.id.webView);
        String string = getResources().getString(R.string.langCode);
        String str = "file:///android_asset";
        if (string.length() > 0) {
            str = "file:///android_asset/" + string;
        }
        webView.loadUrl(str + "/NoDevice.html");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
