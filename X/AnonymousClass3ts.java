package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

/* renamed from: X.3ts */
public final class AnonymousClass3ts implements AnonymousClass2qd {
    /* renamed from: B */
    private final int f46154B;
    /* renamed from: C */
    private MediaCodecInfo[] f46155C;

    public final boolean rLA() {
        return true;
    }

    public AnonymousClass3ts(boolean z) {
        this.f46154B = z;
    }

    /* renamed from: B */
    private void m21191B() {
        if (this.f46155C == null) {
            this.f46155C = new MediaCodecList(this.f46154B).getCodecInfos();
        }
    }

    public final boolean XY(String str, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public final int qJ() {
        m21191B();
        return this.f46155C.length;
    }

    public final MediaCodecInfo sJ(int i) {
        m21191B();
        return this.f46155C[i];
    }
}
