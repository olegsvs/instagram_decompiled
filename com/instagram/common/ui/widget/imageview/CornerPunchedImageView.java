package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0cQ;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Region.Op;
import android.util.AttributeSet;

public class CornerPunchedImageView extends CircularImageView {
    /* renamed from: B */
    private boolean f25940B;
    /* renamed from: C */
    private Path f25941C;
    /* renamed from: D */
    private final String f25942D;
    /* renamed from: E */
    private int f25943E;
    /* renamed from: F */
    private int f25944F;
    /* renamed from: G */
    private int f25945G;

    public CornerPunchedImageView(Context context) {
        this(context, null);
    }

    public CornerPunchedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CornerPunchedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25940B = AnonymousClass0e8.D(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.CornerPunchedImageView);
        this.f25945G = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.f25942D = obtainStyledAttributes.getString(0);
        this.f25943E = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f25944F = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f25943E = this.f25940B ? -this.f25943E : this.f25943E;
        obtainStyledAttributes.recycle();
        m14421C();
    }

    /* renamed from: C */
    private void m14421C() {
        Path path = new Path();
        this.f25941C = path;
        path.setFillType(FillType.EVEN_ODD);
        int[] punchCenter = getPunchCenter();
        int i = this.f25945G;
        if (i == -1) {
            i = getWidth() / 2;
        }
        this.f25941C.addCircle((float) (punchCenter[0] + this.f25943E), (float) (punchCenter[1] + this.f25944F), (float) i, Direction.CW);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] getPunchCenter() {
        /*
        r7 = this;
        r0 = r7.f25940B;
        r6 = 0;
        if (r0 == 0) goto L_0x000a;
    L_0x0005:
        r2 = r7.getWidth();
        goto L_0x000b;
    L_0x000a:
        r2 = 0;
    L_0x000b:
        r0 = r7.f25940B;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        r5 = 0;
        goto L_0x0015;
    L_0x0011:
        r5 = r7.getWidth();
    L_0x0015:
        r1 = r7.f25942D;
        r0 = r1.hashCode();
        r4 = 1;
        r3 = 2;
        switch(r0) {
            case -1698351794: goto L_0x0049;
            case -1682225977: goto L_0x003f;
            case -1364013995: goto L_0x0035;
            case -1139554575: goto L_0x002b;
            case 117822712: goto L_0x0021;
            default: goto L_0x0020;
        };
    L_0x0020:
        goto L_0x0053;
    L_0x0021:
        r0 = "top_start";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0029:
        r0 = 4;
        goto L_0x0054;
    L_0x002b:
        r0 = "top_end";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0033:
        r0 = 3;
        goto L_0x0054;
    L_0x0035:
        r0 = "center";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x003d:
        r0 = 2;
        goto L_0x0054;
    L_0x003f:
        r0 = "bottom_end";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0047:
        r0 = 0;
        goto L_0x0054;
    L_0x0049:
        r0 = "bottom_start";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0051:
        r0 = 1;
        goto L_0x0054;
    L_0x0053:
        r0 = -1;
    L_0x0054:
        switch(r0) {
            case 0: goto L_0x006b;
            case 1: goto L_0x0066;
            case 2: goto L_0x005b;
            case 3: goto L_0x0059;
            default: goto L_0x0057;
        };
    L_0x0057:
        r1 = 0;
        goto L_0x0070;
    L_0x0059:
        r2 = r5;
        goto L_0x0057;
    L_0x005b:
        r2 = r7.getWidth();
        r2 = r2 / r3;
        r1 = r7.getHeight();
        r1 = r1 / r3;
        goto L_0x0070;
    L_0x0066:
        r1 = r7.getHeight();
        goto L_0x0070;
    L_0x006b:
        r1 = r7.getHeight();
        r2 = r5;
    L_0x0070:
        r0 = new int[r3];
        r0[r6] = r2;
        r0[r4] = r1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.imageview.CornerPunchedImageView.getPunchCenter():int[]");
    }

    public final void onDraw(Canvas canvas) {
        canvas.clipPath(this.f25941C, Op.DIFFERENCE);
        super.onDraw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1748021324);
        super.onSizeChanged(i, i2, i3, i4);
        m14421C();
        AnonymousClass0cQ.O(this, -2079388974, N);
    }
}
