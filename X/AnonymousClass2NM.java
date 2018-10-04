package X;

import java.io.File;

/* renamed from: X.2NM */
public final class AnonymousClass2NM implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ File f29638B;

    public AnonymousClass2NM(File file) {
        this.f29638B = file;
    }

    public final void run() {
        for (File file : this.f29638B.listFiles()) {
            if (file.getName().contains("-stitched")) {
                file.delete();
            }
        }
    }
}
