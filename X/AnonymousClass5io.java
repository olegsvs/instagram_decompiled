package X;

import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.ScalingType;

/* renamed from: X.5io */
public final class AnonymousClass5io implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6DQ f68445B;
    /* renamed from: C */
    public final /* synthetic */ Context f68446C;
    /* renamed from: D */
    public final /* synthetic */ boolean f68447D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass5jN f68448E;
    /* renamed from: F */
    public final /* synthetic */ ScalingType f68449F;

    public AnonymousClass5io(AnonymousClass6DQ anonymousClass6DQ, AnonymousClass5jN anonymousClass5jN, Context context, boolean z, ScalingType scalingType) {
        this.f68445B = anonymousClass6DQ;
        this.f68448E = anonymousClass5jN;
        this.f68446C = context;
        this.f68447D = z;
        this.f68449F = scalingType;
    }

    public final void run() {
        this.f68448E.mo6407D(this.f68446C);
        this.f68445B.f73050E.add(this.f68448E);
        this.f68448E.mo6409F(this.f68447D);
        this.f68448E.mo6410G(this.f68449F);
    }
}
