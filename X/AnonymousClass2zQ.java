package X;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2zQ */
public final class AnonymousClass2zQ extends AnonymousClass0Rq implements AnonymousClass1bW, AnonymousClass0Rr {
    /* renamed from: B */
    public final AnonymousClass1ey f36661B;
    /* renamed from: C */
    public final AnonymousClass0Ro f36662C;
    /* renamed from: D */
    private final Context f36663D;
    /* renamed from: E */
    private final AnonymousClass1VC f36664E;
    /* renamed from: F */
    private final AnonymousClass1XL f36665F;
    /* renamed from: G */
    private final AnonymousClass3O1 f36666G;
    /* renamed from: H */
    private final AnonymousClass2Lm f36667H;
    /* renamed from: I */
    private final AnonymousClass1ew f36668I;
    /* renamed from: J */
    private final Map f36669J = new HashMap();

    public final void UOA(int i) {
    }

    public AnonymousClass2zQ(Context context, FragmentActivity fragmentActivity, AnonymousClass1ew anonymousClass1ew, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass1ex anonymousClass1ex, AnonymousClass0EE anonymousClass0EE) {
        Context context2 = context;
        this.f36663D = context;
        this.f36668I = anonymousClass1ew;
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        AnonymousClass1ex anonymousClass1ex2 = anonymousClass1ex;
        this.f36661B = new AnonymousClass1ey(AnonymousClass0nS.GRID, new AnonymousClass0jO(context, anonymousClass0EE2, anonymousClass0Cm), anonymousClass1ex2);
        this.f36666G = new AnonymousClass3O1(context);
        this.f36665F = new AnonymousClass1XL(context2, new AnonymousClass2zO(this, anonymousClass0Cm, fragmentActivity), null, null, anonymousClass0Cm.B(), anonymousClass1ex2, anonymousClass0EE2);
        this.f36667H = new AnonymousClass2Lm(context);
        this.f36662C = anonymousClass0Ro;
        this.f36664E = new AnonymousClass1VC(context);
        D(new AnonymousClass0TB[]{this.f36666G, this.f36665F, this.f36667H, this.f36664E});
    }

    /* renamed from: F */
    public final void m18136F() {
        C();
        this.f36661B.H(this.f36668I);
        if (this.f36661B.M()) {
            AnonymousClass3O2 anonymousClass3O2 = new AnonymousClass3O2();
            anonymousClass3O2.f40707D = this.f36663D.getString(C0164R.string.me_only_privacy_header_text);
            A(anonymousClass3O2, this.f36666G);
            int i = 0;
            while (i < this.f36661B.I()) {
                AnonymousClass2MJ U = this.f36661B.U(i);
                AnonymousClass1Xu LO = LO(U.m15207B());
                boolean z = true;
                if (this.f36662C.QV() || i != this.f36661B.I() - 1) {
                    z = false;
                }
                LO.B(i, z);
                B(U, LO, this.f36665F);
                i++;
            }
            if (this.f36662C.QV()) {
                A(this.f36662C, this.f36667H);
            }
        } else {
            Object obj;
            AnonymousClass2Hx anonymousClass2Hx = new AnonymousClass2Hx();
            if (this.f36662C.UX()) {
                obj = AnonymousClass2I0.ERROR;
                anonymousClass2Hx.f28600F = C0164R.drawable.loadmore_icon_refresh_compound;
                anonymousClass2Hx.f28610P = new AnonymousClass2zP(this);
            } else {
                Resources resources = this.f36663D.getResources();
                obj = AnonymousClass2I0.EMPTY;
                anonymousClass2Hx.f28599E = resources.getColor(C0164R.color.grey_9);
                anonymousClass2Hx.f28600F = C0164R.drawable.empty_state_private;
                anonymousClass2Hx.f28608N = resources.getString(C0164R.string.me_only_feed_empty_title);
                anonymousClass2Hx.f28606L = resources.getString(C0164R.string.me_only_explanation_subtitle);
            }
            B(anonymousClass2Hx, obj, this.f36664E);
        }
        E();
    }

    public final AnonymousClass1Xu LO(String str) {
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) this.f36669J.get(str);
        if (anonymousClass1Xu != null) {
            return anonymousClass1Xu;
        }
        anonymousClass1Xu = new AnonymousClass1Xu();
        this.f36669J.put(str, anonymousClass1Xu);
        return anonymousClass1Xu;
    }
}
