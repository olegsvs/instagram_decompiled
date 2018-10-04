package X;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.1mU */
public class AnonymousClass1mU {
    /* renamed from: B */
    public final LinkedHashMap f22602B;
    /* renamed from: C */
    public int f22603C;
    /* renamed from: D */
    private int f22604D;
    /* renamed from: E */
    private int f22605E;
    /* renamed from: F */
    private int f22606F;
    /* renamed from: G */
    private int f22607G;
    /* renamed from: H */
    private int f22608H;

    /* renamed from: A */
    public void m13006A(boolean z, Object obj, Object obj2, Object obj3) {
    }

    /* renamed from: D */
    public int m13009D(Object obj, Object obj2) {
        return 1;
    }

    public AnonymousClass1mU(int i) {
        if (i > 0) {
            this.f22606F = i;
            this.f22602B = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: B */
    public static int m13005B(AnonymousClass1mU anonymousClass1mU, Object obj, Object obj2) {
        int D = anonymousClass1mU.m13009D(obj, obj2);
        if (D >= 0) {
            return D;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(obj);
        stringBuilder.append("=");
        stringBuilder.append(obj2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: B */
    public final Object m13007B(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f22602B.get(obj);
                if (obj2 != null) {
                    this.f22605E++;
                    return obj2;
                }
                this.f22607G++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: C */
    public final Object m13008C(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        Object put;
        synchronized (this) {
            this.f22608H++;
            this.f22603C += AnonymousClass1mU.m13005B(this, obj, obj2);
            put = this.f22602B.put(obj, obj2);
            if (put != null) {
                this.f22603C -= AnonymousClass1mU.m13005B(this, obj, put);
            }
        }
        if (put != null) {
            m13006A(false, obj, put, obj2);
        }
        m13010E(this.f22606F);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: E */
    public final void m13010E(int r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.f22603C;	 Catch:{ all -> 0x0071 }
        if (r0 < 0) goto L_0x0052;
    L_0x0005:
        r0 = r4.f22602B;	 Catch:{ all -> 0x0071 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x0011;
    L_0x000d:
        r0 = r4.f22603C;	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x0052;
    L_0x0011:
        r0 = r4.f22603C;	 Catch:{ all -> 0x0071 }
        if (r0 <= r5) goto L_0x0050;
    L_0x0015:
        r0 = r4.f22602B;	 Catch:{ all -> 0x0071 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0050;
    L_0x001e:
        r0 = r4.f22602B;	 Catch:{ all -> 0x0071 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0071 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0071 }
        r0 = r0.next();	 Catch:{ all -> 0x0071 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0071 }
        r3 = r0.getKey();	 Catch:{ all -> 0x0071 }
        r2 = r0.getValue();	 Catch:{ all -> 0x0071 }
        r0 = r4.f22602B;	 Catch:{ all -> 0x0071 }
        r0.remove(r3);	 Catch:{ all -> 0x0071 }
        r1 = r4.f22603C;	 Catch:{ all -> 0x0071 }
        r0 = X.AnonymousClass1mU.m13005B(r4, r3, r2);	 Catch:{ all -> 0x0071 }
        r1 = r1 - r0;
        r4.f22603C = r1;	 Catch:{ all -> 0x0071 }
        r0 = r4.f22604D;	 Catch:{ all -> 0x0071 }
        r1 = 1;
        r0 = r0 + r1;
        r4.f22604D = r0;	 Catch:{ all -> 0x0071 }
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        r0 = 0;
        r4.m13006A(r1, r3, r2, r0);
        goto L_0x0000;
    L_0x0050:
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        return;
    L_0x0052:
        r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0071 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
        r1.<init>();	 Catch:{ all -> 0x0071 }
        r0 = r4.getClass();	 Catch:{ all -> 0x0071 }
        r0 = r0.getName();	 Catch:{ all -> 0x0071 }
        r1.append(r0);	 Catch:{ all -> 0x0071 }
        r0 = ".sizeOf() is reporting inconsistent results!";
        r1.append(r0);	 Catch:{ all -> 0x0071 }
        r0 = r1.toString();	 Catch:{ all -> 0x0071 }
        r2.<init>(r0);	 Catch:{ all -> 0x0071 }
        throw r2;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1mU.E(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f22605E + this.f22607G;
        i = i2 != 0 ? (this.f22605E * 100) / i2 : 0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f22606F), Integer.valueOf(this.f22605E), Integer.valueOf(this.f22607G), Integer.valueOf(i)});
    }
}
