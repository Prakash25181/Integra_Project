package b.b.a.a.e;

import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: XmlParser.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public b f1144a;

    /* renamed from: b, reason: collision with root package name */
    public a f1145b;

    /* renamed from: c, reason: collision with root package name */
    public String f1146c;

    /* compiled from: XmlParser.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar);

        void a(b bVar, String str);

        void a(b bVar, String str, HashMap<String, String> hashMap);
    }

    public boolean a(String str, a aVar, String str2) {
        boolean z;
        this.f1145b = aVar;
        this.f1144a = new b(this);
        this.f1146c = str2;
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setInput(new StringReader(str));
            z = a(newPullParser);
        } catch (XmlPullParserException unused) {
            z = false;
        }
        this.f1145b = null;
        this.f1144a = null;
        return z;
    }

    /* compiled from: XmlParser.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public String f1147a = "";

        /* renamed from: b, reason: collision with root package name */
        public Stack<Integer> f1148b = new Stack<>();

        public b(f fVar) {
        }

        public void a(String str) {
            String str2 = this.f1147a + "/" + str;
            this.f1147a = str2;
            this.f1148b.push(Integer.valueOf(str2.length()));
        }

        public void a() {
            if (this.f1148b.empty()) {
                return;
            }
            this.f1148b.pop();
            if (!this.f1148b.empty()) {
                this.f1147a = this.f1147a.substring(0, this.f1148b.peek().intValue());
            } else {
                this.f1147a = "";
            }
        }
    }

    public final boolean a(XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            HashMap<String, String> hashMap = new HashMap<>();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (!this.f1144a.f1148b.empty() || this.f1146c.equals("") || !this.f1146c.equals(name)) {
                        this.f1144a.a(name);
                        hashMap.clear();
                        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                            hashMap.put(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                        }
                        if (this.f1145b != null) {
                            this.f1145b.a(this.f1144a, name, hashMap);
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && this.f1145b != null) {
                        this.f1145b.a(this.f1144a, xmlPullParser.getText());
                    }
                } else {
                    if (this.f1145b != null) {
                        this.f1145b.a(this.f1144a);
                    }
                    if (!this.f1144a.f1148b.empty()) {
                        this.f1144a.a();
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
