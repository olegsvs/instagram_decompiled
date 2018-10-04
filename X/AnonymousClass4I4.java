package X;

import android.hardware.Camera.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4I4 */
public final class AnonymousClass4I4 {
    /* renamed from: B */
    public static List m23764B(List list, List list2) {
        List arrayList = new ArrayList();
        if (list2 != null) {
            Set hashSet = new HashSet(list);
            for (Size size : list2) {
                if (hashSet.contains(size)) {
                    arrayList.add(size);
                }
            }
        } else {
            arrayList.addAll(list);
        }
        Collections.sort(arrayList, new AnonymousClass4I3());
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    public static boolean m23765C(android.hardware.Camera.Size r3) {
        /*
        r1 = android.os.Build.MODEL;
        r0 = "HUAWEI GRA";
        r0 = r1.startsWith(r0);
        r2 = 1;
        if (r0 != 0) goto L_0x0029;
    L_0x000b:
        r0 = "HUAWEI MT7";
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0029;
    L_0x0014:
        r0 = "SD4930UR";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0036;
    L_0x001c:
        r1 = r3.width;
        r0 = 2592; // 0xa20 float:3.632E-42 double:1.2806E-320;
        if (r1 != r0) goto L_0x0036;
    L_0x0022:
        r1 = r3.height;
        r0 = 1944; // 0x798 float:2.724E-42 double:9.605E-321;
        if (r1 != r0) goto L_0x0036;
    L_0x0028:
        return r2;
    L_0x0029:
        r1 = r3.width;
        r0 = 1440; // 0x5a0 float:2.018E-42 double:7.115E-321;
        if (r1 != r0) goto L_0x0036;
    L_0x002f:
        r1 = r3.height;
        r0 = 1080; // 0x438 float:1.513E-42 double:5.336E-321;
        if (r1 != r0) goto L_0x0036;
    L_0x0035:
        goto L_0x0028;
    L_0x0036:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.4I4.C(android.hardware.Camera$Size):boolean");
    }

    /* renamed from: D */
    public static Size m23766D(List list, float f, int i) {
        Size size = null;
        Size size2 = null;
        for (Size size3 : list) {
            if (!AnonymousClass4I4.m23765C(size3)) {
                if (size2 == null) {
                    size2 = size3;
                }
                if (Math.abs((((float) size3.width) / f) - ((float) size3.height)) < ((float) size3.width) * 0.1f) {
                    if (size == null) {
                        size = size3;
                    } else {
                        if ((size.height > i && size3.height < size.height) || (size.height < size3.height && size3.height < i)) {
                            size = size3;
                        }
                        Integer.valueOf(size3.width);
                        Integer.valueOf(size3.height);
                        Integer.valueOf(size.width);
                        Integer.valueOf(size.height);
                    }
                }
            }
            Integer.valueOf(size3.width);
            Integer.valueOf(size3.height);
        }
        if (size != null) {
            Integer.valueOf(size.width);
            Integer.valueOf(size.height);
            return size;
        } else if (size2 == null) {
            return null;
        } else {
            Integer.valueOf(size2.width);
            Integer.valueOf(size2.height);
            return size2;
        }
    }
}
