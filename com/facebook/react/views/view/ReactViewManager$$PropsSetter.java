package com.facebook.react.views.view;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactViewManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        map.put("accessible", "boolean");
        map.put("backfaceVisibility", "String");
        str = "Color";
        map.put("backgroundColor", str);
        map.put("borderBottomColor", str);
        str = "number";
        map.put("borderBottomEndRadius", str);
        map.put("borderBottomLeftRadius", str);
        map.put("borderBottomRightRadius", str);
        map.put("borderBottomStartRadius", str);
        map.put("borderBottomWidth", str);
        str = "Color";
        map.put("borderColor", str);
        map.put("borderEndColor", str);
        map.put("borderEndWidth", "number");
        map.put("borderLeftColor", "Color");
        str = "number";
        map.put("borderLeftWidth", str);
        map.put("borderRadius", str);
        map.put("borderRightColor", "Color");
        map.put("borderRightWidth", "number");
        map.put("borderStartColor", "Color");
        map.put("borderStartWidth", "number");
        map.put("borderStyle", "String");
        map.put("borderTopColor", "Color");
        str = "number";
        map.put("borderTopEndRadius", str);
        map.put("borderTopLeftRadius", str);
        map.put("borderTopRightRadius", str);
        map.put("borderTopStartRadius", str);
        map.put("borderTopWidth", str);
        map.put("borderWidth", str);
        map.put("collapsable", "boolean");
        map.put("elevation", "number");
        map.put("hasTVPreferredFocus", "boolean");
        map.put("hitSlop", "Map");
        map.put("importantForAccessibility", "String");
        str = "Map";
        map.put("nativeBackgroundAndroid", str);
        map.put("nativeForegroundAndroid", str);
        map.put(BaseViewManager.PROP_NATIVE_ID, "String");
        map.put("needsOffscreenAlphaCompositing", "boolean");
        map.put("opacity", "number");
        str = "String";
        map.put("overflow", str);
        map.put("pointerEvents", str);
        str = "boolean";
        map.put("removeClippedSubviews", str);
        map.put("renderToHardwareTextureAndroid", str);
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
    public static final void setProperty(com.facebook.react.views.view.ReactViewManager r17, com.facebook.react.views.view.ReactViewGroup r18, java.lang.String r19, com.facebook.react.uimanager.ReactStylesDiffMap r20) {
        /*
        r9 = r19;
        r0 = r9.hashCode();
        r14 = 7;
        r12 = 5;
        r11 = 2;
        r10 = 1;
        r7 = 6;
        r6 = 3;
        r5 = 4;
        r4 = 0;
        switch(r0) {
            case -1989576717: goto L_0x0290;
            case -1971292586: goto L_0x0285;
            case -1721943862: goto L_0x027a;
            case -1721943861: goto L_0x026f;
            case -1702963415: goto L_0x0264;
            case -1697814026: goto L_0x0259;
            case -1470826662: goto L_0x024e;
            case -1452542531: goto L_0x0243;
            case -1325118190: goto L_0x0238;
            case -1308858324: goto L_0x022d;
            case -1290574193: goto L_0x0222;
            case -1267206133: goto L_0x0217;
            case -1228066334: goto L_0x020b;
            case -1141400650: goto L_0x01ff;
            case -1122140597: goto L_0x01f3;
            case -908189618: goto L_0x01e7;
            case -908189617: goto L_0x01db;
            case -877170387: goto L_0x01cf;
            case -867333731: goto L_0x01c3;
            case -731417480: goto L_0x01b7;
            case -679581037: goto L_0x01ab;
            case -483490364: goto L_0x019f;
            case -293492298: goto L_0x0193;
            case -252105751: goto L_0x0187;
            case -242276144: goto L_0x017b;
            case -223992013: goto L_0x016f;
            case -148030058: goto L_0x0163;
            case -109689771: goto L_0x0157;
            case -101663499: goto L_0x014b;
            case -101359900: goto L_0x013f;
            case -80891667: goto L_0x0133;
            case -40300674: goto L_0x0127;
            case -4379043: goto L_0x011b;
            case 36255470: goto L_0x010f;
            case 333432965: goto L_0x0103;
            case 529642498: goto L_0x00f7;
            case 581268560: goto L_0x00eb;
            case 588239831: goto L_0x00df;
            case 722830999: goto L_0x00d3;
            case 737768677: goto L_0x00c7;
            case 741115130: goto L_0x00bb;
            case 746986311: goto L_0x00af;
            case 926871597: goto L_0x00a3;
            case 1052666732: goto L_0x0097;
            case 1146842694: goto L_0x008b;
            case 1220735892: goto L_0x007f;
            case 1239020023: goto L_0x0073;
            case 1287124693: goto L_0x0067;
            case 1349188574: goto L_0x005b;
            case 1410320624: goto L_0x004f;
            case 1667773924: goto L_0x0043;
            case 1747724810: goto L_0x0037;
            case 2045685618: goto L_0x002b;
            case 2119889261: goto L_0x001f;
            case 2138173392: goto L_0x0013;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x029b;
    L_0x0013:
        r0 = "borderStartWidth";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x001b:
        r16 = 24;
        goto L_0x029d;
    L_0x001f:
        r0 = "borderStartColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0027:
        r16 = 23;
        goto L_0x029d;
    L_0x002b:
        r0 = "nativeID";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0033:
        r16 = 40;
        goto L_0x029d;
    L_0x0037:
        r0 = "nativeBackgroundAndroid";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x003f:
        r16 = 38;
        goto L_0x029d;
    L_0x0043:
        r0 = "needsOffscreenAlphaCompositing";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x004b:
        r16 = 41;
        goto L_0x029d;
    L_0x004f:
        r0 = "accessibilityStates";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0057:
        r16 = 5;
        goto L_0x029d;
    L_0x005b:
        r0 = "borderRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0063:
        r16 = 20;
        goto L_0x029d;
    L_0x0067:
        r0 = "backgroundColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x006f:
        r16 = 8;
        goto L_0x029d;
    L_0x0073:
        r0 = "borderEndWidth";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x007b:
        r16 = 17;
        goto L_0x029d;
    L_0x007f:
        r0 = "borderEndColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0087:
        r16 = 16;
        goto L_0x029d;
    L_0x008b:
        r0 = "accessibilityLabel";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0093:
        r16 = 2;
        goto L_0x029d;
    L_0x0097:
        r0 = "transform";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x009f:
        r16 = 51;
        goto L_0x029d;
    L_0x00a3:
        r0 = "hitSlop";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00ab:
        r16 = 36;
        goto L_0x029d;
    L_0x00af:
        r0 = "importantForAccessibility";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00b7:
        r16 = 37;
        goto L_0x029d;
    L_0x00bb:
        r0 = "borderWidth";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00c3:
        r16 = 32;
        goto L_0x029d;
    L_0x00c7:
        r0 = "borderStyle";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00cf:
        r16 = 25;
        goto L_0x029d;
    L_0x00d3:
        r0 = "borderColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00db:
        r16 = 15;
        goto L_0x029d;
    L_0x00df:
        r0 = "borderBottomRightRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00e7:
        r16 = 12;
        goto L_0x029d;
    L_0x00eb:
        r0 = "borderBottomLeftRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00f3:
        r16 = 11;
        goto L_0x029d;
    L_0x00f7:
        r0 = "overflow";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x00ff:
        r16 = 43;
        goto L_0x029d;
    L_0x0103:
        r0 = "borderTopRightRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x010b:
        r16 = 29;
        goto L_0x029d;
    L_0x010f:
        r0 = "accessibilityLiveRegion";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0117:
        r16 = 3;
        goto L_0x029d;
    L_0x011b:
        r0 = "elevation";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0123:
        r16 = 34;
        goto L_0x029d;
    L_0x0127:
        r0 = "rotation";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x012f:
        r16 = 47;
        goto L_0x029d;
    L_0x0133:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x013b:
        r16 = 46;
        goto L_0x029d;
    L_0x013f:
        r0 = "accessibilityRole";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0147:
        r16 = 4;
        goto L_0x029d;
    L_0x014b:
        r0 = "accessibilityHint";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0153:
        r16 = 1;
        goto L_0x029d;
    L_0x0157:
        r0 = "nativeForegroundAndroid";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x015f:
        r16 = 39;
        goto L_0x029d;
    L_0x0163:
        r0 = "borderBottomEndRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x016b:
        r16 = 10;
        goto L_0x029d;
    L_0x016f:
        r0 = "borderLeftWidth";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0177:
        r16 = 19;
        goto L_0x029d;
    L_0x017b:
        r0 = "borderLeftColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0183:
        r16 = 18;
        goto L_0x029d;
    L_0x0187:
        r0 = "removeClippedSubviews";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x018f:
        r16 = 45;
        goto L_0x029d;
    L_0x0193:
        r0 = "pointerEvents";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x019b:
        r16 = 44;
        goto L_0x029d;
    L_0x019f:
        r0 = "borderTopEndRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01a7:
        r16 = 27;
        goto L_0x029d;
    L_0x01ab:
        r0 = "hasTVPreferredFocus";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01b3:
        r16 = 35;
        goto L_0x029d;
    L_0x01b7:
        r0 = "zIndex";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01bf:
        r16 = 54;
        goto L_0x029d;
    L_0x01c3:
        r0 = "borderBottomStartRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01cb:
        r16 = 13;
        goto L_0x029d;
    L_0x01cf:
        r0 = "testID";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01d7:
        r16 = 50;
        goto L_0x029d;
    L_0x01db:
        r0 = "scaleY";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01e3:
        r16 = 49;
        goto L_0x029d;
    L_0x01e7:
        r0 = "scaleX";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01ef:
        r16 = 48;
        goto L_0x029d;
    L_0x01f3:
        r0 = "borderTopStartRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x01fb:
        r16 = 30;
        goto L_0x029d;
    L_0x01ff:
        r0 = "accessible";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0207:
        r16 = 6;
        goto L_0x029d;
    L_0x020b:
        r0 = "borderTopLeftRadius";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0213:
        r16 = 28;
        goto L_0x029d;
    L_0x0217:
        r0 = "opacity";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x021f:
        r16 = 42;
        goto L_0x029d;
    L_0x0222:
        r0 = "borderBottomWidth";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x022a:
        r16 = 14;
        goto L_0x029d;
    L_0x022d:
        r0 = "borderBottomColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0235:
        r16 = 9;
        goto L_0x029d;
    L_0x0238:
        r0 = "collapsable";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0240:
        r16 = 33;
        goto L_0x029d;
    L_0x0243:
        r0 = "borderTopWidth";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x024b:
        r16 = 31;
        goto L_0x029d;
    L_0x024e:
        r0 = "borderTopColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0256:
        r16 = 26;
        goto L_0x029d;
    L_0x0259:
        r0 = "backfaceVisibility";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0261:
        r16 = 7;
        goto L_0x029d;
    L_0x0264:
        r0 = "accessibilityComponentType";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x026c:
        r16 = 0;
        goto L_0x029d;
    L_0x026f:
        r0 = "translateY";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0277:
        r16 = 53;
        goto L_0x029d;
    L_0x027a:
        r0 = "translateX";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0282:
        r16 = 52;
        goto L_0x029d;
    L_0x0285:
        r0 = "borderRightWidth";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x028d:
        r16 = 22;
        goto L_0x029d;
    L_0x0290:
        r0 = "borderRightColor";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x029b;
    L_0x0298:
        r16 = 21;
        goto L_0x029d;
    L_0x029b:
        r16 = -1;
    L_0x029d:
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13 = 0;
        r1 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        r8 = r20;
        r2 = r18;
        r3 = r17;
        switch(r16) {
            case 0: goto L_0x04d6;
            case 1: goto L_0x04ce;
            case 2: goto L_0x04c6;
            case 3: goto L_0x04be;
            case 4: goto L_0x04b6;
            case 5: goto L_0x04ae;
            case 6: goto L_0x04a6;
            case 7: goto L_0x049e;
            case 8: goto L_0x0496;
            case 9: goto L_0x0483;
            case 10: goto L_0x0479;
            case 11: goto L_0x0471;
            case 12: goto L_0x0469;
            case 13: goto L_0x0461;
            case 14: goto L_0x0459;
            case 15: goto L_0x0445;
            case 16: goto L_0x0431;
            case 17: goto L_0x0428;
            case 18: goto L_0x0414;
            case 19: goto L_0x040b;
            case 20: goto L_0x0402;
            case 21: goto L_0x03ee;
            case 22: goto L_0x03e5;
            case 23: goto L_0x03d1;
            case 24: goto L_0x03c8;
            case 25: goto L_0x03bf;
            case 26: goto L_0x03ab;
            case 27: goto L_0x03a2;
            case 28: goto L_0x0399;
            case 29: goto L_0x0390;
            case 30: goto L_0x0387;
            case 31: goto L_0x037e;
            case 32: goto L_0x0375;
            case 33: goto L_0x036c;
            case 34: goto L_0x0363;
            case 35: goto L_0x035a;
            case 36: goto L_0x0351;
            case 37: goto L_0x0348;
            case 38: goto L_0x033f;
            case 39: goto L_0x0336;
            case 40: goto L_0x032d;
            case 41: goto L_0x0324;
            case 42: goto L_0x031b;
            case 43: goto L_0x0312;
            case 44: goto L_0x0309;
            case 45: goto L_0x0300;
            case 46: goto L_0x02f7;
            case 47: goto L_0x02ee;
            case 48: goto L_0x02e5;
            case 49: goto L_0x02dc;
            case 50: goto L_0x02d3;
            case 51: goto L_0x02ca;
            case 52: goto L_0x02c1;
            case 53: goto L_0x02b8;
            case 54: goto L_0x02af;
            default: goto L_0x02ad;
        };
    L_0x02ad:
        goto L_0x04dd;
    L_0x02af:
        r0 = r8.getFloat(r9, r13);
        r3.setZIndex(r2, r0);
        goto L_0x04dd;
    L_0x02b8:
        r0 = r8.getFloat(r9, r13);
        r3.setTranslateY(r2, r0);
        goto L_0x04dd;
    L_0x02c1:
        r0 = r8.getFloat(r9, r13);
        r3.setTranslateX(r2, r0);
        goto L_0x04dd;
    L_0x02ca:
        r0 = r8.getArray(r9);
        r3.setTransform(r2, r0);
        goto L_0x04dd;
    L_0x02d3:
        r0 = r8.getString(r9);
        r3.setTestId(r2, r0);
        goto L_0x04dd;
    L_0x02dc:
        r0 = r8.getFloat(r9, r15);
        r3.setScaleY(r2, r0);
        goto L_0x04dd;
    L_0x02e5:
        r0 = r8.getFloat(r9, r15);
        r3.setScaleX(r2, r0);
        goto L_0x04dd;
    L_0x02ee:
        r0 = r8.getFloat(r9, r13);
        r3.setRotation(r2, r0);
        goto L_0x04dd;
    L_0x02f7:
        r0 = r8.getBoolean(r9, r4);
        r3.setRenderToHardwareTexture(r2, r0);
        goto L_0x04dd;
    L_0x0300:
        r0 = r8.getBoolean(r9, r4);
        r3.setRemoveClippedSubviews(r2, r0);
        goto L_0x04dd;
    L_0x0309:
        r0 = r8.getString(r9);
        r3.setPointerEvents(r2, r0);
        goto L_0x04dd;
    L_0x0312:
        r0 = r8.getString(r9);
        r3.setOverflow(r2, r0);
        goto L_0x04dd;
    L_0x031b:
        r0 = r8.getFloat(r9, r15);
        r3.setOpacity(r2, r0);
        goto L_0x04dd;
    L_0x0324:
        r0 = r8.getBoolean(r9, r4);
        r3.setNeedsOffscreenAlphaCompositing(r2, r0);
        goto L_0x04dd;
    L_0x032d:
        r0 = r8.getString(r9);
        r3.setNativeId(r2, r0);
        goto L_0x04dd;
    L_0x0336:
        r0 = r8.getMap(r9);
        r3.setNativeForeground(r2, r0);
        goto L_0x04dd;
    L_0x033f:
        r0 = r8.getMap(r9);
        r3.setNativeBackground(r2, r0);
        goto L_0x04dd;
    L_0x0348:
        r0 = r8.getString(r9);
        r3.setImportantForAccessibility(r2, r0);
        goto L_0x04dd;
    L_0x0351:
        r0 = r8.getMap(r9);
        r3.setHitSlop(r2, r0);
        goto L_0x04dd;
    L_0x035a:
        r0 = r8.getBoolean(r9, r4);
        r3.setTVPreferredFocus(r2, r0);
        goto L_0x04dd;
    L_0x0363:
        r0 = r8.getFloat(r9, r13);
        r3.setElevation(r2, r0);
        goto L_0x04dd;
    L_0x036c:
        r0 = r8.getBoolean(r9, r4);
        r3.setCollapsable(r2, r0);
        goto L_0x04dd;
    L_0x0375:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderWidth(r2, r4, r0);
        goto L_0x04dd;
    L_0x037e:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderWidth(r2, r6, r0);
        goto L_0x04dd;
    L_0x0387:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r12, r0);
        goto L_0x04dd;
    L_0x0390:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r11, r0);
        goto L_0x04dd;
    L_0x0399:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r10, r0);
        goto L_0x04dd;
    L_0x03a2:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r7, r0);
        goto L_0x04dd;
    L_0x03ab:
        r0 = r8.isNull(r9);
        if (r0 == 0) goto L_0x03b2;
    L_0x03b1:
        goto L_0x03ba;
    L_0x03b2:
        r0 = r8.getInt(r9, r4);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x03ba:
        r3.setBorderColor(r2, r6, r1);
        goto L_0x04dd;
    L_0x03bf:
        r0 = r8.getString(r9);
        r3.setBorderStyle(r2, r0);
        goto L_0x04dd;
    L_0x03c8:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderWidth(r2, r12, r0);
        goto L_0x04dd;
    L_0x03d1:
        r0 = r8.isNull(r9);
        if (r0 == 0) goto L_0x03d8;
    L_0x03d7:
        goto L_0x03e0;
    L_0x03d8:
        r0 = r8.getInt(r9, r4);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x03e0:
        r3.setBorderColor(r2, r12, r1);
        goto L_0x04dd;
    L_0x03e5:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderWidth(r2, r11, r0);
        goto L_0x04dd;
    L_0x03ee:
        r0 = r8.isNull(r9);
        if (r0 == 0) goto L_0x03f5;
    L_0x03f4:
        goto L_0x03fd;
    L_0x03f5:
        r0 = r8.getInt(r9, r4);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x03fd:
        r3.setBorderColor(r2, r11, r1);
        goto L_0x04dd;
    L_0x0402:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r4, r0);
        goto L_0x04dd;
    L_0x040b:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderWidth(r2, r10, r0);
        goto L_0x04dd;
    L_0x0414:
        r0 = r8.isNull(r9);
        if (r0 == 0) goto L_0x041b;
    L_0x041a:
        goto L_0x0423;
    L_0x041b:
        r0 = r8.getInt(r9, r4);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x0423:
        r3.setBorderColor(r2, r10, r1);
        goto L_0x04dd;
    L_0x0428:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderWidth(r2, r7, r0);
        goto L_0x04dd;
    L_0x0431:
        r0 = r8.isNull(r9);
        if (r0 == 0) goto L_0x0438;
    L_0x0437:
        goto L_0x0440;
    L_0x0438:
        r0 = r8.getInt(r9, r4);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x0440:
        r3.setBorderColor(r2, r7, r1);
        goto L_0x04dd;
    L_0x0445:
        r0 = r8.isNull(r9);
        if (r0 == 0) goto L_0x044c;
    L_0x044b:
        goto L_0x0454;
    L_0x044c:
        r0 = r8.getInt(r9, r4);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x0454:
        r3.setBorderColor(r2, r4, r1);
        goto L_0x04dd;
    L_0x0459:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderWidth(r2, r5, r0);
        goto L_0x04dd;
    L_0x0461:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r14, r0);
        goto L_0x04dd;
    L_0x0469:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r6, r0);
        goto L_0x04dd;
    L_0x0471:
        r0 = r8.getFloat(r9, r0);
        r3.setBorderRadius(r2, r5, r0);
        goto L_0x04dd;
    L_0x0479:
        r1 = r8.getFloat(r9, r0);
        r0 = 8;
        r3.setBorderRadius(r2, r0, r1);
        goto L_0x04dd;
    L_0x0483:
        r0 = r8.isNull(r9);
        if (r0 == 0) goto L_0x048a;
    L_0x0489:
        goto L_0x0492;
    L_0x048a:
        r0 = r8.getInt(r9, r4);
        r1 = java.lang.Integer.valueOf(r0);
    L_0x0492:
        r3.setBorderColor(r2, r5, r1);
        goto L_0x04dd;
    L_0x0496:
        r0 = r8.getInt(r9, r4);
        r3.setBackgroundColor(r2, r0);
        goto L_0x04dd;
    L_0x049e:
        r0 = r8.getString(r9);
        r3.setBackfaceVisibility(r2, r0);
        goto L_0x04dd;
    L_0x04a6:
        r0 = r8.getBoolean(r9, r4);
        r3.setAccessible(r2, r0);
        goto L_0x04dd;
    L_0x04ae:
        r0 = r8.getArray(r9);
        r3.setViewStates(r2, r0);
        goto L_0x04dd;
    L_0x04b6:
        r0 = r8.getString(r9);
        r3.setAccessibilityRole(r2, r0);
        goto L_0x04dd;
    L_0x04be:
        r0 = r8.getString(r9);
        r3.setAccessibilityLiveRegion(r2, r0);
        goto L_0x04dd;
    L_0x04c6:
        r0 = r8.getString(r9);
        r3.setAccessibilityLabel(r2, r0);
        goto L_0x04dd;
    L_0x04ce:
        r0 = r8.getString(r9);
        r3.setAccessibilityHint(r2, r0);
        goto L_0x04dd;
    L_0x04d6:
        r0 = r8.getString(r9);
        r3.setAccessibilityComponentType(r2, r0);
    L_0x04dd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewManager$$PropsSetter.setProperty(com.facebook.react.views.view.ReactViewManager, com.facebook.react.views.view.ReactViewGroup, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
