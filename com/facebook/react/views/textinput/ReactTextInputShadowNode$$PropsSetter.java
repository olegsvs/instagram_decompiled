package com.facebook.react.views.textinput;

import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter;
import java.util.Map;

public class ReactTextInputShadowNode$$PropsSetter implements ShadowNodeSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("alignContent", str);
        map.put("alignItems", str);
        map.put("alignSelf", str);
        map.put("allowFontScaling", "boolean");
        str = "number";
        map.put("aspectRatio", str);
        map.put("backgroundColor", str);
        map.put("borderBottomWidth", str);
        map.put("borderEndWidth", str);
        map.put("borderLeftWidth", str);
        map.put("borderRightWidth", str);
        map.put("borderStartWidth", str);
        map.put("borderTopWidth", str);
        map.put("borderWidth", str);
        map.put("bottom", "Dynamic");
        map.put("color", "number");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("flex", "number");
        map.put("flexBasis", "Dynamic");
        map.put("flexDirection", "String");
        str = "number";
        map.put("flexGrow", str);
        map.put("flexShrink", str);
        str = "String";
        map.put("flexWrap", str);
        map.put("fontFamily", str);
        map.put("fontSize", "number");
        str = "String";
        map.put("fontStyle", str);
        map.put("fontWeight", str);
        map.put("height", "Dynamic");
        map.put("includeFontPadding", "boolean");
        map.put("justifyContent", "String");
        map.put("left", "Dynamic");
        str = "number";
        map.put("letterSpacing", str);
        map.put("lineHeight", str);
        str = "Dynamic";
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
        str = "number";
        map.put("mostRecentEventCount", str);
        map.put("numberOfLines", str);
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
        str = "String";
        map.put("placeholder", str);
        map.put("position", str);
        str = "Dynamic";
        map.put("right", str);
        map.put("start", str);
        str = "String";
        map.put("text", str);
        map.put("textAlign", str);
        map.put("textBreakStrategy", str);
        map.put("textDecorationLine", str);
        map.put("textShadowColor", "Color");
        map.put("textShadowOffset", "Map");
        map.put("textShadowRadius", "number");
        map.put("textTransform", "String");
        str = "Dynamic";
        map.put("top", str);
        map.put("width", str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.textinput.ReactTextInputShadowNode r13, java.lang.String r14, com.facebook.react.uimanager.ReactStylesDiffMap r15) {
        /*
        r0 = r14.hashCode();
        r11 = -1;
        r10 = 8;
        r9 = 7;
        r8 = 6;
        r7 = 3;
        r6 = 5;
        r5 = 2;
        r4 = 4;
        r3 = 1;
        r2 = 0;
        switch(r0) {
            case -1971292586: goto L_0x0361;
            case -1906103182: goto L_0x0356;
            case -1783760955: goto L_0x034b;
            case -1563136667: goto L_0x0340;
            case -1550943582: goto L_0x0335;
            case -1501175880: goto L_0x032a;
            case -1452542531: goto L_0x031f;
            case -1383228885: goto L_0x0314;
            case -1375815020: goto L_0x0309;
            case -1329887265: goto L_0x02fe;
            case -1290574193: goto L_0x02f4;
            case -1224696685: goto L_0x02e9;
            case -1221029593: goto L_0x02dd;
            case -1081309778: goto L_0x02d1;
            case -1065511464: goto L_0x02c5;
            case -1063257157: goto L_0x02ba;
            case -1044806579: goto L_0x02ae;
            case -1044792121: goto L_0x02a2;
            case -975171706: goto L_0x0296;
            case -906066005: goto L_0x028a;
            case -806339567: goto L_0x027e;
            case -752601676: goto L_0x0273;
            case -734428249: goto L_0x0267;
            case -515807685: goto L_0x025b;
            case -407229137: goto L_0x0250;
            case -359890155: goto L_0x0244;
            case -289173127: goto L_0x0238;
            case -223992013: goto L_0x022c;
            case -133587431: goto L_0x0220;
            case 100571: goto L_0x0214;
            case 115029: goto L_0x0208;
            case 3145721: goto L_0x01fc;
            case 3317767: goto L_0x01f0;
            case 3556653: goto L_0x01e4;
            case 90115850: goto L_0x01d8;
            case 90130308: goto L_0x01cc;
            case 94842723: goto L_0x01c0;
            case 108511772: goto L_0x01b4;
            case 109757538: goto L_0x01a8;
            case 113126854: goto L_0x019c;
            case 202355100: goto L_0x0190;
            case 365601008: goto L_0x0184;
            case 400381634: goto L_0x0178;
            case 529642498: goto L_0x016c;
            case 578735798: goto L_0x0160;
            case 598246771: goto L_0x0154;
            case 713848971: goto L_0x0148;
            case 715094737: goto L_0x013c;
            case 741115130: goto L_0x0130;
            case 747804969: goto L_0x0124;
            case 975087886: goto L_0x0118;
            case 976333652: goto L_0x010c;
            case 1031115618: goto L_0x0100;
            case 1092174483: goto L_0x00f5;
            case 1096003488: goto L_0x00e9;
            case 1139918067: goto L_0x00dd;
            case 1177204639: goto L_0x00d1;
            case 1239020023: goto L_0x00c6;
            case 1287124693: goto L_0x00bb;
            case 1288688105: goto L_0x00af;
            case 1327548607: goto L_0x00a3;
            case 1343645351: goto L_0x0097;
            case 1431421764: goto L_0x008b;
            case 1671764162: goto L_0x007f;
            case 1743739820: goto L_0x0073;
            case 1744216035: goto L_0x0067;
            case 1767100401: goto L_0x005c;
            case 1860657097: goto L_0x0050;
            case 1970934485: goto L_0x0044;
            case 2020113146: goto L_0x0038;
            case 2031616849: goto L_0x002c;
            case 2111078717: goto L_0x0020;
            case 2138173392: goto L_0x0014;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x036c;
    L_0x0014:
        r0 = "borderStartWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x001c:
        r12 = 10;
        goto L_0x036d;
    L_0x0020:
        r0 = "letterSpacing";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0028:
        r12 = 31;
        goto L_0x036d;
    L_0x002c:
        r0 = "textDecorationLine";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0034:
        r12 = 66;
        goto L_0x036d;
    L_0x0038:
        r0 = "includeFontPadding";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0040:
        r12 = 28;
        goto L_0x036d;
    L_0x0044:
        r0 = "marginLeft";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x004c:
        r12 = 37;
        goto L_0x036d;
    L_0x0050:
        r0 = "justifyContent";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0058:
        r12 = 29;
        goto L_0x036d;
    L_0x005c:
        r0 = "alignSelf";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0064:
        r12 = 2;
        goto L_0x036d;
    L_0x0067:
        r0 = "flexWrap";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x006f:
        r12 = 22;
        goto L_0x036d;
    L_0x0073:
        r0 = "flexGrow";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x007b:
        r12 = 20;
        goto L_0x036d;
    L_0x007f:
        r0 = "display";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0087:
        r12 = 15;
        goto L_0x036d;
    L_0x008b:
        r0 = "marginVertical";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0093:
        r12 = 41;
        goto L_0x036d;
    L_0x0097:
        r0 = "paddingVertical";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x009f:
        r12 = 58;
        goto L_0x036d;
    L_0x00a3:
        r0 = "textTransform";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00ab:
        r12 = 70;
        goto L_0x036d;
    L_0x00af:
        r0 = "onLayout";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00b7:
        r12 = 48;
        goto L_0x036d;
    L_0x00bb:
        r0 = "backgroundColor";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00c3:
        r12 = 5;
        goto L_0x036d;
    L_0x00c6:
        r0 = "borderEndWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00ce:
        r12 = 7;
        goto L_0x036d;
    L_0x00d1:
        r0 = "textShadowRadius";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00d9:
        r12 = 69;
        goto L_0x036d;
    L_0x00dd:
        r0 = "mostRecentEventCount";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00e5:
        r12 = 46;
        goto L_0x036d;
    L_0x00e9:
        r0 = "textShadowOffset";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00f1:
        r12 = 68;
        goto L_0x036d;
    L_0x00f5:
        r0 = "aspectRatio";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x00fd:
        r12 = 4;
        goto L_0x036d;
    L_0x0100:
        r0 = "flexShrink";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0108:
        r12 = 21;
        goto L_0x036d;
    L_0x010c:
        r0 = "marginStart";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0114:
        r12 = 39;
        goto L_0x036d;
    L_0x0118:
        r0 = "marginRight";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0120:
        r12 = 38;
        goto L_0x036d;
    L_0x0124:
        r0 = "position";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x012c:
        r12 = 60;
        goto L_0x036d;
    L_0x0130:
        r0 = "borderWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0138:
        r12 = 12;
        goto L_0x036d;
    L_0x013c:
        r0 = "paddingStart";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0144:
        r12 = 56;
        goto L_0x036d;
    L_0x0148:
        r0 = "paddingRight";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0150:
        r12 = 55;
        goto L_0x036d;
    L_0x0154:
        r0 = "placeholder";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x015c:
        r12 = 59;
        goto L_0x036d;
    L_0x0160:
        r0 = "textShadowColor";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0168:
        r12 = 67;
        goto L_0x036d;
    L_0x016c:
        r0 = "overflow";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0174:
        r12 = 49;
        goto L_0x036d;
    L_0x0178:
        r0 = "maxWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0180:
        r12 = 43;
        goto L_0x036d;
    L_0x0184:
        r0 = "fontSize";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x018c:
        r12 = 24;
        goto L_0x036d;
    L_0x0190:
        r0 = "paddingBottom";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0198:
        r12 = 51;
        goto L_0x036d;
    L_0x019c:
        r0 = "width";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01a4:
        r12 = 72;
        goto L_0x036d;
    L_0x01a8:
        r0 = "start";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01b0:
        r12 = 62;
        goto L_0x036d;
    L_0x01b4:
        r0 = "right";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01bc:
        r12 = 61;
        goto L_0x036d;
    L_0x01c0:
        r0 = "color";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01c8:
        r12 = 14;
        goto L_0x036d;
    L_0x01cc:
        r0 = "paddingTop";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01d4:
        r12 = 57;
        goto L_0x036d;
    L_0x01d8:
        r0 = "paddingEnd";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01e0:
        r12 = 52;
        goto L_0x036d;
    L_0x01e4:
        r0 = "text";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01ec:
        r12 = 63;
        goto L_0x036d;
    L_0x01f0:
        r0 = "left";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x01f8:
        r12 = 30;
        goto L_0x036d;
    L_0x01fc:
        r0 = "flex";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0204:
        r12 = 17;
        goto L_0x036d;
    L_0x0208:
        r0 = "top";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0210:
        r12 = 71;
        goto L_0x036d;
    L_0x0214:
        r0 = "end";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x021c:
        r12 = 16;
        goto L_0x036d;
    L_0x0220:
        r0 = "minHeight";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0228:
        r12 = 44;
        goto L_0x036d;
    L_0x022c:
        r0 = "borderLeftWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0234:
        r12 = 8;
        goto L_0x036d;
    L_0x0238:
        r0 = "marginBottom";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0240:
        r12 = 34;
        goto L_0x036d;
    L_0x0244:
        r0 = "paddingHorizontal";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x024c:
        r12 = 53;
        goto L_0x036d;
    L_0x0250:
        r0 = "allowFontScaling";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0258:
        r12 = 3;
        goto L_0x036d;
    L_0x025b:
        r0 = "lineHeight";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0263:
        r12 = 32;
        goto L_0x036d;
    L_0x0267:
        r0 = "fontWeight";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x026f:
        r12 = 26;
        goto L_0x036d;
    L_0x0273:
        r0 = "alignContent";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x027b:
        r12 = 0;
        goto L_0x036d;
    L_0x027e:
        r0 = "padding";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0286:
        r12 = 50;
        goto L_0x036d;
    L_0x028a:
        r0 = "maxHeight";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0292:
        r12 = 42;
        goto L_0x036d;
    L_0x0296:
        r0 = "flexDirection";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x029e:
        r12 = 19;
        goto L_0x036d;
    L_0x02a2:
        r0 = "marginTop";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02aa:
        r12 = 40;
        goto L_0x036d;
    L_0x02ae:
        r0 = "marginEnd";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02b6:
        r12 = 35;
        goto L_0x036d;
    L_0x02ba:
        r0 = "alignItems";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02c2:
        r12 = 1;
        goto L_0x036d;
    L_0x02c5:
        r0 = "textAlign";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02cd:
        r12 = 64;
        goto L_0x036d;
    L_0x02d1:
        r0 = "margin";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02d9:
        r12 = 33;
        goto L_0x036d;
    L_0x02dd:
        r0 = "height";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02e5:
        r12 = 27;
        goto L_0x036d;
    L_0x02e9:
        r0 = "fontFamily";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02f1:
        r12 = 23;
        goto L_0x036d;
    L_0x02f4:
        r0 = "borderBottomWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x02fc:
        r12 = 6;
        goto L_0x036d;
    L_0x02fe:
        r0 = "numberOfLines";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0306:
        r12 = 47;
        goto L_0x036d;
    L_0x0309:
        r0 = "minWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0311:
        r12 = 45;
        goto L_0x036d;
    L_0x0314:
        r0 = "bottom";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x031c:
        r12 = 13;
        goto L_0x036d;
    L_0x031f:
        r0 = "borderTopWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0327:
        r12 = 11;
        goto L_0x036d;
    L_0x032a:
        r0 = "paddingLeft";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0332:
        r12 = 54;
        goto L_0x036d;
    L_0x0335:
        r0 = "fontStyle";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x033d:
        r12 = 25;
        goto L_0x036d;
    L_0x0340:
        r0 = "textBreakStrategy";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0348:
        r12 = 65;
        goto L_0x036d;
    L_0x034b:
        r0 = "flexBasis";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0353:
        r12 = 18;
        goto L_0x036d;
    L_0x0356:
        r0 = "marginHorizontal";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x035e:
        r12 = 36;
        goto L_0x036d;
    L_0x0361:
        r0 = "borderRightWidth";
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x036c;
    L_0x0369:
        r12 = 9;
        goto L_0x036d;
    L_0x036c:
        r12 = -1;
    L_0x036d:
        r1 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        switch(r12) {
            case 0: goto L_0x0610;
            case 1: goto L_0x0608;
            case 2: goto L_0x0600;
            case 3: goto L_0x05f8;
            case 4: goto L_0x05f0;
            case 5: goto L_0x05dc;
            case 6: goto L_0x05d4;
            case 7: goto L_0x05cc;
            case 8: goto L_0x05c4;
            case 9: goto L_0x05bc;
            case 10: goto L_0x05b4;
            case 11: goto L_0x05ac;
            case 12: goto L_0x05a4;
            case 13: goto L_0x059c;
            case 14: goto L_0x0588;
            case 15: goto L_0x057f;
            case 16: goto L_0x0576;
            case 17: goto L_0x056d;
            case 18: goto L_0x0564;
            case 19: goto L_0x055b;
            case 20: goto L_0x0552;
            case 21: goto L_0x0549;
            case 22: goto L_0x0540;
            case 23: goto L_0x0537;
            case 24: goto L_0x052c;
            case 25: goto L_0x0523;
            case 26: goto L_0x051a;
            case 27: goto L_0x0511;
            case 28: goto L_0x0508;
            case 29: goto L_0x04ff;
            case 30: goto L_0x04f6;
            case 31: goto L_0x04eb;
            case 32: goto L_0x04e0;
            case 33: goto L_0x04d7;
            case 34: goto L_0x04ce;
            case 35: goto L_0x04c5;
            case 36: goto L_0x04bc;
            case 37: goto L_0x04b3;
            case 38: goto L_0x04aa;
            case 39: goto L_0x04a1;
            case 40: goto L_0x0498;
            case 41: goto L_0x048f;
            case 42: goto L_0x0486;
            case 43: goto L_0x047d;
            case 44: goto L_0x0474;
            case 45: goto L_0x046b;
            case 46: goto L_0x0462;
            case 47: goto L_0x0459;
            case 48: goto L_0x0450;
            case 49: goto L_0x0447;
            case 50: goto L_0x043e;
            case 51: goto L_0x0435;
            case 52: goto L_0x042c;
            case 53: goto L_0x0423;
            case 54: goto L_0x041a;
            case 55: goto L_0x0411;
            case 56: goto L_0x0408;
            case 57: goto L_0x03ff;
            case 58: goto L_0x03f6;
            case 59: goto L_0x03ed;
            case 60: goto L_0x03e4;
            case 61: goto L_0x03db;
            case 62: goto L_0x03d2;
            case 63: goto L_0x03c9;
            case 64: goto L_0x03c0;
            case 65: goto L_0x03b7;
            case 66: goto L_0x03ae;
            case 67: goto L_0x03a3;
            case 68: goto L_0x039a;
            case 69: goto L_0x0391;
            case 70: goto L_0x0388;
            case 71: goto L_0x037f;
            case 72: goto L_0x0376;
            default: goto L_0x0374;
        };
    L_0x0374:
        goto L_0x0617;
    L_0x0376:
        r0 = r15.getDynamic(r14);
        r13.setWidth(r0);
        goto L_0x0617;
    L_0x037f:
        r0 = r15.getDynamic(r14);
        r13.setPositionValues(r4, r0);
        goto L_0x0617;
    L_0x0388:
        r0 = r15.getString(r14);
        r13.setTextTransform(r0);
        goto L_0x0617;
    L_0x0391:
        r0 = r15.getFloat(r14, r1);
        r13.setTextShadowRadius(r0);
        goto L_0x0617;
    L_0x039a:
        r0 = r15.getMap(r14);
        r13.setTextShadowOffset(r0);
        goto L_0x0617;
    L_0x03a3:
        r0 = 1426063360; // 0x55000000 float:8.796093E12 double:7.04568915E-315;
        r0 = r15.getInt(r14, r0);
        r13.setTextShadowColor(r0);
        goto L_0x0617;
    L_0x03ae:
        r0 = r15.getString(r14);
        r13.setTextDecorationLine(r0);
        goto L_0x0617;
    L_0x03b7:
        r0 = r15.getString(r14);
        r13.setTextBreakStrategy(r0);
        goto L_0x0617;
    L_0x03c0:
        r0 = r15.getString(r14);
        r13.setTextAlign(r0);
        goto L_0x0617;
    L_0x03c9:
        r0 = r15.getString(r14);
        r13.setText(r0);
        goto L_0x0617;
    L_0x03d2:
        r0 = r15.getDynamic(r14);
        r13.setPositionValues(r2, r0);
        goto L_0x0617;
    L_0x03db:
        r0 = r15.getDynamic(r14);
        r13.setPositionValues(r7, r0);
        goto L_0x0617;
    L_0x03e4:
        r0 = r15.getString(r14);
        r13.setPosition(r0);
        goto L_0x0617;
    L_0x03ed:
        r0 = r15.getString(r14);
        r13.setPlaceholder(r0);
        goto L_0x0617;
    L_0x03f6:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r3, r0);
        goto L_0x0617;
    L_0x03ff:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r6, r0);
        goto L_0x0617;
    L_0x0408:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r7, r0);
        goto L_0x0617;
    L_0x0411:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r10, r0);
        goto L_0x0617;
    L_0x041a:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r9, r0);
        goto L_0x0617;
    L_0x0423:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r5, r0);
        goto L_0x0617;
    L_0x042c:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r4, r0);
        goto L_0x0617;
    L_0x0435:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r8, r0);
        goto L_0x0617;
    L_0x043e:
        r0 = r15.getDynamic(r14);
        r13.setPaddings(r2, r0);
        goto L_0x0617;
    L_0x0447:
        r0 = r15.getString(r14);
        r13.setOverflow(r0);
        goto L_0x0617;
    L_0x0450:
        r0 = r15.getBoolean(r14, r2);
        r13.setShouldNotifyOnLayout(r0);
        goto L_0x0617;
    L_0x0459:
        r0 = r15.getInt(r14, r11);
        r13.setNumberOfLines(r0);
        goto L_0x0617;
    L_0x0462:
        r0 = r15.getInt(r14, r2);
        r13.setMostRecentEventCount(r0);
        goto L_0x0617;
    L_0x046b:
        r0 = r15.getDynamic(r14);
        r13.setMinWidth(r0);
        goto L_0x0617;
    L_0x0474:
        r0 = r15.getDynamic(r14);
        r13.setMinHeight(r0);
        goto L_0x0617;
    L_0x047d:
        r0 = r15.getDynamic(r14);
        r13.setMaxWidth(r0);
        goto L_0x0617;
    L_0x0486:
        r0 = r15.getDynamic(r14);
        r13.setMaxHeight(r0);
        goto L_0x0617;
    L_0x048f:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r3, r0);
        goto L_0x0617;
    L_0x0498:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r6, r0);
        goto L_0x0617;
    L_0x04a1:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r7, r0);
        goto L_0x0617;
    L_0x04aa:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r10, r0);
        goto L_0x0617;
    L_0x04b3:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r9, r0);
        goto L_0x0617;
    L_0x04bc:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r5, r0);
        goto L_0x0617;
    L_0x04c5:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r4, r0);
        goto L_0x0617;
    L_0x04ce:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r8, r0);
        goto L_0x0617;
    L_0x04d7:
        r0 = r15.getDynamic(r14);
        r13.setMargins(r2, r0);
        goto L_0x0617;
    L_0x04e0:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = r15.getFloat(r14, r0);
        r13.setLineHeight(r0);
        goto L_0x0617;
    L_0x04eb:
        r0 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        r0 = r15.getFloat(r14, r0);
        r13.setLetterSpacing(r0);
        goto L_0x0617;
    L_0x04f6:
        r0 = r15.getDynamic(r14);
        r13.setPositionValues(r5, r0);
        goto L_0x0617;
    L_0x04ff:
        r0 = r15.getString(r14);
        r13.setJustifyContent(r0);
        goto L_0x0617;
    L_0x0508:
        r0 = r15.getBoolean(r14, r3);
        r13.setIncludeFontPadding(r0);
        goto L_0x0617;
    L_0x0511:
        r0 = r15.getDynamic(r14);
        r13.setHeight(r0);
        goto L_0x0617;
    L_0x051a:
        r0 = r15.getString(r14);
        r13.setFontWeight(r0);
        goto L_0x0617;
    L_0x0523:
        r0 = r15.getString(r14);
        r13.setFontStyle(r0);
        goto L_0x0617;
    L_0x052c:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = r15.getFloat(r14, r0);
        r13.setFontSize(r0);
        goto L_0x0617;
    L_0x0537:
        r0 = r15.getString(r14);
        r13.setFontFamily(r0);
        goto L_0x0617;
    L_0x0540:
        r0 = r15.getString(r14);
        r13.setFlexWrap(r0);
        goto L_0x0617;
    L_0x0549:
        r0 = r15.getFloat(r14, r1);
        r13.setFlexShrink(r0);
        goto L_0x0617;
    L_0x0552:
        r0 = r15.getFloat(r14, r1);
        r13.setFlexGrow(r0);
        goto L_0x0617;
    L_0x055b:
        r0 = r15.getString(r14);
        r13.setFlexDirection(r0);
        goto L_0x0617;
    L_0x0564:
        r0 = r15.getDynamic(r14);
        r13.setFlexBasis(r0);
        goto L_0x0617;
    L_0x056d:
        r0 = r15.getFloat(r14, r1);
        r13.setFlex(r0);
        goto L_0x0617;
    L_0x0576:
        r0 = r15.getDynamic(r14);
        r13.setPositionValues(r3, r0);
        goto L_0x0617;
    L_0x057f:
        r0 = r15.getString(r14);
        r13.setDisplay(r0);
        goto L_0x0617;
    L_0x0588:
        r0 = r15.isNull(r14);
        if (r0 == 0) goto L_0x0590;
    L_0x058e:
        r0 = 0;
        goto L_0x0598;
    L_0x0590:
        r0 = r15.getInt(r14, r2);
        r0 = java.lang.Integer.valueOf(r0);
    L_0x0598:
        r13.setColor(r0);
        goto L_0x0617;
    L_0x059c:
        r0 = r15.getDynamic(r14);
        r13.setPositionValues(r6, r0);
        goto L_0x0617;
    L_0x05a4:
        r0 = r15.getFloat(r14, r0);
        r13.setBorderWidths(r2, r0);
        goto L_0x0617;
    L_0x05ac:
        r0 = r15.getFloat(r14, r0);
        r13.setBorderWidths(r7, r0);
        goto L_0x0617;
    L_0x05b4:
        r0 = r15.getFloat(r14, r0);
        r13.setBorderWidths(r3, r0);
        goto L_0x0617;
    L_0x05bc:
        r0 = r15.getFloat(r14, r0);
        r13.setBorderWidths(r8, r0);
        goto L_0x0617;
    L_0x05c4:
        r0 = r15.getFloat(r14, r0);
        r13.setBorderWidths(r6, r0);
        goto L_0x0617;
    L_0x05cc:
        r0 = r15.getFloat(r14, r0);
        r13.setBorderWidths(r5, r0);
        goto L_0x0617;
    L_0x05d4:
        r0 = r15.getFloat(r14, r0);
        r13.setBorderWidths(r4, r0);
        goto L_0x0617;
    L_0x05dc:
        r0 = r15.isNull(r14);
        if (r0 == 0) goto L_0x05e4;
    L_0x05e2:
        r0 = 0;
        goto L_0x05ec;
    L_0x05e4:
        r0 = r15.getInt(r14, r2);
        r0 = java.lang.Integer.valueOf(r0);
    L_0x05ec:
        r13.setBackgroundColor(r0);
        goto L_0x0617;
    L_0x05f0:
        r0 = r15.getFloat(r14, r0);
        r13.setAspectRatio(r0);
        goto L_0x0617;
    L_0x05f8:
        r0 = r15.getBoolean(r14, r3);
        r13.setAllowFontScaling(r0);
        goto L_0x0617;
    L_0x0600:
        r0 = r15.getString(r14);
        r13.setAlignSelf(r0);
        goto L_0x0617;
    L_0x0608:
        r0 = r15.getString(r14);
        r13.setAlignItems(r0);
        goto L_0x0617;
    L_0x0610:
        r0 = r15.getString(r14);
        r13.setAlignContent(r0);
    L_0x0617:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputShadowNode$$PropsSetter.setProperty(com.facebook.react.views.textinput.ReactTextInputShadowNode, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
