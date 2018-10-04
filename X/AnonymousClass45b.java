package X;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.45b */
public final class AnonymousClass45b extends AnonymousClass44C {
    /* renamed from: C */
    private static final Pattern f49962C = Pattern.compile("^(\\d+) (\\d+)$");
    /* renamed from: D */
    private static final Pattern f49963D = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    /* renamed from: E */
    public static final AnonymousClass2xi f49964E = new AnonymousClass2xi(32, 15);
    /* renamed from: F */
    public static final AnonymousClass2xj f49965F = new AnonymousClass2xj(30.0f, 1, 1);
    /* renamed from: G */
    public static final Pattern f49966G = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    /* renamed from: H */
    private static final Pattern f49967H = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    /* renamed from: I */
    private static final Pattern f49968I = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    /* renamed from: B */
    public final XmlPullParserFactory f49969B;

    public AnonymousClass45b() {
        super("TtmlDecoder");
        try {
            this.f49969B = XmlPullParserFactory.newInstance();
            this.f49969B.setNamespaceAware(true);
        } catch (Throwable e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: D */
    public static X.AnonymousClass2xi m22935D(org.xmlpull.v1.XmlPullParser r5, X.AnonymousClass2xi r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = "http://www.w3.org/ns/ttml#parameter";
        r0 = "cellResolution";
        r5 = r5.getAttributeValue(r1, r0);
        if (r5 != 0) goto L_0x000b;
    L_0x000a:
        return r6;
    L_0x000b:
        r0 = f49962C;
        r1 = r0.matcher(r5);
        r0 = r1.matches();
        if (r0 != 0) goto L_0x002e;
    L_0x0017:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Ignoring malformed cell resolution: ";
        r1.append(r0);
        r1.append(r5);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        return r6;
    L_0x002e:
        r0 = 1;
        r0 = r1.group(r0);	 Catch:{ NumberFormatException -> 0x0069 }
        r4 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0069 }
        r0 = 2;	 Catch:{ NumberFormatException -> 0x0069 }
        r0 = r1.group(r0);	 Catch:{ NumberFormatException -> 0x0069 }
        r3 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0069 }
        if (r4 == 0) goto L_0x004a;	 Catch:{ NumberFormatException -> 0x0069 }
    L_0x0042:
        if (r3 == 0) goto L_0x004a;	 Catch:{ NumberFormatException -> 0x0069 }
    L_0x0044:
        r0 = new X.2xi;	 Catch:{ NumberFormatException -> 0x0069 }
        r0.<init>(r4, r3);	 Catch:{ NumberFormatException -> 0x0069 }
        return r0;	 Catch:{ NumberFormatException -> 0x0069 }
    L_0x004a:
        r2 = new X.2xQ;	 Catch:{ NumberFormatException -> 0x0069 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0069 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0069 }
        r0 = "Invalid cell resolution ";	 Catch:{ NumberFormatException -> 0x0069 }
        r1.append(r0);	 Catch:{ NumberFormatException -> 0x0069 }
        r1.append(r4);	 Catch:{ NumberFormatException -> 0x0069 }
        r0 = " ";	 Catch:{ NumberFormatException -> 0x0069 }
        r1.append(r0);	 Catch:{ NumberFormatException -> 0x0069 }
        r1.append(r3);	 Catch:{ NumberFormatException -> 0x0069 }
        r0 = r1.toString();	 Catch:{ NumberFormatException -> 0x0069 }
        r2.<init>(r0);	 Catch:{ NumberFormatException -> 0x0069 }
        throw r2;	 Catch:{ NumberFormatException -> 0x0069 }
    L_0x0069:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Ignoring malformed cell resolution: ";
        r1.append(r0);
        r1.append(r5);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45b.D(org.xmlpull.v1.XmlPullParser, X.2xi):X.2xi");
    }

