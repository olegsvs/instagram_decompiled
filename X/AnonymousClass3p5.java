package X;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;

/* renamed from: X.3p5 */
public final class AnonymousClass3p5 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1XV f44888B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0OA f44889C;

    public AnonymousClass3p5(AnonymousClass1XV anonymousClass1XV, AnonymousClass0OA anonymousClass0OA) {
        this.f44888B = anonymousClass1XV;
        this.f44889C = anonymousClass0OA;
    }

    public final void run() {
        try {
            long j = this.f44888B.f19770K - this.f44888B.f19783X;
            BufferInfo bufferInfo = new BufferInfo();
            AnonymousClass3p7.m20798C(this.f44888B.f19781V);
            while (!this.f44888B.f19776Q) {
                int dequeueOutputBuffer = this.f44888B.f19769J.dequeueOutputBuffer(bufferInfo, -1);
                AnonymousClass3p7.m20800E(this.f44888B.f19781V, this.f44888B.f19780U);
                if (dequeueOutputBuffer == -2) {
                    this.f44888B.f19764E.aSA(this.f44888B.f19769J.getOutputFormat());
                    MediaFormat B = AnonymousClass1XV.B(this.f44888B, this.f44889C);
                    if (B != null) {
                        this.f44888B.f19764E.kMA(B);
                    }
                    this.f44888B.f19764E.start();
                    this.f44888B.f19782W = true;
                } else if (dequeueOutputBuffer < 0) {
                    continue;
                } else if ((bufferInfo.flags & 4) != 0) {
                    AnonymousClass1XV.F(this.f44888B, null);
                    return;
                } else {
                    this.f44888B.f19764E.GXA(AnonymousClass1XV.D(this.f44888B.f19769J, dequeueOutputBuffer), bufferInfo);
                    this.f44888B.m20805E(bufferInfo.presentationTimeUs, j);
                    this.f44888B.f19769J.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
                AnonymousClass3p7.m20800E(this.f44888B.f19780U, this.f44888B.f19781V);
            }
        } catch (Throwable th) {
            AnonymousClass0Dc.E(AnonymousClass1XV.f19759q, th, "Muxer threw exception", new Object[0]);
            AnonymousClass1XV.F(this.f44888B, th);
        }
    }
}
