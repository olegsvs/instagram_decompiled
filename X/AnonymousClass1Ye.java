package X;

import android.content.Context;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.1Ye */
public final class AnonymousClass1Ye extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Context f20069B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass10Y f20070C;
    /* renamed from: D */
    public final /* synthetic */ Hashtag f20071D;
    /* renamed from: E */
    public final /* synthetic */ boolean f20072E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0MI f20073F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Cm f20074G;

    public AnonymousClass1Ye(Hashtag hashtag, AnonymousClass0Cm anonymousClass0Cm, boolean z, Context context, AnonymousClass10Y anonymousClass10Y, AnonymousClass0MI anonymousClass0MI) {
        this.f20071D = hashtag;
        this.f20074G = anonymousClass0Cm;
        this.f20072E = z;
        this.f20069B = context;
        this.f20070C = anonymousClass10Y;
        this.f20073F = anonymousClass0MI;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 2071515212);
        AnonymousClass59h.C(this.f20071D, this.f20074G, this.f20072E ^ 1);
        AnonymousClass59h.E(this.f20069B, this.f20072E);
        AnonymousClass0cQ.m5858H(this, 2116505132, I);
    }

    public final void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 2011768534);
        AnonymousClass10Y anonymousClass10Y = this.f20070C;
        boolean z = this.f20072E;
        AnonymousClass0MI anonymousClass0MI = this.f20073F;
        if (anonymousClass10Y != null) {
            if (z) {
                anonymousClass10Y.wv(anonymousClass0MI);
            } else {
                anonymousClass10Y.Hw(anonymousClass0MI);
            }
        }
        AnonymousClass0cQ.m5858H(this, -1417479377, I);
    }
}
