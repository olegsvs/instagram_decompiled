package com.instagram.react.views.image;

import X.AnonymousClass2q2;
import X.AnonymousClass5tC;
import android.widget.ImageView.ScaleType;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.image.ImageLoadEvent;
import java.util.Map;

public class IgReactImageManager extends SimpleViewManager {
    public String getName() {
        return "RCTImageView";
    }

    public AnonymousClass5tC createViewInstance(ThemedReactContext themedReactContext) {
        return new AnonymousClass5tC(themedReactContext);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        return MapBuilder.of(ImageLoadEvent.eventNameForType(1), MapBuilder.of(str, "onError"), ImageLoadEvent.eventNameForType(2), MapBuilder.of(str, "onLoad"), ImageLoadEvent.eventNameForType(3), MapBuilder.of(str, "onLoadEnd"), ImageLoadEvent.eventNameForType(4), MapBuilder.of(str, "onLoadStart"));
    }

    public void onAfterUpdateTransaction(AnonymousClass5tC anonymousClass5tC) {
        super.onAfterUpdateTransaction(anonymousClass5tC);
        anonymousClass5tC.m28588G();
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(AnonymousClass5tC anonymousClass5tC, int i, float f) {
        if (!AnonymousClass2q2.B(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            anonymousClass5tC.setBorderRadius(f);
        }
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(AnonymousClass5tC anonymousClass5tC, String str) {
        anonymousClass5tC.setScaleTypeNoUpdate(toScaleType(str));
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setShouldNotifyLoadEvents(AnonymousClass5tC anonymousClass5tC, boolean z) {
        anonymousClass5tC.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "src")
    public void setSource(AnonymousClass5tC anonymousClass5tC, ReadableArray readableArray) {
        anonymousClass5tC.setSource(readableArray);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(AnonymousClass5tC anonymousClass5tC, Integer num) {
        if (num == null) {
            anonymousClass5tC.clearColorFilter();
        } else {
            anonymousClass5tC.setColorFilter(num.intValue());
        }
    }

    private static ScaleType toScaleType(String str) {
        if ("contain".equals(str)) {
            return ScaleType.FIT_CENTER;
        }
        if (!"cover".equals(str)) {
            if ("stretch".equals(str)) {
                return ScaleType.FIT_XY;
            }
            if (str != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid resize mode: '");
                stringBuilder.append(str);
                stringBuilder.append("'");
                throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
            }
        }
        return ScaleType.CENTER_CROP;
    }
}
