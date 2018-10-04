package X;

import android.hardware.Camera;
import android.hardware.Camera.OnZoomChangeListener;
import java.util.List;

/* renamed from: X.2nF */
public final class AnonymousClass2nF implements OnZoomChangeListener {
    /* renamed from: B */
    public boolean f34005B;
    /* renamed from: C */
    public List f34006C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Nc f34007D;

    public AnonymousClass2nF(AnonymousClass0Nc anonymousClass0Nc) {
        this.f34007D = anonymousClass0Nc;
        if (anonymousClass0Nc.M()) {
            this.f34006C = anonymousClass0Nc.f3599E.bJ(anonymousClass0Nc.f3598D).hU();
            this.f34005B = anonymousClass0Nc.f3599E.bJ(anonymousClass0Nc.f3598D).dY();
            return;
        }
        throw new AnonymousClass2nB("Failed to create a zoom controller.");
    }

    /* renamed from: A */
    public final void m17180A(int i) {
        if (i > this.f34007D.f3623c) {
            return;
        }
        if (i >= 0) {
            if (AnonymousClass2oP.m17271B()) {
                throw new RuntimeException("Attempting to zoom on the UI thread!");
            } else if (this.f34007D.M()) {
                if (this.f34005B) {
                    this.f34007D.f3596B.startSmoothZoom(i);
                } else {
                    this.f34007D.f3599E.Bc(this.f34007D.f3596B, this.f34007D.f3598D, this.f34007D.f3636p).rSA(i).apply();
                }
                if (!this.f34005B) {
                    AnonymousClass2oP.m17272C(new AnonymousClass2nE(this, i));
                }
            } else {
                throw new AnonymousClass2nB("Zoom controller failed to set the zoom level.");
            }
        }
    }

    public final void onZoomChange(int i, boolean z, Camera camera) {
        AnonymousClass2oP.m17272C(new AnonymousClass2nD(this, i, z, camera));
    }
}
