package X;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.2SO */
public final class AnonymousClass2SO extends AnonymousClass1yM {
    /* renamed from: B */
    public Exception f30556B = null;
    /* renamed from: C */
    public boolean f30557C = false;
    /* renamed from: D */
    public final Object f30558D = new Object();
    /* renamed from: E */
    public Object f30559E = null;
    /* renamed from: F */
    private final ArrayList f30560F = new ArrayList();

    /* renamed from: A */
    public final AnonymousClass1yM mo3028A(AnonymousClass1yJ anonymousClass1yJ) {
        return mo3029B(AnonymousClass1yI.f24895B, anonymousClass1yJ);
    }

    /* renamed from: B */
    public final AnonymousClass1yM mo3029B(Executor executor, AnonymousClass1yJ anonymousClass1yJ) {
        synchronized (this.f30558D) {
            this.f30560F.add(new AnonymousClass1yL(executor, anonymousClass1yJ));
            AnonymousClass2SO.m15776D(this);
        }
        return this;
    }

    /* renamed from: B */
    public static void m15774B(AnonymousClass2SO anonymousClass2SO) {
        synchronized (anonymousClass2SO.f30558D) {
            if (anonymousClass2SO.m15782F()) {
                throw new IllegalStateException("task has already completed");
            }
        }
    }

    /* renamed from: C */
    public final Exception m15779C() {
        Exception exception;
        synchronized (this.f30558D) {
            mo3030C();
            exception = this.f30556B;
        }
        return exception;
    }

    /* renamed from: C */
    private void mo3030C() {
        synchronized (this.f30558D) {
            if (m15782F()) {
            } else {
                throw new IllegalStateException("task has not completed");
            }
        }
    }

    /* renamed from: D */
    public final Object mo3031D() {
        Object obj;
        synchronized (this.f30558D) {
            mo3030C();
            obj = this.f30559E;
        }
        return obj;
    }

    /* renamed from: D */
    private static void m15776D(AnonymousClass2SO anonymousClass2SO) {
        synchronized (anonymousClass2SO.f30558D) {
            if (anonymousClass2SO.m15782F()) {
                int size = anonymousClass2SO.f30560F.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass1yL) anonymousClass2SO.f30560F.get(i)).m13943A(anonymousClass2SO);
                }
                anonymousClass2SO.f30560F.clear();
            }
        }
    }

    /* renamed from: E */
    public final boolean mo3032E() {
        boolean z;
        synchronized (this.f30558D) {
            mo3030C();
            z = this.f30556B == null;
        }
        return z;
    }

    /* renamed from: F */
    public final boolean m15782F() {
        boolean z;
        synchronized (this.f30558D) {
            z = this.f30557C;
        }
        return z;
    }

    /* renamed from: G */
    public final boolean m15783G(Exception exception) {
        synchronized (this.f30558D) {
            if (this.f30557C) {
                return false;
            }
            synchronized (this.f30558D) {
                AnonymousClass2SO.m15774B(this);
                this.f30557C = true;
                this.f30556B = exception;
                this.f30558D.notifyAll();
            }
            AnonymousClass2SO.m15776D(this);
            return true;
        }
    }

    /* renamed from: H */
    public final boolean m15784H(Object obj) {
        synchronized (this.f30558D) {
            if (this.f30557C) {
                return false;
            }
            synchronized (this.f30558D) {
                AnonymousClass2SO.m15774B(this);
                this.f30557C = true;
                this.f30559E = obj;
                this.f30558D.notifyAll();
            }
            AnonymousClass2SO.m15776D(this);
            return true;
        }
    }
}
