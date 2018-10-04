package X;

import java.io.IOException;

/* renamed from: X.41C */
public final class AnonymousClass41C implements AnonymousClass3ZD {
    /* renamed from: C */
    private static final Class f48414C = AnonymousClass41C.class;
    /* renamed from: B */
    private final AnonymousClass2FE f48415B;

    public AnonymousClass41C(AnonymousClass2FE anonymousClass2FE) {
        this.f48415B = anonymousClass2FE;
    }

    public final void jo(AnonymousClass3ZE anonymousClass3ZE, String str) {
        AnonymousClass0Dc.B(f48414C, str);
        this.f48415B.f27997G.JA(AnonymousClass0OC.NOT_UPLOADED);
        this.f48415B.m14807C(AnonymousClass18W.MAY_RETRY_CLIENT_ERROR, str);
    }

    public final void kr(AnonymousClass3ZE anonymousClass3ZE, Exception exception) {
        anonymousClass3ZE = this.f48415B.f27997G;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fbuploader error:");
        stringBuilder.append(exception.getMessage());
        String stringBuilder2 = stringBuilder.toString();
        if (AnonymousClass3ZC.m20010B(exception)) {
            this.f48415B.m14807C(AnonymousClass18W.MAY_RETRY_CLIENT_ERROR, stringBuilder2);
        } else {
            this.f48415B.m14809E("fbuploader error", new IOException(exception.getMessage(), exception.getCause()), null);
        }
        anonymousClass3ZE.JA(AnonymousClass0OC.NOT_UPLOADED);
    }

    public final void lr(AnonymousClass3ZE anonymousClass3ZE, AnonymousClass2bJ anonymousClass2bJ, AnonymousClass1uP anonymousClass1uP, long j) {
        AnonymousClass0OA anonymousClass0OA = this.f48415B.f27997G;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Time to upload using fbuploader");
        double d = (double) j;
        Double.isNaN(d);
        stringBuilder.append(d / 1000.0d);
        stringBuilder.append("s");
        stringBuilder.toString();
        this.f48415B.m14814J();
        anonymousClass0OA.BD = anonymousClass1uP.f23975C;
        anonymousClass0OA.JA(AnonymousClass0OC.UPLOADED_VIDEO);
        anonymousClass0OA.b().f16859C = anonymousClass1uP.f23976D;
        this.f48415B.m14813I();
    }
}
