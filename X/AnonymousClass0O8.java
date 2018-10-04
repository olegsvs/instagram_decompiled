package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.0O8 */
public class AnonymousClass0O8 {
    /* renamed from: E */
    public static Object[] f3771E;
    /* renamed from: F */
    public static int f3772F;
    /* renamed from: G */
    public static Object[] f3773G;
    /* renamed from: H */
    public static int f3774H;
    /* renamed from: B */
    public Object[] f3775B;
    /* renamed from: C */
    public int[] f3776C;
    /* renamed from: D */
    public int f3777D;

    public AnonymousClass0O8() {
        this.f3776C = AnonymousClass0Ki.f3101B;
        this.f3775B = AnonymousClass0Ki.f3103D;
        this.f3777D = 0;
    }

    public AnonymousClass0O8(int i) {
        if (i == 0) {
            this.f3776C = AnonymousClass0Ki.f3101B;
            this.f3775B = AnonymousClass0Ki.f3103D;
        } else {
            m3522C(i);
        }
        this.f3777D = 0;
    }

    /* renamed from: A */
    public final void m3524A(int i) {
        int i2 = this.f3777D;
        Object obj = this.f3776C;
        if (obj.length < i) {
            Object obj2 = this.f3775B;
            m3522C(i);
            if (this.f3777D > 0) {
                System.arraycopy(obj, 0, this.f3776C, 0, i2);
                System.arraycopy(obj2, 0, this.f3775B, 0, i2 << 1);
            }
            AnonymousClass0O8.m3523D(obj, obj2, i2);
        }
        if (this.f3777D != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: B */
    public final int m3525B(java.lang.Object r6, int r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r5 = this;
        r4 = r5.f3777D;
        r0 = -1;
        if (r4 != 0) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r0 = r5.f3776C;
        r3 = X.AnonymousClass0Ki.m2851B(r0, r4, r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0050 }
        if (r3 >= 0) goto L_0x000f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0050 }
    L_0x000e:
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0050 }
    L_0x000f:
        r1 = r5.f3775B;
        r0 = r3 << 1;
        r0 = r1[r0];
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x000e;
    L_0x001c:
        r2 = r3 + 1;
    L_0x001e:
        if (r2 >= r4) goto L_0x0036;
    L_0x0020:
        r0 = r5.f3776C;
        r0 = r0[r2];
        if (r0 != r7) goto L_0x0036;
    L_0x0026:
        r1 = r5.f3775B;
        r0 = r2 << 1;
        r0 = r1[r0];
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0033;
    L_0x0032:
        return r2;
    L_0x0033:
        r2 = r2 + 1;
        goto L_0x001e;
    L_0x0036:
        r3 = r3 + -1;
        if (r3 < 0) goto L_0x004d;
    L_0x003a:
        r0 = r5.f3776C;
        r0 = r0[r3];
        if (r0 != r7) goto L_0x004d;
    L_0x0040:
        r1 = r5.f3775B;
        r0 = r3 << 1;
        r0 = r1[r0];
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0036;
    L_0x004c:
        goto L_0x000e;
    L_0x004d:
        r0 = r2 ^ -1;
        return r0;
    L_0x0050:
        r0 = new java.util.ConcurrentModificationException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0O8.B(java.lang.Object, int):int");
    }

    /* renamed from: C */
    public final int m3526C(Object obj) {
        return obj == null ? m3527D() : m3525B(obj, obj.hashCode());
    }

