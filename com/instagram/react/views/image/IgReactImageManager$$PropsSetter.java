package com.instagram.react.views.image;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class IgReactImageManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        map.put("backgroundColor", "Color");
        str = "number";
        map.put("borderBottomLeftRadius", str);
        map.put("borderBottomRightRadius", str);
        map.put("borderRadius", str);
        map.put("borderTopLeftRadius", str);
        map.put("borderTopRightRadius", str);
        map.put("elevation", str);
        str = "String";
        map.put("importantForAccessibility", str);
        map.put(BaseViewManager.PROP_NATIVE_ID, str);
        map.put("opacity", "number");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("resizeMode", "String");
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("shouldNotifyLoadEvents", "boolean");
        map.put("src", "Array");
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("tintColor", "Color");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setProperty(com.facebook.react.uimanager.ViewManager r9, android.view.View r10, java.lang.String r11, com.facebook.react.uimanager.ReactStylesDiffMap r12) {
        /*
        r8 = this;
        r9 = (com.instagram.react.views.image.IgReactImageManager) r9;
        r10 = (X.AnonymousClass5tC) r10;
        r0 = r11.hashCode();
        r7 = 2;
        r6 = 1;
        r5 = 3;
        r4 = 4;
        r3 = 0;
        switch(r0) {
            case -1721943862: goto L_0x014f;
            case -1721943861: goto L_0x0144;
            case -1702963415: goto L_0x013a;
            case -1267206133: goto L_0x012f;
            case -1228066334: goto L_0x0124;
            case -908189618: goto L_0x0119;
            case -908189617: goto L_0x010e;
            case -877170387: goto L_0x0103;
            case -731417480: goto L_0x00f8;
            case -101663499: goto L_0x00ee;
            case -101359900: goto L_0x00e4;
            case -80891667: goto L_0x00d9;
            case -40300674: goto L_0x00cd;
            case -4379043: goto L_0x00c1;
            case 114148: goto L_0x00b5;
            case 36255470: goto L_0x00aa;
            case 167841179: goto L_0x009e;
            case 333432965: goto L_0x0092;
            case 581268560: goto L_0x0087;
            case 588239831: goto L_0x007b;
            case 746986311: goto L_0x006f;
            case 1052666732: goto L_0x0063;
            case 1146842694: goto L_0x0058;
            case 1287124693: goto L_0x004d;
            case 1327599912: goto L_0x0041;
            case 1349188574: goto L_0x0035;
            case 1410320624: goto L_0x002a;
            case 2045685618: goto L_0x001e;
            case 2049757303: goto L_0x0012;
            default: goto L_0x0010;
        };
    L_0x0010:
        goto L_0x015a;
    L_0x0012:
        r0 = "resizeMode";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x001a:
        r8 = 17;
        goto L_0x015b;
    L_0x001e:
        r0 = "nativeID";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0026:
        r8 = 14;
        goto L_0x015b;
    L_0x002a:
        r0 = "accessibilityStates";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0032:
        r8 = 5;
        goto L_0x015b;
    L_0x0035:
        r0 = "borderRadius";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x003d:
        r8 = 9;
        goto L_0x015b;
    L_0x0041:
        r0 = "tintColor";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0049:
        r8 = 24;
        goto L_0x015b;
    L_0x004d:
        r0 = "backgroundColor";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0055:
        r8 = 6;
        goto L_0x015b;
    L_0x0058:
        r0 = "accessibilityLabel";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0060:
        r8 = 2;
        goto L_0x015b;
    L_0x0063:
        r0 = "transform";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x006b:
        r8 = 25;
        goto L_0x015b;
    L_0x006f:
        r0 = "importantForAccessibility";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0077:
        r8 = 13;
        goto L_0x015b;
    L_0x007b:
        r0 = "borderBottomRightRadius";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0083:
        r8 = 8;
        goto L_0x015b;
    L_0x0087:
        r0 = "borderBottomLeftRadius";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x008f:
        r8 = 7;
        goto L_0x015b;
    L_0x0092:
        r0 = "borderTopRightRadius";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x009a:
        r8 = 11;
        goto L_0x015b;
    L_0x009e:
        r0 = "shouldNotifyLoadEvents";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00a6:
        r8 = 21;
        goto L_0x015b;
    L_0x00aa:
        r0 = "accessibilityLiveRegion";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00b2:
        r8 = 3;
        goto L_0x015b;
    L_0x00b5:
        r0 = "src";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00bd:
        r8 = 22;
        goto L_0x015b;
    L_0x00c1:
        r0 = "elevation";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00c9:
        r8 = 12;
        goto L_0x015b;
    L_0x00cd:
        r0 = "rotation";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00d5:
        r8 = 18;
        goto L_0x015b;
    L_0x00d9:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00e1:
        r8 = 16;
        goto L_0x015b;
    L_0x00e4:
        r0 = "accessibilityRole";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00ec:
        r8 = 4;
        goto L_0x015b;
    L_0x00ee:
        r0 = "accessibilityHint";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x00f6:
        r8 = 1;
        goto L_0x015b;
    L_0x00f8:
        r0 = "zIndex";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0100:
        r8 = 28;
        goto L_0x015b;
    L_0x0103:
        r0 = "testID";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x010b:
        r8 = 23;
        goto L_0x015b;
    L_0x010e:
        r0 = "scaleY";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0116:
        r8 = 20;
        goto L_0x015b;
    L_0x0119:
        r0 = "scaleX";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0121:
        r8 = 19;
        goto L_0x015b;
    L_0x0124:
        r0 = "borderTopLeftRadius";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x012c:
        r8 = 10;
        goto L_0x015b;
    L_0x012f:
        r0 = "opacity";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0137:
        r8 = 15;
        goto L_0x015b;
    L_0x013a:
        r0 = "accessibilityComponentType";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0142:
        r8 = 0;
        goto L_0x015b;
    L_0x0144:
        r0 = "translateY";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x014c:
        r8 = 27;
        goto L_0x015b;
    L_0x014f:
        r0 = "translateX";
        r0 = r11.equals(r0);
        if (r0 == 0) goto L_0x015a;
    L_0x0157:
        r8 = 26;
        goto L_0x015b;
    L_0x015a:
        r8 = -1;
    L_0x015b:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        switch(r8) {
            case 0: goto L_0x025f;
            case 1: goto L_0x0257;
            case 2: goto L_0x024f;
            case 3: goto L_0x0247;
            case 4: goto L_0x023f;
            case 5: goto L_0x0237;
            case 6: goto L_0x022f;
            case 7: goto L_0x0227;
            case 8: goto L_0x021f;
            case 9: goto L_0x0217;
            case 10: goto L_0x020f;
            case 11: goto L_0x0207;
            case 12: goto L_0x01ff;
            case 13: goto L_0x01f7;
            case 14: goto L_0x01ef;
            case 15: goto L_0x01e7;
            case 16: goto L_0x01de;
            case 17: goto L_0x01d5;
            case 18: goto L_0x01cc;
            case 19: goto L_0x01c3;
            case 20: goto L_0x01ba;
            case 21: goto L_0x01b1;
            case 22: goto L_0x01a8;
            case 23: goto L_0x019f;
            case 24: goto L_0x018a;
            case 25: goto L_0x0181;
            case 26: goto L_0x0178;
            case 27: goto L_0x016f;
            case 28: goto L_0x0166;
            default: goto L_0x0164;
        };
    L_0x0164:
        goto L_0x0266;
    L_0x0166:
        r0 = r12.getFloat(r11, r1);
        r9.setZIndex(r10, r0);
        goto L_0x0266;
    L_0x016f:
        r0 = r12.getFloat(r11, r1);
        r9.setTranslateY(r10, r0);
        goto L_0x0266;
    L_0x0178:
        r0 = r12.getFloat(r11, r1);
        r9.setTranslateX(r10, r0);
        goto L_0x0266;
    L_0x0181:
        r0 = r12.getArray(r11);
        r9.setTransform(r10, r0);
        goto L_0x0266;
    L_0x018a:
        r0 = r12.isNull(r11);
        if (r0 == 0) goto L_0x0192;
    L_0x0190:
        r0 = 0;
        goto L_0x019a;
    L_0x0192:
        r0 = r12.getInt(r11, r3);
        r0 = java.lang.Integer.valueOf(r0);
    L_0x019a:
        r9.setTintColor(r10, r0);
        goto L_0x0266;
    L_0x019f:
        r0 = r12.getString(r11);
        r9.setTestId(r10, r0);
        goto L_0x0266;
    L_0x01a8:
        r0 = r12.getArray(r11);
        r9.setSource(r10, r0);
        goto L_0x0266;
    L_0x01b1:
        r0 = r12.getBoolean(r11, r3);
        r9.setShouldNotifyLoadEvents(r10, r0);
        goto L_0x0266;
    L_0x01ba:
        r0 = r12.getFloat(r11, r2);
        r9.setScaleY(r10, r0);
        goto L_0x0266;
    L_0x01c3:
        r0 = r12.getFloat(r11, r2);
        r9.setScaleX(r10, r0);
        goto L_0x0266;
    L_0x01cc:
        r0 = r12.getFloat(r11, r1);
        r9.setRotation(r10, r0);
        goto L_0x0266;
    L_0x01d5:
        r0 = r12.getString(r11);
        r9.setResizeMode(r10, r0);
        goto L_0x0266;
    L_0x01de:
        r0 = r12.getBoolean(r11, r3);
        r9.setRenderToHardwareTexture(r10, r0);
        goto L_0x0266;
    L_0x01e7:
        r0 = r12.getFloat(r11, r2);
        r9.setOpacity(r10, r0);
        goto L_0x0266;
    L_0x01ef:
        r0 = r12.getString(r11);
        r9.setNativeId(r10, r0);
        goto L_0x0266;
    L_0x01f7:
        r0 = r12.getString(r11);
        r9.setImportantForAccessibility(r10, r0);
        goto L_0x0266;
    L_0x01ff:
        r0 = r12.getFloat(r11, r1);
        r9.setElevation(r10, r0);
        goto L_0x0266;
    L_0x0207:
        r0 = r12.getFloat(r11, r0);
        r9.setBorderRadius(r10, r7, r0);
        goto L_0x0266;
    L_0x020f:
        r0 = r12.getFloat(r11, r0);
        r9.setBorderRadius(r10, r6, r0);
        goto L_0x0266;
    L_0x0217:
        r0 = r12.getFloat(r11, r0);
        r9.setBorderRadius(r10, r3, r0);
        goto L_0x0266;
    L_0x021f:
        r0 = r12.getFloat(r11, r0);
        r9.setBorderRadius(r10, r5, r0);
        goto L_0x0266;
    L_0x0227:
        r0 = r12.getFloat(r11, r0);
        r9.setBorderRadius(r10, r4, r0);
        goto L_0x0266;
    L_0x022f:
        r0 = r12.getInt(r11, r3);
        r9.setBackgroundColor(r10, r0);
        goto L_0x0266;
    L_0x0237:
        r0 = r12.getArray(r11);
        r9.setViewStates(r10, r0);
        goto L_0x0266;
    L_0x023f:
        r0 = r12.getString(r11);
        r9.setAccessibilityRole(r10, r0);
        goto L_0x0266;
    L_0x0247:
        r0 = r12.getString(r11);
        r9.setAccessibilityLiveRegion(r10, r0);
        goto L_0x0266;
    L_0x024f:
        r0 = r12.getString(r11);
        r9.setAccessibilityLabel(r10, r0);
        goto L_0x0266;
    L_0x0257:
        r0 = r12.getString(r11);
        r9.setAccessibilityHint(r10, r0);
        goto L_0x0266;
    L_0x025f:
        r0 = r12.getString(r11);
        r9.setAccessibilityComponentType(r10, r0);
    L_0x0266:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.views.image.IgReactImageManager$$PropsSetter.setProperty(com.facebook.react.uimanager.ViewManager, android.view.View, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
