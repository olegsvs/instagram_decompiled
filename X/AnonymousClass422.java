package X;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.422 */
public final class AnonymousClass422 implements AnonymousClass0Ro, OnScrollListener, AnonymousClass3Lk {
    /* renamed from: B */
    public Context f48632B;
    /* renamed from: C */
    public String f48633C;
    /* renamed from: D */
    public AnonymousClass453 f48634D;
    /* renamed from: E */
    public AnonymousClass2ZW f48635E;
    /* renamed from: F */
    public AnonymousClass3iG f48636F = AnonymousClass3iG.LOADED;
    /* renamed from: G */
    private AnonymousClass0kd f48637G;
    /* renamed from: H */
    private AnonymousClass0Fz f48638H;
    /* renamed from: I */
    private AnonymousClass0Cm f48639I;

    public AnonymousClass422(Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass453 anonymousClass453) {
        this.f48632B = context;
        this.f48638H = anonymousClass0Fz;
        this.f48634D = anonymousClass453;
        this.f48637G = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 5, this);
        this.f48639I = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m22197A(String str, boolean z) {
        AnonymousClass3iG anonymousClass3iG = this.f48636F;
        AnonymousClass3iG anonymousClass3iG2 = AnonymousClass3iG.LOADING;
        if (anonymousClass3iG != anonymousClass3iG2) {
            this.f48636F = anonymousClass3iG2;
            this.f48633C = str;
            AnonymousClass1Dj C = AnonymousClass1Dj.C(this.f48639I).C(new AnonymousClass2C4(m22196B(z)));
            AnonymousClass1LF anonymousClass1LF = AnonymousClass1LF.OSS;
            AnonymousClass0LH.F(C.f15715C, "must set graphQL query prior to setting response format");
            C.f15715C.f17298B = anonymousClass1LF;
            AnonymousClass0GA B = C.B(AnonymousClass1Dk.IG_WWW);
            B.f2849B = new AnonymousClass3iF(this, z, this.f48633C);
            AnonymousClass0Px.B(this.f48632B, this.f48638H, B);
        }
    }

    /* renamed from: B */
    private java.lang.String m22196B(boolean r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r4 = new java.io.StringWriter;
        r4.<init>();
        r5 = 0;
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0052 }
        r3 = r0.createGenerator(r4);	 Catch:{ IOException -> 0x0052 }
        r3.writeStartObject();	 Catch:{ IOException -> 0x0052 }
        r1 = "0";	 Catch:{ IOException -> 0x0052 }
        r0 = r6.f48633C;	 Catch:{ IOException -> 0x0052 }
        r3.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0052 }
        r1 = "1";	 Catch:{ IOException -> 0x0052 }
        r0 = r6.f48639I;	 Catch:{ IOException -> 0x0052 }
        r0 = X.AnonymousClass2FT.m14834C(r0);	 Catch:{ IOException -> 0x0052 }
        r3.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0052 }
        r2 = "2";	 Catch:{ IOException -> 0x0052 }
        r0 = r6.f48632B;	 Catch:{ IOException -> 0x0052 }
        r1 = r0.getResources();	 Catch:{ IOException -> 0x0052 }
        r0 = 2131166491; // 0x7f07051b float:1.7947229E38 double:1.052936149E-314;	 Catch:{ IOException -> 0x0052 }
        r0 = r1.getDimensionPixelSize(r0);	 Catch:{ IOException -> 0x0052 }
        r3.writeNumberField(r2, r0);	 Catch:{ IOException -> 0x0052 }
        r1 = "3";	 Catch:{ IOException -> 0x0052 }
        r0 = 20;	 Catch:{ IOException -> 0x0052 }
        r3.writeNumberField(r1, r0);	 Catch:{ IOException -> 0x0052 }
        r1 = "4";	 Catch:{ IOException -> 0x0052 }
        if (r7 == 0) goto L_0x0040;	 Catch:{ IOException -> 0x0052 }
    L_0x003e:
        r0 = r5;	 Catch:{ IOException -> 0x0052 }
        goto L_0x0044;	 Catch:{ IOException -> 0x0052 }
    L_0x0040:
        r0 = r6.f48635E;	 Catch:{ IOException -> 0x0052 }
        r0 = r0.f31323B;	 Catch:{ IOException -> 0x0052 }
    L_0x0044:
        r3.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0052 }
        r3.writeEndObject();	 Catch:{ IOException -> 0x0052 }
        r3.close();	 Catch:{ IOException -> 0x0052 }
        r0 = r4.toString();	 Catch:{ IOException -> 0x0052 }
        return r0;	 Catch:{ IOException -> 0x0052 }
    L_0x0052:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.422.B(boolean):java.lang.String");
    }

    public final boolean NV() {
        return this.f48634D.f49629B.isEmpty() ^ 1;
    }

    public final void OZ() {
        m22197A(this.f48633C, false);
    }

    public final boolean QV() {
        AnonymousClass2ZW anonymousClass2ZW = this.f48635E;
        return (anonymousClass2ZW == null || anonymousClass2ZW.f31323B == null) ? false : true;
    }

    public final boolean UX() {
        return this.f48636F == AnonymousClass3iG.NEEDS_RETRY;
    }

    public final void gC() {
        Object obj = (this.f48636F == AnonymousClass3iG.LOADED && QV()) ? 1 : null;
        if (obj != null) {
            OZ();
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -721836839);
        this.f48637G.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, 1136615464, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 2042569669);
        this.f48637G.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, 1318597290, I);
    }

    public final boolean tX() {
        return uX() ? NV() : true;
    }

    public final boolean uX() {
        return this.f48636F == AnonymousClass3iG.LOADING;
    }
}
