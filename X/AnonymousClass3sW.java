package X;

import com.facebook.exoplayer.ipc.RendererContext;
import java.io.IOException;

/* renamed from: X.3sW */
public final class AnonymousClass3sW implements AnonymousClass2tp {
    /* renamed from: B */
    public final AnonymousClass2lI f45815B;
    /* renamed from: C */
    public final AnonymousClass2le f45816C;
    /* renamed from: D */
    public final AnonymousClass1Dy f45817D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass2lS f45818E;

    public AnonymousClass3sW(AnonymousClass2lS anonymousClass2lS, AnonymousClass2le anonymousClass2le, AnonymousClass2lI anonymousClass2lI, AnonymousClass1Dy anonymousClass1Dy) {
        this.f45818E = anonymousClass2lS;
        this.f45816C = anonymousClass2le;
        this.f45815B = anonymousClass2lI;
        this.f45817D = anonymousClass1Dy;
    }

    public final /* bridge */ /* synthetic */ void NAA(Object obj) {
        AnonymousClass3ty anonymousClass43b;
        AnonymousClass3ty anonymousClass43b2;
        AnonymousClass3ty anonymousClass45N;
        int size;
        AnonymousClass3uC anonymousClass3uC = (AnonymousClass3uC) obj;
        AnonymousClass2rl anonymousClass2rl = null;
        AnonymousClass2rl anonymousClass2rl2 = null;
        for (AnonymousClass2rl anonymousClass2rl3 : anonymousClass3uC.m21306A(0).f35143B) {
            StringBuilder stringBuilder;
            switch (anonymousClass2rl3.f35135E) {
                case 0:
                    if (anonymousClass2rl == null) {
                        anonymousClass2rl = anonymousClass2rl3;
                    }
                    for (AnonymousClass3uE anonymousClass3uE : anonymousClass2rl3.f35134D) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Add video representation ");
                        stringBuilder.append(anonymousClass3uE.f46394D.f35070S);
                        stringBuilder.toString();
                    }
                    break;
                case 1:
                    for (AnonymousClass3uE anonymousClass3uE2 : anonymousClass2rl3.f35134D) {
                        if (anonymousClass2rl2 == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Audio representation ");
                            stringBuilder.append(anonymousClass3uE2.f46394D.f35070S);
                            stringBuilder.toString();
                            anonymousClass2rl2 = anonymousClass3uE2;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        if (this.f45817D == AnonymousClass1Dy.AUDIO_ONLY) {
            anonymousClass43b = new AnonymousClass43b();
        } else {
            AnonymousClass2lS anonymousClass2lS = r4.f45818E;
            anonymousClass43b = AnonymousClass2lS.m17100C(anonymousClass2lS, anonymousClass3uC, r4.f45815B, anonymousClass2lS.f33600O);
        }
        if (r4.f45817D == AnonymousClass1Dy.VIDEO_ONLY) {
            anonymousClass43b2 = new AnonymousClass43b();
        } else {
            anonymousClass43b2 = AnonymousClass2lS.m17099B(r4.f45818E, anonymousClass3uC);
        }
        if (r4.f45818E.f33605T != null) {
            if (AnonymousClass2lS.m17101D(r4.f45818E, anonymousClass2rl)) {
                AnonymousClass2lS anonymousClass2lS2 = r4.f45818E;
                anonymousClass45N = new AnonymousClass45N(anonymousClass2lS2.f33605T, anonymousClass2lS2.f33603R, anonymousClass2lS2.f33596K.getLooper());
                size = anonymousClass2rl == null ? anonymousClass2rl.f35134D.size() : 0;
                r4.f45816C.qw(anonymousClass43b, anonymousClass43b2, anonymousClass45N, new RendererContext(AnonymousClass1eC.DASH_LIVE.toString(), 0, size, AnonymousClass2lS.getDashVideoStreams(anonymousClass2rl, r4.f45818E.f33594I)), anonymousClass3uC.f46379P, anonymousClass3uC.f46371H, anonymousClass3uC.f46367D, anonymousClass3uC.f46373J, anonymousClass3uC.f46370G, r4.f45818E.f33595J);
            }
        }
        anonymousClass45N = new AnonymousClass43b();
        if (anonymousClass2rl == null) {
        }
        r4.f45816C.qw(anonymousClass43b, anonymousClass43b2, anonymousClass45N, new RendererContext(AnonymousClass1eC.DASH_LIVE.toString(), 0, size, AnonymousClass2lS.getDashVideoStreams(anonymousClass2rl, r4.f45818E.f33594I)), anonymousClass3uC.f46379P, anonymousClass3uC.f46371H, anonymousClass3uC.f46367D, anonymousClass3uC.f46373J, anonymousClass3uC.f46370G, r4.f45818E.f33595J);
    }

    public final void OAA(IOException iOException) {
        if (AnonymousClass2kf.m17030C(iOException) == 410) {
            this.f45816C.qk("DISMISS", iOException);
        } else {
            this.f45816C.qk("ERROR_IO", iOException);
        }
    }
}
