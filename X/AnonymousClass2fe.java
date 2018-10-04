package X;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.2fe */
public final class AnonymousClass2fe {
    /* renamed from: G */
    public static final Comparator f32236G = new AnonymousClass2fc();
    /* renamed from: B */
    public final int[] f32237B;
    /* renamed from: C */
    public final AnonymousClass2fh[] f32238C;
    /* renamed from: D */
    public final int[] f32239D;
    /* renamed from: E */
    public final List f32240E;
    /* renamed from: F */
    public final float[] f32241F = new float[3];

    /* renamed from: E */
    public static int m16830E(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: F */
    public static int m16831F(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: G */
    public static int m16832G(int i) {
        return (i >> 10) & 31;
    }

    public AnonymousClass2fe(int[] iArr, int i, AnonymousClass2fh[] anonymousClass2fhArr) {
        int i2;
        int B;
        this.f32238C = anonymousClass2fhArr;
        int[] iArr2 = new int[32768];
        this.f32239D = iArr2;
        int i3 = 0;
        for (i2 = 0; i2 < iArr.length; i2++) {
            int i4 = iArr[i2];
            int E = AnonymousClass2fe.m16830E(Color.blue(i4), 8, 5) | ((AnonymousClass2fe.m16830E(Color.red(i4), 8, 5) << 10) | (AnonymousClass2fe.m16830E(Color.green(i4), 8, 5) << 5));
            iArr[i2] = E;
            iArr2[E] = iArr2[E] + 1;
        }
        int i5 = 0;
        for (E = 0; E < iArr2.length; E++) {
            if (iArr2[E] > 0) {
                B = AnonymousClass2fe.m16827B(E);
                AnonymousClass1lz.m12962G(B, this.f32241F);
                if (AnonymousClass2fe.m16833H(this, B, this.f32241F)) {
                    iArr2[E] = 0;
                }
            }
            if (iArr2[E] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.f32237B = iArr3;
        B = 0;
        for (E = 0; E < iArr2.length; E++) {
            if (iArr2[E] > 0) {
                int i6 = B + 1;
                iArr3[B] = E;
                B = i6;
            }
        }
        if (i5 <= i) {
            this.f32240E = new ArrayList();
            i2 = iArr3.length;
            while (i3 < i2) {
                i6 = iArr3[i3];
                this.f32240E.add(new AnonymousClass2fj(AnonymousClass2fe.m16827B(i6), iArr2[i6]));
                i3++;
            }
            return;
        }
        Collection<AnonymousClass2fd> priorityQueue = new PriorityQueue(i, f32236G);
        priorityQueue.offer(new AnonymousClass2fd(this, 0, this.f32237B.length - 1));
        AnonymousClass2fe.m16834I(priorityQueue, i);
        List arrayList = new ArrayList(priorityQueue.size());
        for (AnonymousClass2fd anonymousClass2fd : priorityQueue) {
            int[] iArr4 = anonymousClass2fd.f32228D.f32237B;
            int[] iArr5 = anonymousClass2fd.f32228D.f32239D;
            i5 = 0;
            i3 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i4 = anonymousClass2fd.f32226B; i4 <= anonymousClass2fd.f32227C; i4++) {
                E = iArr4[i4];
                B = iArr5[E];
                i3 += B;
                i5 += AnonymousClass2fe.m16832G(E) * B;
                i7 += AnonymousClass2fe.m16831F(E) * B;
                i8 += B * (E & 31);
            }
            float f = (float) i3;
            AnonymousClass2fj anonymousClass2fj = new AnonymousClass2fj(AnonymousClass2fe.m16828C(Math.round(((float) i5) / f), Math.round(((float) i7) / f), Math.round(((float) i8) / f)), i3);
            if (!AnonymousClass2fe.m16833H(this, anonymousClass2fj.f32254D, anonymousClass2fj.m16840A())) {
                arrayList.add(anonymousClass2fj);
            }
        }
        this.f32240E = arrayList;
    }

    /* renamed from: B */
    public static int m16827B(int i) {
        return AnonymousClass2fe.m16828C(AnonymousClass2fe.m16832G(i), AnonymousClass2fe.m16831F(i), i & 31);
    }

    /* renamed from: C */
    public static int m16828C(int i, int i2, int i3) {
        return Color.rgb(AnonymousClass2fe.m16830E(i, 5, 8), AnonymousClass2fe.m16830E(i2, 5, 8), AnonymousClass2fe.m16830E(i3, 5, 8));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public static void m16829D(int[] r3, int r4, int r5, int r6) {
        /*
        switch(r4) {
            case -3: goto L_0x0036;
            case -2: goto L_0x001d;
            case -1: goto L_0x0004;
            default: goto L_0x0003;
        };
    L_0x0003:
        goto L_0x0036;
    L_0x0004:
        if (r5 > r6) goto L_0x0036;
    L_0x0006:
        r2 = r3[r5];
        r0 = r2 & 31;
        r1 = r0 << 10;
        r0 = X.AnonymousClass2fe.m16831F(r2);
        r0 = r0 << 5;
        r1 = r1 | r0;
        r0 = X.AnonymousClass2fe.m16832G(r2);
        r0 = r0 | r1;
        r3[r5] = r0;
        r5 = r5 + 1;
        goto L_0x0004;
    L_0x001d:
        if (r5 > r6) goto L_0x0036;
    L_0x001f:
        r2 = r3[r5];
        r0 = X.AnonymousClass2fe.m16831F(r2);
        r1 = r0 << 10;
        r0 = X.AnonymousClass2fe.m16832G(r2);
        r0 = r0 << 5;
        r1 = r1 | r0;
        r0 = r2 & 31;
        r0 = r0 | r1;
        r3[r5] = r0;
        r5 = r5 + 1;
        goto L_0x001d;
    L_0x0036:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2fe.D(int[], int, int, int):void");
    }

    /* renamed from: H */
    public static boolean m16833H(AnonymousClass2fe anonymousClass2fe, int i, float[] fArr) {
        AnonymousClass2fh[] anonymousClass2fhArr = anonymousClass2fe.f32238C;
        if (anonymousClass2fhArr != null && anonymousClass2fhArr.length > 0) {
            int length = anonymousClass2fhArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!anonymousClass2fe.f32238C[i2].fW(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: I */
    public static void m16834I(PriorityQueue priorityQueue, int i) {
        while (priorityQueue.size() < i) {
            AnonymousClass2fd anonymousClass2fd = (AnonymousClass2fd) priorityQueue.poll();
            if (anonymousClass2fd != null && anonymousClass2fd.m16822A()) {
                if (anonymousClass2fd.m16822A()) {
                    int B = anonymousClass2fd.m16823B();
                    AnonymousClass2fd anonymousClass2fd2 = new AnonymousClass2fd(anonymousClass2fd.f32228D, B + 1, anonymousClass2fd.f32227C);
                    anonymousClass2fd.f32227C = B;
                    anonymousClass2fd.m16824C();
                    priorityQueue.offer(anonymousClass2fd2);
                    priorityQueue.offer(anonymousClass2fd);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            }
            return;
        }
    }
}
