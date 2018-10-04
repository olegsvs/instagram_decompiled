package com.facebook.react.views.scroll;

import X.AnonymousClass0mE;
import X.AnonymousClass2q2;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler;
import com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollToCommandData;
import com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollToEndCommandData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ReactModule(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager implements ScrollCommandHandler {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = new int[]{8, 0, 2, 1, 3};
    private FpsListener mFpsListener;

    public String getName() {
        return REACT_CLASS;
    }

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(FpsListener fpsListener) {
        this.mFpsListener = null;
        this.mFpsListener = fpsListener;
    }

    public static Map createExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        return MapBuilder.builder().put(ScrollEventType.SCROLL.getJSEventName(), MapBuilder.of(str, "onScroll")).put(ScrollEventType.BEGIN_DRAG.getJSEventName(), MapBuilder.of(str, "onScrollBeginDrag")).put(ScrollEventType.END_DRAG.getJSEventName(), MapBuilder.of(str, "onScrollEndDrag")).put(ScrollEventType.MOMENTUM_BEGIN.getJSEventName(), MapBuilder.of(str, "onMomentumScrollBegin")).put(ScrollEventType.MOMENTUM_END.getJSEventName(), MapBuilder.of(str, "onMomentumScrollEnd")).build();
    }

    public ReactScrollView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactScrollView(themedReactContext, this.mFpsListener);
    }

    public void flashScrollIndicators(ReactScrollView reactScrollView) {
        reactScrollView.flashScrollIndicators();
    }

    public Map getCommandsMap() {
        return ReactScrollViewCommandHelper.getCommandsMap();
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    public void receiveCommand(ReactScrollView reactScrollView, int i, ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactScrollView, i, readableArray);
    }

    public void scrollTo(ReactScrollView reactScrollView, ScrollToCommandData scrollToCommandData) {
        if (scrollToCommandData.mAnimated) {
            reactScrollView.smoothScrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        } else {
            reactScrollView.scrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        }
    }

    public void scrollToEnd(ReactScrollView reactScrollView, ScrollToEndCommandData scrollToEndCommandData) {
        int height = reactScrollView.getChildAt(0).getHeight() + reactScrollView.getPaddingBottom();
        if (scrollToEndCommandData.mAnimated) {
            reactScrollView.smoothScrollTo(reactScrollView.getScrollX(), height);
        } else {
            reactScrollView.scrollTo(reactScrollView.getScrollX(), height);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ReactScrollView reactScrollView, int i, Integer num) {
        float f = 1.0E21f;
        float intValue = num == null ? 1.0E21f : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        reactScrollView.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactScrollView reactScrollView, int i, float f) {
        if (!AnonymousClass2q2.B(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactScrollView.setBorderRadius(f);
        } else {
            reactScrollView.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactScrollView reactScrollView, String str) {
        reactScrollView.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ReactScrollView reactScrollView, int i, float f) {
        if (!AnonymousClass2q2.B(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactScrollView.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ReactScrollView reactScrollView, int i) {
        reactScrollView.setEndFillColor(i);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(ReactScrollView reactScrollView, float f) {
        reactScrollView.setDecelerationRate(f);
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ReactScrollView reactScrollView, boolean z) {
        AnonymousClass0mE.f9733B.e(reactScrollView, z);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(ReactScrollView reactScrollView, String str) {
        reactScrollView.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(str));
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setPagingEnabled(z);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setRemoveClippedSubviews(z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setScrollEnabled(z);
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(ReactScrollView reactScrollView, String str) {
        reactScrollView.setScrollPerfTag(str);
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSendMomentumEvents(z);
    }

    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSnapToEnd(z);
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(ReactScrollView reactScrollView, float f) {
        reactScrollView.setSnapInterval((int) (f * DisplayMetricsHolder.getScreenDisplayMetrics().density));
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(ReactScrollView reactScrollView, ReadableArray readableArray) {
        DisplayMetrics screenDisplayMetrics = DisplayMetricsHolder.getScreenDisplayMetrics();
        List arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d = readableArray.getDouble(i);
            double d2 = (double) screenDisplayMetrics.density;
            Double.isNaN(d2);
            arrayList.add(Integer.valueOf((int) (d * d2)));
        }
        reactScrollView.setSnapOffsets(arrayList);
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSnapToStart(z);
    }
}
