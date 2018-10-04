package com.facebook.react.uimanager;

import java.util.Arrays;
import java.util.HashSet;

public final class ViewProps {
    public static final int[] BORDER_SPACING_TYPES = new int[]{8, 4, 5, 1, 3, 0, 2};
    private static final HashSet LAYOUT_ONLY_PROPS = new HashSet(Arrays.asList(new String[]{"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"}));
    public static final int[] PADDING_MARGIN_SPACING_TYPES = new int[]{8, 7, 6, 4, 5, 1, 3, 0, 2};
    public static final int[] POSITION_SPACING_TYPES = new int[]{4, 5, 1, 3};
    public static boolean sDefaultOverflowHidden;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isLayoutOnly(com.facebook.react.bridge.ReadableMap r6, java.lang.String r7) {
        /*
        r0 = LAYOUT_ONLY_PROPS;
        r0 = r0.contains(r7);
        r5 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r5;
    L_0x000a:
        r0 = "pointerEvents";
        r0 = r0.equals(r7);
        r4 = 0;
        if (r0 == 0) goto L_0x002a;
    L_0x0013:
        r1 = r6.getString(r7);
        r0 = "auto";
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0009;
    L_0x001f:
        r0 = "box-none";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0009;
    L_0x0028:
        r5 = 0;
        goto L_0x0009;
    L_0x002a:
        r0 = r7.hashCode();
        switch(r0) {
            case -1989576717: goto L_0x00a4;
            case -1971292586: goto L_0x0099;
            case -1470826662: goto L_0x008f;
            case -1452542531: goto L_0x0084;
            case -1308858324: goto L_0x007a;
            case -1290574193: goto L_0x006f;
            case -1267206133: goto L_0x0065;
            case -242276144: goto L_0x005b;
            case -223992013: goto L_0x0051;
            case 529642498: goto L_0x0046;
            case 741115130: goto L_0x003c;
            case 1349188574: goto L_0x0032;
            default: goto L_0x0031;
        };
    L_0x0031:
        goto L_0x00ae;
    L_0x0032:
        r0 = "borderRadius";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x003a:
        r0 = 1;
        goto L_0x00af;
    L_0x003c:
        r0 = "borderWidth";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x0044:
        r0 = 6;
        goto L_0x00af;
    L_0x0046:
        r0 = "overflow";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x004e:
        r0 = 11;
        goto L_0x00af;
    L_0x0051:
        r0 = "borderLeftWidth";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x0059:
        r0 = 7;
        goto L_0x00af;
    L_0x005b:
        r0 = "borderLeftColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x0063:
        r0 = 2;
        goto L_0x00af;
    L_0x0065:
        r0 = "opacity";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x006d:
        r0 = 0;
        goto L_0x00af;
    L_0x006f:
        r0 = "borderBottomWidth";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x0077:
        r0 = 10;
        goto L_0x00af;
    L_0x007a:
        r0 = "borderBottomColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x0082:
        r0 = 5;
        goto L_0x00af;
    L_0x0084:
        r0 = "borderTopWidth";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x008c:
        r0 = 8;
        goto L_0x00af;
    L_0x008f:
        r0 = "borderTopColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x0097:
        r0 = 4;
        goto L_0x00af;
    L_0x0099:
        r0 = "borderRightWidth";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x00a1:
        r0 = 9;
        goto L_0x00af;
    L_0x00a4:
        r0 = "borderRightColor";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x00ac:
        r0 = 3;
        goto L_0x00af;
    L_0x00ae:
        r0 = -1;
    L_0x00af:
        r2 = 0;
        switch(r0) {
            case 0: goto L_0x0187;
            case 1: goto L_0x0159;
            case 2: goto L_0x014f;
            case 3: goto L_0x0145;
            case 4: goto L_0x013b;
            case 5: goto L_0x0131;
            case 6: goto L_0x011d;
            case 7: goto L_0x0109;
            case 8: goto L_0x00f5;
            case 9: goto L_0x00e1;
            case 10: goto L_0x00cd;
            case 11: goto L_0x00b5;
            default: goto L_0x00b4;
        };
    L_0x00b4:
        return r4;
    L_0x00b5:
        r0 = "overflow";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x00bd:
        r1 = "visible";
        r0 = "overflow";
        r0 = r6.getString(r0);
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0028;
    L_0x00cb:
        goto L_0x0009;
    L_0x00cd:
        r0 = "borderBottomWidth";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x00d5:
        r0 = "borderBottomWidth";
        r0 = r6.getDouble(r0);
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0028;
    L_0x00df:
        goto L_0x0009;
    L_0x00e1:
        r0 = "borderRightWidth";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x00e9:
        r0 = "borderRightWidth";
        r0 = r6.getDouble(r0);
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0028;
    L_0x00f3:
        goto L_0x0009;
    L_0x00f5:
        r0 = "borderTopWidth";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x00fd:
        r0 = "borderTopWidth";
        r0 = r6.getDouble(r0);
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0028;
    L_0x0107:
        goto L_0x0009;
    L_0x0109:
        r0 = "borderLeftWidth";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x0111:
        r0 = "borderLeftWidth";
        r0 = r6.getDouble(r0);
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0028;
    L_0x011b:
        goto L_0x0009;
    L_0x011d:
        r0 = "borderWidth";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x0125:
        r0 = "borderWidth";
        r0 = r6.getDouble(r0);
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0028;
    L_0x012f:
        goto L_0x0009;
    L_0x0131:
        r0 = "borderBottomColor";
        r0 = r6.getInt(r0);
        if (r0 != 0) goto L_0x0028;
    L_0x0139:
        goto L_0x0009;
    L_0x013b:
        r0 = "borderTopColor";
        r0 = r6.getInt(r0);
        if (r0 != 0) goto L_0x0028;
    L_0x0143:
        goto L_0x0009;
    L_0x0145:
        r0 = "borderRightColor";
        r0 = r6.getInt(r0);
        if (r0 != 0) goto L_0x0028;
    L_0x014d:
        goto L_0x0009;
    L_0x014f:
        r0 = "borderLeftColor";
        r0 = r6.getInt(r0);
        if (r0 != 0) goto L_0x0028;
    L_0x0157:
        goto L_0x0009;
    L_0x0159:
        r0 = "backgroundColor";
        r0 = r6.hasKey(r0);
        if (r0 == 0) goto L_0x016b;
    L_0x0161:
        r0 = "backgroundColor";
        r0 = r6.getInt(r0);
        if (r0 == 0) goto L_0x016b;
    L_0x0169:
        goto L_0x00b4;
    L_0x016b:
        r0 = "borderWidth";
        r0 = r6.hasKey(r0);
        if (r0 == 0) goto L_0x0009;
    L_0x0173:
        r0 = "borderWidth";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x017b:
        r0 = "borderWidth";
        r0 = r6.getDouble(r0);
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0009;
    L_0x0185:
        goto L_0x00b4;
    L_0x0187:
        r0 = "opacity";
        r0 = r6.isNull(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x018f:
        r0 = "opacity";
        r2 = r6.getDouble(r0);
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0028;
    L_0x019b:
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ViewProps.isLayoutOnly(com.facebook.react.bridge.ReadableMap, java.lang.String):boolean");
    }
}
