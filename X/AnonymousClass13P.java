package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.13P */
public final class AnonymousClass13P extends AnonymousClass0oo implements AnonymousClass10H {
    /* renamed from: B */
    public final AnonymousClass1N7 f13720B;
    /* renamed from: C */
    public final AnonymousClass16U f13721C;
    /* renamed from: D */
    private int f13722D;
    /* renamed from: E */
    private int f13723E;

    public final void lU(float f) {
    }

    public AnonymousClass13P(View view, Context context, boolean z) {
        super(view);
        this.f13721C = new AnonymousClass16U(view, context, z);
        this.f13720B = new AnonymousClass1N7(view.findViewById(C0164R.id.avatar_container));
    }

    public final int BN() {
        if (this.f13723E == 0) {
            Pair C = AnonymousClass13O.m9106C(xO());
            this.f13723E = ((Integer) C.first).intValue();
            this.f13722D = ((Integer) C.second).intValue();
        }
        return this.f13723E;
    }

    public final View VQ() {
        return this.f10370B;
    }

    public final String XQ() {
        return this.f13721C.XQ();
    }

    public final GradientSpinner aQ() {
        return this.f13720B.f17768E;
    }

    public final View dN() {
        return this.f13721C.f14543C.f14546C.f14555G;
    }

    public final void eV() {
        kI().setVisibility(4);
    }

    public final RectF iI() {
        return AnonymousClass0Nm.m3433L(kI());
    }

    public final View jI() {
        return this.f13721C.f14543C.f14545B;
    }

    public final View kI() {
        return this.f13720B.f17767D;
    }

    public final void qC(float f) {
        AnonymousClass13O.m9105B(this, f);
    }

    public final void wQA(AnonymousClass3bB anonymousClass3bB) {
    }

    public final View xO() {
        return this.f13721C.f14543C.f14547D;
    }

    public final void xTA() {
        kI().setVisibility(0);
    }

    public final int zM() {
        if (this.f13722D == 0) {
            Pair C = AnonymousClass13O.m9106C(xO());
            this.f13723E = ((Integer) C.first).intValue();
            this.f13722D = ((Integer) C.second).intValue();
        }
        return this.f13722D;
    }
}
