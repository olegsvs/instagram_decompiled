package com.facebook.react.views.text;

import X.AnonymousClass2q2;
import android.text.TextUtils.TruncateAt;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

public abstract class ReactTextAnchorViewManager extends BaseViewManager {
    private static final int[] SPACING_TYPES = new int[]{8, 0, 2, 1, 3};

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ReactTextView reactTextView, int i, Integer num) {
        float f = 1.0E21f;
        float intValue = num == null ? 1.0E21f : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        reactTextView.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactTextView reactTextView, int i, float f) {
        if (!AnonymousClass2q2.B(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactTextView.setBorderRadius(f);
        } else {
            reactTextView.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactTextView reactTextView, String str) {
        reactTextView.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ReactTextView reactTextView, int i, float f) {
        if (!AnonymousClass2q2.B(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactTextView.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(ReactTextView reactTextView, boolean z) {
        reactTextView.setEnabled(z ^ 1);
    }

    @ReactProp(name = "ellipsizeMode")
    public void setEllipsizeMode(ReactTextView reactTextView, String str) {
        if (str != null) {
            if (!str.equals("tail")) {
                if (str.equals("head")) {
                    reactTextView.setEllipsizeLocation(TruncateAt.START);
                    return;
                } else if (str.equals("middle")) {
                    reactTextView.setEllipsizeLocation(TruncateAt.MIDDLE);
                    return;
                } else if (str.equals("clip")) {
                    reactTextView.setEllipsizeLocation(null);
                    return;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid ellipsizeMode: ");
                    stringBuilder.append(str);
                    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        reactTextView.setEllipsizeLocation(TruncateAt.END);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(ReactTextView reactTextView, boolean z) {
        reactTextView.setIncludeFontPadding(z);
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(ReactTextView reactTextView, int i) {
        reactTextView.setNumberOfLines(i);
    }

    @ReactProp(name = "selectable")
    public void setSelectable(ReactTextView reactTextView, boolean z) {
        reactTextView.setTextIsSelectable(z);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactTextView reactTextView, Integer num) {
        if (num == null) {
            reactTextView.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(reactTextView.getContext()));
        } else {
            reactTextView.setHighlightColor(num.intValue());
        }
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(ReactTextView reactTextView, String str) {
        if (str != null) {
            if (!"auto".equals(str)) {
                if ("top".equals(str)) {
                    reactTextView.setGravityVertical(48);
                    return;
                } else if ("bottom".equals(str)) {
                    reactTextView.setGravityVertical(80);
                    return;
                } else if ("center".equals(str)) {
                    reactTextView.setGravityVertical(16);
                    return;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid textAlignVertical: ");
                    stringBuilder.append(str);
                    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        reactTextView.setGravityVertical(0);
    }
}
