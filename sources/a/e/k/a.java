package a.e.k;

import a.e.k.x.b;
import a.e.k.x.d;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f423c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f424a = f423c;

    /* renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f425b = new C0017a(this);

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: a.e.k.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0017a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final a f426a;

        public C0017a(a aVar) {
            this.f426a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f426a.f424a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider;
            a aVar = this.f426a;
            if (aVar != null) {
                a.e.k.x.c cVar = (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = aVar.f424a.getAccessibilityNodeProvider(view)) == null) ? null : new a.e.k.x.c(accessibilityNodeProvider);
                if (cVar != null) {
                    return (AccessibilityNodeProvider) cVar.f466a;
                }
                return null;
            }
            throw null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f426a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            a.e.k.x.b bVar = new a.e.k.x.b(accessibilityNodeInfo);
            boolean j = n.j(view);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f460a.setScreenReaderFocusable(j);
            } else {
                bVar.a(1, j);
            }
            Boolean b2 = new q(a.e.b.tag_accessibility_heading, Boolean.class, 28).b(view);
            boolean booleanValue = b2 == null ? false : b2.booleanValue();
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f460a.setHeading(booleanValue);
            } else {
                bVar.a(2, booleanValue);
            }
            CharSequence b3 = new p(a.e.b.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                bVar.f460a.setPaneTitle(b3);
            } else if (i2 >= 19) {
                bVar.f460a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", b3);
            }
            this.f426a.a(view, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 19 && i3 < 26) {
                if (i3 >= 19) {
                    bVar.f460a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                    bVar.f460a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                    bVar.f460a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                    bVar.f460a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                }
                SparseArray sparseArray = (SparseArray) view.getTag(a.e.b.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                    }
                }
                ClickableSpan[] a2 = a.e.k.x.b.a(text);
                if (a2 != null && a2.length > 0) {
                    bVar.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.e.b.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(a.e.b.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(a.e.b.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i6 = 0; i6 < a2.length; i6++) {
                        ClickableSpan clickableSpan = a2[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                    i = sparseArray2.keyAt(i7);
                                    break;
                                }
                                i7++;
                            } else {
                                i = a.e.k.x.b.d;
                                a.e.k.x.b.d = i + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(a2[i6]));
                        ClickableSpan clickableSpan2 = a2[i6];
                        Spanned spanned = (Spanned) text;
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view.getTag(a.e.b.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                b.a aVar = (b.a) list.get(i8);
                if (Build.VERSION.SDK_INT >= 21) {
                    bVar.f460a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f463a);
                }
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f426a.f424a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f426a.f424a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f426a.a(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f426a.f424a.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f426a.f424a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f424a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, a.e.k.x.b bVar) {
        this.f424a.onInitializeAccessibilityNodeInfo(view, bVar.f460a);
    }

    public boolean a(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        Exception e;
        List list = (List) view.getTag(a.e.b.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            b.a aVar = (b.a) list.get(i2);
            d.a aVar2 = null;
            if (aVar != null) {
                if ((Build.VERSION.SDK_INT >= 21 ? ((AccessibilityNodeInfo.AccessibilityAction) aVar.f463a).getId() : 0) != i) {
                    i2++;
                } else if (aVar.f465c != null) {
                    Class<? extends d.a> cls = aVar.f464b;
                    if (cls != null) {
                        try {
                            d.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            if (newInstance == null) {
                                try {
                                    throw null;
                                } catch (Exception e2) {
                                    e = e2;
                                    aVar2 = newInstance;
                                    Class<? extends d.a> cls2 = aVar.f464b;
                                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                                    z = aVar.f465c.a(view, aVar2);
                                    if (!z) {
                                        z = this.f424a.performAccessibilityAction(view, i, bundle);
                                    }
                                    return z ? z : z;
                                }
                            }
                            aVar2 = newInstance;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    z = aVar.f465c.a(view, aVar2);
                }
            } else {
                throw null;
            }
        }
        z = false;
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f424a.performAccessibilityAction(view, i, bundle);
        }
        if (z && i == a.e.b.accessibility_action_clickable_span) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(a.e.b.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    ClickableSpan[] a2 = a.e.k.x.b.a(view.createAccessibilityNodeInfo().getText());
                    for (int i4 = 0; a2 != null && i4 < a2.length; i4++) {
                        if (clickableSpan.equals(a2[i4])) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    clickableSpan.onClick(view);
                    z3 = true;
                }
            }
            return z3;
        }
    }
}