    /* renamed from: E */
    public static X.AnonymousClass2xl m22936E(org.xmlpull.v1.XmlPullParser r14, X.AnonymousClass2xi r15) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "id";
        r7 = X.AnonymousClass2yj.m18111B(r14, r0);
        r6 = 0;
        if (r7 != 0) goto L_0x000a;
    L_0x0009:
        return r6;
    L_0x000a:
        r0 = "origin";
        r3 = X.AnonymousClass2yj.m18111B(r14, r0);
        if (r3 == 0) goto L_0x0109;
    L_0x0012:
        r0 = f49968I;
        r1 = r0.matcher(r3);
        r0 = r1.matches();
        if (r0 == 0) goto L_0x00f2;
    L_0x001e:
        r4 = 1;
        r0 = r1.group(r4);	 Catch:{ NumberFormatException -> 0x00db }
        r8 = java.lang.Float.parseFloat(r0);	 Catch:{ NumberFormatException -> 0x00db }
        r5 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;	 Catch:{ NumberFormatException -> 0x00db }
        r8 = r8 / r5;	 Catch:{ NumberFormatException -> 0x00db }
        r2 = 2;	 Catch:{ NumberFormatException -> 0x00db }
        r0 = r1.group(r2);	 Catch:{ NumberFormatException -> 0x00db }
        r9 = java.lang.Float.parseFloat(r0);	 Catch:{ NumberFormatException -> 0x00db }
        r9 = r9 / r5;
        r0 = "extent";
        r1 = X.AnonymousClass2yj.m18111B(r14, r0);
        if (r1 == 0) goto L_0x00d3;
    L_0x003c:
        r0 = f49968I;
        r1 = r0.matcher(r1);
        r0 = r1.matches();
        if (r0 == 0) goto L_0x00bc;
    L_0x0048:
        r0 = r1.group(r4);	 Catch:{ NumberFormatException -> 0x00a5 }
        r12 = java.lang.Float.parseFloat(r0);	 Catch:{ NumberFormatException -> 0x00a5 }
        r12 = r12 / r5;	 Catch:{ NumberFormatException -> 0x00a5 }
        r0 = r1.group(r2);	 Catch:{ NumberFormatException -> 0x00a5 }
        r4 = java.lang.Float.parseFloat(r0);	 Catch:{ NumberFormatException -> 0x00a5 }
        r4 = r4 / r5;
        r0 = "displayAlign";
        r0 = X.AnonymousClass2yj.m18111B(r14, r0);
        if (r0 == 0) goto L_0x0096;
    L_0x0062:
        r3 = X.AnonymousClass2yi.m18110e(r0);
        r2 = -1;
        r1 = r3.hashCode();
        r0 = -1364013995; // 0xffffffffaeb2cc55 float:-8.1307995E-11 double:NaN;
        if (r1 == r0) goto L_0x0080;
    L_0x0070:
        r0 = 92734940; // 0x58705dc float:1.2697491E-35 double:4.5817148E-316;
        if (r1 == r0) goto L_0x0076;
    L_0x0075:
        goto L_0x0089;
    L_0x0076:
        r0 = "after";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0089;
    L_0x007e:
        r2 = 1;
        goto L_0x0089;
    L_0x0080:
        r0 = "center";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0089;
    L_0x0088:
        r2 = 0;
    L_0x0089:
        switch(r2) {
            case 0: goto L_0x0090;
            case 1: goto L_0x008d;
            default: goto L_0x008c;
        };
    L_0x008c:
        goto L_0x0096;
    L_0x008d:
        r9 = r9 + r4;
        r11 = 2;
        goto L_0x0097;
    L_0x0090:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 / r0;
        r9 = r9 + r4;
        r11 = 1;
        goto L_0x0097;
    L_0x0096:
        r11 = 0;
    L_0x0097:
        r14 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r15.f36343B;
        r0 = (float) r0;
        r14 = r14 / r0;
        r6 = new X.2xl;
        r13 = 1;
        r10 = 0;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14);
        return r6;
    L_0x00a5:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Ignoring region with malformed extent: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        return r6;
    L_0x00bc:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Ignoring region with unsupported extent: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        return r6;
    L_0x00d3:
        r1 = "TtmlDecoder";
        r0 = "Ignoring region without an extent";
        android.util.Log.w(r1, r0);
        return r6;
    L_0x00db:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Ignoring region with malformed origin: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        return r6;
    L_0x00f2:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Ignoring region with unsupported origin: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        return r6;
    L_0x0109:
        r1 = "TtmlDecoder";
        r0 = "Ignoring region without an origin";
        android.util.Log.w(r1, r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45b.E(org.xmlpull.v1.XmlPullParser, X.2xi):X.2xl");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    public static X.AnonymousClass2xn m22937F(X.AnonymousClass45b r9, org.xmlpull.v1.XmlPullParser r10, X.AnonymousClass2xn r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = r10.getAttributeCount();
        r5 = 0;
        r4 = 0;
    L_0x0006:
        if (r4 >= r6) goto L_0x02a3;
    L_0x0008:
        r3 = r10.getAttributeValue(r4);
        r2 = r10.getAttributeName(r4);
        r0 = r2.hashCode();
        r8 = 4;
        r7 = 2;
        r1 = 1;
        switch(r0) {
            case -1550943582: goto L_0x006c;
            case -1224696685: goto L_0x0062;
            case -1065511464: goto L_0x0058;
            case -879295043: goto L_0x004d;
            case -734428249: goto L_0x0043;
            case 3355: goto L_0x0039;
            case 94842723: goto L_0x002f;
            case 365601008: goto L_0x0025;
            case 1287124693: goto L_0x001b;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x0076;
    L_0x001b:
        r0 = "backgroundColor";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x0023:
        r0 = 1;
        goto L_0x0077;
    L_0x0025:
        r0 = "fontSize";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x002d:
        r0 = 4;
        goto L_0x0077;
    L_0x002f:
        r0 = "color";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x0037:
        r0 = 2;
        goto L_0x0077;
    L_0x0039:
        r0 = "id";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x0041:
        r0 = 0;
        goto L_0x0077;
    L_0x0043:
        r0 = "fontWeight";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x004b:
        r0 = 5;
        goto L_0x0077;
    L_0x004d:
        r0 = "textDecoration";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x0055:
        r0 = 8;
        goto L_0x0077;
    L_0x0058:
        r0 = "textAlign";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x0060:
        r0 = 7;
        goto L_0x0077;
    L_0x0062:
        r0 = "fontFamily";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x006a:
        r0 = 3;
        goto L_0x0077;
    L_0x006c:
        r0 = "fontStyle";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0076;
    L_0x0074:
        r0 = 6;
        goto L_0x0077;
    L_0x0076:
        r0 = -1;
    L_0x0077:
        switch(r0) {
            case 0: goto L_0x028d;
            case 1: goto L_0x0267;
            case 2: goto L_0x0243;
            case 3: goto L_0x0232;
            case 4: goto L_0x017f;
            case 5: goto L_0x0167;
            case 6: goto L_0x014f;
            case 7: goto L_0x00ee;
            case 8: goto L_0x007c;
            default: goto L_0x007a;
        };
    L_0x007a:
        goto L_0x029f;
    L_0x007c:
        r3 = X.AnonymousClass2yi.m18110e(r3);
        r2 = r3.hashCode();
        r0 = -1461280213; // 0xffffffffa8e6a22b float:-2.5605459E-14 double:NaN;
        if (r2 == r0) goto L_0x00b6;
    L_0x0089:
        r0 = -1026963764; // 0xffffffffc2c9c6cc float:-100.888275 double:NaN;
        if (r2 == r0) goto L_0x00ad;
    L_0x008e:
        r0 = 913457136; // 0x36723ff0 float:3.6098027E-6 double:4.5130779E-315;
        if (r2 == r0) goto L_0x00a3;
    L_0x0093:
        r0 = 1679736913; // 0x641ec051 float:1.1713774E22 double:8.29900303E-315;
        if (r2 == r0) goto L_0x0099;
    L_0x0098:
        goto L_0x00c0;
    L_0x0099:
        r0 = "linethrough";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x00c0;
    L_0x00a1:
        r7 = 0;
        goto L_0x00c1;
    L_0x00a3:
        r0 = "nolinethrough";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x00c0;
    L_0x00ab:
        r7 = 1;
        goto L_0x00c1;
    L_0x00ad:
        r0 = "underline";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x00c0;
    L_0x00b5:
        goto L_0x00c1;
    L_0x00b6:
        r0 = "nounderline";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x00c0;
    L_0x00be:
        r7 = 3;
        goto L_0x00c1;
    L_0x00c0:
        r7 = -1;
    L_0x00c1:
        switch(r7) {
            case 0: goto L_0x00e4;
            case 1: goto L_0x00da;
            case 2: goto L_0x00d0;
            case 3: goto L_0x00c6;
            default: goto L_0x00c4;
        };
    L_0x00c4:
        goto L_0x029f;
    L_0x00c6:
        r0 = X.AnonymousClass45b.m22939H(r11);
        r11 = r0.m17964E(r5);
        goto L_0x029f;
    L_0x00d0:
        r0 = X.AnonymousClass45b.m22939H(r11);
        r11 = r0.m17964E(r1);
        goto L_0x029f;
    L_0x00da:
        r0 = X.AnonymousClass45b.m22939H(r11);
        r11 = r0.m17963D(r5);
        goto L_0x029f;
    L_0x00e4:
        r0 = X.AnonymousClass45b.m22939H(r11);
        r11 = r0.m17963D(r1);
        goto L_0x029f;
    L_0x00ee:
        r1 = X.AnonymousClass2yi.m18110e(r3);
        r0 = r1.hashCode();
        switch(r0) {
            case -1364013995: goto L_0x0122;
            case 100571: goto L_0x0118;
            case 3317767: goto L_0x010e;
            case 108511772: goto L_0x0104;
            case 109757538: goto L_0x00fa;
            default: goto L_0x00f9;
        };
    L_0x00f9:
        goto L_0x012b;
    L_0x00fa:
        r0 = "start";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x012b;
    L_0x0102:
        r8 = 1;
        goto L_0x012c;
    L_0x0104:
        r0 = "right";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x012b;
    L_0x010c:
        r8 = 2;
        goto L_0x012c;
    L_0x010e:
        r0 = "left";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x012b;
    L_0x0116:
        r8 = 0;
        goto L_0x012c;
    L_0x0118:
        r0 = "end";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x012b;
    L_0x0120:
        r8 = 3;
        goto L_0x012c;
    L_0x0122:
        r0 = "center";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x012b;
    L_0x012a:
        goto L_0x012c;
    L_0x012b:
        r8 = -1;
    L_0x012c:
        switch(r8) {
            case 0: goto L_0x0145;
            case 1: goto L_0x0145;
            case 2: goto L_0x013b;
            case 3: goto L_0x013b;
            case 4: goto L_0x0131;
            default: goto L_0x012f;
        };
    L_0x012f:
        goto L_0x029f;
    L_0x0131:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = android.text.Layout.Alignment.ALIGN_CENTER;
        r11.f36378N = r0;
        goto L_0x029f;
    L_0x013b:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r11.f36378N = r0;
        goto L_0x029f;
    L_0x0145:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r11.f36378N = r0;
        goto L_0x029f;
    L_0x014f:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = "italic";
        r1 = r0.equalsIgnoreCase(r3);
        r0 = r11.f36375K;
        if (r0 != 0) goto L_0x015f;
    L_0x015d:
        r0 = 1;
        goto L_0x0160;
    L_0x015f:
        r0 = 0;
    L_0x0160:
        X.AnonymousClass2yO.m18017F(r0);
        r11.f36376L = r1;
        goto L_0x029f;
    L_0x0167:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = "bold";
        r1 = r0.equalsIgnoreCase(r3);
        r0 = r11.f36375K;
        if (r0 != 0) goto L_0x0177;
    L_0x0175:
        r0 = 1;
        goto L_0x0178;
    L_0x0177:
        r0 = 0;
    L_0x0178:
        X.AnonymousClass2yO.m18017F(r0);
        r11.f36367C = r1;
        goto L_0x029f;
    L_0x017f:
        r11 = X.AnonymousClass45b.m22939H(r11);	 Catch:{ 2xQ -> 0x021b }
        r0 = "\\s+";	 Catch:{ 2xQ -> 0x021b }
        r7 = r3.split(r0);	 Catch:{ 2xQ -> 0x021b }
        r0 = r7.length;	 Catch:{ 2xQ -> 0x021b }
        r1 = 2;	 Catch:{ 2xQ -> 0x021b }
        r2 = 1;	 Catch:{ 2xQ -> 0x021b }
        if (r0 != r2) goto L_0x0195;	 Catch:{ 2xQ -> 0x021b }
    L_0x018e:
        r0 = f49966G;	 Catch:{ 2xQ -> 0x021b }
        r1 = r0.matcher(r3);	 Catch:{ 2xQ -> 0x021b }
        goto L_0x01a7;	 Catch:{ 2xQ -> 0x021b }
    L_0x0195:
        r0 = r7.length;	 Catch:{ 2xQ -> 0x021b }
        if (r0 != r1) goto L_0x02c1;	 Catch:{ 2xQ -> 0x021b }
    L_0x0198:
        r1 = f49966G;	 Catch:{ 2xQ -> 0x021b }
        r0 = r7[r2];	 Catch:{ 2xQ -> 0x021b }
        r1 = r1.matcher(r0);	 Catch:{ 2xQ -> 0x021b }
        r7 = "TtmlDecoder";	 Catch:{ 2xQ -> 0x021b }
        r0 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.";	 Catch:{ 2xQ -> 0x021b }
        android.util.Log.w(r7, r0);	 Catch:{ 2xQ -> 0x021b }
    L_0x01a7:
        r0 = r1.matches();	 Catch:{ 2xQ -> 0x021b }
        if (r0 == 0) goto L_0x02a4;	 Catch:{ 2xQ -> 0x021b }
    L_0x01ad:
        r0 = 3;	 Catch:{ 2xQ -> 0x021b }
        r7 = r1.group(r0);	 Catch:{ 2xQ -> 0x021b }
        r9 = -1;	 Catch:{ 2xQ -> 0x021b }
        r8 = r7.hashCode();	 Catch:{ 2xQ -> 0x021b }
        r0 = 37;	 Catch:{ 2xQ -> 0x021b }
        if (r8 == r0) goto L_0x01d8;	 Catch:{ 2xQ -> 0x021b }
    L_0x01bb:
        r0 = 3240; // 0xca8 float:4.54E-42 double:1.601E-320;	 Catch:{ 2xQ -> 0x021b }
        if (r8 == r0) goto L_0x01ce;	 Catch:{ 2xQ -> 0x021b }
    L_0x01bf:
        r0 = 3592; // 0xe08 float:5.033E-42 double:1.7747E-320;	 Catch:{ 2xQ -> 0x021b }
        if (r8 == r0) goto L_0x01c4;	 Catch:{ 2xQ -> 0x021b }
    L_0x01c3:
        goto L_0x01e1;	 Catch:{ 2xQ -> 0x021b }
    L_0x01c4:
        r0 = "px";	 Catch:{ 2xQ -> 0x021b }
        r0 = r7.equals(r0);	 Catch:{ 2xQ -> 0x021b }
        if (r0 == 0) goto L_0x01e1;	 Catch:{ 2xQ -> 0x021b }
    L_0x01cc:
        r9 = 0;	 Catch:{ 2xQ -> 0x021b }
        goto L_0x01e1;	 Catch:{ 2xQ -> 0x021b }
    L_0x01ce:
        r0 = "em";	 Catch:{ 2xQ -> 0x021b }
        r0 = r7.equals(r0);	 Catch:{ 2xQ -> 0x021b }
        if (r0 == 0) goto L_0x01e1;	 Catch:{ 2xQ -> 0x021b }
    L_0x01d6:
        r9 = 1;	 Catch:{ 2xQ -> 0x021b }
        goto L_0x01e1;	 Catch:{ 2xQ -> 0x021b }
    L_0x01d8:
        r0 = "%";	 Catch:{ 2xQ -> 0x021b }
        r0 = r7.equals(r0);	 Catch:{ 2xQ -> 0x021b }
        if (r0 == 0) goto L_0x01e1;	 Catch:{ 2xQ -> 0x021b }
    L_0x01e0:
        r9 = 2;	 Catch:{ 2xQ -> 0x021b }
    L_0x01e1:
        switch(r9) {
            case 0: goto L_0x0208;
            case 1: goto L_0x0204;
            case 2: goto L_0x0200;
            default: goto L_0x01e4;
        };	 Catch:{ 2xQ -> 0x021b }
    L_0x01e4:
        r2 = new X.2xQ;	 Catch:{ 2xQ -> 0x021b }
        r1 = new java.lang.StringBuilder;	 Catch:{ 2xQ -> 0x021b }
        r1.<init>();	 Catch:{ 2xQ -> 0x021b }
        r0 = "Invalid unit for fontSize: '";	 Catch:{ 2xQ -> 0x021b }
        r1.append(r0);	 Catch:{ 2xQ -> 0x021b }
        r1.append(r7);	 Catch:{ 2xQ -> 0x021b }
        r0 = "'.";	 Catch:{ 2xQ -> 0x021b }
        r1.append(r0);	 Catch:{ 2xQ -> 0x021b }
        r0 = r1.toString();	 Catch:{ 2xQ -> 0x021b }
        r2.<init>(r0);	 Catch:{ 2xQ -> 0x021b }
    L_0x01ff:
        throw r2;	 Catch:{ 2xQ -> 0x021b }
    L_0x0200:
        r0 = 3;	 Catch:{ 2xQ -> 0x021b }
        r11.f36371G = r0;	 Catch:{ 2xQ -> 0x021b }
        goto L_0x020b;	 Catch:{ 2xQ -> 0x021b }
    L_0x0204:
        r0 = 2;	 Catch:{ 2xQ -> 0x021b }
        r11.f36371G = r0;	 Catch:{ 2xQ -> 0x021b }
        goto L_0x020b;	 Catch:{ 2xQ -> 0x021b }
    L_0x0208:
        r0 = 1;	 Catch:{ 2xQ -> 0x021b }
        r11.f36371G = r0;	 Catch:{ 2xQ -> 0x021b }
    L_0x020b:
        r0 = r1.group(r2);	 Catch:{ 2xQ -> 0x021b }
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ 2xQ -> 0x021b }
        r0 = r0.floatValue();	 Catch:{ 2xQ -> 0x021b }
        r11.f36370F = r0;	 Catch:{ 2xQ -> 0x021b }
        goto L_0x029f;	 Catch:{ 2xQ -> 0x021b }
    L_0x021b:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed parsing fontSize value: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        goto L_0x029f;
    L_0x0232:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = r11.f36375K;
        if (r0 != 0) goto L_0x023c;
    L_0x023a:
        r0 = 1;
        goto L_0x023d;
    L_0x023c:
        r0 = 0;
    L_0x023d:
        X.AnonymousClass2yO.m18017F(r0);
        r11.f36369E = r3;
        goto L_0x029f;
    L_0x0243:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = 0;	 Catch:{ IllegalArgumentException -> 0x0250 }
        r0 = X.AnonymousClass2yR.m18020B(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0250 }
        r11.m17962C(r0);	 Catch:{ IllegalArgumentException -> 0x0250 }
        goto L_0x029f;	 Catch:{ IllegalArgumentException -> 0x0250 }
    L_0x0250:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed parsing color value: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        goto L_0x029f;
    L_0x0267:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r0 = 0;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r0 = X.AnonymousClass2yR.m18020B(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0276 }
        r11.f36366B = r0;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r0 = 1;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r11.f36372H = r0;	 Catch:{ IllegalArgumentException -> 0x0276 }
        goto L_0x029f;	 Catch:{ IllegalArgumentException -> 0x0276 }
    L_0x0276:
        r2 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed parsing background value: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        goto L_0x029f;
    L_0x028d:
        r1 = "style";
        r0 = r10.getName();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x029f;
    L_0x0299:
        r11 = X.AnonymousClass45b.m22939H(r11);
        r11.f36374J = r3;
    L_0x029f:
        r4 = r4 + 1;
        goto L_0x0006;
    L_0x02a3:
        return r11;
    L_0x02a4:
        r2 = new X.2xQ;	 Catch:{ 2xQ -> 0x021b }
        r1 = new java.lang.StringBuilder;	 Catch:{ 2xQ -> 0x021b }
        r1.<init>();	 Catch:{ 2xQ -> 0x021b }
        r0 = "Invalid expression for fontSize: '";	 Catch:{ 2xQ -> 0x021b }
        r1.append(r0);	 Catch:{ 2xQ -> 0x021b }
        r1.append(r3);	 Catch:{ 2xQ -> 0x021b }
        r0 = "'.";	 Catch:{ 2xQ -> 0x021b }
        r1.append(r0);	 Catch:{ 2xQ -> 0x021b }
        r0 = r1.toString();	 Catch:{ 2xQ -> 0x021b }
        r2.<init>(r0);	 Catch:{ 2xQ -> 0x021b }
        goto L_0x01ff;	 Catch:{ 2xQ -> 0x021b }
    L_0x02c1:
        r2 = new X.2xQ;	 Catch:{ 2xQ -> 0x021b }
        r1 = new java.lang.StringBuilder;	 Catch:{ 2xQ -> 0x021b }
        r1.<init>();	 Catch:{ 2xQ -> 0x021b }
        r0 = "Invalid number of entries for fontSize: ";	 Catch:{ 2xQ -> 0x021b }
        r1.append(r0);	 Catch:{ 2xQ -> 0x021b }
        r0 = r7.length;	 Catch:{ 2xQ -> 0x021b }
        r1.append(r0);	 Catch:{ 2xQ -> 0x021b }
        r0 = ".";	 Catch:{ 2xQ -> 0x021b }
        r1.append(r0);	 Catch:{ 2xQ -> 0x021b }
        r0 = r1.toString();	 Catch:{ 2xQ -> 0x021b }
        r2.<init>(r0);	 Catch:{ 2xQ -> 0x021b }
        goto L_0x01ff;	 Catch:{ 2xQ -> 0x021b }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45b.F(X.45b, org.xmlpull.v1.XmlPullParser, X.2xn):X.2xn");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: G */
    public static long m22938G(java.lang.String r12, X.AnonymousClass2xj r13) {
        /*
        r0 = f49963D;
        r4 = r0.matcher(r12);
        r0 = r4.matches();
        r10 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r5 = 5;
        r8 = 4;
        r9 = 3;
        r6 = 2;
        r2 = 1;
        if (r0 == 0) goto L_0x0086;
    L_0x0016:
        r0 = r4.group(r2);
        r0 = java.lang.Long.parseLong(r0);
        r2 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r0 = r0 * r2;
        r2 = (double) r0;
        r0 = r4.group(r6);
        r6 = java.lang.Long.parseLong(r0);
        r0 = 60;
        r6 = r6 * r0;
        r0 = (double) r6;
        java.lang.Double.isNaN(r2);
        java.lang.Double.isNaN(r0);
        r2 = r2 + r0;
        r0 = r4.group(r9);
        r6 = java.lang.Long.parseLong(r0);
        r0 = (double) r6;
        java.lang.Double.isNaN(r0);
        r2 = r2 + r0;
        r0 = r4.group(r8);
        r6 = 0;
        if (r0 == 0) goto L_0x004f;
    L_0x004a:
        r0 = java.lang.Double.parseDouble(r0);
        goto L_0x0051;
    L_0x004f:
        r0 = 0;
    L_0x0051:
        r2 = r2 + r0;
        r0 = r4.group(r5);
        if (r0 == 0) goto L_0x0062;
    L_0x0058:
        r0 = java.lang.Long.parseLong(r0);
        r1 = (float) r0;
        r0 = r13.f36344B;
        r1 = r1 / r0;
        r0 = (double) r1;
        goto L_0x0064;
    L_0x0062:
        r0 = 0;
    L_0x0064:
        r2 = r2 + r0;
        r0 = 6;
        r0 = r4.group(r0);
        if (r0 == 0) goto L_0x0082;
    L_0x006c:
        r0 = java.lang.Long.parseLong(r0);
        r6 = (double) r0;
        r0 = r13.f36345C;
        r0 = (double) r0;
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r0);
        r6 = r6 / r0;
        r0 = r13.f36344B;
        r0 = (double) r0;
        java.lang.Double.isNaN(r0);
        r6 = r6 / r0;
    L_0x0082:
        r2 = r2 + r6;
        r2 = r2 * r10;
        r0 = (long) r2;
        return r0;
    L_0x0086:
        r0 = f49967H;
        r1 = r0.matcher(r12);
        r0 = r1.matches();
        if (r0 == 0) goto L_0x011a;
    L_0x0092:
        r0 = r1.group(r2);
        r2 = java.lang.Double.parseDouble(r0);
        r4 = r1.group(r6);
        r1 = r4.hashCode();
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r1 == r0) goto L_0x00e7;
    L_0x00a6:
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r1 == r0) goto L_0x00dd;
    L_0x00aa:
        r0 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r1 == r0) goto L_0x00d3;
    L_0x00ae:
        r0 = 3494; // 0xda6 float:4.896E-42 double:1.7263E-320;
        if (r1 == r0) goto L_0x00c9;
    L_0x00b2:
        switch(r1) {
            case 115: goto L_0x00bf;
            case 116: goto L_0x00b6;
            default: goto L_0x00b5;
        };
    L_0x00b5:
        goto L_0x00f1;
    L_0x00b6:
        r0 = "t";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00f1;
    L_0x00be:
        goto L_0x00f2;
    L_0x00bf:
        r0 = "s";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00f1;
    L_0x00c7:
        r5 = 2;
        goto L_0x00f2;
    L_0x00c9:
        r0 = "ms";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00f1;
    L_0x00d1:
        r5 = 3;
        goto L_0x00f2;
    L_0x00d3:
        r0 = "m";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00f1;
    L_0x00db:
        r5 = 1;
        goto L_0x00f2;
    L_0x00dd:
        r0 = "h";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00f1;
    L_0x00e5:
        r5 = 0;
        goto L_0x00f2;
    L_0x00e7:
        r0 = "f";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00f1;
    L_0x00ef:
        r5 = 4;
        goto L_0x00f2;
    L_0x00f1:
        r5 = -1;
    L_0x00f2:
        switch(r5) {
            case 0: goto L_0x0111;
            case 1: goto L_0x010d;
            case 2: goto L_0x0117;
            case 3: goto L_0x0106;
            case 4: goto L_0x00fe;
            case 5: goto L_0x00f6;
            default: goto L_0x00f5;
        };
    L_0x00f5:
        goto L_0x0117;
    L_0x00f6:
        r0 = r13.f36346D;
        r0 = (double) r0;
        java.lang.Double.isNaN(r0);
        r2 = r2 / r0;
        goto L_0x0117;
    L_0x00fe:
        r0 = r13.f36344B;
        r0 = (double) r0;
        java.lang.Double.isNaN(r0);
        r2 = r2 / r0;
        goto L_0x0117;
    L_0x0106:
        r0 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r2 = r2 / r0;
        goto L_0x0117;
    L_0x010d:
        r0 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        r2 = r2 * r0;
        goto L_0x0117;
    L_0x0111:
        r0 = 4660134898793709568; // 0x40ac200000000000 float:0.0 double:3600.0;
        r2 = r2 * r0;
    L_0x0117:
        r2 = r2 * r10;
        r0 = (long) r2;
        return r0;
    L_0x011a:
        r2 = new X.2xQ;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Malformed time expression: ";
        r1.append(r0);
        r1.append(r12);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45b.G(java.lang.String, X.2xj):long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ X.AnonymousClass2xP mo5380G(byte[] r27, int r28, boolean r29) {
        /*
        r26 = this;
        r15 = r26;
        r0 = r15.f49969B;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r3 = r0.newPullParser();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r12 = new java.util.HashMap;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r12.<init>();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r9 = new java.util.HashMap;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r9.<init>();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1 = "";
        r0 = new X.2xl;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r8 = 0;
        r0.<init>(r8);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r9.put(r1, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = new java.io.ByteArrayInputStream;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r4 = 0;
        r2 = r27;
        r1 = r28;
        r0.<init>(r2, r4, r1);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r3.setInput(r0, r8);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r19 = new java.util.LinkedList;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r19.<init>();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r6 = r3.getEventType();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r7 = f49965F;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r14 = f49964E;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x0037:
        r0 = 1;
        if (r6 == r0) goto L_0x0313;
    L_0x003a:
        r2 = r19.peekLast();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r2 = (X.AnonymousClass2xk) r2;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r5 = 3;
        r0 = 2;
        if (r4 != 0) goto L_0x0301;
    L_0x0044:
        r1 = r3.getName();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r6 != r0) goto L_0x02a4;
    L_0x004a:
        r0 = "tt";
        r0 = r0.equals(r1);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x00c0;
    L_0x0052:
        r5 = "http://www.w3.org/ns/ttml#parameter";
        r0 = "frameRate";
        r0 = r3.getAttributeValue(r5, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x0061;
    L_0x005c:
        r13 = java.lang.Integer.parseInt(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        goto L_0x0063;
    L_0x0061:
        r13 = 30;
    L_0x0063:
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = "frameRateMultiplier";
        r5 = r3.getAttributeValue(r5, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r5 == 0) goto L_0x0091;
    L_0x006d:
        r0 = " ";
        r5 = r5.split(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r6 = r5.length;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = 2;
        if (r6 != r0) goto L_0x0089;
    L_0x0077:
        r0 = 0;
        r0 = r5[r0];	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r11 = (float) r0;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = 1;
        r0 = r5[r0];	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = (float) r0;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r11 = r11 / r0;
        goto L_0x0091;
    L_0x0089:
        r1 = new X.2xQ;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = "frameRateMultiplier doesn't have 2 parts";
        r1.<init>(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        throw r1;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x0091:
        r0 = f49965F;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r10 = r0.f36345C;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r5 = "http://www.w3.org/ns/ttml#parameter";
        r0 = "subFrameRate";
        r0 = r3.getAttributeValue(r5, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x00a3;
    L_0x009f:
        r10 = java.lang.Integer.parseInt(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x00a3:
        r0 = f49965F;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r6 = r0.f36346D;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = "tickRate";
        r0 = r3.getAttributeValue(r5, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x00b3;
    L_0x00af:
        r6 = java.lang.Integer.parseInt(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x00b3:
        r7 = new X.2xj;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = (float) r13;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = r0 * r11;
        r7.<init>(r0, r10, r6);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = f49964E;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r14 = X.AnonymousClass45b.m22935D(r3, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x00c0:
        r0 = "tt";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x00c8:
        r0 = "head";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x00d0:
        r0 = "body";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x00d8:
        r0 = "div";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x00e0:
        r0 = "p";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x00e8:
        r0 = "span";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x00f0:
        r0 = "br";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x00f8:
        r0 = "style";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x0100:
        r0 = "styling";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x0108:
        r0 = "layout";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x0110:
        r0 = "region";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x0118:
        r0 = "metadata";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x0120:
        r0 = "smpte:image";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x0128:
        r0 = "smpte:data";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 != 0) goto L_0x013b;
    L_0x0130:
        r0 = "smpte:information";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x0139;
    L_0x0138:
        goto L_0x013b;
    L_0x0139:
        r0 = 0;
        goto L_0x013c;
    L_0x013b:
        r0 = 1;
    L_0x013c:
        if (r0 != 0) goto L_0x0155;
    L_0x013e:
        r1 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1.<init>();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = "Ignoring unsupported tag: ";
        r1.append(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = r3.getName();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1.append(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1.toString();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x0152:
        r4 = 1;
        goto L_0x030a;
    L_0x0155:
        r0 = "head";
        r0 = r0.equals(r1);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x01b8;
    L_0x015d:
        r3.next();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = "style";
        r0 = X.AnonymousClass2yj.m18114E(r3, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x019b;
    L_0x0168:
        r0 = "style";
        r1 = X.AnonymousClass2yj.m18111B(r3, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = new X.2xn;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0.<init>();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r6 = X.AnonymousClass45b.m22937F(r15, r3, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r1 == 0) goto L_0x0191;
    L_0x0179:
        r0 = "\\s+";
        r5 = r1.split(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r2 = r5.length;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1 = 0;
    L_0x0181:
        if (r1 >= r2) goto L_0x0191;
    L_0x0183:
        r0 = r5[r1];	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = r12.get(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = (X.AnonymousClass2xn) r0;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r6.m17960A(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1 = r1 + 1;
        goto L_0x0181;
    L_0x0191:
        r0 = r6.f36374J;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x01ae;
    L_0x0195:
        r0 = r6.f36374J;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r12.put(r0, r6);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        goto L_0x01ae;
    L_0x019b:
        r0 = "region";
        r0 = X.AnonymousClass2yj.m18114E(r3, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x01ae;
    L_0x01a3:
        r1 = X.AnonymousClass45b.m22936E(r3, r14);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r1 == 0) goto L_0x01ae;
    L_0x01a9:
        r0 = r1.f36358B;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r9.put(r0, r1);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x01ae:
        r0 = "head";
        r0 = X.AnonymousClass2yj.m18112C(r3, r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x015d;
    L_0x01b6:
        goto L_0x030a;
    L_0x01b8:
        r29 = "";
        r13 = r3.getAttributeCount();	 Catch:{ 2xQ -> 0x029a }
        r18 = 0;
        r0 = r18;
        r27 = X.AnonymousClass45b.m22937F(r15, r3, r0);	 Catch:{ 2xQ -> 0x029a }
        r23 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r16 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r11 = 0;
    L_0x01d6:
        if (r11 >= r13) goto L_0x0245;
    L_0x01d8:
        r10 = r3.getAttributeName(r11);	 Catch:{ 2xQ -> 0x029a }
        r6 = r3.getAttributeValue(r11);	 Catch:{ 2xQ -> 0x029a }
        r5 = r10.hashCode();	 Catch:{ 2xQ -> 0x029a }
        switch(r5) {
            case -934795532: goto L_0x0210;
            case 99841: goto L_0x0206;
            case 100571: goto L_0x01fc;
            case 93616297: goto L_0x01f2;
            case 109780401: goto L_0x01e8;
            default: goto L_0x01e7;
        };	 Catch:{ 2xQ -> 0x029a }
    L_0x01e7:
        goto L_0x021a;
    L_0x01e8:
        r5 = "style";
        r5 = r10.equals(r5);	 Catch:{ 2xQ -> 0x029a }
        if (r5 == 0) goto L_0x021a;
    L_0x01f0:
        r5 = 3;
        goto L_0x021b;
    L_0x01f2:
        r5 = "begin";
        r5 = r10.equals(r5);	 Catch:{ 2xQ -> 0x029a }
        if (r5 == 0) goto L_0x021a;
    L_0x01fa:
        r5 = 0;
        goto L_0x021b;
    L_0x01fc:
        r5 = "end";
        r5 = r10.equals(r5);	 Catch:{ 2xQ -> 0x029a }
        if (r5 == 0) goto L_0x021a;
    L_0x0204:
        r5 = 1;
        goto L_0x021b;
    L_0x0206:
        r5 = "dur";
        r5 = r10.equals(r5);	 Catch:{ 2xQ -> 0x029a }
        if (r5 == 0) goto L_0x021a;
    L_0x020e:
        r5 = 2;
        goto L_0x021b;
    L_0x0210:
        r5 = "region";
        r5 = r10.equals(r5);	 Catch:{ 2xQ -> 0x029a }
        if (r5 == 0) goto L_0x021a;
    L_0x0218:
        r5 = 4;
        goto L_0x021b;
    L_0x021a:
        r5 = -1;
    L_0x021b:
        switch(r5) {
            case 0: goto L_0x023e;
            case 1: goto L_0x0239;
            case 2: goto L_0x0234;
            case 3: goto L_0x0228;
            case 4: goto L_0x021f;
            default: goto L_0x021e;
        };	 Catch:{ 2xQ -> 0x029a }
    L_0x021e:
        goto L_0x0242;
    L_0x021f:
        r5 = r9.containsKey(r6);	 Catch:{ 2xQ -> 0x029a }
        if (r5 == 0) goto L_0x0242;
    L_0x0225:
        r29 = r6;
        goto L_0x0242;
    L_0x0228:
        r5 = "\\s+";
        r6 = r6.split(r5);	 Catch:{ 2xQ -> 0x029a }
        r5 = r6.length;	 Catch:{ 2xQ -> 0x029a }
        if (r5 <= 0) goto L_0x0242;
    L_0x0231:
        r18 = r6;
        goto L_0x0242;
    L_0x0234:
        r16 = X.AnonymousClass45b.m22938G(r6, r7);	 Catch:{ 2xQ -> 0x029a }
        goto L_0x0242;
    L_0x0239:
        r0 = X.AnonymousClass45b.m22938G(r6, r7);	 Catch:{ 2xQ -> 0x029a }
        goto L_0x0242;
    L_0x023e:
        r23 = X.AnonymousClass45b.m22938G(r6, r7);	 Catch:{ 2xQ -> 0x029a }
    L_0x0242:
        r11 = r11 + 1;
        goto L_0x01d6;
    L_0x0245:
        if (r2 == 0) goto L_0x0262;
    L_0x0247:
        r5 = r2.f36351F;	 Catch:{ 2xQ -> 0x029a }
        r10 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1));
        if (r5 == 0) goto L_0x0267;
    L_0x0252:
        r5 = (r23 > r10 ? 1 : (r23 == r10 ? 0 : -1));
        if (r5 == 0) goto L_0x025a;
    L_0x0256:
        r5 = r2.f36351F;	 Catch:{ 2xQ -> 0x029a }
        r23 = r23 + r5;
    L_0x025a:
        r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r5 == 0) goto L_0x0267;
    L_0x025e:
        r5 = r2.f36351F;	 Catch:{ 2xQ -> 0x029a }
        r0 = r0 + r5;
        goto L_0x0267;
    L_0x0262:
        r10 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x0267:
        r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r5 != 0) goto L_0x027e;
    L_0x026b:
        r5 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1));
        if (r5 == 0) goto L_0x0274;
    L_0x026f:
        r16 = r16 + r23;
        r0 = r16;
        goto L_0x027e;
    L_0x0274:
        if (r2 == 0) goto L_0x027e;
    L_0x0276:
        r5 = r2.f36348C;	 Catch:{ 2xQ -> 0x029a }
        r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1));
        if (r5 == 0) goto L_0x027e;
    L_0x027c:
        r0 = r2.f36348C;	 Catch:{ 2xQ -> 0x029a }
    L_0x027e:
        r21 = r3.getName();	 Catch:{ 2xQ -> 0x029a }
        r5 = new X.2xk;	 Catch:{ 2xQ -> 0x029a }
        r22 = 0;
        r25 = r0;
        r28 = r18;
        r20 = r5;
        r20.<init>(r21, r22, r23, r25, r27, r28, r29);	 Catch:{ 2xQ -> 0x029a }
        r0 = r19;
        r0.addLast(r5);	 Catch:{ 2xQ -> 0x029a }
        if (r2 == 0) goto L_0x030a;
    L_0x0296:
        r2.m17956A(r5);	 Catch:{ 2xQ -> 0x029a }
        goto L_0x030a;
    L_0x029a:
        r2 = move-exception;
        r1 = "TtmlDecoder";
        r0 = "Suppressing parser error";
        android.util.Log.w(r1, r0, r2);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        goto L_0x0152;
    L_0x02a4:
        r0 = 4;
        if (r6 != r0) goto L_0x02e4;
    L_0x02a7:
        r5 = r3.getText();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = new X.2xk;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1 = "\r\n";
        r6 = "\n";
        r5 = r5.replaceAll(r1, r6);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1 = " *\n *";
        r5 = r5.replaceAll(r1, r6);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1 = "\n";
        r6 = " ";
        r5 = r5.replaceAll(r1, r6);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r1 = "[ \t\\x0B\f\r]+";
        r22 = r5.replaceAll(r1, r6);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r29 = "";
        r21 = 0;
        r23 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r25 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r27 = 0;
        r28 = 0;
        r20 = r0;
        r20.<init>(r21, r22, r23, r25, r27, r28, r29);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r2.m17956A(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        goto L_0x030a;
    L_0x02e4:
        if (r6 != r5) goto L_0x030a;
    L_0x02e6:
        r1 = r3.getName();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = "tt";
        r0 = r1.equals(r0);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        if (r0 == 0) goto L_0x02fd;
    L_0x02f2:
        r8 = new X.3wM;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = r19.getLast();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r0 = (X.AnonymousClass2xk) r0;	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r8.<init>(r0, r12, r9);	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
    L_0x02fd:
        r19.removeLast();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        goto L_0x030a;
    L_0x0301:
        if (r6 != r0) goto L_0x0306;
    L_0x0303:
        r4 = r4 + 1;
        goto L_0x030a;
    L_0x0306:
        if (r6 != r5) goto L_0x030a;
    L_0x0308:
        r4 = r4 + -1;
    L_0x030a:
        r3.next();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        r6 = r3.getEventType();	 Catch:{ XmlPullParserException -> 0x031d, IOException -> 0x0314 }
        goto L_0x0037;
    L_0x0313:
        return r8;
    L_0x0314:
        r2 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r0 = "Unexpected error when reading input.";
        r1.<init>(r0, r2);
        throw r1;
    L_0x031d:
        r2 = move-exception;
        r1 = new X.2xQ;
        r0 = "Unable to decode source";
        r1.<init>(r0, r2);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45b.G(byte[], int, boolean):X.2xP");
    }

    /* renamed from: H */
    private static AnonymousClass2xn m22939H(AnonymousClass2xn anonymousClass2xn) {
        return anonymousClass2xn == null ? new AnonymousClass2xn() : anonymousClass2xn;
    }
}
