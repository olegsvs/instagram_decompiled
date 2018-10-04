package com.instagram.common.ui.colorfilter;

import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ColorFilterAlphaImageView extends ImageView {
    /* renamed from: B */
    public ColorFilter f7193B;
    /* renamed from: C */
    public int f7194C = 255;
    /* renamed from: D */
    public int f7195D = 255;
    /* renamed from: E */
    public ColorFilter f7196E;
    /* renamed from: F */
    private int f7197F = 255;
    /* renamed from: G */
    private int f7198G = 255;

    public ColorFilterAlphaImageView(Context context) {
        super(context);
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5918C(context, attributeSet);
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5918C(context, attributeSet);
    }

    /* renamed from: A */
    public boolean m5920A() {
        if (!isSelected()) {
            if (!isPressed()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m5917B(com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r4) {
        /*
        r0 = r4.isDuplicateParentStateEnabled();
        r3 = 1;
        if (r0 != 0) goto L_0x0016;
    L_0x0007:
        r1 = r4.isEnabled();
        if (r1 == 0) goto L_0x0014;
    L_0x000d:
        r0 = r4.m5920A();
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0035;
    L_0x0014:
        r3 = 0;
        goto L_0x0035;
    L_0x0016:
        r2 = r4.getDrawableState();
        r0 = 16842910; // 0x101009e float:2.3694E-38 double:8.321503E-317;
        r1 = m5919D(r2, r0);
        if (r1 == 0) goto L_0x0014;
    L_0x0023:
        r0 = 16842913; // 0x10100a1 float:2.369401E-38 double:8.3215047E-317;
        r0 = m5919D(r2, r0);
        if (r0 != 0) goto L_0x0035;
    L_0x002c:
        r0 = 16842919; // 0x10100a7 float:2.3694026E-38 double:8.3215077E-317;
        r0 = m5919D(r2, r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0035:
        if (r1 == 0) goto L_0x0043;
    L_0x0037:
        if (r3 == 0) goto L_0x003e;
    L_0x0039:
        r1 = r4.f7193B;
        r0 = r4.f7197F;
        goto L_0x0047;
    L_0x003e:
        r1 = r4.f7196E;
        r0 = r4.f7195D;
        goto L_0x0047;
    L_0x0043:
        r0 = r4.f7194C;
        r1 = r4.f7196E;
    L_0x0047:
        r4.setColorFilter(r1);
        r1 = (float) r0;
        r0 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r1 = r1 / r0;
        r0 = r4.f7198G;
        r0 = (float) r0;
        r1 = r1 * r0;
        r0 = java.lang.Math.round(r1);
        super.setImageAlpha(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView.B(com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView):void");
    }

    /* renamed from: C */
    private void m5918C(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.ColorFilterAwareImageView);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f7196E = AnonymousClass0ca.m5921B(obtainStyledAttributes.getColor(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.f7195D = obtainStyledAttributes.getInt(4, 255);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f7193B = AnonymousClass0ca.m5921B(obtainStyledAttributes.getColor(0, 0));
        } else {
            this.f7193B = this.f7196E;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f7197F = obtainStyledAttributes.getInt(1, 255);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.f7194C = obtainStyledAttributes.getInt(2, 255);
        }
        obtainStyledAttributes.recycle();
        m5917B(this);
    }

    /* renamed from: D */
    private static boolean m5919D(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m5917B(this);
    }

    public ColorFilter getActiveColorFilter() {
        return this.f7193B;
    }

    public int getDisabledAlpha() {
        return this.f7194C;
    }

    public ColorFilter getNormalColorFilter() {
        return this.f7196E;
    }

    public void setActiveAlpha(int i) {
        this.f7197F = i;
        m5917B(this);
    }

    public void setActiveColorFilter(int i) {
        this.f7193B = AnonymousClass0ca.m5921B(i);
        m5917B(this);
    }

    public void setDisabledAlpha(int i) {
        this.f7194C = i;
        m5917B(this);
    }

    public void setImageAlpha(int i) {
        this.f7198G = i;
        m5917B(this);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m5917B(this);
    }

    public void setNormalAlpha(int i) {
        this.f7195D = i;
        m5917B(this);
    }

    public void setNormalColorFilter(int i) {
        if (i == 0) {
            this.f7196E = null;
        } else {
            this.f7196E = AnonymousClass0ca.m5921B(i);
        }
        m5917B(this);
    }
}
