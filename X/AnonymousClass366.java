package X;

import com.facebook.C0164R;

/* renamed from: X.366 */
public final class AnonymousClass366 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass36A f37785B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass368 f37786C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0IJ f37787D;
    /* renamed from: E */
    public final /* synthetic */ String f37788E;
    /* renamed from: F */
    public final /* synthetic */ String f37789F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Cm f37790G;

    public AnonymousClass366(AnonymousClass36A anonymousClass36A, AnonymousClass368 anonymousClass368, String str, String str2, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IJ anonymousClass0IJ) {
        this.f37785B = anonymousClass36A;
        this.f37786C = anonymousClass368;
        this.f37788E = str;
        this.f37789F = str2;
        this.f37790G = anonymousClass0Cm;
        this.f37787D = anonymousClass0IJ;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        AnonymousClass0db anonymousClass0db;
        AnonymousClass366 anonymousClass366 = this;
        int I = AnonymousClass0cQ.I(this, 2107038949);
        String B = AnonymousClass35u.m18504B(anonymousClass0Q6, this.f37787D.getContext().getString(C0164R.string.request_error));
        this.f37785B.f37799C.vl(this.f37788E, this.f37786C, B);
        AnonymousClass36A anonymousClass36A = this.f37785B;
        String str = this.f37788E;
        AnonymousClass368 anonymousClass368 = this.f37786C;
        String str2 = this.f37789F;
        AnonymousClass0Cn anonymousClass0Cn = this.f37790G;
        AnonymousClass368 anonymousClass3682 = AnonymousClass368.CATEGORY;
        String str3 = anonymousClass368 == anonymousClass3682 ? "super_category" : "sub_category";
        if (anonymousClass368 == anonymousClass3682) {
            anonymousClass0db = null;
        } else {
            anonymousClass0db = AnonymousClass0db.C();
            anonymousClass0db.G("super_category", str2);
            anonymousClass0db.G("category_id", str);
        }
        AnonymousClass33Z.m18342G(anonymousClass36A.f37800D, anonymousClass36A.f37803G, str3, B, anonymousClass0db, null, null, AnonymousClass0a2.I(anonymousClass0Cn));
        AnonymousClass33X anonymousClass33X = anonymousClass36A.f37801E;
        if (anonymousClass33X != null) {
            AnonymousClass33X.m18323B(anonymousClass33X, anonymousClass36A.f37802F, "fetch_data_error", AnonymousClass33Y.m18330E(anonymousClass368 == AnonymousClass368.CATEGORY ? "super_category" : "sub_category", str, str2, B));
        }
        AnonymousClass0cQ.H(anonymousClass366, 1338408982, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 375887358);
        super.onFinish();
        this.f37785B.f37799C.wl();
        AnonymousClass0cQ.H(this, 1276795209, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -73113948);
        super.onStart();
        this.f37785B.f37799C.xl();
        AnonymousClass0cQ.H(this, -188888941, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0db anonymousClass0db;
        Object obj2 = obj;
        AnonymousClass366 anonymousClass366 = this;
        int I = AnonymousClass0cQ.I(this, -1302387541);
        AnonymousClass2Xw anonymousClass2Xw = (AnonymousClass2Xw) obj2;
        int I2 = AnonymousClass0cQ.I(this, 750505251);
        this.f37785B.f37799C.yl(anonymousClass2Xw, this.f37786C, this.f37788E);
        this.f37785B.f37798B.put(this.f37788E, anonymousClass2Xw);
        AnonymousClass36A anonymousClass36A = this.f37785B;
        String str = this.f37788E;
        AnonymousClass368 anonymousClass368 = this.f37786C;
        String str2 = this.f37789F;
        AnonymousClass0Cn anonymousClass0Cn = this.f37790G;
        String str3 = anonymousClass368 == AnonymousClass368.CATEGORY ? "super_category" : "sub_category";
        if (anonymousClass368 == AnonymousClass368.CATEGORY) {
            anonymousClass0db = null;
        } else {
            anonymousClass0db = AnonymousClass0db.C();
            anonymousClass0db.G("super_category", str2);
            anonymousClass0db.G("category_id", str);
        }
        AnonymousClass33Z.m18341F(anonymousClass36A.f37800D, anonymousClass36A.f37803G, str3, anonymousClass0db, null, null, AnonymousClass0a2.I(anonymousClass0Cn));
        AnonymousClass33X anonymousClass33X = anonymousClass36A.f37801E;
        if (anonymousClass33X != null) {
            AnonymousClass33X.m18323B(anonymousClass33X, anonymousClass36A.f37802F, "fetch_data", AnonymousClass33Y.m18330E(anonymousClass368 == AnonymousClass368.CATEGORY ? "super_category" : "sub_category", str, str2, null));
        }
        AnonymousClass0cQ.H(anonymousClass366, 366928723, I2);
        AnonymousClass0cQ.H(anonymousClass366, 1530798311, I);
    }
}
