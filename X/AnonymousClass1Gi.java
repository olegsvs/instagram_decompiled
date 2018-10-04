package X;

import android.view.Surface;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.1Gi */
public final class AnonymousClass1Gi implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ boolean f16319B;
    /* renamed from: C */
    public final /* synthetic */ String f16320C;
    /* renamed from: D */
    public final /* synthetic */ int f16321D;
    /* renamed from: E */
    public final /* synthetic */ Surface f16322E;
    /* renamed from: F */
    public final /* synthetic */ int f16323F;
    /* renamed from: G */
    public final /* synthetic */ int f16324G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass0i5 f16325H;

    public AnonymousClass1Gi(AnonymousClass0i5 anonymousClass0i5, String str, boolean z, int i, Surface surface, int i2, int i3) {
        this.f16325H = anonymousClass0i5;
        this.f16320C = str;
        this.f16319B = z;
        this.f16321D = i;
        this.f16322E = surface;
        this.f16324G = i2;
        this.f16323F = i3;
    }

    public final void run() {
        AnonymousClass0i5 anonymousClass0i5 = this.f16325H;
        VideoPlayRequest B = AnonymousClass0a1.m5408B(AnonymousClass0a1.m5413G(anonymousClass0i5, AnonymousClass0a1.m5409C(anonymousClass0i5), this.f16320C), this.f16325H.f8560J, this.f16319B, this.f16321D, -1);
        float f = AnonymousClass0fo.f7997C.m6558B(false) ? 0.001f : 0.0f;
        AnonymousClass17X anonymousClass17X = AnonymousClass17X.f14756W;
        Surface surface = this.f16322E;
        int i = this.f16324G;
        int i2 = this.f16323F;
        HeroPlayerServiceApi heroPlayerServiceApi = anonymousClass17X.f14765J;
        if (heroPlayerServiceApi != null) {
            try {
                heroPlayerServiceApi.zWA(B, surface, i, i2, f);
            } catch (Throwable e) {
                AnonymousClass1Gl.m10574D("HeroServiceClient", e, "RemoteException when warmUpPlayer", new Object[0]);
            }
        }
    }
}
