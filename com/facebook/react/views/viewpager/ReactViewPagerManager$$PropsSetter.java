package com.facebook.react.views.viewpager;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactViewPagerManager$$PropsSetter implements ViewManagerSetter {
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
        str = "number";
        map.put("opacity", str);
        map.put("pageMargin", str);
        str = "boolean";
        map.put("peekEnabled", str);
        map.put("renderToHardwareTextureAndroid", str);
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("scrollEnabled", "boolean");
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.viewpager.ReactViewPagerManager r5, com.facebook.react.views.viewpager.ReactViewPager r6, java.lang.String r7, com.facebook.react.uimanager.ReactStylesDiffMap r8) {
        /*
        r0 = r7.hashCode();
        r3 = 1;
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x0100;
            case -1721943861: goto L_0x00f5;
            case -1702963415: goto L_0x00eb;
            case -1267206133: goto L_0x00e0;
            case -1151046732: goto L_0x00d5;
            case -908189618: goto L_0x00ca;
            case -908189617: goto L_0x00bf;
            case -877170387: goto L_0x00b4;
            case -731417480: goto L_0x00a9;
            case -101663499: goto L_0x009f;
            case -101359900: goto L_0x0095;
            case -80891667: goto L_0x008a;
            case -40300674: goto L_0x007e;
            case -4379043: goto L_0x0073;
            case 36255470: goto L_0x0068;
            case 746986311: goto L_0x005c;
            case 1052666732: goto L_0x0050;
            case 1097821469: goto L_0x0044;
            case 1146842694: goto L_0x0039;
            case 1287124693: goto L_0x002e;
            case 1410320624: goto L_0x0023;
            case 1919780198: goto L_0x0017;
            case 2045685618: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x010b;
    L_0x000b:
        r0 = "nativeID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0013:
        r4 = 9;
        goto L_0x010c;
    L_0x0017:
        r0 = "peekEnabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x001f:
        r4 = 12;
        goto L_0x010c;
    L_0x0023:
        r0 = "accessibilityStates";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x002b:
        r4 = 5;
        goto L_0x010c;
    L_0x002e:
        r0 = "backgroundColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0036:
        r4 = 6;
        goto L_0x010c;
    L_0x0039:
        r0 = "accessibilityLabel";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0041:
        r4 = 2;
        goto L_0x010c;
    L_0x0044:
        r0 = "pageMargin";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x004c:
        r4 = 11;
        goto L_0x010c;
    L_0x0050:
        r0 = "transform";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0058:
        r4 = 19;
        goto L_0x010c;
    L_0x005c:
        r0 = "importantForAccessibility";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0064:
        r4 = 8;
        goto L_0x010c;
    L_0x0068:
        r0 = "accessibilityLiveRegion";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0070:
        r4 = 3;
        goto L_0x010c;
    L_0x0073:
        r0 = "elevation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x007b:
        r4 = 7;
        goto L_0x010c;
    L_0x007e:
        r0 = "rotation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0086:
        r4 = 14;
        goto L_0x010c;
    L_0x008a:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0092:
        r4 = 13;
        goto L_0x010c;
    L_0x0095:
        r0 = "accessibilityRole";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x009d:
        r4 = 4;
        goto L_0x010c;
    L_0x009f:
        r0 = "accessibilityHint";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00a7:
        r4 = 1;
        goto L_0x010c;
    L_0x00a9:
        r0 = "zIndex";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00b1:
        r4 = 22;
        goto L_0x010c;
    L_0x00b4:
        r0 = "testID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00bc:
        r4 = 18;
        goto L_0x010c;
    L_0x00bf:
        r0 = "scaleY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00c7:
        r4 = 16;
        goto L_0x010c;
    L_0x00ca:
        r0 = "scaleX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00d2:
        r4 = 15;
        goto L_0x010c;
    L_0x00d5:
        r0 = "scrollEnabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00dd:
        r4 = 17;
        goto L_0x010c;
    L_0x00e0:
        r0 = "opacity";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00e8:
        r4 = 10;
        goto L_0x010c;
    L_0x00eb:
        r0 = "accessibilityComponentType";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00f3:
        r4 = 0;
        goto L_0x010c;
    L_0x00f5:
        r0 = "translateY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x00fd:
        r4 = 21;
        goto L_0x010c;
    L_0x0100:
        r0 = "translateX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0108:
        r4 = 20;
        goto L_0x010c;
    L_0x010b:
        r4 = -1;
    L_0x010c:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r4) {
            case 0: goto L_0x01cb;
            case 1: goto L_0x01c3;
            case 2: goto L_0x01bb;
            case 3: goto L_0x01b3;
            case 4: goto L_0x01ab;
            case 5: goto L_0x01a3;
            case 6: goto L_0x019b;
            case 7: goto L_0x0193;
            case 8: goto L_0x018b;
            case 9: goto L_0x0183;
            case 10: goto L_0x017b;
            case 11: goto L_0x0173;
            case 12: goto L_0x016b;
            case 13: goto L_0x0163;
            case 14: goto L_0x015b;
            case 15: goto L_0x0153;
            case 16: goto L_0x014a;
            case 17: goto L_0x0141;
            case 18: goto L_0x0138;
            case 19: goto L_0x012f;
            case 20: goto L_0x0126;
            case 21: goto L_0x011d;
            case 22: goto L_0x0114;
            default: goto L_0x0112;
        };
    L_0x0112:
        goto L_0x01d2;
    L_0x0114:
        r0 = r8.getFloat(r7, r0);
        r5.setZIndex(r6, r0);
        goto L_0x01d2;
    L_0x011d:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateY(r6, r0);
        goto L_0x01d2;
    L_0x0126:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateX(r6, r0);
        goto L_0x01d2;
    L_0x012f:
        r0 = r8.getArray(r7);
        r5.setTransform(r6, r0);
        goto L_0x01d2;
    L_0x0138:
        r0 = r8.getString(r7);
        r5.setTestId(r6, r0);
        goto L_0x01d2;
    L_0x0141:
        r0 = r8.getBoolean(r7, r3);
        r5.setScrollEnabled(r6, r0);
        goto L_0x01d2;
    L_0x014a:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleY(r6, r0);
        goto L_0x01d2;
    L_0x0153:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleX(r6, r0);
        goto L_0x01d2;
    L_0x015b:
        r0 = r8.getFloat(r7, r0);
        r5.setRotation(r6, r0);
        goto L_0x01d2;
    L_0x0163:
        r0 = r8.getBoolean(r7, r2);
        r5.setRenderToHardwareTexture(r6, r0);
        goto L_0x01d2;
    L_0x016b:
        r0 = r8.getBoolean(r7, r2);
        r5.setPeekEnabled(r6, r0);
        goto L_0x01d2;
    L_0x0173:
        r0 = r8.getFloat(r7, r0);
        r5.setPageMargin(r6, r0);
        goto L_0x01d2;
    L_0x017b:
        r0 = r8.getFloat(r7, r1);
        r5.setOpacity(r6, r0);
        goto L_0x01d2;
    L_0x0183:
        r0 = r8.getString(r7);
        r5.setNativeId(r6, r0);
        goto L_0x01d2;
    L_0x018b:
        r0 = r8.getString(r7);
        r5.setImportantForAccessibility(r6, r0);
        goto L_0x01d2;
    L_0x0193:
        r0 = r8.getFloat(r7, r0);
        r5.setElevation(r6, r0);
        goto L_0x01d2;
    L_0x019b:
        r0 = r8.getInt(r7, r2);
        r5.setBackgroundColor(r6, r0);
        goto L_0x01d2;
    L_0x01a3:
        r0 = r8.getArray(r7);
        r5.setViewStates(r6, r0);
        goto L_0x01d2;
    L_0x01ab:
        r0 = r8.getString(r7);
        r5.setAccessibilityRole(r6, r0);
        goto L_0x01d2;
    L_0x01b3:
        r0 = r8.getString(r7);
        r5.setAccessibilityLiveRegion(r6, r0);
        goto L_0x01d2;
    L_0x01bb:
        r0 = r8.getString(r7);
        r5.setAccessibilityLabel(r6, r0);
        goto L_0x01d2;
    L_0x01c3:
        r0 = r8.getString(r7);
        r5.setAccessibilityHint(r6, r0);
        goto L_0x01d2;
    L_0x01cb:
        r0 = r8.getString(r7);
        r5.setAccessibilityComponentType(r6, r0);
    L_0x01d2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.viewpager.ReactViewPagerManager$$PropsSetter.setProperty(com.facebook.react.views.viewpager.ReactViewPagerManager, com.facebook.react.views.viewpager.ReactViewPager, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
