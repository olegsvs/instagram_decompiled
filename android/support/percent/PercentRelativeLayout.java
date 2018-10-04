package android.support.percent;

import X.AnonymousClass0eY;
import X.AnonymousClass0mE;
import X.AnonymousClass1Am;
import X.AnonymousClass1An;
import X.AnonymousClass1Ao;
import X.AnonymousClass1Aq;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;

public class PercentRelativeLayout extends RelativeLayout {
    /* renamed from: B */
    private final AnonymousClass1Am f15313B = new AnonymousClass1Am(this);

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass1An(-1, -1);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i3 = this.f15313B;
        i2 = i3.f15314B.getChildCount();
        for (i = 0; i < i2; i++) {
            z = i3.f15314B.getChildAt(i).getLayoutParams();
            if (z instanceof AnonymousClass1Ao) {
                i4 = ((AnonymousClass1Ao) z).PP();
                if (i4 != 0) {
                    if (z instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) z;
                        i4.m9761B(marginLayoutParams);
                        marginLayoutParams.leftMargin = i4.f15321G.leftMargin;
                        marginLayoutParams.topMargin = i4.f15321G.topMargin;
                        marginLayoutParams.rightMargin = i4.f15321G.rightMargin;
                        marginLayoutParams.bottomMargin = i4.f15321G.bottomMargin;
                        AnonymousClass0eY.m6371E(marginLayoutParams, AnonymousClass0eY.m6369C(i4.f15321G));
                        AnonymousClass0eY.m6370D(marginLayoutParams, AnonymousClass0eY.m6368B(i4.f15321G));
                    } else {
                        i4.m9761B(z);
                    }
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        AnonymousClass1Am anonymousClass1Am = this.f15313B;
        int size = (MeasureSpec.getSize(i) - anonymousClass1Am.f15314B.getPaddingLeft()) - anonymousClass1Am.f15314B.getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - anonymousClass1Am.f15314B.getPaddingTop()) - anonymousClass1Am.f15314B.getPaddingBottom();
        int childCount = anonymousClass1Am.f15314B.getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = anonymousClass1Am.f15314B.getChildAt(i3);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof AnonymousClass1Ao) {
                AnonymousClass1Aq PP = ((AnonymousClass1Ao) layoutParams).PP();
                if (PP != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        PP.m9760A(marginLayoutParams, size, size2);
                        PP.f15321G.leftMargin = marginLayoutParams.leftMargin;
                        PP.f15321G.topMargin = marginLayoutParams.topMargin;
                        PP.f15321G.rightMargin = marginLayoutParams.rightMargin;
                        PP.f15321G.bottomMargin = marginLayoutParams.bottomMargin;
                        AnonymousClass0eY.m6371E(PP.f15321G, AnonymousClass0eY.m6369C(marginLayoutParams));
                        AnonymousClass0eY.m6370D(PP.f15321G, AnonymousClass0eY.m6368B(marginLayoutParams));
                        float f = PP.f15320F;
                        if (f >= 0.0f) {
                            marginLayoutParams.leftMargin = Math.round(((float) size) * f);
                        }
                        f = PP.f15324J;
                        if (f >= 0.0f) {
                            marginLayoutParams.topMargin = Math.round(((float) size2) * f);
                        }
                        f = PP.f15322H;
                        if (f >= 0.0f) {
                            marginLayoutParams.rightMargin = Math.round(((float) size) * f);
                        }
                        f = PP.f15317C;
                        if (f >= 0.0f) {
                            marginLayoutParams.bottomMargin = Math.round(((float) size2) * f);
                        }
                        Object obj = null;
                        f = PP.f15323I;
                        if (f >= 0.0f) {
                            AnonymousClass0eY.m6371E(marginLayoutParams, Math.round(((float) size) * f));
                            obj = 1;
                        }
                        f = PP.f15318D;
                        if (f >= 0.0f) {
                            AnonymousClass0eY.m6370D(marginLayoutParams, Math.round(((float) size) * f));
                            obj = 1;
                        }
                        if (!(obj == null || childAt == null)) {
                            int C = AnonymousClass0mE.m7513C(childAt);
                            if (VERSION.SDK_INT >= 17) {
                                marginLayoutParams.resolveLayoutDirection(C);
                            }
                        }
                    } else {
                        PP.m9760A(layoutParams, size, size2);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
        AnonymousClass1Am anonymousClass1Am2 = this.f15313B;
        childCount = anonymousClass1Am2.f15314B.getChildCount();
        Object obj2 = null;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt2 = anonymousClass1Am2.f15314B.getChildAt(i3);
            layoutParams = childAt2.getLayoutParams();
            if (layoutParams instanceof AnonymousClass1Ao) {
                AnonymousClass1Aq PP2 = ((AnonymousClass1Ao) layoutParams).PP();
                if (PP2 != null) {
                    Object obj3 = ((childAt2.getMeasuredWidthAndState() & -16777216) == 16777216 && PP2.f15325K >= 0.0f && PP2.f15321G.width == -2) ? 1 : null;
                    if (obj3 != null) {
                        layoutParams.width = -2;
                        obj2 = 1;
                    }
                    obj3 = ((childAt2.getMeasuredHeightAndState() & -16777216) == 16777216 && PP2.f15319E >= 0.0f && PP2.f15321G.height == -2) ? 1 : null;
                    if (obj3 != null) {
                        layoutParams.height = -2;
                        obj2 = 1;
                    }
                }
            }
        }
        if (obj2 != null) {
            super.onMeasure(i, i2);
        }
    }
}
