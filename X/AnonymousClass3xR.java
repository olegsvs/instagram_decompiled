package X;

import java.io.File;

/* renamed from: X.3xR */
public final class AnonymousClass3xR implements AnonymousClass2hN {
    /* renamed from: B */
    private final AnonymousClass3xW f47408B;

    public AnonymousClass3xR(AnonymousClass37A anonymousClass37A, AnonymousClass3rZ anonymousClass3rZ) {
        AnonymousClass3xW anonymousClass3xW = anonymousClass37A.f38005B;
        this.f47408B = anonymousClass3xW;
        if (anonymousClass3xW == null) {
            throw new IllegalStateException("This should never happen");
        }
    }

    public final void VWA(AnonymousClass2gu anonymousClass2gu) {
        this.f47408B.f47413B.getCacheEntry(AnonymousClass2hM.m16926B(anonymousClass2gu));
    }

    public final void WJA(AnonymousClass2gu anonymousClass2gu) {
        this.f47408B.f47413B.remove(AnonymousClass2hM.m16926B(anonymousClass2gu));
    }

    public final File XJ(AnonymousClass2gu anonymousClass2gu, AnonymousClass3rJ anonymousClass3rJ, boolean z) {
        return this.f47408B.m21725A(anonymousClass2gu);
    }

    public final boolean hLA(File file, AnonymousClass2gu anonymousClass2gu, AnonymousClass3rJ anonymousClass3rJ, boolean z) {
        return AnonymousClass2hO.m16930E(this.f47408B.m21726B(anonymousClass2gu, file));
    }

    public final long nK(AnonymousClass2h2 anonymousClass2h2) {
        return this.f47408B.f47413B.getSize();
    }

    public final boolean qW(AnonymousClass2gu anonymousClass2gu, boolean z) {
        return AnonymousClass2hO.m16930E(XJ(anonymousClass2gu, null, z));
    }
}
