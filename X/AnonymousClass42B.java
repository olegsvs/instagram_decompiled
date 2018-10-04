package X;

import android.view.Surface;
import com.instagram.ui.widget.textureview.CircularTextureView;

/* renamed from: X.42B */
public final class AnonymousClass42B implements AnonymousClass3jH {
    /* renamed from: B */
    public final /* synthetic */ CircularTextureView f48739B;
    /* renamed from: C */
    public final /* synthetic */ int f48740C;
    /* renamed from: D */
    public final /* synthetic */ int f48741D;

    public AnonymousClass42B(CircularTextureView circularTextureView, int i, int i2) {
        this.f48739B = circularTextureView;
        this.f48741D = i;
        this.f48740C = i2;
    }

    public final void YCA(Surface surface) {
        this.f48739B.f43907B = surface != null;
        if (this.f48739B.f43910E != null && this.f48739B.m20542A()) {
            this.f48739B.f43910E.onSurfaceTextureAvailable(this.f48739B.getSurfaceTexture(), this.f48741D, this.f48740C);
        }
    }
}
