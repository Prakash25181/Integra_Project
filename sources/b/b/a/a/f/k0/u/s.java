package b.b.a.a.f.k0.u;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b.r.l;
import b.b.a.a.b.r.v;
import b.b.a.a.b.r.x;
import b.b.a.a.f.c;
import b.b.a.a.f.g0;
import b.b.a.a.f.i0;
import b.b.a.a.f.k0.g;
import b.b.a.a.f.k0.u.m;
import b.b.a.a.f.m0.t0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;

/* compiled from: NetUsbSelectorControlPage.java */
/* loaded from: classes.dex */
public class s extends b.b.a.a.f.k0.g implements l.c, v.c {
    public b.b.a.a.b.p.d e;
    public b.b.a.a.b.r.l f;
    public v g;
    public AlertDialog h;
    public n i;
    public m j;
    public g0 k;

    /* compiled from: NetUsbSelectorControlPage.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.b.a.a.b.r.s sVar = (b.b.a.a.b.r.s) s.this.f;
            if (sVar.o == l.e.SERVICE_CHANGING) {
                sVar.f981b.a(b.b.a.a.b.p.v.a.NLT);
            }
        }
    }

    /* compiled from: NetUsbSelectorControlPage.java */
    /* loaded from: classes.dex */
    public class b implements m.b {
        public b() {
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.e = b2;
        b.b.a.a.b.r.l lVar = b2.q;
        this.f = lVar;
        this.g = lVar.k();
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(b.b.a.a.b.r.i iVar) {
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(l.f fVar) {
    }

    @Override // b.b.a.a.b.r.v.c
    public void a(v.a aVar) {
    }

    @Override // b.b.a.a.f.k0.g
    public void b() {
        n nVar = this.i;
        if (nVar != null) {
            nVar.f();
            n nVar2 = this.i;
            if (nVar2 instanceof e) {
                e eVar = (e) nVar2;
                if (eVar.l.c()) {
                    eVar.d.setEnabled(false);
                    eVar.l.m();
                    eVar.o.a(0, 3000, new f(eVar));
                    return;
                }
                return;
            }
            this.f.m();
            return;
        }
        this.f.m();
    }

    @Override // b.b.a.a.b.r.v.c
    public void c() {
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        n nVar = this.i;
        if (nVar != null) {
            nVar.f();
        }
        m mVar = this.j;
        if (mVar != null) {
            mVar.a(false);
        }
        this.f.f980a.b(this);
        this.g.f1009a.b(this);
        this.k.a();
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                this.h.dismiss();
            }
            this.h = null;
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        this.k = new g0(new Handler(), 1);
        this.f.f980a.a((l.d) this);
        this.g.f1009a.a((v.d) this);
        a(this.f.h(), l.a.REPLACE, false);
    }

    @Override // b.b.a.a.f.k0.g
    public void g() {
        n nVar = this.i;
        if (nVar != null) {
            nVar.f();
        }
        this.f.n();
    }

    public final void i() {
        boolean c2 = this.f.c();
        boolean d = this.f.d();
        g.a aVar = this.f1233c;
        if (aVar != null) {
            MainActivity mainActivity = ((b.b.a.a.f.l) aVar).f1375a;
            if (this == mainActivity.b0) {
                mainActivity.a(c2, d);
            }
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_net_usb, viewGroup, false);
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(b.b.a.a.b.o.f fVar, b.b.a.a.b.o.f fVar2) {
        if (fVar2.f808a != b.b.a.a.b.o.e.THIS_DEVICE) {
            i();
        }
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(l.e eVar, l.a aVar) {
        a(eVar, aVar, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(l.e eVar, l.a aVar, boolean z) {
        n nVar;
        if (this.i == null) {
            aVar = l.a.REPLACE;
        }
        if (eVar == l.e.SERVICE_CHANGING) {
            if (!(this.k.f1194b[0] != null)) {
                this.k.a(0, 5000, 5000, new a());
            }
        } else {
            this.k.a(0);
        }
        switch (eVar) {
            case LIST:
            case MENU:
            case MENU_LIST:
                Log.v("Net", "NetUsb UI open list/menu/menulist");
                int i = this.e.f852c.f801c;
                if (i > 2009) {
                    if (i != 2010) {
                        if (i == 2011) {
                            if (this.f.g() == b.b.a.a.b.o.e.NET_TOP) {
                                nVar = new b.b.a.a.f.k0.u.a(getActivity(), this.e);
                                break;
                            } else if (this.f.a() != null) {
                                nVar = new h(getActivity(), this.e);
                                break;
                            }
                        } else if ((this.f.g() != b.b.a.a.b.o.e.FAVORITE && this.f.g() != b.b.a.a.b.o.e.NET_TOP) || (eVar != l.e.MENU && eVar != l.e.MENU_LIST)) {
                            if (this.f.g() == b.b.a.a.b.o.e.NET_TOP) {
                                if (b.b.a.a.b.o.i.d(this.e.b().e())) {
                                    nVar = a("");
                                    break;
                                } else {
                                    nVar = new b.b.a.a.f.k0.u.a(getActivity(), this.e);
                                    break;
                                }
                            } else if (this.f.a() != null) {
                                nVar = new e(getActivity(), this.e, this);
                                break;
                            }
                        } else {
                            nVar = a(getResources().getString(R.string.netNonControllable));
                            break;
                        }
                    } else if (this.f.a() != null) {
                        nVar = new g(getActivity(), this.e);
                        break;
                    }
                }
                nVar = null;
                break;
            case PLAYBACK:
                Log.v("Net", "NetUsb UI open playback");
                nVar = new o(getActivity(), this.e);
                break;
            case POPUP:
                Log.v("Net", "NetUsb UI open popup");
                nVar = new r(getActivity(), this.e);
                break;
            case KEYBOARD:
                Log.v("Net", "NetUsb UI open keyboard");
                nVar = new c(getActivity(), this.e);
                break;
            case SERVICE_CHANGING:
                Log.v("Net", "NetUsb UI Service Change");
                nVar = a(getResources().getString(R.string.connecting));
                break;
            case USB_NON_CONTROLABLE:
                Log.v("Net", "NetUsb UI open non controllable");
                int ordinal = this.f.o().ordinal();
                int i2 = ordinal != 1 ? ordinal != 2 ? ordinal != 6 ? ordinal != 7 ? 0 : R.string.usbBluetoothAdapterConnected : R.string.usbWirelessAdapterConnected : R.string.usbDisabled : R.string.usbNoDevice;
                nVar = a(i2 != 0 ? getResources().getString(i2) : null);
                break;
            case CUSTOM_POPUP:
                Log.v("Net", "NetUsb UI open custom dialog");
                nVar = new b.b.a.a.f.k0.u.b(getActivity(), this.f.i());
                break;
            default:
                nVar = null;
                break;
        }
        if (nVar != null) {
            n nVar2 = this.i;
            if (nVar2 != nVar) {
                FrameLayout frameLayout = (FrameLayout) getView();
                if (nVar2 != null) {
                    nVar2.f();
                }
                frameLayout.addView(nVar.b(), 0, new FrameLayout.LayoutParams(-1, -1));
                this.i = nVar;
                if (nVar2 != null && z && aVar != l.a.REPLACE) {
                    boolean z2 = nVar instanceof c;
                    if (!(nVar2 instanceof c) && !z2) {
                        b.b.a.a.f.c.a(frameLayout, nVar2.d, nVar.d, aVar == l.a.DOWN, null);
                    } else {
                        View view = nVar2.d;
                        View view2 = nVar.d;
                        view2.setAlpha(0.0f);
                        view2.setScaleX(0.9f);
                        view2.setScaleY(0.9f);
                        a.b.k.r.a(view2, (i0) new b.b.a.a.f.g(view, frameLayout, view2, null));
                    }
                } else if (nVar2 != null) {
                    frameLayout.removeView(nVar2.d);
                }
            }
            i();
        }
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(x xVar) {
        m mVar = this.j;
        if (mVar != null) {
            mVar.a(true);
        }
        m mVar2 = new m(getActivity(), xVar);
        this.j = mVar2;
        mVar2.f = new b();
        m mVar3 = this.j;
        FrameLayout frameLayout = (FrameLayout) getView();
        LayoutInflater layoutInflater = (LayoutInflater) mVar3.f1318a.getSystemService("layout_inflater");
        mVar3.g = frameLayout;
        View inflate = layoutInflater.inflate(R.layout.layout_netusb_overlay_popup, (ViewGroup) frameLayout, false);
        mVar3.d = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title_label);
        LinearLayout linearLayout = (LinearLayout) mVar3.d.findViewById(R.id.content_frame);
        t0 t0Var = new t0(mVar3.f1318a, mVar3.f1319b.f1028b);
        mVar3.f1320c = t0Var;
        t0Var.a(textView);
        mVar3.f1320c.a(linearLayout);
        mVar3.d.setAlpha(0.0f);
        mVar3.d.addOnAttachStateChangeListener(new j(mVar3));
        mVar3.d.setOnClickListener(new k(mVar3));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(mVar3.d, layoutParams);
        b.b.a.a.f.c.a(mVar3.d, 1.0f, (c.g) new l(mVar3));
    }

    public final i a(String str) {
        i iVar;
        n nVar = this.i;
        if (nVar != null && (nVar instanceof i)) {
            iVar = (i) nVar;
        } else {
            iVar = new i(getActivity());
        }
        if (str == null) {
            str = "No Control";
        }
        iVar.f = str;
        TextView textView = iVar.e;
        if (textView != null) {
            textView.setText(str);
        }
        return iVar;
    }

    @Override // b.b.a.a.b.r.v.c
    public void a(v.h hVar) {
        i();
    }

    @Override // b.b.a.a.f.k0.g
    public boolean a() {
        n nVar = this.i;
        if (nVar == null) {
            return true;
        }
        nVar.f();
        n nVar2 = this.i;
        if (nVar2 instanceof c) {
            ((c) nVar2).f();
            return true;
        }
        if ((nVar2 instanceof e) && ((e) nVar2) == null) {
            throw null;
        }
        return true;
    }
}
