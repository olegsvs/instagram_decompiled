package X;

import android.graphics.Rect;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.util.List;

/* renamed from: X.3t4 */
public final class AnonymousClass3t4 implements AnonymousClass2o0, AnonymousClass2o5 {
    /* renamed from: B */
    public final int f45985B;
    /* renamed from: C */
    public volatile Parameters f45986C;
    /* renamed from: D */
    private volatile boolean f45987D;

    public AnonymousClass3t4(int i, Parameters parameters) {
        this.f45985B = i;
        this.f45986C = parameters;
    }

    /* renamed from: A */
    public final boolean m21151A() {
        if (!AnonymousClass2o3.f34128B) {
            return false;
        }
        if (AnonymousClass2nw.m17221B(AnonymousClass2nw.f34119B)) {
            return false;
        }
        List supportedSceneModes = this.f45986C.getSupportedSceneModes();
        if (supportedSceneModes == null || !supportedSceneModes.contains("hdr")) {
            return false;
        }
        return true;
    }

    public final boolean AZ() {
        return this.f45986C.isZoomSupported();
    }

    /* renamed from: B */
    public final Parameters m21152B(Parameters parameters) {
        if (parameters != null) {
            Parameters parameters2 = this.f45986C;
            this.f45986C = parameters;
            return parameters2;
        }
        throw new NullPointerException("Cannot set Read Only Parameters to null");
    }

    public final String BM() {
        return this.f45986C.getFlashMode();
    }

    public final int IU() {
        int[] iArr = new int[2];
        this.f45986C.getPreviewFpsRange(iArr);
        return AnonymousClass2o3.m17228C(this.f45986C.getPreviewFrameRate(), iArr, this.f45986C.getSupportedPreviewFrameRates());
    }

    public final void SP(Rect rect) {
        Size pictureSize = this.f45986C.getPictureSize();
        rect.set(0, 0, pictureSize.width, pictureSize.height);
    }

    public final boolean SX() {
        return this.f45986C.getMaxNumDetectedFaces() > 0;
    }

    public final List XS() {
        return this.f45986C.getSupportedFlashModes();
    }

    public final boolean XX() {
        String BM = BM();
        if (BM != null) {
            if (!BM.equals("off")) {
                return false;
            }
        }
        return true;
    }

    public final List YS() {
        return this.f45986C.getSupportedFocusModes();
    }

    public final List ZS() {
        return this.f45986C.getSupportedPictureSizes();
    }

    public final List aS() {
        return this.f45986C.getSupportedPreviewSizes();
    }

    public final boolean aX() {
        return AnonymousClass2o3.f34128B && AnonymousClass2o3.f34129C.equals(this.f45986C.getSceneMode());
    }

    public final List bS() {
        return this.f45986C.getSupportedVideoSizes();
    }

    public final boolean dY() {
        return this.f45986C.isSmoothZoomSupported();
    }

    public final boolean fY() {
        return this.f45986C.getMaxNumFocusAreas() > 0;
    }

    public final int gU() {
        return this.f45986C.getZoom();
    }

    public final boolean gY() {
        return this.f45986C.getMaxNumMeteringAreas() > 0;
    }

    public final List hU() {
        return this.f45986C.getZoomRatios();
    }

    public final boolean iW() {
        return this.f45986C.getSupportedFocusModes().contains("auto");
    }

    public final int rP() {
        return this.f45986C.getPreviewFormat();
    }

    public final void vP(Rect rect) {
        Size previewSize = this.f45986C.getPreviewSize();
        rect.set(0, 0, previewSize.width, previewSize.height);
    }

    public final Size wP() {
        return this.f45986C.getPreviewSize();
    }

    public final boolean xY() {
        return this.f45986C.isVideoSnapshotSupported();
    }

    public final boolean yY() {
        return !AnonymousClass2nw.m17221B(AnonymousClass2nw.f34123F) && this.f45986C.isVideoStabilizationSupported();
    }

    public final int zN() {
        return this.f45986C.getMaxZoom();
    }
}
