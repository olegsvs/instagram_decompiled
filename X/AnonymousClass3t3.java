package X;

import android.graphics.Rect;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.util.Collections;

/* renamed from: X.3t3 */
public final class AnonymousClass3t3 implements AnonymousClass2o5 {
    /* renamed from: B */
    public String f45975B;
    /* renamed from: C */
    public int f45976C;
    /* renamed from: D */
    public int[] f45977D = new int[2];
    /* renamed from: E */
    public int f45978E;
    /* renamed from: F */
    public String f45979F;
    /* renamed from: G */
    public int f45980G;
    /* renamed from: H */
    private final AnonymousClass3t0 f45981H;
    /* renamed from: I */
    private Rect f45982I;
    /* renamed from: J */
    private Rect f45983J;
    /* renamed from: K */
    private Size f45984K;

    public AnonymousClass3t3(Parameters parameters, AnonymousClass3t0 anonymousClass3t0) {
        this.f45981H = anonymousClass3t0;
        parameters.getFocusMode();
        parameters.getAntibanding();
        parameters.getColorEffect();
        parameters.getAutoExposureLock();
        parameters.getAutoWhiteBalanceLock();
        this.f45975B = parameters.getFlashMode();
        parameters.getExposureCompensation();
        if (anonymousClass3t0.fY()) {
            AnonymousClass2o3.m17234I(parameters.getFocusAreas());
        } else {
            Collections.emptyList();
        }
        parameters.getHorizontalViewAngle();
        parameters.getVerticalViewAngle();
        parameters.getJpegQuality();
        parameters.getJpegThumbnailQuality();
        parameters.getJpegThumbnailSize();
        if (anonymousClass3t0.gY()) {
            AnonymousClass2o3.m17234I(parameters.getMeteringAreas());
        } else {
            Collections.emptyList();
        }
        parameters.getPictureFormat();
        m21149A(parameters.getPictureSize());
        this.f45976C = parameters.getPreviewFormat();
        parameters.getPreviewFpsRange(this.f45977D);
        this.f45978E = parameters.getPreviewFrameRate();
        m21150B(parameters.getPreviewSize());
        this.f45979F = parameters.getSceneMode();
        parameters.getVideoStabilization();
        parameters.getWhiteBalance();
        this.f45980G = parameters.getZoom();
        Size previewSize = parameters.getPreviewSize();
        this.f45983J = new Rect(0, 0, previewSize.width, previewSize.height);
        previewSize = parameters.getPictureSize();
        this.f45982I = new Rect(0, 0, previewSize.width, previewSize.height);
    }

    /* renamed from: A */
    public final void m21149A(Size size) {
        this.f45982I = new Rect(0, 0, size.width, size.height);
    }

    /* renamed from: B */
    public final void m21150B(Size size) {
        this.f45984K = size;
        this.f45983J = new Rect(0, 0, size.width, size.height);
    }

    public final String BM() {
        return this.f45975B;
    }

    public final int IU() {
        return AnonymousClass2o3.m17228C(this.f45978E, this.f45977D, this.f45981H.f45947M);
    }

    public final void SP(Rect rect) {
        rect.set(this.f45982I);
    }

    public final boolean XX() {
        String str = this.f45975B;
        if (str != null) {
            if (!str.equals("off")) {
                return false;
            }
        }
        return true;
    }

    public final boolean aX() {
        return AnonymousClass2o3.f34128B && AnonymousClass2o3.f34129C.equals(this.f45979F);
    }

    public final int gU() {
        return this.f45980G;
    }

    public final int rP() {
        return this.f45976C;
    }

    public final void vP(Rect rect) {
        rect.set(this.f45983J);
    }

    public final Size wP() {
        return this.f45984K;
    }
}
