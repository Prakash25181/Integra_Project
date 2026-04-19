package b.b.a.a.f.l0;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;
import com.onkyo.jp.onkyoremote.view.discovery.DeviceNotFoundActivity;
import java.util.List;

/* compiled from: DeviceSelectFragment.java */
/* loaded from: classes.dex */
public class l extends k {

    /* renamed from: b, reason: collision with root package name */
    public ListView f1388b;

    /* renamed from: c, reason: collision with root package name */
    public Button f1389c;
    public Button d;
    public View e;
    public e f;

    /* compiled from: DeviceSelectFragment.java */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            l lVar = l.this;
            ((ConnectionActivity) lVar.getActivity()).a((b.b.a.a.b.p.g) lVar.f.getItem(i), false);
        }
    }

    /* compiled from: DeviceSelectFragment.java */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            l lVar = l.this;
            ((ConnectionActivity) lVar.getActivity()).a((b.b.a.a.b.p.g) lVar.f.getItem(i), false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: DeviceSelectFragment.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.a(l.this, new b.b.a.a.b.n.b());
        }
    }

    /* compiled from: DeviceSelectFragment.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.startActivity(new Intent(l.this.getActivity(), (Class<?>) DeviceNotFoundActivity.class));
        }
    }

    /* compiled from: DeviceSelectFragment.java */
    /* loaded from: classes.dex */
    public class e extends BaseAdapter {
        public e() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            b.b.a.a.b.p.i iVar = ((ConnectionActivity) l.this.getActivity()).u;
            if (iVar == null) {
                return 0;
            }
            return iVar.f.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            b.b.a.a.b.p.i iVar = ((ConnectionActivity) l.this.getActivity()).u;
            if (iVar == null) {
                return null;
            }
            return iVar.f.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ((LayoutInflater) l.this.getActivity().getSystemService("layout_inflater")).inflate(R.layout.layout_discovered_device, (ViewGroup) null);
            }
            b.b.a.a.b.p.g gVar = (b.b.a.a.b.p.g) getItem(i);
            if (gVar != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.device_icon);
                TextView textView = (TextView) view.findViewById(R.id.device_name);
                TextView textView2 = (TextView) view.findViewById(R.id.ip_address);
                Bitmap bitmap = gVar.k;
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageDrawable(null);
                }
                textView.setText(gVar.h);
                textView2.setText(gVar.a());
            }
            return view;
        }
    }

    public static /* synthetic */ void a(l lVar, b.b.a.a.b.p.g gVar) {
        ((ConnectionActivity) lVar.getActivity()).a(gVar, false);
    }

    @Override // b.b.a.a.f.l0.k
    public void b(b.b.a.a.b.p.i iVar, List<Integer> list) {
        Log.i("App", "Lost Device");
        this.f.notifyDataSetChanged();
    }

    @Override // b.b.a.a.f.l0.k
    public void c(b.b.a.a.b.p.i iVar, List<Integer> list) {
        Log.i("App", "Update Device");
        this.f.notifyDataSetChanged();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_device_select, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        e eVar = new e();
        this.f = eVar;
        this.f1388b.setAdapter((ListAdapter) eVar);
        if (((ConnectionActivity) getActivity()).A) {
            this.e.setVisibility(0);
            this.f1388b.setEnabled(false);
            this.f1389c.setEnabled(false);
            this.d.setEnabled(false);
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ListView listView = (ListView) view.findViewById(R.id.deviceList);
        this.f1388b = listView;
        listView.setOnItemClickListener(new a());
        this.f1388b.setOnItemSelectedListener(new b());
        Button button = (Button) view.findViewById(R.id.demo_mode_button);
        this.f1389c = button;
        button.setOnClickListener(new c());
        Button button2 = (Button) view.findViewById(R.id.when_not_found_button);
        this.d = button2;
        button2.setOnClickListener(new d());
        this.e = view.findViewById(R.id.connectingProgress);
    }

    @Override // b.b.a.a.f.l0.k
    public void a(b.b.a.a.b.p.i iVar, List<Integer> list) {
        Log.i("App", "Discover Device");
        this.f.notifyDataSetChanged();
    }

    @Override // b.b.a.a.f.l0.k
    public void a() {
        this.e.setVisibility(0);
        this.f1388b.setEnabled(false);
        this.f1389c.setEnabled(false);
        this.d.setEnabled(false);
    }

    @Override // b.b.a.a.f.l0.k
    public void a(boolean z) {
        this.e.setVisibility(8);
        if (z) {
            return;
        }
        this.f1388b.setEnabled(true);
        this.f1389c.setEnabled(true);
        this.d.setEnabled(true);
    }
}
