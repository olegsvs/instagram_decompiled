package com.facebook.react.views.swiperefresh;

import X.AnonymousClass1nj;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

@ReactModule(name = "AndroidSwipeRefreshLayout")
public class SwipeRefreshLayoutManager extends ViewGroupManager {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";

    public String getName() {
        return REACT_CLASS;
    }

    public void addEventEmitters(final ThemedReactContext themedReactContext, final ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
        reactSwipeRefreshLayout.setOnRefreshListener(new AnonymousClass1nj() {
            public final void onRefresh() {
                ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new RefreshEvent(reactSwipeRefreshLayout.getId()));
            }
        });
    }

    public ReactSwipeRefreshLayout createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactSwipeRefreshLayout(themedReactContext);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("topRefresh", MapBuilder.of("registrationName", "onRefresh")).build();
    }

    public Map getExportedViewConstants() {
        return MapBuilder.of("SIZE", MapBuilder.of("DEFAULT", Integer.valueOf(1), "LARGE", Integer.valueOf(0)));
    }

    @ReactProp(customType = "ColorArray", name = "colors")
    public void setColors(ReactSwipeRefreshLayout reactSwipeRefreshLayout, ReadableArray readableArray) {
        int i = 0;
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            while (i < readableArray.size()) {
                iArr[i] = readableArray.getInt(i);
                i++;
            }
            reactSwipeRefreshLayout.setColorSchemeColors(iArr);
            return;
        }
        reactSwipeRefreshLayout.setColorSchemeColors(new int[0]);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setEnabled(z);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "progressBackgroundColor")
    public void setProgressBackgroundColor(ReactSwipeRefreshLayout reactSwipeRefreshLayout, int i) {
        reactSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(ReactSwipeRefreshLayout reactSwipeRefreshLayout, float f) {
        reactSwipeRefreshLayout.setProgressViewOffset(f);
    }

    @ReactProp(name = "refreshing")
    public void setRefreshing(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setRefreshing(z);
    }

    @ReactProp(defaultInt = 1, name = "size")
    public void setSize(ReactSwipeRefreshLayout reactSwipeRefreshLayout, int i) {
        reactSwipeRefreshLayout.setSize(i);
    }
}
