package com.facebook.react.views.text;

import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter;
import java.util.Map;

public class ReactRawTextShadowNode$$PropsSetter implements ShadowNodeSetter {
    public final void getProperties(Map map) {
        map.put("text", "String");
    }

    public static final void setProperty(ReactRawTextShadowNode reactRawTextShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        Object obj;
        if (str.hashCode() == 3556653) {
            if (str.equals("text")) {
                obj = null;
                if (obj != null) {
                    reactRawTextShadowNode.setText(reactStylesDiffMap.getString(str));
                }
            }
        }
        obj = -1;
        if (obj != null) {
            reactRawTextShadowNode.setText(reactStylesDiffMap.getString(str));
        }
    }
}
