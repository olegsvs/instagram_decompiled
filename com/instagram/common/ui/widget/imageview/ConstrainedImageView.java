package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0eS;
import X.AnonymousClass3hc;
import X.AnonymousClass4Ja;
import X.AnonymousClass4Je;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ConstrainedImageView extends IgImageView {
    /* renamed from: B */
    private float f11533B = 1.0f;
    /* renamed from: C */
    private AnonymousClass3hc f11534C;
    /* renamed from: D */
    private AnonymousClass4Ja f11535D;

    public ConstrainedImageView(Context context) {
        super(context);
    }

    public ConstrainedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8138E(attributeSet);
    }

    public ConstrainedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8138E(attributeSet);
    }

    /* renamed from: E */
    private void m8138E(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.ConstrainedImageView);
        this.f11533B = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int round = Math.round(((float) getMeasuredWidth()) / this.f11533B);
        setMeasuredDimension(measuredWidth, round);
        AnonymousClass3hc anonymousClass3hc = this.f11534C;
        if (anonymousClass3hc != null) {
            anonymousClass3hc.A(measuredWidth, round);
        }
    }

    public void setAspect(float f) {
        this.f11533B = f;
    }

    public final boolean setFrame(int i, int i2, int i3, int i4) {
        AnonymousClass4Ja anonymousClass4Ja = this.f11535D;
        if (anonymousClass4Ja != null) {
            AnonymousClass4Je.B(anonymousClass4Ja.f52699B, anonymousClass4Ja.f52700C, anonymousClass4Ja.f52701D, i3 - i, i4 - i2);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void setOnMeasureListener(AnonymousClass3hc anonymousClass3hc) {
        this.f11534C = anonymousClass3hc;
    }

    public void setOnSetFrameListener(AnonymousClass4Ja anonymousClass4Ja) {
        this.f11535D = anonymousClass4Ja;
    }
}
