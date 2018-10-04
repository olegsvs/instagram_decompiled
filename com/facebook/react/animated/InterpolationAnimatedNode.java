package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public final class InterpolationAnimatedNode extends ValueAnimatedNode {
    private final String mExtrapolateLeft;
    private final String mExtrapolateRight;
    private final double[] mInputRange;
    private final double[] mOutputRange;
    private ValueAnimatedNode mParent;

    public InterpolationAnimatedNode(ReadableMap readableMap) {
        this.mInputRange = fromDoubleArray(readableMap.getArray("inputRange"));
        this.mOutputRange = fromDoubleArray(readableMap.getArray("outputRange"));
        this.mExtrapolateLeft = readableMap.getString("extrapolateLeft");
        this.mExtrapolateRight = readableMap.getString("extrapolateRight");
    }

    private static int findRangeIndex(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1) {
            if (dArr[i] >= d) {
                break;
            }
            i++;
        }
        return i - 1;
    }

    private static double[] fromDoubleArray(ReadableArray readableArray) {
        double[] dArr = new double[readableArray.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double interpolate(double r6, double r8, double r10, double r12, double r14, java.lang.String r16, java.lang.String r17) {
        /*
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        r5 = 0;
        r4 = 94742715; // 0x5a5a8bb float:1.5578507E-35 double:4.68091207E-316;
        r2 = -135761730; // 0xfffffffff7e870be float:-9.428903E33 double:NaN;
        r1 = -1289044198; // 0xffffffffb32abf1a float:-3.9755015E-8 double:NaN;
        if (r0 >= 0) goto L_0x005c;
    L_0x000e:
        r3 = r16;
        r0 = r3.hashCode();
        if (r0 == r1) goto L_0x002f;
    L_0x0016:
        if (r0 == r2) goto L_0x0025;
    L_0x0018:
        if (r0 == r4) goto L_0x001b;
    L_0x001a:
        goto L_0x0039;
    L_0x001b:
        r0 = "clamp";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0039;
    L_0x0023:
        r0 = 1;
        goto L_0x003a;
    L_0x0025:
        r0 = "identity";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0039;
    L_0x002d:
        r0 = 0;
        goto L_0x003a;
    L_0x002f:
        r0 = "extend";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0039;
    L_0x0037:
        r0 = 2;
        goto L_0x003a;
    L_0x0039:
        r0 = -1;
    L_0x003a:
        switch(r0) {
            case 0: goto L_0x005b;
            case 1: goto L_0x0059;
            case 2: goto L_0x005c;
            default: goto L_0x003d;
        };
    L_0x003d:
        r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Invalid extrapolation type ";
        r1.append(r0);
        r1.append(r3);
        r0 = "for left extrapolation";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0059:
        r6 = r8;
        goto L_0x005c;
    L_0x005b:
        return r6;
    L_0x005c:
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x00ab;
    L_0x0060:
        r3 = r17;
        r0 = r3.hashCode();
        if (r0 == r1) goto L_0x0080;
    L_0x0068:
        if (r0 == r2) goto L_0x0077;
    L_0x006a:
        if (r0 == r4) goto L_0x006d;
    L_0x006c:
        goto L_0x008a;
    L_0x006d:
        r0 = "clamp";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x008a;
    L_0x0075:
        r5 = 1;
        goto L_0x008b;
    L_0x0077:
        r0 = "identity";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x008a;
    L_0x007f:
        goto L_0x008b;
    L_0x0080:
        r0 = "extend";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x008a;
    L_0x0088:
        r5 = 2;
        goto L_0x008b;
    L_0x008a:
        r5 = -1;
    L_0x008b:
        switch(r5) {
            case 0: goto L_0x005b;
            case 1: goto L_0x00aa;
            case 2: goto L_0x00ab;
            default: goto L_0x008e;
        };
    L_0x008e:
        r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Invalid extrapolation type ";
        r1.append(r0);
        r1.append(r3);
        r0 = "for right extrapolation";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x00aa:
        r6 = r10;
    L_0x00ab:
        r14 = r14 - r12;
        r6 = r6 - r8;
        r14 = r14 * r6;
        r10 = r10 - r8;
        r14 = r14 / r10;
        r12 = r12 + r14;
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.InterpolationAnimatedNode.interpolate(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    public static double interpolate(double d, double[] dArr, double[] dArr2, String str, String str2) {
        double d2 = d;
        int findRangeIndex = findRangeIndex(d, dArr);
        int i = findRangeIndex + 1;
        return interpolate(d2, dArr[findRangeIndex], dArr[i], dArr2[findRangeIndex], dArr2[i], str, str2);
    }

    public final void onAttachedToNode(AnimatedNode animatedNode) {
        if (this.mParent != null) {
            throw new IllegalStateException("Parent already attached");
        } else if (animatedNode instanceof ValueAnimatedNode) {
            this.mParent = (ValueAnimatedNode) animatedNode;
        } else {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
    }

    public final void onDetachedFromNode(AnimatedNode animatedNode) {
        if (animatedNode == this.mParent) {
            this.mParent = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }

    public final void update() {
        ValueAnimatedNode valueAnimatedNode = this.mParent;
        if (valueAnimatedNode != null) {
            this.mValue = interpolate(valueAnimatedNode.getValue(), this.mInputRange, this.mOutputRange, this.mExtrapolateLeft, this.mExtrapolateRight);
        }
    }
}
