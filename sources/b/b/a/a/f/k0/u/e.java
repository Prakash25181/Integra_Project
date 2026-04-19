package b.b.a.a.f.k0.u;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import b.b.a.a.b.r.i;
import b.b.a.a.b.r.l;
import b.b.a.a.b.r.x;
import b.b.a.a.f.d0;
import b.b.a.a.f.g0;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: NetUsbListPage.java */
/* loaded from: classes.dex */
public class e extends n implements l.c, i.a {
    public ListView e;
    public View f;
    public StepSlideBar g;
    public View h;
    public EditText i;
    public Button j;
    public TextView k;
    public b.b.a.a.b.r.l l;
    public b.b.a.a.b.r.i m;
    public i n;
    public g0 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public d0 t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemLongClickListener v;
    public AbsListView.OnScrollListener w;
    public View.OnTouchListener x;

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            e eVar = e.this;
            eVar.n.a(eVar.i.getText().toString());
            e eVar2 = e.this;
            eVar2.j.setVisibility(eVar2.n.d != null ? 0 : 8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class b implements TextView.OnEditorActionListener {
        public b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            e.this.f();
            return true;
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.i.setText("");
            e.this.n.a((String) null);
            e.this.f();
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class d implements i0 {
        public d() {
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            e eVar = e.this;
            eVar.e.setSelectionFromTop(1, (int) eVar.f1597b.getResources().getDisplayMetrics().density);
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* renamed from: b.b.a.a.f.k0.u.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0047e implements AdapterView.OnItemClickListener {

        /* compiled from: NetUsbListPage.java */
        /* renamed from: b.b.a.a.f.k0.u.e$e$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.o.a(0);
                if (eVar.p) {
                    eVar.f.setVisibility(0);
                }
            }
        }

        public C0047e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - e.this.e.getHeaderViewsCount();
            if (headerViewsCount < 0) {
                return;
            }
            int a2 = e.this.n.a(headerViewsCount);
            b.b.a.a.b.r.h a3 = e.this.m.a(a2);
            if (a3 != null && a3.a()) {
                e eVar = e.this;
                if (!eVar.s) {
                    if (eVar.m.d == l.e.LIST && !(eVar.l.g() == b.b.a.a.b.o.e.FAVORITE && eVar.l.a().f969c == 1)) {
                        e eVar2 = e.this;
                        eVar2.p = true;
                        eVar2.d.setEnabled(false);
                        e.this.l.a(a2);
                        e.this.o.a(0, 3000, new a());
                    } else {
                        e.this.l.a(a2);
                    }
                }
            }
            e.this.s = false;
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class f implements AdapterView.OnItemLongClickListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - e.this.e.getHeaderViewsCount();
            if (headerViewsCount < 0) {
                return false;
            }
            b.b.a.a.b.r.h a2 = e.this.m.a(e.this.n.a(headerViewsCount));
            if (a2 != null) {
                d0 d0Var = e.this.t;
                String str = a2.f962a;
                d0.b bVar = d0.b.ContentIInfo;
                d0.a aVar = d0Var.f1177a;
                if (aVar != null) {
                    MainActivity.a(MainActivity.this, view, str, bVar);
                }
                e.this.s = true;
            }
            return false;
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            e.this.t.a();
            e.this.s = false;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                e eVar = e.this;
                eVar.r = false;
                EditText editText = eVar.i;
                if (editText != null && editText.hasFocus()) {
                    e.this.f();
                    e.this.r = true;
                    return true;
                }
            }
            if (action == 1 || action == 3) {
                e.this.t.a();
                if (action == 3) {
                    e.this.s = false;
                }
            }
            e eVar2 = e.this;
            if (eVar2.r) {
                if (action != 2 && action != 4) {
                    if (action == 1) {
                        eVar2.r = false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    public e(Context context, b.b.a.a.b.p.d dVar, s sVar) {
        super(context);
        this.u = new C0047e();
        this.v = new f();
        this.w = new g();
        this.x = new h();
        b.b.a.a.b.r.l lVar = dVar.q;
        this.l = lVar;
        this.m = lVar.a();
        this.o = new g0(new Handler(), 1);
        this.t = d0.f1176b;
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.l.f980a.a((l.d) this);
        this.m.f967a = this;
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(l.e eVar, l.a aVar) {
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(x xVar) {
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f1597b.getSystemService("layout_inflater");
        View a2 = a(R.layout.layout_netusb_list);
        View inflate = layoutInflater.inflate(R.layout.layout_netusb_directory_title, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title_label)).setText(this.m.f968b);
        if (this.m.a() > 20) {
            View inflate2 = layoutInflater.inflate(R.layout.layout_netusb_search_cell, (ViewGroup) null);
            this.h = inflate2;
            EditText editText = (EditText) inflate2.findViewById(R.id.search_edit_text);
            this.i = editText;
            editText.setEnabled(this.m.b());
            this.i.addTextChangedListener(new a());
            this.i.setOnEditorActionListener(new b());
            Button button = (Button) this.h.findViewById(R.id.cancel_button);
            this.j = button;
            button.setOnClickListener(new c());
        }
        this.n = new i(this, this.f1597b, this.m);
        ListView listView = (ListView) a2.findViewById(R.id.content_list);
        this.e = listView;
        listView.setFocusable(true);
        View view = this.h;
        if (view != null) {
            this.e.addHeaderView(view, null, false);
        }
        this.e.addHeaderView(inflate, null, false);
        this.e.setAdapter((ListAdapter) this.n);
        this.e.setOnItemClickListener(this.u);
        this.e.setOnItemLongClickListener(this.v);
        this.e.setOnScrollListener(this.w);
        this.e.setOnTouchListener(this.x);
        View findViewById = a2.findViewById(R.id.indicator_view);
        this.f = findViewById;
        findViewById.setVisibility(8);
        StepSlideBar stepSlideBar = (StepSlideBar) a2.findViewById(R.id.query_progress);
        this.g = stepSlideBar;
        stepSlideBar.a(0, 1000, 1.0f);
        this.k = (TextView) a2.findViewById(R.id.empty_label);
        i();
        if (this.h != null) {
            a.b.k.r.a(a2, (i0) new d());
        }
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.b.r.i.a
    public void b(b.b.a.a.b.r.i iVar) {
    }

    public final void g() {
        this.q = true;
        if (this.m.f969c == 0 && (this.l.g() == b.b.a.a.b.o.e.USB_FRONT || this.l.g() == b.b.a.a.b.o.e.USB_REAR)) {
            l.f o = this.l.o();
            if (o == l.f.MEMORY && this.m.b() && this.m.a() == 1 && this.m.a(0).f962a.equals("No Storage")) {
                o = l.f.NONE;
            }
            if (o != l.f.MEMORY && o != l.f.IPOD_STANDARD && o != l.f.IPOD_EXTENDED) {
                this.q = false;
            } else {
                this.q = true;
            }
        }
        if (this.q) {
            return;
        }
        h();
    }

    public final void h() {
        this.p = false;
        this.o.a(0);
        this.f.setVisibility(8);
        this.d.setEnabled(true);
    }

    public final void i() {
        if (this.m.b() && this.m.a() == 0) {
            b.b.a.a.b.o.e g2 = this.l.g();
            Resources resources = this.f1597b.getResources();
            this.k.setVisibility(0);
            if ((g2 == b.b.a.a.b.o.e.DLNA || g2 == b.b.a.a.b.o.e.HOME_MEDIA) && this.m.f969c == 0) {
                this.k.setText(resources.getString(R.string.noServer));
                return;
            } else {
                this.k.setText(resources.getString(R.string.noContent));
                return;
            }
        }
        this.k.setVisibility(8);
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(b.b.a.a.b.o.f fVar, b.b.a.a.b.o.f fVar2) {
        h();
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(l.f fVar) {
        g();
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(b.b.a.a.b.r.i iVar) {
        h();
    }

    @Override // b.b.a.a.b.r.i.a
    public void a(b.b.a.a.b.r.i iVar, int i2, int i3, float f2) {
        this.t.a();
        this.s = false;
        h();
        g();
        i();
        int headerViewsCount = this.e.getHeaderViewsCount() + i2;
        int min = Math.min(this.e.getLastVisiblePosition(), (headerViewsCount + i3) - 1);
        for (int max = Math.max(this.e.getFirstVisiblePosition(), headerViewsCount); max <= min; max++) {
            ListView listView = this.e;
            View childAt = listView.getChildAt(max - listView.getFirstVisiblePosition());
            if (childAt != null) {
                this.e.getAdapter().getView(max, childAt, this.e);
            }
        }
        if (f2 == 1.0f) {
            this.g.setVisibility(8);
            if (this.h != null) {
                this.i.setEnabled(true);
                return;
            }
            return;
        }
        if (this.m.a() > 100) {
            this.g.setVisibility(0);
            this.g.setValue((int) (r6.getMax() * f2));
        }
        if (this.h != null) {
            this.i.setEnabled(false);
        }
    }

    /* compiled from: NetUsbListPage.java */
    /* loaded from: classes.dex */
    public class i extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public LayoutInflater f1297b;

        /* renamed from: c, reason: collision with root package name */
        public b.b.a.a.b.r.i f1298c;
        public String d;
        public short[] e;
        public int f;

        public i(e eVar, Context context, b.b.a.a.b.r.i iVar) {
            this.f1298c = iVar;
            this.f1297b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(String str) {
            if (str != null && str.length() == 0) {
                str = null;
            }
            this.d = str;
            if (str == null) {
                this.e = null;
                this.f = 0;
            } else {
                int a2 = this.f1298c.a();
                String lowerCase = str.toLowerCase();
                if (this.e == null) {
                    this.e = new short[a2];
                }
                this.f = 0;
                for (int i = 0; i < a2; i++) {
                    b.b.a.a.b.r.h a3 = this.f1298c.a(i);
                    if (a3 != null && a3.f962a.toLowerCase().indexOf(lowerCase) != -1) {
                        short[] sArr = this.e;
                        int i2 = this.f;
                        this.f = i2 + 1;
                        sArr[i2] = (short) i;
                    }
                }
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.e != null ? this.f : this.f1298c.a();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r3v0 ??, r3v1 ??, r3v3 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // android.widget.Adapter
        public java.lang.Object getItem(
        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r3v0 ??, r3v1 ??, r3v3 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:80)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
            */

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r3v0 ??, r3v1 ??, r3v2 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // android.widget.Adapter
        public long getItemId(
        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r3v0 ??, r3v1 ??, r3v2 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:80)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
            */

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r7v0 ??, r7v1 ??, r7v5 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // android.widget.Adapter
        public android.view.View getView(
        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r7v0 ??, r7v1 ??, r7v5 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:80)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
            */

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r3v0 ??, r3v1 ??, r3v6 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(
        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r3v0 ??, r3v1 ??, r3v6 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:80)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
            */

        public int a(int i) {
            short[] sArr = this.e;
            return sArr == null ? i : sArr[i];
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        b.b.a.a.b.r.i iVar = this.m;
        if (iVar.f967a == this) {
            iVar.f967a = null;
        }
        this.l.f980a.b(this);
        this.o.a();
    }
}
