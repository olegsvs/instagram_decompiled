package com.instagram.react.views.maps;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class IgStaticMapViewManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        map.put("backgroundColor", "Color");
        map.put("elevation", "number");
        str = "String";
        map.put("importantForAccessibility", str);
        map.put(BaseViewManager.PROP_NATIVE_ID, str);
        map.put("opacity", "number");
        map.put("region", "Map");
        map.put("renderToHardwareTextureAndroid", "boolean");
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setProperty(com.facebook.react.uimanager.ViewManager r4, android.view.View r5, java.lang.String r6, com.facebook.react.uimanager.ReactStylesDiffMap r7) {
        /*
        r3 = this;
        r4 = (com.instagram.react.views.maps.IgStaticMapViewManager) r4;
        r5 = (com.instagram.maps.ui.IgStaticMapView) r5;
        r0 = r6.hashCode();
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x00eb;
            case -1721943861: goto L_0x00e0;
            case -1702963415: goto L_0x00d6;
            case -1267206133: goto L_0x00cb;
            case -934795532: goto L_0x00c0;
            case -908189618: goto L_0x00b5;
            case -908189617: goto L_0x00aa;
            case -877170387: goto L_0x009f;
            case -731417480: goto L_0x0094;
            case -101663499: goto L_0x008a;
            case -101359900: goto L_0x0080;
            case -80891667: goto L_0x0075;
            case -40300674: goto L_0x0069;
            case -4379043: goto L_0x005e;
            case 36255470: goto L_0x0053;
            case 746986311: goto L_0x0047;
            case 1052666732: goto L_0x003b;
            case 1146842694: goto L_0x0030;
            case 1287124693: goto L_0x0025;
            case 1410320624: goto L_0x001a;
            case 2045685618: goto L_0x000e;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x00f6;
    L_0x000e:
        r0 = "nativeID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0016:
        r3 = 9;
        goto L_0x00f7;
    L_0x001a:
        r0 = "accessibilityStates";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0022:
        r3 = 5;
        goto L_0x00f7;
    L_0x0025:
        r0 = "backgroundColor";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x002d:
        r3 = 6;
        goto L_0x00f7;
    L_0x0030:
        r0 = "accessibilityLabel";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0038:
        r3 = 2;
        goto L_0x00f7;
    L_0x003b:
        r0 = "transform";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0043:
        r3 = 17;
        goto L_0x00f7;
    L_0x0047:
        r0 = "importantForAccessibility";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x004f:
        r3 = 8;
        goto L_0x00f7;
    L_0x0053:
        r0 = "accessibilityLiveRegion";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x005b:
        r3 = 3;
        goto L_0x00f7;
    L_0x005e:
        r0 = "elevation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0066:
        r3 = 7;
        goto L_0x00f7;
    L_0x0069:
        r0 = "rotation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0071:
        r3 = 13;
        goto L_0x00f7;
    L_0x0075:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x007d:
        r3 = 12;
        goto L_0x00f7;
    L_0x0080:
        r0 = "accessibilityRole";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0088:
        r3 = 4;
        goto L_0x00f7;
    L_0x008a:
        r0 = "accessibilityHint";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0092:
        r3 = 1;
        goto L_0x00f7;
    L_0x0094:
        r0 = "zIndex";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x009c:
        r3 = 20;
        goto L_0x00f7;
    L_0x009f:
        r0 = "testID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00a7:
        r3 = 16;
        goto L_0x00f7;
    L_0x00aa:
        r0 = "scaleY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00b2:
        r3 = 15;
        goto L_0x00f7;
    L_0x00b5:
        r0 = "scaleX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00bd:
        r3 = 14;
        goto L_0x00f7;
    L_0x00c0:
        r0 = "region";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00c8:
        r3 = 11;
        goto L_0x00f7;
    L_0x00cb:
        r0 = "opacity";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00d3:
        r3 = 10;
        goto L_0x00f7;
    L_0x00d6:
        r0 = "accessibilityComponentType";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00de:
        r3 = 0;
        goto L_0x00f7;
    L_0x00e0:
        r0 = "translateY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00e8:
        r3 = 19;
        goto L_0x00f7;
    L_0x00eb:
        r0 = "translateX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00f3:
        r3 = 18;
        goto L_0x00f7;
    L_0x00f6:
        r3 = -1;
    L_0x00f7:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r3) {
            case 0: goto L_0x01a4;
            case 1: goto L_0x019c;
            case 2: goto L_0x0194;
            case 3: goto L_0x018c;
            case 4: goto L_0x0184;
            case 5: goto L_0x017c;
            case 6: goto L_0x0174;
            case 7: goto L_0x016c;
            case 8: goto L_0x0164;
            case 9: goto L_0x015c;
            case 10: goto L_0x0154;
            case 11: goto L_0x014c;
            case 12: goto L_0x0144;
            case 13: goto L_0x013c;
            case 14: goto L_0x0134;
            case 15: goto L_0x012c;
            case 16: goto L_0x0123;
            case 17: goto L_0x011a;
            case 18: goto L_0x0111;
            case 19: goto L_0x0108;
            case 20: goto L_0x00ff;
            default: goto L_0x00fd;
        };
    L_0x00fd:
        goto L_0x01ab;
    L_0x00ff:
        r0 = r7.getFloat(r6, r0);
        r4.setZIndex(r5, r0);
        goto L_0x01ab;
    L_0x0108:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateY(r5, r0);
        goto L_0x01ab;
    L_0x0111:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateX(r5, r0);
        goto L_0x01ab;
    L_0x011a:
        r0 = r7.getArray(r6);
        r4.setTransform(r5, r0);
        goto L_0x01ab;
    L_0x0123:
        r0 = r7.getString(r6);
        r4.setTestId(r5, r0);
        goto L_0x01ab;
    L_0x012c:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleY(r5, r0);
        goto L_0x01ab;
    L_0x0134:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleX(r5, r0);
        goto L_0x01ab;
    L_0x013c:
        r0 = r7.getFloat(r6, r0);
        r4.setRotation(r5, r0);
        goto L_0x01ab;
    L_0x0144:
        r0 = r7.getBoolean(r6, r2);
        r4.setRenderToHardwareTexture(r5, r0);
        goto L_0x01ab;
    L_0x014c:
        r0 = r7.getMap(r6);
        r4.setRegion(r5, r0);
        goto L_0x01ab;
    L_0x0154:
        r0 = r7.getFloat(r6, r1);
        r4.setOpacity(r5, r0);
        goto L_0x01ab;
    L_0x015c:
        r0 = r7.getString(r6);
        r4.setNativeId(r5, r0);
        goto L_0x01ab;
    L_0x0164:
        r0 = r7.getString(r6);
        r4.setImportantForAccessibility(r5, r0);
        goto L_0x01ab;
    L_0x016c:
        r0 = r7.getFloat(r6, r0);
        r4.setElevation(r5, r0);
        goto L_0x01ab;
    L_0x0174:
        r0 = r7.getInt(r6, r2);
        r4.setBackgroundColor(r5, r0);
        goto L_0x01ab;
    L_0x017c:
        r0 = r7.getArray(r6);
        r4.setViewStates(r5, r0);
        goto L_0x01ab;
    L_0x0184:
        r0 = r7.getString(r6);
        r4.setAccessibilityRole(r5, r0);
        goto L_0x01ab;
    L_0x018c:
        r0 = r7.getString(r6);
        r4.setAccessibilityLiveRegion(r5, r0);
        goto L_0x01ab;
    L_0x0194:
        r0 = r7.getString(r6);
        r4.setAccessibilityLabel(r5, r0);
        goto L_0x01ab;
    L_0x019c:
        r0 = r7.getString(r6);
        r4.setAccessibilityHint(r5, r0);
        goto L_0x01ab;
    L_0x01a4:
        r0 = r7.getString(r6);
        r4.setAccessibilityComponentType(r5, r0);
    L_0x01ab:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.views.maps.IgStaticMapViewManager$$PropsSetter.setProperty(com.facebook.react.uimanager.ViewManager, android.view.View, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
