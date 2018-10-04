package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;

/* renamed from: X.382 */
public final class AnonymousClass382 extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass383 f38142B;

    public AnonymousClass382(AnonymousClass383 anonymousClass383, Looper looper) {
        this.f38142B = anonymousClass383;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        switch (i) {
            case 1:
                AnonymousClass383 anonymousClass383 = this.f38142B;
                String str = (String) message.obj;
                int i2 = message.arg1;
                try {
                    anonymousClass383.f38149H = new MediaMuxer(str, 0);
                    anonymousClass383.f38149H.setOrientationHint(i2);
                    anonymousClass383.f38148G.start();
                    anonymousClass383.f38147F = true;
                    return;
                } catch (Exception e) {
                    AnonymousClass383.m18649D(anonymousClass383, "IOException: Cannot create MediaMuxer", e);
                    return;
                } catch (IllegalStateException e2) {
                    AnonymousClass383.m18650E(anonymousClass383, e2);
                    return;
                }
            case 2:
                AnonymousClass383.m18647B(this.f38142B, false);
                return;
            case 3:
                AnonymousClass383.m18648C(this.f38142B);
                return;
            case 4:
                AnonymousClass383 anonymousClass3832 = this.f38142B;
                if (anonymousClass3832.f38147F) {
                    AnonymousClass383.m18648C(anonymousClass3832);
                }
                MediaCodec mediaCodec = anonymousClass3832.f38148G;
                if (mediaCodec != null) {
                    mediaCodec.release();
                    anonymousClass3832.f38148G = null;
                }
                try {
                    if (anonymousClass3832.f38149H != null) {
                        anonymousClass3832.f38149H.release();
                    }
                } catch (Exception e3) {
                    AnonymousClass383.m18649D(anonymousClass3832, "MediaMuxer.release() Error", e3);
                } catch (Throwable th) {
                    anonymousClass3832.f38149H = null;
                }
                anonymousClass3832.f38149H = null;
                Surface surface = anonymousClass3832.f38146E;
                if (surface != null) {
                    surface.release();
                    anonymousClass3832.f38146E = null;
                }
                Looper looper = anonymousClass3832.f38145D.getLooper();
                if (looper != null) {
                    looper.quitSafely();
                }
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported msg what = ");
                stringBuilder.append(i);
                throw new RuntimeException(stringBuilder.toString());
        }
    }
}
