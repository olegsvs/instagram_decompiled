package com.facebook.react.views.text;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactTextViewManager$$PropsSetter implements ViewManagerSetter {
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
        map.put("borderBottomColor", str);
        str = "number";
        map.put("borderBottomLeftRadius", str);
        map.put("borderBottomRightRadius", str);
        map.put("borderBottomWidth", str);
        str = "Color";
        map.put("borderColor", str);
        map.put("borderLeftColor", str);
        str = "number";
        map.put("borderLeftWidth", str);
        map.put("borderRadius", str);
        map.put("borderRightColor", "Color");
        map.put("borderRightWidth", "number");
        map.put("borderStyle", "String");
        map.put("borderTopColor", "Color");
        str = "number";
        map.put("borderTopLeftRadius", str);
        map.put("borderTopRightRadius", str);
        map.put("borderTopWidth", str);
        map.put("borderWidth", str);
        map.put("disabled", "boolean");
        map.put("elevation", "number");
        str = "String";
        map.put("ellipsizeMode", str);
        map.put("importantForAccessibility", str);
        map.put("includeFontPadding", "boolean");
        map.put(BaseViewManager.PROP_NATIVE_ID, "String");
        str = "number";
        map.put("numberOfLines", str);
        map.put("opacity", str);
        map.put("renderToHardwareTextureAndroid", "boolean");
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("selectable", "boolean");
        map.put("selectionColor", "Color");
        str = "String";
        map.put(BaseViewManager.PROP_TEST_ID, str);
        map.put("textAlignVertical", str);
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.text.ReactTextViewManager r10, com.facebook.react.views.text.ReactTextView r11, java.lang.String r12, com.facebook.react.uimanager.ReactStylesDiffMap r13) {
        /*
        r0 = r12.hashCode();
        r7 = 2;
        r6 = 3;
        r5 = 4;
        r4 = 1;
        r2 = 0;
        switch(r0) {
            case -1989576717: goto L_0x01f3;
            case -1971292586: goto L_0x01e8;
            case -1721943862: goto L_0x01dd;
            case -1721943861: goto L_0x01d2;
            case -1702963415: goto L_0x01c8;
            case -1655575466: goto L_0x01bd;
            case -1470826662: goto L_0x01b2;
            case -1452542531: goto L_0x01a7;
            case -1329887265: goto L_0x019c;
            case -1308858324: goto L_0x0192;
            case -1290574193: goto L_0x0187;
            case -1267206133: goto L_0x017c;
            case -1228066334: goto L_0x0170;
            case -908189618: goto L_0x0164;
            case -908189617: goto L_0x0158;
            case -877170387: goto L_0x014c;
            case -731417480: goto L_0x0140;
            case -242276144: goto L_0x0134;
            case -223992013: goto L_0x0128;
            case -101663499: goto L_0x011d;
            case -101359900: goto L_0x0112;
            case -80891667: goto L_0x0106;
            case -40300674: goto L_0x00fa;
            case -4379043: goto L_0x00ee;
            case 36255470: goto L_0x00e3;
            case 270940796: goto L_0x00d7;
            case 333432965: goto L_0x00cb;
            case 581268560: goto L_0x00bf;
            case 588239831: goto L_0x00b3;
            case 722830999: goto L_0x00a7;
            case 737768677: goto L_0x009b;
            case 741115130: goto L_0x008f;
            case 746986311: goto L_0x0083;
            case 1052666732: goto L_0x0077;
            case 1146842694: goto L_0x006c;
            case 1287124693: goto L_0x0061;
            case 1349188574: goto L_0x0055;
            case 1410320624: goto L_0x004a;
            case 1806129616: goto L_0x003e;
            case 1869416814: goto L_0x0032;
            case 2020113146: goto L_0x0026;
            case 2045685618: goto L_0x001a;
            case 2142299447: goto L_0x000e;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x01fe;
    L_0x000e:
        r0 = "selectionColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0016:
        r9 = 36;
        goto L_0x01ff;
    L_0x001a:
        r0 = "nativeID";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0022:
        r9 = 28;
        goto L_0x01ff;
    L_0x0026:
        r0 = "includeFontPadding";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x002e:
        r9 = 27;
        goto L_0x01ff;
    L_0x0032:
        r0 = "textAlignVertical";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x003a:
        r9 = 38;
        goto L_0x01ff;
    L_0x003e:
        r0 = "ellipsizeMode";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0046:
        r9 = 25;
        goto L_0x01ff;
    L_0x004a:
        r0 = "accessibilityStates";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0052:
        r9 = 5;
        goto L_0x01ff;
    L_0x0055:
        r0 = "borderRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x005d:
        r9 = 14;
        goto L_0x01ff;
    L_0x0061:
        r0 = "backgroundColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0069:
        r9 = 6;
        goto L_0x01ff;
    L_0x006c:
        r0 = "accessibilityLabel";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0074:
        r9 = 2;
        goto L_0x01ff;
    L_0x0077:
        r0 = "transform";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x007f:
        r9 = 39;
        goto L_0x01ff;
    L_0x0083:
        r0 = "importantForAccessibility";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x008b:
        r9 = 26;
        goto L_0x01ff;
    L_0x008f:
        r0 = "borderWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0097:
        r9 = 22;
        goto L_0x01ff;
    L_0x009b:
        r0 = "borderStyle";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00a3:
        r9 = 17;
        goto L_0x01ff;
    L_0x00a7:
        r0 = "borderColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00af:
        r9 = 11;
        goto L_0x01ff;
    L_0x00b3:
        r0 = "borderBottomRightRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00bb:
        r9 = 9;
        goto L_0x01ff;
    L_0x00bf:
        r0 = "borderBottomLeftRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00c7:
        r9 = 8;
        goto L_0x01ff;
    L_0x00cb:
        r0 = "borderTopRightRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00d3:
        r9 = 20;
        goto L_0x01ff;
    L_0x00d7:
        r0 = "disabled";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00df:
        r9 = 23;
        goto L_0x01ff;
    L_0x00e3:
        r0 = "accessibilityLiveRegion";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00eb:
        r9 = 3;
        goto L_0x01ff;
    L_0x00ee:
        r0 = "elevation";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x00f6:
        r9 = 24;
        goto L_0x01ff;
    L_0x00fa:
        r0 = "rotation";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0102:
        r9 = 32;
        goto L_0x01ff;
    L_0x0106:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x010e:
        r9 = 31;
        goto L_0x01ff;
    L_0x0112:
        r0 = "accessibilityRole";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x011a:
        r9 = 4;
        goto L_0x01ff;
    L_0x011d:
        r0 = "accessibilityHint";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0125:
        r9 = 1;
        goto L_0x01ff;
    L_0x0128:
        r0 = "borderLeftWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0130:
        r9 = 13;
        goto L_0x01ff;
    L_0x0134:
        r0 = "borderLeftColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x013c:
        r9 = 12;
        goto L_0x01ff;
    L_0x0140:
        r0 = "zIndex";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0148:
        r9 = 42;
        goto L_0x01ff;
    L_0x014c:
        r0 = "testID";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0154:
        r9 = 37;
        goto L_0x01ff;
    L_0x0158:
        r0 = "scaleY";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0160:
        r9 = 34;
        goto L_0x01ff;
    L_0x0164:
        r0 = "scaleX";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x016c:
        r9 = 33;
        goto L_0x01ff;
    L_0x0170:
        r0 = "borderTopLeftRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0178:
        r9 = 19;
        goto L_0x01ff;
    L_0x017c:
        r0 = "opacity";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0184:
        r9 = 30;
        goto L_0x01ff;
    L_0x0187:
        r0 = "borderBottomWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x018f:
        r9 = 10;
        goto L_0x01ff;
    L_0x0192:
        r0 = "borderBottomColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x019a:
        r9 = 7;
        goto L_0x01ff;
    L_0x019c:
        r0 = "numberOfLines";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01a4:
        r9 = 29;
        goto L_0x01ff;
    L_0x01a7:
        r0 = "borderTopWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01af:
        r9 = 21;
        goto L_0x01ff;
    L_0x01b2:
        r0 = "borderTopColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01ba:
        r9 = 18;
        goto L_0x01ff;
    L_0x01bd:
        r0 = "selectable";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01c5:
        r9 = 35;
        goto L_0x01ff;
    L_0x01c8:
        r0 = "accessibilityComponentType";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01d0:
        r9 = 0;
        goto L_0x01ff;
    L_0x01d2:
        r0 = "translateY";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01da:
        r9 = 41;
        goto L_0x01ff;
    L_0x01dd:
        r0 = "translateX";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01e5:
        r9 = 40;
        goto L_0x01ff;
    L_0x01e8:
        r0 = "borderRightWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01f0:
        r9 = 16;
        goto L_0x01ff;
    L_0x01f3:
        r0 = "borderRightColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x01fb:
        r9 = 15;
        goto L_0x01ff;
    L_0x01fe:
        r9 = -1;
    L_0x01ff:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r1 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        switch(r9) {
            case 0: goto L_0x03be;
            case 1: goto L_0x03b6;
            case 2: goto L_0x03ae;
            case 3: goto L_0x03a6;
            case 4: goto L_0x039e;
            case 5: goto L_0x0396;
            case 6: goto L_0x038e;
            case 7: goto L_0x037b;
            case 8: goto L_0x0373;
            case 9: goto L_0x036b;
            case 10: goto L_0x0363;
            case 11: goto L_0x0350;
            case 12: goto L_0x033d;
            case 13: goto L_0x0334;
            case 14: goto L_0x032b;
            case 15: goto L_0x0317;
            case 16: goto L_0x030e;
            case 17: goto L_0x0305;
            case 18: goto L_0x02f1;
            case 19: goto L_0x02e8;
            case 20: goto L_0x02df;
            case 21: goto L_0x02d6;
            case 22: goto L_0x02cd;
            case 23: goto L_0x02c4;
            case 24: goto L_0x02bb;
            case 25: goto L_0x02b2;
            case 26: goto L_0x02a9;
            case 27: goto L_0x02a0;
            case 28: goto L_0x0297;
            case 29: goto L_0x028b;
            case 30: goto L_0x0282;
            case 31: goto L_0x0279;
            case 32: goto L_0x0270;
            case 33: goto L_0x0267;
            case 34: goto L_0x025e;
            case 35: goto L_0x0255;
            case 36: goto L_0x0241;
            case 37: goto L_0x0238;
            case 38: goto L_0x022f;
            case 39: goto L_0x0226;
            case 40: goto L_0x021d;
            case 41: goto L_0x0214;
            case 42: goto L_0x020b;
            default: goto L_0x0209;
        };
    L_0x0209:
        goto L_0x03c5;
    L_0x020b:
        r0 = r13.getFloat(r12, r3);
        r10.setZIndex(r11, r0);
        goto L_0x03c5;
    L_0x0214:
        r0 = r13.getFloat(r12, r3);
        r10.setTranslateY(r11, r0);
        goto L_0x03c5;
    L_0x021d:
        r0 = r13.getFloat(r12, r3);
        r10.setTranslateX(r11, r0);
        goto L_0x03c5;
    L_0x0226:
        r0 = r13.getArray(r12);
        r10.setTransform(r11, r0);
        goto L_0x03c5;
    L_0x022f:
        r0 = r13.getString(r12);
        r10.setTextAlignVertical(r11, r0);
        goto L_0x03c5;
    L_0x0238:
        r0 = r13.getString(r12);
        r10.setTestId(r11, r0);
        goto L_0x03c5;
    L_0x0241:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x0248;
    L_0x0247:
        goto L_0x0250;
    L_0x0248:
        r0 = r13.getInt(r12, r2);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x0250:
        r10.setSelectionColor(r11, r1);
        goto L_0x03c5;
    L_0x0255:
        r0 = r13.getBoolean(r12, r2);
        r10.setSelectable(r11, r0);
        goto L_0x03c5;
    L_0x025e:
        r0 = r13.getFloat(r12, r8);
        r10.setScaleY(r11, r0);
        goto L_0x03c5;
    L_0x0267:
        r0 = r13.getFloat(r12, r8);
        r10.setScaleX(r11, r0);
        goto L_0x03c5;
    L_0x0270:
        r0 = r13.getFloat(r12, r3);
        r10.setRotation(r11, r0);
        goto L_0x03c5;
    L_0x0279:
        r0 = r13.getBoolean(r12, r2);
        r10.setRenderToHardwareTexture(r11, r0);
        goto L_0x03c5;
    L_0x0282:
        r0 = r13.getFloat(r12, r8);
        r10.setOpacity(r11, r0);
        goto L_0x03c5;
    L_0x028b:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = r13.getInt(r12, r0);
        r10.setNumberOfLines(r11, r0);
        goto L_0x03c5;
    L_0x0297:
        r0 = r13.getString(r12);
        r10.setNativeId(r11, r0);
        goto L_0x03c5;
    L_0x02a0:
        r0 = r13.getBoolean(r12, r4);
        r10.setIncludeFontPadding(r11, r0);
        goto L_0x03c5;
    L_0x02a9:
        r0 = r13.getString(r12);
        r10.setImportantForAccessibility(r11, r0);
        goto L_0x03c5;
    L_0x02b2:
        r0 = r13.getString(r12);
        r10.setEllipsizeMode(r11, r0);
        goto L_0x03c5;
    L_0x02bb:
        r0 = r13.getFloat(r12, r3);
        r10.setElevation(r11, r0);
        goto L_0x03c5;
    L_0x02c4:
        r0 = r13.getBoolean(r12, r2);
        r10.setDisabled(r11, r0);
        goto L_0x03c5;
    L_0x02cd:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r2, r0);
        goto L_0x03c5;
    L_0x02d6:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r6, r0);
        goto L_0x03c5;
    L_0x02df:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r7, r0);
        goto L_0x03c5;
    L_0x02e8:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r4, r0);
        goto L_0x03c5;
    L_0x02f1:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x02f8;
    L_0x02f7:
        goto L_0x0300;
    L_0x02f8:
        r0 = r13.getInt(r12, r2);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x0300:
        r10.setBorderColor(r11, r6, r1);
        goto L_0x03c5;
    L_0x0305:
        r0 = r13.getString(r12);
        r10.setBorderStyle(r11, r0);
        goto L_0x03c5;
    L_0x030e:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r7, r0);
        goto L_0x03c5;
    L_0x0317:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x031e;
    L_0x031d:
        goto L_0x0326;
    L_0x031e:
        r0 = r13.getInt(r12, r2);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x0326:
        r10.setBorderColor(r11, r7, r1);
        goto L_0x03c5;
    L_0x032b:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r2, r0);
        goto L_0x03c5;
    L_0x0334:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r4, r0);
        goto L_0x03c5;
    L_0x033d:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x0344;
    L_0x0343:
        goto L_0x034c;
    L_0x0344:
        r0 = r13.getInt(r12, r2);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x034c:
        r10.setBorderColor(r11, r4, r1);
        goto L_0x03c5;
    L_0x0350:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x0357;
    L_0x0356:
        goto L_0x035f;
    L_0x0357:
        r0 = r13.getInt(r12, r2);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x035f:
        r10.setBorderColor(r11, r2, r1);
        goto L_0x03c5;
    L_0x0363:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r5, r0);
        goto L_0x03c5;
    L_0x036b:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r6, r0);
        goto L_0x03c5;
    L_0x0373:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r5, r0);
        goto L_0x03c5;
    L_0x037b:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x0382;
    L_0x0381:
        goto L_0x038a;
    L_0x0382:
        r0 = r13.getInt(r12, r2);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x038a:
        r10.setBorderColor(r11, r5, r1);
        goto L_0x03c5;
    L_0x038e:
        r0 = r13.getInt(r12, r2);
        r10.setBackgroundColor(r11, r0);
        goto L_0x03c5;
    L_0x0396:
        r0 = r13.getArray(r12);
        r10.setViewStates(r11, r0);
        goto L_0x03c5;
    L_0x039e:
        r0 = r13.getString(r12);
        r10.setAccessibilityRole(r11, r0);
        goto L_0x03c5;
    L_0x03a6:
        r0 = r13.getString(r12);
        r10.setAccessibilityLiveRegion(r11, r0);
        goto L_0x03c5;
    L_0x03ae:
        r0 = r13.getString(r12);
        r10.setAccessibilityLabel(r11, r0);
        goto L_0x03c5;
    L_0x03b6:
        r0 = r13.getString(r12);
        r10.setAccessibilityHint(r11, r0);
        goto L_0x03c5;
    L_0x03be:
        r0 = r13.getString(r12);
        r10.setAccessibilityComponentType(r11, r0);
    L_0x03c5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager$$PropsSetter.setProperty(com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.views.text.ReactTextView, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
