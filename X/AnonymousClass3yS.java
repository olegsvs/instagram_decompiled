package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: X.3yS */
public final class AnonymousClass3yS extends AnonymousClass0VA implements OnKeyListener {
    /* renamed from: B */
    public final Handler f47635B = new AnonymousClass39b(this, Looper.getMainLooper());
    /* renamed from: C */
    public AnonymousClass0rr f47636C;
    /* renamed from: D */
    public AnonymousClass38n f47637D;
    /* renamed from: E */
    public boolean f47638E;
    /* renamed from: F */
    public AnonymousClass39f f47639F;
    /* renamed from: G */
    private final Rect f47640G = new Rect();
    /* renamed from: H */
    private String f47641H;
    /* renamed from: I */
    private final AnonymousClass0Gv f47642I = new AnonymousClass39c(this);
    /* renamed from: J */
    private RecyclerView f47643J;

    public AnonymousClass3yS(Context context, AnonymousClass38n anonymousClass38n, RecyclerView recyclerView, AnonymousClass0Cm anonymousClass0Cm, String str) {
        this.f47637D = anonymousClass38n;
        this.f47639F = new AnonymousClass39f(context, anonymousClass0Cm);
        this.f47639F.f38441E = this;
        this.f47636C = (AnonymousClass0rr) recyclerView.getLayoutManager();
        this.f47643J = recyclerView;
        this.f47641H = str;
    }

    /* renamed from: A */
    public final boolean m21798A() {
        if (this.f47638E && ((this.f47639F.m18784B() == AnonymousClass0uw.IDLE || this.f47639F.m18784B() == AnonymousClass0uw.PAUSED) && this.f47643J != null)) {
            for (int aA = this.f47636C.aA(); aA <= this.f47636C.cA(); aA++) {
                if (this.f47636C.aA() != -1) {
                    AnonymousClass3yE Q = this.f47637D.m18744Q(aA);
                    AnonymousClass38m R = this.f47637D.m18745R(Q);
                    if (Q instanceof AnonymousClass45p) {
                        AnonymousClass45p anonymousClass45p = (AnonymousClass45p) Q;
                        AnonymousClass3AB anonymousClass3AB = (AnonymousClass3AB) this.f47643J.a(aA);
                        if (anonymousClass3AB != null && AnonymousClass3yS.m21797B(this, anonymousClass3AB.f38513C, 0.5f)) {
                            if (this.f47639F.m18784B() == AnonymousClass0uw.PAUSED && anonymousClass45p.equals(this.f47639F.m18783A())) {
                                AnonymousClass39f anonymousClass39f = this.f47639F;
                                anonymousClass39f.f38445I.m20863F("start");
                                if (anonymousClass39f.f38445I.f45103P == AnonymousClass0uw.PLAYING) {
                                    anonymousClass39f.f38444H.f11964B = AnonymousClass0fo.f7997C.B(anonymousClass39f.f38438B);
                                    AnonymousClass39f.m18781C(anonymousClass39f, anonymousClass39f.f38444H.f11964B);
                                }
                            } else {
                                this.f47639F.m18786D(anonymousClass45p, anonymousClass3AB, R.f38278E, this.f47641H);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m21799B() {
        this.f47635B.sendEmptyMessage(0);
    }

    /* renamed from: B */
    public static boolean m21797B(AnonymousClass3yS anonymousClass3yS, View view, float f) {
        return view.getGlobalVisibleRect(anonymousClass3yS.f47640G) && ((float) anonymousClass3yS.f47640G.height()) > ((float) view.getHeight()) * f;
    }

    public final void St() {
        this.f47635B.removeCallbacksAndMessages(null);
        this.f47643J.BA(this.f47642I);
        AnonymousClass39f anonymousClass39f = this.f47639F;
        String str = "fragment_paused";
        anonymousClass39f.f38442F = null;
        if (anonymousClass39f.f38445I != null) {
            anonymousClass39f.m18785C();
            anonymousClass39f.f38445I.m20866I(str);
            anonymousClass39f.f38445I = null;
        }
        this.f47638E = false;
    }

    public final void gi() {
        this.f47635B.removeCallbacksAndMessages(null);
        this.f47643J = null;
    }

    public final void gx() {
        this.f47638E = true;
        m21799B();
        this.f47643J.D(this.f47642I);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return this.f47639F.onKey(view, i, keyEvent);
    }
}
