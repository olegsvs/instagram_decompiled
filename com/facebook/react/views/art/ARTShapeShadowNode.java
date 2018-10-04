package com.facebook.react.views.art;

import X.AnonymousClass0Df;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ArrayUtils;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTShapeShadowNode extends ARTVirtualNode {
    private float[] mBrushData;
    public Path mPath;
    private int mStrokeCap = 1;
    private float[] mStrokeColor;
    private float[] mStrokeDash;
    private int mStrokeJoin = 1;
    private float mStrokeWidth = 1.0f;

    private static float modulus(float f, float f2) {
        f %= f2;
        return f < 0.0f ? f + f2 : f;
    }

    public ARTShapeShadowNode(ARTShapeShadowNode aRTShapeShadowNode) {
        super(aRTShapeShadowNode);
        this.mPath = new Path(aRTShapeShadowNode.mPath);
        this.mStrokeColor = ArrayUtils.copyArray(aRTShapeShadowNode.mStrokeColor);
        this.mBrushData = ArrayUtils.copyArray(aRTShapeShadowNode.mBrushData);
        this.mStrokeDash = ArrayUtils.copyArray(aRTShapeShadowNode.mStrokeDash);
        this.mStrokeWidth = aRTShapeShadowNode.mStrokeWidth;
        this.mStrokeCap = aRTShapeShadowNode.mStrokeCap;
        this.mStrokeJoin = aRTShapeShadowNode.mStrokeJoin;
    }

    public ARTShapeShadowNode copy() {
        return new ARTShapeShadowNode(this);
    }

    private Path createPath(float[] fArr) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i = 0;
        while (i < fArr.length) {
            int i2 = i + 1;
            i = (int) fArr[i];
            ARTVirtualNode aRTVirtualNode = this;
            int i3;
            switch (i) {
                case 0:
                    i3 = i2 + 1;
                    i = i3 + 1;
                    path.moveTo(fArr[i2] * aRTVirtualNode.mScale, fArr[i3] * aRTVirtualNode.mScale);
                    break;
                case 1:
                    path.close();
                    i = i2;
                    break;
                case 2:
                    i3 = i2 + 1;
                    i = i3 + 1;
                    path.lineTo(fArr[i2] * aRTVirtualNode.mScale, fArr[i3] * aRTVirtualNode.mScale);
                    break;
                case 3:
                    i3 = i2 + 1;
                    float f = fArr[i2] * aRTVirtualNode.mScale;
                    i2 = i3 + 1;
                    i3 = i2 + 1;
                    i2 = i3 + 1;
                    i3 = i2 + 1;
                    i = i3 + 1;
                    path.cubicTo(f, aRTVirtualNode.mScale * fArr[i3], aRTVirtualNode.mScale * fArr[i2], aRTVirtualNode.mScale * fArr[i3], aRTVirtualNode.mScale * fArr[i2], fArr[i3] * aRTVirtualNode.mScale);
                    break;
                case 4:
                    i3 = i2 + 1;
                    float f2 = fArr[i2] * aRTVirtualNode.mScale;
                    i2 = i3 + 1;
                    float f3 = fArr[i3] * aRTVirtualNode.mScale;
                    i3 = i2 + 1;
                    float f4 = fArr[i2] * aRTVirtualNode.mScale;
                    i = i3 + 1;
                    float toDegrees = (float) Math.toDegrees((double) fArr[i3]);
                    i2 = i + 1;
                    float toDegrees2 = (float) Math.toDegrees((double) fArr[i]);
                    i = i2 + 1;
                    Object obj = fArr[i2] != 1.0f ? 1 : null;
                    toDegrees2 -= toDegrees;
                    if (Math.abs(toDegrees2) < 360.0f) {
                        float modulus = modulus(toDegrees2, 360.0f);
                        if (obj != null && modulus < 360.0f) {
                            modulus = (360.0f - modulus) * -1.0f;
                        }
                        path.arcTo(new RectF(f2 - f4, f3 - f4, f2 + f4, f3 + f4), toDegrees, modulus);
                        break;
                    }
                    path.addCircle(f2, f3, f4, obj != null ? Direction.CCW : Direction.CW);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unrecognized drawing instruction ");
                    stringBuilder.append(i);
                    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
            }
        }
        return path;
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        f *= this.mOpacity;
        if (f > 0.01f) {
            saveAndSetupCanvas(canvas);
            if (this.mPath != null) {
                if (setupFillPaint(paint, f)) {
                    canvas.drawPath(this.mPath, paint);
                }
                if (setupStrokePaint(paint, f)) {
                    canvas.drawPath(this.mPath, paint);
                }
                ARTVirtualNode.restoreCanvas(canvas);
            } else {
                throw new JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
            }
        }
        markUpdateSeen();
    }

    @ReactProp(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.mBrushData = PropHelper.toFloatArray(readableArray);
        markUpdated();
    }

    @ReactProp(name = "d")
    public void setShapePath(ReadableArray readableArray) {
        this.mPath = createPath(PropHelper.toFloatArray(readableArray));
        markUpdated();
    }

    @ReactProp(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.mStrokeColor = PropHelper.toFloatArray(readableArray);
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.mStrokeCap = i;
        markUpdated();
    }

    @ReactProp(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.mStrokeDash = PropHelper.toFloatArray(readableArray);
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.mStrokeJoin = i;
        markUpdated();
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f) {
        this.mStrokeWidth = f;
        markUpdated();
    }

    public final boolean setupFillPaint(Paint paint, float f) {
        float[] fArr = this.mBrushData;
        int i = 0;
        if (fArr == null || fArr.length <= 0) {
            return false;
        }
        Paint paint2 = paint;
        paint2.reset();
        paint2.setFlags(1);
        paint2.setStyle(Style.FILL);
        float[] fArr2 = r3.mBrushData;
        int i2 = (int) fArr2[0];
        StringBuilder stringBuilder;
        switch (i2) {
            case 0:
                i2 = (int) (fArr2.length > 4 ? (fArr2[4] * f) * 255.0f : f * 255.0f);
                float[] fArr3 = r3.mBrushData;
                paint2.setARGB(i2, (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f), (int) (fArr3[3] * 255.0f));
                break;
            case 1:
                int i3 = 5;
                if (fArr2.length >= 5) {
                    float[] fArr4;
                    float f2 = fArr2[1] * r3.mScale;
                    float f3 = r3.mBrushData[2] * r3.mScale;
                    float f4 = r3.mBrushData[3] * r3.mScale;
                    float f5 = r3.mBrushData[4] * r3.mScale;
                    int length = (r3.mBrushData.length - 5) / 5;
                    int[] iArr = null;
                    if (length > 0) {
                        iArr = new int[length];
                        fArr4 = new float[length];
                        while (i < length) {
                            float[] fArr5 = r3.mBrushData;
                            fArr4[i] = fArr5[((length * 4) + i3) + i];
                            int i4 = (i * 4) + i3;
                            iArr[i] = Color.argb((int) (fArr5[i4 + 3] * 255.0f), (int) (fArr5[i4] * 255.0f), (int) (fArr5[i4 + 1] * 255.0f), (int) (fArr5[i4 + 2] * 255.0f));
                            i++;
                            i3 = 5;
                        }
                    } else {
                        fArr4 = null;
                    }
                    paint2.setShader(new LinearGradient(f2, f3, f4, f5, iArr, fArr4, TileMode.CLAMP));
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("[ARTShapeShadowNode setupFillPaint] expects 5 elements, received ");
                stringBuilder.append(r3.mBrushData.length);
                AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
                return false;
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("ART: Color type ");
                stringBuilder.append(i2);
                stringBuilder.append(" not supported!");
                AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
                break;
        }
        return true;
    }

    public final boolean setupStrokePaint(Paint paint, float f) {
        if (this.mStrokeWidth != 0.0f) {
            float[] fArr = this.mStrokeColor;
            if (fArr != null) {
                if (fArr.length != 0) {
                    StringBuilder stringBuilder;
                    paint.reset();
                    paint.setFlags(1);
                    paint.setStyle(Style.STROKE);
                    switch (this.mStrokeCap) {
                        case 0:
                            paint.setStrokeCap(Cap.BUTT);
                            break;
                        case 1:
                            paint.setStrokeCap(Cap.ROUND);
                            break;
                        case 2:
                            paint.setStrokeCap(Cap.SQUARE);
                            break;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("strokeCap ");
                            stringBuilder.append(this.mStrokeCap);
                            stringBuilder.append(" unrecognized");
                            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                    }
                    switch (this.mStrokeJoin) {
                        case 0:
                            paint.setStrokeJoin(Join.MITER);
                            break;
                        case 1:
                            paint.setStrokeJoin(Join.ROUND);
                            break;
                        case 2:
                            paint.setStrokeJoin(Join.BEVEL);
                            break;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("strokeJoin ");
                            stringBuilder.append(this.mStrokeJoin);
                            stringBuilder.append(" unrecognized");
                            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                    }
                    paint.setStrokeWidth(this.mStrokeWidth * this.mScale);
                    float[] fArr2 = this.mStrokeColor;
                    int i = (int) (fArr2.length > 3 ? (fArr2[3] * f) * 255.0f : f * 255.0f);
                    float[] fArr3 = this.mStrokeColor;
                    paint.setARGB(i, (int) (fArr3[0] * 255.0f), (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f));
                    float[] fArr4 = this.mStrokeDash;
                    if (fArr4 != null && fArr4.length > 0) {
                        paint.setPathEffect(new DashPathEffect(fArr4, 0.0f));
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
