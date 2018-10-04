package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;

/* renamed from: X.4jX */
public final class AnonymousClass4jX {
    /* renamed from: B */
    public ImageView f56636B;
    /* renamed from: C */
    public Animation f56637C;
    /* renamed from: D */
    public Animation f56638D;
    /* renamed from: E */
    public AnonymousClass0ct f56639E;
    /* renamed from: F */
    public final Context f56640F;
    /* renamed from: G */
    public boolean f56641G = false;
    /* renamed from: H */
    public final boolean f56642H;
    /* renamed from: I */
    public ViewGroup f56643I;
    /* renamed from: J */
    public Animation f56644J;
    /* renamed from: K */
    public Animation f56645K;
    /* renamed from: L */
    public final int f56646L;

    public AnonymousClass4jX(Context context, boolean z) {
        this.f56640F = context;
        this.f56642H = z;
        this.f56646L = this.f56640F.getResources().getDimensionPixelSize(C0164R.dimen.direct_message_composer_side_padding);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 17432577);
        this.f56638D = loadAnimation;
        loadAnimation.setDuration(150);
        this.f56637C = AnimationUtils.loadAnimation(context, 17432576);
    }

    /* renamed from: B */
    public static void m24908B(AnonymousClass4jX anonymousClass4jX, int i) {
        AnonymousClass0LH.E(anonymousClass4jX.f56639E);
        LayoutParams layoutParams = (LayoutParams) anonymousClass4jX.f56639E.A().getLayoutParams();
        AnonymousClass0eY.E(layoutParams, i);
        anonymousClass4jX.f56639E.A().setLayoutParams(layoutParams);
    }

    /* renamed from: C */
    public static void m24909C(AnonymousClass4jX anonymousClass4jX, float f, Transformation transformation, boolean z) {
        int i;
        int i2;
        int i3;
        AnonymousClass0LH.E(anonymousClass4jX.f56639E);
        int width = anonymousClass4jX.f56636B.getWidth();
        LayoutParams layoutParams = (LayoutParams) anonymousClass4jX.f56643I.getLayoutParams();
        int i4 = 0;
        if (z) {
            i = -width;
            i2 = anonymousClass4jX.f56646L;
            i -= i2;
            i3 = i2 * 2;
            i2 += width;
        } else {
            i4 = -width;
            int i5 = anonymousClass4jX.f56646L;
            i4 -= i5;
            i3 = i5 + width;
            i2 = i5 * 2;
            i = 0;
        }
        if (anonymousClass4jX.f56642H) {
            layoutParams.rightMargin = (int) (((float) i4) + (((float) (i - i4)) * f));
        } else {
            layoutParams.leftMargin = (int) (((float) i4) + (((float) (i - i4)) * f));
        }
        anonymousClass4jX.f56643I.setLayoutParams(layoutParams);
        if (anonymousClass4jX.f56642H) {
            AnonymousClass0Nm.d(anonymousClass4jX.f56643I, (int) (((float) i3) + (((float) (i2 - i3)) * f)));
        } else {
            AnonymousClass0Nm.b(anonymousClass4jX.f56643I, (int) (((float) i3) + (((float) (i2 - i3)) * f)));
        }
        anonymousClass4jX.f56639E.A().setAlpha(z ? f : 1.0f - f);
        float f2 = z ? (-0.5f * f) + 1.0f : 0.5f + (f * 0.5f);
        anonymousClass4jX.f56636B.setScaleX(f2);
        anonymousClass4jX.f56636B.setScaleY(f2);
        if (!z && ((double) f) > 0.95d) {
            anonymousClass4jX.f56639E.A().setVisibility(8);
            if (anonymousClass4jX.f56642H) {
                layoutParams.rightMargin = layoutParams.rightMargin + anonymousClass4jX.f56646L;
            } else {
                layoutParams.leftMargin = layoutParams.leftMargin + anonymousClass4jX.f56646L;
            }
            anonymousClass4jX.f56643I.setLayoutParams(layoutParams);
        }
    }
}
