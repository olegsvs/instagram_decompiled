package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.Collection;
import java.util.Map.Entry;

/* renamed from: X.4QI */
public final class AnonymousClass4QI extends AnonymousClass3F9 implements AnonymousClass0eI, AnonymousClass0Uy {
    /* renamed from: B */
    public final AnonymousClass3yw f53883B;
    /* renamed from: C */
    public final AnonymousClass38H f53884C;
    /* renamed from: D */
    public final AnonymousClass36h f53885D = new AnonymousClass36h();
    /* renamed from: E */
    public final AnonymousClass380 f53886E = new AnonymousClass3yx(this);
    /* renamed from: F */
    public AnonymousClass0eB f53887F;
    /* renamed from: G */
    public String f53888G;
    /* renamed from: H */
    public String f53889H;
    /* renamed from: I */
    public final AnonymousClass0F8 f53890I = new AnonymousClass3FE(this);
    /* renamed from: J */
    public final Handler f53891J = new Handler(Looper.getMainLooper());
    /* renamed from: K */
    public final AnonymousClass0F8 f53892K = new AnonymousClass3FD(this);
    /* renamed from: L */
    private AnonymousClass0eK f53893L;
    /* renamed from: M */
    private final AnonymousClass0Uw f53894M;

    public final void Nk() {
    }

    public final void Ok() {
    }

    public AnonymousClass4QI(AnonymousClass0Uw anonymousClass0Uw, View view, AnonymousClass38H anonymousClass38H, AnonymousClass0eK anonymousClass0eK) {
        super(view, view.getResources().getDimensionPixelSize(C0164R.dimen.superzoomv3_effect_tile_width), (ViewStub) view.findViewById(C0164R.id.superzoomv3_effect_picker_view_stub));
        this.f53884C = anonymousClass38H;
        this.f53894M = anonymousClass0Uw;
        this.f53893L = anonymousClass0eK;
        this.f53894M.A(this);
        this.f53883B = new AnonymousClass3yw(this, view.getContext());
        this.f39405E.setAdapter(this.f53883B);
        this.f39405E.setItemAnimator(null);
    }

