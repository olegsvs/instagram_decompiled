package com.instagram.react.views.switchview;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactSwitchManager$$PropsSetter implements ViewManagerSetter {
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
        map.put("enabled", "boolean");
        str = "String";
        map.put("importantForAccessibility", str);
        map.put(BaseViewManager.PROP_NATIVE_ID, str);
        map.put("on", "boolean");
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
    public final void setProperty(com.facebook.react.uimanager.ViewManager r5, android.view.View r6, java.lang.String r7, com.facebook.react.uimanager.ReactStylesDiffMap r8) {
        /*
        r4 = this;
        r5 = (com.instagram.react.views.switchview.ReactSwitchManager) r5;
        r6 = (X.AnonymousClass5tD) r6;
        r0 = r7.hashCode();
        r3 = 1;
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x00f8;
            case -1721943861: goto L_0x00ed;
            case -1702963415: goto L_0x00e3;
            case -1609594047: goto L_0x00d8;
            case -1267206133: goto L_0x00cd;
            case -908189618: goto L_0x00c2;
            case -908189617: goto L_0x00b7;
            case -877170387: goto L_0x00ac;
            case -731417480: goto L_0x00a1;
            case -101663499: goto L_0x0097;
            case -101359900: goto L_0x008d;
            case -80891667: goto L_0x0082;
            case -40300674: goto L_0x0076;
            case -4379043: goto L_0x006b;
            case 3551: goto L_0x005f;
            case 36255470: goto L_0x0054;
            case 746986311: goto L_0x0048;
            case 1052666732: goto L_0x003c;
            case 1146842694: goto L_0x0031;
            case 1287124693: goto L_0x0026;
            case 1410320624: goto L_0x001b;
            case 2045685618: goto L_0x000f;
            default: goto L_0x000d;
        };
    L_0x000d:
        goto L_0x0103;
    L_0x000f:
        r0 = "nativeID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0017:
        r4 = 10;
        goto L_0x0104;
    L_0x001b:
        r0 = "accessibilityStates";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0023:
        r4 = 5;
        goto L_0x0104;
    L_0x0026:
        r0 = "backgroundColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x002e:
        r4 = 6;
        goto L_0x0104;
    L_0x0031:
        r0 = "accessibilityLabel";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0039:
        r4 = 2;
        goto L_0x0104;
    L_0x003c:
        r0 = "transform";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0044:
        r4 = 18;
        goto L_0x0104;
    L_0x0048:
        r0 = "importantForAccessibility";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0050:
        r4 = 9;
        goto L_0x0104;
    L_0x0054:
        r0 = "accessibilityLiveRegion";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x005c:
        r4 = 3;
        goto L_0x0104;
    L_0x005f:
        r0 = "on";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0067:
        r4 = 11;
        goto L_0x0104;
    L_0x006b:
        r0 = "elevation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0073:
        r4 = 7;
        goto L_0x0104;
    L_0x0076:
        r0 = "rotation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x007e:
        r4 = 14;
        goto L_0x0104;
    L_0x0082:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x008a:
        r4 = 13;
        goto L_0x0104;
    L_0x008d:
        r0 = "accessibilityRole";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0095:
        r4 = 4;
        goto L_0x0104;
    L_0x0097:
        r0 = "accessibilityHint";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x009f:
        r4 = 1;
        goto L_0x0104;
    L_0x00a1:
        r0 = "zIndex";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00a9:
        r4 = 21;
        goto L_0x0104;
    L_0x00ac:
        r0 = "testID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00b4:
        r4 = 17;
        goto L_0x0104;
    L_0x00b7:
        r0 = "scaleY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00bf:
        r4 = 16;
        goto L_0x0104;
    L_0x00c2:
        r0 = "scaleX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00ca:
        r4 = 15;
        goto L_0x0104;
    L_0x00cd:
        r0 = "opacity";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00d5:
        r4 = 12;
        goto L_0x0104;
    L_0x00d8:
        r0 = "enabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00e0:
        r4 = 8;
        goto L_0x0104;
    L_0x00e3:
        r0 = "accessibilityComponentType";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00eb:
        r4 = 0;
        goto L_0x0104;
    L_0x00ed:
        r0 = "translateY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00f5:
        r4 = 20;
        goto L_0x0104;
    L_0x00f8:
        r0 = "translateX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x0100:
        r4 = 19;
        goto L_0x0104;
    L_0x0103:
        r4 = -1;
    L_0x0104:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r4) {
            case 0: goto L_0x01ba;
            case 1: goto L_0x01b2;
            case 2: goto L_0x01aa;
            case 3: goto L_0x01a2;
            case 4: goto L_0x019a;
            case 5: goto L_0x0192;
            case 6: goto L_0x018a;
            case 7: goto L_0x0182;
            case 8: goto L_0x017a;
            case 9: goto L_0x0172;
            case 10: goto L_0x016a;
            case 11: goto L_0x0162;
            case 12: goto L_0x015a;
            case 13: goto L_0x0152;
            case 14: goto L_0x014a;
            case 15: goto L_0x0142;
            case 16: goto L_0x0139;
            case 17: goto L_0x0130;
            case 18: goto L_0x0127;
            case 19: goto L_0x011e;
            case 20: goto L_0x0115;
            case 21: goto L_0x010c;
            default: goto L_0x010a;
        };
    L_0x010a:
        goto L_0x01c1;
    L_0x010c:
        r0 = r8.getFloat(r7, r0);
        r5.setZIndex(r6, r0);
        goto L_0x01c1;
    L_0x0115:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateY(r6, r0);
        goto L_0x01c1;
    L_0x011e:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateX(r6, r0);
        goto L_0x01c1;
    L_0x0127:
        r0 = r8.getArray(r7);
        r5.setTransform(r6, r0);
        goto L_0x01c1;
    L_0x0130:
        r0 = r8.getString(r7);
        r5.setTestId(r6, r0);
        goto L_0x01c1;
    L_0x0139:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleY(r6, r0);
        goto L_0x01c1;
    L_0x0142:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleX(r6, r0);
        goto L_0x01c1;
    L_0x014a:
        r0 = r8.getFloat(r7, r0);
        r5.setRotation(r6, r0);
        goto L_0x01c1;
    L_0x0152:
        r0 = r8.getBoolean(r7, r2);
        r5.setRenderToHardwareTexture(r6, r0);
        goto L_0x01c1;
    L_0x015a:
        r0 = r8.getFloat(r7, r1);
        r5.setOpacity(r6, r0);
        goto L_0x01c1;
    L_0x0162:
        r0 = r8.getBoolean(r7, r2);
        r5.setOn(r6, r0);
        goto L_0x01c1;
    L_0x016a:
        r0 = r8.getString(r7);
        r5.setNativeId(r6, r0);
        goto L_0x01c1;
    L_0x0172:
        r0 = r8.getString(r7);
        r5.setImportantForAccessibility(r6, r0);
        goto L_0x01c1;
    L_0x017a:
        r0 = r8.getBoolean(r7, r3);
        r5.setEnabled(r6, r0);
        goto L_0x01c1;
    L_0x0182:
        r0 = r8.getFloat(r7, r0);
        r5.setElevation(r6, r0);
        goto L_0x01c1;
    L_0x018a:
        r0 = r8.getInt(r7, r2);
        r5.setBackgroundColor(r6, r0);
        goto L_0x01c1;
    L_0x0192:
        r0 = r8.getArray(r7);
        r5.setViewStates(r6, r0);
        goto L_0x01c1;
    L_0x019a:
        r0 = r8.getString(r7);
        r5.setAccessibilityRole(r6, r0);
        goto L_0x01c1;
    L_0x01a2:
        r0 = r8.getString(r7);
        r5.setAccessibilityLiveRegion(r6, r0);
        goto L_0x01c1;
    L_0x01aa:
        r0 = r8.getString(r7);
        r5.setAccessibilityLabel(r6, r0);
        goto L_0x01c1;
    L_0x01b2:
        r0 = r8.getString(r7);
        r5.setAccessibilityHint(r6, r0);
        goto L_0x01c1;
    L_0x01ba:
        r0 = r8.getString(r7);
        r5.setAccessibilityComponentType(r6, r0);
    L_0x01c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.views.switchview.ReactSwitchManager$$PropsSetter.setProperty(com.facebook.react.uimanager.ViewManager, android.view.View, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
