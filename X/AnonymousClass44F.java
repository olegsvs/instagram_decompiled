package X;

import java.util.LinkedList;
import java.util.PriorityQueue;

/* renamed from: X.44F */
public abstract class AnonymousClass44F implements AnonymousClass3wE {
    /* renamed from: B */
    public final LinkedList f49414B;
    /* renamed from: C */
    public AnonymousClass45V f49415C;
    /* renamed from: D */
    public long f49416D;
    /* renamed from: E */
    public final PriorityQueue f49417E;
    /* renamed from: F */
    private final LinkedList f49418F = new LinkedList();
    /* renamed from: G */
    private long f49419G;

    /* renamed from: A */
    public abstract AnonymousClass2xP mo5377A();

    /* renamed from: B */
    public abstract void mo5378B(AnonymousClass44D anonymousClass44D);

    /* renamed from: E */
    public abstract boolean mo5379E();

    public void release() {
    }

    public AnonymousClass44F() {
        for (int i = 0; i < 10; i++) {
            this.f49418F.add(new AnonymousClass45V());
        }
        this.f49414B = new LinkedList();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f49414B.add(new AnonymousClass45W(this));
        }
        this.f49417E = new PriorityQueue();
    }

    /* renamed from: B */
    public static void m22546B(AnonymousClass44F anonymousClass44F, AnonymousClass45V anonymousClass45V) {
        anonymousClass45V.mo4533B();
        anonymousClass44F.f49418F.add(anonymousClass45V);
    }

    /* renamed from: C */
    public AnonymousClass44D m22549C() {
        AnonymousClass2yO.m18017F(this.f49415C == null);
        if (this.f49418F.isEmpty()) {
            return null;
        }
        AnonymousClass45V anonymousClass45V = (AnonymousClass45V) this.f49418F.pollFirst();
        this.f49415C = anonymousClass45V;
        return anonymousClass45V;
    }

    /* renamed from: D */
    public AnonymousClass44E m22550D() {
        if (!this.f49414B.isEmpty()) {
            while (!this.f49417E.isEmpty() && ((AnonymousClass45V) this.f49417E.peek()).f46801E <= this.f49419G) {
                AnonymousClass45V anonymousClass45V = (AnonymousClass45V) this.f49417E.poll();
                if (anonymousClass45V.m17767E()) {
                    AnonymousClass44E anonymousClass44E = (AnonymousClass44E) this.f49414B.pollFirst();
                    anonymousClass44E.m17763A(4);
                    AnonymousClass44F.m22546B(this, anonymousClass45V);
                    return anonymousClass44E;
                }
                mo5378B(anonymousClass45V);
                if (mo5379E()) {
                    AnonymousClass2xP A = mo5377A();
                    if (!anonymousClass45V.m17766D()) {
                        AnonymousClass44E anonymousClass44E2 = (AnonymousClass44E) this.f49414B.pollFirst();
                        anonymousClass44E2.m22545G(anonymousClass45V.f46801E, A, Long.MAX_VALUE);
                        AnonymousClass44F.m22546B(this, anonymousClass45V);
                        return anonymousClass44E2;
                    }
                }
                AnonymousClass44F.m22546B(this, anonymousClass45V);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object NG() {
        return m22549C();
    }

    public final /* bridge */ /* synthetic */ Object OG() {
        return m22550D();
    }

    public void XQA(long j) {
        this.f49419G = j;
    }

    public final /* bridge */ /* synthetic */ void aIA(Object obj) {
        AnonymousClass44D anonymousClass44D = (AnonymousClass44D) obj;
        AnonymousClass2yO.m18013B(anonymousClass44D == this.f49415C);
        if (anonymousClass44D.m17766D()) {
            AnonymousClass44F.m22546B(this, this.f49415C);
        } else {
            AnonymousClass45V anonymousClass45V = this.f49415C;
            long j = this.f49416D;
            this.f49416D = 1 + j;
            anonymousClass45V.f49946B = j;
            this.f49417E.add(this.f49415C);
        }
        this.f49415C = null;
    }

    public void flush() {
        this.f49416D = 0;
        this.f49419G = 0;
        while (!this.f49417E.isEmpty()) {
            AnonymousClass44F.m22546B(this, (AnonymousClass45V) this.f49417E.poll());
        }
        AnonymousClass45V anonymousClass45V = this.f49415C;
        if (anonymousClass45V != null) {
            AnonymousClass44F.m22546B(this, anonymousClass45V);
            this.f49415C = null;
        }
    }
}
