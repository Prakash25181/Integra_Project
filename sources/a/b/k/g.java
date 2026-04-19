package a.b.k;

import a.b.p.i0;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class g extends q implements DialogInterface {
    public final AlertController d;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AlertController.b f13a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14b;

        public a(Context context) {
            int a2 = g.a(context, 0);
            this.f13a = new AlertController.b(new ContextThemeWrapper(context, g.a(context, a2)));
            this.f14b = a2;
        }

        public g a() {
            int i;
            g gVar = new g(this.f13a.f639a, this.f14b);
            AlertController.b bVar = this.f13a;
            AlertController alertController = gVar.d;
            View view = bVar.g;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i2 = bVar.f641c;
                if (i2 != 0) {
                    alertController.a(i2);
                }
                int i3 = bVar.e;
                if (i3 != 0) {
                    if (alertController != null) {
                        TypedValue typedValue = new TypedValue();
                        alertController.f633a.getTheme().resolveAttribute(i3, typedValue, true);
                        alertController.a(typedValue.resourceId);
                    } else {
                        throw null;
                    }
                }
            }
            if (bVar.l != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f640b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.o) {
                    i = alertController.N;
                } else {
                    i = alertController.O;
                }
                ListAdapter listAdapter = bVar.l;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f639a, i, R.id.text1, null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.p;
                if (bVar.m != null) {
                    recycleListView.setOnItemClickListener(new f(bVar, alertController));
                }
                if (bVar.o) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            gVar.setCancelable(this.f13a.h);
            if (this.f13a.h) {
                gVar.setCanceledOnTouchOutside(true);
            }
            gVar.setOnCancelListener(this.f13a.i);
            gVar.setOnDismissListener(this.f13a.j);
            DialogInterface.OnKeyListener onKeyListener = this.f13a.k;
            if (onKeyListener != null) {
                gVar.setOnKeyListener(onKeyListener);
            }
            return gVar;
        }
    }

    public g(Context context, int i) {
        super(context, a(context, i));
        this.d = new AlertController(getContext(), this, getWindow());
    }

    public static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.b.k.q, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.d;
        int i2 = alertController.K;
        if (i2 == 0) {
            i2 = alertController.J;
        } else if (alertController.Q != 1) {
            i2 = alertController.J;
        }
        alertController.f634b.setContentView(i2);
        View findViewById2 = alertController.f635c.findViewById(a.b.f.parentPanel);
        View findViewById3 = findViewById2.findViewById(a.b.f.topPanel);
        View findViewById4 = findViewById2.findViewById(a.b.f.contentPanel);
        View findViewById5 = findViewById2.findViewById(a.b.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(a.b.f.customPanel);
        View view = alertController.h;
        View view2 = null;
        if (view == null) {
            view = alertController.i != 0 ? LayoutInflater.from(alertController.f633a).inflate(alertController.i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !AlertController.a(view)) {
            alertController.f635c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f635c.findViewById(a.b.f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((i0.a) viewGroup.getLayoutParams()).f200a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(a.b.f.topPanel);
        View findViewById7 = viewGroup.findViewById(a.b.f.contentPanel);
        View findViewById8 = viewGroup.findViewById(a.b.f.buttonPanel);
        ViewGroup a2 = alertController.a(findViewById6, findViewById3);
        ViewGroup a3 = alertController.a(findViewById7, findViewById4);
        ViewGroup a4 = alertController.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f635c.findViewById(a.b.f.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(R.id.message);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        Button button = (Button) a4.findViewById(R.id.button1);
        alertController.o = button;
        button.setOnClickListener(alertController.S);
        if (TextUtils.isEmpty(alertController.p) && alertController.r == null) {
            alertController.o.setVisibility(8);
            i = 0;
        } else {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                int i3 = alertController.d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(R.id.button2);
        alertController.s = button2;
        button2.setOnClickListener(alertController.S);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                int i4 = alertController.d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(R.id.button3);
        alertController.w = button3;
        button3.setOnClickListener(alertController.S);
        if (TextUtils.isEmpty(alertController.x) && alertController.z == null) {
            alertController.w.setVisibility(8);
        } else {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.r;
            if (drawable3 != null) {
                int i5 = alertController.d;
                drawable3.setBounds(0, 0, i5, i5);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.w.setVisibility(0);
            i |= 4;
        }
        Context context = alertController.f633a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                alertController.a(alertController.o);
            } else if (i == 2) {
                alertController.a(alertController.s);
            } else if (i == 4) {
                alertController.a(alertController.w);
            }
        }
        if (!(i != 0)) {
            a4.setVisibility(8);
        }
        if (alertController.G != null) {
            a2.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f635c.findViewById(a.b.f.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f635c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.e)) && alertController.P) {
                TextView textView2 = (TextView) alertController.f635c.findViewById(a.b.f.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i6 = alertController.B;
                if (i6 != 0) {
                    alertController.D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                alertController.f635c.findViewById(a.b.f.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                a2.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i7 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = a4.getVisibility() != 8;
        if (!z3 && (findViewById = a3.findViewById(a.b.f.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f == null && alertController.g == null) ? null : a2.findViewById(a.b.f.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(a.b.f.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            if (recycleListView == null) {
                throw null;
            }
            if (!z3 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f636b, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f637c);
            }
        }
        if (!z2) {
            View view3 = alertController.g;
            if (view3 == null) {
                view3 = alertController.A;
            }
            if (view3 != null) {
                int i8 = i7 | (z3 ? 2 : 0);
                View findViewById11 = alertController.f635c.findViewById(a.b.f.scrollIndicatorUp);
                View findViewById12 = alertController.f635c.findViewById(a.b.f.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    a.e.k.n.a(view3, i8, 3);
                    if (findViewById11 != null) {
                        a3.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        a3.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i8 & 1) == 0) {
                        a3.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 == null || (i8 & 2) != 0) {
                        view2 = findViewById12;
                    } else {
                        a3.removeView(findViewById12);
                    }
                    if (findViewById11 != null || view2 != null) {
                        if (alertController.f != null) {
                            alertController.A.setOnScrollChangeListener(new b(alertController, findViewById11, view2));
                            alertController.A.post(new c(alertController, findViewById11, view2));
                        } else {
                            ListView listView2 = alertController.g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new d(alertController, findViewById11, view2));
                                alertController.g.post(new e(alertController, findViewById11, view2));
                            } else {
                                if (findViewById11 != null) {
                                    a3.removeView(findViewById11);
                                }
                                if (view2 != null) {
                                    a3.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.g;
        if (listView3 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i9 = alertController.I;
        if (i9 > -1) {
            listView3.setItemChecked(i9, true);
            listView3.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.d.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.d.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // a.b.k.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.d;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
