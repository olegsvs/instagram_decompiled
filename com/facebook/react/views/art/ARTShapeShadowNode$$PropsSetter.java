package com.facebook.react.views.art;

import com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter;
import java.util.Map;

public class ARTShapeShadowNode$$PropsSetter implements ShadowNodeSetter {
    public final void getProperties(Map map) {
        String str = "Array";
        map.put("d", str);
        map.put("fill", str);
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
    public static final void setProperty(com.facebook.react.views.art.ARTShapeShadowNode r3, java.lang.String r4, com.facebook.react.uimanager.ReactStylesDiffMap r5) {
        /*
        r0 = r4.hashCode();
        r1 = 1;
        switch(r0) {
            case -1267206133: goto L_0x005a;
            case -891980232: goto L_0x0050;
            case -631243286: goto L_0x0046;
            case -631051390: goto L_0x003c;
            case -20363654: goto L_0x0032;
            case 100: goto L_0x0028;
            case 3143043: goto L_0x001e;
            case 1052666732: goto L_0x0013;
            case 1924065902: goto L_0x0009;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x0064;
    L_0x0009:
        r0 = "strokeWidth";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x0011:
        r2 = 7;
        goto L_0x0065;
    L_0x0013:
        r0 = "transform";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x001b:
        r2 = 8;
        goto L_0x0065;
    L_0x001e:
        r0 = "fill";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x0026:
        r2 = 1;
        goto L_0x0065;
    L_0x0028:
        r0 = "d";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x0030:
        r2 = 0;
        goto L_0x0065;
    L_0x0032:
        r0 = "strokeCap";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x003a:
        r2 = 4;
        goto L_0x0065;
    L_0x003c:
        r0 = "strokeJoin";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x0044:
        r2 = 6;
        goto L_0x0065;
    L_0x0046:
        r0 = "strokeDash";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x004e:
        r2 = 5;
        goto L_0x0065;
    L_0x0050:
        r0 = "stroke";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x0058:
        r2 = 3;
        goto L_0x0065;
    L_0x005a:
        r0 = "opacity";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x0062:
        r2 = 2;
        goto L_0x0065;
    L_0x0064:
        r2 = -1;
    L_0x0065:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r2) {
            case 0: goto L_0x00ab;
            case 1: goto L_0x00a3;
            case 2: goto L_0x009b;
            case 3: goto L_0x0093;
            case 4: goto L_0x008b;
            case 5: goto L_0x0083;
            case 6: goto L_0x007b;
            case 7: goto L_0x0073;
            case 8: goto L_0x006b;
            default: goto L_0x006a;
        };
    L_0x006a:
        goto L_0x00b2;
    L_0x006b:
        r0 = r5.getArray(r4);
        r3.setTransform(r0);
        goto L_0x00b2;
    L_0x0073:
        r0 = r5.getFloat(r4, r0);
        r3.setStrokeWidth(r0);
        goto L_0x00b2;
    L_0x007b:
        r0 = r5.getInt(r4, r1);
        r3.setStrokeJoin(r0);
        goto L_0x00b2;
    L_0x0083:
        r0 = r5.getArray(r4);
        r3.setStrokeDash(r0);
        goto L_0x00b2;
    L_0x008b:
        r0 = r5.getInt(r4, r1);
        r3.setStrokeCap(r0);
        goto L_0x00b2;
    L_0x0093:
        r0 = r5.getArray(r4);
        r3.setStroke(r0);
        goto L_0x00b2;
    L_0x009b:
        r0 = r5.getFloat(r4, r0);
        r3.setOpacity(r0);
        goto L_0x00b2;
    L_0x00a3:
        r0 = r5.getArray(r4);
        r3.setFill(r0);
        goto L_0x00b2;
    L_0x00ab:
        r0 = r5.getArray(r4);
        r3.setShapePath(r0);
    L_0x00b2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.art.ARTShapeShadowNode$$PropsSetter.setProperty(com.facebook.react.views.art.ARTShapeShadowNode, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }
}
