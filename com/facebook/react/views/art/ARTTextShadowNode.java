package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTTextShadowNode extends ARTShapeShadowNode {
    private ReadableMap mFrame;
    private int mTextAlignment = 0;

    public ARTTextShadowNode(ARTTextShadowNode aRTTextShadowNode) {
        super(aRTTextShadowNode);
        this.mTextAlignment = aRTTextShadowNode.mTextAlignment;
        this.mFrame = aRTTextShadowNode.mFrame;
    }

    private void applyTextPropertiesToPaint(Paint paint) {
        switch (this.mTextAlignment) {
            case 0:
                paint.setTextAlign(Align.LEFT);
                break;
            case 1:
                paint.setTextAlign(Align.RIGHT);
                break;
            case 2:
                paint.setTextAlign(Align.CENTER);
                break;
            default:
                break;
        }
        ReadableMap readableMap = this.mFrame;
        if (readableMap != null) {
            String str = "font";
            if (readableMap.hasKey(str)) {
                ReadableMap map = this.mFrame.getMap(str);
                if (map != null) {
                    float f = 12.0f;
                    if (map.hasKey("fontSize")) {
                        f = (float) map.getDouble("fontSize");
                    }
                    paint.setTextSize(f * this.mScale);
                    int i = 1;
                    Object obj = (map.hasKey("fontWeight") && "bold".equals(map.getString("fontWeight"))) ? 1 : null;
                    Object obj2 = (map.hasKey("fontStyle") && "italic".equals(map.getString("fontStyle"))) ? 1 : null;
                    if (obj != null && obj2 != null) {
                        i = 3;
                    } else if (obj == null) {
                        i = obj2 != null ? 2 : 0;
                    }
                    paint.setTypeface(Typeface.create(map.getString("fontFamily"), i));
                }
            }
        }
    }

    public final ARTShapeShadowNode copy() {
        return new ARTTextShadowNode(this);
    }

    public final void draw(Canvas canvas, Paint paint, float f) {
        if (this.mFrame != null) {
            f *= this.mOpacity;
            if (f > 0.01f) {
                String str = "lines";
                if (this.mFrame.hasKey(str)) {
                    ReadableArray array = this.mFrame.getArray(str);
                    if (array != null) {
                        if (array.size() != 0) {
                            Canvas canvas2 = canvas;
                            saveAndSetupCanvas(canvas);
                            String[] strArr = new String[array.size()];
                            for (int i = 0; i < strArr.length; i++) {
                                strArr[i] = array.getString(i);
                            }
                            String join = TextUtils.join("\n", strArr);
                            Paint paint2 = paint;
                            if (setupStrokePaint(paint, f)) {
                                applyTextPropertiesToPaint(paint);
                                if (this.mPath == null) {
                                    canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                                } else {
                                    canvas2.drawTextOnPath(join, this.mPath, 0.0f, 0.0f, paint2);
                                }
                            }
                            if (setupFillPaint(paint, f)) {
                                applyTextPropertiesToPaint(paint);
                                if (this.mPath == null) {
                                    canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                                } else {
                                    canvas2.drawTextOnPath(join, this.mPath, 0.0f, 0.0f, paint2);
                                }
                            }
                            ARTVirtualNode.restoreCanvas(canvas);
                            markUpdateSeen();
                        }
                    }
                }
            }
        }
    }

    @ReactProp(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.mTextAlignment = i;
    }

    @ReactProp(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.mFrame = readableMap;
    }
}
