package b.b.a.a.f.k0.u;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import b.b.a.a.b.r.k;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;

/* compiled from: NetUsbInputPage.java */
/* loaded from: classes.dex */
public class c extends n implements k.b {
    public TextView e;
    public TextView f;
    public EditText g;
    public Button h;
    public View i;
    public b.b.a.a.b.r.l j;
    public b.b.a.a.b.r.k k;
    public g0 l;

    /* compiled from: NetUsbInputPage.java */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            cVar.h.setEnabled(cVar.g.getText().length() > 0);
        }
    }

    /* compiled from: NetUsbInputPage.java */
    /* loaded from: classes.dex */
    public class b implements TextView.OnEditorActionListener {
        public b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            c.a(c.this);
            return false;
        }
    }

    /* compiled from: NetUsbInputPage.java */
    /* renamed from: b.b.a.a.f.k0.u.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0046c implements View.OnClickListener {
        public ViewOnClickListenerC0046c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a(c.this);
        }
    }

    public c(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        b.b.a.a.b.r.l lVar = dVar.q;
        this.j = lVar;
        this.k = lVar.j();
        this.l = new g0(new Handler(), 1);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.k.f975a.a(this);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_input);
        this.e = (TextView) a2.findViewById(R.id.title_label);
        this.f = (TextView) a2.findViewById(R.id.mode_label);
        EditText editText = (EditText) a2.findViewById(R.id.edit_text);
        this.g = editText;
        editText.addTextChangedListener(new a());
        this.g.setOnEditorActionListener(new b());
        Button button = (Button) a2.findViewById(R.id.ok_button);
        this.h = button;
        button.setEnabled(false);
        this.h.setOnClickListener(new ViewOnClickListenerC0046c());
        this.i = a2.findViewById(R.id.indicator_view);
        g();
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.b.r.k.b
    public void d() {
        f();
    }

    @Override // b.b.a.a.b.r.k.b
    public void e() {
        this.l.a(0);
        this.g.setText("");
        g();
        k.a aVar = this.k.f977c;
        if (aVar == k.a.OFF || aVar != k.a.NONE) {
            return;
        }
        this.g.setText("");
    }

    public final void g() {
        Resources resources = this.f1597b.getResources();
        this.i.setVisibility(8);
        this.e.setText(this.k.d);
        int ordinal = this.k.f977c.ordinal();
        int i = R.string.input_password;
        switch (ordinal) {
            case 1:
            case 11:
                i = R.string.input_userName;
                break;
            case 2:
            case 12:
                break;
            case 3:
                i = R.string.input_artist;
                break;
            case 4:
                i = R.string.input_album;
                break;
            case 5:
                i = R.string.input_song;
                break;
            case 6:
                i = R.string.input_station;
                break;
            case 7:
                i = R.string.input_tag;
                break;
            case 8:
                i = R.string.input_artistOrSong;
                break;
            case 9:
                i = R.string.input_episode;
                break;
            case 10:
                i = R.string.input_pinCode;
                break;
            case 13:
                i = R.string.input_url;
                break;
            default:
                i = 0;
                break;
        }
        if (i != 0) {
            this.f.setVisibility(0);
            this.f.setText(resources.getString(i));
        } else {
            this.f.setVisibility(8);
        }
        int ordinal2 = this.k.f977c.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                switch (ordinal2) {
                    case 10:
                        this.g.setInputType(2);
                        return;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        this.g.setInputType(17);
                        return;
                    default:
                        this.g.setInputType(1);
                        return;
                }
            }
            this.g.setInputType(129);
            return;
        }
        this.g.setInputType(33);
    }

    public static /* synthetic */ void a(c cVar) {
        b.b.a.a.b.r.k kVar = cVar.k;
        kVar.f976b.a(b.b.a.a.b.p.v.a.NKY, cVar.g.getText().toString());
        cVar.l.a(0, 2000, new d(cVar));
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.l.a(0);
        this.k.f975a.b(this);
        f();
    }
}
