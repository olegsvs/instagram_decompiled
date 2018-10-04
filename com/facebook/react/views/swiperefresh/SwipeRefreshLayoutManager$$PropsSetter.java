package com.facebook.react.views.swiperefresh;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class SwipeRefreshLayoutManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        map.put("backgroundColor", "Color");
        map.put("colors", "ColorArray");
        map.put("elevation", "number");
        map.put("enabled", "boolean");
        str = "String";
        map.put("importantForAccessibility", str);
        map.put(BaseViewManager.PROP_NATIVE_ID, str);
        map.put("opacity", "number");
        map.put("progressBackgroundColor", "Color");
        map.put("progressViewOffset", "number");
        str = "boolean";
        map.put("refreshing", str);
        map.put("renderToHardwareTextureAndroid", str);
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("size", str);
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager r5, com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout r6, java.lang.String r7, com.facebook.react.uimanager.ReactStylesDiffMap r8) {
        /*
        r0 = r7.hashCode();
        r3 = 1;
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x0124;
            case -1721943861: goto L_0x0119;
            case -1702963415: goto L_0x010f;
            case -1609594047: goto L_0x0104;
            case -1354842768: goto L_0x00fa;
            case -1267206133: goto L_0x00ef;
            case -908189618: goto L_0x00e4;
            case -908189617: goto L_0x00d9;
            case -885150488: goto L_0x00ce;
            case -877170387: goto L_0x00c3;
            case -731417480: goto L_0x00b8;
            case -416037467: goto L_0x00ad;
            case -321826009: goto L_0x00a1;
            case -101663499: goto L_0x0096;
            case -101359900: goto L_0x008b;
            case -80891667: goto L_0x007f;
            case -40300674: goto L_0x0073;
            case -4379043: goto L_0x0067;
            case 3530753: goto L_0x005b;
            case 36255470: goto L_0x0050;
            case 746986311: goto L_0x0044;
            case 1052666732: goto L_0x0038;
            case 1146842694: goto L_0x002d;
            case 1287124693: goto L_0x0022;
            case 1410320624: goto L_0x0017;
            case 2045685618: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x012f;
    L_0x000b:
        r0 = "nativeID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0013:
        r4 = 11;
        goto L_0x0130;
    L_0x0017:
        r0 = "accessibilityStates";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x001f:
        r4 = 5;
        goto L_0x0130;
    L_0x0022:
        r0 = "backgroundColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x002a:
        r4 = 6;
        goto L_0x0130;
    L_0x002d:
        r0 = "accessibilityLabel";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0035:
        r4 = 2;
        goto L_0x0130;
    L_0x0038:
        r0 = "transform";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0040:
        r4 = 22;
        goto L_0x0130;
    L_0x0044:
        r0 = "importantForAccessibility";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x004c:
        r4 = 10;
        goto L_0x0130;
    L_0x0050:
        r0 = "accessibilityLiveRegion";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0058:
        r4 = 3;
        goto L_0x0130;
    L_0x005b:
        r0 = "size";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0063:
        r4 = 20;
        goto L_0x0130;
    L_0x0067:
        r0 = "elevation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x006f:
        r4 = 8;
        goto L_0x0130;
    L_0x0073:
        r0 = "rotation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x007b:
        r4 = 17;
        goto L_0x0130;
    L_0x007f:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0087:
        r4 = 16;
        goto L_0x0130;
    L_0x008b:
        r0 = "accessibilityRole";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0093:
        r4 = 4;
        goto L_0x0130;
    L_0x0096:
        r0 = "accessibilityHint";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x009e:
        r4 = 1;
        goto L_0x0130;
    L_0x00a1:
        r0 = "refreshing";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00a9:
        r4 = 15;
        goto L_0x0130;
    L_0x00ad:
        r0 = "progressViewOffset";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00b5:
        r4 = 14;
        goto L_0x0130;
    L_0x00b8:
        r0 = "zIndex";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00c0:
        r4 = 25;
        goto L_0x0130;
    L_0x00c3:
        r0 = "testID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00cb:
        r4 = 21;
        goto L_0x0130;
    L_0x00ce:
        r0 = "progressBackgroundColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00d6:
        r4 = 13;
        goto L_0x0130;
    L_0x00d9:
        r0 = "scaleY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00e1:
        r4 = 19;
        goto L_0x0130;
    L_0x00e4:
        r0 = "scaleX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00ec:
        r4 = 18;
        goto L_0x0130;
    L_0x00ef:
        r0 = "opacity";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x00f7:
        r4 = 12;
        goto L_0x0130;
    L_0x00fa:
        r0 = "colors";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0102:
        r4 = 7;
        goto L_0x0130;
    L_0x0104:
        r0 = "enabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x010c:
        r4 = 9;
        goto L_0x0130;
    L_0x010f:
        r0 = "accessibilityComponentType";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0117:
        r4 = 0;
        goto L_0x0130;
    L_0x0119:
        r0 = "translateY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x0121:
        r4 = 24;
        goto L_0x0130;
    L_0x0124:
        r0 = "translateX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x012f;
    L_0x012c:
        r4 = 23;
        goto L_0x0130;
    L_0x012f:
        r4 = -1;
    L_0x0130:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r4) {
            case 0: goto L_0x020a;
            case 1: goto L_0x0202;
            case 2: goto L_0x01fa;
            case 3: goto L_0x01f2;
            case 4: goto L_0x01ea;
            case 5: goto L_0x01e2;
            case 6: goto L_0x01da;
            case 7: goto L_0x01d2;
            case 8: goto L_0x01ca;
            case 9: goto L_0x01c2;
            case 10: goto L_0x01ba;
            case 11: goto L_0x01b2;
            case 12: goto L_0x01aa;
            case 13: goto L_0x01a2;
            case 14: goto L_0x019a;
            case 15: goto L_0x0192;
            case 16: goto L_0x0189;
            case 17: goto L_0x0180;
            case 18: goto L_0x0177;
            case 19: goto L_0x016e;
            case 20: goto L_0x0165;
            case 21: goto L_0x015c;
            case 22: goto L_0x0153;
            case 23: goto L_0x014a;
            case 24: goto L_0x0141;
            case 25: goto L_0x0138;
            default: goto L_0x0136;
        };
    L_0x0136:
        goto L_0x0211;
    L_0x0138:
        r0 = r8.getFloat(r7, r0);
        r5.setZIndex(r6, r0);
        goto L_0x0211;
    L_0x0141:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateY(r6, r0);
        goto L_0x0211;
    L_0x014a:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateX(r6, r0);
        goto L_0x0211;
    L_0x0153:
        r0 = r8.getArray(r7);
        r5.setTransform(r6, r0);
        goto L_0x0211;
    L_0x015c:
        r0 = r8.getString(r7);
        r5.setTestId(r6, r0);
        goto L_0x0211;
    L_0x0165:
        r0 = r8.getInt(r7, r3);
        r5.setSize(r6, r0);
        goto L_0x0211;
    L_0x016e:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleY(r6, r0);
        goto L_0x0211;
    L_0x0177:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleX(r6, r0);
        goto L_0x0211;
    L_0x0180:
        r0 = r8.getFloat(r7, r0);
        r5.setRotation(r6, r0);
        goto L_0x0211;
    L_0x0189:
        r0 = r8.getBoolean(r7, r2);
        r5.setRenderToHardwareTexture(r6, r0);
        goto L_0x0211;
    L_0x0192:
        r0 = r8.getBoolean(r7, r2);
        r5.setRefreshing(r6, r0);
        goto L_0x0211;
    L_0x019a:
        r0 = r8.getFloat(r7, r0);
        r5.setProgressViewOffset(r6, r0);
        goto L_0x0211;
    L_0x01a2:
        r0 = r8.getInt(r7, r2);
        r5.setProgressBackgroundColor(r6, r0);
        goto L_0x0211;
    L_0x01aa:
        r0 = r8.getFloat(r7, r1);
        r5.setOpacity(r6, r0);
        goto L_0x0211;
    L_0x01b2:
        r0 = r8.getString(r7);
        r5.setNativeId(r6, r0);
        goto L_0x0211;
    L_0x01ba:
        r0 = r8.getString(r7);
        r5.setImportantForAccessibility(r6, r0);
        goto L_0x0211;
    L_0x01c2:
        r0 = r8.getBoolean(r7, r3);
        r5.setEnabled(r6, r0);
        goto L_0x0211;
    L_0x01ca:
        r0 = r8.getFloat(r7, r0);
        r5.setElevation(r6, r0);
        goto L_0x0211;
    L_0x01d2:
        r0 = r8.getArray(r7);
        r5.setColors(r6, r0);
        goto L_0x0211;
    L_0x01da:
        r0 = r8.getInt(r7, r2);
        r5.setBackgroundColor(r6, r0);
        goto L_0x0211;
    L_0x01e2:
        r0 = r8.getArray(r7);
        r5.setViewStates(r6, r0);
        goto L_0x0211;
    L_0x01ea:
        r0 = r8.getString(r7);
        r5.setAccessibilityRole(r6, r0);
        goto L_0x0211;
    L_0x01f2:
        r0 = r8.getString(r7);
        r5.setAccessibilityLiveRegion(r6, r0);
        goto L_0x0211;
    L_0x01fa:
        r0 = r8.getString(r7);
        r5.setAccessibilityLabel(r6, r0);
        goto L_0x0211;
    L_0x0202:
        r0 = r8.getString(r7);
        r5.setAccessibilityHint(r6, r0);
        goto L_0x0211;
    L_0x020a:
        r0 = r8.getString(r7);
        r5.setAccessibilityComponentType(r6, r0);
    L_0x0211:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager$$PropsSetter.setProperty(com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager, com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
