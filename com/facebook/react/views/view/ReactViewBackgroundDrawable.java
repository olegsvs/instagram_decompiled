package com.facebook.react.views.view;

import X.AnonymousClass2q2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.Spacing;
import java.util.Arrays;
import java.util.Locale;

public final class ReactViewBackgroundDrawable extends Drawable {
    private int mAlpha = 255;
    private Spacing mBorderAlpha;
    private float[] mBorderCornerRadii;
    private Spacing mBorderRGB;
    private float mBorderRadius = 1.0E21f;
    private BorderStyle mBorderStyle;
    private Spacing mBorderWidth;
    private Path mCenterDrawPath;
    private int mColor = 0;
    private final Context mContext;
    private PointF mInnerBottomLeftCorner;
    private PointF mInnerBottomRightCorner;
    private Path mInnerClipPathForBorderRadius;
    private RectF mInnerClipTempRectForBorderRadius;
    private PointF mInnerTopLeftCorner;
    private PointF mInnerTopRightCorner;
    private int mLayoutDirection;
    private boolean mNeedUpdatePathForBorderRadius = false;
    private Path mOuterClipPathForBorderRadius;
    private RectF mOuterClipTempRectForBorderRadius;
    private final Paint mPaint = new Paint(1);
    private PathEffect mPathEffectForBorderStyle;
    private Path mPathForBorder;
    private Path mPathForBorderRadiusOutline;
    private RectF mTempRectForBorderRadiusOutline;
    private RectF mTempRectForCenterDrawPath;

    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    public enum BorderStyle {
        SOLID,
        DASHED,
        DOTTED;

        public final PathEffect getPathEffect(float f) {
            switch (this) {
                case DASHED:
                    r1 = new float[4];
                    f *= 3.0f;
                    r1[0] = f;
                    r1[1] = f;
                    r1[2] = f;
                    r1[3] = f;
                    return new DashPathEffect(r1, 0.0f);
                case DOTTED:
                    return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
                default:
                    return null;
            }
        }
    }

    private static int colorFromAlphaAndRGBComponents(float f, float f2) {
        return ((((int) f) << 24) & -16777216) | (((int) f2) & 16777215);
    }

    private static int fastBorderCompatibleColorOrZero(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = ((i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1)) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        i9 &= i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        i5 |= i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        i5 |= i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        return i9 == (i5 | i8) ? i9 : 0;
    }

    public static final boolean onResolvedLayoutDirectionChanged(int i) {
        return false;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public ReactViewBackgroundDrawable(Context context) {
        this.mContext = context;
    }

    public final void draw(Canvas canvas) {
        updatePathEffect();
        if (hasRoundedBorders()) {
            drawRoundedBackgroundWithBorders(canvas);
        } else {
            drawRectangularBackgroundWithBorders(canvas);
        }
    }

    private void drawQuadrilateral(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i != 0) {
            if (this.mPathForBorder == null) {
                this.mPathForBorder = new Path();
            }
            this.mPaint.setColor(i);
            this.mPathForBorder.reset();
            this.mPathForBorder.moveTo(f, f2);
            this.mPathForBorder.lineTo(f3, f4);
            this.mPathForBorder.lineTo(f5, f6);
            this.mPathForBorder.lineTo(f7, f8);
            this.mPathForBorder.lineTo(f, f2);
            canvas.drawPath(this.mPathForBorder, this.mPaint);
        }
    }

