package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Collections;

/* renamed from: X.4LS */
public final class AnonymousClass4LS extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4LU f53034B;

    public AnonymousClass4LS(AnonymousClass4LU anonymousClass4LU) {
        this.f53034B = anonymousClass4LU;
    }

    public final boolean yCA(View view) {
        AnonymousClass0dF anonymousClass0dF = this.f53034B.f53036B;
        DirectShareTarget directShareTarget = this.f53034B.f53037C.f27809D;
        if (!anonymousClass0dF.f7374N.R()) {
            AnonymousClass4LZ anonymousClass4LZ = anonymousClass0dF.f7373M;
            if (anonymousClass4LZ != null) {
                anonymousClass4LZ.f53047B.f54567I.f53580G = Boolean.valueOf(AnonymousClass4LZ.m23950D(anonymousClass4LZ));
            }
            switch (anonymousClass0dF.f7370J.m24339B().ordinal()) {
                case 0:
                    AnonymousClass5TB.H(anonymousClass0dF.f7392f, Collections.singletonList(directShareTarget), AnonymousClass0Um.NONE, false, AnonymousClass3Fe.POSTED_FROM_REPLY_CAMERA, null);
                    break;
                case 1:
                    AnonymousClass5TY.F(anonymousClass0dF.f7408v, Collections.singletonList(directShareTarget), AnonymousClass0Um.NONE, false, AnonymousClass3Fe.POSTED_FROM_REPLY_CAMERA, null);
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown media type");
            }
            AnonymousClass5bK anonymousClass5bK = anonymousClass0dF.f7374N;
            if (anonymousClass5bK.f66842I != null && anonymousClass5bK.f66850Q) {
                AnonymousClass0Cm anonymousClass0Cm = anonymousClass5bK.f66868i;
                String C = directShareTarget.C();
                AnonymousClass4LO anonymousClass4LO = anonymousClass5bK.f66842I.f53015B;
                if (C != null) {
                    AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm);
                    D.f2646B.edit().putString(AnonymousClass0HV.G(C), anonymousClass4LO.f53014H).apply();
                }
            }
            AnonymousClass0dF.U(anonymousClass0dF);
        }
        return true;
    }
}
