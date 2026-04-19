package com.onkyo.jp.onkyoremote.view.settings;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;
import b.b.a.a.f.n0.m;
import com.onkyo.integraRemote4A.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class LicenseActivity extends m {
    @Override // b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        setContentView(R.layout.activity_settings_license);
        StringBuilder sb = new StringBuilder();
        AssetManager assets = getResources().getAssets();
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : assets.list("licenses")) {
                arrayList.add("licenses/" + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assets.open((String) it.next())));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                        sb.append("\n");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                sb.append("\n");
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        ((TextView) findViewById(R.id.license_label)).setText(sb.toString());
    }
}
