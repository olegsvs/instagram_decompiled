package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.List;

/* renamed from: X.15f */
public final class AnonymousClass15f {
    /* renamed from: B */
    public static void m9329B(AnonymousClass15M anonymousClass15M, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass0QE anonymousClass0QE, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Pj anonymousClass0Pj2 = anonymousClass0Pj;
        List N = anonymousClass0Pj.m3864N(AnonymousClass15c.SLIDER);
        if (N != null) {
            if (!N.isEmpty()) {
                if (anonymousClass15M.f14267C == null) {
                    View inflate = anonymousClass15M.f14273I.inflate();
                    anonymousClass15M.f14267C = inflate;
                    anonymousClass15M.f14270F = (TouchInterceptorFrameLayout) inflate.findViewById(C0164R.id.slider_sticker_container);
                    anonymousClass15M.f14272H = (ImageView) anonymousClass15M.f14267C.findViewById(C0164R.id.slider_sticker);
                    anonymousClass15M.f14269E = anonymousClass15M.f14267C.findViewById(C0164R.id.slider_particle_system);
                }
                anonymousClass15M.f14267C.setVisibility(0);
                AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
                AnonymousClass0el B = AnonymousClass0f4.m6484B(anonymousClass0Cm);
                boolean z = false;
                AnonymousClass0ZF anonymousClass0ZF = (AnonymousClass0ZF) N.get(0);
                AnonymousClass196 anonymousClass196 = anonymousClass0ZF.f6312T;
                AnonymousClass1LB anonymousClass1LB = B.m6410A(anonymousClass196.f15068E) ? B.m6491Q(anonymousClass196).f28303D : anonymousClass196.m9648C() ? new AnonymousClass1LB(anonymousClass196.f15071H, anonymousClass0Cm.m1037B()) : null;
                AnonymousClass2Gd anonymousClass2Gd = new AnonymousClass2Gd(anonymousClass15M.f14266B);
                anonymousClass15M.f14271G = anonymousClass2Gd;
                if (!(!anonymousClass196.f15066C || anonymousClass196.m9648C() || B.m6410A(anonymousClass196.f15068E))) {
                    z = true;
                }
                anonymousClass2Gd.f28376E.f28316H = z;
                anonymousClass2Gd = anonymousClass15M.f14271G;
                anonymousClass2Gd.f28373B = AnonymousClass5BT.C(anonymousClass15M.f14266B, anonymousClass0Pj);
                anonymousClass2Gd.invalidateSelf();
                AnonymousClass2Gd anonymousClass2Gd2 = anonymousClass15M.f14271G;
                anonymousClass2Gd2.f28378G = anonymousClass1LB;
                AnonymousClass2Gd.B(anonymousClass2Gd2);
                anonymousClass2Gd2 = anonymousClass15M.f14271G;
                anonymousClass2Gd2.f28377F = anonymousClass196;
                AnonymousClass2Gd.B(anonymousClass2Gd2);
                anonymousClass15M.f14271G.f28376E.f28319K = new AnonymousClass5Cv(anonymousClass0QE, anonymousClass0Pj2, anonymousClass196, anonymousClass0Cm2, anonymousClass15M);
                anonymousClass15M.f14272H.setImageDrawable(anonymousClass15M.f14271G);
                anonymousClass15M.f14272H.requestLayout();
                AnonymousClass0Nm.m3441T(anonymousClass15M.f14272H, new AnonymousClass1ZS(anonymousClass15M, anonymousClass0Pj, anonymousClass0ZF));
                anonymousClass15M.f14270F.m6301B(anonymousClass15M, anonymousClass15M.f14271G);
                AnonymousClass2Ga anonymousClass2Ga = new AnonymousClass2Ga(anonymousClass15M.f14266B);
                anonymousClass15M.f14268D = anonymousClass2Ga;
                anonymousClass2Ga.f28354C = anonymousClass196.f15067D;
                anonymousClass15M.f14269E.setBackground(anonymousClass15M.f14268D);
                return;
            }
        }
        anonymousClass15M.m9304A();
    }
}
