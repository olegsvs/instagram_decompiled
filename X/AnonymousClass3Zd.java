package X;

import android.text.TextUtils;
import java.io.IOException;

/* renamed from: X.3Zd */
public final class AnonymousClass3Zd implements AnonymousClass2FA {
    public final String getName() {
        return "UploadDecorImage";
    }

    /* renamed from: B */
    private boolean m20042B(AnonymousClass2FE anonymousClass2FE) {
        IOException e;
        AnonymousClass0OA anonymousClass0OA = anonymousClass2FE.f27997G;
        AnonymousClass0G4 anonymousClass0G4 = anonymousClass2FE.f28007Q;
        AnonymousClass0aE anonymousClass0aE = null;
        try {
            anonymousClass2FE.f28002L = new AnonymousClass3Zb(this, anonymousClass0OA);
            if (((Boolean) AnonymousClass0CC.Pi.H((AnonymousClass0Cm) anonymousClass0G4.get())).booleanValue()) {
                AnonymousClass3ZF.m20017B(anonymousClass2FE, true);
                anonymousClass0OA.f3821i = true;
                return true;
            }
            AnonymousClass0aC C = AnonymousClass3Ye.m19960C(anonymousClass0G4, anonymousClass0OA, anonymousClass2FE.f28006P, anonymousClass0OA.f3819g, true, null);
            AnonymousClass2FB B = AnonymousClass1PH.B(C, new AnonymousClass3Zc(this));
            anonymousClass0aE = B.f27981C;
            try {
                AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) B.f27982D;
                if (B.f27980B != null) {
                    throw B.f27980B;
                } else if (anonymousClass0Pn.getStatusCode() != 200) {
                    anonymousClass2FE.m14808D("Decor image upload error", anonymousClass0aE, anonymousClass0Pn);
                    return false;
                } else {
                    AnonymousClass1Ql.B((AnonymousClass0Cm) anonymousClass0G4.get(), C.f6469B.f6443C, anonymousClass0Pn, anonymousClass2FE);
                    anonymousClass0OA.f3821i = true;
                    return true;
                }
            } catch (IOException e2) {
                e = e2;
                anonymousClass2FE.m14809E("Decor image upload error", e, anonymousClass0aE);
                return false;
            }
        } catch (IOException e3) {
            e = e3;
            anonymousClass2FE.m14809E("Decor image upload error", e, anonymousClass0aE);
            return false;
        }
    }

    public final AnonymousClass2FC kVA(AnonymousClass2FE anonymousClass2FE) {
        AnonymousClass0OA anonymousClass0OA = anonymousClass2FE.f27997G;
        Object obj = (anonymousClass0OA.s() && anonymousClass0OA.o() && !TextUtils.isEmpty(anonymousClass0OA.f3819g) && !anonymousClass0OA.f3821i && ((Boolean) AnonymousClass0CC.Mg.G()).booleanValue()) ? 1 : null;
        if (obj == null) {
            return AnonymousClass2FC.SKIP;
        }
        if (m20042B(anonymousClass2FE)) {
            return AnonymousClass2FC.SUCCESS;
        }
        return AnonymousClass2FC.FAILURE;
    }
}
