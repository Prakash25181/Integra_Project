package b.b.a.a.f.m0;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import b.b.a.a.f.c;
import com.onkyo.integraRemote4A.R;
import java.lang.reflect.Field;

/* compiled from: NumberSelectPopup.java */
/* loaded from: classes.dex */
public class u0 extends z0 {
    public NumberPicker h;
    public int i;
    public int j;
    public int k;
    public d l;

    /* compiled from: NumberSelectPopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = u0.this.l;
            if (dVar != null) {
                dVar.a();
            }
            u0.this.f();
        }
    }

    /* compiled from: NumberSelectPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u0 u0Var = u0.this;
            d dVar = u0Var.l;
            if (dVar != null) {
                dVar.a(u0Var.h.getValue());
            }
            u0.this.f();
        }
    }

    /* compiled from: NumberSelectPopup.java */
    /* loaded from: classes.dex */
    public class c implements c.g {
        public c() {
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            u0.this.i();
        }
    }

    /* compiled from: NumberSelectPopup.java */
    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(int i);
    }

    public u0(Context context) {
        super(context);
    }

    public void a(int i, int i2) {
        this.i = i;
        this.j = i2;
        NumberPicker numberPicker = this.h;
        if (numberPicker != null) {
            numberPicker.setMinValue(i);
            this.h.setMaxValue(this.j);
        }
        int max = Math.max(this.i, Math.min(this.k, this.j));
        this.k = max;
        NumberPicker numberPicker2 = this.h;
        if (numberPicker2 != null) {
            numberPicker2.setValue(max);
        }
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_popup_number_select);
        a2.findViewById(R.id.popup_frame);
        ((Button) a2.findViewById(R.id.cancel_button)).setOnClickListener(new a());
        ((Button) a2.findViewById(R.id.set_button)).setOnClickListener(new b());
        NumberPicker numberPicker = (NumberPicker) a2.findViewById(R.id.number_picker);
        this.h = numberPicker;
        numberPicker.setMinValue(this.i);
        this.h.setMaxValue(this.j);
        this.h.setValue(this.k);
        this.h.setDescendantFocusability(393216);
        NumberPicker numberPicker2 = this.h;
        int color = this.f1597b.getResources().getColor(R.color.number_select_text);
        int childCount = numberPicker2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = numberPicker2.getChildAt(i);
            if (childAt instanceof EditText) {
                try {
                    Field declaredField = numberPicker2.getClass().getDeclaredField("mSelectorWheelPaint");
                    declaredField.setAccessible(true);
                    ((Paint) declaredField.get(numberPicker2)).setColor(color);
                    ((EditText) childAt).setTextColor(color);
                    numberPicker2.invalidate();
                    break;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                } catch (NoSuchFieldException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return a2;
    }

    @Override // b.b.a.a.f.m0.z0
    public void f() {
        View view = this.f;
        b.b.a.a.f.c.c(view, view.getHeight(), new c());
    }

    @Override // b.b.a.a.f.m0.z0
    public void g() {
        View view = this.f;
        view.setTranslationY(view.getHeight());
        b.b.a.a.f.c.c(view, 0, null);
    }

    @Override // b.b.a.a.f.m0.z0
    public void a(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = 81;
    }
}
