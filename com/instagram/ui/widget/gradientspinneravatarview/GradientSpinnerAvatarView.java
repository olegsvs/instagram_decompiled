package com.instagram.ui.widget.gradientspinneravatarview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import X.AnonymousClass13W;
import X.AnonymousClass2LY;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

public class GradientSpinnerAvatarView extends FrameLayout {
    /* renamed from: B */
    public final CircularImageView f12679B;
    /* renamed from: C */
    public final GradientSpinner f12680C;
    /* renamed from: D */
    public final int f12681D;
    /* renamed from: E */
    public final CircularImageView f12682E;
    /* renamed from: F */
    public final GradientSpinner f12683F;
    /* renamed from: G */
    public final boolean f12684G;
    /* renamed from: H */
    public int f12685H;
    /* renamed from: I */
    public int f12686I;
    /* renamed from: J */
    public final boolean f12687J;
    /* renamed from: K */
    private Drawable f12688K;
    /* renamed from: L */
    private int f12689L;
    /* renamed from: M */
    private final int f12690M;
    /* renamed from: N */
    private final int f12691N;
    /* renamed from: O */
    private final int f12692O;
    /* renamed from: P */
    private final int f12693P;
    /* renamed from: Q */
    private final int f12694Q;
    /* renamed from: R */
    private final boolean f12695R;

    public GradientSpinnerAvatarView(Context context) {
        this(context, null);
    }

    public GradientSpinnerAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientSpinnerAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f12689L = 0;
        this.f12695R = AnonymousClass0e8.m6200D(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.GradientSpinnerAvatarView);
        try {
            int i2 = -1;
            this.f12685H = obtainStyledAttributes.getDimensionPixelSize(7, i2);
            this.f12691N = obtainStyledAttributes.getDimensionPixelSize(2, i2);
            this.f12686I = obtainStyledAttributes.getDimensionPixelSize(8, i2);
            this.f12693P = obtainStyledAttributes.getDimensionPixelSize(4, i2);
            this.f12692O = obtainStyledAttributes.getDimensionPixelSize(3, i2);
            this.f12694Q = obtainStyledAttributes.getDimensionPixelSize(5, (int) AnonymousClass0Nm.m3424C(getContext(), 2));
            this.f12690M = obtainStyledAttributes.getDimensionPixelSize(1, i2);
            this.f12684G = obtainStyledAttributes.getBoolean(6, false);
            this.f12681D = obtainStyledAttributes.getDimensionPixelSize(0, (int) AnonymousClass0Nm.m3424C(getContext(), 3));
            if (!(this.f12693P == i2 || this.f12691N == i2 || this.f12690M == i2 || this.f12692O == i2)) {
                z = true;
            }
            this.f12687J = z;
            this.f12680C = new GradientSpinner(context, attributeSet);
            this.f12679B = new CircularImageView(context, attributeSet);
            CircularImageView circularImageView = null;
            this.f12683F = this.f12687J ? new GradientSpinner(context, attributeSet) : null;
            if (this.f12687J) {
                circularImageView = new CircularImageView(context, attributeSet);
            }
            this.f12682E = circularImageView;
            addView(this.f12680C);
            if (this.f12687J) {
                addView(this.f12683F);
            }
            addView(this.f12679B);
            if (this.f12687J) {
                addView(this.f12682E);
                this.f12682E.m5924H(this.f12681D, i2);
                this.f12679B.m5924H(this.f12681D, i2);
            }
            m8604B(this);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public final void m8606A(String str, String str2, AnonymousClass2LY anonymousClass2LY) {
        if (this.f12687J) {
            this.f12682E.setVisibility(0);
            this.f12683F.setVisibility(0);
            this.f12682E.setUrl(str);
            this.f12679B.setUrl(str2);
            if (2 != this.f12689L) {
                this.f12689L = 2;
                m8604B(this);
            }
            if (anonymousClass2LY != null) {
                this.f12680C.setProgressState(anonymousClass2LY.f29309B);
                this.f12683F.setProgressState(anonymousClass2LY.f29310C);
                return;
            }
            return;
        }
        throw new IllegalStateException("Params for double avatars were not passed in at initialization time");
    }

    /* renamed from: B */
    public static void m8604B(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        Object obj = gradientSpinnerAvatarView.f12689L == 2 ? 1 : null;
        int i = obj != null ? gradientSpinnerAvatarView.f12693P : gradientSpinnerAvatarView.f12686I;
        int i2 = obj != null ? gradientSpinnerAvatarView.f12691N : gradientSpinnerAvatarView.f12685H;
        int i3 = obj != null ? gradientSpinnerAvatarView.f12692O : 0;
        int i4 = obj != null ? gradientSpinnerAvatarView.f12694Q : 0;
        int i5 = obj != null ? 51 : 17;
        LayoutParams layoutParams = (LayoutParams) gradientSpinnerAvatarView.f12680C.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) gradientSpinnerAvatarView.f12679B.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        layoutParams2.gravity = i5;
        layoutParams.gravity = i5;
        layoutParams2.height = i;
        layoutParams2.width = i;
        layoutParams2.leftMargin = i3;
        layoutParams2.topMargin = i4;
        if (obj != null) {
            i5 = (i2 - i) / 2;
            layoutParams.topMargin = i4 - i5;
            layoutParams.leftMargin = i3 - i5;
        } else {
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        }
        if (obj != null) {
            gradientSpinnerAvatarView.f12679B.m5924H(gradientSpinnerAvatarView.f12681D, -1);
        } else if (gradientSpinnerAvatarView.f12684G) {
            gradientSpinnerAvatarView.f12679B.m5924H((int) AnonymousClass0Nm.m3424C(gradientSpinnerAvatarView.getContext(), 1), AnonymousClass0Ca.m937C(gradientSpinnerAvatarView.getContext(), C0164R.color.black_20_transparent));
        } else {
            gradientSpinnerAvatarView.f12679B.m5923G();
        }
        gradientSpinnerAvatarView.f12680C.setLayoutParams(layoutParams);
        gradientSpinnerAvatarView.f12679B.setLayoutParams(layoutParams2);
        if (gradientSpinnerAvatarView.f12687J) {
            int i6 = obj != null ? gradientSpinnerAvatarView.f12690M : 0;
            int i7 = obj != null ? 85 : 17;
            LayoutParams layoutParams3 = (LayoutParams) gradientSpinnerAvatarView.f12683F.getLayoutParams();
            LayoutParams layoutParams4 = (LayoutParams) gradientSpinnerAvatarView.f12682E.getLayoutParams();
            int i8 = i2 + i6;
            layoutParams3.height = i8;
            layoutParams3.width = i8;
            gradientSpinnerAvatarView.f12683F.setPadding(i6, i6, 0, 0);
            layoutParams4.height = i;
            layoutParams4.width = i;
            layoutParams4.gravity = i7;
            layoutParams4.rightMargin = i3;
            layoutParams4.bottomMargin = i4;
            if (obj != null) {
                i8 = (i2 - i) / 2;
                layoutParams3.topMargin = i4 - i8;
                layoutParams3.leftMargin = i3 - i8;
            } else {
                layoutParams3.topMargin = 0;
                layoutParams3.leftMargin = 0;
            }
            if (obj != null) {
                CircularImageView circularImageView = gradientSpinnerAvatarView.f12682E;
                circularImageView.setStrokeAlpha(circularImageView.f7200B);
            } else {
                gradientSpinnerAvatarView.f12682E.m5923G();
            }
            gradientSpinnerAvatarView.f12683F.setLayoutParams(layoutParams3);
            gradientSpinnerAvatarView.f12682E.setLayoutParams(layoutParams4);
        }
    }

