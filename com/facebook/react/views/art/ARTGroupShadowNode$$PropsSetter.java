package com.facebook.react.views.art;

import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter;
import java.util.Map;

public class ARTGroupShadowNode$$PropsSetter implements ShadowNodeSetter {
    public final void getProperties(Map map) {
        map.put("clipping", "Array");
        map.put("opacity", "number");
        map.put("transform", "Array");
    }

    public static final void setProperty(ARTGroupShadowNode aRTGroupShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        Object obj;
        int hashCode = str.hashCode();
        if (hashCode != -1267206133) {
            if (hashCode != 918617282) {
                if (hashCode == 1052666732) {
                    if (str.equals("transform")) {
                        obj = 2;
                        switch (obj) {
                            case null:
                                aRTGroupShadowNode.setClipping(reactStylesDiffMap.getArray(str));
                                return;
                            case 1:
                                aRTGroupShadowNode.setOpacity(reactStylesDiffMap.getFloat(str, 1.0f));
                                return;
                            case 2:
                                aRTGroupShadowNode.setTransform(reactStylesDiffMap.getArray(str));
                                return;
                            default:
                                return;
                        }
                    }
                }
            } else if (str.equals("clipping")) {
                obj = null;
                switch (obj) {
                    case null:
                        aRTGroupShadowNode.setClipping(reactStylesDiffMap.getArray(str));
                        return;
                    case 1:
                        aRTGroupShadowNode.setOpacity(reactStylesDiffMap.getFloat(str, 1.0f));
                        return;
                    case 2:
                        aRTGroupShadowNode.setTransform(reactStylesDiffMap.getArray(str));
                        return;
                    default:
                        return;
                }
            }
        } else if (str.equals("opacity")) {
            obj = 1;
            switch (obj) {
                case null:
                    aRTGroupShadowNode.setClipping(reactStylesDiffMap.getArray(str));
                    return;
                case 1:
                    aRTGroupShadowNode.setOpacity(reactStylesDiffMap.getFloat(str, 1.0f));
                    return;
                case 2:
                    aRTGroupShadowNode.setTransform(reactStylesDiffMap.getArray(str));
                    return;
                default:
                    return;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                aRTGroupShadowNode.setClipping(reactStylesDiffMap.getArray(str));
                return;
            case 1:
                aRTGroupShadowNode.setOpacity(reactStylesDiffMap.getFloat(str, 1.0f));
                return;
            case 2:
                aRTGroupShadowNode.setTransform(reactStylesDiffMap.getArray(str));
                return;
            default:
                return;
        }
    }
}
