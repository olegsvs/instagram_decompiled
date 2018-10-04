package X;

import java.io.IOException;

/* renamed from: X.3ZO */
public final class AnonymousClass3ZO {
    /* renamed from: B */
    public static AnonymousClass2FC m20027B(AnonymousClass2FE anonymousClass2FE) {
        String str;
        IOException e;
        StringBuilder stringBuilder;
        AnonymousClass2FE anonymousClass2FE2 = anonymousClass2FE;
        AnonymousClass0OA anonymousClass0OA = anonymousClass2FE2.f27997G;
        Object obj = anonymousClass0OA.gB == AnonymousClass0ON.PHOTO ? 1 : null;
        AnonymousClass0G4 anonymousClass0G4 = anonymousClass2FE2.f28007Q;
        anonymousClass2FE2.f28002L = new AnonymousClass3ZM(anonymousClass0OA);
        AnonymousClass0aE anonymousClass0aE = null;
        try {
            Boolean bool;
            if (anonymousClass0OA.l()) {
                bool = (Boolean) AnonymousClass0CC.Yi.G();
            } else {
                bool = (Boolean) AnonymousClass0CC.Vi.G();
            }
            if (bool.booleanValue()) {
                str = "fbupload";
                try {
                    AnonymousClass3ZO.m20028C(anonymousClass2FE2, str);
                    AnonymousClass3ZF.m20017B(anonymousClass2FE2, false);
                    anonymousClass0OA.JA(AnonymousClass0OC.UPLOADED);
                    AnonymousClass3ZO.m20030E(anonymousClass2FE2, str);
                    return AnonymousClass2FC.SUCCESS;
                } catch (IOException e2) {
                    e = e2;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(obj == null ? "Cover photo" : "Photo");
                    stringBuilder.append(" upload error");
                    anonymousClass2FE2.m14809E(stringBuilder.toString(), e, anonymousClass0aE);
                    AnonymousClass3ZO.m20029D(anonymousClass2FE2, AnonymousClass0IE.E("%s:%s:%s", new Object[]{str, r0, e.getMessage()}));
                    return AnonymousClass2FC.FAILURE;
                }
            }
            str = "nginx";
            try {
                AnonymousClass3ZO.m20028C(anonymousClass2FE2, str);
                AnonymousClass0aC C = AnonymousClass3Ye.m19960C(anonymousClass0G4, anonymousClass0OA, anonymousClass2FE2.f28006P, anonymousClass0OA.DB, false, anonymousClass2FE2.f28002L);
                AnonymousClass2FB B = AnonymousClass1PH.B(C, new AnonymousClass3ZN());
                anonymousClass0aE = B.f27981C;
                try {
                    AnonymousClass3Yj anonymousClass3Yj = (AnonymousClass3Yj) B.f27982D;
                    if (B.f27980B == null) {
                        AnonymousClass0LH.E(anonymousClass3Yj);
                        AnonymousClass1Ql.B((AnonymousClass0Cm) anonymousClass0G4.get(), C.f6469B.f6443C, anonymousClass3Yj, anonymousClass2FE2);
                        if (anonymousClass3Yj.getStatusCode() == 200) {
                            anonymousClass0OA.JA(AnonymousClass0OC.UPLOADED);
                            anonymousClass0OA.b().f16859C = anonymousClass3Yj.f42247B;
                            AnonymousClass3ZO.m20030E(anonymousClass2FE2, str);
                            return AnonymousClass2FC.SUCCESS;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(obj != null ? "Photo" : "Cover photo");
                        stringBuilder.append(" upload error");
                        AnonymousClass3ZO.m20029D(anonymousClass2FE2, AnonymousClass0IE.E("%s:%s:%s", new Object[]{str, stringBuilder.toString(), Integer.valueOf(anonymousClass0aE.f6477E)}));
                        anonymousClass2FE2.m14808D(r8, anonymousClass0aE, anonymousClass3Yj);
                        return AnonymousClass2FC.FAILURE;
                    }
                    throw B.f27980B;
                } catch (IOException e3) {
                    e = e3;
                    stringBuilder = new StringBuilder();
                    if (obj == null) {
                    }
                    stringBuilder.append(obj == null ? "Cover photo" : "Photo");
                    stringBuilder.append(" upload error");
                    anonymousClass2FE2.m14809E(stringBuilder.toString(), e, anonymousClass0aE);
                    AnonymousClass3ZO.m20029D(anonymousClass2FE2, AnonymousClass0IE.E("%s:%s:%s", new Object[]{str, r0, e.getMessage()}));
                    return AnonymousClass2FC.FAILURE;
                }
            } catch (IOException e4) {
                e = e4;
                stringBuilder = new StringBuilder();
                if (obj == null) {
                }
                stringBuilder.append(obj == null ? "Cover photo" : "Photo");
                stringBuilder.append(" upload error");
                anonymousClass2FE2.m14809E(stringBuilder.toString(), e, anonymousClass0aE);
                AnonymousClass3ZO.m20029D(anonymousClass2FE2, AnonymousClass0IE.E("%s:%s:%s", new Object[]{str, r0, e.getMessage()}));
                return AnonymousClass2FC.FAILURE;
            }
        } catch (IOException e5) {
            e = e5;
            str = anonymousClass0aE;
            stringBuilder = new StringBuilder();
            if (obj == null) {
            }
            stringBuilder.append(obj == null ? "Cover photo" : "Photo");
            stringBuilder.append(" upload error");
            anonymousClass2FE2.m14809E(stringBuilder.toString(), e, anonymousClass0aE);
            AnonymousClass3ZO.m20029D(anonymousClass2FE2, AnonymousClass0IE.E("%s:%s:%s", new Object[]{str, r0, e.getMessage()}));
            return AnonymousClass2FC.FAILURE;
        }
    }

    /* renamed from: C */
    private static void m20028C(AnonymousClass2FE anonymousClass2FE, String str) {
        AnonymousClass2bI anonymousClass2bI = anonymousClass2FE.f28001K;
        if ((anonymousClass2FE.f27997G.gB == AnonymousClass0ON.PHOTO ? 1 : null) != null) {
            AnonymousClass0O4.M(anonymousClass2bI.f31392B, anonymousClass2bI.f31393C, "upload_photo_attempt", str);
        } else {
            AnonymousClass0O4.M(anonymousClass2bI.f31392B, anonymousClass2bI.f31393C, "upload_cover_photo_attempt", str);
        }
    }

    /* renamed from: D */
    private static void m20029D(AnonymousClass2FE anonymousClass2FE, String str) {
        AnonymousClass2bI anonymousClass2bI = anonymousClass2FE.f28001K;
        if ((anonymousClass2FE.f27997G.gB == AnonymousClass0ON.PHOTO ? 1 : null) != null) {
            AnonymousClass0O4.M(anonymousClass2bI.f31392B, anonymousClass2bI.f31393C, "upload_photo_failure", str);
        } else {
            AnonymousClass0O4.M(anonymousClass2bI.f31392B, anonymousClass2bI.f31393C, "upload_cover_photo_failure", str);
        }
    }

    /* renamed from: E */
    private static void m20030E(AnonymousClass2FE anonymousClass2FE, String str) {
        AnonymousClass2bI anonymousClass2bI = anonymousClass2FE.f28001K;
        if ((anonymousClass2FE.f27997G.gB == AnonymousClass0ON.PHOTO ? 1 : null) != null) {
            AnonymousClass0O4.M(anonymousClass2bI.f31392B, anonymousClass2bI.f31393C, "upload_photo_success", str);
        } else {
            AnonymousClass0O4.M(anonymousClass2bI.f31392B, anonymousClass2bI.f31393C, "upload_cover_photo_success", str);
        }
    }
}
