package com.facebook.react.views.textinput;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactTextInputManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        map.put("autoCapitalize", "number");
        map.put("autoCorrect", "boolean");
        map.put("backgroundColor", "Color");
        map.put("blurOnSubmit", "boolean");
        map.put("borderBottomColor", "Color");
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
        map.put("caretHidden", "boolean");
        map.put("color", "Color");
        str = "boolean";
        map.put("contextMenuHidden", str);
        map.put("disableFullscreenUI", str);
        map.put("editable", str);
        map.put("elevation", "number");
        map.put("fontFamily", "String");
        map.put("fontSize", "number");
        str = "String";
        map.put("fontStyle", str);
        map.put("fontWeight", str);
        map.put("importantForAccessibility", str);
        map.put("inlineImageLeft", str);
        map.put("inlineImagePadding", "number");
        map.put("keyboardType", "String");
        str = "number";
        map.put("letterSpacing", str);
        map.put("maxLength", str);
        map.put("multiline", "boolean");
        map.put(BaseViewManager.PROP_NATIVE_ID, "String");
        map.put("numberOfLines", "number");
        str = "boolean";
        map.put("onContentSizeChange", str);
        map.put("onKeyPress", str);
        map.put("onScroll", str);
        map.put("onSelectionChange", str);
        map.put("opacity", "number");
        map.put("placeholder", "String");
        map.put("placeholderTextColor", "Color");
        map.put("renderToHardwareTextureAndroid", "boolean");
        str = "String";
        map.put("returnKeyLabel", str);
        map.put("returnKeyType", str);
        str = "number";
        map.put("rotation", str);
        map.put("scaleX", str);
        map.put("scaleY", str);
        str = "boolean";
        map.put("secureTextEntry", str);
        map.put("selectTextOnFocus", str);
        map.put("selection", "Map");
        map.put("selectionColor", "Color");
        str = "String";
        map.put(BaseViewManager.PROP_TEST_ID, str);
        map.put("textAlign", str);
        map.put("textAlignVertical", str);
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("underlineColorAndroid", "Color");
        map.put("zIndex", "number");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.textinput.ReactTextInputManager r10, com.facebook.react.views.textinput.ReactEditText r11, java.lang.String r12, com.facebook.react.uimanager.ReactStylesDiffMap r13) {
        /*
        r0 = r12.hashCode();
        r7 = 2;
        r6 = 3;
        r5 = 4;
        r4 = 1;
        r1 = 0;
        switch(r0) {
            case -1989576717: goto L_0x0337;
            case -1971292586: goto L_0x032c;
            case -1775748605: goto L_0x0321;
            case -1721943862: goto L_0x0316;
            case -1721943861: goto L_0x030b;
            case -1715965556: goto L_0x0300;
            case -1702963415: goto L_0x02f6;
            case -1615101171: goto L_0x02eb;
            case -1573887368: goto L_0x02e0;
            case -1550943582: goto L_0x02d5;
            case -1470826662: goto L_0x02ca;
            case -1452542531: goto L_0x02bf;
            case -1339545093: goto L_0x02b4;
            case -1329887265: goto L_0x02a8;
            case -1308858324: goto L_0x029c;
            case -1290574193: goto L_0x0290;
            case -1267206133: goto L_0x0284;
            case -1228066334: goto L_0x0278;
            case -1224696685: goto L_0x026c;
            case -1206239059: goto L_0x0260;
            case -1065511464: goto L_0x0254;
            case -1037804509: goto L_0x0248;
            case -908189618: goto L_0x023c;
            case -908189617: goto L_0x0230;
            case -877170387: goto L_0x0224;
            case -869116834: goto L_0x0218;
            case -791400086: goto L_0x020c;
            case -734428249: goto L_0x0200;
            case -731417480: goto L_0x01f4;
            case -700807899: goto L_0x01e8;
            case -637043280: goto L_0x01dc;
            case -435916869: goto L_0x01d1;
            case -242276144: goto L_0x01c5;
            case -223992013: goto L_0x01b9;
            case -101663499: goto L_0x01ae;
            case -101359900: goto L_0x01a3;
            case -80891667: goto L_0x0197;
            case -40300674: goto L_0x018b;
            case -4379043: goto L_0x017f;
            case 36255470: goto L_0x0174;
            case 94842723: goto L_0x0168;
            case 208939969: goto L_0x015c;
            case 333432965: goto L_0x0150;
            case 365601008: goto L_0x0144;
            case 514055831: goto L_0x0138;
            case 552298621: goto L_0x012c;
            case 568836494: goto L_0x0120;
            case 581268560: goto L_0x0114;
            case 588239831: goto L_0x0108;
            case 598246771: goto L_0x00fc;
            case 722830999: goto L_0x00f0;
            case 737768677: goto L_0x00e4;
            case 741115130: goto L_0x00d8;
            case 746986311: goto L_0x00cc;
            case 947486441: goto L_0x00c0;
            case 1052666732: goto L_0x00b4;
            case 1056207947: goto L_0x00a8;
            case 1146842694: goto L_0x009d;
            case 1287124693: goto L_0x0091;
            case 1304686953: goto L_0x0085;
            case 1349188574: goto L_0x0079;
            case 1410320624: goto L_0x006e;
            case 1490730380: goto L_0x0062;
            case 1602416228: goto L_0x0056;
            case 1798561528: goto L_0x004a;
            case 1869416814: goto L_0x003e;
            case 1908266863: goto L_0x0032;
            case 2045685618: goto L_0x0026;
            case 2111078717: goto L_0x001a;
            case 2142299447: goto L_0x000e;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x0342;
    L_0x000e:
        r0 = "selectionColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0016:
        r9 = 61;
        goto L_0x0343;
    L_0x001a:
        r0 = "letterSpacing";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0022:
        r9 = 40;
        goto L_0x0343;
    L_0x0026:
        r0 = "nativeID";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x002e:
        r9 = 43;
        goto L_0x0343;
    L_0x0032:
        r0 = "inlineImagePadding";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x003a:
        r9 = 38;
        goto L_0x0343;
    L_0x003e:
        r0 = "textAlignVertical";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0046:
        r9 = 64;
        goto L_0x0343;
    L_0x004a:
        r0 = "contextMenuHidden";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0052:
        r9 = 28;
        goto L_0x0343;
    L_0x0056:
        r0 = "editable";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x005e:
        r9 = 30;
        goto L_0x0343;
    L_0x0062:
        r0 = "onScroll";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x006a:
        r9 = 47;
        goto L_0x0343;
    L_0x006e:
        r0 = "accessibilityStates";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0076:
        r9 = 5;
        goto L_0x0343;
    L_0x0079:
        r0 = "borderRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0081:
        r9 = 17;
        goto L_0x0343;
    L_0x0085:
        r0 = "inlineImageLeft";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x008d:
        r9 = 37;
        goto L_0x0343;
    L_0x0091:
        r0 = "backgroundColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0099:
        r9 = 8;
        goto L_0x0343;
    L_0x009d:
        r0 = "accessibilityLabel";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00a5:
        r9 = 2;
        goto L_0x0343;
    L_0x00a8:
        r0 = "onContentSizeChange";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00b0:
        r9 = 45;
        goto L_0x0343;
    L_0x00b4:
        r0 = "transform";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00bc:
        r9 = 65;
        goto L_0x0343;
    L_0x00c0:
        r0 = "returnKeyType";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00c8:
        r9 = 54;
        goto L_0x0343;
    L_0x00cc:
        r0 = "importantForAccessibility";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00d4:
        r9 = 36;
        goto L_0x0343;
    L_0x00d8:
        r0 = "borderWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00e0:
        r9 = 25;
        goto L_0x0343;
    L_0x00e4:
        r0 = "borderStyle";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00ec:
        r9 = 20;
        goto L_0x0343;
    L_0x00f0:
        r0 = "borderColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x00f8:
        r9 = 14;
        goto L_0x0343;
    L_0x00fc:
        r0 = "placeholder";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0104:
        r9 = 50;
        goto L_0x0343;
    L_0x0108:
        r0 = "borderBottomRightRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0110:
        r9 = 12;
        goto L_0x0343;
    L_0x0114:
        r0 = "borderBottomLeftRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x011c:
        r9 = 11;
        goto L_0x0343;
    L_0x0120:
        r0 = "secureTextEntry";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0128:
        r9 = 58;
        goto L_0x0343;
    L_0x012c:
        r0 = "onSelectionChange";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0134:
        r9 = 48;
        goto L_0x0343;
    L_0x0138:
        r0 = "disableFullscreenUI";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0140:
        r9 = 29;
        goto L_0x0343;
    L_0x0144:
        r0 = "fontSize";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x014c:
        r9 = 33;
        goto L_0x0343;
    L_0x0150:
        r0 = "borderTopRightRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0158:
        r9 = 23;
        goto L_0x0343;
    L_0x015c:
        r0 = "keyboardType";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0164:
        r9 = 39;
        goto L_0x0343;
    L_0x0168:
        r0 = "color";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0170:
        r9 = 27;
        goto L_0x0343;
    L_0x0174:
        r0 = "accessibilityLiveRegion";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x017c:
        r9 = 3;
        goto L_0x0343;
    L_0x017f:
        r0 = "elevation";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0187:
        r9 = 31;
        goto L_0x0343;
    L_0x018b:
        r0 = "rotation";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0193:
        r9 = 55;
        goto L_0x0343;
    L_0x0197:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x019f:
        r9 = 52;
        goto L_0x0343;
    L_0x01a3:
        r0 = "accessibilityRole";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01ab:
        r9 = 4;
        goto L_0x0343;
    L_0x01ae:
        r0 = "accessibilityHint";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01b6:
        r9 = 1;
        goto L_0x0343;
    L_0x01b9:
        r0 = "borderLeftWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01c1:
        r9 = 16;
        goto L_0x0343;
    L_0x01c5:
        r0 = "borderLeftColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01cd:
        r9 = 15;
        goto L_0x0343;
    L_0x01d1:
        r0 = "autoCorrect";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01d9:
        r9 = 7;
        goto L_0x0343;
    L_0x01dc:
        r0 = "selectTextOnFocus";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01e4:
        r9 = 59;
        goto L_0x0343;
    L_0x01e8:
        r0 = "returnKeyLabel";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01f0:
        r9 = 53;
        goto L_0x0343;
    L_0x01f4:
        r0 = "zIndex";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x01fc:
        r9 = 69;
        goto L_0x0343;
    L_0x0200:
        r0 = "fontWeight";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0208:
        r9 = 35;
        goto L_0x0343;
    L_0x020c:
        r0 = "maxLength";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0214:
        r9 = 41;
        goto L_0x0343;
    L_0x0218:
        r0 = "blurOnSubmit";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0220:
        r9 = 9;
        goto L_0x0343;
    L_0x0224:
        r0 = "testID";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x022c:
        r9 = 62;
        goto L_0x0343;
    L_0x0230:
        r0 = "scaleY";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0238:
        r9 = 57;
        goto L_0x0343;
    L_0x023c:
        r0 = "scaleX";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0244:
        r9 = 56;
        goto L_0x0343;
    L_0x0248:
        r0 = "onKeyPress";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0250:
        r9 = 46;
        goto L_0x0343;
    L_0x0254:
        r0 = "textAlign";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x025c:
        r9 = 63;
        goto L_0x0343;
    L_0x0260:
        r0 = "multiline";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0268:
        r9 = 42;
        goto L_0x0343;
    L_0x026c:
        r0 = "fontFamily";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0274:
        r9 = 32;
        goto L_0x0343;
    L_0x0278:
        r0 = "borderTopLeftRadius";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0280:
        r9 = 22;
        goto L_0x0343;
    L_0x0284:
        r0 = "opacity";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x028c:
        r9 = 49;
        goto L_0x0343;
    L_0x0290:
        r0 = "borderBottomWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0298:
        r9 = 13;
        goto L_0x0343;
    L_0x029c:
        r0 = "borderBottomColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02a4:
        r9 = 10;
        goto L_0x0343;
    L_0x02a8:
        r0 = "numberOfLines";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02b0:
        r9 = 44;
        goto L_0x0343;
    L_0x02b4:
        r0 = "autoCapitalize";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02bc:
        r9 = 6;
        goto L_0x0343;
    L_0x02bf:
        r0 = "borderTopWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02c7:
        r9 = 24;
        goto L_0x0343;
    L_0x02ca:
        r0 = "borderTopColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02d2:
        r9 = 21;
        goto L_0x0343;
    L_0x02d5:
        r0 = "fontStyle";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02dd:
        r9 = 34;
        goto L_0x0343;
    L_0x02e0:
        r0 = "underlineColorAndroid";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02e8:
        r9 = 68;
        goto L_0x0343;
    L_0x02eb:
        r0 = "caretHidden";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02f3:
        r9 = 26;
        goto L_0x0343;
    L_0x02f6:
        r0 = "accessibilityComponentType";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x02fe:
        r9 = 0;
        goto L_0x0343;
    L_0x0300:
        r0 = "selection";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0308:
        r9 = 60;
        goto L_0x0343;
    L_0x030b:
        r0 = "translateY";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0313:
        r9 = 67;
        goto L_0x0343;
    L_0x0316:
        r0 = "translateX";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x031e:
        r9 = 66;
        goto L_0x0343;
    L_0x0321:
        r0 = "placeholderTextColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0329:
        r9 = 51;
        goto L_0x0343;
    L_0x032c:
        r0 = "borderRightWidth";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x0334:
        r9 = 19;
        goto L_0x0343;
    L_0x0337:
        r0 = "borderRightColor";
        r0 = r12.equals(r0);
        if (r0 == 0) goto L_0x0342;
    L_0x033f:
        r9 = 18;
        goto L_0x0343;
    L_0x0342:
        r9 = -1;
    L_0x0343:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r0 = 1649989415; // 0x6258d727 float:1.0E21 double:8.15203086E-315;
        r2 = 0;
        switch(r9) {
            case 0: goto L_0x0637;
            case 1: goto L_0x062f;
            case 2: goto L_0x0627;
            case 3: goto L_0x061f;
            case 4: goto L_0x0617;
            case 5: goto L_0x060f;
            case 6: goto L_0x0607;
            case 7: goto L_0x05f4;
            case 8: goto L_0x05ec;
            case 9: goto L_0x05d9;
            case 10: goto L_0x05c6;
            case 11: goto L_0x05be;
            case 12: goto L_0x05b5;
            case 13: goto L_0x05ac;
            case 14: goto L_0x0598;
            case 15: goto L_0x0584;
            case 16: goto L_0x057b;
            case 17: goto L_0x0572;
            case 18: goto L_0x055e;
            case 19: goto L_0x0555;
            case 20: goto L_0x054c;
            case 21: goto L_0x0538;
            case 22: goto L_0x052f;
            case 23: goto L_0x0526;
            case 24: goto L_0x051d;
            case 25: goto L_0x0514;
            case 26: goto L_0x050b;
            case 27: goto L_0x04f7;
            case 28: goto L_0x04ee;
            case 29: goto L_0x04e5;
            case 30: goto L_0x04dc;
            case 31: goto L_0x04d3;
            case 32: goto L_0x04ca;
            case 33: goto L_0x04bf;
            case 34: goto L_0x04b6;
            case 35: goto L_0x04ad;
            case 36: goto L_0x04a4;
            case 37: goto L_0x049b;
            case 38: goto L_0x0492;
            case 39: goto L_0x0489;
            case 40: goto L_0x0480;
            case 41: goto L_0x046c;
            case 42: goto L_0x0463;
            case 43: goto L_0x045a;
            case 44: goto L_0x0451;
            case 45: goto L_0x0448;
            case 46: goto L_0x043f;
            case 47: goto L_0x0436;
            case 48: goto L_0x042d;
            case 49: goto L_0x0424;
            case 50: goto L_0x041b;
            case 51: goto L_0x0407;
            case 52: goto L_0x03fe;
            case 53: goto L_0x03f5;
            case 54: goto L_0x03ec;
            case 55: goto L_0x03e3;
            case 56: goto L_0x03da;
            case 57: goto L_0x03d1;
            case 58: goto L_0x03c8;
            case 59: goto L_0x03bf;
            case 60: goto L_0x03b6;
            case 61: goto L_0x03a2;
            case 62: goto L_0x0399;
            case 63: goto L_0x0390;
            case 64: goto L_0x0387;
            case 65: goto L_0x037e;
            case 66: goto L_0x0375;
            case 67: goto L_0x036c;
            case 68: goto L_0x0358;
            case 69: goto L_0x034f;
            default: goto L_0x034d;
        };
    L_0x034d:
        goto L_0x063e;
    L_0x034f:
        r0 = r13.getFloat(r12, r3);
        r10.setZIndex(r11, r0);
        goto L_0x063e;
    L_0x0358:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x035f;
    L_0x035e:
        goto L_0x0367;
    L_0x035f:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x0367:
        r10.setUnderlineColor(r11, r2);
        goto L_0x063e;
    L_0x036c:
        r0 = r13.getFloat(r12, r3);
        r10.setTranslateY(r11, r0);
        goto L_0x063e;
    L_0x0375:
        r0 = r13.getFloat(r12, r3);
        r10.setTranslateX(r11, r0);
        goto L_0x063e;
    L_0x037e:
        r0 = r13.getArray(r12);
        r10.setTransform(r11, r0);
        goto L_0x063e;
    L_0x0387:
        r0 = r13.getString(r12);
        r10.setTextAlignVertical(r11, r0);
        goto L_0x063e;
    L_0x0390:
        r0 = r13.getString(r12);
        r10.setTextAlign(r11, r0);
        goto L_0x063e;
    L_0x0399:
        r0 = r13.getString(r12);
        r10.setTestId(r11, r0);
        goto L_0x063e;
    L_0x03a2:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x03a9;
    L_0x03a8:
        goto L_0x03b1;
    L_0x03a9:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x03b1:
        r10.setSelectionColor(r11, r2);
        goto L_0x063e;
    L_0x03b6:
        r0 = r13.getMap(r12);
        r10.setSelection(r11, r0);
        goto L_0x063e;
    L_0x03bf:
        r0 = r13.getBoolean(r12, r1);
        r10.setSelectTextOnFocus(r11, r0);
        goto L_0x063e;
    L_0x03c8:
        r0 = r13.getBoolean(r12, r1);
        r10.setSecureTextEntry(r11, r0);
        goto L_0x063e;
    L_0x03d1:
        r0 = r13.getFloat(r12, r8);
        r10.setScaleY(r11, r0);
        goto L_0x063e;
    L_0x03da:
        r0 = r13.getFloat(r12, r8);
        r10.setScaleX(r11, r0);
        goto L_0x063e;
    L_0x03e3:
        r0 = r13.getFloat(r12, r3);
        r10.setRotation(r11, r0);
        goto L_0x063e;
    L_0x03ec:
        r0 = r13.getString(r12);
        r10.setReturnKeyType(r11, r0);
        goto L_0x063e;
    L_0x03f5:
        r0 = r13.getString(r12);
        r10.setReturnKeyLabel(r11, r0);
        goto L_0x063e;
    L_0x03fe:
        r0 = r13.getBoolean(r12, r1);
        r10.setRenderToHardwareTexture(r11, r0);
        goto L_0x063e;
    L_0x0407:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x040e;
    L_0x040d:
        goto L_0x0416;
    L_0x040e:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x0416:
        r10.setPlaceholderTextColor(r11, r2);
        goto L_0x063e;
    L_0x041b:
        r0 = r13.getString(r12);
        r10.setPlaceholder(r11, r0);
        goto L_0x063e;
    L_0x0424:
        r0 = r13.getFloat(r12, r8);
        r10.setOpacity(r11, r0);
        goto L_0x063e;
    L_0x042d:
        r0 = r13.getBoolean(r12, r1);
        r10.setOnSelectionChange(r11, r0);
        goto L_0x063e;
    L_0x0436:
        r0 = r13.getBoolean(r12, r1);
        r10.setOnScroll(r11, r0);
        goto L_0x063e;
    L_0x043f:
        r0 = r13.getBoolean(r12, r1);
        r10.setOnKeyPress(r11, r0);
        goto L_0x063e;
    L_0x0448:
        r0 = r13.getBoolean(r12, r1);
        r10.setOnContentSizeChange(r11, r0);
        goto L_0x063e;
    L_0x0451:
        r0 = r13.getInt(r12, r4);
        r10.setNumLines(r11, r0);
        goto L_0x063e;
    L_0x045a:
        r0 = r13.getString(r12);
        r10.setNativeId(r11, r0);
        goto L_0x063e;
    L_0x0463:
        r0 = r13.getBoolean(r12, r1);
        r10.setMultiline(r11, r0);
        goto L_0x063e;
    L_0x046c:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x0473;
    L_0x0472:
        goto L_0x047b;
    L_0x0473:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x047b:
        r10.setMaxLength(r11, r2);
        goto L_0x063e;
    L_0x0480:
        r0 = r13.getFloat(r12, r3);
        r10.setLetterSpacing(r11, r0);
        goto L_0x063e;
    L_0x0489:
        r0 = r13.getString(r12);
        r10.setKeyboardType(r11, r0);
        goto L_0x063e;
    L_0x0492:
        r0 = r13.getInt(r12, r1);
        r10.setInlineImagePadding(r11, r0);
        goto L_0x063e;
    L_0x049b:
        r0 = r13.getString(r12);
        r10.setInlineImageLeft(r11, r0);
        goto L_0x063e;
    L_0x04a4:
        r0 = r13.getString(r12);
        r10.setImportantForAccessibility(r11, r0);
        goto L_0x063e;
    L_0x04ad:
        r0 = r13.getString(r12);
        r10.setFontWeight(r11, r0);
        goto L_0x063e;
    L_0x04b6:
        r0 = r13.getString(r12);
        r10.setFontStyle(r11, r0);
        goto L_0x063e;
    L_0x04bf:
        r0 = 1096810496; // 0x41600000 float:14.0 double:5.41896386E-315;
        r0 = r13.getFloat(r12, r0);
        r10.setFontSize(r11, r0);
        goto L_0x063e;
    L_0x04ca:
        r0 = r13.getString(r12);
        r10.setFontFamily(r11, r0);
        goto L_0x063e;
    L_0x04d3:
        r0 = r13.getFloat(r12, r3);
        r10.setElevation(r11, r0);
        goto L_0x063e;
    L_0x04dc:
        r0 = r13.getBoolean(r12, r4);
        r10.setEditable(r11, r0);
        goto L_0x063e;
    L_0x04e5:
        r0 = r13.getBoolean(r12, r1);
        r10.setDisableFullscreenUI(r11, r0);
        goto L_0x063e;
    L_0x04ee:
        r0 = r13.getBoolean(r12, r1);
        r10.setContextMenuHidden(r11, r0);
        goto L_0x063e;
    L_0x04f7:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x04fe;
    L_0x04fd:
        goto L_0x0506;
    L_0x04fe:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x0506:
        r10.setColor(r11, r2);
        goto L_0x063e;
    L_0x050b:
        r0 = r13.getBoolean(r12, r1);
        r10.setCaretHidden(r11, r0);
        goto L_0x063e;
    L_0x0514:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r1, r0);
        goto L_0x063e;
    L_0x051d:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r6, r0);
        goto L_0x063e;
    L_0x0526:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r7, r0);
        goto L_0x063e;
    L_0x052f:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r4, r0);
        goto L_0x063e;
    L_0x0538:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x053f;
    L_0x053e:
        goto L_0x0547;
    L_0x053f:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x0547:
        r10.setBorderColor(r11, r6, r2);
        goto L_0x063e;
    L_0x054c:
        r0 = r13.getString(r12);
        r10.setBorderStyle(r11, r0);
        goto L_0x063e;
    L_0x0555:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r7, r0);
        goto L_0x063e;
    L_0x055e:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x0565;
    L_0x0564:
        goto L_0x056d;
    L_0x0565:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x056d:
        r10.setBorderColor(r11, r7, r2);
        goto L_0x063e;
    L_0x0572:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r1, r0);
        goto L_0x063e;
    L_0x057b:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r4, r0);
        goto L_0x063e;
    L_0x0584:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x058b;
    L_0x058a:
        goto L_0x0593;
    L_0x058b:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x0593:
        r10.setBorderColor(r11, r4, r2);
        goto L_0x063e;
    L_0x0598:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x059f;
    L_0x059e:
        goto L_0x05a7;
    L_0x059f:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x05a7:
        r10.setBorderColor(r11, r1, r2);
        goto L_0x063e;
    L_0x05ac:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderWidth(r11, r5, r0);
        goto L_0x063e;
    L_0x05b5:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r6, r0);
        goto L_0x063e;
    L_0x05be:
        r0 = r13.getFloat(r12, r0);
        r10.setBorderRadius(r11, r5, r0);
        goto L_0x063e;
    L_0x05c6:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x05cd;
    L_0x05cc:
        goto L_0x05d5;
    L_0x05cd:
        r0 = r13.getInt(r12, r1);
        r2 = java.lang.Integer.valueOf(r0);
    L_0x05d5:
        r10.setBorderColor(r11, r5, r2);
        goto L_0x063e;
    L_0x05d9:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x05e0;
    L_0x05df:
        goto L_0x05e8;
    L_0x05e0:
        r0 = r13.getBoolean(r12, r1);
        r2 = java.lang.Boolean.valueOf(r0);
    L_0x05e8:
        r10.setBlurOnSubmit(r11, r2);
        goto L_0x063e;
    L_0x05ec:
        r0 = r13.getInt(r12, r1);
        r10.setBackgroundColor(r11, r0);
        goto L_0x063e;
    L_0x05f4:
        r0 = r13.isNull(r12);
        if (r0 == 0) goto L_0x05fb;
    L_0x05fa:
        goto L_0x0603;
    L_0x05fb:
        r0 = r13.getBoolean(r12, r1);
        r2 = java.lang.Boolean.valueOf(r0);
    L_0x0603:
        r10.setAutoCorrect(r11, r2);
        goto L_0x063e;
    L_0x0607:
        r0 = r13.getInt(r12, r1);
        r10.setAutoCapitalize(r11, r0);
        goto L_0x063e;
    L_0x060f:
        r0 = r13.getArray(r12);
        r10.setViewStates(r11, r0);
        goto L_0x063e;
    L_0x0617:
        r0 = r13.getString(r12);
        r10.setAccessibilityRole(r11, r0);
        goto L_0x063e;
    L_0x061f:
        r0 = r13.getString(r12);
        r10.setAccessibilityLiveRegion(r11, r0);
        goto L_0x063e;
    L_0x0627:
        r0 = r13.getString(r12);
        r10.setAccessibilityLabel(r11, r0);
        goto L_0x063e;
    L_0x062f:
        r0 = r13.getString(r12);
        r10.setAccessibilityHint(r11, r0);
        goto L_0x063e;
    L_0x0637:
        r0 = r13.getString(r12);
        r10.setAccessibilityComponentType(r11, r0);
    L_0x063e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager$$PropsSetter.setProperty(com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.views.textinput.ReactEditText, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
