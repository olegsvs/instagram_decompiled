package X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.2tx */
public final class AnonymousClass2tx {
    /* renamed from: B */
    public static boolean m17640B(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && str.equals(xmlPullParser.getName());
    }

    /* renamed from: C */
    public static boolean m17641C(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && str.equals(xmlPullParser.getName());
    }
}
