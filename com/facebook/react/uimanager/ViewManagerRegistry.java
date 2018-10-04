package com.facebook.react.uimanager;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.UIManagerModule.ViewManagerResolver;
import java.util.List;
import java.util.Map;

public final class ViewManagerRegistry {
    private final ViewManagerResolver mViewManagerResolver;
    private final Map mViewManagers;

    public ViewManagerRegistry(ViewManagerResolver viewManagerResolver) {
        this.mViewManagers = MapBuilder.newHashMap();
        this.mViewManagerResolver = viewManagerResolver;
    }

    public ViewManagerRegistry(List list) {
        Map newHashMap = MapBuilder.newHashMap();
        for (ViewManager viewManager : list) {
            newHashMap.put(viewManager.getName(), viewManager);
        }
        this.mViewManagers = newHashMap;
        this.mViewManagerResolver = null;
    }

    public final ViewManager get(String str) {
        ViewManager viewManager = (ViewManager) this.mViewManagers.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        ViewManagerResolver viewManagerResolver = this.mViewManagerResolver;
        if (viewManagerResolver != null) {
            ViewManager viewManager2 = viewManagerResolver.getViewManager(str);
            if (viewManager2 != null) {
                this.mViewManagers.put(str, viewManager2);
                return viewManager2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No ViewManager defined for class ");
        stringBuilder.append(str);
        throw new IllegalViewOperationException(stringBuilder.toString());
    }
}
