package com.facebook.react.views.webview;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter;
import java.util.Map;

public class ReactWebViewManager$$PropsSetter implements ViewManagerSetter {
    public final void getProperties(Map map) {
        String str = "String";
        map.put("accessibilityComponentType", str);
        map.put("accessibilityHint", str);
        map.put("accessibilityLabel", str);
        map.put("accessibilityLiveRegion", str);
        map.put("accessibilityRole", str);
        map.put("accessibilityStates", "Array");
        str = "boolean";
        map.put("allowFileAccess", str);
        map.put("allowUniversalAccessFromFileURLs", str);
        map.put("backgroundColor", "Color");
        map.put("domStorageEnabled", "boolean");
        map.put("elevation", "number");
        map.put("geolocationEnabled", "boolean");
        str = "String";
        map.put("importantForAccessibility", str);
        map.put("injectedJavaScript", str);
        str = "boolean";
        map.put("javaScriptEnabled", str);
        map.put("mediaPlaybackRequiresUserAction", str);
        map.put("messagingEnabled", str);
        str = "String";
        map.put("mixedContentMode", str);
        map.put(BaseViewManager.PROP_NATIVE_ID, str);
        map.put("onContentSizeChange", "boolean");
        map.put("opacity", "number");
        map.put("originWhitelist", "Array");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("saveFormDataDisabled", "boolean");
        str = "number";
        map.put("scaleX", str);
        map.put("scaleY", str);
        map.put("scalesPageToFit", "boolean");
        map.put("source", "Map");
        map.put(BaseViewManager.PROP_TEST_ID, "String");
        map.put("thirdPartyCookiesEnabled", "boolean");
        map.put("transform", "Array");
        str = "number";
        map.put("translateX", str);
        map.put("translateY", str);
        map.put("urlPrefixesForDefaultIntent", "Array");
        map.put("userAgent", "String");
        map.put("zIndex", "number");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.webview.ReactWebViewManager r5, android.webkit.WebView r6, java.lang.String r7, com.facebook.react.uimanager.ReactStylesDiffMap r8) {
        /*
        r0 = r7.hashCode();
        r3 = 0;
        switch(r0) {
            case -1789371455: goto L_0x01a7;
            case -1725560121: goto L_0x019c;
            case -1721943862: goto L_0x0191;
            case -1721943861: goto L_0x0186;
            case -1702963415: goto L_0x017c;
            case -1607633676: goto L_0x0171;
            case -1562001507: goto L_0x0166;
            case -1267206133: goto L_0x015b;
            case -1146673624: goto L_0x0150;
            case -908189618: goto L_0x0145;
            case -908189617: goto L_0x013a;
            case -896505829: goto L_0x012f;
            case -877170387: goto L_0x0123;
            case -731417480: goto L_0x0117;
            case -728016272: goto L_0x010c;
            case -101663499: goto L_0x0101;
            case -101359900: goto L_0x00f6;
            case -80891667: goto L_0x00ea;
            case -40300674: goto L_0x00de;
            case -4379043: goto L_0x00d2;
            case 36255470: goto L_0x00c7;
            case 215255965: goto L_0x00bb;
            case 311430650: goto L_0x00af;
            case 746986311: goto L_0x00a3;
            case 760962753: goto L_0x0097;
            case 1052666732: goto L_0x008b;
            case 1056207947: goto L_0x007f;
            case 1138246185: goto L_0x0074;
            case 1146842694: goto L_0x0069;
            case 1287124693: goto L_0x005d;
            case 1344414299: goto L_0x0051;
            case 1410320624: goto L_0x0046;
            case 1774874798: goto L_0x003a;
            case 1812525393: goto L_0x002e;
            case 1873176931: goto L_0x0022;
            case 2045685618: goto L_0x0016;
            case 2074641374: goto L_0x000a;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x01b2;
    L_0x000a:
        r0 = "scalesPageToFit";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0012:
        r4 = 27;
        goto L_0x01b3;
    L_0x0016:
        r0 = "nativeID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x001e:
        r4 = 18;
        goto L_0x01b3;
    L_0x0022:
        r0 = "urlPrefixesForDefaultIntent";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x002a:
        r4 = 34;
        goto L_0x01b3;
    L_0x002e:
        r0 = "thirdPartyCookiesEnabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0036:
        r4 = 30;
        goto L_0x01b3;
    L_0x003a:
        r0 = "mediaPlaybackRequiresUserAction";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0042:
        r4 = 15;
        goto L_0x01b3;
    L_0x0046:
        r0 = "accessibilityStates";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x004e:
        r4 = 5;
        goto L_0x01b3;
    L_0x0051:
        r0 = "geolocationEnabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0059:
        r4 = 11;
        goto L_0x01b3;
    L_0x005d:
        r0 = "backgroundColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0065:
        r4 = 8;
        goto L_0x01b3;
    L_0x0069:
        r0 = "accessibilityLabel";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0071:
        r4 = 2;
        goto L_0x01b3;
    L_0x0074:
        r0 = "allowFileAccess";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x007c:
        r4 = 6;
        goto L_0x01b3;
    L_0x007f:
        r0 = "onContentSizeChange";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0087:
        r4 = 19;
        goto L_0x01b3;
    L_0x008b:
        r0 = "transform";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0093:
        r4 = 31;
        goto L_0x01b3;
    L_0x0097:
        r0 = "mixedContentMode";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x009f:
        r4 = 17;
        goto L_0x01b3;
    L_0x00a3:
        r0 = "importantForAccessibility";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00ab:
        r4 = 12;
        goto L_0x01b3;
    L_0x00af:
        r0 = "userAgent";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00b7:
        r4 = 35;
        goto L_0x01b3;
    L_0x00bb:
        r0 = "injectedJavaScript";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00c3:
        r4 = 13;
        goto L_0x01b3;
    L_0x00c7:
        r0 = "accessibilityLiveRegion";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00cf:
        r4 = 3;
        goto L_0x01b3;
    L_0x00d2:
        r0 = "elevation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00da:
        r4 = 10;
        goto L_0x01b3;
    L_0x00de:
        r0 = "rotation";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00e6:
        r4 = 23;
        goto L_0x01b3;
    L_0x00ea:
        r0 = "renderToHardwareTextureAndroid";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00f2:
        r4 = 22;
        goto L_0x01b3;
    L_0x00f6:
        r0 = "accessibilityRole";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x00fe:
        r4 = 4;
        goto L_0x01b3;
    L_0x0101:
        r0 = "accessibilityHint";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0109:
        r4 = 1;
        goto L_0x01b3;
    L_0x010c:
        r0 = "allowUniversalAccessFromFileURLs";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0114:
        r4 = 7;
        goto L_0x01b3;
    L_0x0117:
        r0 = "zIndex";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x011f:
        r4 = 36;
        goto L_0x01b3;
    L_0x0123:
        r0 = "testID";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x012b:
        r4 = 29;
        goto L_0x01b3;
    L_0x012f:
        r0 = "source";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0137:
        r4 = 28;
        goto L_0x01b3;
    L_0x013a:
        r0 = "scaleY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0142:
        r4 = 26;
        goto L_0x01b3;
    L_0x0145:
        r0 = "scaleX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x014d:
        r4 = 25;
        goto L_0x01b3;
    L_0x0150:
        r0 = "domStorageEnabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0158:
        r4 = 9;
        goto L_0x01b3;
    L_0x015b:
        r0 = "opacity";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0163:
        r4 = 20;
        goto L_0x01b3;
    L_0x0166:
        r0 = "messagingEnabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x016e:
        r4 = 16;
        goto L_0x01b3;
    L_0x0171:
        r0 = "javaScriptEnabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0179:
        r4 = 14;
        goto L_0x01b3;
    L_0x017c:
        r0 = "accessibilityComponentType";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0184:
        r4 = 0;
        goto L_0x01b3;
    L_0x0186:
        r0 = "translateY";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x018e:
        r4 = 33;
        goto L_0x01b3;
    L_0x0191:
        r0 = "translateX";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x0199:
        r4 = 32;
        goto L_0x01b3;
    L_0x019c:
        r0 = "saveFormDataDisabled";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x01a4:
        r4 = 24;
        goto L_0x01b3;
    L_0x01a7:
        r0 = "originWhitelist";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x01b2;
    L_0x01af:
        r4 = 21;
        goto L_0x01b3;
    L_0x01b2:
        r4 = -1;
    L_0x01b3:
        r2 = 0;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 0;
        switch(r4) {
            case 0: goto L_0x0309;
            case 1: goto L_0x0301;
            case 2: goto L_0x02f9;
            case 3: goto L_0x02f1;
            case 4: goto L_0x02e9;
            case 5: goto L_0x02e1;
            case 6: goto L_0x02ce;
            case 7: goto L_0x02c6;
            case 8: goto L_0x02be;
            case 9: goto L_0x02b6;
            case 10: goto L_0x02ae;
            case 11: goto L_0x029b;
            case 12: goto L_0x0293;
            case 13: goto L_0x028b;
            case 14: goto L_0x0282;
            case 15: goto L_0x0279;
            case 16: goto L_0x0270;
            case 17: goto L_0x0267;
            case 18: goto L_0x025e;
            case 19: goto L_0x0255;
            case 20: goto L_0x024c;
            case 21: goto L_0x0243;
            case 22: goto L_0x023a;
            case 23: goto L_0x0231;
            case 24: goto L_0x0228;
            case 25: goto L_0x021f;
            case 26: goto L_0x0216;
            case 27: goto L_0x020d;
            case 28: goto L_0x0204;
            case 29: goto L_0x01fb;
            case 30: goto L_0x01f2;
            case 31: goto L_0x01e9;
            case 32: goto L_0x01e0;
            case 33: goto L_0x01d7;
            case 34: goto L_0x01ce;
            case 35: goto L_0x01c5;
            case 36: goto L_0x01bc;
            default: goto L_0x01ba;
        };
    L_0x01ba:
        goto L_0x0310;
    L_0x01bc:
        r0 = r8.getFloat(r7, r0);
        r5.setZIndex(r6, r0);
        goto L_0x0310;
    L_0x01c5:
        r0 = r8.getString(r7);
        r5.setUserAgent(r6, r0);
        goto L_0x0310;
    L_0x01ce:
        r0 = r8.getArray(r7);
        r5.setUrlPrefixesForDefaultIntent(r6, r0);
        goto L_0x0310;
    L_0x01d7:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateY(r6, r0);
        goto L_0x0310;
    L_0x01e0:
        r0 = r8.getFloat(r7, r0);
        r5.setTranslateX(r6, r0);
        goto L_0x0310;
    L_0x01e9:
        r0 = r8.getArray(r7);
        r5.setTransform(r6, r0);
        goto L_0x0310;
    L_0x01f2:
        r0 = r8.getBoolean(r7, r3);
        r5.setThirdPartyCookiesEnabled(r6, r0);
        goto L_0x0310;
    L_0x01fb:
        r0 = r8.getString(r7);
        r5.setTestId(r6, r0);
        goto L_0x0310;
    L_0x0204:
        r0 = r8.getMap(r7);
        r5.setSource(r6, r0);
        goto L_0x0310;
    L_0x020d:
        r0 = r8.getBoolean(r7, r3);
        r5.setScalesPageToFit(r6, r0);
        goto L_0x0310;
    L_0x0216:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleY(r6, r0);
        goto L_0x0310;
    L_0x021f:
        r0 = r8.getFloat(r7, r1);
        r5.setScaleX(r6, r0);
        goto L_0x0310;
    L_0x0228:
        r0 = r8.getBoolean(r7, r3);
        r5.setSaveFormDataDisabled(r6, r0);
        goto L_0x0310;
    L_0x0231:
        r0 = r8.getFloat(r7, r0);
        r5.setRotation(r6, r0);
        goto L_0x0310;
    L_0x023a:
        r0 = r8.getBoolean(r7, r3);
        r5.setRenderToHardwareTexture(r6, r0);
        goto L_0x0310;
    L_0x0243:
        r0 = r8.getArray(r7);
        r5.setOriginWhitelist(r6, r0);
        goto L_0x0310;
    L_0x024c:
        r0 = r8.getFloat(r7, r1);
        r5.setOpacity(r6, r0);
        goto L_0x0310;
    L_0x0255:
        r0 = r8.getBoolean(r7, r3);
        r5.setOnContentSizeChange(r6, r0);
        goto L_0x0310;
    L_0x025e:
        r0 = r8.getString(r7);
        r5.setNativeId(r6, r0);
        goto L_0x0310;
    L_0x0267:
        r0 = r8.getString(r7);
        r5.setMixedContentMode(r6, r0);
        goto L_0x0310;
    L_0x0270:
        r0 = r8.getBoolean(r7, r3);
        r5.setMessagingEnabled(r6, r0);
        goto L_0x0310;
    L_0x0279:
        r0 = r8.getBoolean(r7, r3);
        r5.setMediaPlaybackRequiresUserAction(r6, r0);
        goto L_0x0310;
    L_0x0282:
        r0 = r8.getBoolean(r7, r3);
        r5.setJavaScriptEnabled(r6, r0);
        goto L_0x0310;
    L_0x028b:
        r0 = r8.getString(r7);
        r5.setInjectedJavaScript(r6, r0);
        goto L_0x0310;
    L_0x0293:
        r0 = r8.getString(r7);
        r5.setImportantForAccessibility(r6, r0);
        goto L_0x0310;
    L_0x029b:
        r0 = r8.isNull(r7);
        if (r0 == 0) goto L_0x02a2;
    L_0x02a1:
        goto L_0x02aa;
    L_0x02a2:
        r0 = r8.getBoolean(r7, r3);
        r2 = java.lang.Boolean.valueOf(r0);
    L_0x02aa:
        r5.setGeolocationEnabled(r6, r2);
        goto L_0x0310;
    L_0x02ae:
        r0 = r8.getFloat(r7, r0);
        r5.setElevation(r6, r0);
        goto L_0x0310;
    L_0x02b6:
        r0 = r8.getBoolean(r7, r3);
        r5.setDomStorageEnabled(r6, r0);
        goto L_0x0310;
    L_0x02be:
        r0 = r8.getInt(r7, r3);
        r5.setBackgroundColor(r6, r0);
        goto L_0x0310;
    L_0x02c6:
        r0 = r8.getBoolean(r7, r3);
        r5.setAllowUniversalAccessFromFileURLs(r6, r0);
        goto L_0x0310;
    L_0x02ce:
        r0 = r8.isNull(r7);
        if (r0 == 0) goto L_0x02d5;
    L_0x02d4:
        goto L_0x02dd;
    L_0x02d5:
        r0 = r8.getBoolean(r7, r3);
        r2 = java.lang.Boolean.valueOf(r0);
    L_0x02dd:
        r5.setAllowFileAccess(r6, r2);
        goto L_0x0310;
    L_0x02e1:
        r0 = r8.getArray(r7);
        r5.setViewStates(r6, r0);
        goto L_0x0310;
    L_0x02e9:
        r0 = r8.getString(r7);
        r5.setAccessibilityRole(r6, r0);
        goto L_0x0310;
    L_0x02f1:
        r0 = r8.getString(r7);
        r5.setAccessibilityLiveRegion(r6, r0);
        goto L_0x0310;
    L_0x02f9:
        r0 = r8.getString(r7);
        r5.setAccessibilityLabel(r6, r0);
        goto L_0x0310;
    L_0x0301:
        r0 = r8.getString(r7);
        r5.setAccessibilityHint(r6, r0);
        goto L_0x0310;
    L_0x0309:
        r0 = r8.getString(r7);
        r5.setAccessibilityComponentType(r6, r0);
    L_0x0310:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.webview.ReactWebViewManager$$PropsSetter.setProperty(com.facebook.react.views.webview.ReactWebViewManager, android.webkit.WebView, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
