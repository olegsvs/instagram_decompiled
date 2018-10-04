package X;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.VideoFilter;

/* renamed from: X.3qA */
public final class AnonymousClass3qA implements OnFrameAvailableListener {
    /* renamed from: B */
    public final AnonymousClass3Of f45161B;
    /* renamed from: C */
    public boolean f45162C;
    /* renamed from: D */
    public final Object f45163D = new Object();
    /* renamed from: E */
    public final BaseFilter f45164E;
    /* renamed from: F */
    public final SurfaceTexture f45165F;
    /* renamed from: G */
    public final int f45166G;
    /* renamed from: H */
    public final AnonymousClass3qC f45167H;
    /* renamed from: I */
    public final VideoFilter f45168I;

    public AnonymousClass3qA(SurfaceTexture surfaceTexture, AnonymousClass3qC anonymousClass3qC, int i, AnonymousClass3Of anonymousClass3Of, VideoFilter videoFilter, BaseFilter baseFilter) {
        this.f45165F = surfaceTexture;
        this.f45167H = anonymousClass3qC;
        this.f45166G = i;
        this.f45161B = anonymousClass3Of;
        this.f45168I = videoFilter;
        this.f45164E = baseFilter;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f45163D) {
            if (this.f45162C) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.f45162C = true;
            this.f45163D.notifyAll();
        }
    }
}