    /* renamed from: C */
    private void m3522C(int i) {
        if (i == 8) {
            synchronized (AnonymousClass0O7.class) {
                try {
                    if (f3773G != null) {
                        Object[] objArr = f3773G;
                        this.f3775B = objArr;
                        f3773G = (Object[]) objArr[0];
                        this.f3776C = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3774H--;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        }
        if (i == 4) {
            synchronized (AnonymousClass0O7.class) {
                try {
                    if (f3771E != null) {
                        objArr = f3771E;
                        this.f3775B = objArr;
                        f3771E = (Object[]) objArr[0];
                        this.f3776C = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3772F--;
                    }
                } catch (Throwable th2) {
                    Throwable th3;
                    th3 = th2;
                    throw th3;
                }
            }
        }
        this.f3776C = new int[i];
        this.f3775B = new Object[(i << 1)];
    }

    /* renamed from: D */
    public final int m3527D() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r5 = this;
        r4 = r5.f3777D;
        r0 = -1;
        if (r4 != 0) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r1 = r5.f3776C;
        r0 = 0;
        r3 = X.AnonymousClass0Ki.m2851B(r1, r4, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0045 }
        if (r3 >= 0) goto L_0x0010;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0045 }
    L_0x000f:
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0045 }
    L_0x0010:
        r1 = r5.f3775B;
        r0 = r3 << 1;
        r0 = r1[r0];
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x000f;
    L_0x0019:
        r2 = r3 + 1;
    L_0x001b:
        if (r2 >= r4) goto L_0x002f;
    L_0x001d:
        r0 = r5.f3776C;
        r0 = r0[r2];
        if (r0 != 0) goto L_0x002f;
    L_0x0023:
        r1 = r5.f3775B;
        r0 = r2 << 1;
        r0 = r1[r0];
        if (r0 != 0) goto L_0x002c;
    L_0x002b:
        return r2;
    L_0x002c:
        r2 = r2 + 1;
        goto L_0x001b;
    L_0x002f:
        r3 = r3 + -1;
        if (r3 < 0) goto L_0x0042;
    L_0x0033:
        r0 = r5.f3776C;
        r0 = r0[r3];
        if (r0 != 0) goto L_0x0042;
    L_0x0039:
        r1 = r5.f3775B;
        r0 = r3 << 1;
        r0 = r1[r0];
        if (r0 != 0) goto L_0x002f;
    L_0x0041:
        goto L_0x000f;
    L_0x0042:
        r0 = r2 ^ -1;
        return r0;
    L_0x0045:
        r0 = new java.util.ConcurrentModificationException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0O8.D():int");
    }

