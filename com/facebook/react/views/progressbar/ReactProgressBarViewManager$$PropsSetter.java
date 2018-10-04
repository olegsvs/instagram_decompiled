package com.facebook.react.views.progressbar;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactProgressBarViewManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        map.put(ReactProgressBarViewManager.PROP_ANIMATING, "boolean");
        str = "Color";
        map.put("backgroundColor", str);
        map.put("color", str);
        map.put("elevation", "number");
        map.put("importantForAccessibility", "String");
        map.put(ReactProgressBarViewManager.PROP_INDETERMINATE, "boolean");
        map.put(BaseViewManager.PROP_NATIVE_ID, "String");
        str = "number";
        map.put("opacity", str);
        map.put(ReactProgressBarViewManager.PROP_PROGRESS, str);
        map.put("renderToHardwareTextureAndroid", "boolean");
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        str = "String";
        map.put(ReactProgressBarViewManager.PROP_STYLE, str);
        map.put(BaseViewManager.PROP_TEST_ID, str);
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.progressbar.ReactProgressBarViewManager r4, com.facebook.react.views.progressbar.ProgressBarContainerView r5, java.lang.String r6, com.facebook.react.uimanager.ReactStylesDiffMap r7) {
        /*
        r0 = r6.hashCode();
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x0117;
            case -1721943861: goto L_0x010c;
            case -1702963415: goto L_0x0102;
            case -1267206133: goto L_0x00f7;
            case -1001078227: goto L_0x00ec;
            case -908189618: goto L_0x00e1;
            case -908189617: goto L_0x00d6;
            case -877170387: goto L_0x00cb;
            case -731417480: goto L_0x00c0;
            case -101663499: goto L_0x00b6;
            case -101359900: goto L_0x00ac;
            case -80891667: goto L_0x00a1;
            case -40300674: goto L_0x0095;
            case -4379043: goto L_0x0089;
            case 36255470: goto L_0x007e;
            case 94842723: goto L_0x0072;
            case 633138363: goto L_0x0066;
            case 746986311: goto L_0x005a;
            case 1052666732: goto L_0x004e;
            case 1118509918: goto L_0x0043;
            case 1146842694: goto L_0x0038;
            case 1287124693: goto L_0x002d;
            case 1410320624: goto L_0x0022;
            case 1804741442: goto L_0x0016;
            case 2045685618: goto L_0x000a;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x0122;
    L_0x000a:
        r0 = "nativeID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0012:
        r3 = 12;
        goto L_0x0123;
    L_0x0016:
        r0 = "styleAttr";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x001e:
        r3 = 19;
        goto L_0x0123;
    L_0x0022:
        r0 = "accessibilityStates";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x002a:
        r3 = 5;
        goto L_0x0123;
    L_0x002d:
        r0 = "backgroundColor";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0035:
        r3 = 7;
        goto L_0x0123;
    L_0x0038:
        r0 = "accessibilityLabel";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0040:
        r3 = 2;
        goto L_0x0123;
    L_0x0043:
        r0 = "animating";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x004b:
        r3 = 6;
        goto L_0x0123;
    L_0x004e:
        r0 = "transform";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0056:
        r3 = 21;
        goto L_0x0123;
    L_0x005a:
        r0 = "importantForAccessibility";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0062:
        r3 = 10;
        goto L_0x0123;
    L_0x0066:
        r0 = "indeterminate";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x006e:
        r3 = 11;
        goto L_0x0123;
    L_0x0072:
        r0 = "color";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x007a:
        r3 = 8;
        goto L_0x0123;
    L_0x007e:
        r0 = "accessibilityLiveRegion";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0086:
        r3 = 3;
        goto L_0x0123;
    L_0x0089:
        r0 = "elevation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0091:
        r3 = 9;
        goto L_0x0123;
    L_0x0095:
        r0 = "rotation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x009d:
        r3 = 16;
        goto L_0x0123;
    L_0x00a1:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00a9:
        r3 = 15;
        goto L_0x0123;
    L_0x00ac:
        r0 = "accessibilityRole";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00b4:
        r3 = 4;
        goto L_0x0123;
    L_0x00b6:
        r0 = "accessibilityHint";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00be:
        r3 = 1;
        goto L_0x0123;
    L_0x00c0:
        r0 = "zIndex";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00c8:
        r3 = 24;
        goto L_0x0123;
    L_0x00cb:
        r0 = "testID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00d3:
        r3 = 20;
        goto L_0x0123;
    L_0x00d6:
        r0 = "scaleY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00de:
        r3 = 18;
        goto L_0x0123;
    L_0x00e1:
        r0 = "scaleX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00e9:
        r3 = 17;
        goto L_0x0123;
    L_0x00ec:
        r0 = "progress";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00f4:
        r3 = 14;
        goto L_0x0123;
    L_0x00f7:
        r0 = "opacity";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00ff:
        r3 = 13;
        goto L_0x0123;
    L_0x0102:
        r0 = "accessibilityComponentType";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x010a:
        r3 = 0;
        goto L_0x0123;
    L_0x010c:
        r0 = "translateY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x0114:
        r3 = 23;
        goto L_0x0123;
    L_0x0117:
        r0 = "translateX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x011f:
        r3 = 22;
        goto L_0x0123;
    L_0x0122:
        r3 = -1;
    L_0x0123:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r3) {
            case 0: goto L_0x0203;
            case 1: goto L_0x01fb;
            case 2: goto L_0x01f3;
            case 3: goto L_0x01eb;
            case 4: goto L_0x01e3;
            case 5: goto L_0x01db;
            case 6: goto L_0x01d3;
            case 7: goto L_0x01cb;
            case 8: goto L_0x01b7;
            case 9: goto L_0x01af;
            case 10: goto L_0x01a7;
            case 11: goto L_0x019f;
            case 12: goto L_0x0197;
            case 13: goto L_0x018f;
            case 14: goto L_0x0185;
            case 15: goto L_0x017c;
            case 16: goto L_0x0173;
            case 17: goto L_0x016a;
            case 18: goto L_0x0161;
            case 19: goto L_0x0158;
            case 20: goto L_0x014f;
            case 21: goto L_0x0146;
            case 22: goto L_0x013d;
            case 23: goto L_0x0134;
            case 24: goto L_0x012b;
            default: goto L_0x0129;
        };
    L_0x0129:
        goto L_0x020a;
    L_0x012b:
        r0 = r7.getFloat(r6, r0);
        r4.setZIndex(r5, r0);
        goto L_0x020a;
    L_0x0134:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateY(r5, r0);
        goto L_0x020a;
    L_0x013d:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateX(r5, r0);
        goto L_0x020a;
    L_0x0146:
        r0 = r7.getArray(r6);
        r4.setTransform(r5, r0);
        goto L_0x020a;
    L_0x014f:
        r0 = r7.getString(r6);
        r4.setTestId(r5, r0);
        goto L_0x020a;
    L_0x0158:
        r0 = r7.getString(r6);
        r4.setStyle(r5, r0);
        goto L_0x020a;
    L_0x0161:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleY(r5, r0);
        goto L_0x020a;
    L_0x016a:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleX(r5, r0);
        goto L_0x020a;
    L_0x0173:
        r0 = r7.getFloat(r6, r0);
        r4.setRotation(r5, r0);
        goto L_0x020a;
    L_0x017c:
        r0 = r7.getBoolean(r6, r2);
        r4.setRenderToHardwareTexture(r5, r0);
        goto L_0x020a;
    L_0x0185:
        r0 = 0;
        r0 = r7.getDouble(r6, r0);
        r4.setProgress(r5, r0);
        goto L_0x020a;
    L_0x018f:
        r0 = r7.getFloat(r6, r1);
        r4.setOpacity(r5, r0);
        goto L_0x020a;
    L_0x0197:
        r0 = r7.getString(r6);
        r4.setNativeId(r5, r0);
        goto L_0x020a;
    L_0x019f:
        r0 = r7.getBoolean(r6, r2);
        r4.setIndeterminate(r5, r0);
        goto L_0x020a;
    L_0x01a7:
        r0 = r7.getString(r6);
        r4.setImportantForAccessibility(r5, r0);
        goto L_0x020a;
    L_0x01af:
        r0 = r7.getFloat(r6, r0);
        r4.setElevation(r5, r0);
        goto L_0x020a;
    L_0x01b7:
        r0 = r7.isNull(r6);
        if (r0 == 0) goto L_0x01bf;
    L_0x01bd:
        r0 = 0;
        goto L_0x01c7;
    L_0x01bf:
        r0 = r7.getInt(r6, r2);
        r0 = java.lang.Integer.valueOf(r0);
    L_0x01c7:
        r4.setColor(r5, r0);
        goto L_0x020a;
    L_0x01cb:
        r0 = r7.getInt(r6, r2);
        r4.setBackgroundColor(r5, r0);
        goto L_0x020a;
    L_0x01d3:
        r0 = r7.getBoolean(r6, r2);
        r4.setAnimating(r5, r0);
        goto L_0x020a;
    L_0x01db:
        r0 = r7.getArray(r6);
        r4.setViewStates(r5, r0);
        goto L_0x020a;
    L_0x01e3:
        r0 = r7.getString(r6);
        r4.setAccessibilityRole(r5, r0);
        goto L_0x020a;
    L_0x01eb:
        r0 = r7.getString(r6);
        r4.setAccessibilityLiveRegion(r5, r0);
        goto L_0x020a;
    L_0x01f3:
        r0 = r7.getString(r6);
        r4.setAccessibilityLabel(r5, r0);
        goto L_0x020a;
    L_0x01fb:
        r0 = r7.getString(r6);
        r4.setAccessibilityHint(r5, r0);
        goto L_0x020a;
    L_0x0203:
        r0 = r7.getString(r6);
        r4.setAccessibilityComponentType(r5, r0);
    L_0x020a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.progressbar.ReactProgressBarViewManager$$PropsSetter.setProperty(com.facebook.react.views.progressbar.ReactProgressBarViewManager, com.facebook.react.views.progressbar.ProgressBarContainerView, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
