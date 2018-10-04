package com.facebook.react.views.picker;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactDialogPickerManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        str = "Color";
        map.put("backgroundColor", str);
        map.put("color", str);
        map.put("elevation", "number");
        map.put("enabled", "boolean");
        map.put("importantForAccessibility", "String");
        map.put(DialogModule.KEY_ITEMS, "Array");
        map.put(BaseViewManager.PROP_NATIVE_ID, "String");
        map.put("opacity", "number");
        map.put("prompt", "String");
        map.put("renderToHardwareTextureAndroid", "boolean");
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("selected", str);
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.picker.ReactDialogPickerManager r5, com.facebook.react.views.picker.ReactPicker r6, java.lang.String r7, com.facebook.react.uimanager.ReactStylesDiffMap r8) {
        /*
        r0 = r7.hashCode();
        r3 = 1;
        r2 = 0;
        switch(r0) {
            case -1721943862: goto L_0x0118;
            case -1721943861: goto L_0x010d;
            case -1702963415: goto L_0x0103;
            case -1609594047: goto L_0x00f8;
            case -1267206133: goto L_0x00ed;
            case -979805852: goto L_0x00e2;
            case -908189618: goto L_0x00d7;
            case -908189617: goto L_0x00cc;
            case -877170387: goto L_0x00c1;
            case -731417480: goto L_0x00b6;
            case -101663499: goto L_0x00ac;
            case -101359900: goto L_0x00a2;
            case -80891667: goto L_0x0096;
            case -40300674: goto L_0x008a;
            case -4379043: goto L_0x007e;
            case 36255470: goto L_0x0073;
            case 94842723: goto L_0x0068;
            case 100526016: goto L_0x005c;
            case 746986311: goto L_0x0050;
            case 1052666732: goto L_0x0044;
            case 1146842694: goto L_0x0039;
            case 1191572123: goto L_0x002d;
            case 1287124693: goto L_0x0022;
            case 1410320624: goto L_0x0017;
            case 2045685618: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x0123;
    L_0x000b:
        r0 = "nativeID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0013:
        r4 = 12;
        goto L_0x0124;
    L_0x0017:
        r0 = "accessibilityStates";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x001f:
        r4 = 5;
        goto L_0x0124;
    L_0x0022:
        r0 = "backgroundColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x002a:
        r4 = 6;
        goto L_0x0124;
    L_0x002d:
        r0 = "selected";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0035:
        r4 = 19;
        goto L_0x0124;
    L_0x0039:
        r0 = "accessibilityLabel";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0041:
        r4 = 2;
        goto L_0x0124;
    L_0x0044:
        r0 = "transform";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x004c:
        r4 = 21;
        goto L_0x0124;
    L_0x0050:
        r0 = "importantForAccessibility";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0058:
        r4 = 10;
        goto L_0x0124;
    L_0x005c:
        r0 = "items";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0064:
        r4 = 11;
        goto L_0x0124;
    L_0x0068:
        r0 = "color";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0070:
        r4 = 7;
        goto L_0x0124;
    L_0x0073:
        r0 = "accessibilityLiveRegion";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x007b:
        r4 = 3;
        goto L_0x0124;
    L_0x007e:
        r0 = "elevation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0086:
        r4 = 8;
        goto L_0x0124;
    L_0x008a:
        r0 = "rotation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0092:
        r4 = 16;
        goto L_0x0124;
    L_0x0096:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x009e:
        r4 = 15;
        goto L_0x0124;
    L_0x00a2:
        r0 = "accessibilityRole";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00aa:
        r4 = 4;
        goto L_0x0124;
    L_0x00ac:
        r0 = "accessibilityHint";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00b4:
        r4 = 1;
        goto L_0x0124;
    L_0x00b6:
        r0 = "zIndex";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00be:
        r4 = 24;
        goto L_0x0124;
    L_0x00c1:
        r0 = "testID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00c9:
        r4 = 20;
        goto L_0x0124;
    L_0x00cc:
        r0 = "scaleY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00d4:
        r4 = 18;
        goto L_0x0124;
    L_0x00d7:
        r0 = "scaleX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00df:
        r4 = 17;
        goto L_0x0124;
    L_0x00e2:
        r0 = "prompt";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00ea:
        r4 = 14;
        goto L_0x0124;
    L_0x00ed:
        r0 = "opacity";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x00f5:
        r4 = 13;
        goto L_0x0124;
    L_0x00f8:
        r0 = "enabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0100:
        r4 = 9;
        goto L_0x0124;
    L_0x0103:
        r0 = "accessibilityComponentType";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x010b:
        r4 = 0;
        goto L_0x0124;
    L_0x010d:
        r0 = "translateY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0115:
        r4 = 23;
        goto L_0x0124;
    L_0x0118:
        r0 = "translateX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0120:
        r4 = 22;
        goto L_0x0124;
    L_0x0123:
        r4 = -1;
    L_0x0124:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r4) {
            case 0: goto L_0x0202;
            case 1: goto L_0x01fa;
            case 2: goto L_0x01f2;
            case 3: goto L_0x01ea;
            case 4: goto L_0x01e2;
            case 5: goto L_0x01da;
            case 6: goto L_0x01d2;
            case 7: goto L_0x01be;
            case 8: goto L_0x01b6;
            case 9: goto L_0x01ae;
            case 10: goto L_0x01a6;
            case 11: goto L_0x019e;
            case 12: goto L_0x0196;
            case 13: goto L_0x018e;
            case 14: goto L_0x0186;
            case 15: goto L_0x017d;
            case 16: goto L_0x0174;
            case 17: goto L_0x016b;
            case 18: goto L_0x0162;
            case 19: goto L_0x0159;
            case 20: goto L_0x0150;
            case 21: goto L_0x0147;
            case 22: goto L_0x013e;
            case 23: goto L_0x0135;
            case 24: goto L_0x012c;
            default: goto L_0x012a;
        };
    L_0x012a:
        goto L_0x0209;
    L_0x012c:
        r0 = r8.getFloat(r7, r0);
        r5.setZIndex(r6, r0);
        goto L_0x0209;
    L_0x0135:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateY(r6, r0);
        goto L_0x0209;
    L_0x013e:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateX(r6, r0);
        goto L_0x0209;
    L_0x0147:
        r0 = r8.getArray(r7);
        r5.setTransform(r6, r0);
        goto L_0x0209;
    L_0x0150:
        r0 = r8.getString(r7);
        r5.setTestId(r6, r0);
        goto L_0x0209;
    L_0x0159:
        r0 = r8.getInt(r7, r2);
        r5.setSelected(r6, r0);
        goto L_0x0209;
    L_0x0162:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleY(r6, r0);
        goto L_0x0209;
    L_0x016b:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleX(r6, r0);
        goto L_0x0209;
    L_0x0174:
        r0 = r8.getFloat(r7, r0);
        r5.setRotation(r6, r0);
        goto L_0x0209;
    L_0x017d:
        r0 = r8.getBoolean(r7, r2);
        r5.setRenderToHardwareTexture(r6, r0);
        goto L_0x0209;
    L_0x0186:
        r0 = r8.getString(r7);
        r5.setPrompt(r6, r0);
        goto L_0x0209;
    L_0x018e:
        r0 = r8.getFloat(r7, r1);
        r5.setOpacity(r6, r0);
        goto L_0x0209;
    L_0x0196:
        r0 = r8.getString(r7);
        r5.setNativeId(r6, r0);
        goto L_0x0209;
    L_0x019e:
        r0 = r8.getArray(r7);
        r5.setItems(r6, r0);
        goto L_0x0209;
    L_0x01a6:
        r0 = r8.getString(r7);
        r5.setImportantForAccessibility(r6, r0);
        goto L_0x0209;
    L_0x01ae:
        r0 = r8.getBoolean(r7, r3);
        r5.setEnabled(r6, r0);
        goto L_0x0209;
    L_0x01b6:
        r0 = r8.getFloat(r7, r0);
        r5.setElevation(r6, r0);
        goto L_0x0209;
    L_0x01be:
        r0 = r8.isNull(r7);
        if (r0 == 0) goto L_0x01c6;
    L_0x01c4:
        r0 = 0;
        goto L_0x01ce;
    L_0x01c6:
        r0 = r8.getInt(r7, r2);
        r0 = java.lang.Integer.valueOf(r0);
    L_0x01ce:
        r5.setColor(r6, r0);
        goto L_0x0209;
    L_0x01d2:
        r0 = r8.getInt(r7, r2);
        r5.setBackgroundColor(r6, r0);
        goto L_0x0209;
    L_0x01da:
        r0 = r8.getArray(r7);
        r5.setViewStates(r6, r0);
        goto L_0x0209;
    L_0x01e2:
        r0 = r8.getString(r7);
        r5.setAccessibilityRole(r6, r0);
        goto L_0x0209;
    L_0x01ea:
        r0 = r8.getString(r7);
        r5.setAccessibilityLiveRegion(r6, r0);
        goto L_0x0209;
    L_0x01f2:
        r0 = r8.getString(r7);
        r5.setAccessibilityLabel(r6, r0);
        goto L_0x0209;
    L_0x01fa:
        r0 = r8.getString(r7);
        r5.setAccessibilityHint(r6, r0);
        goto L_0x0209;
    L_0x0202:
        r0 = r8.getString(r7);
        r5.setAccessibilityComponentType(r6, r0);
    L_0x0209:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.picker.ReactDialogPickerManager$$PropsSetter.setProperty(com.facebook.react.views.picker.ReactDialogPickerManager, com.facebook.react.views.picker.ReactPicker, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
