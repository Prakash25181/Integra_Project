package b.b.a.a.b.q;

import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NcpParser.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public a f941a;

    /* renamed from: b, reason: collision with root package name */
    public m f942b;

    /* renamed from: c, reason: collision with root package name */
    public e f943c;
    public int d;

    /* compiled from: NcpParser.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public static /* synthetic */ int a(l lVar) {
        int i = lVar.d;
        lVar.d = i + 1;
        return i;
    }

    public static m a(b.b.a.a.b.p.v.d dVar) {
        m mVar;
        XmlPullParser newPullParser;
        l lVar = new l();
        String str = dVar.f915a;
        lVar.f942b = null;
        if (str.charAt(0) != 'X') {
            return null;
        }
        int i = 1;
        while (i < 6 && str.charAt(i) != '<') {
            i++;
        }
        if (i >= 6) {
            return null;
        }
        lVar.f941a = new k(lVar);
        try {
            newPullParser = Xml.newPullParser();
            newPullParser.setInput(new StringReader(str.substring(i)));
        } catch (XmlPullParserException unused) {
        }
        if (lVar.a(newPullParser)) {
            mVar = lVar.f942b;
            lVar.f941a = null;
            return mVar;
        }
        mVar = null;
        lVar.f941a = null;
        return mVar;
    }

    public final boolean a(XmlPullParser xmlPullParser) {
        e eVar;
        try {
            int eventType = xmlPullParser.getEventType();
            HashMap<String, String> hashMap = new HashMap<>();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && this.f941a != null) {
                        l lVar = ((k) this.f941a).f940a;
                        int i = lVar.d;
                        if (i > 0) {
                            lVar.d = i - 1;
                        } else {
                            e eVar2 = lVar.f943c;
                            if (eVar2 != null && (eVar = eVar2.f931a) != null) {
                                lVar.f943c = eVar;
                            }
                        }
                    }
                } else {
                    String name = xmlPullParser.getName();
                    for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                        hashMap.put(xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                    }
                    if (this.f941a != null) {
                        ((k) this.f941a).a(name, hashMap);
                    }
                }
                eventType = xmlPullParser.next();
            }
            return true;
        } catch (IOException | XmlPullParserException unused) {
            return false;
        }
    }
}
