package X;

import java.lang.ref.WeakReference;

/* renamed from: X.20F */
public final class AnonymousClass20F extends AnonymousClass1Es {
    /* renamed from: B */
    private WeakReference f25170B;

    public AnonymousClass20F(AnonymousClass2TF anonymousClass2TF) {
        this.f25170B = new WeakReference(anonymousClass2TF);
    }

    /* renamed from: A */
    public final void m14143A() {
        AnonymousClass2TF anonymousClass2TF = (AnonymousClass2TF) this.f25170B.get();
        if (anonymousClass2TF != null) {
            AnonymousClass2TF.m15891C(anonymousClass2TF);
        }
    }
}
