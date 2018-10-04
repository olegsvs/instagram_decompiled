package X;

import android.content.res.Resources;

/* renamed from: X.3cg */
public final class AnonymousClass3cg implements Runnable {
    /* renamed from: B */
    private int[] f42765B;
    /* renamed from: C */
    private Resources f42766C;

    public AnonymousClass3cg(Resources resources, int[] iArr) {
        this.f42766C = resources;
        this.f42765B = iArr;
    }

    public final void run() {
        try {
            AnonymousClass3ch.f42768D = new AnonymousClass41b(this.f42766C, this.f42765B);
        } finally {
            AnonymousClass3ch.f42769E = true;
            AnonymousClass3ch.f42771G.countDown();
        }
    }
}
