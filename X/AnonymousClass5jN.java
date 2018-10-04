package X;

import android.view.View;
import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.ScalingType;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: X.5jN */
public abstract class AnonymousClass5jN {
    /* renamed from: B */
    public final AnonymousClass5ij f68549B;
    /* renamed from: C */
    public VideoSink f68550C;

    /* renamed from: C */
    public abstract View mo6406C();

    /* renamed from: E */
    public abstract void mo6408E(VideoFrame videoFrame);

    /* renamed from: F */
    public abstract void mo6409F(boolean z);

    /* renamed from: G */
    public abstract void mo6410G(ScalingType scalingType);

    public AnonymousClass5jN(long j) {
        this.f68549B = new AnonymousClass5ij(j);
    }

    /* renamed from: A */
    public void m28355A(AnonymousClass5jM anonymousClass5jM) {
        AnonymousClass5ij anonymousClass5ij = this.f68549B;
        synchronized (anonymousClass5ij.f68431D) {
            anonymousClass5ij.f68431D.add(anonymousClass5jM);
        }
    }

    /* renamed from: B */
    public void mo6405B() {
        this.f68549B.m28334A();
    }

    /* renamed from: D */
    public void mo6407D(Context context) {
        context = this.f68549B;
        View C = mo6406C();
        if (context.f68433F != null) {
            context.m28334A();
        }
        context.f68433F = C;
        C.addOnAttachStateChangeListener(context);
    }
}
