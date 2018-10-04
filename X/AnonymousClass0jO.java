package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0jO */
public final class AnonymousClass0jO extends AnonymousClass0VA {
    /* renamed from: B */
    public final Context f9133B;
    /* renamed from: C */
    public final AnonymousClass0EE f9134C;
    /* renamed from: D */
    public final List f9135D;
    /* renamed from: E */
    public final boolean f9136E;
    /* renamed from: F */
    public final boolean f9137F;
    /* renamed from: G */
    public final AnonymousClass0Cm f9138G;

    public AnonymousClass0jO(Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm) {
        this(context, anonymousClass0EE, anonymousClass0Cm, false);
    }

    public AnonymousClass0jO(Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        this.f9133B = context.getApplicationContext();
        this.f9134C = anonymousClass0EE;
        this.f9138G = anonymousClass0Cm;
        this.f9136E = z;
        this.f9135D = new ArrayList();
        this.f9137F = ((Boolean) AnonymousClass0CC.mM.m846H(this.f9138G)).booleanValue();
    }

    /* renamed from: A */
    public final void m7107A(List list, int i) {
        int min = Math.min(2, list.size());
        for (int i2 = 0; i2 < min; i2++) {
            for (AnonymousClass0P7 anonymousClass0P7 : ((AnonymousClass0mf) list.get(i2)).f9876F) {
                AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.m1908D(anonymousClass0P7.m3794x(this.f9133B));
                D.f4635F = true;
                D.f4640K = anonymousClass0P7.wB;
                D.f4645P = this.f9134C.getModuleName();
                this.f9135D.add(new AnonymousClass0na(new AnonymousClass0nZ(D.m4147A()), i, 0));
            }
        }
    }

    /* renamed from: B */
    public static void m7103B(AnonymousClass0jO anonymousClass0jO) {
        Collections.sort(anonymousClass0jO.f9135D);
        for (AnonymousClass0na run : anonymousClass0jO.f9135D) {
            run.run();
        }
        anonymousClass0jO.f9135D.clear();
    }

    /* renamed from: B */
    public final void m7108B(AnonymousClass0nS anonymousClass0nS, AnonymousClass0P7 anonymousClass0P7, boolean z) {
        AnonymousClass0jO.m7105D(this, anonymousClass0nS, anonymousClass0P7, 0, z, new AnonymousClass0nb(this, anonymousClass0nS));
        AnonymousClass0jO.m7103B(this);
    }

    /* renamed from: C */
    public final void m7109C(AnonymousClass0nS anonymousClass0nS, List list, boolean z) {
        AnonymousClass0jO anonymousClass0jO = this;
        int i = (z && AnonymousClass0MN.m3162F(this.f9133B)) ? 1 : 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) list.get(i2);
            if (anonymousClass0P7.eA()) {
                int i3;
                boolean z2;
                if (AnonymousClass0jO.m7104C(anonymousClass0P7, anonymousClass0jO.f9138G)) {
                    i3 = i - 1;
                    if (i > 0) {
                        z2 = true;
                        AnonymousClass0jO.m7105D(anonymousClass0jO, anonymousClass0nS, anonymousClass0P7, i2, z2, new AnonymousClass0nb(anonymousClass0jO, anonymousClass0nS));
                        i = i3;
                    }
                } else {
                    i3 = i;
                }
                z2 = false;
                AnonymousClass0jO.m7105D(anonymousClass0jO, anonymousClass0nS, anonymousClass0P7, i2, z2, new AnonymousClass0nb(anonymousClass0jO, anonymousClass0nS));
                i = i3;
            }
        }
        AnonymousClass0jO.m7103B(anonymousClass0jO);
    }

    /* renamed from: C */
    public static boolean m7104C(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0Cm anonymousClass0Cm) {
        if (!anonymousClass0P7.wY()) {
            if (!((Boolean) AnonymousClass0CC.EE.m846H(anonymousClass0Cm)).booleanValue() || !anonymousClass0P7.kA() || !anonymousClass0P7.m3763S(anonymousClass0P7.m3779i()).wY()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static void m7105D(AnonymousClass0jO anonymousClass0jO, AnonymousClass0nS anonymousClass0nS, AnonymousClass0P7 anonymousClass0P7, int i, boolean z, AnonymousClass0nc anonymousClass0nc) {
        AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.m1908D(anonymousClass0nc.uM(anonymousClass0P7));
        D.f4645P = anonymousClass0jO.f9134C.getModuleName();
        D.f4635F = true;
        if (anonymousClass0nS == AnonymousClass0nS.FEED) {
            D.f4640K = anonymousClass0P7.wB;
        }
        int i2 = 0;
        anonymousClass0jO.f9135D.add(new AnonymousClass0na(new AnonymousClass0nZ(D.m4147A()), i, 0));
        if (anonymousClass0P7.m3761Q() > 0 && anonymousClass0nS == AnonymousClass0nS.FEED) {
            if (((Boolean) AnonymousClass0CC.FE.m845G()).booleanValue()) {
                i2 = anonymousClass0P7.m3779i();
            }
            for (int i3 = i2; i3 < Math.min(anonymousClass0P7.m3761Q(), i2 + 2); i3++) {
                AnonymousClass0P7 S = anonymousClass0P7.m3763S(i3);
                D = AnonymousClass0Gs.f2431j.m1908D(anonymousClass0nc.uM(S));
                D.f4635F = true;
                D.f4640K = S.wB;
                D.f4645P = anonymousClass0jO.f9134C.getModuleName();
                int i4 = i3 - i2;
                anonymousClass0jO.f9135D.add(new AnonymousClass0na(new AnonymousClass0nZ(D.m4147A()), i, i4));
            }
        }
        if (AnonymousClass0jO.m7104C(anonymousClass0P7, anonymousClass0jO.f9138G) && anonymousClass0nS == AnonymousClass0nS.FEED && z && AnonymousClass0MN.m3162F(anonymousClass0jO.f9133B)) {
            AnonymousClass0vA anonymousClass0vA = new AnonymousClass0vA(AnonymousClass0jO.m7106E(anonymousClass0P7, anonymousClass0jO.f9138G).OA());
            anonymousClass0vA.f11974H = anonymousClass0jO.f9134C.getModuleName();
            AnonymousClass0vB.m8301C(anonymousClass0vA, anonymousClass0jO.f9138G);
        }
    }

    /* renamed from: E */
    private static AnonymousClass0P7 m7106E(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass0P7.wY()) {
            return anonymousClass0P7;
        }
        if (((Boolean) AnonymousClass0CC.EE.m846H(anonymousClass0Cm)).booleanValue() && anonymousClass0P7.kA() && anonymousClass0P7.m3763S(anonymousClass0P7.m3779i()).wY()) {
            return anonymousClass0P7.m3763S(anonymousClass0P7.m3779i());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to get video media that does not have it ");
        stringBuilder.append(anonymousClass0P7.getId());
        throw new RuntimeException(stringBuilder.toString());
    }
}
