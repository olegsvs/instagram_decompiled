package X;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.42Z */
public final class AnonymousClass42Z implements AnonymousClass3ot {
    /* renamed from: B */
    private final AnonymousClass3ot[] f48779B;

    public AnonymousClass42Z(AnonymousClass3ot... anonymousClass3otArr) {
        this.f48779B = anonymousClass3otArr;
    }

    public final void DF(String str) {
        for (AnonymousClass3ot DF : this.f48779B) {
            DF.DF(str);
        }
    }

    public final void DXA(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        for (AnonymousClass3ot DXA : this.f48779B) {
            DXA.DXA(byteBuffer, bufferInfo);
        }
    }

    public final void GXA(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        for (AnonymousClass3ot GXA : this.f48779B) {
            GXA.GXA(byteBuffer, bufferInfo);
        }
    }

    public final void JQA(int i) {
        for (AnonymousClass3ot JQA : this.f48779B) {
            JQA.JQA(i);
        }
    }

    public final void aSA(MediaFormat mediaFormat) {
        for (AnonymousClass3ot aSA : this.f48779B) {
            aSA.aSA(mediaFormat);
        }
    }

    public final void kMA(MediaFormat mediaFormat) {
        for (AnonymousClass3ot kMA : this.f48779B) {
            kMA.kMA(mediaFormat);
        }
    }

    public final void start() {
        for (AnonymousClass3ot start : this.f48779B) {
            start.start();
        }
    }

    public final void uUA(boolean z) {
        IOException iOException = null;
        for (AnonymousClass3ot uUA : this.f48779B) {
            try {
                uUA.uUA(z);
            } catch (IOException e) {
                iOException = e;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }
}
