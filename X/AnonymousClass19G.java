package X;

import android.content.Context;

/* renamed from: X.19G */
public final class AnonymousClass19G extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0T6 f15114B;
    /* renamed from: C */
    public final /* synthetic */ String f15115C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0TH f15116D;
    /* renamed from: E */
    public final /* synthetic */ Context f15117E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0TG f15118F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Fz f15119G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass0o1 f15120H;
    /* renamed from: I */
    public final /* synthetic */ AnonymousClass0TD f15121I;
    /* renamed from: J */
    public final /* synthetic */ boolean f15122J;
    /* renamed from: K */
    public final /* synthetic */ AnonymousClass0Cm f15123K;

    public AnonymousClass19G(AnonymousClass0T6 anonymousClass0T6, Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0TD anonymousClass0TD, boolean z, String str, AnonymousClass0TG anonymousClass0TG, AnonymousClass0TH anonymousClass0TH, AnonymousClass0o1 anonymousClass0o1) {
        this.f15114B = anonymousClass0T6;
        this.f15117E = context;
        this.f15119G = anonymousClass0Fz;
        this.f15123K = anonymousClass0Cm;
        this.f15121I = anonymousClass0TD;
        this.f15122J = z;
        this.f15115C = str;
        this.f15118F = anonymousClass0TG;
        this.f15116D = anonymousClass0TH;
        this.f15120H = anonymousClass0o1;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 983838647);
        AnonymousClass0T6.m4462P(this.f15114B, this.f15117E, null);
        AnonymousClass0T6.m4461O(this.f15114B, this.f15117E, this.f15119G, this.f15123K, this.f15121I, this.f15122J, this.f15115C, this.f15118F, this.f15116D, this.f15120H);
        AnonymousClass0cQ.m5858H(this, -190344136, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 1048877667);
        AnonymousClass1IC anonymousClass1IC = (AnonymousClass1IC) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -249123273);
        AnonymousClass0T6.m4462P(this.f15114B, this.f15117E, anonymousClass1IC);
        AnonymousClass0T6.m4461O(this.f15114B, this.f15117E, this.f15119G, this.f15123K, this.f15121I, this.f15122J, this.f15115C, this.f15118F, this.f15116D, this.f15120H);
        AnonymousClass0cQ.m5858H(this, -1113679995, I2);
        AnonymousClass0cQ.m5858H(this, 941156934, I);
    }
}
