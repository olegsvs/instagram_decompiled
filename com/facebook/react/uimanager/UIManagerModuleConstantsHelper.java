package com.facebook.react.uimanager;

import X.AnonymousClass09A;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.UIManagerModule.ViewManagerResolver;
import java.util.List;
import java.util.Map;

public final class UIManagerModuleConstantsHelper {
    public static Map createConstants(ViewManagerResolver viewManagerResolver) {
        Map constants = UIManagerModuleConstants.getConstants();
        constants.put("ViewManagerNames", viewManagerResolver.getViewManagerNames());
        return constants;
    }

    public static Map createConstants(List list, Map map, Map map2) {
        Map constants = UIManagerModuleConstants.getConstants();
        Map bubblingEventTypeConstants = UIManagerModuleConstants.getBubblingEventTypeConstants();
        Map directEventTypeConstants = UIManagerModuleConstants.getDirectEventTypeConstants();
        if (map != null) {
            map.putAll(bubblingEventTypeConstants);
        }
        if (map2 != null) {
            map2.putAll(directEventTypeConstants);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            AnonymousClass09A.B(8192, "UIManagerModuleConstantsHelper.createConstants").B("ViewManager", name).B("Lazy", Boolean.valueOf(false)).C();
            try {
                Map createConstantsForViewManager = createConstantsForViewManager(viewManager, null, null, map, map2);
                if (!createConstantsForViewManager.isEmpty()) {
                    constants.put(name, createConstantsForViewManager);
                }
                AnonymousClass09A.C(8192);
            } catch (Throwable th) {
                AnonymousClass09A.C(8192);
            }
        }
        constants.put("genericBubblingEventTypes", bubblingEventTypeConstants);
        constants.put("genericDirectEventTypes", directEventTypeConstants);
        return constants;
    }

    public static Map createConstantsForViewManager(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        Map newHashMap = MapBuilder.newHashMap();
        Map exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            recursiveMerge(map3, exportedCustomBubblingEventTypeConstants);
            recursiveMerge(exportedCustomBubblingEventTypeConstants, map);
            newHashMap.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            newHashMap.put("bubblingEventTypes", map);
        }
        exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            recursiveMerge(map4, exportedCustomBubblingEventTypeConstants);
            recursiveMerge(exportedCustomBubblingEventTypeConstants, map2);
            newHashMap.put("directEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map2 != null) {
            newHashMap.put("directEventTypes", map2);
        }
        exportedCustomBubblingEventTypeConstants = viewManager.getExportedViewConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            newHashMap.put("Constants", exportedCustomBubblingEventTypeConstants);
        }
        exportedCustomBubblingEventTypeConstants = viewManager.getCommandsMap();
        if (exportedCustomBubblingEventTypeConstants != null) {
            newHashMap.put("Commands", exportedCustomBubblingEventTypeConstants);
        }
        exportedCustomBubblingEventTypeConstants = viewManager.getNativeProps();
        if (!exportedCustomBubblingEventTypeConstants.isEmpty()) {
            newHashMap.put("NativeProps", exportedCustomBubblingEventTypeConstants);
        }
        return newHashMap;
    }

    public static Map getDefaultExportableEventTypes() {
        return MapBuilder.of("bubblingEventTypes", UIManagerModuleConstants.getBubblingEventTypeConstants(), "directEventTypes", UIManagerModuleConstants.getDirectEventTypeConstants());
    }

    private static void recursiveMerge(Map map, Map map2) {
        if (map != null && map2 != null) {
            if (!map2.isEmpty()) {
                for (Object next : map2.keySet()) {
                    Object obj = map2.get(next);
                    Object obj2 = map.get(next);
                    if (obj2 != null && (obj instanceof Map) && (obj2 instanceof Map)) {
                        recursiveMerge((Map) obj2, (Map) obj);
                    } else {
                        map.put(next, obj);
                    }
                }
            }
        }
    }
}
