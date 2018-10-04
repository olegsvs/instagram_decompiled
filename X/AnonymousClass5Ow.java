package X;

import android.content.Context;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: X.5Ow */
public final class AnonymousClass5Ow {
    /* renamed from: B */
    public String f63027B;
    /* renamed from: C */
    public int f63028C = 10;
    /* renamed from: D */
    public final Context f63029D;
    /* renamed from: E */
    public final AnonymousClass67n f63030E;
    /* renamed from: F */
    public String f63031F;
    /* renamed from: G */
    public final TreeMap f63032G = new TreeMap();
    /* renamed from: H */
    public final TreeMap f63033H = new TreeMap();
    /* renamed from: I */
    public final TreeMap f63034I = new TreeMap();
    /* renamed from: J */
    public final TreeMap f63035J = new TreeMap();
    /* renamed from: K */
    public int f63036K = 10;
    /* renamed from: L */
    public final AnonymousClass0Fz f63037L;
    /* renamed from: M */
    public boolean f63038M;
    /* renamed from: N */
    public final AnonymousClass0Cm f63039N;

    public AnonymousClass5Ow(Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass67n anonymousClass67n) {
        this.f63029D = context;
        this.f63037L = anonymousClass0Fz;
        this.f63030E = anonymousClass67n;
        this.f63039N = anonymousClass0Cm;
    }

    /* renamed from: B */
    public static void m26415B(TreeMap treeMap, TreeMap treeMap2, int i, int i2, AnonymousClass5Ov anonymousClass5Ov) {
        treeMap2 = AnonymousClass5Ow.m26416C(treeMap, treeMap2, i, i2);
        if (treeMap2 != -1) {
            anonymousClass5Ov.Am(treeMap2);
        }
    }

    /* renamed from: C */
    private static int m26416C(TreeMap treeMap, TreeMap treeMap2, int i, int i2) {
        if (!AnonymousClass5Ow.m26417D(treeMap2, i)) {
            if (!AnonymousClass5Ow.m26417D(treeMap, i)) {
                return i;
            }
            int intValue = ((Integer) treeMap.floorEntry(Integer.valueOf(i)).getValue()).intValue();
            if (intValue - i > i2 || AnonymousClass5Ow.m26417D(treeMap, intValue) || AnonymousClass5Ow.m26417D(treeMap2, intValue)) {
                return -1;
            }
            return intValue;
        }
        return -1;
    }

    /* renamed from: D */
    private static boolean m26417D(TreeMap treeMap, int i) {
        Entry floorEntry = treeMap.floorEntry(Integer.valueOf(i));
        return floorEntry != null && i < ((Integer) floorEntry.getValue()).intValue();
    }
}
