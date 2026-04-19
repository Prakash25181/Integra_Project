package com.onkyo.jp.onkyoremote.view.settings;

import android.os.Bundle;
import android.webkit.WebView;
import b.b.a.a.f.n0.m;
import com.onkyo.integraRemote4A.R;

/* loaded from: classes.dex */
public class DeviceRestrictionActivity extends m {
    @Override // b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        setContentView(R.layout.activity_settings_device_restriction);
        WebView webView = (WebView) findViewById(R.id.webView);
        String string = getResources().getString(R.string.langCode);
        String str = "file:///android_asset";
        if (string.length() > 0) {
            str = "file:///android_asset/" + string;
        }
        webView.loadUrl(str + "/ModelRestriction.html");
    }
}
