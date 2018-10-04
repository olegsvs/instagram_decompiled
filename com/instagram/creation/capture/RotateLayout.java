package com.instagram.creation.capture;

import X.AnonymousClass0cQ;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class RotateLayout extends ViewGroup {
    /* renamed from: B */
    public View f52478B;
    /* renamed from: C */
    public int f52479C;

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(17170445);
    }

    public final void onFinishInflate() {
        int N = AnonymousClass0cQ.N(this, -1651369656);
        this.f52478B = getChildAt(0);
        if (VERSION.SDK_INT >= 11) {
            this.f52478B.setPivotX(0.0f);
            this.f52478B.setPivotY(0.0f);
        }
        AnonymousClass0cQ.O(this, -561552152, N);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        int i5 = this.f52479C;
        if (i5 != 0) {
            if (i5 != 90) {
                if (i5 != 180) {
                    if (i5 != 270) {
                        return;
                    }
                }
            }
            this.f52478B.layout(0, 0, i4, i3);
            return;
        }
        this.f52478B.layout(0, 0, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.f52479C;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 != 90) {
                if (i4 != 180) {
                    if (i4 != 270) {
                        i3 = 0;
                        setMeasuredDimension(i5, i3);
                        if (VERSION.SDK_INT < 11) {
                            i4 = this.f52479C;
                            if (i4 != 0) {
                                this.f52478B.setTranslationX(0.0f);
                                this.f52478B.setTranslationY(0.0f);
                            } else if (i4 != 90) {
                                this.f52478B.setTranslationX(0.0f);
                                this.f52478B.setTranslationY((float) i3);
                            } else if (i4 != 180) {
                                this.f52478B.setTranslationX((float) i5);
                                this.f52478B.setTranslationY((float) i3);
                            } else if (i4 != 270) {
                                this.f52478B.setTranslationX((float) i5);
                                this.f52478B.setTranslationY(0.0f);
                            }
                            this.f52478B.setRotation((float) (-this.f52479C));
                        }
                    }
                }
            }
            measureChild(this.f52478B, i2, i);
            i5 = this.f52478B.getMeasuredHeight();
            i3 = this.f52478B.getMeasuredWidth();
            setMeasuredDimension(i5, i3);
            if (VERSION.SDK_INT < 11) {
                i4 = this.f52479C;
                if (i4 != 0) {
                    this.f52478B.setTranslationX(0.0f);
                    this.f52478B.setTranslationY(0.0f);
                } else if (i4 != 90) {
                    this.f52478B.setTranslationX(0.0f);
                    this.f52478B.setTranslationY((float) i3);
                } else if (i4 != 180) {
                    this.f52478B.setTranslationX((float) i5);
                    this.f52478B.setTranslationY((float) i3);
                } else if (i4 != 270) {
                    this.f52478B.setTranslationX((float) i5);
                    this.f52478B.setTranslationY(0.0f);
                }
                this.f52478B.setRotation((float) (-this.f52479C));
            }
        }
        measureChild(this.f52478B, i, i2);
        i5 = this.f52478B.getMeasuredWidth();
        i3 = this.f52478B.getMeasuredHeight();
        setMeasuredDimension(i5, i3);
        if (VERSION.SDK_INT < 11) {
            i4 = this.f52479C;
            if (i4 != 0) {
                this.f52478B.setTranslationX(0.0f);
                this.f52478B.setTranslationY(0.0f);
            } else if (i4 != 90) {
                this.f52478B.setTranslationX(0.0f);
                this.f52478B.setTranslationY((float) i3);
            } else if (i4 != 180) {
                this.f52478B.setTranslationX((float) i5);
                this.f52478B.setTranslationY((float) i3);
            } else if (i4 != 270) {
                this.f52478B.setTranslationX((float) i5);
                this.f52478B.setTranslationY(0.0f);
            }
            this.f52478B.setRotation((float) (-this.f52479C));
        }
    }

    public void setOrientation(int i) {
        int i2 = i % 360;
        if (this.f52479C != i2) {
            this.f52479C = i2;
            requestLayout();
        }
    }
}
