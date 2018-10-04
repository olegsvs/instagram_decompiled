package X;

import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0DY */
public final class AnonymousClass0DY implements Iterator, Closeable {
    /* renamed from: B */
    public final AnonymousClass0DX[] f1878B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0DV f1879C;
    /* renamed from: D */
    private AnonymousClass1Jc f1880D = null;
    /* renamed from: E */
    private int f1881E = 0;

    public AnonymousClass0DY(AnonymousClass0DV anonymousClass0DV, AnonymousClass0DX[] anonymousClass0DXArr) {
        this.f1879C = anonymousClass0DV;
        this.f1878B = anonymousClass0DXArr;
    }

    /* renamed from: A */
    public final AnonymousClass1Jc m1226A() {
        m1225C();
        AnonymousClass1Jc anonymousClass1Jc = this.f1880D;
        if (anonymousClass1Jc != null) {
            this.f1880D = null;
            return anonymousClass1Jc;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    private X.AnonymousClass1Jc m1224B(X.AnonymousClass0DX r12) {
        /*
        r11 = this;
        r6 = r12.f1876B;
        r8 = 1;
        r10 = 0;
        r9 = 0;
        r1 = r11.f1879C;	 Catch:{ IOException -> 0x009e, all -> 0x009a }
        monitor-enter(r1);	 Catch:{ IOException -> 0x009e, all -> 0x009a }
        r0 = r11.f1879C;	 Catch:{ all -> 0x008e }
        r0 = r0.f1874B;	 Catch:{ all -> 0x008e }
        r0 = r0.contains(r6);	 Catch:{ all -> 0x008e }
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        monitor-exit(r1);	 Catch:{ all -> 0x008e }
        X.AnonymousClass0DV.m1220B(r9);
        return r9;
    L_0x0017:
        r0 = r11.f1879C;	 Catch:{ all -> 0x008e }
        r0 = r0.f1874B;	 Catch:{ all -> 0x008e }
        r0.add(r6);	 Catch:{ all -> 0x008e }
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        r7 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x0087, all -> 0x0084 }
        r0 = "rw";
        r7.<init>(r6, r0);	 Catch:{ IOException -> 0x0087, all -> 0x0084 }
        r0 = X.AnonymousClass0DV.m1221C(r7);	 Catch:{ IOException -> 0x0082, all -> 0x0080 }
        if (r0 != 0) goto L_0x003e;
    L_0x002c:
        X.AnonymousClass0DV.m1220B(r7);
        r1 = r11.f1879C;
        monitor-enter(r1);
        r0 = r11.f1879C;	 Catch:{ all -> 0x003b }
        r0 = r0.f1874B;	 Catch:{ all -> 0x003b }
        r0.remove(r6);	 Catch:{ all -> 0x003b }
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
    L_0x003a:
        return r9;
    L_0x003b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
    L_0x003d:
        throw r0;
    L_0x003e:
        r0 = r6.exists();	 Catch:{ IOException -> 0x0082, all -> 0x0080 }
        if (r0 != 0) goto L_0x0056;
    L_0x0044:
        X.AnonymousClass0DV.m1220B(r7);
        r1 = r11.f1879C;
        monitor-enter(r1);
        r0 = r11.f1879C;	 Catch:{ all -> 0x0053 }
        r0 = r0.f1874B;	 Catch:{ all -> 0x0053 }
        r0.remove(r6);	 Catch:{ all -> 0x0053 }
        monitor-exit(r1);	 Catch:{ all -> 0x0053 }
        goto L_0x003a;
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0053 }
        goto L_0x003d;
    L_0x0056:
        r2 = r7.length();	 Catch:{ IOException -> 0x0082, all -> 0x0080 }
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0075;
    L_0x0060:
        r6.delete();	 Catch:{ IOException -> 0x0082, all -> 0x0080 }
        X.AnonymousClass0DV.m1220B(r7);
        r1 = r11.f1879C;
        monitor-enter(r1);
        r0 = r11.f1879C;	 Catch:{ all -> 0x0072 }
        r0 = r0.f1874B;	 Catch:{ all -> 0x0072 }
        r0.remove(r6);	 Catch:{ all -> 0x0072 }
        monitor-exit(r1);	 Catch:{ all -> 0x0072 }
        goto L_0x003a;
    L_0x0072:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0072 }
        goto L_0x003d;
    L_0x0075:
        r1 = new X.1Jc;	 Catch:{ IOException -> 0x0082, all -> 0x0080 }
        r0 = r11.f1879C;	 Catch:{ IOException -> 0x0082, all -> 0x0080 }
        r1.<init>(r0, r6, r7);	 Catch:{ IOException -> 0x0082, all -> 0x0080 }
        X.AnonymousClass0DV.m1220B(r9);
        return r1;
    L_0x0080:
        r2 = move-exception;
        goto L_0x00cb;
    L_0x0082:
        r5 = move-exception;
        goto L_0x0089;
    L_0x0084:
        r2 = move-exception;
        r7 = r9;
        goto L_0x00cb;
    L_0x0087:
        r5 = move-exception;
        r7 = r9;
    L_0x0089:
        r4 = 1;
        goto L_0x00a1;
    L_0x008b:
        r0 = move-exception;
        r4 = 1;
        goto L_0x0090;
    L_0x008e:
        r0 = move-exception;
        r4 = 0;
    L_0x0090:
        monitor-exit(r1);	 Catch:{ all -> 0x0098 }
        throw r0;	 Catch:{ IOException -> 0x0095, all -> 0x0092 }
    L_0x0092:
        r2 = move-exception;
        r7 = r9;
        goto L_0x00ca;
    L_0x0095:
        r5 = move-exception;
        r7 = r9;
        goto L_0x00a1;
    L_0x0098:
        r0 = move-exception;
        goto L_0x0090;
    L_0x009a:
        r2 = move-exception;
        r7 = r9;
        r8 = 0;
        goto L_0x00cb;
    L_0x009e:
        r5 = move-exception;
        r7 = r9;
        r4 = 0;
    L_0x00a1:
        r3 = "Spool";
        r2 = "unexpected failure opening %s: deleting and continuing scan";
        r1 = new java.lang.Object[r8];	 Catch:{ all -> 0x00c9 }
        r0 = r6.getName();	 Catch:{ all -> 0x00c9 }
        r1[r10] = r0;	 Catch:{ all -> 0x00c9 }
        X.AnonymousClass0Dc.m1256S(r3, r5, r2, r1);	 Catch:{ all -> 0x00c9 }
        r6.delete();	 Catch:{ all -> 0x00c9 }
        X.AnonymousClass0DV.m1220B(r7);
        if (r4 == 0) goto L_0x003a;
    L_0x00b8:
        r1 = r11.f1879C;
        monitor-enter(r1);
        r0 = r11.f1879C;	 Catch:{ all -> 0x00c5 }
        r0 = r0.f1874B;	 Catch:{ all -> 0x00c5 }
        r0.remove(r6);	 Catch:{ all -> 0x00c5 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c5 }
        goto L_0x003a;
    L_0x00c5:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00c5 }
        goto L_0x003d;
    L_0x00c9:
        r2 = move-exception;
    L_0x00ca:
        r8 = r4;
    L_0x00cb:
        X.AnonymousClass0DV.m1220B(r7);
        if (r8 == 0) goto L_0x00e0;
    L_0x00d0:
        r1 = r11.f1879C;
        monitor-enter(r1);
        r0 = r11.f1879C;	 Catch:{ all -> 0x00dc }
        r0 = r0.f1874B;	 Catch:{ all -> 0x00dc }
        r0.remove(r6);	 Catch:{ all -> 0x00dc }
        monitor-exit(r1);	 Catch:{ all -> 0x00dc }
        goto L_0x00e0;
    L_0x00dc:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00dc }
        goto L_0x003d;
    L_0x00e0:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0DY.B(X.0DX):X.1Jc");
    }

    /* renamed from: C */
    private void m1225C() {
        while (this.f1880D == null) {
            int i = this.f1881E;
            AnonymousClass0DX[] anonymousClass0DXArr = this.f1878B;
            if (i < anonymousClass0DXArr.length) {
                this.f1881E = i + 1;
                this.f1880D = m1224B(anonymousClass0DXArr[i]);
            } else {
                return;
            }
        }
    }

    public final void close() {
        AnonymousClass0DV.m1220B(this.f1880D);
    }

    public final boolean hasNext() {
        m1225C();
        return this.f1880D != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return m1226A();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
