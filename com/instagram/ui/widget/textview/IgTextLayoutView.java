package com.instagram.ui.widget.textview;

import X.AnonymousClass0cQ;
import X.AnonymousClass2M6;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IgTextLayoutView extends View {
    /* renamed from: B */
    private Layout f11578B;
    /* renamed from: C */
    private final int f11579C;

    public IgTextLayoutView(Context context) {
        this(context, null);
    }

    public IgTextLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public IgTextLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
        this.f11579C = getPaddingBottom();
    }

    public CharSequence getTextForAccessibility() {
        Layout layout = this.f11578B;
        return layout == null ? JsonProperty.USE_DEFAULT_NAME : layout.getText();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.f11578B != null) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            this.f11578B.draw(canvas);
        }
        canvas.restore();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getClass().getName());
        accessibilityNodeInfo.setText(getTextForAccessibility());
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11578B != null) {
            setMeasuredDimension((getPaddingLeft() + getPaddingRight()) + this.f11578B.getWidth(), (getPaddingTop() + getPaddingBottom()) + this.f11578B.getHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, -1347815446);
        Layout layout = this.f11578B;
        boolean z = false;
        if (layout == null) {
            AnonymousClass0cQ.m5862L(this, -173329971, M);
            return false;
        }
        if (AnonymousClass2M6.B(motionEvent, layout, this) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        AnonymousClass0cQ.m5862L(this, 1681844219, M);
        return z;
    }

    public void setTextLayout(Layout layout) {
        if (layout.getText() instanceof Spanned) {
            if (VERSION.SDK_INT > 20) {
                int lineCount = layout.getLineCount();
                float f = (float) this.f11579C;
                if (lineCount > 0) {
                    f += ((float) (layout.getLineTop(lineCount) - layout.getLineTop(lineCount - 1))) * (layout.getSpacingMultiplier() - 1.0f);
                }
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), (int) (f + layout.getSpacingAdd()));
            }
            this.f11578B = layout;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("CommentText must be spanned text");
    }
}
