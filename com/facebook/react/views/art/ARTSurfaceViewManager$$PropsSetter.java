package com.facebook.react.views.art;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ARTSurfaceViewManager$$PropsSetter implements ViewManagerSetter {
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
    public static final void setProperty(com.facebook.react.views.art.ARTSurfaceViewManager r4, com.facebook.react.views.art.ARTSurfaceView r5, java.lang.String r6, com.facebook.react.uimanager.ReactStylesDiffMap r7) {
        /*
        r0 = r6.hashCode();
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x00db;
            case -1721943861: goto L_0x00d0;
            case -1702963415: goto L_0x00c6;
            case -1267206133: goto L_0x00bb;
            case -908189618: goto L_0x00b0;
            case -908189617: goto L_0x00a5;
            case -877170387: goto L_0x009a;
            case -731417480: goto L_0x008f;
            case -101663499: goto L_0x0085;
            case -101359900: goto L_0x007b;
            case -80891667: goto L_0x0070;
            case -40300674: goto L_0x0065;
            case -4379043: goto L_0x005a;
            case 36255470: goto L_0x004f;
            case 746986311: goto L_0x0043;
            case 1052666732: goto L_0x0037;
            case 1146842694: goto L_0x002c;
            case 1287124693: goto L_0x0021;
            case 1410320624: goto L_0x0016;
            case 2045685618: goto L_0x000a;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x00e6;
    L_0x000a:
        r0 = "nativeID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0012:
        r3 = 9;
        goto L_0x00e7;
    L_0x0016:
        r0 = "accessibilityStates";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x001e:
        r3 = 5;
        goto L_0x00e7;
    L_0x0021:
        r0 = "backgroundColor";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0029:
        r3 = 6;
        goto L_0x00e7;
    L_0x002c:
        r0 = "accessibilityLabel";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0034:
        r3 = 2;
        goto L_0x00e7;
    L_0x0037:
        r0 = "transform";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x003f:
        r3 = 16;
        goto L_0x00e7;
    L_0x0043:
        r0 = "importantForAccessibility";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x004b:
        r3 = 8;
        goto L_0x00e7;
    L_0x004f:
        r0 = "accessibilityLiveRegion";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0057:
        r3 = 3;
        goto L_0x00e7;
    L_0x005a:
        r0 = "elevation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0062:
        r3 = 7;
        goto L_0x00e7;
    L_0x0065:
        r0 = "rotation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x006d:
        r3 = 12;
        goto L_0x00e7;
    L_0x0070:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0078:
        r3 = 11;
        goto L_0x00e7;
    L_0x007b:
        r0 = "accessibilityRole";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0083:
        r3 = 4;
        goto L_0x00e7;
    L_0x0085:
        r0 = "accessibilityHint";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x008d:
        r3 = 1;
        goto L_0x00e7;
    L_0x008f:
        r0 = "zIndex";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x0097:
        r3 = 19;
        goto L_0x00e7;
    L_0x009a:
        r0 = "testID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00a2:
        r3 = 15;
        goto L_0x00e7;
    L_0x00a5:
        r0 = "scaleY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00ad:
        r3 = 14;
        goto L_0x00e7;
    L_0x00b0:
        r0 = "scaleX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00b8:
        r3 = 13;
        goto L_0x00e7;
    L_0x00bb:
        r0 = "opacity";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00c3:
        r3 = 10;
        goto L_0x00e7;
    L_0x00c6:
        r0 = "accessibilityComponentType";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00ce:
        r3 = 0;
        goto L_0x00e7;
    L_0x00d0:
        r0 = "translateY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00d8:
        r3 = 18;
        goto L_0x00e7;
    L_0x00db:
        r0 = "translateX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00e3:
        r3 = 17;
        goto L_0x00e7;
    L_0x00e6:
        r3 = -1;
    L_0x00e7:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r3) {
            case 0: goto L_0x018b;
            case 1: goto L_0x0183;
            case 2: goto L_0x017b;
            case 3: goto L_0x0173;
            case 4: goto L_0x016b;
            case 5: goto L_0x0163;
            case 6: goto L_0x015b;
            case 7: goto L_0x0153;
            case 8: goto L_0x014b;
            case 9: goto L_0x0143;
            case 10: goto L_0x013b;
            case 11: goto L_0x0133;
            case 12: goto L_0x012b;
            case 13: goto L_0x0123;
            case 14: goto L_0x011b;
            case 15: goto L_0x0113;
            case 16: goto L_0x010a;
            case 17: goto L_0x0101;
            case 18: goto L_0x00f8;
            case 19: goto L_0x00ef;
            default: goto L_0x00ed;
        };
    L_0x00ed:
        goto L_0x0192;
    L_0x00ef:
        r0 = r7.getFloat(r6, r0);
        r4.setZIndex(r5, r0);
        goto L_0x0192;
    L_0x00f8:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateY(r5, r0);
        goto L_0x0192;
    L_0x0101:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateX(r5, r0);
        goto L_0x0192;
    L_0x010a:
        r0 = r7.getArray(r6);
        r4.setTransform(r5, r0);
        goto L_0x0192;
    L_0x0113:
        r0 = r7.getString(r6);
        r4.setTestId(r5, r0);
        goto L_0x0192;
    L_0x011b:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleY(r5, r0);
        goto L_0x0192;
    L_0x0123:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleX(r5, r0);
        goto L_0x0192;
    L_0x012b:
        r0 = r7.getFloat(r6, r0);
        r4.setRotation(r5, r0);
        goto L_0x0192;
    L_0x0133:
        r0 = r7.getBoolean(r6, r2);
        r4.setRenderToHardwareTexture(r5, r0);
        goto L_0x0192;
    L_0x013b:
        r0 = r7.getFloat(r6, r1);
        r4.setOpacity(r5, r0);
        goto L_0x0192;
    L_0x0143:
        r0 = r7.getString(r6);
        r4.setNativeId(r5, r0);
        goto L_0x0192;
    L_0x014b:
        r0 = r7.getString(r6);
        r4.setImportantForAccessibility(r5, r0);
        goto L_0x0192;
    L_0x0153:
        r0 = r7.getFloat(r6, r0);
        r4.setElevation(r5, r0);
        goto L_0x0192;
    L_0x015b:
        r0 = r7.getInt(r6, r2);
        r4.setBackgroundColor(r5, r0);
        goto L_0x0192;
    L_0x0163:
        r0 = r7.getArray(r6);
        r4.setViewStates(r5, r0);
        goto L_0x0192;
    L_0x016b:
        r0 = r7.getString(r6);
        r4.setAccessibilityRole(r5, r0);
        goto L_0x0192;
    L_0x0173:
        r0 = r7.getString(r6);
        r4.setAccessibilityLiveRegion(r5, r0);
        goto L_0x0192;
    L_0x017b:
        r0 = r7.getString(r6);
        r4.setAccessibilityLabel(r5, r0);
        goto L_0x0192;
    L_0x0183:
        r0 = r7.getString(r6);
        r4.setAccessibilityHint(r5, r0);
        goto L_0x0192;
    L_0x018b:
        r0 = r7.getString(r6);
        r4.setAccessibilityComponentType(r5, r0);
    L_0x0192:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.art.ARTSurfaceViewManager$$PropsSetter.setProperty(com.facebook.react.views.art.ARTSurfaceViewManager, com.facebook.react.views.art.ARTSurfaceView, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
