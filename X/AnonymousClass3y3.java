package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;

/* renamed from: X.3y3 */
public final class AnonymousClass3y3 implements AnonymousClass2no {
    /* renamed from: B */
    public final AnonymousClass2R0 f47491B = new AnonymousClass2R0();
    /* renamed from: C */
    public final AnonymousClass389 f47492C;
    /* renamed from: D */
    public final AnonymousClass2R4 f47493D = new AnonymousClass2R4(this.f47494E.getResources());
    /* renamed from: E */
    private final Context f47494E;
    /* renamed from: F */
    private SurfaceTexture f47495F;

    public AnonymousClass3y3(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass36d anonymousClass36d, View view, AnonymousClass3xg anonymousClass3xg, String str) {
        Context context2 = context;
        this.f47494E = context;
        this.f47492C = new AnonymousClass389(context2, anonymousClass0Cm, anonymousClass36d, this.f47491B, view, anonymousClass3xg, str);
    }

    /* renamed from: A */
    public final void m21772A(AnonymousClass1sm anonymousClass1sm) {
        this.f47492C.f38170F.m16941A(anonymousClass1sm);
    }

    /* renamed from: B */
    public final void m21773B(AnonymousClass1sm anonymousClass1sm) {
        this.f47492C.f38170F.f32598N.m15633C(anonymousClass1sm);
    }

    public final synchronized void MJA(boolean z, SurfaceTexture surfaceTexture) {
        if (z && surfaceTexture != null) {
            this.f47492C.m18665A(z, surfaceTexture);
        }
    }

    public final synchronized SurfaceTexture dS() {
        SurfaceTexture surfaceTexture;
        AnonymousClass389 anonymousClass389 = this.f47492C;
        synchronized (anonymousClass389) {
            AnonymousClass389.m18664C(anonymousClass389);
            AnonymousClass0LH.I(anonymousClass389.f38172H, "SurfaceTexture must be present with non-zero size!");
            AnonymousClass386 anonymousClass386 = anonymousClass389.f38171G.f38162B;
            synchronized (anonymousClass386.f38156E) {
                if (anonymousClass386.f38157F == null) {
                    try {
                        anonymousClass386.f38156E.wait(2000);
                    } catch (Throwable e) {
                        AnonymousClass0Dc.G("IgCameraVideoInput", "Wait for SurfaceTexture was interrupted", e);
                    } catch (Throwable th) {
                    }
                    if (anonymousClass386.f38157F == null) {
                        AnonymousClass0Gn.H("IgCameraVideoInput", "MP: Failed SurfaceTexture creation for camera preview");
                    }
                }
                surfaceTexture = anonymousClass386.f38157F;
            }
            anonymousClass389.f38176L = surfaceTexture;
            surfaceTexture = anonymousClass389.f38176L;
        }
        return surfaceTexture;
    }

    public final synchronized SurfaceTexture eS() {
        return this.f47495F;
    }

    public final synchronized void gy(int i, int i2) {
        AnonymousClass389 anonymousClass389 = this.f47492C;
        anonymousClass389.f38175K = i;
        anonymousClass389.f38174J = i2;
        AnonymousClass389.m18664C(anonymousClass389);
    }

    public final synchronized void hy(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f47495F = surfaceTexture;
        AnonymousClass389 anonymousClass389 = this.f47492C;
        anonymousClass389.f38177M = surfaceTexture;
        anonymousClass389.f38175K = i;
        anonymousClass389.f38174J = i2;
        AnonymousClass389.m18664C(anonymousClass389);
    }

    public final synchronized void iy(SurfaceTexture surfaceTexture) {
        this.f47495F = null;
        AnonymousClass389 anonymousClass389 = this.f47492C;
        if (anonymousClass389.f38177M == surfaceTexture) {
            AnonymousClass2dH anonymousClass2dH = anonymousClass389.f38171G.f38165E;
            if (anonymousClass2dH != null) {
                anonymousClass2dH.m16602B();
            }
        }
    }

    public final synchronized void we(int i, int i2, int i3) {
        AnonymousClass389 anonymousClass389 = this.f47492C;
        synchronized (anonymousClass389) {
            anonymousClass389.f38168D = i;
            anonymousClass389.f38167C = i2;
            anonymousClass389.f38169E = i3;
            if (anonymousClass389.f38172H) {
                anonymousClass389.f38171G.m18662A(i, i2);
                AnonymousClass38C anonymousClass38C = anonymousClass389.f38173I;
                anonymousClass38C.f38191B = i3;
                AnonymousClass38C.m18680C(anonymousClass38C);
            }
        }
    }

    public final synchronized AnonymousClass2np zT() {
        AnonymousClass389 anonymousClass389;
        anonymousClass389 = this.f47492C;
        return new AnonymousClass3y7(anonymousClass389.f38179O, anonymousClass389.f38166B, anonymousClass389.f38170F);
    }
}
