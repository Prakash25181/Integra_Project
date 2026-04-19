package b.b.a.a.b.p.v;

import java.util.HashMap;
import java.util.Map;

/* compiled from: IscpCommand.java */
/* loaded from: classes.dex */
public enum a {
    ECN("ECN"),
    NTC("NTC"),
    NTZ("NTZ"),
    NT3("NT3"),
    NT4("NT4"),
    NAT("NAT"),
    NAL("NAL"),
    NTI("NTI"),
    NTM("NTM"),
    NTR("NTR"),
    NST("NST"),
    NMS("NMS"),
    NTS("NTS"),
    NPR("NPR"),
    NJA("NJA"),
    NLT("NLT"),
    NLS("NLS"),
    NLA("NLA"),
    NSV("NSV"),
    NKY("NKY"),
    NPU("NPU"),
    NCP("NCP"),
    POP("POP"),
    NRI("NRI"),
    NDS("NDS"),
    NMD("NMD"),
    NSB("NSB"),
    CEC("CEC"),
    CCM("CCM"),
    CDV("CDV"),
    CD2("CD2"),
    CTV("CTV"),
    CT2("CT2"),
    PMB("PMB"),
    DIR("DIR"),
    MOT("MOT"),
    LMD("LMD"),
    IFA("IFA"),
    IFV("IFV"),
    sNT("sNT"),
    sPS("sPS"),
    sMN("sMN"),
    sTN("sTN"),
    DST("DST"),
    CFS("CFS"),
    CTS("CTS"),
    CST("CST"),
    CTM("CTM"),
    PWR("PWR"),
    ZPW("ZPW"),
    PW3("PW3"),
    PW4("PW4"),
    AMT("AMT"),
    ZMT("ZMT"),
    MT3("MT3"),
    MT4("MT4"),
    MVL("MVL"),
    ZVL("ZVL"),
    VL3("VL3"),
    VL4("VL4"),
    SLI("SLI"),
    SLZ("SLZ"),
    SL3("SL3"),
    SL4("SL4"),
    TFR("TFR"),
    TFW("TFW"),
    TFH("TFH"),
    TCT("TCT"),
    TSR("TSR"),
    TSB("TSB"),
    TSW("TSW"),
    CTL("CTL"),
    SWL("SWL"),
    SW2("SW2"),
    ZTN("ZTN"),
    TN3("TN3"),
    ZBL("ZBL"),
    BL3("BL3"),
    TUN("TUN"),
    TUZ("TUZ"),
    TU3("TU3"),
    TU4("TU4"),
    PRS("PRS"),
    PRZ("PRZ"),
    PR3("PR3"),
    PR4("PR4"),
    PRM("PRM"),
    DSN("DSN"),
    CCD("CCD"),
    SCE("SCE"),
    OSD("OSD"),
    DIM("DIM"),
    DIF("DIF"),
    CAP("CAP"),
    nul("***");

    public static final Map<String, a> T0 = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final String f910b;

    static {
        for (a aVar : values()) {
            T0.put(aVar.f910b, aVar);
        }
    }

    a(String str) {
        this.f910b = str;
    }

    public static a a(String str) {
        if (str.length() != 3) {
            return nul;
        }
        a aVar = T0.get(str);
        return aVar == null ? nul : aVar;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f910b;
    }
}
