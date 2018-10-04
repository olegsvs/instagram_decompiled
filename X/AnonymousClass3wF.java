package X;

import com.google.android.exoplayer2.Format;

/* renamed from: X.3wF */
public final class AnonymousClass3wF implements AnonymousClass2xR {
    public final boolean KVA(Format format) {
        format = format.f35577a;
        if (!("text/vtt".equals(format) || "text/x-ssa".equals(format) || "application/ttml+xml".equals(format) || "application/x-mp4-vtt".equals(format) || "application/x-subrip".equals(format) || "application/x-quicktime-tx3g".equals(format) || "application/cea-608".equals(format) || "application/x-mp4-cea-608".equals(format) || "application/cea-708".equals(format) || "application/dvbsubs".equals(format))) {
            if (!"application/pgs".equals(format)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3wE fF(com.google.android.exoplayer2.Format r3) {
        /*
        r2 = this;
        r1 = r3.f35577a;
        r0 = r1.hashCode();
        switch(r0) {
            case -1351681404: goto L_0x0070;
            case -1248334819: goto L_0x0065;
            case -1026075066: goto L_0x005b;
            case -1004728940: goto L_0x0051;
            case 691401887: goto L_0x0047;
            case 822864842: goto L_0x003d;
            case 930165504: goto L_0x0033;
            case 1566015601: goto L_0x0029;
            case 1566016562: goto L_0x001e;
            case 1668750253: goto L_0x0014;
            case 1693976202: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x007b;
    L_0x000a:
        r0 = "application/ttml+xml";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0012:
        r0 = 3;
        goto L_0x007c;
    L_0x0014:
        r0 = "application/x-subrip";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x001c:
        r0 = 4;
        goto L_0x007c;
    L_0x001e:
        r0 = "application/cea-708";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0026:
        r0 = 8;
        goto L_0x007c;
    L_0x0029:
        r0 = "application/cea-608";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0031:
        r0 = 6;
        goto L_0x007c;
    L_0x0033:
        r0 = "application/x-mp4-cea-608";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x003b:
        r0 = 7;
        goto L_0x007c;
    L_0x003d:
        r0 = "text/x-ssa";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0045:
        r0 = 1;
        goto L_0x007c;
    L_0x0047:
        r0 = "application/x-quicktime-tx3g";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x004f:
        r0 = 5;
        goto L_0x007c;
    L_0x0051:
        r0 = "text/vtt";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0059:
        r0 = 0;
        goto L_0x007c;
    L_0x005b:
        r0 = "application/x-mp4-vtt";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0063:
        r0 = 2;
        goto L_0x007c;
    L_0x0065:
        r0 = "application/pgs";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x006d:
        r0 = 10;
        goto L_0x007c;
    L_0x0070:
        r0 = "application/dvbsubs";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0078:
        r0 = 9;
        goto L_0x007c;
    L_0x007b:
        r0 = -1;
    L_0x007c:
        switch(r0) {
            case 0: goto L_0x00c9;
            case 1: goto L_0x00c1;
            case 2: goto L_0x00bb;
            case 3: goto L_0x00b5;
            case 4: goto L_0x00af;
            case 5: goto L_0x00a7;
            case 6: goto L_0x009d;
            case 7: goto L_0x009d;
            case 8: goto L_0x0095;
            case 9: goto L_0x008d;
            case 10: goto L_0x0087;
            default: goto L_0x007f;
        };
    L_0x007f:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Attempted to create decoder for unsupported format";
        r1.<init>(r0);
        throw r1;
    L_0x0087:
        r0 = new X.45Y;
        r0.<init>();
        return r0;
    L_0x008d:
        r1 = new X.45X;
        r0 = r3.f35569S;
        r1.<init>(r0);
        return r1;
    L_0x0095:
        r1 = new X.45U;
        r0 = r3.f35552B;
        r1.<init>(r0);
        return r1;
    L_0x009d:
        r2 = new X.45T;
        r1 = r3.f35577a;
        r0 = r3.f35552B;
        r2.<init>(r1, r0);
        return r2;
    L_0x00a7:
        r1 = new X.45c;
        r0 = r3.f35569S;
        r1.<init>(r0);
        return r1;
    L_0x00af:
        r0 = new X.45a;
        r0.<init>();
        return r0;
    L_0x00b5:
        r0 = new X.45b;
        r0.<init>();
        return r0;
    L_0x00bb:
        r0 = new X.45d;
        r0.<init>();
        return r0;
    L_0x00c1:
        r1 = new X.45Z;
        r0 = r3.f35569S;
        r1.<init>(r0);
        return r1;
    L_0x00c9:
        r0 = new X.45e;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3wF.fF(com.google.android.exoplayer2.Format):X.3wE");
    }
}
