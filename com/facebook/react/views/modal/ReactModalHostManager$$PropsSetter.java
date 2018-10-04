package com.facebook.react.views.modal;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactModalHostManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        map.put("animationType", "String");
        map.put("backgroundColor", "Color");
        map.put("elevation", "number");
        map.put("hardwareAccelerated", "boolean");
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
        map.put("transparent", "boolean");
        map.put("zIndex", "number");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.modal.ReactModalHostManager r4, com.facebook.react.views.modal.ReactModalHostView r5, java.lang.String r6, com.facebook.react.uimanager.ReactStylesDiffMap r7) {
        /*
        r0 = r6.hashCode();
        r2 = 0;
        switch(r0) {
            case -1726194350: goto L_0x00ff;
            case -1721943862: goto L_0x00f4;
            case -1721943861: goto L_0x00e9;
            case -1702963415: goto L_0x00df;
            case -1267206133: goto L_0x00d4;
            case -908189618: goto L_0x00c9;
            case -908189617: goto L_0x00be;
            case -877170387: goto L_0x00b3;
            case -731417480: goto L_0x00a8;
            case -101663499: goto L_0x009e;
            case -101359900: goto L_0x0094;
            case -80891667: goto L_0x0089;
            case -40300674: goto L_0x007d;
            case -4379043: goto L_0x0071;
            case 36255470: goto L_0x0066;
            case 746986311: goto L_0x005a;
            case 1052666732: goto L_0x004e;
            case 1146842694: goto L_0x0043;
            case 1195991583: goto L_0x0037;
            case 1287124693: goto L_0x002c;
            case 1410320624: goto L_0x0021;
            case 2031205598: goto L_0x0016;
            case 2045685618: goto L_0x000a;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x010a;
    L_0x000a:
        r0 = "nativeID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0012:
        r3 = 11;
        goto L_0x010b;
    L_0x0016:
        r0 = "animationType";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x001e:
        r3 = 6;
        goto L_0x010b;
    L_0x0021:
        r0 = "accessibilityStates";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0029:
        r3 = 5;
        goto L_0x010b;
    L_0x002c:
        r0 = "backgroundColor";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0034:
        r3 = 7;
        goto L_0x010b;
    L_0x0037:
        r0 = "hardwareAccelerated";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x003f:
        r3 = 9;
        goto L_0x010b;
    L_0x0043:
        r0 = "accessibilityLabel";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x004b:
        r3 = 2;
        goto L_0x010b;
    L_0x004e:
        r0 = "transform";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0056:
        r3 = 18;
        goto L_0x010b;
    L_0x005a:
        r0 = "importantForAccessibility";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0062:
        r3 = 10;
        goto L_0x010b;
    L_0x0066:
        r0 = "accessibilityLiveRegion";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x006e:
        r3 = 3;
        goto L_0x010b;
    L_0x0071:
        r0 = "elevation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0079:
        r3 = 8;
        goto L_0x010b;
    L_0x007d:
        r0 = "rotation";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0085:
        r3 = 14;
        goto L_0x010b;
    L_0x0089:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0091:
        r3 = 13;
        goto L_0x010b;
    L_0x0094:
        r0 = "accessibilityRole";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x009c:
        r3 = 4;
        goto L_0x010b;
    L_0x009e:
        r0 = "accessibilityHint";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00a6:
        r3 = 1;
        goto L_0x010b;
    L_0x00a8:
        r0 = "zIndex";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00b0:
        r3 = 22;
        goto L_0x010b;
    L_0x00b3:
        r0 = "testID";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00bb:
        r3 = 17;
        goto L_0x010b;
    L_0x00be:
        r0 = "scaleY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00c6:
        r3 = 16;
        goto L_0x010b;
    L_0x00c9:
        r0 = "scaleX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00d1:
        r3 = 15;
        goto L_0x010b;
    L_0x00d4:
        r0 = "opacity";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00dc:
        r3 = 12;
        goto L_0x010b;
    L_0x00df:
        r0 = "accessibilityComponentType";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00e7:
        r3 = 0;
        goto L_0x010b;
    L_0x00e9:
        r0 = "translateY";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00f1:
        r3 = 20;
        goto L_0x010b;
    L_0x00f4:
        r0 = "translateX";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x00fc:
        r3 = 19;
        goto L_0x010b;
    L_0x00ff:
        r0 = "transparent";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x0107:
        r3 = 21;
        goto L_0x010b;
    L_0x010a:
        r3 = -1;
    L_0x010b:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r3) {
            case 0: goto L_0x01ca;
            case 1: goto L_0x01c2;
            case 2: goto L_0x01ba;
            case 3: goto L_0x01b2;
            case 4: goto L_0x01aa;
            case 5: goto L_0x01a2;
            case 6: goto L_0x019a;
            case 7: goto L_0x0192;
            case 8: goto L_0x018a;
            case 9: goto L_0x0182;
            case 10: goto L_0x017a;
            case 11: goto L_0x0172;
            case 12: goto L_0x016a;
            case 13: goto L_0x0162;
            case 14: goto L_0x015a;
            case 15: goto L_0x0152;
            case 16: goto L_0x0149;
            case 17: goto L_0x0140;
            case 18: goto L_0x0137;
            case 19: goto L_0x012e;
            case 20: goto L_0x0125;
            case 21: goto L_0x011c;
            case 22: goto L_0x0113;
            default: goto L_0x0111;
        };
    L_0x0111:
        goto L_0x01d1;
    L_0x0113:
        r0 = r7.getFloat(r6, r0);
        r4.setZIndex(r5, r0);
        goto L_0x01d1;
    L_0x011c:
        r0 = r7.getBoolean(r6, r2);
        r4.setTransparent(r5, r0);
        goto L_0x01d1;
    L_0x0125:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateY(r5, r0);
        goto L_0x01d1;
    L_0x012e:
        r0 = r7.getFloat(r6, r0);
        r4.setTranslateX(r5, r0);
        goto L_0x01d1;
    L_0x0137:
        r0 = r7.getArray(r6);
        r4.setTransform(r5, r0);
        goto L_0x01d1;
    L_0x0140:
        r0 = r7.getString(r6);
        r4.setTestId(r5, r0);
        goto L_0x01d1;
    L_0x0149:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleY(r5, r0);
        goto L_0x01d1;
    L_0x0152:
        r0 = r7.getFloat(r6, r1);
        r4.setScaleX(r5, r0);
        goto L_0x01d1;
    L_0x015a:
        r0 = r7.getFloat(r6, r0);
        r4.setRotation(r5, r0);
        goto L_0x01d1;
    L_0x0162:
        r0 = r7.getBoolean(r6, r2);
        r4.setRenderToHardwareTexture(r5, r0);
        goto L_0x01d1;
    L_0x016a:
        r0 = r7.getFloat(r6, r1);
        r4.setOpacity(r5, r0);
        goto L_0x01d1;
    L_0x0172:
        r0 = r7.getString(r6);
        r4.setNativeId(r5, r0);
        goto L_0x01d1;
    L_0x017a:
        r0 = r7.getString(r6);
        r4.setImportantForAccessibility(r5, r0);
        goto L_0x01d1;
    L_0x0182:
        r0 = r7.getBoolean(r6, r2);
        r4.setHardwareAccelerated(r5, r0);
        goto L_0x01d1;
    L_0x018a:
        r0 = r7.getFloat(r6, r0);
        r4.setElevation(r5, r0);
        goto L_0x01d1;
    L_0x0192:
        r0 = r7.getInt(r6, r2);
        r4.setBackgroundColor(r5, r0);
        goto L_0x01d1;
    L_0x019a:
        r0 = r7.getString(r6);
        r4.setAnimationType(r5, r0);
        goto L_0x01d1;
    L_0x01a2:
        r0 = r7.getArray(r6);
        r4.setViewStates(r5, r0);
        goto L_0x01d1;
    L_0x01aa:
        r0 = r7.getString(r6);
        r4.setAccessibilityRole(r5, r0);
        goto L_0x01d1;
    L_0x01b2:
        r0 = r7.getString(r6);
        r4.setAccessibilityLiveRegion(r5, r0);
        goto L_0x01d1;
    L_0x01ba:
        r0 = r7.getString(r6);
        r4.setAccessibilityLabel(r5, r0);
        goto L_0x01d1;
    L_0x01c2:
        r0 = r7.getString(r6);
        r4.setAccessibilityHint(r5, r0);
        goto L_0x01d1;
    L_0x01ca:
        r0 = r7.getString(r6);
        r4.setAccessibilityComponentType(r5, r0);
    L_0x01d1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.modal.ReactModalHostManager$$PropsSetter.setProperty(com.facebook.react.views.modal.ReactModalHostManager, com.facebook.react.views.modal.ReactModalHostView, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
