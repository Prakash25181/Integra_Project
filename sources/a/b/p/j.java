package a.b.p;

import a.b.p.n0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f202b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static j f203c;

    /* renamed from: a, reason: collision with root package name */
    public n0 f204a;

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f203c == null) {
                b();
            }
            jVar = f203c;
        }
        return jVar;
    }

    public static synchronized void b() {
        synchronized (j.class) {
            if (f203c == null) {
                j jVar = new j();
                f203c = jVar;
                jVar.f204a = n0.a();
                f203c.f204a.a(new a());
            }
        }
    }

    public synchronized Drawable a(Context context, int i) {
        return this.f204a.b(context, i);
    }

    public synchronized Drawable a(Context context, int i, boolean z) {
        return this.f204a.a(context, i, z);
    }

    public synchronized void a(Context context) {
        this.f204a.a(context);
    }

    public synchronized ColorStateList b(Context context, int i) {
        return this.f204a.c(context, i);
    }

    public static void a(Drawable drawable, v0 v0Var, int[] iArr) {
        n0.a(drawable, v0Var, iArr);
    }

    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public static class a implements n0.e {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f205a = {a.b.e.abc_textfield_search_default_mtrl_alpha, a.b.e.abc_textfield_default_mtrl_alpha, a.b.e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f206b = {a.b.e.abc_ic_commit_search_api_mtrl_alpha, a.b.e.abc_seekbar_tick_mark_material, a.b.e.abc_ic_menu_share_mtrl_alpha, a.b.e.abc_ic_menu_copy_mtrl_am_alpha, a.b.e.abc_ic_menu_cut_mtrl_alpha, a.b.e.abc_ic_menu_selectall_mtrl_alpha, a.b.e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f207c = {a.b.e.abc_textfield_activated_mtrl_alpha, a.b.e.abc_textfield_search_activated_mtrl_alpha, a.b.e.abc_cab_background_top_mtrl_alpha, a.b.e.abc_text_cursor_material, a.b.e.abc_text_select_handle_left_mtrl_dark, a.b.e.abc_text_select_handle_middle_mtrl_dark, a.b.e.abc_text_select_handle_right_mtrl_dark, a.b.e.abc_text_select_handle_left_mtrl_light, a.b.e.abc_text_select_handle_middle_mtrl_light, a.b.e.abc_text_select_handle_right_mtrl_light};
        public final int[] d = {a.b.e.abc_popup_background_mtrl_mult, a.b.e.abc_cab_background_internal_bg, a.b.e.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {a.b.e.abc_tab_indicator_material, a.b.e.abc_textfield_search_material};
        public final int[] f = {a.b.e.abc_btn_check_material, a.b.e.abc_btn_radio_material, a.b.e.abc_btn_check_material_anim, a.b.e.abc_btn_radio_material_anim};

        public final ColorStateList a(Context context, int i) {
            int b2 = s0.b(context, a.b.a.colorControlHighlight);
            return new ColorStateList(new int[][]{s0.f250b, s0.d, s0.f251c, s0.f}, new int[]{s0.a(context, a.b.a.colorButtonNormal), a.e.f.a.a(b2, i), a.e.f.a.a(b2, i), i});
        }

        public ColorStateList b(Context context, int i) {
            if (i == a.b.e.abc_edit_text_material) {
                return a.b.l.a.a.b(context, a.b.c.abc_tint_edittext);
            }
            if (i == a.b.e.abc_switch_track_mtrl_alpha) {
                return a.b.l.a.a.b(context, a.b.c.abc_tint_switch_track);
            }
            if (i == a.b.e.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList c2 = s0.c(context, a.b.a.colorSwitchThumbNormal);
                if (c2 != null && c2.isStateful()) {
                    iArr[0] = s0.f250b;
                    iArr2[0] = c2.getColorForState(iArr[0], 0);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.b(context, a.b.a.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = c2.getDefaultColor();
                } else {
                    iArr[0] = s0.f250b;
                    iArr2[0] = s0.a(context, a.b.a.colorSwitchThumbNormal);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.b(context, a.b.a.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = s0.b(context, a.b.a.colorSwitchThumbNormal);
                }
                return new ColorStateList(iArr, iArr2);
            }
            if (i == a.b.e.abc_btn_default_mtrl_shape) {
                return a(context, s0.b(context, a.b.a.colorButtonNormal));
            }
            if (i == a.b.e.abc_btn_borderless_material) {
                return a(context, 0);
            }
            if (i == a.b.e.abc_btn_colored_material) {
                return a(context, s0.b(context, a.b.a.colorAccent));
            }
            if (i != a.b.e.abc_spinner_mtrl_am_alpha && i != a.b.e.abc_spinner_textfield_background_material) {
                if (a(this.f206b, i)) {
                    return s0.c(context, a.b.a.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return a.b.l.a.a.b(context, a.b.c.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return a.b.l.a.a.b(context, a.b.c.abc_tint_btn_checkable);
                }
                if (i == a.b.e.abc_seekbar_thumb_material) {
                    return a.b.l.a.a.b(context, a.b.c.abc_tint_seek_thumb);
                }
                return null;
            }
            return a.b.l.a.a.b(context, a.b.c.abc_tint_spinner);
        }

        public final void a(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f202b;
            }
            drawable.setColorFilter(j.a(i, mode));
        }

        public final boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (j.class) {
            a2 = n0.a(i, mode);
        }
        return a2;
    }
}
