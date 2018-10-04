package com.facebook.react.views.viewpager;

import X.AnonymousClass0LR;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

@ReactModule(name = "AndroidViewPager")
public class ReactViewPagerManager extends ViewGroupManager {
    public static final int COMMAND_SET_PAGE = 1;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    public static final String REACT_CLASS = "AndroidViewPager";

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void addView(ReactViewPager reactViewPager, View view, int i) {
        reactViewPager.addViewToAdapter(view, i);
    }

    public ReactViewPager createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactViewPager(themedReactContext);
    }

    public View getChildAt(ReactViewPager reactViewPager, int i) {
        return reactViewPager.getViewFromAdapter(i);
    }

    public int getChildCount(ReactViewPager reactViewPager) {
        return reactViewPager.getViewCountInAdapter();
    }

    public Map getCommandsMap() {
        return MapBuilder.of("setPage", Integer.valueOf(1), "setPageWithoutAnimation", Integer.valueOf(2));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        return MapBuilder.of("topPageScroll", MapBuilder.of(str, "onPageScroll"), "topPageScrollStateChanged", MapBuilder.of(str, "onPageScrollStateChanged"), "topPageSelected", MapBuilder.of(str, "onPageSelected"));
    }

    public void receiveCommand(ReactViewPager reactViewPager, int i, ReadableArray readableArray) {
        AnonymousClass0LR.D(reactViewPager);
        AnonymousClass0LR.D(readableArray);
        switch (i) {
            case 1:
                reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), true);
                return;
            case 2:
                reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), false);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), getClass().getSimpleName()}));
        }
    }

    public void removeViewAt(ReactViewPager reactViewPager, int i) {
        reactViewPager.removeViewFromAdapter(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(ReactViewPager reactViewPager, float f) {
        reactViewPager.setPageMargin((int) PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setClipToPadding(z ^ 1);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setScrollEnabled(z);
    }
}
