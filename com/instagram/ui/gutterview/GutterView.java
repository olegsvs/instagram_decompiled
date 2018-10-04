package com.instagram.ui.gutterview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;

public class GutterView extends FrameLayout {
    /* renamed from: B */
    public final Drawable f7491B;
    /* renamed from: C */
    public final Rect f7492C;
    /* renamed from: D */
    public final ColorDrawable f7493D;
    /* renamed from: E */
    public final int f7494E;
    /* renamed from: F */
    public final ImageView f7495F;
    /* renamed from: G */
    public final boolean f7496G;
    /* renamed from: H */
    private final Paint f7497H;

    public GutterView(Context context) {
        this(context, null);
    }

    public GutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GutterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7492C = new Rect();
        setWillNotDraw(false);
        Paint paint = new Paint(5);
        this.f7497H = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AnonymousClass0Nm.m3424C(getContext(), 95), Color.argb(166, 0, 0, 0), 0, TileMode.CLAMP));
        this.f7496G = AnonymousClass0e8.m6200D(context);
        View imageView = new ImageView(context);
        this.f7495F = imageView;
        addView(imageView, new LayoutParams(-2, -2, 19));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.GutterView, i, 0);
        try {
            this.f7495F.setImageDrawable(obtainStyledAttributes.getDrawable(1));
            this.f7494E = obtainStyledAttributes.getInt(0, 8388613);
            int resourceId = obtainStyledAttributes.getResourceId(2, -1);
            Drawable E = resourceId > 0 ? AnonymousClass0Ca.m939E(context, resourceId) : null;
            this.f7491B = E;
            if (E != null) {
                E.setCallback(this);
            }
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            this.f7493D = colorDrawable;
            colorDrawable.setAlpha(204);
            setForeground(this.f7493D);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f7492C);
        super.draw(canvas);
        canvas.restore();
    }

    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.f7491B;
        if (drawable != null) {
            drawable.draw(canvas);
            canvas.drawPaint(this.f7497H);
        }
        super.onDraw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, 1997889981);
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.f7492C;
        rect.bottom = i2;
        Drawable drawable = this.f7491B;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        AnonymousClass0cQ.m5865O(this, 1283005270, N);
    }
}
