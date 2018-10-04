package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.2TJ */
public final class AnonymousClass2TJ implements AnonymousClass1yz {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass2TF f30761B;
    /* renamed from: C */
    private /* synthetic */ AnonymousClass2dp f30762C;
    /* renamed from: D */
    private /* synthetic */ boolean f30763D;
    /* renamed from: E */
    private /* synthetic */ AnonymousClass1yt f30764E;

    public AnonymousClass2TJ(AnonymousClass2TF anonymousClass2TF, AnonymousClass2dp anonymousClass2dp, boolean z, AnonymousClass1yt anonymousClass1yt) {
        this.f30761B = anonymousClass2TF;
        this.f30762C = anonymousClass2dp;
        this.f30763D = z;
        this.f30764E = anonymousClass1yt;
    }

    public final /* synthetic */ void bx(AnonymousClass1yy anonymousClass1yy) {
        Status status = (Status) anonymousClass1yy;
        AnonymousClass1yd.m13977B(this.f30761B.f30731B).m13986C();
        if (status.m15794B() && this.f30761B.mo3093H()) {
            AnonymousClass1yt anonymousClass1yt = this.f30761B;
            anonymousClass1yt.mo3091D();
            anonymousClass1yt.mo3090C();
        }
        this.f30762C.m15838H(status);
        if (this.f30763D) {
            this.f30764E.mo3091D();
        }
    }
}
