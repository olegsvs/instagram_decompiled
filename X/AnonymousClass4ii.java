package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.4ii */
public final class AnonymousClass4ii implements AnonymousClass1SI {
    /* renamed from: B */
    public final DirectShareTarget f56484B;
    /* renamed from: C */
    private final String[] f56485C;
    /* renamed from: D */
    private final AnonymousClass0Cm f56486D;

    public final int nR() {
        return 3;
    }

    public AnonymousClass4ii(String[] strArr, DirectShareTarget directShareTarget, AnonymousClass0Cm anonymousClass0Cm) {
        this.f56485C = strArr;
        this.f56484B = directShareTarget;
        this.f56486D = anonymousClass0Cm;
    }

    public final void HMA() {
        for (int i = 0; i < this.f56485C.length; i++) {
            AnonymousClass0Tw C = AnonymousClass0Tw.C(this.f56486D);
            DirectShareTarget directShareTarget = this.f56484B;
            String[] strArr = this.f56485C;
            String str = strArr[i];
            int length = strArr.length;
            synchronized (C) {
                if (C.f5301U != null) {
                    C.f5301U.A(new AnonymousClass1T1(C.f5282B, C.f5300T, directShareTarget, str, i, length));
                }
            }
        }
    }
}