    /* renamed from: D */
    private static void m3523D(int[] iArr, Object[] objArr, int i) {
        Throwable th;
        int i2;
        if (iArr.length == 8) {
            synchronized (AnonymousClass0O7.class) {
                try {
                    if (f3774H < 10) {
                        objArr[0] = f3773G;
                        objArr[1] = iArr;
                        for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f3773G = objArr;
                        f3774H++;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (AnonymousClass0O7.class) {
                try {
                    if (f3772F < 10) {
                        objArr[0] = f3771E;
                        objArr[1] = iArr;
                        for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f3771E = objArr;
                        f3772F++;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
    }

    /* renamed from: E */
    public final int m3528E(Object obj) {
        int i = this.f3777D * 2;
        Object[] objArr = this.f3775B;
        int i2;
        if (obj == null) {
            for (i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (i2 = 1; i2 < i; i2 += 2) {
                if (obj.equals(objArr[i2])) {
                    return i2 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: F */
    public final Object m3529F(int i) {
        return this.f3775B[i << 1];
    }

    /* renamed from: G */
    public final void m3530G(AnonymousClass0O8 anonymousClass0O8) {
        int i = anonymousClass0O8.f3777D;
        m3524A(this.f3777D + i);
        int i2 = 0;
        if (this.f3777D != 0) {
            while (i2 < i) {
                put(anonymousClass0O8.m3529F(i2), anonymousClass0O8.m3532I(i2));
                i2++;
            }
        } else if (i > 0) {
            System.arraycopy(anonymousClass0O8.f3776C, 0, this.f3776C, 0, i);
            System.arraycopy(anonymousClass0O8.f3775B, 0, this.f3775B, 0, i << 1);
            this.f3777D = i;
        }
    }

    /* renamed from: H */
    public final Object m3531H(int i) {
        Object[] objArr = this.f3775B;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f3777D;
        int i4;
        if (i3 <= 1) {
            AnonymousClass0O8.m3523D(this.f3776C, objArr, i3);
            this.f3776C = AnonymousClass0Ki.f3101B;
            this.f3775B = AnonymousClass0Ki.f3103D;
            i4 = 0;
            if (i3 == this.f3777D) {
                this.f3777D = i4;
                return obj;
            }
        }
        i4 = i3 - 1;
        int[] iArr = this.f3776C;
        int i5 = 8;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i4) {
                Object obj2 = this.f3776C;
                i5 = i + 1;
                int i6 = i4 - i;
                System.arraycopy(obj2, i5, obj2, i, i6);
                obj2 = this.f3775B;
                System.arraycopy(obj2, i5 << 1, obj2, i2, i6 << 1);
            }
            Object[] objArr2 = this.f3775B;
            i5 = i4 << 1;
            objArr2[i5] = null;
            objArr2[i5 + 1] = null;
            if (i3 == this.f3777D) {
                this.f3777D = i4;
                return obj;
            }
        }
        if (i3 > 8) {
            i5 = i3 + (i3 >> 1);
        }
        Object obj3 = this.f3776C;
        Object obj4 = this.f3775B;
        m3522C(i5);
        if (i3 == this.f3777D) {
            if (i > 0) {
                System.arraycopy(obj3, 0, this.f3776C, 0, i);
                System.arraycopy(obj4, 0, this.f3775B, 0, i2);
            }
            if (i < i4) {
                int i7 = i + 1;
                i6 = i4 - i;
                System.arraycopy(obj3, i7, this.f3776C, i, i6);
                System.arraycopy(obj4, i7 << 1, this.f3775B, i2, i6 << 1);
            }
            if (i3 == this.f3777D) {
                this.f3777D = i4;
                return obj;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: I */
    public final Object m3532I(int i) {
        return this.f3775B[(i << 1) + 1];
    }

    public final void clear() {
        int i = this.f3777D;
        if (i > 0) {
            int[] iArr = this.f3776C;
            Object[] objArr = this.f3775B;
            this.f3776C = AnonymousClass0Ki.f3101B;
            this.f3775B = AnonymousClass0Ki.f3103D;
            this.f3777D = 0;
            AnonymousClass0O8.m3523D(iArr, objArr, i);
        }
        if (this.f3777D > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m3526C(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m3528E(obj) >= 0;
    }

    public final boolean equals(java.lang.Object r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r6 = this;
        r5 = 1;
        if (r6 != r7) goto L_0x0004;
    L_0x0003:
        return r5;
    L_0x0004:
        r0 = r7 instanceof X.AnonymousClass0O8;
        r4 = 0;
        if (r0 == 0) goto L_0x003e;
    L_0x0009:
        r7 = (X.AnonymousClass0O8) r7;
        r1 = r6.size();
        r0 = r7.size();
        if (r1 == r0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r3 = 0;
    L_0x0017:
        r0 = r6.f3777D;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
        if (r3 >= r0) goto L_0x0003;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x001b:
        r2 = r6.m3529F(r3);	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
        r1 = r6.m3532I(r3);	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
        r0 = r7.get(r2);	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
        if (r1 != 0) goto L_0x0032;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x0029:
        if (r0 != 0) goto L_0x0015;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x002b:
        r0 = r7.containsKey(r2);	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
        if (r0 != 0) goto L_0x0039;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x0031:
        goto L_0x0015;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x0032:
        r0 = r1.equals(r0);	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
        if (r0 != 0) goto L_0x0039;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x0038:
        goto L_0x0015;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x0039:
        r3 = r3 + 1;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
        goto L_0x0017;	 Catch:{ NullPointerException -> 0x003d, ClassCastException -> 0x003c }
    L_0x003c:
        return r4;
    L_0x003d:
        return r4;
    L_0x003e:
        r0 = r7 instanceof java.util.Map;
        if (r0 == 0) goto L_0x0015;
    L_0x0042:
        r7 = (java.util.Map) r7;
        r1 = r6.size();
        r0 = r7.size();
        if (r1 == r0) goto L_0x004f;
    L_0x004e:
        goto L_0x0015;
    L_0x004f:
        r3 = 0;
    L_0x0050:
        r0 = r6.f3777D;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
        if (r3 >= r0) goto L_0x0003;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x0054:
        r2 = r6.m3529F(r3);	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
        r1 = r6.m3532I(r3);	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
        r0 = r7.get(r2);	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
        if (r1 != 0) goto L_0x006b;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x0062:
        if (r0 != 0) goto L_0x0015;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x0064:
        r0 = r7.containsKey(r2);	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
        if (r0 != 0) goto L_0x0072;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x006a:
        goto L_0x0015;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x006b:
        r0 = r1.equals(r0);	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
        if (r0 != 0) goto L_0x0072;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x0071:
        goto L_0x0015;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x0072:
        r3 = r3 + 1;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
        goto L_0x0050;	 Catch:{ NullPointerException -> 0x0076, ClassCastException -> 0x0075 }
    L_0x0075:
        return r4;
    L_0x0076:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0O8.equals(java.lang.Object):boolean");
    }

    public final Object get(Object obj) {
        int C = m3526C(obj);
        return C >= 0 ? this.f3775B[(C << 1) + 1] : null;
    }

    public final int hashCode() {
        int[] iArr = this.f3776C;
        Object[] objArr = this.f3775B;
        int i = this.f3777D;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public final boolean isEmpty() {
        return this.f3777D <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int D;
        int i;
        int i2 = this.f3777D;
        if (obj == null) {
            D = m3527D();
            i = 0;
        } else {
            i = obj.hashCode();
            D = m3525B(obj, i);
        }
        if (D >= 0) {
            int i3 = (D << 1) + 1;
            Object[] objArr = this.f3775B;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        Object obj4;
        Object obj5;
        int i4 = D ^ -1;
        if (i2 >= this.f3776C.length) {
            D = 4;
            if (i2 >= 8) {
                D = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                D = 8;
            }
            obj4 = this.f3776C;
            obj5 = this.f3775B;
            m3522C(D);
            if (i2 == this.f3777D) {
                Object obj6 = this.f3776C;
                if (obj6.length > 0) {
                    System.arraycopy(obj4, 0, obj6, 0, obj4.length);
                    System.arraycopy(obj5, 0, this.f3775B, 0, obj5.length);
                }
                AnonymousClass0O8.m3523D(obj4, obj5, i2);
            }
            throw new ConcurrentModificationException();
        }
        if (i4 < i2) {
            obj5 = this.f3776C;
            int i5 = i4 + 1;
            System.arraycopy(obj5, i4, obj5, i5, i2 - i4);
            obj4 = this.f3775B;
            System.arraycopy(obj4, i4 << 1, obj4, i5 << 1, (this.f3777D - i4) << 1);
        }
        i3 = this.f3777D;
        if (i2 == i3) {
            int[] iArr = this.f3776C;
            if (i4 < iArr.length) {
                iArr[i4] = i;
                objArr = this.f3775B;
                D = i4 << 1;
                objArr[D] = obj;
                objArr[D + 1] = obj2;
                this.f3777D = i3 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object remove(Object obj) {
        int C = m3526C(obj);
        return C >= 0 ? m3531H(C) : null;
    }

    public final int size() {
        return this.f3777D;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f3777D * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f3777D; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            AnonymousClass0O8 F = m3529F(i);
            if (F != this) {
                stringBuilder.append(F);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            F = m3532I(i);
            if (F != this) {
                stringBuilder.append(F);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
