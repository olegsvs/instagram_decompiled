package com.facebook.react.views.art;

import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter;
import java.util.Map;

public class ARTTextShadowNode$$PropsSetter implements ShadowNodeSetter {
    public final void getProperties(Map map) {
        map.put("alignment", "number");
        String str = "Array";
        map.put("d", str);
        map.put("fill", str);
        map.put("frame", "Map");
        map.put("opacity", "number");
        map.put("stroke", "Array");
        map.put("strokeCap", "number");
        map.put("strokeDash", "Array");
        str = "number";
        map.put("strokeJoin", str);
        map.put("strokeWidth", str);
        map.put("transform", "Array");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setProperty(com.facebook.react.views.art.ARTTextShadowNode r4, java.lang.String r5, com.facebook.react.uimanager.ReactStylesDiffMap r6) {
        /*
        r0 = r5.hashCode();
        r2 = 0;
        r1 = 1;
        switch(r0) {
            case -1267206133: goto L_0x0071;
            case -891980232: goto L_0x0067;
            case -631243286: goto L_0x005d;
            case -631051390: goto L_0x0052;
            case -20363654: goto L_0x0048;
            case 100: goto L_0x003e;
            case 3143043: goto L_0x0034;
            case 97692013: goto L_0x002a;
            case 1052666732: goto L_0x001f;
            case 1767875043: goto L_0x0015;
            case 1924065902: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x007b;
    L_0x000a:
        r0 = "strokeWidth";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0012:
        r3 = 9;
        goto L_0x007c;
    L_0x0015:
        r0 = "alignment";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x001d:
        r3 = 0;
        goto L_0x007c;
    L_0x001f:
        r0 = "transform";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0027:
        r3 = 10;
        goto L_0x007c;
    L_0x002a:
        r0 = "frame";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0032:
        r3 = 3;
        goto L_0x007c;
    L_0x0034:
        r0 = "fill";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x003c:
        r3 = 2;
        goto L_0x007c;
    L_0x003e:
        r0 = "d";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0046:
        r3 = 1;
        goto L_0x007c;
    L_0x0048:
        r0 = "strokeCap";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0050:
        r3 = 6;
        goto L_0x007c;
    L_0x0052:
        r0 = "strokeJoin";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x005a:
        r3 = 8;
        goto L_0x007c;
    L_0x005d:
        r0 = "strokeDash";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0065:
        r3 = 7;
        goto L_0x007c;
    L_0x0067:
        r0 = "stroke";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x006f:
        r3 = 5;
        goto L_0x007c;
    L_0x0071:
        r0 = "opacity";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x0079:
        r3 = 4;
        goto L_0x007c;
    L_0x007b:
        r3 = -1;
    L_0x007c:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r3) {
            case 0: goto L_0x00d2;
            case 1: goto L_0x00ca;
            case 2: goto L_0x00c2;
            case 3: goto L_0x00ba;
            case 4: goto L_0x00b2;
            case 5: goto L_0x00aa;
            case 6: goto L_0x00a2;
            case 7: goto L_0x009a;
            case 8: goto L_0x0092;
            case 9: goto L_0x008a;
            case 10: goto L_0x0082;
            default: goto L_0x0081;
        };
    L_0x0081:
        goto L_0x00d9;
    L_0x0082:
        r0 = r6.getArray(r5);
        r4.setTransform(r0);
        goto L_0x00d9;
    L_0x008a:
        r0 = r6.getFloat(r5, r0);
        r4.setStrokeWidth(r0);
        goto L_0x00d9;
    L_0x0092:
        r0 = r6.getInt(r5, r1);
        r4.setStrokeJoin(r0);
        goto L_0x00d9;
    L_0x009a:
        r0 = r6.getArray(r5);
        r4.setStrokeDash(r0);
        goto L_0x00d9;
    L_0x00a2:
        r0 = r6.getInt(r5, r1);
        r4.setStrokeCap(r0);
        goto L_0x00d9;
    L_0x00aa:
        r0 = r6.getArray(r5);
        r4.setStroke(r0);
        goto L_0x00d9;
    L_0x00b2:
        r0 = r6.getFloat(r5, r0);
        r4.setOpacity(r0);
        goto L_0x00d9;
    L_0x00ba:
        r0 = r6.getMap(r5);
        r4.setFrame(r0);
        goto L_0x00d9;
    L_0x00c2:
        r0 = r6.getArray(r5);
        r4.setFill(r0);
        goto L_0x00d9;
    L_0x00ca:
        r0 = r6.getArray(r5);
        r4.setShapePath(r0);
        goto L_0x00d9;
    L_0x00d2:
        r0 = r6.getInt(r5, r2);
        r4.setAlignment(r0);
    L_0x00d9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.art.ARTTextShadowNode$$PropsSetter.setProperty(com.facebook.react.views.art.ARTTextShadowNode, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
