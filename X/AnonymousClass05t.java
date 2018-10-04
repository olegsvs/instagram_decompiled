package X;

import android.os.Process;

/* renamed from: X.05t */
public final class AnonymousClass05t extends Thread {
    /* renamed from: B */
    private final int f203B;

    public AnonymousClass05t(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f203B = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f203B);
        super.run();
    }
}
