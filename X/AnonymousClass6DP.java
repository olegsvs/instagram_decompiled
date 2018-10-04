package X;

import android.content.Context;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon.ScalingType;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: X.6DP */
public final class AnonymousClass6DP extends AnonymousClass5jN {
    /* renamed from: B */
    private final AnonymousClass6HO f73045B = new AnonymousClass6HO("TextureViewRendererImpl");
    /* renamed from: C */
    private final AnonymousClass6Dd f73046C;

    public AnonymousClass6DP(Context context, long j) {
        super(j);
        this.f73046C = new AnonymousClass6Dd(context, this.f73045B);
    }

    /* renamed from: B */
    public static AnonymousClass5jN m29514B(Context context, long j) {
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass0Sy.F(new AnonymousClass5in(context, j, atomicReference, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return (AnonymousClass5jN) atomicReference.get();
    }

    /* renamed from: B */
    public final void mo6405B() {
        super.mo6405B();
        this.f73045B.release();
    }

    /* renamed from: C */
    public final View mo6406C() {
        return this.f73046C;
    }

    /* renamed from: D */
    public final void mo6407D(EglBase.Context context) {
        this.f73045B.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
        super.mo6407D(context);
    }

    /* renamed from: E */
    public final void mo6408E(VideoFrame videoFrame) {
        this.f73045B.onFrame(videoFrame);
    }

    /* renamed from: F */
    public final void mo6409F(boolean z) {
        this.f73045B.setMirror(z);
    }

    /* renamed from: G */
    public final void mo6410G(ScalingType scalingType) {
        AnonymousClass6Dd anonymousClass6Dd = this.f73046C;
        anonymousClass6Dd.f73059B.setScalingType(scalingType);
        anonymousClass6Dd.requestLayout();
    }
}
