package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactScrollViewManager$$PropsSetter implements ViewManagerSetter {
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
        map.put("decelerationRate", str);
        map.put("elevation", str);
        map.put("endFillColor", "Color");
        str = "String";
        map.put("importantForAccessibility", str);
        map.put(BaseViewManager.PROP_NATIVE_ID, str);
        map.put("nestedScrollEnabled", "boolean");
        map.put("opacity", "number");
        map.put("overScrollMode", "String");
        str = "boolean";
        map.put("pagingEnabled", str);
        map.put("removeClippedSubviews", str);
        map.put("renderToHardwareTextureAndroid", str);
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("scrollEnabled", "boolean");
        map.put("scrollPerfTag", "String");
        str = "boolean";
        map.put("sendMomentumEvents", str);
        map.put("showsVerticalScrollIndicator", str);
        map.put("snapToEnd", str);
        map.put("snapToInterval", "number");
        map.put("snapToOffsets", "Array");
        map.put("snapToStart", "boolean");
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("zIndex", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.scroll.ReactScrollViewManager r10, com.facebook.react.views.scroll.ReactScrollView r11, java.lang.String r12, com.facebook.react.uimanager.ReactStylesDiffMap r13) {
        /*
        r0 = r12.hashCode();
        r7 = 2;
        r6 = 3;
        r5 = 4;
        r4 = 1;
        r3 = 0;
        switch(r0) {
            case -1989576717: goto L_0x0247;
            case -1971292586: goto L_0x023c;
            case -1736848515: goto L_0x0231;
            case -1729379382: goto L_0x0226;
            case -1721943862: goto L_0x021b;
            case -1721943861: goto L_0x0210;
            case -1702963415: goto L_0x0206;
            case -1553096443: goto L_0x01fb;
            case -1470826662: goto L_0x01f0;
            case -1452542531: goto L_0x01e5;
            case -1321236988: goto L_0x01da;
            case -1308858324: goto L_0x01d0;
            case -1290574193: goto L_0x01c4;
            case -1267206133: goto L_0x01b8;
            case -1228066334: goto L_0x01ac;
            case -1151046732: goto L_0x01a0;
            case -922092170: goto L_0x0194;
            case -908189618: goto L_0x0188;
            case -908189617: goto L_0x017c;
            case -877170387: goto L_0x0170;
            case -731417480: goto L_0x0164;
            case -502352363: goto L_0x0158;
            case -252105751: goto L_0x014c;
            case -242276144: goto L_0x0140;
            case -223992013: goto L_0x0134;
            case -220307356: goto L_0x0128;
            case -127745027: goto L_0x011c;
            case -101663499: goto L_0x0111;
            case -101359900: goto L_0x0106;
            case -80891667: goto L_0x00fa;
            case -40300674: goto L_0x00ee;
            case -4379043: goto L_0x00e2;
            case 36255470: goto L_0x00d7;
            case 212703926: goto L_0x00cb;
            case 333432965: goto L_0x00bf;
            case 581268560: goto L_0x00b3;
            case 588239831: goto L_0x00a7;
            case 692181369: goto L_0x009b;
            case 722830999: goto L_0x008f;
            case 737768677: goto L_0x0083;
            case 741115130: goto L_0x0077;
            case 746986311: goto L_0x006b;
            case 1052666732: goto L_0x005f;
            case 1146842694: goto L_0x0054;
            case 1287124693: goto L_0x0049;
            case 1349188574: goto L_0x003d;
            case 1410320624: goto L_0x0032;
            case 1979636379: goto L_0x0026;
            case 2045685618: goto L_0x001a;
            case 2129019807: goto L_0x000e;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x0252;
    L_0x000e:
        r0 = "decelerationRate";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0016:
        r9 = 23;
        goto L_0x0253;
    L_0x001a:
        r0 = "nativeID";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0022:
        r9 = 27;
        goto L_0x0253;
    L_0x0026:
        r0 = "snapToOffsets";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x002e:
        r9 = 43;
        goto L_0x0253;
    L_0x0032:
        r0 = "accessibilityStates";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x003a:
        r9 = 5;
        goto L_0x0253;
    L_0x003d:
        r0 = "borderRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0045:
        r9 = 14;
        goto L_0x0253;
    L_0x0049:
        r0 = "backgroundColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0051:
        r9 = 6;
        goto L_0x0253;
    L_0x0054:
        r0 = "accessibilityLabel";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x005c:
        r9 = 2;
        goto L_0x0253;
    L_0x005f:
        r0 = "transform";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0067:
        r9 = 46;
        goto L_0x0253;
    L_0x006b:
        r0 = "importantForAccessibility";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0073:
        r9 = 26;
        goto L_0x0253;
    L_0x0077:
        r0 = "borderWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x007f:
        r9 = 22;
        goto L_0x0253;
    L_0x0083:
        r0 = "borderStyle";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x008b:
        r9 = 17;
        goto L_0x0253;
    L_0x008f:
        r0 = "borderColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0097:
        r9 = 11;
        goto L_0x0253;
    L_0x009b:
        r0 = "sendMomentumEvents";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00a3:
        r9 = 39;
        goto L_0x0253;
    L_0x00a7:
        r0 = "borderBottomRightRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00af:
        r9 = 9;
        goto L_0x0253;
    L_0x00b3:
        r0 = "borderBottomLeftRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00bb:
        r9 = 8;
        goto L_0x0253;
    L_0x00bf:
        r0 = "borderTopRightRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00c7:
        r9 = 20;
        goto L_0x0253;
    L_0x00cb:
        r0 = "snapToEnd";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00d3:
        r9 = 41;
        goto L_0x0253;
    L_0x00d7:
        r0 = "accessibilityLiveRegion";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00df:
        r9 = 3;
        goto L_0x0253;
    L_0x00e2:
        r0 = "elevation";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00ea:
        r9 = 24;
        goto L_0x0253;
    L_0x00ee:
        r0 = "rotation";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x00f6:
        r9 = 34;
        goto L_0x0253;
    L_0x00fa:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0102:
        r9 = 33;
        goto L_0x0253;
    L_0x0106:
        r0 = "accessibilityRole";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x010e:
        r9 = 4;
        goto L_0x0253;
    L_0x0111:
        r0 = "accessibilityHint";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0119:
        r9 = 1;
        goto L_0x0253;
    L_0x011c:
        r0 = "nestedScrollEnabled";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0124:
        r9 = 28;
        goto L_0x0253;
    L_0x0128:
        r0 = "scrollPerfTag";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0130:
        r9 = 38;
        goto L_0x0253;
    L_0x0134:
        r0 = "borderLeftWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x013c:
        r9 = 13;
        goto L_0x0253;
    L_0x0140:
        r0 = "borderLeftColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0148:
        r9 = 12;
        goto L_0x0253;
    L_0x014c:
        r0 = "removeClippedSubviews";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0154:
        r9 = 32;
        goto L_0x0253;
    L_0x0158:
        r0 = "pagingEnabled";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0160:
        r9 = 31;
        goto L_0x0253;
    L_0x0164:
        r0 = "zIndex";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x016c:
        r9 = 49;
        goto L_0x0253;
    L_0x0170:
        r0 = "testID";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0178:
        r9 = 45;
        goto L_0x0253;
    L_0x017c:
        r0 = "scaleY";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0184:
        r9 = 36;
        goto L_0x0253;
    L_0x0188:
        r0 = "scaleX";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0190:
        r9 = 35;
        goto L_0x0253;
    L_0x0194:
        r0 = "showsVerticalScrollIndicator";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x019c:
        r9 = 40;
        goto L_0x0253;
    L_0x01a0:
        r0 = "scrollEnabled";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01a8:
        r9 = 37;
        goto L_0x0253;
    L_0x01ac:
        r0 = "borderTopLeftRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01b4:
        r9 = 19;
        goto L_0x0253;
    L_0x01b8:
        r0 = "opacity";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01c0:
        r9 = 29;
        goto L_0x0253;
    L_0x01c4:
        r0 = "borderBottomWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01cc:
        r9 = 10;
        goto L_0x0253;
    L_0x01d0:
        r0 = "borderBottomColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01d8:
        r9 = 7;
        goto L_0x0253;
    L_0x01da:
        r0 = "overScrollMode";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01e2:
        r9 = 30;
        goto L_0x0253;
    L_0x01e5:
        r0 = "borderTopWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01ed:
        r9 = 21;
        goto L_0x0253;
    L_0x01f0:
        r0 = "borderTopColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x01f8:
        r9 = 18;
        goto L_0x0253;
    L_0x01fb:
        r0 = "endFillColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0203:
        r9 = 25;
        goto L_0x0253;
    L_0x0206:
        r0 = "accessibilityComponentType";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x020e:
        r9 = 0;
        goto L_0x0253;
    L_0x0210:
        r0 = "translateY";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0218:
        r9 = 48;
        goto L_0x0253;
    L_0x021b:
        r0 = "translateX";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0223:
        r9 = 47;
        goto L_0x0253;
    L_0x0226:
        r0 = "snapToInterval";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x022e:
        r9 = 42;
        goto L_0x0253;
    L_0x0231:
        r0 = "snapToStart";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0239:
        r9 = 44;
        goto L_0x0253;
    L_0x023c:
        r0 = "borderRightWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x0244:
        r9 = 16;
        goto L_0x0253;
    L_0x0247:
        r0 = "borderRightColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0252;
    L_0x024f:
        r9 = 15;
        goto L_0x0253;
    L_0x0252:
        r9 = -1;
    L_0x0253:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = 0;
        r1 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        switch(r9) {
            case 0: goto L_0x0443;
            case 1: goto L_0x043b;
            case 2: goto L_0x0433;
            case 3: goto L_0x042b;
            case 4: goto L_0x0423;
            case 5: goto L_0x041b;
            case 6: goto L_0x0413;
            case 7: goto L_0x0400;
            case 8: goto L_0x03f8;
            case 9: goto L_0x03f0;
            case 10: goto L_0x03e8;
            case 11: goto L_0x03d5;
            case 12: goto L_0x03c2;
            case 13: goto L_0x03b9;
            case 14: goto L_0x03b0;
            case 15: goto L_0x039c;
            case 16: goto L_0x0393;
            case 17: goto L_0x038a;
            case 18: goto L_0x0376;
            case 19: goto L_0x036d;
            case 20: goto L_0x0364;
            case 21: goto L_0x035b;
            case 22: goto L_0x0352;
            case 23: goto L_0x0349;
            case 24: goto L_0x0340;
            case 25: goto L_0x0337;
            case 26: goto L_0x032e;
            case 27: goto L_0x0325;
            case 28: goto L_0x031c;
            case 29: goto L_0x0313;
            case 30: goto L_0x030a;
            case 31: goto L_0x0301;
            case 32: goto L_0x02f8;
            case 33: goto L_0x02ef;
            case 34: goto L_0x02e6;
            case 35: goto L_0x02dd;
            case 36: goto L_0x02d4;
            case 37: goto L_0x02cb;
            case 38: goto L_0x02c2;
            case 39: goto L_0x02b9;
            case 40: goto L_0x02b0;
            case 41: goto L_0x02a7;
            case 42: goto L_0x029e;
            case 43: goto L_0x0295;
            case 44: goto L_0x028c;
            case 45: goto L_0x0283;
            case 46: goto L_0x027a;
            case 47: goto L_0x0271;
            case 48: goto L_0x0268;
            case 49: goto L_0x025f;
            default: goto L_0x025d;
        };
    L_0x025d:
        goto L_0x044a;
    L_0x025f:
        r0 = r13.getFloat(r12, r1);
        r10.setZIndex(r11, r0);
        goto L_0x044a;
    L_0x0268:
        r0 = r13.getFloat(r12, r1);
        r10.setTranslateY(r11, r0);
        goto L_0x044a;
    L_0x0271:
        r0 = r13.getFloat(r12, r1);
        r10.setTranslateX(r11, r0);
        goto L_0x044a;
    L_0x027a:
        r0 = r13.getArray(r12);
        r10.setTransform(r11, r0);
        goto L_0x044a;
    L_0x0283:
        r0 = r13.getString(r12);
        r10.setTestId(r11, r0);
        goto L_0x044a;
    L_0x028c:
        r0 = r13.getBoolean(r12, r3);
        r10.setSnapToStart(r11, r0);
        goto L_0x044a;
    L_0x0295:
        r0 = r13.getArray(r12);
        r10.setSnapToOffsets(r11, r0);
        goto L_0x044a;
    L_0x029e:
        r0 = r13.getFloat(r12, r1);
        r10.setSnapToInterval(r11, r0);
        goto L_0x044a;
    L_0x02a7:
        r0 = r13.getBoolean(r12, r3);
        r10.setSnapToEnd(r11, r0);
        goto L_0x044a;
    L_0x02b0:
        r0 = r13.getBoolean(r12, r3);
        r10.setShowsVerticalScrollIndicator(r11, r0);
        goto L_0x044a;
    L_0x02b9:
        r0 = r13.getBoolean(r12, r3);
        r10.setSendMomentumEvents(r11, r0);
        goto L_0x044a;
    L_0x02c2:
        r0 = r13.getString(r12);
        r10.setScrollPerfTag(r11, r0);
        goto L_0x044a;
    L_0x02cb:
        r0 = r13.getBoolean(r12, r4);
        r10.setScrollEnabled(r11, r0);
        goto L_0x044a;
    L_0x02d4:
        r0 = r13.getFloat(r12, r8);
        r10.setScaleY(r11, r0);
        goto L_0x044a;
    L_0x02dd:
        r0 = r13.getFloat(r12, r8);
        r10.setScaleX(r11, r0);
        goto L_0x044a;
    L_0x02e6:
        r0 = r13.getFloat(r12, r1);
        r10.setRotation(r11, r0);
        goto L_0x044a;
    L_0x02ef:
        r0 = r13.getBoolean(r12, r3);
        r10.setRenderToHardwareTexture(r11, r0);
        goto L_0x044a;
    L_0x02f8:
        r0 = r13.getBoolean(r12, r3);
        r10.setRemoveClippedSubviews(r11, r0);
        goto L_0x044a;
    L_0x0301:
        r0 = r13.getBoolean(r12, r3);
        r10.setPagingEnabled(r11, r0);
        goto L_0x044a;
    L_0x030a:
        r0 = r13.getString(r12);
        r10.setOverScrollMode(r11, r0);
        goto L_0x044a;
    L_0x0313:
        r0 = r13.getFloat(r12, r8);
        r10.setOpacity(r11, r0);
        goto L_0x044a;
    L_0x031c:
        r0 = r13.getBoolean(r12, r3);
        r10.setNestedScrollEnabled(r11, r0);
        goto L_0x044a;
    L_0x0325:
        r0 = r13.getString(r12);
        r10.setNativeId(r11, r0);
        goto L_0x044a;
    L_0x032e:
        r0 = r13.getString(r12);
        r10.setImportantForAccessibility(r11, r0);
        goto L_0x044a;
    L_0x0337:
        r0 = r13.getInt(r12, r3);
        r10.setBottomFillColor(r11, r0);
        goto L_0x044a;
    L_0x0340:
        r0 = r13.getFloat(r12, r1);
        r10.setElevation(r11, r0);
        goto L_0x044a;
    L_0x0349:
        r0 = r13.getFloat(r12, r1);
        r10.setDecelerationRate(r11, r0);
        goto L_0x044a;
    L_0x0352:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r3, r0);
        goto L_0x044a;
    L_0x035b:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r6, r0);
        goto L_0x044a;
    L_0x0364:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r7, r0);
        goto L_0x044a;
    L_0x036d:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r4, r0);
        goto L_0x044a;
    L_0x0376:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x037d;
    L_0x037c:
        goto L_0x0385;
    L_0x037d:
        r0 = r13.getInt(r12, r3);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x0385:
        r10.setBorderColor(r11, r6, r2);
        goto L_0x044a;
    L_0x038a:
        r0 = r13.getString(r12);
        r10.setBorderStyle(r11, r0);
        goto L_0x044a;
    L_0x0393:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r7, r0);
        goto L_0x044a;
    L_0x039c:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x03a3;
    L_0x03a2:
        goto L_0x03ab;
    L_0x03a3:
        r0 = r13.getInt(r12, r3);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x03ab:
        r10.setBorderColor(r11, r7, r2);
        goto L_0x044a;
    L_0x03b0:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r3, r0);
        goto L_0x044a;
    L_0x03b9:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r4, r0);
        goto L_0x044a;
    L_0x03c2:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x03c9;
    L_0x03c8:
        goto L_0x03d1;
    L_0x03c9:
        r0 = r13.getInt(r12, r3);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x03d1:
        r10.setBorderColor(r11, r4, r2);
        goto L_0x044a;
    L_0x03d5:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x03dc;
    L_0x03db:
        goto L_0x03e4;
    L_0x03dc:
        r0 = r13.getInt(r12, r3);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x03e4:
        r10.setBorderColor(r11, r3, r2);
        goto L_0x044a;
    L_0x03e8:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r5, r0);
        goto L_0x044a;
    L_0x03f0:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r6, r0);
        goto L_0x044a;
    L_0x03f8:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r5, r0);
        goto L_0x044a;
    L_0x0400:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x0407;
    L_0x0406:
        goto L_0x040f;
    L_0x0407:
        r0 = r13.getInt(r12, r3);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x040f:
        r10.setBorderColor(r11, r5, r2);
        goto L_0x044a;
    L_0x0413:
        r0 = r13.getInt(r12, r3);
        r10.setBackgroundColor(r11, r0);
        goto L_0x044a;
    L_0x041b:
        r0 = r13.getArray(r12);
        r10.setViewStates(r11, r0);
        goto L_0x044a;
    L_0x0423:
        r0 = r13.getString(r12);
        r10.setAccessibilityRole(r11, r0);
        goto L_0x044a;
    L_0x042b:
        r0 = r13.getString(r12);
        r10.setAccessibilityLiveRegion(r11, r0);
        goto L_0x044a;
    L_0x0433:
        r0 = r13.getString(r12);
        r10.setAccessibilityLabel(r11, r0);
        goto L_0x044a;
    L_0x043b:
        r0 = r13.getString(r12);
        r10.setAccessibilityHint(r11, r0);
        goto L_0x044a;
    L_0x0443:
        r0 = r13.getString(r12);
        r10.setAccessibilityComponentType(r11, r0);
    L_0x044a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.ReactScrollViewManager$$PropsSetter.setProperty(com.facebook.react.views.scroll.ReactScrollViewManager, com.facebook.react.views.scroll.ReactScrollView, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
