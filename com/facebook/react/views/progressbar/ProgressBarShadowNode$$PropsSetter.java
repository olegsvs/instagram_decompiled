package com.facebook.react.views.progressbar;

import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter;
import java.util.Map;

public class ProgressBarShadowNode$$PropsSetter implements ShadowNodeSetter {
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
        map.put(ReactProgressBarViewManager.PROP_STYLE, "String");
        str = "Dynamic";
        map.put("top", str);
        map.put("width", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.progressbar.ProgressBarShadowNode r12, java.lang.String r13, com.facebook.react.uimanager.ReactStylesDiffMap r14) {
        /*
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
            case -1971292586: goto L_0x0271;
            case -1906103182: goto L_0x0266;
            case -1783760955: goto L_0x025b;
            case -1501175880: goto L_0x0250;
            case -1452542531: goto L_0x0245;
            case -1383228885: goto L_0x023a;
            case -1375815020: goto L_0x022f;
            case -1290574193: goto L_0x0225;
            case -1221029593: goto L_0x021a;
            case -1081309778: goto L_0x020f;
            case -1063257157: goto L_0x0205;
            case -1044806579: goto L_0x01fa;
            case -1044792121: goto L_0x01ee;
            case -975171706: goto L_0x01e2;
            case -906066005: goto L_0x01d6;
            case -806339567: goto L_0x01ca;
            case -752601676: goto L_0x01bf;
            case -359890155: goto L_0x01b3;
            case -289173127: goto L_0x01a7;
            case -223992013: goto L_0x019c;
            case -133587431: goto L_0x0190;
            case 100571: goto L_0x0184;
            case 115029: goto L_0x0178;
            case 3145721: goto L_0x016c;
            case 3317767: goto L_0x0160;
            case 90115850: goto L_0x0154;
            case 90130308: goto L_0x0148;
            case 108511772: goto L_0x013c;
            case 109757538: goto L_0x0130;
            case 113126854: goto L_0x0124;
            case 202355100: goto L_0x0118;
            case 400381634: goto L_0x010c;
            case 529642498: goto L_0x0100;
            case 713848971: goto L_0x00f4;
            case 715094737: goto L_0x00e8;
            case 741115130: goto L_0x00dc;
            case 747804969: goto L_0x00d0;
            case 975087886: goto L_0x00c4;
            case 976333652: goto L_0x00b8;
            case 1031115618: goto L_0x00ac;
            case 1092174483: goto L_0x00a1;
            case 1239020023: goto L_0x0096;
            case 1288688105: goto L_0x008a;
            case 1343645351: goto L_0x007e;
            case 1431421764: goto L_0x0072;
            case 1671764162: goto L_0x0066;
            case 1743739820: goto L_0x005a;
            case 1744216035: goto L_0x004e;
            case 1767100401: goto L_0x0043;
            case 1804741442: goto L_0x0037;
            case 1860657097: goto L_0x002b;
            case 1970934485: goto L_0x001f;
            case 2138173392: goto L_0x0013;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x027b;
    L_0x0013:
        r0 = "borderStartWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x001b:
        r11 = 8;
        goto L_0x027c;
    L_0x001f:
        r0 = "marginLeft";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0027:
        r11 = 27;
        goto L_0x027c;
    L_0x002b:
        r0 = "justifyContent";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0033:
        r11 = 21;
        goto L_0x027c;
    L_0x0037:
        r0 = "styleAttr";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x003f:
        r11 = 50;
        goto L_0x027c;
    L_0x0043:
        r0 = "alignSelf";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x004b:
        r11 = 2;
        goto L_0x027c;
    L_0x004e:
        r0 = "flexWrap";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0056:
        r11 = 19;
        goto L_0x027c;
    L_0x005a:
        r0 = "flexGrow";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0062:
        r11 = 17;
        goto L_0x027c;
    L_0x0066:
        r0 = "display";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x006e:
        r11 = 12;
        goto L_0x027c;
    L_0x0072:
        r0 = "marginVertical";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x007a:
        r11 = 31;
        goto L_0x027c;
    L_0x007e:
        r0 = "paddingVertical";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0086:
        r11 = 46;
        goto L_0x027c;
    L_0x008a:
        r0 = "onLayout";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0092:
        r11 = 36;
        goto L_0x027c;
    L_0x0096:
        r0 = "borderEndWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x009e:
        r11 = 5;
        goto L_0x027c;
    L_0x00a1:
        r0 = "aspectRatio";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00a9:
        r11 = 3;
        goto L_0x027c;
    L_0x00ac:
        r0 = "flexShrink";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00b4:
        r11 = 18;
        goto L_0x027c;
    L_0x00b8:
        r0 = "marginStart";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00c0:
        r11 = 29;
        goto L_0x027c;
    L_0x00c4:
        r0 = "marginRight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00cc:
        r11 = 28;
        goto L_0x027c;
    L_0x00d0:
        r0 = "position";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00d8:
        r11 = 47;
        goto L_0x027c;
    L_0x00dc:
        r0 = "borderWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00e4:
        r11 = 10;
        goto L_0x027c;
    L_0x00e8:
        r0 = "paddingStart";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00f0:
        r11 = 44;
        goto L_0x027c;
    L_0x00f4:
        r0 = "paddingRight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x00fc:
        r11 = 43;
        goto L_0x027c;
    L_0x0100:
        r0 = "overflow";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0108:
        r11 = 37;
        goto L_0x027c;
    L_0x010c:
        r0 = "maxWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0114:
        r11 = 33;
        goto L_0x027c;
    L_0x0118:
        r0 = "paddingBottom";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0120:
        r11 = 39;
        goto L_0x027c;
    L_0x0124:
        r0 = "width";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x012c:
        r11 = 52;
        goto L_0x027c;
    L_0x0130:
        r0 = "start";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0138:
        r11 = 49;
        goto L_0x027c;
    L_0x013c:
        r0 = "right";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0144:
        r11 = 48;
        goto L_0x027c;
    L_0x0148:
        r0 = "paddingTop";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0150:
        r11 = 45;
        goto L_0x027c;
    L_0x0154:
        r0 = "paddingEnd";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x015c:
        r11 = 40;
        goto L_0x027c;
    L_0x0160:
        r0 = "left";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0168:
        r11 = 22;
        goto L_0x027c;
    L_0x016c:
        r0 = "flex";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0174:
        r11 = 14;
        goto L_0x027c;
    L_0x0178:
        r0 = "top";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0180:
        r11 = 51;
        goto L_0x027c;
    L_0x0184:
        r0 = "end";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x018c:
        r11 = 13;
        goto L_0x027c;
    L_0x0190:
        r0 = "minHeight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0198:
        r11 = 34;
        goto L_0x027c;
    L_0x019c:
        r0 = "borderLeftWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01a4:
        r11 = 6;
        goto L_0x027c;
    L_0x01a7:
        r0 = "marginBottom";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01af:
        r11 = 24;
        goto L_0x027c;
    L_0x01b3:
        r0 = "paddingHorizontal";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01bb:
        r11 = 41;
        goto L_0x027c;
    L_0x01bf:
        r0 = "alignContent";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01c7:
        r11 = 0;
        goto L_0x027c;
    L_0x01ca:
        r0 = "padding";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01d2:
        r11 = 38;
        goto L_0x027c;
    L_0x01d6:
        r0 = "maxHeight";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01de:
        r11 = 32;
        goto L_0x027c;
    L_0x01e2:
        r0 = "flexDirection";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01ea:
        r11 = 16;
        goto L_0x027c;
    L_0x01ee:
        r0 = "marginTop";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x01f6:
        r11 = 30;
        goto L_0x027c;
    L_0x01fa:
        r0 = "marginEnd";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0202:
        r11 = 25;
        goto L_0x027c;
    L_0x0205:
        r0 = "alignItems";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x020d:
        r11 = 1;
        goto L_0x027c;
    L_0x020f:
        r0 = "margin";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0217:
        r11 = 23;
        goto L_0x027c;
    L_0x021a:
        r0 = "height";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0222:
        r11 = 20;
        goto L_0x027c;
    L_0x0225:
        r0 = "borderBottomWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x022d:
        r11 = 4;
        goto L_0x027c;
    L_0x022f:
        r0 = "minWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0237:
        r11 = 35;
        goto L_0x027c;
    L_0x023a:
        r0 = "bottom";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0242:
        r11 = 11;
        goto L_0x027c;
    L_0x0245:
        r0 = "borderTopWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x024d:
        r11 = 9;
        goto L_0x027c;
    L_0x0250:
        r0 = "paddingLeft";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0258:
        r11 = 42;
        goto L_0x027c;
    L_0x025b:
        r0 = "flexBasis";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0263:
        r11 = 15;
        goto L_0x027c;
    L_0x0266:
        r0 = "marginHorizontal";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x026e:
        r11 = 26;
        goto L_0x027c;
    L_0x0271:
        r0 = "borderRightWidth";
        r0 = r13.equals(r0);
        if (r0 == 0) goto L_0x027b;
    L_0x0279:
        r11 = 7;
        goto L_0x027c;
    L_0x027b:
        r11 = -1;
    L_0x027c:
        r1 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        switch(r11) {
            case 0: goto L_0x044a;
            case 1: goto L_0x0442;
            case 2: goto L_0x043a;
            case 3: goto L_0x0432;
            case 4: goto L_0x042a;
            case 5: goto L_0x0422;
            case 6: goto L_0x041a;
            case 7: goto L_0x0412;
            case 8: goto L_0x040a;
            case 9: goto L_0x0402;
            case 10: goto L_0x03fa;
            case 11: goto L_0x03f2;
            case 12: goto L_0x03ea;
            case 13: goto L_0x03e2;
            case 14: goto L_0x03da;
            case 15: goto L_0x03d2;
            case 16: goto L_0x03c9;
            case 17: goto L_0x03c0;
            case 18: goto L_0x03b7;
            case 19: goto L_0x03ae;
            case 20: goto L_0x03a5;
            case 21: goto L_0x039c;
            case 22: goto L_0x0393;
            case 23: goto L_0x038a;
            case 24: goto L_0x0381;
            case 25: goto L_0x0378;
            case 26: goto L_0x036f;
            case 27: goto L_0x0366;
            case 28: goto L_0x035d;
            case 29: goto L_0x0354;
            case 30: goto L_0x034b;
            case 31: goto L_0x0342;
            case 32: goto L_0x0339;
            case 33: goto L_0x0330;
            case 34: goto L_0x0327;
            case 35: goto L_0x031e;
            case 36: goto L_0x0315;
            case 37: goto L_0x030c;
            case 38: goto L_0x0303;
            case 39: goto L_0x02fa;
            case 40: goto L_0x02f1;
            case 41: goto L_0x02e8;
            case 42: goto L_0x02df;
            case 43: goto L_0x02d6;
            case 44: goto L_0x02cd;
            case 45: goto L_0x02c4;
            case 46: goto L_0x02bb;
            case 47: goto L_0x02b2;
            case 48: goto L_0x02a9;
            case 49: goto L_0x02a0;
            case 50: goto L_0x0297;
            case 51: goto L_0x028e;
            case 52: goto L_0x0285;
            default: goto L_0x0283;
        };
    L_0x0283:
        goto L_0x0451;
    L_0x0285:
        r0 = r14.getDynamic(r13);
        r12.setWidth(r0);
        goto L_0x0451;
    L_0x028e:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r3, r0);
        goto L_0x0451;
    L_0x0297:
        r0 = r14.getString(r13);
        r12.setStyle(r0);
        goto L_0x0451;
    L_0x02a0:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r2, r0);
        goto L_0x0451;
    L_0x02a9:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r7, r0);
        goto L_0x0451;
    L_0x02b2:
        r0 = r14.getString(r13);
        r12.setPosition(r0);
        goto L_0x0451;
    L_0x02bb:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r6, r0);
        goto L_0x0451;
    L_0x02c4:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r5, r0);
        goto L_0x0451;
    L_0x02cd:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r7, r0);
        goto L_0x0451;
    L_0x02d6:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r10, r0);
        goto L_0x0451;
    L_0x02df:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r9, r0);
        goto L_0x0451;
    L_0x02e8:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r4, r0);
        goto L_0x0451;
    L_0x02f1:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r3, r0);
        goto L_0x0451;
    L_0x02fa:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r8, r0);
        goto L_0x0451;
    L_0x0303:
        r0 = r14.getDynamic(r13);
        r12.setPaddings(r2, r0);
        goto L_0x0451;
    L_0x030c:
        r0 = r14.getString(r13);
        r12.setOverflow(r0);
        goto L_0x0451;
    L_0x0315:
        r0 = r14.getBoolean(r13, r2);
        r12.setShouldNotifyOnLayout(r0);
        goto L_0x0451;
    L_0x031e:
        r0 = r14.getDynamic(r13);
        r12.setMinWidth(r0);
        goto L_0x0451;
    L_0x0327:
        r0 = r14.getDynamic(r13);
        r12.setMinHeight(r0);
        goto L_0x0451;
    L_0x0330:
        r0 = r14.getDynamic(r13);
        r12.setMaxWidth(r0);
        goto L_0x0451;
    L_0x0339:
        r0 = r14.getDynamic(r13);
        r12.setMaxHeight(r0);
        goto L_0x0451;
    L_0x0342:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r6, r0);
        goto L_0x0451;
    L_0x034b:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r5, r0);
        goto L_0x0451;
    L_0x0354:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r7, r0);
        goto L_0x0451;
    L_0x035d:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r10, r0);
        goto L_0x0451;
    L_0x0366:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r9, r0);
        goto L_0x0451;
    L_0x036f:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r4, r0);
        goto L_0x0451;
    L_0x0378:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r3, r0);
        goto L_0x0451;
    L_0x0381:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r8, r0);
        goto L_0x0451;
    L_0x038a:
        r0 = r14.getDynamic(r13);
        r12.setMargins(r2, r0);
        goto L_0x0451;
    L_0x0393:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r4, r0);
        goto L_0x0451;
    L_0x039c:
        r0 = r14.getString(r13);
        r12.setJustifyContent(r0);
        goto L_0x0451;
    L_0x03a5:
        r0 = r14.getDynamic(r13);
        r12.setHeight(r0);
        goto L_0x0451;
    L_0x03ae:
        r0 = r14.getString(r13);
        r12.setFlexWrap(r0);
        goto L_0x0451;
    L_0x03b7:
        r0 = r14.getFloat(r13, r1);
        r12.setFlexShrink(r0);
        goto L_0x0451;
    L_0x03c0:
        r0 = r14.getFloat(r13, r1);
        r12.setFlexGrow(r0);
        goto L_0x0451;
    L_0x03c9:
        r0 = r14.getString(r13);
        r12.setFlexDirection(r0);
        goto L_0x0451;
    L_0x03d2:
        r0 = r14.getDynamic(r13);
        r12.setFlexBasis(r0);
        goto L_0x0451;
    L_0x03da:
        r0 = r14.getFloat(r13, r1);
        r12.setFlex(r0);
        goto L_0x0451;
    L_0x03e2:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r6, r0);
        goto L_0x0451;
    L_0x03ea:
        r0 = r14.getString(r13);
        r12.setDisplay(r0);
        goto L_0x0451;
    L_0x03f2:
        r0 = r14.getDynamic(r13);
        r12.setPositionValues(r5, r0);
        goto L_0x0451;
    L_0x03fa:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r2, r0);
        goto L_0x0451;
    L_0x0402:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r7, r0);
        goto L_0x0451;
    L_0x040a:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r6, r0);
        goto L_0x0451;
    L_0x0412:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r8, r0);
        goto L_0x0451;
    L_0x041a:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r5, r0);
        goto L_0x0451;
    L_0x0422:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r4, r0);
        goto L_0x0451;
    L_0x042a:
        r0 = r14.getFloat(r13, r0);
        r12.setBorderWidths(r3, r0);
        goto L_0x0451;
    L_0x0432:
        r0 = r14.getFloat(r13, r0);
        r12.setAspectRatio(r0);
        goto L_0x0451;
    L_0x043a:
        r0 = r14.getString(r13);
        r12.setAlignSelf(r0);
        goto L_0x0451;
    L_0x0442:
        r0 = r14.getString(r13);
        r12.setAlignItems(r0);
        goto L_0x0451;
    L_0x044a:
        r0 = r14.getString(r13);
        r12.setAlignContent(r0);
    L_0x0451:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.progressbar.ProgressBarShadowNode$$PropsSetter.setProperty(com.facebook.react.views.progressbar.ProgressBarShadowNode, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
