package androidx.activity;

import a.a.b;
import a.h.a.j;
import a.j.e;
import a.j.f;
import a.j.h;
import a.j.i;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f626a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f627b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements f, a.a.a {

        /* renamed from: a, reason: collision with root package name */
        public final e f628a;

        /* renamed from: b, reason: collision with root package name */
        public final b f629b;

        /* renamed from: c, reason: collision with root package name */
        public a.a.a f630c;

        public LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.f628a = eVar;
            this.f629b = bVar;
            eVar.a(this);
        }

        @Override // a.j.f
        public void a(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f629b;
                onBackPressedDispatcher.f627b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.f1b.add(aVar2);
                this.f630c = aVar2;
                return;
            }
            if (aVar == e.a.ON_STOP) {
                a.a.a aVar3 = this.f630c;
                if (aVar3 != null) {
                    aVar3.cancel();
                    return;
                }
                return;
            }
            if (aVar == e.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // a.a.a
        public void cancel() {
            ((i) this.f628a).f568a.remove(this);
            this.f629b.f1b.remove(this);
            a.a.a aVar = this.f630c;
            if (aVar != null) {
                aVar.cancel();
                this.f630c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements a.a.a {

        /* renamed from: a, reason: collision with root package name */
        public final b f631a;

        public a(b bVar) {
            this.f631a = bVar;
        }

        @Override // a.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.f627b.remove(this.f631a);
            this.f631a.f1b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f626a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f627b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.f0a) {
                j jVar = j.this;
                jVar.g();
                if (jVar.k.f0a) {
                    jVar.b();
                    return;
                } else {
                    jVar.j.a();
                    return;
                }
            }
        }
        Runnable runnable = this.f626a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
