package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.3CQ */
public final class AnonymousClass3CQ implements AnonymousClass2Mj {
    /* renamed from: B */
    private final WeakReference f39032B;

    public AnonymousClass3CQ(AnonymousClass3CR anonymousClass3CR) {
        this.f39032B = new WeakReference(anonymousClass3CR);
    }

    public final void Jm(boolean z) {
        AnonymousClass3CR anonymousClass3CR = (AnonymousClass3CR) this.f39032B.get();
        if (anonymousClass3CR != null && z) {
            synchronized (anonymousClass3CR) {
                anonymousClass3CR.f39035D = true;
                anonymousClass3CR.m19008B((ArrayList) ((ArrayList) anonymousClass3CR.f39036E).clone());
                anonymousClass3CR.f39036E.clear();
            }
        }
    }
}
