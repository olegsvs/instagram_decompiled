package X;

import com.facebook.exoplayer.ipc.RendererContext;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.3tK */
public final class AnonymousClass3tK implements AnonymousClass2le {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2pk f46030B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3tF f46031C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Gy f46032D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass2pd f46033E;
    /* renamed from: F */
    public final /* synthetic */ VideoPlayRequest f46034F;

    public AnonymousClass3tK(AnonymousClass2pk anonymousClass2pk, AnonymousClass2pd anonymousClass2pd, AnonymousClass3tF anonymousClass3tF, AnonymousClass1Gy anonymousClass1Gy, VideoPlayRequest videoPlayRequest) {
        this.f46030B = anonymousClass2pk;
        this.f46033E = anonymousClass2pd;
        this.f46031C = anonymousClass3tF;
        this.f46032D = anonymousClass1Gy;
        this.f46034F = videoPlayRequest;
    }

    public final void qk(String str, Exception exception) {
        AnonymousClass2pR.m17342B(this.f46033E, "ProgressiveBuilderError: %s", exception.getMessage());
        this.f46031C.m21172B(str, exception);
    }

    public final void qw(AnonymousClass3ty anonymousClass3ty, AnonymousClass3ty anonymousClass3ty2, AnonymousClass3ty anonymousClass3ty3, RendererContext rendererContext, long j, long j2, long j3, long j4, boolean z, AnonymousClass2rQ anonymousClass2rQ) {
        AnonymousClass3tK anonymousClass3tK = this;
        AnonymousClass3ty anonymousClass3ty4 = anonymousClass3ty;
        AnonymousClass2rQ anonymousClass2rQ2 = anonymousClass2rQ;
        if (anonymousClass3ty != null) {
            AnonymousClass3ty anonymousClass3ty5 = anonymousClass3ty2;
            if (anonymousClass3ty2 != null) {
                if (anonymousClass3ty3 != null) {
                    try {
                        anonymousClass3tK.f46031C.m21171A(anonymousClass3ty4, anonymousClass3ty5, new AnonymousClass3tg().m21182A(anonymousClass3tK.f46030B.f34623B, anonymousClass3tK.f46033E, anonymousClass3tK.f46032D, anonymousClass3tK.f46034F, anonymousClass3tK.f46030B.f34624C), AnonymousClass1eC.PROGRESSIVE_DOWNLOAD, null, anonymousClass2rQ2 instanceof AnonymousClass3sJ ? (AnonymousClass3sJ) anonymousClass2rQ2 : null, 0, 0, 0, 0, z);
                    } catch (Exception e) {
                        anonymousClass3tK.f46031C.m21172B("REMOTE", e);
                    }
                    return;
                }
            }
        }
        qk("RENDERERNULL", new IllegalStateException("Renderer is null"));
    }
}
