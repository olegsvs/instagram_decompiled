package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5tG */
public final class AnonymousClass5tG extends AnonymousClass0Rq {
    /* renamed from: B */
    public String f69659B;
    /* renamed from: C */
    public AnonymousClass0MI f69660C;
    /* renamed from: D */
    public AnonymousClass0Pj f69661D;
    /* renamed from: E */
    public final List f69662E = new ArrayList();
    /* renamed from: F */
    private final AnonymousClass0qL f69663F;
    /* renamed from: G */
    private final boolean f69664G;
    /* renamed from: H */
    private final AnonymousClass2Lm f69665H;
    /* renamed from: I */
    private final AnonymousClass0Ro f69666I;
    /* renamed from: J */
    private final AnonymousClass0Tj f69667J;
    /* renamed from: K */
    private final AnonymousClass5uM f69668K;

    public AnonymousClass5tG(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass5uW anonymousClass5uW) {
        this.f69668K = new AnonymousClass5uM(context, anonymousClass0Cm, anonymousClass5uW);
        this.f69665H = new AnonymousClass2Lm(context);
        this.f69663F = new AnonymousClass0qL(context);
        this.f69666I = anonymousClass0Ro;
        this.f69664G = AnonymousClass0J0.D(anonymousClass0Cm);
        this.f69667J = AnonymousClass0Tj.B(anonymousClass0Cm);
        this.f69663F.f10915C = context.getResources().getDimensionPixelSize(C0164R.dimen.reel_dashboard_viewer_row_padding);
        D(new AnonymousClass0TB[]{this.f69668K, this.f69665H, this.f69663F});
    }

    /* renamed from: B */
    public static void m28590B(AnonymousClass5tG anonymousClass5tG) {
        anonymousClass5tG.C();
        anonymousClass5tG.A(null, anonymousClass5tG.f69663F);
        for (AnonymousClass1Ih anonymousClass1Ih : anonymousClass5tG.f69662E) {
            AnonymousClass0MI anonymousClass0MI = anonymousClass5tG.f69660C;
            AnonymousClass0Pj anonymousClass0Pj = anonymousClass5tG.f69661D;
            AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Ih.f16899B;
            boolean z = anonymousClass5tG.f69664G && AnonymousClass1Pw.L(anonymousClass5tG.f69667J, anonymousClass1Ih.f16899B);
            AnonymousClass1Zo anonymousClass1Zo = new AnonymousClass1Zo(anonymousClass0MI, anonymousClass0Pj, anonymousClass0Ci, z);
            anonymousClass1Zo.f20270E = Integer.valueOf(anonymousClass1Ih.f16900C);
            anonymousClass1Zo.f20269D = anonymousClass5tG.f69659B;
            anonymousClass5tG.A(anonymousClass1Zo, anonymousClass5tG.f69668K);
        }
        AnonymousClass0Ro anonymousClass0Ro = anonymousClass5tG.f69666I;
        if (anonymousClass0Ro != null && anonymousClass0Ro.QV()) {
            anonymousClass5tG.A(anonymousClass5tG.f69666I, anonymousClass5tG.f69665H);
        }
        anonymousClass5tG.A(null, anonymousClass5tG.f69663F);
        anonymousClass5tG.E();
    }
}
