package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import com.instagram.util.regiontracking.RegionTracker;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.5TL */
public final class AnonymousClass5TL implements AnonymousClass3Hm {
    /* renamed from: B */
    public int f64402B;
    /* renamed from: C */
    public final SparseArray f64403C = new SparseArray();
    /* renamed from: D */
    public float f64404D;
    /* renamed from: E */
    public float f64405E;
    /* renamed from: F */
    public final SparseArray f64406F = new SparseArray();
    /* renamed from: G */
    public Handler f64407G;
    /* renamed from: H */
    public final AnonymousClass4OY f64408H = new AnonymousClass4OY(this);
    /* renamed from: I */
    public final AnonymousClass4OZ f64409I;
    /* renamed from: J */
    public float f64410J;
    /* renamed from: K */
    public AnonymousClass4QA f64411K;
    /* renamed from: L */
    public int f64412L;
    /* renamed from: M */
    public final BlockingQueue f64413M = new LinkedBlockingQueue();
    /* renamed from: N */
    public final SparseArray f64414N = new SparseArray();
    /* renamed from: O */
    public final SparseArray f64415O = new SparseArray();
    /* renamed from: P */
    public float f64416P;
    /* renamed from: Q */
    public float f64417Q;
    /* renamed from: R */
    public final SparseArray f64418R = new SparseArray();
    /* renamed from: S */
    public AnonymousClass42v f64419S;
    /* renamed from: T */
    public int f64420T;
    /* renamed from: U */
    public final View f64421U;
    /* renamed from: V */
    public final Handler f64422V;
    /* renamed from: W */
    private final AnonymousClass2Fd f64423W = new AnonymousClass2Fd();
    /* renamed from: X */
    private final AnonymousClass5cl f64424X;

    public AnonymousClass5TL(View view, AnonymousClass4OZ anonymousClass4OZ, AnonymousClass5cl anonymousClass5cl) {
        this.f64421U = view;
        this.f64409I = anonymousClass4OZ;
        this.f64424X = anonymousClass5cl;
        this.f64422V = new Handler(Looper.getMainLooper(), new AnonymousClass4Oa(this));
    }

    /* renamed from: A */
    public final Set m26873A() {
        Set hashSet = new HashSet();
        for (int i = 0; i < this.f64414N.size(); i++) {
            hashSet.add(Integer.valueOf(this.f64414N.keyAt(i)));
        }
        return hashSet;
    }

    /* renamed from: B */
    public final void m26874B(X.AnonymousClass42v r10, int r11, int r12, java.nio.ByteBuffer r13, int r14, int r15, boolean r16) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r1 = r9.f64412L;
        r0 = 10;
        if (r1 >= r0) goto L_0x0021;
    L_0x0006:
        r0 = r9.f64413M;
        r5 = r0.poll();
        r5 = (java.nio.ByteBuffer) r5;
        if (r5 != 0) goto L_0x001e;
    L_0x0010:
        r0 = r13.capacity();
        r5 = java.nio.ByteBuffer.allocateDirect(r0);
        r0 = r9.f64412L;
        r0 = r0 + 1;
        r9.f64412L = r0;
    L_0x001e:
        if (r5 != 0) goto L_0x002d;
    L_0x0020:
        goto L_0x002c;
    L_0x0021:
        r0 = r9.f64413M;	 Catch:{ InterruptedException -> 0x002a }
        r5 = r0.take();	 Catch:{ InterruptedException -> 0x002a }
        r5 = (java.nio.ByteBuffer) r5;	 Catch:{ InterruptedException -> 0x002a }
        goto L_0x001e;	 Catch:{ InterruptedException -> 0x002a }
    L_0x002a:
        r5 = 0;
        goto L_0x001e;
    L_0x002c:
        return;
    L_0x002d:
        r13.rewind();
        r5.put(r13);
        r5.flip();
        r2 = new X.4OX;
        r3 = r11;
        r4 = r12;
        r6 = r14;
        r7 = r15;
        r8 = r16;
        r2.<init>(r3, r4, r5, r6, r7, r8);
        r1 = r9.f64407G;
        if (r1 == 0) goto L_0x002c;
    L_0x0045:
        r0 = X.AnonymousClass5TL.m26871C(r9, r10);
        if (r0 == 0) goto L_0x004d;
    L_0x004b:
        r0 = 6;
        goto L_0x004e;
    L_0x004d:
        r0 = 5;
    L_0x004e:
        r0 = r1.obtainMessage(r0, r2);
        r1.sendMessage(r0);
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5TL.B(X.42v, int, int, java.nio.ByteBuffer, int, int, boolean):void");
    }

    /* renamed from: B */
    public static void m26870B(AnonymousClass5TL anonymousClass5TL, int i, boolean z) {
        if (!(z || anonymousClass5TL.f64406F.get(i) == null)) {
            ((RegionTracker) anonymousClass5TL.f64406F.get(i)).dispose();
            anonymousClass5TL.f64406F.remove(i);
        }
        if (z && anonymousClass5TL.f64418R.get(i) != null) {
            ((RegionTracker) anonymousClass5TL.f64418R.get(i)).dispose();
            anonymousClass5TL.f64418R.remove(i);
        }
        if (anonymousClass5TL.f64418R.size() == 0 && anonymousClass5TL.f64406F.size() == 0) {
            Message obtainMessage = anonymousClass5TL.f64422V.obtainMessage(2);
            obtainMessage.arg1 = i;
            anonymousClass5TL.f64422V.sendMessage(obtainMessage);
        }
    }

    /* renamed from: C */
    public final boolean m26875C(int i) {
        boolean z = this.f64414N.get(i) != null;
        this.f64414N.remove(i);
        if (z) {
            Handler handler = this.f64407G;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage(9);
                obtainMessage.arg1 = i;
                this.f64407G.sendMessage(obtainMessage);
            }
        }
        return z;
    }

    /* renamed from: C */
    public static boolean m26871C(AnonymousClass5TL anonymousClass5TL, AnonymousClass42v anonymousClass42v) {
        return anonymousClass5TL.f64415O.get(anonymousClass42v.f48908F) == anonymousClass42v;
    }

    /* renamed from: D */
    public static void m26872D(AnonymousClass5TL anonymousClass5TL) {
        AnonymousClass0OR.D(anonymousClass5TL.f64422V, new AnonymousClass4OS(anonymousClass5TL, (int) Math.ceil((double) ((anonymousClass5TL.f64416P + anonymousClass5TL.f64404D) * 100.0f))), -288661576);
    }

    public final void wFA(int i) {
        for (int i2 = 0; i2 < this.f64414N.size(); i2++) {
            int keyAt = this.f64414N.keyAt(i2);
            NavigableSet navigableSet = (NavigableSet) this.f64414N.valueAt(i2);
            this.f64423W.f28085K = i;
            AnonymousClass2Fd anonymousClass2Fd = (AnonymousClass2Fd) navigableSet.floor(this.f64423W);
            if (!(anonymousClass2Fd == null || anonymousClass2Fd.f28085K == i)) {
                this.f64423W.f28085K = i + 60;
                anonymousClass2Fd = (AnonymousClass2Fd) navigableSet.floor(this.f64423W);
            }
            this.f64424X.m28126Q(keyAt, anonymousClass2Fd);
        }
    }
}
