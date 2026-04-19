package b.b.a.a.f.n0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

/* compiled from: SettingsBaseActivity.java */
/* loaded from: classes.dex */
public class m extends a.b.k.h {
    public AlertDialog p;
    public b.b.a.a.b.p.d q;

    /* compiled from: SettingsBaseActivity.java */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            m.this.p = null;
        }
    }

    /* compiled from: SettingsBaseActivity.java */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            m.this.p = null;
        }
    }

    /* compiled from: SettingsBaseActivity.java */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f1582b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f1583c;

        public c(d dVar, EditText editText) {
            this.f1582b = dVar;
            this.f1583c = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            m.this.p = null;
            this.f1582b.a(this.f1583c.getText().toString());
        }
    }

    /* compiled from: SettingsBaseActivity.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(String str);
    }

    public void a(Bundle bundle) {
    }

    public /* synthetic */ void a(boolean z) {
        b.b.a.a.b.p.d b2;
        if (z && (b2 = ((RemoteApplication) getApplication()).b()) != null) {
            if (b2.i()) {
                return;
            }
            RemoteApplication.a(this, false);
            return;
        }
        RemoteApplication.a(this);
    }

    public void i() {
        String format;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        b.b.a.a.b.p.d dVar = this.q;
        if (dVar == null || dVar.f852c == null) {
            return;
        }
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        FileOutputStream fileOutputStream3 = null;
        try {
            format = String.format("serialize_%s_selector.dat", dVar.f852c.f799a.g);
        } catch (Exception unused) {
        }
        if (a2 != null) {
            try {
                fileOutputStream = a2.f1118a.openFileOutput(format, 0);
            } catch (IOException unused2) {
                fileOutputStream = null;
            }
            try {
                dVar.p.a(new ObjectOutputStream(fileOutputStream));
                fileOutputStream.close();
            } catch (Exception unused3) {
                fileOutputStream3 = fileOutputStream;
            }
            for (Map.Entry<b.b.a.a.b.o.r, b.b.a.a.b.l> entry : dVar.d.entrySet()) {
                try {
                    fileOutputStream2 = a2.f1118a.openFileOutput(String.format("serialize_%s_zone%d.dat", dVar.f852c.f799a.g, Integer.valueOf(entry.getKey().f836b)), 0);
                } catch (IOException unused4) {
                    fileOutputStream2 = null;
                }
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                    b.b.a.a.b.l value = entry.getValue();
                    if (value != null) {
                        try {
                            objectOutputStream.writeObject(value.f755b.f840c);
                            value.e.a(objectOutputStream);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        fileOutputStream2.close();
                    } else {
                        throw null;
                    }
                } catch (Exception unused5) {
                    fileOutputStream3 = fileOutputStream2;
                }
                fileOutputStream3 = fileOutputStream2;
                if (fileOutputStream3 != null) {
                    try {
                        fileOutputStream3.close();
                        return;
                    } catch (Exception unused6) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f.a();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // a.b.k.h, a.h.a.d, androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.b.k.r.b(this);
        h().c(true);
        b.b.a.a.b.p.d b2 = ((RemoteApplication) getApplication()).b();
        this.q = b2;
        if (b2 != null) {
            a(bundle);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.h.a.d, android.app.Activity
    public void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.p;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.p = null;
        }
    }

    @Override // a.h.a.d, android.app.Activity
    public void onResume() {
        super.onResume();
        ((RemoteApplication) getApplication()).a(new RemoteApplication.c() { // from class: b.b.a.a.f.n0.a
            @Override // com.onkyo.jp.onkyoremote.app.RemoteApplication.c
            public final void a(boolean z) {
                m.this.a(z);
            }
        });
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override // a.h.a.d, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void a(String str, String str2, String str3, d dVar) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_dialog_edit_text, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.edit_text);
        editText.setText(str2);
        editText.setHint(str3);
        this.p = new AlertDialog.Builder(this).setTitle(str).setView(inflate).setPositiveButton(getString(R.string.ok), new c(dVar, editText)).setNegativeButton(getString(R.string.cancel), new b()).setOnCancelListener(new a()).setCancelable(true).show();
    }
}