    /* renamed from: B */
    public final void m8607B(String str, AnonymousClass2LY anonymousClass2LY) {
        this.f12679B.setUrl(str);
        m8605C(this, anonymousClass2LY);
    }

    /* renamed from: C */
    public final void m8608C() {
        this.f12680C.m7820F();
        if (this.f12687J) {
            this.f12683F.m7820F();
        }
    }

    /* renamed from: C */
    public static void m8605C(GradientSpinnerAvatarView gradientSpinnerAvatarView, AnonymousClass2LY anonymousClass2LY) {
        if (gradientSpinnerAvatarView.f12687J) {
            gradientSpinnerAvatarView.f12682E.setVisibility(8);
            gradientSpinnerAvatarView.f12683F.setVisibility(8);
        }
        if (1 != gradientSpinnerAvatarView.f12689L) {
            gradientSpinnerAvatarView.f12689L = 1;
            m8604B(gradientSpinnerAvatarView);
        }
        if (anonymousClass2LY != null) {
            gradientSpinnerAvatarView.f12680C.setProgressState(anonymousClass2LY.f29309B);
        }
    }

    /* renamed from: D */
    public final void m8609D() {
        this.f12680C.m7822H();
        if (this.f12687J) {
            this.f12683F.m7822H();
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f12688K != null && this.f12689L == 1) {
            float f;
            canvas.save();
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            float intrinsicHeight = ((float) (height - this.f12688K.getIntrinsicHeight())) - (((float) height) * 0.03f);
            if (this.f12695R) {
                f = ((float) width) * 0.03f;
            } else {
                f = ((float) (width - this.f12688K.getIntrinsicWidth())) - (((float) width) * 0.03f);
            }
            canvas.translate(f, intrinsicHeight);
            this.f12688K.draw(canvas);
            canvas.restore();
        }
    }

    public RectF getAvatarBounds() {
        if (this.f12687J) {
            return AnonymousClass0Nm.m3433L(this);
        }
        return AnonymousClass0Nm.m3433L(this.f12679B);
    }

    public GradientSpinner getBackGradientSpinner() {
        return this.f12680C;
    }

    public AnonymousClass2LY getCurrentSpinnerProgressState() {
        AnonymousClass13W progressState = this.f12680C.getProgressState();
        GradientSpinner gradientSpinner = this.f12683F;
        return new AnonymousClass2LY(progressState, gradientSpinner != null ? gradientSpinner.getProgressState() : null);
    }

    public void setBadgeDrawable(Drawable drawable) {
        if (this.f12688K != drawable) {
            this.f12688K = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f12688K.getIntrinsicHeight());
            }
            invalidate();
        }
    }

    public void setGradientColorRes(int i) {
        this.f12680C.setGradientColors(i);
        if (this.f12687J) {
            this.f12683F.setGradientColors(i);
        }
    }

    public void setGradientSpinnerActivated(boolean z) {
        if (z) {
            this.f12680C.m7816B();
            if (this.f12687J) {
                this.f12683F.m7816B();
                return;
            }
            return;
        }
        this.f12680C.m7818D();
        if (this.f12687J) {
            this.f12683F.m7818D();
        }
    }

    public void setGradientSpinnerVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
            this.f12680C.setVisibility(0);
            if (!this.f12687J) {
                return;
            }
        }
        i = 4;
        this.f12680C.setVisibility(4);
        if (!this.f12687J) {
            return;
        }
        this.f12683F.setVisibility(i);
    }

    public void setSource(String str) {
        this.f12679B.setSource(str);
        IgImageView igImageView = this.f12682E;
        if (igImageView != null) {
            igImageView.setSource(str);
        }
    }
}
