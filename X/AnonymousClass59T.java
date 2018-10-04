package X;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.C0164R;

/* renamed from: X.59T */
public final class AnonymousClass59T {
    /* renamed from: B */
    public AnonymousClass59R f60604B = AnonymousClass59R.NONE;
    /* renamed from: C */
    public final AnonymousClass5wQ f60605C;
    /* renamed from: D */
    public final AnonymousClass5wR f60606D;
    /* renamed from: E */
    public final int f60607E;
    /* renamed from: F */
    public final Runnable f60608F;
    /* renamed from: G */
    public boolean f60609G;
    /* renamed from: H */
    public boolean f60610H;
    /* renamed from: I */
    public View f60611I;
    /* renamed from: J */
    public AnonymousClass3b8 f60612J;
    /* renamed from: K */
    public View f60613K;
    /* renamed from: L */
    public ObjectAnimator f60614L;
    /* renamed from: M */
    public ProgressBar f60615M;
    /* renamed from: N */
    public int f60616N;
    /* renamed from: O */
    public final AnonymousClass0Cm f60617O;
    /* renamed from: P */
    private final int f60618P;
    /* renamed from: Q */
    private ImageView f60619Q;
    /* renamed from: R */
    private final ViewStub f60620R;

    public AnonymousClass59T(AnonymousClass5wQ anonymousClass5wQ, AnonymousClass5wR anonymousClass5wR, ViewStub viewStub, AnonymousClass0Cm anonymousClass0Cm) {
        this.f60605C = anonymousClass5wQ;
        this.f60606D = anonymousClass5wR;
        this.f60620R = viewStub;
        this.f60608F = new AnonymousClass59Q(this);
        Resources resources = this.f60620R.getContext().getResources();
        this.f60607E = (int) resources.getDimension(C0164R.dimen.reel_viewer_fast_navigation_edge_press_x_threshold);
        this.f60618P = (int) resources.getDimension(C0164R.dimen.reel_viewer_fast_navigation_edge_press_y_threshold);
        this.f60617O = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final boolean m25863A(float f, float f2) {
        if (this.f60605C.f70171B.f4312I.f14103H.X()) {
            if (((Boolean) AnonymousClass0CC.nN.H(this.f60617O)).booleanValue()) {
                if (this.f60611I == null) {
                    View inflate = this.f60620R.inflate();
                    this.f60611I = inflate;
                    this.f60613K = (View) inflate.getParent();
                    this.f60615M = (ProgressBar) this.f60611I.findViewById(C0164R.id.fast_navigation_loading_progress_view);
                    this.f60619Q = (ImageView) this.f60611I.findViewById(C0164R.id.fast_navigation_indicator);
                }
                Object obj = (f <= ((float) (this.f60613K.getWidth() - this.f60607E)) || !AnonymousClass59T.m25860C(this, f2)) ? null : 1;
                if (obj != null) {
                    this.f60604B = AnonymousClass59R.FORWARD;
                    this.f60619Q.setImageResource(C0164R.drawable.reel_viewer_forward_navigation_icon);
                } else {
                    obj = (f >= ((float) this.f60607E) || !AnonymousClass59T.m25860C(this, f2)) ? null : 1;
                    if (obj != null) {
                        this.f60604B = AnonymousClass59R.BACKWARD;
                        this.f60619Q.setImageResource(C0164R.drawable.reel_viewer_backward_navigation_icon);
                    }
                }
                if (AnonymousClass59T.m25859B(this)) {
                    this.f60619Q.setVisibility(0);
                    this.f60616N = this.f60605C.f70171B.f4312I.f14107L;
                    this.f60619Q.setVisibility(0);
                    if (this.f60604B == AnonymousClass59R.FORWARD) {
                        this.f60610H = true;
                        this.f60612J = new AnonymousClass59S(this, this.f60616N);
                        AnonymousClass0Nw.B(this.f60617O).D(this.f60605C.f70171B.f4312I.f14103H.getId(), 10, this.f60616N, this.f60612J, "fast_navigation_controller");
                        this.f60611I.postDelayed(new AnonymousClass59N(this), 1500);
                        this.f60611I.postDelayed(new AnonymousClass59O(this), 200);
                    } else {
                        AnonymousClass59T.m25861D(this);
                    }
                    return true;
                }
                m25864B();
                return false;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m25864B() {
        AnonymousClass59R anonymousClass59R = this.f60604B;
        AnonymousClass59R anonymousClass59R2 = AnonymousClass59R.NONE;
        if (anonymousClass59R == anonymousClass59R2) {
            return false;
        }
        AnonymousClass0LH.E(this.f60611I);
        this.f60612J = null;
        m25862E();
        this.f60604B = anonymousClass59R2;
        this.f60619Q.setVisibility(8);
        this.f60611I.removeCallbacks(this.f60608F);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static boolean m25859B(X.AnonymousClass59T r3) {
        /*
        r1 = r3.f60604B;
        r0 = X.AnonymousClass59R.FORWARD;
        r2 = 1;
        if (r1 != r0) goto L_0x0023;
    L_0x0007:
        r0 = r3.f60605C;
        r0 = r0.f70171B;
        r0 = r0.f4312I;
        r1 = r0.f14107L;
        r0 = r3.f60605C;
        r0 = r0.f70171B;
        r0 = r0.f4312I;
        r0 = r0.f14103H;
        r0 = r0.F();
        r0 = r0.size();
        r0 = r0 - r2;
        if (r1 >= r0) goto L_0x0034;
    L_0x0022:
        return r2;
    L_0x0023:
        r1 = r3.f60604B;
        r0 = X.AnonymousClass59R.BACKWARD;
        if (r1 != r0) goto L_0x0034;
    L_0x0029:
        r0 = r3.f60605C;
        r0 = r0.f70171B;
        r0 = r0.f4312I;
        r0 = r0.f14107L;
        if (r0 <= 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0022;
    L_0x0034:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.59T.B(X.59T):boolean");
    }

    /* renamed from: C */
    public static boolean m25860C(AnonymousClass59T anonymousClass59T, float f) {
        return f > ((float) anonymousClass59T.f60618P) && f < ((float) (anonymousClass59T.f60613K.getHeight() - anonymousClass59T.f60618P));
    }

    /* renamed from: D */
    public static void m25861D(AnonymousClass59T anonymousClass59T) {
        anonymousClass59T.m25862E();
        anonymousClass59T.f60611I.postDelayed(anonymousClass59T.f60608F, 200);
    }

    /* renamed from: E */
    private void m25862E() {
        this.f60610H = false;
        ObjectAnimator objectAnimator = this.f60614L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (this.f60615M.getVisibility() != 8) {
            if (!this.f60609G) {
                this.f60609G = true;
                this.f60615M.animate().alpha(0.0f).setDuration(100).setListener(new AnonymousClass59P(this)).start();
            }
        }
    }
}
