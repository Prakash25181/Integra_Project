package b.b.a.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.onkyo.integraRemote4A.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: AppSettings.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static b f1116b;

    /* renamed from: c, reason: collision with root package name */
    public static HashMap<String, d> f1117c;
    public static a d;

    /* renamed from: a, reason: collision with root package name */
    public Context f1118a;

    /* compiled from: AppSettings.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public e<String> f1119a;

        /* renamed from: b, reason: collision with root package name */
        public e<String> f1120b;

        /* renamed from: c, reason: collision with root package name */
        public e<Integer> f1121c;
        public e<Integer> d;
        public e<Boolean> e;
        public e<Boolean> f;

        public /* synthetic */ b(a aVar, Context context, C0037a c0037a) {
            String str = "";
            C0037a c0037a2 = null;
            this.f1119a = new e<>(aVar, "app_last_device_id", str, c0037a2);
            this.f1120b = new e<>(aVar, "app_last_device_name", str, c0037a2);
            this.f1121c = new e<>(aVar, "app_upnp_random_mode", Integer.valueOf(context.getResources().getInteger(R.integer.default_app_upnp_random_mode)), c0037a2);
            this.d = new e<>(aVar, "app_upnp_repeat_mode", Integer.valueOf(context.getResources().getInteger(R.integer.default_app_upnp_repeat_mode)), c0037a2);
            context.getResources().getBoolean(R.bool.default_app_query_applog);
            context.getResources().getBoolean(R.bool.default_app_enable_applog);
            this.e = new e<>(aVar, "app_auto_connect", Boolean.valueOf(context.getResources().getBoolean(R.bool.default_app_auto_connect)), c0037a2);
            this.f = new e<>(aVar, "app_tips_artwork_tap", Boolean.valueOf(context.getResources().getBoolean(R.bool.default_app_tips_artwork_tap)), c0037a2);
        }
    }

    /* compiled from: AppSettings.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c d = new c("tips_selector", R.string.tipsTitle_tipsSelector, R.string.tipsMessage_tipsSelector);
        public static final c e = new c("tips_sidebar", R.string.tipsTitle_tipsSidebar, R.string.tipsMessage_tipsSidebar);
        public static final c f;
        public static final List<c> g;

        /* renamed from: a, reason: collision with root package name */
        public String f1122a;

        /* renamed from: b, reason: collision with root package name */
        public int f1123b;

        /* renamed from: c, reason: collision with root package name */
        public int f1124c;

        static {
            c cVar = new c("tips_spotify_connect", R.string.tipsTitle_tipsSpotifyConnect, R.string.tipsMessage_tipsSpotifyConnect);
            f = cVar;
            g = Arrays.asList(d, e, cVar);
        }

        public c(String str, int i, int i2) {
            this.f1122a = str;
            this.f1123b = i;
            this.f1124c = i2;
        }
    }

    /* compiled from: AppSettings.java */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public e<String> f1125a;

        /* renamed from: b, reason: collision with root package name */
        public e<Boolean> f1126b;

        /* renamed from: c, reason: collision with root package name */
        public e<Boolean> f1127c;
        public e<Boolean> d;

        public /* synthetic */ d(a aVar, String str, C0037a c0037a) {
            C0037a c0037a2 = null;
            this.f1125a = new e<>(aVar, b.a.a.a.a.a("device_display_name_", str), "", c0037a2);
            boolean z = true;
            this.f1126b = new e<>(aVar, b.a.a.a.a.a("device_netstandby_notify_", str), z, c0037a2);
            this.f1127c = new e<>(aVar, b.a.a.a.a.a("device_show_restriction_alert_", str), z, c0037a2);
            this.d = new e<>(aVar, b.a.a.a.a.a("device_show_new_remote_notify_", str), z, c0037a2);
        }
    }

    /* compiled from: AppSettings.java */
    /* loaded from: classes.dex */
    public class e<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f1128a;

        /* renamed from: b, reason: collision with root package name */
        public final T f1129b;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ e(a aVar, String str, Object obj, C0037a c0037a) {
            this.f1128a = str;
            this.f1129b = obj;
        }
    }

    public static a a() {
        if (d == null) {
            d = new a();
        }
        return d;
    }

    public String b(String str) {
        return c(a(str).f1125a);
    }

    public final String c(e<String> eVar) {
        return this.f1118a.getSharedPreferences("onkyo_remote_settings", 0).getString(eVar.f1128a, eVar.f1129b);
    }

    public boolean a(c cVar) {
        if (cVar != null) {
            return this.f1118a.getSharedPreferences("onkyo_remote_settings", 0).getBoolean(cVar.f1122a, true);
        }
        return false;
    }

    public final int b(e<Integer> eVar) {
        return this.f1118a.getSharedPreferences("onkyo_remote_settings", 0).getInt(eVar.f1128a, eVar.f1129b.intValue());
    }

    public final d a(String str) {
        d dVar = f1117c.get(str);
        return dVar == null ? new d(this, str, null) : dVar;
    }

    public final void a(e<Integer> eVar, int i) {
        SharedPreferences.Editor edit = this.f1118a.getSharedPreferences("onkyo_remote_settings", 0).edit();
        edit.putInt(eVar.f1128a, i);
        edit.commit();
    }

    public final void a(e<Boolean> eVar, boolean z) {
        SharedPreferences.Editor edit = this.f1118a.getSharedPreferences("onkyo_remote_settings", 0).edit();
        edit.putBoolean(eVar.f1128a, z);
        edit.commit();
    }

    public final boolean a(e<Boolean> eVar) {
        return this.f1118a.getSharedPreferences("onkyo_remote_settings", 0).getBoolean(eVar.f1128a, eVar.f1129b.booleanValue());
    }

    public final void a(e<String> eVar, String str) {
        SharedPreferences.Editor edit = this.f1118a.getSharedPreferences("onkyo_remote_settings", 0).edit();
        edit.putString(eVar.f1128a, str);
        edit.commit();
    }
}
