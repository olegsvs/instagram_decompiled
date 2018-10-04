package com.instagram.react.perf;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class IgReactPerformanceLoggerFlagManager$$PropsSetter implements ViewManagerSetter {
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
        r4 = (com.instagram.react.perf.IgReactPerformanceLoggerFlagManager) r4;
        r5 = (com.instagram.react.perf.IgReactPerformanceLoggerFlag) r5;
        r0 = r6.hashCode();
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x00df;
            case -1721943861: goto L_0x00d4;
            case -1702963415: goto L_0x00ca;
            case -1267206133: goto L_0x00bf;
            case -908189618: goto L_0x00b4;
            case -908189617: goto L_0x00a9;
            case -877170387: goto L_0x009e;
            case -731417480: goto L_0x0093;
            case -101663499: goto L_0x0089;
            case -101359900: goto L_0x007f;
            case -80891667: goto L_0x0074;
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
        goto L_0x00ea;
    L_0x000e:
        r0 = "nativeID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0016:
        r3 = 9;
        goto L_0x00eb;
    L_0x001a:
        r0 = "accessibilityStates";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0022:
        r3 = 5;
        goto L_0x00eb;
    L_0x0025:
        r0 = "backgroundColor";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x002d:
        r3 = 6;
        goto L_0x00eb;
    L_0x0030:
        r0 = "accessibilityLabel";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0038:
        r3 = 2;
        goto L_0x00eb;
    L_0x003b:
        r0 = "transform";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0043:
        r3 = 16;
        goto L_0x00eb;
    L_0x0047:
        r0 = "importantForAccessibility";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x004f:
        r3 = 8;
        goto L_0x00eb;
    L_0x0053:
        r0 = "accessibilityLiveRegion";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x005b:
        r3 = 3;
        goto L_0x00eb;
    L_0x005e:
        r0 = "elevation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0066:
        r3 = 7;
        goto L_0x00eb;
    L_0x0069:
        r0 = "rotation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0071:
        r3 = 12;
        goto L_0x00eb;
    L_0x0074:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x007c:
        r3 = 11;
        goto L_0x00eb;
    L_0x007f:
        r0 = "accessibilityRole";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0087:
        r3 = 4;
        goto L_0x00eb;
    L_0x0089:
        r0 = "accessibilityHint";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x0091:
        r3 = 1;
        goto L_0x00eb;
    L_0x0093:
        r0 = "zIndex";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x009b:
        r3 = 19;
        goto L_0x00eb;
    L_0x009e:
        r0 = "testID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x00a6:
        r3 = 15;
        goto L_0x00eb;
    L_0x00a9:
        r0 = "scaleY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x00b1:
        r3 = 14;
        goto L_0x00eb;
    L_0x00b4:
        r0 = "scaleX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x00bc:
        r3 = 13;
        goto L_0x00eb;
    L_0x00bf:
        r0 = "opacity";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x00c7:
        r3 = 10;
        goto L_0x00eb;
    L_0x00ca:
        r0 = "accessibilityComponentType";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x00d2:
        r3 = 0;
        goto L_0x00eb;
    L_0x00d4:
        r0 = "translateY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x00dc:
        r3 = 18;
        goto L_0x00eb;
    L_0x00df:
        r0 = "translateX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00ea;
    L_0x00e7:
        r3 = 17;
        goto L_0x00eb;
    L_0x00ea:
        r3 = -1;
    L_0x00eb:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r3) {
            case 0: goto L_0x018f;
            case 1: goto L_0x0187;
            case 2: goto L_0x017f;
            case 3: goto L_0x0177;
            case 4: goto L_0x016f;
            case 5: goto L_0x0167;
            case 6: goto L_0x015f;
            case 7: goto L_0x0157;
            case 8: goto L_0x014f;
            case 9: goto L_0x0147;
            case 10: goto L_0x013f;
            case 11: goto L_0x0137;
            case 12: goto L_0x012f;
            case 13: goto L_0x0127;
            case 14: goto L_0x011f;
            case 15: goto L_0x0117;
            case 16: goto L_0x010e;
            case 17: goto L_0x0105;
            case 18: goto L_0x00fc;
            case 19: goto L_0x00f3;
            default: goto L_0x00f1;
        };
    L_0x00f1:
        goto L_0x0196;
    L_0x00f3:
        r0 = r7.getFloat(r6, r0);
        r4.setZIndex(r5, r0);
        goto L_0x0196;
    L_0x00fc:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateY(r5, r0);
        goto L_0x0196;
    L_0x0105:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateX(r5, r0);
        goto L_0x0196;
    L_0x010e:
        r0 = r7.getArray(r6);
        r4.setTransform(r5, r0);
        goto L_0x0196;
    L_0x0117:
        r0 = r7.getString(r6);
        r4.setTestId(r5, r0);
        goto L_0x0196;
    L_0x011f:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleY(r5, r0);
        goto L_0x0196;
    L_0x0127:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleX(r5, r0);
        goto L_0x0196;
    L_0x012f:
        r0 = r7.getFloat(r6, r0);
        r4.setRotation(r5, r0);
        goto L_0x0196;
    L_0x0137:
        r0 = r7.getBoolean(r6, r2);
        r4.setRenderToHardwareTexture(r5, r0);
        goto L_0x0196;
    L_0x013f:
        r0 = r7.getFloat(r6, r1);
        r4.setOpacity(r5, r0);
        goto L_0x0196;
    L_0x0147:
        r0 = r7.getString(r6);
        r4.setNativeId(r5, r0);
        goto L_0x0196;
    L_0x014f:
        r0 = r7.getString(r6);
        r4.setImportantForAccessibility(r5, r0);
        goto L_0x0196;
    L_0x0157:
        r0 = r7.getFloat(r6, r0);
        r4.setElevation(r5, r0);
        goto L_0x0196;
    L_0x015f:
        r0 = r7.getInt(r6, r2);
        r4.setBackgroundColor(r5, r0);
        goto L_0x0196;
    L_0x0167:
        r0 = r7.getArray(r6);
        r4.setViewStates(r5, r0);
        goto L_0x0196;
    L_0x016f:
        r0 = r7.getString(r6);
        r4.setAccessibilityRole(r5, r0);
        goto L_0x0196;
    L_0x0177:
        r0 = r7.getString(r6);
        r4.setAccessibilityLiveRegion(r5, r0);
        goto L_0x0196;
    L_0x017f:
        r0 = r7.getString(r6);
        r4.setAccessibilityLabel(r5, r0);
        goto L_0x0196;
    L_0x0187:
        r0 = r7.getString(r6);
        r4.setAccessibilityHint(r5, r0);
        goto L_0x0196;
    L_0x018f:
        r0 = r7.getString(r6);
        r4.setAccessibilityComponentType(r5, r0);
    L_0x0196:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.perf.IgReactPerformanceLoggerFlagManager$$PropsSetter.setProperty(com.facebook.react.uimanager.ViewManager, android.view.View, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
