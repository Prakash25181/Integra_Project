package b.b.a.a.b;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KnownDeviceList.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static g f736c;

    /* renamed from: a, reason: collision with root package name */
    public AssetManager f737a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, String> f738b = new HashMap();

    /* compiled from: KnownDeviceList.java */
    /* loaded from: classes.dex */
    public enum a {
        DTR_4p9(2008, "DTR-4.9"),
        DTR_5p9(2008, "DTR-5.9"),
        DTX_5p9(2008, "DTX-5.9"),
        DTR_6p9(2008, "DTR-6.9"),
        DTR_7p9(2008, "DTR-7.9"),
        DHC_9p9(2008, "DHC-9.9"),
        DTR_8p9(2008, "DTR-8.9"),
        DTR_9p9(2008, "DTR-9.9"),
        DTX_8p9(2008, "DTX-8.9"),
        DTX_9p9(2008, "DTX-9.9"),
        PR_SC886(2008, "PR-SC886"),
        TX_NR906(2008, "TX-NR906"),
        TX_NA906(2008, "TX-NA906"),
        TX_NA906X(2008, "TX-NA906X"),
        DHC_40p1(2009, "DHC-40.1"),
        DHC_80p1(2009, "DHC-80.1"),
        DTR_20p1(2009, "DTR-20.1"),
        DTR_30p1(2009, "DTR-30.1"),
        DTR_40p1(2009, "DTR-40.1"),
        DTR_50p1(2009, "DTR-50.1"),
        DTR_70p1(2009, "DTR-70.1"),
        DTR_80p1(2009, "DTR-80.1"),
        HT_RC180(2009, "HT-RC180"),
        PR_SC887(2009, "PR-SC887"),
        PR_SC5507(2009, "PR-SC5507"),
        TX_NA807(2009, "TX-NA807"),
        TX_NA1007(2009, "TX-NA1007"),
        TX_NA5007(2009, "TX-NA5007"),
        TX_NR807(2009, "TX-NR807"),
        TX_NR1007(2009, "TX-NR1007"),
        TX_NR3007(2009, "TX-NR3007"),
        TX_NR5007(2009, "TX-NR5007"),
        DHC_40p2(2010, "DHC-40.2"),
        DHC_80p(2010, "DHC-80.2"),
        DTR_30p2(2010, "DTR-30.2"),
        DTR_40p2(2010, "DTR-40.2"),
        DTR_50p2(2010, "DTR-50.2"),
        DTR_70p2(2010, "DTR-70.2"),
        DTR_80p2(2010, "DTR-80.2"),
        TX_SR708(2010, "TX-SR708"),
        TX_SA708(2010, "TX-SA708"),
        TX_NR808(2010, "TX-NR808"),
        TX_NR1008(2010, "TX-NR1008"),
        TX_NR3008(2010, "TX-NR3008"),
        TX_NR5008(2010, "TX-NR5008"),
        TX_NA808(2010, "TX-NA808"),
        TX_NA1008(2010, "TX-NA1008"),
        TX_NA5008(2010, "TX-NA5008"),
        HT_RC270(2010, "HT-RC270"),
        PR_SC5508(2010, "PR-SC5508"),
        TX_8050(2011, "TX-8050"),
        DTM_40p4(2011, "DTM-40.4"),
        DTR_20p3(2011, "DTR-20.3"),
        DTR_30p3(2011, "DTR-30.3"),
        TX_NR509(2011, "TX-NR509"),
        TX_NR579(2011, "TX-NR579"),
        TX_NR609(2011, "TX-NR609"),
        TX_NA579(2011, "TX-NA579"),
        TX_NA609(2011, "TX-NA609"),
        HT_R648(2011, "HT-R648"),
        HT_R690(2011, "HT-R690"),
        HT_R990(2011, "HT-R990"),
        HT_RC360(2011, "HT-RC360"),
        DHC_80p3(2011, "DHC-80.3"),
        DTR_40p3(2011, "DTR-40.3"),
        DTR_50p3(2011, "DTR-50.3"),
        DTR_70p3(2011, "DTR-70.3"),
        DTR_80p3(2011, "DTR-80.3"),
        TX_NR709(2011, "TX-NR709"),
        TX_NR809(2011, "TX-NR809"),
        TX_NR1009(2011, "TX-NR1009"),
        TX_NR3009(2011, "TX-NR3009"),
        TX_NR5009(2011, "TX-NR5009"),
        TX_NA709(2011, "TX-NA709"),
        TX_NA809(2011, "TX-NA809"),
        TX_NA1009(2011, "TX-NA1009"),
        TX_NA5009(2011, "TX-NA5009"),
        HT_RC370(2011, "HT-RC370"),
        PR_SC5509(2011, "PR-SC5509"),
        T_4070(2011, "T-4070"),
        DTR_20p4(2012, "DTR-20.4"),
        DTR_30p4(2012, "DTR-30.4"),
        DTR_40p4(2012, "DTR-40.4"),
        DTR_50p4(2012, "DTR-50.4"),
        DTR_70p4(2012, "DTR-70.4"),
        HT_RC460(2012, "HT-RC460"),
        HT_RC470(2012, "HT-RC470"),
        HT_R758(2012, "HT-R758"),
        HT_R791(2012, "HT-R791"),
        TX_NR414(2012, "TX-NR414"),
        TX_NR515(2012, "TX-NR515"),
        TX_NR515AE(2012, "TX-NR515AE"),
        TX_NR616(2012, "TX-NR616"),
        TX_NR616AE(2012, "TX-NR616AE"),
        TX_NR717(2012, "TX-NR717"),
        TX_NR818(2012, "TX-NR818"),
        TX_NR1010(2012, "TX-NR1010"),
        TX_NR3010(2012, "TX-NR3010"),
        TX_NR5010(2012, "TX-NR5010"),
        NR_365(2012, "NR-365"),
        CR_N755(2012, "CR-N755"),
        AG_D500(2012, "AG-D500"),
        PA_R100(2012, "PA-R100"),
        PA_R200(2012, "PA-R200");

        public static final Map<String, a> d1 = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final int f739b;

        /* renamed from: c, reason: collision with root package name */
        public final String f740c;

        static {
            for (a aVar : values()) {
                d1.put(aVar.f740c, aVar);
            }
        }

        a(int i, String str) {
            this.f739b = i;
            this.f740c = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder a2 = b.a.a.a.a.a("");
            a2.append(this.f739b);
            a2.append("_");
            a2.append(this.f740c);
            return a2.toString();
        }
    }

    public boolean a(String str) {
        a aVar = a.d1.get(str);
        int i = aVar != null ? aVar.f739b : 0;
        return i == 2008 || i == 2009;
    }

    public final String b(String str) {
        BufferedReader bufferedReader;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(this.f737a.open(str)));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb.append(readLine);
                                sb.append("\n");
                            } else {
                                bufferedReader.close();
                                return sb.toString();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        }
        return null;
    }

    public static g a() {
        if (f736c == null) {
            f736c = new g();
        }
        return f736c;
    }

    public final String a(String str, String str2) {
        String format;
        if (str == null || str.length() <= 0) {
            return null;
        }
        if (!str2.equals("")) {
            format = String.format("%s_%s.xml", str, str2);
        } else {
            format = String.format("%s.xml", str);
        }
        String str3 = this.f738b.get(format);
        if (str3 != null) {
            return str3;
        }
        if (str2.equals("XX")) {
            return a(str, "MX");
        }
        return null;
    }
}
