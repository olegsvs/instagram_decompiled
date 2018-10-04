package com.instagram.react.views.switchview;

import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter;
import java.util.Map;

public class ReactSwitchManager$ReactSwitchShadowNode$$PropsSetter implements ShadowNodeSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("alignContent", str);
        map.put("alignItems", str);
        map.put("alignSelf", str);
        str = "number";
        map.put("aspectRatio", str);
        map.put("borderBottomWidth", str);
        map.put("borderEndWidth", str);
        map.put("borderLeftWidth", str);
        map.put("borderRightWidth", str);
        map.put("borderStartWidth", str);
        map.put("borderTopWidth", str);
        map.put("borderWidth", str);
        map.put("bottom", "Dynamic");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("flex", "number");
        map.put("flexBasis", "Dynamic");
        map.put("flexDirection", "String");
        str = "number";
        map.put("flexGrow", str);
        map.put("flexShrink", str);
        map.put("flexWrap", "String");
        map.put("height", "Dynamic");
        map.put("justifyContent", "String");
        str = "Dynamic";
        map.put("left", str);
        map.put("margin", str);
        map.put("marginBottom", str);
        map.put("marginEnd", str);
        map.put("marginHorizontal", str);
        map.put("marginLeft", str);
        map.put("marginRight", str);
        map.put("marginStart", str);
        map.put("marginTop", str);
        map.put("marginVertical", str);
        map.put("maxHeight", str);
        map.put("maxWidth", str);
        map.put("minHeight", str);
        map.put("minWidth", str);
        map.put("onLayout", "boolean");
        map.put("overflow", "String");
        str = "Dynamic";
        map.put("padding", str);
        map.put("paddingBottom", str);
        map.put("paddingEnd", str);
        map.put("paddingHorizontal", str);
        map.put("paddingLeft", str);
        map.put("paddingRight", str);
        map.put("paddingStart", str);
        map.put("paddingTop", str);
        map.put("paddingVertical", str);
        map.put("position", "String");
        str = "Dynamic";
        map.put("right", str);
        map.put("start", str);
        map.put("top", str);
        map.put("width", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setProperty(com.facebook.react.uimanager.ReactShadowNode r12, java.lang.String r13, com.facebook.react.uimanager.ReactStylesDiffMap r14) {
        /*
        r11 = this;
        r12 = (com.instagram.react.views.switchview.ReactSwitchManager.ReactSwitchShadowNode) r12;
        r0 = r13.hashCode();
        r10 = 8;
        r9 = 7;
        r8 = 6;
        r7 = 3;
        r6 = 1;
        r5 = 5;
        r4 = 2;
        r3 = 4;
        r2 = 0;
        switch(r0) {
            case -1971292586: goto L_0x0267;
            case -1906103182: goto L_0x025c;
            case -1783760955: goto L_0x0251;
            case -1501175880: goto L_0x0246;
            case -1452542531: goto L_0x023b;
            case -1383228885: goto L_0x0230;
            case -1375815020: goto L_0x0225;
            case -1290574193: goto L_0x021b;
            case -1221029593: goto L_0x0210;
            case -1081309778: goto L_0x0205;
            case -1063257157: goto L_0x01fb;
            case -1044806579: goto L_0x01f0;
            case -1044792121: goto L_0x01e4;
            case -975171706: goto L_0x01d8;
            case -906066005: goto L_0x01cc;
            case -806339567: goto L_0x01c0;
            case -752601676: goto L_0x01b5;
            case -359890155: goto L_0x01a9;
            case -289173127: goto L_0x019d;
            case -223992013: goto L_0x0192;
            case -133587431: goto L_0x0186;
            case 100571: goto L_0x017a;
            case 115029: goto L_0x016e;
            case 3145721: goto L_0x0162;
            case 3317767: goto L_0x0156;
            case 90115850: goto L_0x014a;
            case 90130308: goto L_0x013e;
            case 108511772: goto L_0x0132;
            case 109757538: goto L_0x0126;
            case 113126854: goto L_0x011a;
            case 202355100: goto L_0x010e;
            case 400381634: goto L_0x0102;
            case 529642498: goto L_0x00f6;
            case 713848971: goto L_0x00ea;
            case 715094737: goto L_0x00de;
            case 741115130: goto L_0x00d2;
            case 747804969: goto L_0x00c6;
            case 975087886: goto L_0x00ba;
            case 976333652: goto L_0x00ae;
            case 1031115618: goto L_0x00a2;
            case 1092174483: goto L_0x0097;
            case 1239020023: goto L_0x008c;
            case 1288688105: goto L_0x0080;
            case 1343645351: goto L_0x0074;
            case 1431421764: goto L_0x0068;
            case 1671764162: goto L_0x005c;
            case 1743739820: goto L_0x0050;
            case 1744216035: goto L_0x0044;
            case 1767100401: goto L_0x0039;
            case 1860657097: goto L_0x002d;
            case 1970934485: goto L_0x0021;
            case 2138173392: goto L_0x0015;
            default: goto L_0x0013;
        };
    L_0x0013:
        goto L_0x0271;
    L_0x0015:
        r0 = "borderStartWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x001d:
        r11 = 8;
        goto L_0x0272;
    L_0x0021:
        r0 = "marginLeft";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0029:
        r11 = 27;
        goto L_0x0272;
    L_0x002d:
        r0 = "justifyContent";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0035:
        r11 = 21;
        goto L_0x0272;
    L_0x0039:
        r0 = "alignSelf";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0041:
        r11 = 2;
        goto L_0x0272;
    L_0x0044:
        r0 = "flexWrap";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x004c:
        r11 = 19;
        goto L_0x0272;
    L_0x0050:
        r0 = "flexGrow";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0058:
        r11 = 17;
        goto L_0x0272;
    L_0x005c:
        r0 = "display";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0064:
        r11 = 12;
        goto L_0x0272;
    L_0x0068:
        r0 = "marginVertical";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0070:
        r11 = 31;
        goto L_0x0272;
    L_0x0074:
        r0 = "paddingVertical";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x007c:
        r11 = 46;
        goto L_0x0272;
    L_0x0080:
        r0 = "onLayout";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0088:
        r11 = 36;
        goto L_0x0272;
    L_0x008c:
        r0 = "borderEndWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0094:
        r11 = 5;
        goto L_0x0272;
    L_0x0097:
        r0 = "aspectRatio";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x009f:
        r11 = 3;
        goto L_0x0272;
    L_0x00a2:
        r0 = "flexShrink";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00aa:
        r11 = 18;
        goto L_0x0272;
    L_0x00ae:
        r0 = "marginStart";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00b6:
        r11 = 29;
        goto L_0x0272;
    L_0x00ba:
        r0 = "marginRight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00c2:
        r11 = 28;
        goto L_0x0272;
    L_0x00c6:
        r0 = "position";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00ce:
        r11 = 47;
        goto L_0x0272;
    L_0x00d2:
        r0 = "borderWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00da:
        r11 = 10;
        goto L_0x0272;
    L_0x00de:
        r0 = "paddingStart";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00e6:
        r11 = 44;
        goto L_0x0272;
    L_0x00ea:
        r0 = "paddingRight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00f2:
        r11 = 43;
        goto L_0x0272;
    L_0x00f6:
        r0 = "overflow";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x00fe:
        r11 = 37;
        goto L_0x0272;
    L_0x0102:
        r0 = "maxWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x010a:
        r11 = 33;
        goto L_0x0272;
    L_0x010e:
        r0 = "paddingBottom";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0116:
        r11 = 39;
        goto L_0x0272;
    L_0x011a:
        r0 = "width";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0122:
        r11 = 51;
        goto L_0x0272;
    L_0x0126:
        r0 = "start";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x012e:
        r11 = 49;
        goto L_0x0272;
    L_0x0132:
        r0 = "right";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x013a:
        r11 = 48;
        goto L_0x0272;
    L_0x013e:
        r0 = "paddingTop";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0146:
        r11 = 45;
        goto L_0x0272;
    L_0x014a:
        r0 = "paddingEnd";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0152:
        r11 = 40;
        goto L_0x0272;
    L_0x0156:
        r0 = "left";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x015e:
        r11 = 22;
        goto L_0x0272;
    L_0x0162:
        r0 = "flex";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x016a:
        r11 = 14;
        goto L_0x0272;
    L_0x016e:
        r0 = "top";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0176:
        r11 = 50;
        goto L_0x0272;
    L_0x017a:
        r0 = "end";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0182:
        r11 = 13;
        goto L_0x0272;
    L_0x0186:
        r0 = "minHeight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x018e:
        r11 = 34;
        goto L_0x0272;
    L_0x0192:
        r0 = "borderLeftWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x019a:
        r11 = 6;
        goto L_0x0272;
    L_0x019d:
        r0 = "marginBottom";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01a5:
        r11 = 24;
        goto L_0x0272;
    L_0x01a9:
        r0 = "paddingHorizontal";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01b1:
        r11 = 41;
        goto L_0x0272;
    L_0x01b5:
        r0 = "alignContent";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01bd:
        r11 = 0;
        goto L_0x0272;
    L_0x01c0:
        r0 = "padding";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01c8:
        r11 = 38;
        goto L_0x0272;
    L_0x01cc:
        r0 = "maxHeight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01d4:
        r11 = 32;
        goto L_0x0272;
    L_0x01d8:
        r0 = "flexDirection";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01e0:
        r11 = 16;
        goto L_0x0272;
    L_0x01e4:
        r0 = "marginTop";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01ec:
        r11 = 30;
        goto L_0x0272;
    L_0x01f0:
        r0 = "marginEnd";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x01f8:
        r11 = 25;
        goto L_0x0272;
    L_0x01fb:
        r0 = "alignItems";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0203:
        r11 = 1;
        goto L_0x0272;
    L_0x0205:
        r0 = "margin";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x020d:
        r11 = 23;
        goto L_0x0272;
    L_0x0210:
        r0 = "height";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0218:
        r11 = 20;
        goto L_0x0272;
    L_0x021b:
        r0 = "borderBottomWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0223:
        r11 = 4;
        goto L_0x0272;
    L_0x0225:
        r0 = "minWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x022d:
        r11 = 35;
        goto L_0x0272;
    L_0x0230:
        r0 = "bottom";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0238:
        r11 = 11;
        goto L_0x0272;
    L_0x023b:
        r0 = "borderTopWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0243:
        r11 = 9;
        goto L_0x0272;
    L_0x0246:
        r0 = "paddingLeft";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x024e:
        r11 = 42;
        goto L_0x0272;
    L_0x0251:
        r0 = "flexBasis";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0259:
        r11 = 15;
        goto L_0x0272;
    L_0x025c:
        r0 = "marginHorizontal";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x0264:
        r11 = 26;
        goto L_0x0272;
    L_0x0267:
        r0 = "borderRightWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x0271;
    L_0x026f:
        r11 = 7;
        goto L_0x0272;
    L_0x0271:
        r11 = -1;
    L_0x0272:
        r1 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        switch(r11) {
            case 0: goto L_0x0437;
            case 1: goto L_0x042f;
            case 2: goto L_0x0427;
            case 3: goto L_0x041f;
            case 4: goto L_0x0417;
            case 5: goto L_0x040f;
            case 6: goto L_0x0407;
            case 7: goto L_0x03ff;
            case 8: goto L_0x03f7;
            case 9: goto L_0x03ef;
            case 10: goto L_0x03e7;
            case 11: goto L_0x03df;
            case 12: goto L_0x03d7;
            case 13: goto L_0x03cf;
            case 14: goto L_0x03c7;
            case 15: goto L_0x03bf;
            case 16: goto L_0x03b6;
            case 17: goto L_0x03ad;
            case 18: goto L_0x03a4;
            case 19: goto L_0x039b;
            case 20: goto L_0x0392;
            case 21: goto L_0x0389;
            case 22: goto L_0x0380;
            case 23: goto L_0x0377;
            case 24: goto L_0x036e;
            case 25: goto L_0x0365;
            case 26: goto L_0x035c;
            case 27: goto L_0x0353;
            case 28: goto L_0x034a;
            case 29: goto L_0x0341;
            case 30: goto L_0x0338;
            case 31: goto L_0x032f;
            case 32: goto L_0x0326;
            case 33: goto L_0x031d;
            case 34: goto L_0x0314;
            case 35: goto L_0x030b;
            case 36: goto L_0x0302;
            case 37: goto L_0x02f9;
            case 38: goto L_0x02f0;
            case 39: goto L_0x02e7;
            case 40: goto L_0x02de;
            case 41: goto L_0x02d5;
            case 42: goto L_0x02cc;
            case 43: goto L_0x02c3;
            case 44: goto L_0x02ba;
            case 45: goto L_0x02b1;
            case 46: goto L_0x02a8;
            case 47: goto L_0x029f;
            case 48: goto L_0x0296;
            case 49: goto L_0x028d;
            case 50: goto L_0x0284;
            case 51: goto L_0x027b;
            default: goto L_0x0279;
        };
    L_0x0279:
        goto L_0x043e;
    L_0x027b:
        r0 = r14.getDynamic(r13);
        r12.setWidth(r0);
        goto L_0x043e;
    L_0x0284:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r3, r0);
        goto L_0x043e;
    L_0x028d:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r2, r0);
        goto L_0x043e;
    L_0x0296:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r7, r0);
        goto L_0x043e;
    L_0x029f:
        r0 = r14.getString(r13);
        r12.setPosition(r0);
        goto L_0x043e;
    L_0x02a8:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r6, r0);
        goto L_0x043e;
    L_0x02b1:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r5, r0);
        goto L_0x043e;
    L_0x02ba:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r7, r0);
        goto L_0x043e;
    L_0x02c3:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r10, r0);
        goto L_0x043e;
    L_0x02cc:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r9, r0);
        goto L_0x043e;
    L_0x02d5:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r4, r0);
        goto L_0x043e;
    L_0x02de:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r3, r0);
        goto L_0x043e;
    L_0x02e7:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r8, r0);
        goto L_0x043e;
    L_0x02f0:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r2, r0);
        goto L_0x043e;
    L_0x02f9:
        r0 = r14.getString(r13);
        r12.setOverflow(r0);
        goto L_0x043e;
    L_0x0302:
        r0 = r14.getBoolean(r13, r2);
        r12.setShouldNotifyOnLayout(r0);
        goto L_0x043e;
    L_0x030b:
        r0 = r14.getDynamic(r13);
        r12.setMinWidth(r0);
        goto L_0x043e;
    L_0x0314:
        r0 = r14.getDynamic(r13);
        r12.setMinHeight(r0);
        goto L_0x043e;
    L_0x031d:
        r0 = r14.getDynamic(r13);
        r12.setMaxWidth(r0);
        goto L_0x043e;
    L_0x0326:
        r0 = r14.getDynamic(r13);
        r12.setMaxHeight(r0);
        goto L_0x043e;
    L_0x032f:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r6, r0);
        goto L_0x043e;
    L_0x0338:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r5, r0);
        goto L_0x043e;
    L_0x0341:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r7, r0);
        goto L_0x043e;
    L_0x034a:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r10, r0);
        goto L_0x043e;
    L_0x0353:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r9, r0);
        goto L_0x043e;
    L_0x035c:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r4, r0);
        goto L_0x043e;
    L_0x0365:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r3, r0);
        goto L_0x043e;
    L_0x036e:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r8, r0);
        goto L_0x043e;
    L_0x0377:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r2, r0);
        goto L_0x043e;
    L_0x0380:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r4, r0);
        goto L_0x043e;
    L_0x0389:
        r0 = r14.getString(r13);
        r12.setJustifyContent(r0);
        goto L_0x043e;
    L_0x0392:
        r0 = r14.getDynamic(r13);
        r12.setHeight(r0);
        goto L_0x043e;
    L_0x039b:
        r0 = r14.getString(r13);
        r12.setFlexWrap(r0);
        goto L_0x043e;
    L_0x03a4:
        r0 = r14.getFloat(r13, r1);
        r12.setFlexShrink(r0);
        goto L_0x043e;
    L_0x03ad:
        r0 = r14.getFloat(r13, r1);
        r12.setFlexGrow(r0);
        goto L_0x043e;
    L_0x03b6:
        r0 = r14.getString(r13);
        r12.setFlexDirection(r0);
        goto L_0x043e;
    L_0x03bf:
        r0 = r14.getDynamic(r13);
        r12.setFlexBasis(r0);
        goto L_0x043e;
    L_0x03c7:
        r0 = r14.getFloat(r13, r1);
        r12.setFlex(r0);
        goto L_0x043e;
    L_0x03cf:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r6, r0);
        goto L_0x043e;
    L_0x03d7:
        r0 = r14.getString(r13);
        r12.setDisplay(r0);
        goto L_0x043e;
    L_0x03df:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r5, r0);
        goto L_0x043e;
    L_0x03e7:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r2, r0);
        goto L_0x043e;
    L_0x03ef:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r7, r0);
        goto L_0x043e;
    L_0x03f7:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r6, r0);
        goto L_0x043e;
    L_0x03ff:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r8, r0);
        goto L_0x043e;
    L_0x0407:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r5, r0);
        goto L_0x043e;
    L_0x040f:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r4, r0);
        goto L_0x043e;
    L_0x0417:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r3, r0);
        goto L_0x043e;
    L_0x041f:
        r0 = r14.getFloat(r13, r0);
        r12.setAspectRatio(r0);
        goto L_0x043e;
    L_0x0427:
        r0 = r14.getString(r13);
        r12.setAlignSelf(r0);
        goto L_0x043e;
    L_0x042f:
        r0 = r14.getString(r13);
        r12.setAlignItems(r0);
        goto L_0x043e;
    L_0x0437:
        r0 = r14.getString(r13);
        r12.setAlignContent(r0);
    L_0x043e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.views.switchview.ReactSwitchManager$ReactSwitchShadowNode$$PropsSetter.setProperty(com.facebook.react.uimanager.ReactShadowNode, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
