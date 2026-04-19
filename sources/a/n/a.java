package a.n;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: VersionedParcel.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final a.d.a<String, Method> f615a;

    /* renamed from: b, reason: collision with root package name */
    public final a.d.a<String, Method> f616b;

    /* renamed from: c, reason: collision with root package name */
    public final a.d.a<String, Class> f617c;

    public a(a.d.a<String, Method> aVar, a.d.a<String, Method> aVar2, a.d.a<String, Class> aVar3) {
        this.f615a = aVar;
        this.f616b = aVar2;
        this.f617c = aVar3;
    }

    public abstract void a();

    public abstract boolean a(int i);

    public boolean a(boolean z, int i) {
        return !a(i) ? z : ((b) this).e.readInt() != 0;
    }

    public abstract a b();

    public abstract void b(int i);

    public void b(int i, int i2) {
        b(i2);
        ((b) this).e.writeInt(i);
    }

    public <T extends c> T c() {
        String readString = ((b) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (T) a(readString).invoke(null, b());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public int a(int i, int i2) {
        return !a(i2) ? i : ((b) this).e.readInt();
    }

    public void b(Parcelable parcelable, int i) {
        b(i);
        ((b) this).e.writeParcelable(parcelable, 0);
    }

    public <T extends Parcelable> T a(T t, int i) {
        return !a(i) ? t : (T) ((b) this).e.readParcelable(b.class.getClassLoader());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method b(Class cls) {
        Method orDefault = this.f616b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class a2 = a((Class<? extends c>) cls);
        System.currentTimeMillis();
        Method declaredMethod = a2.getDeclaredMethod("write", cls, a.class);
        this.f616b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public CharSequence a(CharSequence charSequence, int i) {
        return !a(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) this).e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(c cVar) {
        if (cVar == null) {
            ((b) this).e.writeString(null);
            return;
        }
        try {
            ((b) this).e.writeString(a((Class<? extends c>) cVar.getClass()).getName());
            a b2 = b();
            try {
                b(cVar.getClass()).invoke(null, cVar, b2);
                b2.a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    public final Method a(String str) {
        Method orDefault = this.f615a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f615a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Class a(Class<? extends c> cls) {
        Class orDefault = this.f617c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f617c.put(cls.getName(), cls2);
        return cls2;
    }
}
