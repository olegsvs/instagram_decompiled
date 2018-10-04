package X;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* renamed from: X.3rr */
public final class AnonymousClass3rr implements AnonymousClass2ip {
    /* renamed from: B */
    private volatile boolean f45501B;
    /* renamed from: C */
    private volatile boolean f45502C;
    /* renamed from: D */
    private int f45503D;
    /* renamed from: E */
    private MediaMuxer f45504E;
    /* renamed from: F */
    private volatile boolean f45505F;
    /* renamed from: G */
    private volatile boolean f45506G;
    /* renamed from: H */
    private int f45507H;

    /* renamed from: B */
    private boolean m20970B() {
        if (!this.f45502C || this.f45501B) {
            if (!this.f45506G || this.f45505F) {
                return true;
            }
        }
        return false;
    }

    public final void DF(String str) {
        this.f45504E = new MediaMuxer(str, 0);
        this.f45501B = false;
        this.f45505F = false;
    }

    public final void DXA(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f45504E.writeSampleData(this.f45503D, byteBuffer, bufferInfo);
        this.f45501B = true;
    }

    public final void GXA(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f45504E.writeSampleData(this.f45507H, byteBuffer, bufferInfo);
        this.f45505F = true;
    }

    public final void JQA(int i) {
        this.f45504E.setOrientationHint(i);
    }

    public final void aSA(MediaFormat mediaFormat) {
        this.f45507H = this.f45504E.addTrack(mediaFormat);
        this.f45506G = true;
    }

    public final void kMA(MediaFormat mediaFormat) {
        this.f45503D = this.f45504E.addTrack(mediaFormat);
        this.f45502C = true;
    }

    public final void start() {
        this.f45504E.start();
    }

    public final boolean vUA() {
        boolean z;
        if (this.f45504E == null || !m20970B()) {
            z = false;
        } else {
            z = true;
            this.f45504E.stop();
            this.f45504E.release();
        }
        this.f45501B = false;
        this.f45505F = false;
        this.f45504E = null;
        this.f45503D = 0;
        this.f45507H = 0;
        return z;
    }
}
