package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.13T */
public final class AnonymousClass13T extends AnonymousClass0oo implements AnonymousClass10H {
    /* renamed from: B */
    public final AnonymousClass16e f13728B;
    /* renamed from: C */
    public final AnonymousClass16U f13729C;
    /* renamed from: D */
    private int f13730D;
    /* renamed from: E */
    private int f13731E;

    public final void lU(float f) {
    }

    public AnonymousClass13T(View view, Context context, boolean z) {
        super(view);
        this.f13729C = new AnonymousClass16U(view, context, z);
        this.f13728B = new AnonymousClass16e(view.findViewById(C0164R.id.avatar_container));
    }

    public final int BN() {
        if (this.f13731E == 0) {
            Pair C = AnonymousClass13O.m9106C(xO());
            this.f13731E = ((Integer) C.first).intValue();
            this.f13730D = ((Integer) C.second).intValue();
        }
        return this.f13731E;
    }

    public final View VQ() {
        return this.f10370B;
    }

    public final String XQ() {
        return this.f13729C.f14543C.f14548E;
    }

    public final GradientSpinner aQ() {
        return this.f13728B.aQ();
    }

    public final View dN() {
        return this.f13729C.f14543C.f14546C.f14555G;
    }

    public final void eV() {
        kI().setVisibility(4);
    }

    public final RectF iI() {
        return AnonymousClass0Nm.m3433L(kI());
    }

    public final View jI() {
        return this.f13729C.f14543C.f14545B;
    }

    public final View kI() {
        return this.f13728B.kI();
    }

    public final void qC(float f) {
        AnonymousClass13O.m9105B(this, f);
    }

    public final void wQA(AnonymousClass3bB anonymousClass3bB) {
    }

    public final View xO() {
        return this.f13729C.f14543C.f14547D;
    }

    public final void xTA() {
        kI().setVisibility(0);
    }

    public final int zM() {
        if (this.f13730D == 0) {
            Pair C = AnonymousClass13O.m9106C(xO());
            this.f13731E = ((Integer) C.first).intValue();
            this.f13730D = ((Integer) C.second).intValue();
        }
        return this.f13730D;
    }
}
