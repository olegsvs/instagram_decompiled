package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout.LayoutParams;

/* renamed from: X.1An */
public final class AnonymousClass1An extends LayoutParams implements AnonymousClass1Ao {
    /* renamed from: B */
    private AnonymousClass1Aq f15315B;

    public AnonymousClass1An(int i, int i2) {
        super(i, i2);
    }

    public AnonymousClass1An(Context context, AttributeSet attributeSet) {
        AnonymousClass1Aq anonymousClass1Aq;
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1Ap.PercentLayout_Layout);
        float fraction = obtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            anonymousClass1Aq = new AnonymousClass1Aq();
            anonymousClass1Aq.f15325K = fraction;
        } else {
            anonymousClass1Aq = null;
        }
        fraction = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15319E = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15320F = fraction;
            anonymousClass1Aq.f15324J = fraction;
            anonymousClass1Aq.f15322H = fraction;
            anonymousClass1Aq.f15317C = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15320F = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15324J = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15322H = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15317C = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15323I = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15318D = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (anonymousClass1Aq == null) {
                anonymousClass1Aq = new AnonymousClass1Aq();
            }
            anonymousClass1Aq.f15316B = fraction;
        }
        obtainStyledAttributes.recycle();
        this.f15315B = anonymousClass1Aq;
    }

    public final AnonymousClass1Aq PP() {
        if (this.f15315B == null) {
            this.f15315B = new AnonymousClass1Aq();
        }
        return this.f15315B;
    }

    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, 0);
        this.height = typedArray.getLayoutDimension(i2, 0);
    }
}
