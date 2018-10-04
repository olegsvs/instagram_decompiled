package X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3C6 */
public final class AnonymousClass3C6 {
    /* renamed from: B */
    public AnonymousClass3C3 f38931B;
    /* renamed from: C */
    public final Set f38932C = new HashSet();
    /* renamed from: D */
    public PriorityBlockingQueue f38933D = new PriorityBlockingQueue();
    /* renamed from: E */
    public AnonymousClass3C8[] f38934E = new AnonymousClass3C8[4];
    /* renamed from: F */
    public final AtomicInteger f38935F = new AtomicInteger();
    /* renamed from: G */
    private AnonymousClass3C9 f38936G = new AnonymousClass3ye(this);
    /* renamed from: H */
    private int f38937H;

    /* renamed from: A */
    public final int m18956A(AnonymousClass3C5 anonymousClass3C5) {
        int incrementAndGet = this.f38935F.incrementAndGet();
        anonymousClass3C5.f38925L = this;
        synchronized (this.f38932C) {
            this.f38932C.add(anonymousClass3C5);
        }
        anonymousClass3C5.f38920G = incrementAndGet;
        this.f38933D.add(anonymousClass3C5);
        return incrementAndGet;
    }

    /* renamed from: B */
    public final void m18957B() {
        AnonymousClass3C6.m18955C(this);
        this.f38937H = this.f38933D.size();
        int length = this.f38934E.length;
        int i = 0;
        while (i < length) {
            AnonymousClass3C8 anonymousClass3C8 = new AnonymousClass3C8(this.f38933D, this.f38936G);
            AnonymousClass3C8[] anonymousClass3C8Arr = this.f38934E;
            if (anonymousClass3C8Arr != null) {
                anonymousClass3C8Arr[i] = anonymousClass3C8;
                anonymousClass3C8.start();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: B */
    public static void m18954B(AnonymousClass3C6 anonymousClass3C6) {
        int i = anonymousClass3C6.f38937H - 1;
        anonymousClass3C6.f38937H = i;
        if (i == 0) {
            AnonymousClass3C3 anonymousClass3C3 = anonymousClass3C6.f38931B;
            if (anonymousClass3C3 != null) {
                anonymousClass3C3.onBatchComplete();
            }
        }
    }

    /* renamed from: C */
    public static void m18955C(AnonymousClass3C6 anonymousClass3C6) {
        int i = 0;
        while (true) {
            AnonymousClass3C8[] anonymousClass3C8Arr = anonymousClass3C6.f38934E;
            if (i < anonymousClass3C8Arr.length) {
                if (anonymousClass3C8Arr[i] != null) {
                    AnonymousClass3C8 anonymousClass3C8 = anonymousClass3C8Arr[i];
                    anonymousClass3C8.f38942C = true;
                    anonymousClass3C8.interrupt();
                }
                i++;
            } else {
                return;
            }
        }
    }
}
