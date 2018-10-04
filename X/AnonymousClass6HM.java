package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoCapturer.CapturerObserver;

/* renamed from: X.6HM */
public final class AnonymousClass6HM implements VideoCapturer {
    /* renamed from: B */
    public volatile int f74029B;
    /* renamed from: C */
    public volatile int f74030C;
    /* renamed from: D */
    public volatile int f74031D;
    /* renamed from: E */
    public CapturerObserver f74032E;
    /* renamed from: F */
    public AnonymousClass1he f74033F;
    /* renamed from: G */
    public final AtomicBoolean f74034G = new AtomicBoolean();
    /* renamed from: H */
    public int f74035H;
    /* renamed from: I */
    public SurfaceTextureHelper f74036I;
    /* renamed from: J */
    public int f74037J;
    /* renamed from: K */
    private boolean f74038K;
    /* renamed from: L */
    private final AtomicBoolean f74039L = new AtomicBoolean();

    public final boolean isScreencast() {
        return false;
    }

    /* renamed from: A */
    public final List m29902A(int i, int i2) {
        if (!(this.f74033F != null && this.f74037J == i && this.f74035H == i2)) {
            if (this.f74036I == null) {
                AnonymousClass0Gn.H("EncoderSurfaceVideoCapturer", "mSurfaceTextureHelper is null on getInputSurfaces");
                return Collections.emptyList();
            }
            this.f74037J = i;
            this.f74035H = i2;
            this.f74034G.set(true);
            SurfaceTexture surfaceTexture = this.f74036I.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.f74037J, this.f74035H);
            this.f74033F = new AnonymousClass1he(new Surface(surfaceTexture), this.f74037J, this.f74035H);
        }
        return Collections.singletonList(this.f74033F);
    }

    public final void changeCaptureFormat(int i, int i2, int i3) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
        Integer.valueOf(i3);
        this.f74031D = i;
        this.f74030C = i2;
        this.f74029B = i3;
        this.f74034G.set(true);
    }

    public final void dispose() {
        this.f74036I = null;
    }

    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.f74032E = capturerObserver;
        this.f74036I = surfaceTextureHelper;
        if (this.f74039L.getAndSet(false)) {
            AnonymousClass0Sy.F(new AnonymousClass5ih(this));
        }
    }

    public final void startCapture(int i, int i2, int i3) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
        Integer.valueOf(i3);
        this.f74031D = i;
        this.f74030C = i2;
        this.f74029B = i3;
        this.f74034G.set(true);
        SurfaceTextureHelper surfaceTextureHelper = this.f74036I;
        if (surfaceTextureHelper == null) {
            this.f74039L.set(true);
        } else if (!this.f74038K) {
            surfaceTextureHelper.startListening(new AnonymousClass6DN(this));
            this.f74038K = true;
        }
    }

    public final void stopCapture() {
        SurfaceTextureHelper surfaceTextureHelper = this.f74036I;
        if (surfaceTextureHelper == null) {
            this.f74039L.set(false);
        } else if (this.f74038K && surfaceTextureHelper.getHandler().getLooper().getThread().isAlive()) {
            this.f74036I.stopListening();
            this.f74038K = false;
        }
    }
}
