package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class AppCompatViewInflater {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f643b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f644c = {R.attr.onClick};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    public static final Map<String, Constructor<? extends View>> e = new a.d.a();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f645a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final View f646b;

        /* renamed from: c, reason: collision with root package name */
        public final String f647c;
        public Method d;
        public Context e;

        public a(View view, String str) {
            this.f646b = view;
            this.f647c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String sb;
            Method method;
            if (this.d == null) {
                Context context = this.f646b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f647c, View.class)) != null) {
                            this.d = method;
                            this.e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f646b.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder a2 = b.a.a.a.a.a(" with id '");
                    a2.append(this.f646b.getContext().getResources().getResourceEntryName(id));
                    a2.append("'");
                    sb = a2.toString();
                }
                StringBuilder a3 = b.a.a.a.a.a("Could not find method ");
                a3.append(this.f647c);
                a3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a3.append(this.f646b.getClass());
                a3.append(sb);
                throw new IllegalStateException(a3.toString());
            }
            try {
                this.d.invoke(this.e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public final void a(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public final View a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f643b);
            e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f645a);
    }
}