    private void drawRectangularBackgroundWithBorders(Canvas canvas) {
        int multiplyColorAlpha = ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha);
        Canvas canvas2 = canvas;
        if (Color.alpha(multiplyColorAlpha) != 0) {
            r8.mPaint.setColor(multiplyColorAlpha);
            r8.mPaint.setStyle(Style.FILL);
            canvas2.drawRect(getBounds(), r8.mPaint);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int round = Math.round(directionAwareBorderInsets.left);
        int round2 = Math.round(directionAwareBorderInsets.top);
        int round3 = Math.round(directionAwareBorderInsets.right);
        int round4 = Math.round(directionAwareBorderInsets.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            int borderColor;
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            int i4;
            float f3;
            float f4;
            float f5;
            int i5;
            Rect bounds = getBounds();
            int borderColor2 = getBorderColor(0);
            int borderColor3 = getBorderColor(1);
            int borderColor4 = getBorderColor(2);
            int borderColor5 = getBorderColor(3);
            if (VERSION.SDK_INT >= 17) {
                Object obj = getResolvedLayoutDirection() == 1 ? 1 : null;
                borderColor = getBorderColor(4);
                int borderColor6 = getBorderColor(5);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(r8.mContext)) {
                    if (isBorderColorDefined(4)) {
                        borderColor2 = borderColor;
                    }
                    if (isBorderColorDefined(5)) {
                        borderColor4 = borderColor6;
                    }
                    i = obj != null ? borderColor4 : borderColor2;
                    if (obj == null) {
                        borderColor2 = borderColor4;
                    }
                } else {
                    i2 = obj != null ? borderColor6 : borderColor;
                    if (obj == null) {
                        borderColor = borderColor6;
                    }
                    boolean isBorderColorDefined = isBorderColorDefined(4);
                    boolean isBorderColorDefined2 = isBorderColorDefined(5);
                    boolean z = obj != null ? isBorderColorDefined2 : isBorderColorDefined;
                    if (obj == null) {
                        isBorderColorDefined = isBorderColorDefined2;
                    }
                    if (z) {
                        borderColor2 = i2;
                    }
                    if (isBorderColorDefined) {
                        i = borderColor2;
                        borderColor2 = borderColor;
                    }
                }
                i3 = bounds.left;
                borderColor = bounds.top;
                multiplyColorAlpha = fastBorderCompatibleColorOrZero(round, round2, round3, round4, i, borderColor3, borderColor2, borderColor5);
                if (multiplyColorAlpha != 0) {
                    r8.mPaint.setAntiAlias(false);
                    i2 = bounds.width();
                    borderColor4 = bounds.height();
                    if (round > 0) {
                        f = (float) i3;
                        f2 = (float) (i3 + round);
                        i4 = borderColor + borderColor4;
                        drawQuadrilateral(canvas2, i, f, (float) borderColor, f2, (float) (borderColor + round2), f2, (float) (i4 - round4), f, (float) i4);
                    }
                    if (round2 > 0) {
                        f3 = (float) borderColor;
                        f4 = (float) (borderColor + round2);
                        i4 = i3 + i2;
                        drawQuadrilateral(canvas2, borderColor3, (float) i3, f3, (float) (i3 + round), f4, (float) (i4 - round3), f4, (float) i4, f3);
                    }
                    if (round3 > 0) {
                        multiplyColorAlpha = i3 + i2;
                        f = (float) multiplyColorAlpha;
                        i4 = borderColor + borderColor4;
                        f4 = (float) (multiplyColorAlpha - round3);
                        drawQuadrilateral(canvas2, borderColor2, f, (float) borderColor, f, (float) i4, f4, (float) (i4 - round4), f4, (float) (borderColor + round2));
                    }
                    if (round4 > 0) {
                        borderColor += borderColor4;
                        f3 = (float) borderColor;
                        i4 = i3 + i2;
                        f5 = (float) (borderColor - round4);
                        drawQuadrilateral(canvas2, borderColor5, (float) i3, f3, (float) i4, f3, (float) (i4 - round3), f5, (float) (i3 + round), f5);
                    }
                    r8.mPaint.setAntiAlias(true);
                } else if (Color.alpha(multiplyColorAlpha) != 0) {
                    borderColor4 = bounds.right;
                    i5 = bounds.bottom;
                    r8.mPaint.setColor(multiplyColorAlpha);
                    if (round > 0) {
                        canvas2.drawRect((float) i3, (float) borderColor, (float) (i3 + round), (float) (i5 - round4), r8.mPaint);
                    }
                    if (round2 > 0) {
                        canvas2.drawRect((float) (i3 + round), (float) borderColor, (float) borderColor4, (float) (borderColor + round2), r8.mPaint);
                    }
                    if (round3 > 0) {
                        canvas2.drawRect((float) (borderColor4 - round3), (float) (borderColor + round2), (float) borderColor4, (float) i5, r8.mPaint);
                    }
                    if (round4 > 0) {
                        canvas2.drawRect((float) i3, (float) (i5 - round4), (float) (borderColor4 - round3), (float) i5, r8.mPaint);
                    }
                }
            }
            i = borderColor2;
            borderColor2 = borderColor4;
            i3 = bounds.left;
            borderColor = bounds.top;
            multiplyColorAlpha = fastBorderCompatibleColorOrZero(round, round2, round3, round4, i, borderColor3, borderColor2, borderColor5);
            if (multiplyColorAlpha != 0) {
                r8.mPaint.setAntiAlias(false);
                i2 = bounds.width();
                borderColor4 = bounds.height();
                if (round > 0) {
                    f = (float) i3;
                    f2 = (float) (i3 + round);
                    i4 = borderColor + borderColor4;
                    drawQuadrilateral(canvas2, i, f, (float) borderColor, f2, (float) (borderColor + round2), f2, (float) (i4 - round4), f, (float) i4);
                }
                if (round2 > 0) {
                    f3 = (float) borderColor;
                    f4 = (float) (borderColor + round2);
                    i4 = i3 + i2;
                    drawQuadrilateral(canvas2, borderColor3, (float) i3, f3, (float) (i3 + round), f4, (float) (i4 - round3), f4, (float) i4, f3);
                }
                if (round3 > 0) {
                    multiplyColorAlpha = i3 + i2;
                    f = (float) multiplyColorAlpha;
                    i4 = borderColor + borderColor4;
                    f4 = (float) (multiplyColorAlpha - round3);
                    drawQuadrilateral(canvas2, borderColor2, f, (float) borderColor, f, (float) i4, f4, (float) (i4 - round4), f4, (float) (borderColor + round2));
                }
                if (round4 > 0) {
                    borderColor += borderColor4;
                    f3 = (float) borderColor;
                    i4 = i3 + i2;
                    f5 = (float) (borderColor - round4);
                    drawQuadrilateral(canvas2, borderColor5, (float) i3, f3, (float) i4, f3, (float) (i4 - round3), f5, (float) (i3 + round), f5);
                }
                r8.mPaint.setAntiAlias(true);
            } else if (Color.alpha(multiplyColorAlpha) != 0) {
                borderColor4 = bounds.right;
                i5 = bounds.bottom;
                r8.mPaint.setColor(multiplyColorAlpha);
                if (round > 0) {
                    canvas2.drawRect((float) i3, (float) borderColor, (float) (i3 + round), (float) (i5 - round4), r8.mPaint);
                }
                if (round2 > 0) {
                    canvas2.drawRect((float) (i3 + round), (float) borderColor, (float) borderColor4, (float) (borderColor + round2), r8.mPaint);
                }
                if (round3 > 0) {
                    canvas2.drawRect((float) (borderColor4 - round3), (float) (borderColor + round2), (float) borderColor4, (float) i5, r8.mPaint);
                }
                if (round4 > 0) {
                    canvas2.drawRect((float) i3, (float) (i5 - round4), (float) (borderColor4 - round3), (float) i5, r8.mPaint);
                }
            }
        }
    }

    private void drawRoundedBackgroundWithBorders(Canvas canvas) {
        updatePath();
        Canvas canvas2 = canvas;
        canvas2.save();
        int multiplyColorAlpha = ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(multiplyColorAlpha) != 0) {
            r11.mPaint.setColor(multiplyColorAlpha);
            r11.mPaint.setStyle(Style.FILL);
            canvas2.drawPath(r11.mInnerClipPathForBorderRadius, r11.mPaint);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        if (directionAwareBorderInsets.top > 0.0f || directionAwareBorderInsets.bottom > 0.0f || directionAwareBorderInsets.left > 0.0f || directionAwareBorderInsets.right > 0.0f) {
            float fullBorderWidth = getFullBorderWidth();
            if (directionAwareBorderInsets.top != fullBorderWidth || directionAwareBorderInsets.bottom != fullBorderWidth || directionAwareBorderInsets.left != fullBorderWidth || directionAwareBorderInsets.right != fullBorderWidth) {
                int i;
                float f;
                float f2;
                float f3;
                float f4;
                float f5;
                r11.mPaint.setStyle(Style.FILL);
                canvas2.clipPath(r11.mOuterClipPathForBorderRadius, Op.INTERSECT);
                canvas2.clipPath(r11.mInnerClipPathForBorderRadius, Op.DIFFERENCE);
                int i2 = 0;
                int borderColor = getBorderColor(0);
                int borderColor2 = getBorderColor(1);
                int borderColor3 = getBorderColor(2);
                int borderColor4 = getBorderColor(3);
                if (VERSION.SDK_INT >= 17) {
                    if (getResolvedLayoutDirection() == 1) {
                        i2 = 1;
                    }
                    int borderColor5 = getBorderColor(4);
                    int borderColor6 = getBorderColor(5);
                    if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(r11.mContext)) {
                        if (isBorderColorDefined(4)) {
                            borderColor = borderColor5;
                        }
                        if (isBorderColorDefined(5)) {
                            borderColor3 = borderColor6;
                        }
                        i = i2 != 0 ? borderColor3 : borderColor;
                        if (i2 == 0) {
                            borderColor = borderColor3;
                        }
                    } else {
                        int i3 = i2 != 0 ? borderColor6 : borderColor5;
                        if (i2 == 0) {
                            borderColor5 = borderColor6;
                        }
                        boolean isBorderColorDefined = isBorderColorDefined(4);
                        boolean isBorderColorDefined2 = isBorderColorDefined(5);
                        boolean z = i2 != 0 ? isBorderColorDefined2 : isBorderColorDefined;
                        if (i2 == 0) {
                            isBorderColorDefined = isBorderColorDefined2;
                        }
                        if (z) {
                            borderColor = i3;
                        }
                        if (isBorderColorDefined) {
                            i = borderColor;
                            borderColor = borderColor5;
                        }
                    }
                    f = r11.mOuterClipTempRectForBorderRadius.left;
                    f2 = r11.mOuterClipTempRectForBorderRadius.right;
                    f3 = r11.mOuterClipTempRectForBorderRadius.top;
                    fullBorderWidth = r11.mOuterClipTempRectForBorderRadius.bottom;
                    if (directionAwareBorderInsets.left <= 0.0f) {
                        f4 = f3;
                        f5 = f;
                        drawQuadrilateral(canvas2, i, f, f3, r11.mInnerTopLeftCorner.x, r11.mInnerTopLeftCorner.y, r11.mInnerBottomLeftCorner.x, r11.mInnerBottomLeftCorner.y, f, fullBorderWidth);
                    } else {
                        f4 = f3;
                        f5 = f;
                    }
                    if (directionAwareBorderInsets.top > 0.0f) {
                        drawQuadrilateral(canvas2, borderColor2, f5, f4, r11.mInnerTopLeftCorner.x, r11.mInnerTopLeftCorner.y, r11.mInnerTopRightCorner.x, r11.mInnerTopRightCorner.y, f2, f3);
                    }
                    if (directionAwareBorderInsets.right > 0.0f) {
                        drawQuadrilateral(canvas2, borderColor, f2, f3, r11.mInnerTopRightCorner.x, r11.mInnerTopRightCorner.y, r11.mInnerBottomRightCorner.x, r11.mInnerBottomRightCorner.y, f2, fullBorderWidth);
                    }
                    if (directionAwareBorderInsets.bottom > 0.0f) {
                        drawQuadrilateral(canvas2, borderColor4, f, fullBorderWidth, r11.mInnerBottomLeftCorner.x, r11.mInnerBottomLeftCorner.y, r11.mInnerBottomRightCorner.x, r11.mInnerBottomRightCorner.y, f2, fullBorderWidth);
                    }
                }
                i = borderColor;
                borderColor = borderColor3;
                f = r11.mOuterClipTempRectForBorderRadius.left;
                f2 = r11.mOuterClipTempRectForBorderRadius.right;
                f3 = r11.mOuterClipTempRectForBorderRadius.top;
                fullBorderWidth = r11.mOuterClipTempRectForBorderRadius.bottom;
                if (directionAwareBorderInsets.left <= 0.0f) {
                    f4 = f3;
                    f5 = f;
                } else {
                    f4 = f3;
                    f5 = f;
                    drawQuadrilateral(canvas2, i, f, f3, r11.mInnerTopLeftCorner.x, r11.mInnerTopLeftCorner.y, r11.mInnerBottomLeftCorner.x, r11.mInnerBottomLeftCorner.y, f, fullBorderWidth);
                }
                if (directionAwareBorderInsets.top > 0.0f) {
                    drawQuadrilateral(canvas2, borderColor2, f5, f4, r11.mInnerTopLeftCorner.x, r11.mInnerTopLeftCorner.y, r11.mInnerTopRightCorner.x, r11.mInnerTopRightCorner.y, f2, f3);
                }
                if (directionAwareBorderInsets.right > 0.0f) {
                    drawQuadrilateral(canvas2, borderColor, f2, f3, r11.mInnerTopRightCorner.x, r11.mInnerTopRightCorner.y, r11.mInnerBottomRightCorner.x, r11.mInnerBottomRightCorner.y, f2, fullBorderWidth);
                }
                if (directionAwareBorderInsets.bottom > 0.0f) {
                    drawQuadrilateral(canvas2, borderColor4, f, fullBorderWidth, r11.mInnerBottomLeftCorner.x, r11.mInnerBottomLeftCorner.y, r11.mInnerBottomRightCorner.x, r11.mInnerBottomRightCorner.y, f2, fullBorderWidth);
                }
            } else if (fullBorderWidth > 0.0f) {
                r11.mPaint.setColor(ColorUtil.multiplyColorAlpha(getBorderColor(8), r11.mAlpha));
                r11.mPaint.setStyle(Style.STROKE);
                r11.mPaint.setStrokeWidth(fullBorderWidth);
                canvas2.drawPath(r11.mCenterDrawPath, r11.mPaint);
            }
        }
        canvas2.restore();
    }

    public final int getAlpha() {
        return this.mAlpha;
    }

    private int getBorderColor(int i) {
        Spacing spacing = this.mBorderRGB;
        float f = spacing != null ? spacing.get(i) : 0.0f;
        spacing = this.mBorderAlpha;
        return colorFromAlphaAndRGBComponents(spacing != null ? spacing.get(i) : 255.0f, f);
    }

    public final float getBorderRadius(BorderRadiusLocation borderRadiusLocation) {
        return getBorderRadiusOrDefaultTo(1.0E21f, borderRadiusLocation);
    }

    public final float getBorderRadiusOrDefaultTo(float f, BorderRadiusLocation borderRadiusLocation) {
        float[] fArr = this.mBorderCornerRadii;
        if (fArr != null) {
            float f2 = fArr[borderRadiusLocation.ordinal()];
            if (!AnonymousClass2q2.B(f2)) {
                return f2;
            }
        }
        return f;
    }

    public final float getBorderWidthOrDefaultTo(float f, int i) {
        Spacing spacing = this.mBorderWidth;
        if (spacing != null) {
            float raw = spacing.getRaw(i);
            if (!AnonymousClass2q2.B(raw)) {
                return raw;
            }
        }
        return f;
    }

    public final int getColor() {
        return this.mColor;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF getDirectionAwareBorderInsets() {
        /*
        r9 = this;
        r1 = 0;
        r0 = 8;
        r1 = r9.getBorderWidthOrDefaultTo(r1, r0);
        r8 = 1;
        r6 = r9.getBorderWidthOrDefaultTo(r1, r8);
        r0 = 3;
        r5 = r9.getBorderWidthOrDefaultTo(r1, r0);
        r0 = 0;
        r7 = r9.getBorderWidthOrDefaultTo(r1, r0);
        r0 = 2;
        r4 = r9.getBorderWidthOrDefaultTo(r1, r0);
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 17;
        if (r1 < r0) goto L_0x0075;
    L_0x0021:
        r0 = r9.mBorderWidth;
        if (r0 == 0) goto L_0x0075;
    L_0x0025:
        r0 = r9.getResolvedLayoutDirection();
        if (r0 != r8) goto L_0x002c;
    L_0x002b:
        goto L_0x002d;
    L_0x002c:
        r8 = 0;
    L_0x002d:
        r1 = r9.mBorderWidth;
        r0 = 4;
        r3 = r1.getRaw(r0);
        r1 = r9.mBorderWidth;
        r0 = 5;
        r2 = r1.getRaw(r0);
        r1 = com.facebook.react.modules.i18nmanager.I18nUtil.getInstance();
        r0 = r9.mContext;
        r0 = r1.doLeftAndRightSwapInRTL(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x0047:
        r0 = X.AnonymousClass2q2.B(r3);
        if (r0 == 0) goto L_0x004e;
    L_0x004d:
        r3 = r7;
    L_0x004e:
        r0 = X.AnonymousClass2q2.B(r2);
        if (r0 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0056;
    L_0x0055:
        r4 = r2;
    L_0x0056:
        if (r8 == 0) goto L_0x005a;
    L_0x0058:
        r7 = r4;
        goto L_0x005b;
    L_0x005a:
        r7 = r3;
    L_0x005b:
        if (r8 == 0) goto L_0x0075;
    L_0x005d:
        goto L_0x0074;
    L_0x005e:
        if (r8 == 0) goto L_0x0062;
    L_0x0060:
        r1 = r2;
        goto L_0x0063;
    L_0x0062:
        r1 = r3;
    L_0x0063:
        if (r8 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0067;
    L_0x0066:
        r3 = r2;
    L_0x0067:
        r0 = X.AnonymousClass2q2.B(r1);
        if (r0 != 0) goto L_0x006e;
    L_0x006d:
        r7 = r1;
    L_0x006e:
        r0 = X.AnonymousClass2q2.B(r3);
        if (r0 != 0) goto L_0x0075;
    L_0x0074:
        r4 = r3;
    L_0x0075:
        r0 = new android.graphics.RectF;
        r0.<init>(r7, r6, r4, r5);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewBackgroundDrawable.getDirectionAwareBorderInsets():android.graphics.RectF");
    }

    private static void getEllipseIntersectionWithLine(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        d5 -= d9;
        d6 -= d10;
        double d11 = d8 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        d11 = (d11 - d6) / ((d7 - d9) - d5);
        d6 -= d5 * d11;
        abs2 *= abs2;
        double d12 = abs * abs;
        double d13 = abs2 + ((d12 * d11) * d11);
        double d14 = (((abs * 2.0d) * abs) * d6) * d11;
        abs2 = (-(d12 * ((d6 * d6) - abs2))) / d13;
        d13 *= 2.0d;
        double sqrt = ((-d14) / d13) - Math.sqrt(abs2 + Math.pow(d14 / d13, 2.0d));
        sqrt += d9;
        d11 = ((d11 * sqrt) + d6) + d10;
        if (!Double.isNaN(sqrt) && !Double.isNaN(d11)) {
            float f = (float) sqrt;
            PointF pointF2 = pointF;
            pointF2.x = f;
            pointF2.y = (float) d11;
        }
    }

    public final float getFullBorderRadius() {
        return AnonymousClass2q2.B(this.mBorderRadius) ? 0.0f : this.mBorderRadius;
    }

    public final float getFullBorderWidth() {
        Spacing spacing = this.mBorderWidth;
        return (spacing == null || AnonymousClass2q2.B(spacing.getRaw(8))) ? 0.0f : this.mBorderWidth.getRaw(8);
    }

    public final int getOpacity() {
        return ColorUtil.getOpacityFromColor(ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha));
    }

    public final void getOutline(Outline outline) {
        if (VERSION.SDK_INT < 21) {
            super.getOutline(outline);
            return;
        }
        if ((AnonymousClass2q2.B(this.mBorderRadius) || this.mBorderRadius <= 0.0f) && this.mBorderCornerRadii == null) {
            outline.setRect(getBounds());
        } else {
            updatePath();
            outline.setConvexPath(this.mPathForBorderRadiusOutline);
        }
    }

    public final int getResolvedLayoutDirection() {
        return this.mLayoutDirection;
    }

    public final boolean hasRoundedBorders() {
        if (AnonymousClass2q2.B(this.mBorderRadius) || this.mBorderRadius <= 0.0f) {
            float[] fArr = this.mBorderCornerRadii;
            if (fArr != null) {
                int length = fArr.length;
                int i = 0;
                while (i < length) {
                    float f = fArr[i];
                    if (AnonymousClass2q2.B(f) || f <= 0.0f) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    private boolean isBorderColorDefined(int i) {
        Spacing spacing = this.mBorderRGB;
        float f = 1.0E21f;
        float f2 = spacing != null ? spacing.get(i) : 1.0E21f;
        spacing = this.mBorderAlpha;
        if (spacing != null) {
            f = spacing.get(i);
        }
        return (AnonymousClass2q2.B(f2) || AnonymousClass2q2.B(f)) ? false : true;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public final void setAlpha(int i) {
        if (i != this.mAlpha) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    private void setBorderAlpha(int i, float f) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i), f)) {
            this.mBorderAlpha.set(i, f);
            invalidateSelf();
        }
    }

    public final void setBorderColor(int i, float f, float f2) {
        setBorderRGB(i, f);
        setBorderAlpha(i, f2);
    }

    private void setBorderRGB(int i, float f) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i), f)) {
            this.mBorderRGB.set(i, f);
            invalidateSelf();
        }
    }

    public final void setBorderStyle(String str) {
        BorderStyle borderStyle;
        if (str == null) {
            borderStyle = null;
        } else {
            borderStyle = BorderStyle.valueOf(str.toUpperCase(Locale.US));
        }
        if (this.mBorderStyle != borderStyle) {
            this.mBorderStyle = borderStyle;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public final void setBorderWidth(int i, float f) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (!FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i), f)) {
            this.mBorderWidth.set(i, f);
            if (i != 8) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    default:
                        break;
                }
            }
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public final void setColor(int i) {
        this.mColor = i;
        invalidateSelf();
    }

    public final void setRadius(float f) {
        if (!FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            this.mBorderRadius = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public final void setRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            float[] fArr = new float[8];
            this.mBorderCornerRadii = fArr;
            Arrays.fill(fArr, 1.0E21f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            this.mBorderCornerRadii[i] = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public final boolean setResolvedLayoutDirection(int i) {
        if (this.mLayoutDirection == i) {
            return false;
        }
        this.mLayoutDirection = i;
        return onResolvedLayoutDirectionChanged(i);
    }

    private void updatePath() {
        if (this.mNeedUpdatePathForBorderRadius) {
            float borderRadius;
            r0.mNeedUpdatePathForBorderRadius = false;
            if (r0.mInnerClipPathForBorderRadius == null) {
                r0.mInnerClipPathForBorderRadius = new Path();
            }
            if (r0.mOuterClipPathForBorderRadius == null) {
                r0.mOuterClipPathForBorderRadius = new Path();
            }
            if (r0.mPathForBorderRadiusOutline == null) {
                r0.mPathForBorderRadiusOutline = new Path();
            }
            if (r0.mCenterDrawPath == null) {
                r0.mCenterDrawPath = new Path();
            }
            if (r0.mInnerClipTempRectForBorderRadius == null) {
                r0.mInnerClipTempRectForBorderRadius = new RectF();
            }
            if (r0.mOuterClipTempRectForBorderRadius == null) {
                r0.mOuterClipTempRectForBorderRadius = new RectF();
            }
            if (r0.mTempRectForBorderRadiusOutline == null) {
                r0.mTempRectForBorderRadiusOutline = new RectF();
            }
            if (r0.mTempRectForCenterDrawPath == null) {
                r0.mTempRectForCenterDrawPath = new RectF();
            }
            r0.mInnerClipPathForBorderRadius.reset();
            r0.mOuterClipPathForBorderRadius.reset();
            r0.mPathForBorderRadiusOutline.reset();
            r0.mCenterDrawPath.reset();
            r0.mInnerClipTempRectForBorderRadius.set(getBounds());
            r0.mOuterClipTempRectForBorderRadius.set(getBounds());
            r0.mTempRectForBorderRadiusOutline.set(getBounds());
            r0.mTempRectForCenterDrawPath.set(getBounds());
            float fullBorderWidth = getFullBorderWidth();
            if (fullBorderWidth > 0.0f) {
                fullBorderWidth *= 0.5f;
                r0.mTempRectForCenterDrawPath.inset(fullBorderWidth, fullBorderWidth);
            }
            RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
            RectF rectF = r0.mInnerClipTempRectForBorderRadius;
            rectF.top += directionAwareBorderInsets.top;
            rectF = r0.mInnerClipTempRectForBorderRadius;
            rectF.bottom -= directionAwareBorderInsets.bottom;
            rectF = r0.mInnerClipTempRectForBorderRadius;
            rectF.left += directionAwareBorderInsets.left;
            rectF = r0.mInnerClipTempRectForBorderRadius;
            rectF.right -= directionAwareBorderInsets.right;
            fullBorderWidth = getFullBorderRadius();
            float borderRadiusOrDefaultTo = getBorderRadiusOrDefaultTo(fullBorderWidth, BorderRadiusLocation.TOP_LEFT);
            float borderRadiusOrDefaultTo2 = getBorderRadiusOrDefaultTo(fullBorderWidth, BorderRadiusLocation.TOP_RIGHT);
            float borderRadiusOrDefaultTo3 = getBorderRadiusOrDefaultTo(fullBorderWidth, BorderRadiusLocation.BOTTOM_LEFT);
            float borderRadiusOrDefaultTo4 = getBorderRadiusOrDefaultTo(fullBorderWidth, BorderRadiusLocation.BOTTOM_RIGHT);
            if (VERSION.SDK_INT >= 17) {
                Object obj = getResolvedLayoutDirection() == 1 ? 1 : null;
                float borderRadius2 = getBorderRadius(BorderRadiusLocation.TOP_START);
                float borderRadius3 = getBorderRadius(BorderRadiusLocation.TOP_END);
                float borderRadius4 = getBorderRadius(BorderRadiusLocation.BOTTOM_START);
                borderRadius = getBorderRadius(BorderRadiusLocation.BOTTOM_END);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(r0.mContext)) {
                    if (!AnonymousClass2q2.B(borderRadius2)) {
                        borderRadiusOrDefaultTo = borderRadius2;
                    }
                    if (!AnonymousClass2q2.B(borderRadius3)) {
                        borderRadiusOrDefaultTo2 = borderRadius3;
                    }
                    if (!AnonymousClass2q2.B(borderRadius4)) {
                        borderRadiusOrDefaultTo3 = borderRadius4;
                    }
                    if (!AnonymousClass2q2.B(borderRadius)) {
                        borderRadiusOrDefaultTo4 = borderRadius;
                    }
                    fullBorderWidth = obj != null ? borderRadiusOrDefaultTo2 : borderRadiusOrDefaultTo;
                    if (obj != null) {
                        borderRadiusOrDefaultTo2 = borderRadiusOrDefaultTo;
                    }
                    float f = obj != null ? borderRadiusOrDefaultTo4 : borderRadiusOrDefaultTo3;
                    if (obj != null) {
                        borderRadiusOrDefaultTo4 = borderRadiusOrDefaultTo3;
                    }
                    borderRadiusOrDefaultTo3 = f;
                    borderRadiusOrDefaultTo = fullBorderWidth;
                } else {
                    float f2 = obj != null ? borderRadius3 : borderRadius2;
                    if (obj == null) {
                        borderRadius2 = borderRadius3;
                    }
                    fullBorderWidth = obj != null ? borderRadius : borderRadius4;
                    if (obj == null) {
                        borderRadius4 = borderRadius;
                    }
                    if (!AnonymousClass2q2.B(f2)) {
                        borderRadiusOrDefaultTo = f2;
                    }
                    if (!AnonymousClass2q2.B(borderRadius2)) {
                        borderRadiusOrDefaultTo2 = borderRadius2;
                    }
                    if (!AnonymousClass2q2.B(fullBorderWidth)) {
                        borderRadiusOrDefaultTo3 = fullBorderWidth;
                    }
                    if (!AnonymousClass2q2.B(borderRadius4)) {
                        borderRadiusOrDefaultTo4 = borderRadius4;
                    }
                }
            }
            r0.mInnerClipPathForBorderRadius.addRoundRect(r0.mInnerClipTempRectForBorderRadius, new float[]{Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.left, 0.0f), Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.top, 0.0f), Math.max(borderRadiusOrDefaultTo2 - directionAwareBorderInsets.right, 0.0f), Math.max(borderRadiusOrDefaultTo2 - directionAwareBorderInsets.top, 0.0f), Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.right, 0.0f), Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.bottom, 0.0f), Math.max(borderRadiusOrDefaultTo3 - directionAwareBorderInsets.left, 0.0f), Math.max(borderRadiusOrDefaultTo3 - directionAwareBorderInsets.bottom, 0.0f)}, Direction.CW);
            r0.mOuterClipPathForBorderRadius.addRoundRect(r0.mOuterClipTempRectForBorderRadius, new float[]{borderRadiusOrDefaultTo, borderRadiusOrDefaultTo, borderRadiusOrDefaultTo2, borderRadiusOrDefaultTo2, borderRadiusOrDefaultTo4, borderRadiusOrDefaultTo4, borderRadiusOrDefaultTo3, borderRadiusOrDefaultTo3}, Direction.CW);
            Spacing spacing = r0.mBorderWidth;
            borderRadius = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            Path path = r0.mPathForBorderRadiusOutline;
            directionAwareBorderInsets = r0.mTempRectForBorderRadiusOutline;
            r2 = new float[8];
            borderRadiusOrDefaultTo += borderRadius;
            r2[0] = borderRadiusOrDefaultTo;
            r2[1] = borderRadiusOrDefaultTo;
            borderRadiusOrDefaultTo2 += borderRadius;
            r2[2] = borderRadiusOrDefaultTo2;
            r2[3] = borderRadiusOrDefaultTo2;
            borderRadiusOrDefaultTo4 += borderRadius;
            r2[4] = borderRadiusOrDefaultTo4;
            r2[5] = borderRadiusOrDefaultTo4;
            borderRadiusOrDefaultTo3 += borderRadius;
            r2[6] = borderRadiusOrDefaultTo3;
            r2[7] = borderRadiusOrDefaultTo3;
            path.addRoundRect(directionAwareBorderInsets, r2, Direction.CW);
            r0.mCenterDrawPath.addRoundRect(r0.mTempRectForCenterDrawPath, new float[]{r23 + borderRadius, r15 + borderRadius, r22 + borderRadius, r21 + borderRadius, r20 + borderRadius, r19 + borderRadius, r18 + borderRadius, r17 + borderRadius}, Direction.CW);
            if (r0.mInnerTopLeftCorner == null) {
                r0.mInnerTopLeftCorner = new PointF();
            }
            r0.mInnerTopLeftCorner.x = r0.mInnerClipTempRectForBorderRadius.left;
            r0.mInnerTopLeftCorner.y = r0.mInnerClipTempRectForBorderRadius.top;
            getEllipseIntersectionWithLine((double) r0.mInnerClipTempRectForBorderRadius.left, (double) r0.mInnerClipTempRectForBorderRadius.top, (double) (r0.mInnerClipTempRectForBorderRadius.left + (r23 * 2.0f)), (double) (r0.mInnerClipTempRectForBorderRadius.top + (r15 * 2.0f)), (double) r0.mOuterClipTempRectForBorderRadius.left, (double) r0.mOuterClipTempRectForBorderRadius.top, (double) r0.mInnerClipTempRectForBorderRadius.left, (double) r0.mInnerClipTempRectForBorderRadius.top, r0.mInnerTopLeftCorner);
            if (r0.mInnerBottomLeftCorner == null) {
                r0.mInnerBottomLeftCorner = new PointF();
            }
            r0.mInnerBottomLeftCorner.x = r0.mInnerClipTempRectForBorderRadius.left;
            r0.mInnerBottomLeftCorner.y = r0.mInnerClipTempRectForBorderRadius.bottom;
            getEllipseIntersectionWithLine((double) r0.mInnerClipTempRectForBorderRadius.left, (double) (r0.mInnerClipTempRectForBorderRadius.bottom - (r17 * 2.0f)), (double) (r0.mInnerClipTempRectForBorderRadius.left + (r18 * 2.0f)), (double) r0.mInnerClipTempRectForBorderRadius.bottom, (double) r0.mOuterClipTempRectForBorderRadius.left, (double) r0.mOuterClipTempRectForBorderRadius.bottom, (double) r0.mInnerClipTempRectForBorderRadius.left, (double) r0.mInnerClipTempRectForBorderRadius.bottom, r0.mInnerBottomLeftCorner);
            if (r0.mInnerTopRightCorner == null) {
                r0.mInnerTopRightCorner = new PointF();
            }
            r0.mInnerTopRightCorner.x = r0.mInnerClipTempRectForBorderRadius.right;
            r0.mInnerTopRightCorner.y = r0.mInnerClipTempRectForBorderRadius.top;
            getEllipseIntersectionWithLine((double) (r0.mInnerClipTempRectForBorderRadius.right - (r22 * 2.0f)), (double) r0.mInnerClipTempRectForBorderRadius.top, (double) r0.mInnerClipTempRectForBorderRadius.right, (double) (r0.mInnerClipTempRectForBorderRadius.top + (r21 * 2.0f)), (double) r0.mOuterClipTempRectForBorderRadius.right, (double) r0.mOuterClipTempRectForBorderRadius.top, (double) r0.mInnerClipTempRectForBorderRadius.right, (double) r0.mInnerClipTempRectForBorderRadius.top, r0.mInnerTopRightCorner);
            if (r0.mInnerBottomRightCorner == null) {
                r0.mInnerBottomRightCorner = new PointF();
            }
            r0.mInnerBottomRightCorner.x = r0.mInnerClipTempRectForBorderRadius.right;
            r0.mInnerBottomRightCorner.y = r0.mInnerClipTempRectForBorderRadius.bottom;
            getEllipseIntersectionWithLine((double) (r0.mInnerClipTempRectForBorderRadius.right - (r20 * 2.0f)), (double) (r0.mInnerClipTempRectForBorderRadius.bottom - (r19 * 2.0f)), (double) r0.mInnerClipTempRectForBorderRadius.right, (double) r0.mInnerClipTempRectForBorderRadius.bottom, (double) r0.mOuterClipTempRectForBorderRadius.right, (double) r0.mOuterClipTempRectForBorderRadius.bottom, (double) r0.mInnerClipTempRectForBorderRadius.right, (double) r0.mInnerClipTempRectForBorderRadius.bottom, r0.mInnerBottomRightCorner);
        }
    }

    private void updatePathEffect() {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPathEffectForBorderStyle = borderStyle != null ? borderStyle.getPathEffect(getFullBorderWidth()) : null;
        this.mPaint.setPathEffect(this.mPathEffectForBorderStyle);
    }
}
