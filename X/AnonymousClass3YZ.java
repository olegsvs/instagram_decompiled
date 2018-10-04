package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.3YZ */
public final class AnonymousClass3YZ {
    /* renamed from: B */
    private final Context f42225B;
    /* renamed from: C */
    private final AnonymousClass0O4 f42226C;

    public AnonymousClass3YZ(Context context, AnonymousClass0O4 anonymousClass0O4) {
        this.f42225B = context;
        this.f42226C = anonymousClass0O4;
    }

    /* renamed from: A */
    public final void m19953A(AnonymousClass0OA anonymousClass0OA) {
        if (!anonymousClass0OA.s()) {
            if (!AnonymousClass0HV.C().f2646B.getBoolean("render_gallery", true)) {
                this.f42226C.C(anonymousClass0OA, "Gallery render disabled");
            } else if (!AnonymousClass1Ba.D(this.f42225B, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                this.f42226C.C(anonymousClass0OA, "Missing WRITE_EXTERNAL_STORAGE permission");
            }
        }
    }

    /* renamed from: B */
    public final void m19954B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA, AnonymousClass0P7 anonymousClass0P7, boolean z) {
        if (anonymousClass0OA.s()) {
            Context context;
            File P;
            String str;
            if (!AnonymousClass3YZ.m19952B(this.f42225B, anonymousClass0OA)) {
                String str2 = "video/x-matroska";
                if (anonymousClass0OA.OC.endsWith("mp4")) {
                    str2 = "video/mp4";
                }
                AnonymousClass3Zp.m20052B(this.f42225B, anonymousClass0OA.OC, str2);
            }
            Object obj = 1;
            Object obj2 = (anonymousClass0OA.o() && !TextUtils.isEmpty(anonymousClass0OA.f3819g) && ((Boolean) AnonymousClass0CC.Mg.G()).booleanValue()) ? 1 : null;
            if (anonymousClass0P7 != null) {
                if (AnonymousClass0MN.C()) {
                    anonymousClass0P7.oB = anonymousClass0OA.OC;
                }
                if (obj2 != null) {
                    anonymousClass0P7.nB = anonymousClass0OA.f3819g;
                }
            }
            if (AnonymousClass2Ml.m15242B(anonymousClass0OA)) {
                if (obj2 == null) {
                    if (anonymousClass0OA.f3791E) {
                    }
                }
                if (obj != null) {
                    AnonymousClass3Z3.m20000B(this.f42225B, anonymousClass0Cm, anonymousClass0OA);
                }
                context = this.f42225B;
                P = AnonymousClass2NO.m15335P(context);
                str = anonymousClass0OA.bC.f17222S;
                if (P.equals(new File(str).getParentFile())) {
                    AnonymousClass1Ag.C(str);
                }
                if (anonymousClass0OA.i()) {
                    for (AnonymousClass2Fb anonymousClass2Fb : anonymousClass0OA.MC) {
                        AnonymousClass1Ag.C(anonymousClass2Fb.f28068B);
                    }
                }
                if (z && anonymousClass0OA.OC != null && AnonymousClass3YZ.m19952B(context, anonymousClass0OA)) {
                    AnonymousClass1Ag.C(anonymousClass0OA.OC);
                }
                return;
            }
            obj = null;
            if (obj != null) {
                AnonymousClass3Z3.m20000B(this.f42225B, anonymousClass0Cm, anonymousClass0OA);
            }
            context = this.f42225B;
            P = AnonymousClass2NO.m15335P(context);
            str = anonymousClass0OA.bC.f17222S;
            if (P.equals(new File(str).getParentFile())) {
                AnonymousClass1Ag.C(str);
            }
            if (anonymousClass0OA.i()) {
                while (r1.hasNext()) {
                    AnonymousClass1Ag.C(anonymousClass2Fb.f28068B);
                }
            }
            AnonymousClass1Ag.C(anonymousClass0OA.OC);
            return;
        }
        if (AnonymousClass2Ml.m15242B(anonymousClass0OA) && anonymousClass0OA.f3791E && !anonymousClass0OA.f3838z) {
            Context context2 = this.f42225B;
            try {
                File file = (File) AnonymousClass1RC.B(context2, anonymousClass0OA, true, "ConfigureTool").call();
                if (file != null && file.exists()) {
                    AnonymousClass1RC.G(context2, file);
                }
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("id: ");
                stringBuilder.append(anonymousClass0OA.getId());
                AnonymousClass0Gn.E("ConfigureTool#savePhotoToGallery", stringBuilder.toString(), e);
            }
        }
        if (z) {
            AnonymousClass1Ag.C(anonymousClass0OA.DB);
        } else if (anonymousClass0P7 == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("id: ");
            stringBuilder.append(anonymousClass0OA.getId());
            AnonymousClass0Gn.C("ConfigureTool media is null", stringBuilder.toString());
        } else {
            anonymousClass0P7.mB = Uri.fromFile(new File(anonymousClass0OA.DB));
        }
        if (!AnonymousClass0HV.C().W()) {
            new File(new File(AnonymousClass0G1.f2295C), "temp.jpg").delete();
        }
    }

    /* renamed from: B */
    public static boolean m19952B(Context context, AnonymousClass0OA anonymousClass0OA) {
        return new File(anonymousClass0OA.OC).getParentFile().equals(AnonymousClass2NO.m15334O(context));
    }
}