    /* renamed from: B */
    private boolean m24168B(AnonymousClass36h anonymousClass36h, int i) {
        AnonymousClass36h F = this.f53884C.m18688F();
        if (F == null || !F.equals(anonymousClass36h)) {
            if (this.f39405E == null || (i >= 0 && i < this.f39405E.getAdapter().B())) {
                AnonymousClass36h anonymousClass36h2 = anonymousClass36h;
                if (anonymousClass36h.equals(this.f53885D)) {
                    anonymousClass36h2 = null;
                }
                AnonymousClass0eB anonymousClass0eB = this.f53887F;
                if (anonymousClass0eB != null) {
                    anonymousClass0eB.Kl(anonymousClass36h2);
                }
                boolean a = this.f53884C.m18709a(anonymousClass36h2, "user_action", this.f53888G);
                if (a && anonymousClass36h2 != null) {
                    anonymousClass0eB = this.f53887F;
                    if (anonymousClass0eB != null) {
                        anonymousClass0eB.mc();
                    }
                }
                this.f53884C.m18683A(this.f53886E);
                if (a) {
                    if (!(anonymousClass36h == null || AnonymousClass0LQ.B(anonymousClass36h, this.f53885D))) {
                        anonymousClass0eB = this.f53887F;
                        if (anonymousClass0eB != null) {
                            anonymousClass0eB.mc();
                        }
                    }
                    return a;
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder("scroll to invalid position: ");
                stringBuilder.append(i);
                AnonymousClass0Gn.H("SuperzoomV3EffectPickerController", stringBuilder.toString());
                return false;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final void mo5624D(int i, float f) {
        super.mo5624D(i, f);
        int i2 = (this.f39406F + (this.f39407G / 2)) / this.f39407G;
        if (!(this.f53883B.f39350H == i2 || this.f53883B.f47796C)) {
            this.f53883B.mo4803R(i2);
        }
        this.f53883B.m21841T(f * 3.0f);
    }

    /* renamed from: E */
    public final void mo5625E() {
        super.mo5625E();
        AnonymousClass3yw anonymousClass3yw = this.f53883B;
        anonymousClass3yw.f47796C = false;
        anonymousClass3yw.m21841T(0.0f);
        int i = this.f53883B.f39350H;
        AnonymousClass36h F = this.f53884C.m18688F();
        AnonymousClass36h S = this.f53883B.m21840S(i);
        if (S != F && S != null) {
            m24168B(S, i);
        }
    }

    /* renamed from: F */
    public final void mo5626F() {
        super.mo5626F();
        for (AnonymousClass3FC anonymousClass3FC : this.f53883B.f47795B) {
            AnonymousClass3FC.m19096B(anonymousClass3FC, anonymousClass3FC.f39415D.isSelected(), true);
        }
    }

    /* renamed from: G */
    public final void mo5627G() {
        super.mo5627G();
        AnonymousClass3yw anonymousClass3yw = this.f53883B;
        anonymousClass3yw.f47796C = false;
        for (AnonymousClass3FC B : anonymousClass3yw.f47795B) {
            AnonymousClass3FC.m19096B(B, true, true);
        }
    }

    /* renamed from: I */
    public final void m24173I() {
        int i = this.f53883B.f39350H;
        if (this.f53883B.m19076Q(i)) {
            AnonymousClass36h S = this.f53883B.m21840S(i);
            if (S != null) {
                AnonymousClass36h F = this.f53884C.m18688F();
                if (F == null || !F.equals(S)) {
                    nc(S, i);
                }
            }
        }
    }

    /* renamed from: J */
    public final void m24174J() {
        if (this.f53889H != null && (this.f53883B.f39347E.isEmpty() ^ 1) != 0) {
            int XL = XL(this.f53889H);
            if (this.f53883B.m19076Q(XL)) {
                nLA(XL, 0);
                this.f53889H = null;
                this.f53888G = null;
            }
        }
    }

    /* renamed from: K */
    public final void m24175K(AnonymousClass36h anonymousClass36h) {
        if (!(anonymousClass36h == null || anonymousClass36h.m18535A().isEmpty())) {
            AnonymousClass0eB anonymousClass0eB = this.f53887F;
            if (anonymousClass0eB == null || anonymousClass0eB.C() == AnonymousClass3DU.SUPERZOOMV3) {
                anonymousClass36h = ((AnonymousClass36i) ((Entry) anonymousClass36h.m18535A().entrySet().iterator().next()).getValue()).f37899C;
                AnonymousClass0eK anonymousClass0eK = this.f53893L;
                TextView textView = anonymousClass0eK.f7697D;
                int i = (textView == null || textView.getVisibility() != 0) ? 0 : 1;
                anonymousClass0eK.B(anonymousClass36h, 2000, i ^ 1);
            }
        }
    }

    /* renamed from: L */
    public final void m24176L() {
        Collection E = this.f53884C.m18687E();
        AnonymousClass0nJ anonymousClass0nJ = this.f53883B;
        anonymousClass0nJ.f39347E.clear();
        anonymousClass0nJ.f39347E.addAll(E);
        anonymousClass0nJ.notifyDataSetChanged();
        AnonymousClass0eB anonymousClass0eB = this.f53887F;
        if (anonymousClass0eB != null && anonymousClass0eB.C() == AnonymousClass3DU.SUPERZOOMV3) {
            m24173I();
        }
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj;
        switch (((AnonymousClass3AM) obj2).ordinal()) {
            case 0:
                AnonymousClass0F4.f2058E.D(AnonymousClass37u.class, this.f53890I).D(AnonymousClass37y.class, this.f53892K);
                this.f53883B.f47795B.clear();
                return;
            case 1:
                AnonymousClass0F4.f2058E.A(AnonymousClass37u.class, this.f53890I).A(AnonymousClass37y.class, this.f53892K);
                AnonymousClass0eB anonymousClass0eB = this.f53887F;
                if (anonymousClass0eB != null && anonymousClass0eB.C() != AnonymousClass3DU.SUPERZOOMV3) {
                    m19088A(false);
                    return;
                }
                return;
            case 4:
                m19088A(true);
                return;
            default:
                return;
        }
    }

    public final int XL(String str) {
        return this.f53883B.m19075P(str);
    }

    public final void nc(AnonymousClass36h anonymousClass36h, int i) {
        m24175K(anonymousClass36h);
        if (this.f39405E.getScrollState() == 0) {
            m24168B(anonymousClass36h, i);
        }
    }
}
