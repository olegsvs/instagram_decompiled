package X;

import java.util.concurrent.Executor;

/* renamed from: X.2TS */
public final class AnonymousClass2TS extends AnonymousClass21F {
    /* renamed from: B */
    public final Object f30789B = new Object();
    /* renamed from: C */
    public final AnonymousClass21N f30790C = new AnonymousClass21N();
    /* renamed from: D */
    public boolean f30791D;
    /* renamed from: E */
    public Object f30792E;
    /* renamed from: F */
    public Exception f30793F;

    /* renamed from: B */
    public static final void m15920B(AnonymousClass2TS anonymousClass2TS) {
        synchronized (anonymousClass2TS.f30789B) {
            if (anonymousClass2TS.f30791D) {
                anonymousClass2TS.f30790C.m14187A(anonymousClass2TS);
                return;
            }
        }
    }

    /* renamed from: A */
    public final AnonymousClass21F mo3133A(AnonymousClass21B anonymousClass21B) {
        return mo3134B(AnonymousClass21I.f25285B, anonymousClass21B);
    }

    /* renamed from: B */
    public final AnonymousClass21F mo3134B(Executor executor, AnonymousClass21B anonymousClass21B) {
        this.f30790C.m14188B(new AnonymousClass2TP(executor, anonymousClass21B));
        AnonymousClass2TS.m15920B(this);
        return this;
    }

    /* renamed from: C */
    public final AnonymousClass21F mo3135C(AnonymousClass21C anonymousClass21C) {
        this.f30790C.m14188B(new AnonymousClass2TQ(AnonymousClass21I.f25285B, anonymousClass21C));
        AnonymousClass2TS.m15920B(this);
        return this;
    }

    /* renamed from: D */
    public final AnonymousClass21F mo3136D(AnonymousClass21D anonymousClass21D) {
        this.f30790C.m14188B(new AnonymousClass2TR(AnonymousClass21I.f25285B, anonymousClass21D));
        AnonymousClass2TS.m15920B(this);
        return this;
    }

    /* renamed from: E */
    public final Exception mo3137E() {
        Exception exception;
        synchronized (this.f30789B) {
            exception = this.f30793F;
        }
        return exception;
    }

    /* renamed from: F */
    public final Object mo3138F() {
        Object obj;
        synchronized (this.f30789B) {
            AnonymousClass1Ew.C(this.f30791D, "Task is not yet complete");
            if (this.f30793F == null) {
                obj = this.f30792E;
            } else {
                throw new AnonymousClass21E(this.f30793F);
            }
        }
        return obj;
    }

    /* renamed from: G */
    public final boolean mo3139G() {
        boolean z;
        synchronized (this.f30789B) {
            z = this.f30791D && this.f30793F == null;
        }
        return z;
    }

    /* renamed from: H */
    public final boolean m15928H(Exception exception) {
        AnonymousClass1Ew.E(exception, "Exception must not be null");
        synchronized (this.f30789B) {
            if (this.f30791D) {
                return false;
            }
            this.f30791D = true;
            this.f30793F = exception;
            this.f30790C.m14187A(this);
            return true;
        }
    }
}
