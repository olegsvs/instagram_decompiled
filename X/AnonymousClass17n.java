package X;

import java.util.concurrent.Callable;

/* renamed from: X.17n */
public abstract class AnonymousClass17n extends AnonymousClass0nF implements AnonymousClass0GA, Callable {
    /* renamed from: B */
    private AnonymousClass0Xx f14836B;

    public final String getName() {
        return "SimpleListenableTask";
    }

    public void onFinish() {
        if (this.f14836B.m5274A()) {
            mo1811A(this.f14836B.f6234C);
        } else {
            mo1812B(this.f14836B.f6235D);
        }
    }

    public void onStart() {
        this.f14836B = AnonymousClass0Xx.m5273B(this);
    }

    public final void run() {
        this.f14836B.run();
    }
}
