package X;

import android.os.Handler;
import com.facebook.exoplayer.ipc.RendererContext;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.3tM */
public final class AnonymousClass3tM implements AnonymousClass2le {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3tO f46039B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3tF f46040C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass2rQ f46041D;
    /* renamed from: E */
    public final /* synthetic */ Handler f46042E;
    /* renamed from: F */
    public final /* synthetic */ boolean f46043F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass2pd f46044G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass2pk f46045H;
    /* renamed from: I */
    public final /* synthetic */ VideoPlayRequest f46046I;

    public AnonymousClass3tM(AnonymousClass3tO anonymousClass3tO, AnonymousClass2pd anonymousClass2pd, AnonymousClass2pk anonymousClass2pk, VideoPlayRequest videoPlayRequest, AnonymousClass3tF anonymousClass3tF, boolean z, Handler handler, AnonymousClass2rQ anonymousClass2rQ) {
        this.f46039B = anonymousClass3tO;
        this.f46044G = anonymousClass2pd;
        this.f46045H = anonymousClass2pk;
        this.f46046I = videoPlayRequest;
        this.f46040C = anonymousClass3tF;
        this.f46043F = z;
        this.f46042E = handler;
        this.f46041D = anonymousClass2rQ;
    }

    public final void qk(String str, Exception exception) {
        AnonymousClass2pR.m17342B(this.f46044G, "DashVodBuilderFallback: %s", exception.getMessage());
        this.f46045H.m17398A(this.f46044G, this.f46039B.f46055G, this.f46046I, this.f46040C, this.f46039B.f46058J, this.f46043F);
    }

    public final void qw(AnonymousClass3ty anonymousClass3ty, AnonymousClass3ty anonymousClass3ty2, AnonymousClass3ty anonymousClass3ty3, RendererContext rendererContext, long j, long j2, long j3, long j4, boolean z, AnonymousClass2rQ anonymousClass2rQ) {
        AnonymousClass3tM anonymousClass3tM = this;
        AnonymousClass3ty anonymousClass3ty4 = anonymousClass3ty;
        if (anonymousClass3ty != null) {
            AnonymousClass3ty anonymousClass3ty5 = anonymousClass3ty2;
            if (anonymousClass3ty2 != null) {
                if (anonymousClass3ty3 != null) {
                    try {
                        this.f46040C.m21171A(anonymousClass3ty4, anonymousClass3ty5, new AnonymousClass3tg().m21182A(this.f46039B.f46053E, this.f46044G, this.f46039B.f46055G, this.f46046I, this.f46042E), AnonymousClass1eC.DASH, rendererContext.f33351D, anonymousClass3tM.f46041D instanceof AnonymousClass3sI ? (AnonymousClass3sI) anonymousClass3tM.f46041D : null, j, j2, j3, j4, z);
                    } catch (Exception e) {
                        anonymousClass3tM.f46040C.m21172B("REMOTE", e);
                    }
                    return;
                }
            }
        }
        qk("RENDERERNULL", new IllegalStateException("Renderer is null"));
    }
}
