package com.facebook.react.views.slider;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactSliderManager$$PropsSetter implements ViewManagerSetter {
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
        map.put("importantForAccessibility", "String");
        map.put("maximumTrackTintColor", "Color");
        map.put("maximumValue", "number");
        map.put("minimumTrackTintColor", "Color");
        map.put("minimumValue", "number");
        map.put(BaseViewManager.PROP_NATIVE_ID, "String");
        map.put("opacity", "number");
        map.put("renderToHardwareTextureAndroid", "boolean");
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("step", str);
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("thumbTintColor", "Color");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("value", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.slider.ReactSliderManager r8, com.facebook.react.views.slider.ReactSlider r9, java.lang.String r10, com.facebook.react.uimanager.ReactStylesDiffMap r11) {
        /*
        r0 = r10.hashCode();
        r6 = 1;
        r5 = 0;
        switch(r0) {
            case -1900655011: goto L_0x013c;
            case -1721943862: goto L_0x0131;
            case -1721943861: goto L_0x0126;
            case -1702963415: goto L_0x011c;
            case -1609594047: goto L_0x0111;
            case -1267206133: goto L_0x0106;
            case -1021497397: goto L_0x00fb;
            case -908189618: goto L_0x00f0;
            case -908189617: goto L_0x00e5;
            case -877170387: goto L_0x00da;
            case -731417480: goto L_0x00cf;
            case -101663499: goto L_0x00c5;
            case -101359900: goto L_0x00ba;
            case -80891667: goto L_0x00ae;
            case -40300674: goto L_0x00a2;
            case -4379043: goto L_0x0097;
            case 3540684: goto L_0x008b;
            case 36255470: goto L_0x0080;
            case 111972721: goto L_0x0074;
            case 718061361: goto L_0x0068;
            case 746986311: goto L_0x005c;
            case 1052666732: goto L_0x0050;
            case 1146842694: goto L_0x0045;
            case 1192487427: goto L_0x0039;
            case 1287124693: goto L_0x002e;
            case 1410320624: goto L_0x0023;
            case 1912319986: goto L_0x0017;
            case 2045685618: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x0147;
    L_0x000b:
        r0 = "nativeID";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0013:
        r7 = 14;
        goto L_0x0148;
    L_0x0017:
        r0 = "thumbTintColor";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x001f:
        r7 = 22;
        goto L_0x0148;
    L_0x0023:
        r0 = "accessibilityStates";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x002b:
        r7 = 5;
        goto L_0x0148;
    L_0x002e:
        r0 = "backgroundColor";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0036:
        r7 = 6;
        goto L_0x0148;
    L_0x0039:
        r0 = "minimumValue";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0041:
        r7 = 13;
        goto L_0x0148;
    L_0x0045:
        r0 = "accessibilityLabel";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x004d:
        r7 = 2;
        goto L_0x0148;
    L_0x0050:
        r0 = "transform";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0058:
        r7 = 23;
        goto L_0x0148;
    L_0x005c:
        r0 = "importantForAccessibility";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0064:
        r7 = 9;
        goto L_0x0148;
    L_0x0068:
        r0 = "maximumValue";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0070:
        r7 = 11;
        goto L_0x0148;
    L_0x0074:
        r0 = "value";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x007c:
        r7 = 26;
        goto L_0x0148;
    L_0x0080:
        r0 = "accessibilityLiveRegion";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0088:
        r7 = 3;
        goto L_0x0148;
    L_0x008b:
        r0 = "step";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0093:
        r7 = 20;
        goto L_0x0148;
    L_0x0097:
        r0 = "elevation";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x009f:
        r7 = 7;
        goto L_0x0148;
    L_0x00a2:
        r0 = "rotation";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00aa:
        r7 = 17;
        goto L_0x0148;
    L_0x00ae:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00b6:
        r7 = 16;
        goto L_0x0148;
    L_0x00ba:
        r0 = "accessibilityRole";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00c2:
        r7 = 4;
        goto L_0x0148;
    L_0x00c5:
        r0 = "accessibilityHint";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00cd:
        r7 = 1;
        goto L_0x0148;
    L_0x00cf:
        r0 = "zIndex";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00d7:
        r7 = 27;
        goto L_0x0148;
    L_0x00da:
        r0 = "testID";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00e2:
        r7 = 21;
        goto L_0x0148;
    L_0x00e5:
        r0 = "scaleY";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00ed:
        r7 = 19;
        goto L_0x0148;
    L_0x00f0:
        r0 = "scaleX";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x00f8:
        r7 = 18;
        goto L_0x0148;
    L_0x00fb:
        r0 = "minimumTrackTintColor";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0103:
        r7 = 12;
        goto L_0x0148;
    L_0x0106:
        r0 = "opacity";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x010e:
        r7 = 15;
        goto L_0x0148;
    L_0x0111:
        r0 = "enabled";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0119:
        r7 = 8;
        goto L_0x0148;
    L_0x011c:
        r0 = "accessibilityComponentType";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0124:
        r7 = 0;
        goto L_0x0148;
    L_0x0126:
        r0 = "translateY";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x012e:
        r7 = 25;
        goto L_0x0148;
    L_0x0131:
        r0 = "translateX";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0139:
        r7 = 24;
        goto L_0x0148;
    L_0x013c:
        r0 = "maximumTrackTintColor";
        r0 = r10.equals(r0);
        if (r0 == 0) goto L_0x0147;
    L_0x0144:
        r7 = 10;
        goto L_0x0148;
    L_0x0147:
        r7 = -1;
    L_0x0148:
        r4 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        r2 = 0;
        switch(r7) {
            case 0: goto L_0x025d;
            case 1: goto L_0x0255;
            case 2: goto L_0x024d;
            case 3: goto L_0x0245;
            case 4: goto L_0x023d;
            case 5: goto L_0x0235;
            case 6: goto L_0x022d;
            case 7: goto L_0x0225;
            case 8: goto L_0x021d;
            case 9: goto L_0x0215;
            case 10: goto L_0x0202;
            case 11: goto L_0x01f8;
            case 12: goto L_0x01e5;
            case 13: goto L_0x01dc;
            case 14: goto L_0x01d3;
            case 15: goto L_0x01ca;
            case 16: goto L_0x01c1;
            case 17: goto L_0x01b8;
            case 18: goto L_0x01af;
            case 19: goto L_0x01a6;
            case 20: goto L_0x019d;
            case 21: goto L_0x0194;
            case 22: goto L_0x0180;
            case 23: goto L_0x0177;
            case 24: goto L_0x016e;
            case 25: goto L_0x0165;
            case 26: goto L_0x015c;
            case 27: goto L_0x0153;
            default: goto L_0x0151;
        };
    L_0x0151:
        goto L_0x0264;
    L_0x0153:
        r0 = r11.getFloat(r10, r2);
        r8.setZIndex(r9, r0);
        goto L_0x0264;
    L_0x015c:
        r0 = r11.getDouble(r10, r0);
        r8.setValue(r9, r0);
        goto L_0x0264;
    L_0x0165:
        r0 = r11.getFloat(r10, r2);
        r8.setTranslateY(r9, r0);
        goto L_0x0264;
    L_0x016e:
        r0 = r11.getFloat(r10, r2);
        r8.setTranslateX(r9, r0);
        goto L_0x0264;
    L_0x0177:
        r0 = r11.getArray(r10);
        r8.setTransform(r9, r0);
        goto L_0x0264;
    L_0x0180:
        r0 = r11.isNull(r10);
        if (r0 == 0) goto L_0x0187;
    L_0x0186:
        goto L_0x018f;
    L_0x0187:
        r0 = r11.getInt(r10, r5);
        r4 = java.lang.Integer.valueOf(r0);
    L_0x018f:
        r8.setThumbTintColor(r9, r4);
        goto L_0x0264;
    L_0x0194:
        r0 = r11.getString(r10);
        r8.setTestId(r9, r0);
        goto L_0x0264;
    L_0x019d:
        r0 = r11.getDouble(r10, r0);
        r8.setStep(r9, r0);
        goto L_0x0264;
    L_0x01a6:
        r0 = r11.getFloat(r10, r3);
        r8.setScaleY(r9, r0);
        goto L_0x0264;
    L_0x01af:
        r0 = r11.getFloat(r10, r3);
        r8.setScaleX(r9, r0);
        goto L_0x0264;
    L_0x01b8:
        r0 = r11.getFloat(r10, r2);
        r8.setRotation(r9, r0);
        goto L_0x0264;
    L_0x01c1:
        r0 = r11.getBoolean(r10, r5);
        r8.setRenderToHardwareTexture(r9, r0);
        goto L_0x0264;
    L_0x01ca:
        r0 = r11.getFloat(r10, r3);
        r8.setOpacity(r9, r0);
        goto L_0x0264;
    L_0x01d3:
        r0 = r11.getString(r10);
        r8.setNativeId(r9, r0);
        goto L_0x0264;
    L_0x01dc:
        r0 = r11.getDouble(r10, r0);
        r8.setMinimumValue(r9, r0);
        goto L_0x0264;
    L_0x01e5:
        r0 = r11.isNull(r10);
        if (r0 == 0) goto L_0x01ec;
    L_0x01eb:
        goto L_0x01f4;
    L_0x01ec:
        r0 = r11.getInt(r10, r5);
        r4 = java.lang.Integer.valueOf(r0);
    L_0x01f4:
        r8.setMinimumTrackTintColor(r9, r4);
        goto L_0x0264;
    L_0x01f8:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r0 = r11.getDouble(r10, r0);
        r8.setMaximumValue(r9, r0);
        goto L_0x0264;
    L_0x0202:
        r0 = r11.isNull(r10);
        if (r0 == 0) goto L_0x0209;
    L_0x0208:
        goto L_0x0211;
    L_0x0209:
        r0 = r11.getInt(r10, r5);
        r4 = java.lang.Integer.valueOf(r0);
    L_0x0211:
        r8.setMaximumTrackTintColor(r9, r4);
        goto L_0x0264;
    L_0x0215:
        r0 = r11.getString(r10);
        r8.setImportantForAccessibility(r9, r0);
        goto L_0x0264;
    L_0x021d:
        r0 = r11.getBoolean(r10, r6);
        r8.setEnabled(r9, r0);
        goto L_0x0264;
    L_0x0225:
        r0 = r11.getFloat(r10, r2);
        r8.setElevation(r9, r0);
        goto L_0x0264;
    L_0x022d:
        r0 = r11.getInt(r10, r5);
        r8.setBackgroundColor(r9, r0);
        goto L_0x0264;
    L_0x0235:
        r0 = r11.getArray(r10);
        r8.setViewStates(r9, r0);
        goto L_0x0264;
    L_0x023d:
        r0 = r11.getString(r10);
        r8.setAccessibilityRole(r9, r0);
        goto L_0x0264;
    L_0x0245:
        r0 = r11.getString(r10);
        r8.setAccessibilityLiveRegion(r9, r0);
        goto L_0x0264;
    L_0x024d:
        r0 = r11.getString(r10);
        r8.setAccessibilityLabel(r9, r0);
        goto L_0x0264;
    L_0x0255:
        r0 = r11.getString(r10);
        r8.setAccessibilityHint(r9, r0);
        goto L_0x0264;
    L_0x025d:
        r0 = r11.getString(r10);
        r8.setAccessibilityComponentType(r9, r0);
    L_0x0264:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.slider.ReactSliderManager$$PropsSetter.setProperty(com.facebook.react.views.slider.ReactSliderManager, com.facebook.react.views.slider.ReactSlider, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
