package X;

import android.hardware.Camera;
import android.hardware.Camera.OnZoomChangeListener;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.2ns */
public final class AnonymousClass2ns implements OnZoomChangeListener {
    /* renamed from: B */
    public Camera f34101B;
    /* renamed from: C */
    public final AnonymousClass2nz f34102C;
    /* renamed from: D */
    public volatile int f34103D;
    /* renamed from: E */
    public volatile boolean f34104E;
    /* renamed from: F */
    public boolean f34105F;
    /* renamed from: G */
    public final AnonymousClass2nZ f34106G = new AnonymousClass3sz(this);
    /* renamed from: H */
    public final AnonymousClass2nQ f34107H = new AnonymousClass2nQ();
    /* renamed from: I */
    public List f34108I;
    /* renamed from: J */
    private final Handler f34109J = new Handler(Looper.getMainLooper(), new AnonymousClass2nr(this));
    /* renamed from: K */
    private final AnonymousClass0Ne f34110K;

    public AnonymousClass2ns(AnonymousClass2nz anonymousClass2nz, AnonymousClass0Ne anonymousClass0Ne) {
        this.f34102C = anonymousClass2nz;
        this.f34110K = anonymousClass0Ne;
    }

    /* renamed from: A */
    public final void m17213A() {
        if (this.f34104E) {
            this.f34108I = null;
            this.f34101B.setZoomChangeListener(null);
            this.f34101B = null;
            this.f34104E = false;
        }
    }

    /* renamed from: B */
    public final void m17214B(int i) {
        if (!this.f34104E || i > AnonymousClass0Nc.D().f3623c) {
            return;
        }
        if (i >= 0) {
            if (AnonymousClass2oP.m17271B()) {
                throw new RuntimeException("Attempting to zoom on the UI thread!");
            } else if (!AnonymousClass0Nc.D().M()) {
                throw new AnonymousClass2nB("Zoom controller failed to set the zoom level.");
            } else if (this.f34105F) {
                this.f34101B.startSmoothZoom(i);
            } else {
                this.f34102C.Bc(this.f34101B, AnonymousClass0Nc.D().f3598D, this.f34110K).rSA(i).apply();
                Handler handler = this.f34109J;
                handler.sendMessage(handler.obtainMessage(1, i, 1));
            }
        }
    }

    public final void onZoomChange(int i, boolean z, Camera camera) {
        if (this.f34105F) {
            Handler handler = this.f34109J;
            handler.sendMessage(handler.obtainMessage(1, i, z));
        }
    }
}
