package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.0Uk */
public final class AnonymousClass0Uk implements AnonymousClass0G2 {
    /* renamed from: B */
    public final Context f5547B = AnonymousClass0EV.f1977B;
    /* renamed from: C */
    public final ArrayList f5548C = new ArrayList();
    /* renamed from: D */
    public final AnonymousClass0F8 f5549D = new AnonymousClass0W5(this);
    /* renamed from: E */
    public final AnonymousClass0Cm f5550E;
    /* renamed from: F */
    public AnonymousClass0Qm f5551F;

    private AnonymousClass0Uk(AnonymousClass0Cm anonymousClass0Cm) {
        this.f5550E = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final boolean m4763A(String str) {
        int size = this.f5548C.size();
        for (int i = 0; i < size; i++) {
            if (!((AnonymousClass0Un) this.f5548C.get(i)).ITA(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0Uk m4759B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Uk anonymousClass0Uk;
        Class cls = AnonymousClass0Uk.class;
        synchronized (cls) {
            anonymousClass0Uk = (AnonymousClass0Uk) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0Uk == null) {
                anonymousClass0Uk = new AnonymousClass0Uk(anonymousClass0Cm);
                anonymousClass0Cm.m1039D(cls, anonymousClass0Uk);
            }
        }
        return anonymousClass0Uk;
    }

    /* renamed from: C */
    public static void m4760C(AnonymousClass0Uk anonymousClass0Uk, AnonymousClass0Vw anonymousClass0Vw, AnonymousClass0W7 anonymousClass0W7) {
        boolean booleanValue = ((Boolean) AnonymousClass0CC.Hj.m846H(anonymousClass0Uk.f5550E)).booleanValue();
        if (booleanValue || !AnonymousClass0EF.m1358I(anonymousClass0Uk.f5547B)) {
            Object obj;
            if (booleanValue) {
                Context context = anonymousClass0Uk.f5547B;
                AnonymousClass0Cm anonymousClass0Cm = anonymousClass0Uk.f5550E;
                if (!AnonymousClass4h4.C(context, anonymousClass0Cm, anonymousClass0Cm.f1759C)) {
                    obj = null;
                    if (obj != null && ((Boolean) AnonymousClass0CC.Nj.m846H(anonymousClass0Uk.f5550E)).booleanValue()) {
                        AnonymousClass0Ci M = anonymousClass0W7.m5011M();
                        AnonymousClass0W8 anonymousClass0W8 = (AnonymousClass0W8) anonymousClass0W7.f5876F;
                        if (anonymousClass0W8.f5923B == AnonymousClass0W9.VIDEO_CALL_STARTED && !anonymousClass0Vw.m4966l() && !anonymousClass0Vw.m4962h() && ((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.Lj)).booleanValue()) {
                            AnonymousClass0Sy.m4437F(new AnonymousClass4h1(anonymousClass0Uk, M, anonymousClass0W8, anonymousClass0Vw));
                        }
                        return;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
            }
        }
    }

    /* renamed from: D */
    public static void m4761D(AnonymousClass0Uk anonymousClass0Uk, AnonymousClass0W6 anonymousClass0W6) {
        AnonymousClass0Uk anonymousClass0Uk2 = anonymousClass0Uk;
        if (((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.va, anonymousClass0Uk2.f5550E)).booleanValue()) {
            Long l;
            AnonymousClass0Tw C = AnonymousClass0Tw.m4598C(anonymousClass0Uk2.f5550E);
            AnonymousClass0W6 anonymousClass0W62 = anonymousClass0W6;
            String str = anonymousClass0W62.f5868D.f5871C;
            synchronized (C) {
                l = C.f5293M;
            }
            if (l != null && str != null && anonymousClass0W62.f5866B != null) {
                AnonymousClass0Vw c = C.m4631c(str);
                if (c != null && !c.m4960f()) {
                    String U = c.m4949U();
                    boolean A = anonymousClass0Uk2.m4763A(str);
                    Object obj = (U == null || !AnonymousClass0Uk.m4762E(anonymousClass0Uk2, U)) ? null : 1;
                    if (A || obj != null) {
                        for (AnonymousClass0W7 anonymousClass0W7 : anonymousClass0W62.f5866B) {
                            long K = anonymousClass0W7.m5009K();
                            if (!anonymousClass0W7.m5017S(anonymousClass0Uk2.f5550E.m1037B()) && K > l.longValue() * 1000) {
                                AnonymousClass0V0 anonymousClass0V0 = anonymousClass0W7.f5915s;
                                AnonymousClass0V0 anonymousClass0V02 = AnonymousClass0V0.VIDEO_CALL_EVENT;
                                if ((anonymousClass0V0 == anonymousClass0V02 ? 1 : null) != null) {
                                    if (obj != null) {
                                        AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass4h0(anonymousClass0Uk2, c, anonymousClass0W7), 348793708);
                                    }
                                } else if (A) {
                                    Resources resources = anonymousClass0Uk2.f5547B.getResources();
                                    boolean z = true;
                                    if (c.m4938J().size() <= 1) {
                                        z = false;
                                    }
                                    anonymousClass0W6 = AnonymousClass0WB.m5042B(z, anonymousClass0Uk2.f5550E, anonymousClass0W7, resources);
                                    String str2 = null;
                                    String w = anonymousClass0W7.f5915s == AnonymousClass0V0.MEDIA_SHARE ? anonymousClass0W7.m5005G().m3793w(resources.getDimensionPixelOffset(C0164R.dimen.avatar_size_xsmall)) : anonymousClass0W7.f5915s == AnonymousClass0V0.MEDIA ? ((AnonymousClass0P7) anonymousClass0W7.f5876F).m3793w(resources.getDimensionPixelOffset(C0164R.dimen.avatar_size_xsmall)) : null;
                                    if (AnonymousClass0WC.m5046D(anonymousClass0W7)) {
                                        Context context = anonymousClass0Uk2.f5547B;
                                        AnonymousClass0Cm anonymousClass0Cm = anonymousClass0Uk2.f5550E;
                                        String O = c.m4943O();
                                        String str3 = anonymousClass0W7.f5915s == anonymousClass0V02 ? "video_call_received" : "message_recieved";
                                        String U2 = c.m4949U();
                                        str = anonymousClass0W7.f5885O;
                                        if (anonymousClass0W7.m5011M() != null) {
                                            str2 = anonymousClass0W7.m5011M().DQ();
                                        }
                                        AnonymousClass0WC.m5045C(context, anonymousClass0Cm, O, str3, U2, str, str2, w, c.m4947S(), c.m4962h(), AnonymousClass0V0.EXPIRING_MEDIA.equals(anonymousClass0W7.f5915s), anonymousClass0W6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E */
    private static boolean m4762E(AnonymousClass0Uk anonymousClass0Uk, String str) {
        if (!AnonymousClass0Fj.f2192B.m1668C()) {
            int size = anonymousClass0Uk.f5548C.size();
            int i = 0;
            while (i < size) {
                if (((AnonymousClass0Un) anonymousClass0Uk.f5548C.get(i)).HTA(str)) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0W6.class, this.f5549D);
    }
}
