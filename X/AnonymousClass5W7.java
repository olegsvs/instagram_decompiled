package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.5W7 */
public final class AnonymousClass5W7 extends AnonymousClass4gA {
    /* renamed from: B */
    public final LinearLayout f65541B;
    /* renamed from: C */
    private final Context f65542C;

    /* renamed from: W */
    public final boolean m27262W() {
        return false;
    }

    public AnonymousClass5W7(AnonymousClass0Cm anonymousClass0Cm, View view, AnonymousClass5bQ anonymousClass5bQ) {
        super(view, anonymousClass5bQ);
        this.f65542C = view.getContext();
        this.f65541B = (LinearLayout) view;
        AnonymousClass2E3[] values = AnonymousClass2E3.values();
        Resources resources = this.f65542C.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.direct_in_thread_composer_emoji_width);
        int J = (AnonymousClass0Nm.J(this.f65542C) - (resources.getDimensionPixelSize(C0164R.dimen.direct_in_thread_composer_emoji_bar_side_margin) * 2)) / dimensionPixelSize;
        int F = AnonymousClass0nB.F(new int[]{7, J, values.length});
        for (J = 0; J < F; J++) {
            View constrainedImageView = new ConstrainedImageView(this.f65542C);
            constrainedImageView.setLayoutParams(new LayoutParams(dimensionPixelSize, -2));
            String B = values[J].B();
            constrainedImageView.setContentDescription(B);
            constrainedImageView.setUrl(AnonymousClass2Hj.B(B));
            AnonymousClass15z anonymousClass15z = new AnonymousClass15z(constrainedImageView);
            anonymousClass15z.f14390J = AnonymousClass14H.f13835e;
            anonymousClass15z.f14385E = new AnonymousClass4fF(this, B);
            anonymousClass15z.A();
            this.f65541B.addView(constrainedImageView);
            if (J < F - 1) {
                View view2 = new View(this.f65542C);
                view2.setLayoutParams(new LayoutParams(0, -2, 1.0f));
                this.f65541B.addView(view2);
            }
        }
    }

    /* renamed from: X */
    public final /* bridge */ /* synthetic */ void m27263X(AnonymousClass4gR anonymousClass4gR) {
        AnonymousClass5W6 anonymousClass5W6 = (AnonymousClass5W6) anonymousClass4gR;
        AnonymousClass0Nm.g(this.f65541B, anonymousClass5W6.f65540B);
        AnonymousClass0Nm.Y(this.f65541B, anonymousClass5W6.f65540B);
    }
}
