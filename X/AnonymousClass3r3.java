package X;

import com.facebook.cameracore.assets.model.ARRequestAsset;
import java.util.List;

/* renamed from: X.3r3 */
public final class AnonymousClass3r3 implements AnonymousClass2gl {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3r4 f45344B;
    /* renamed from: C */
    private final List f45345C;
    /* renamed from: D */
    private final AnonymousClass2gl f45346D;
    /* renamed from: E */
    private final AnonymousClass2gl f45347E;

    public AnonymousClass3r3(AnonymousClass3r4 anonymousClass3r4, AnonymousClass2gl anonymousClass2gl, AnonymousClass2gl anonymousClass2gl2, List list) {
        this.f45344B = anonymousClass3r4;
        this.f45346D = anonymousClass2gl;
        this.f45347E = anonymousClass2gl2;
        this.f45345C = list;
    }

    /* renamed from: A */
    public final boolean m20904A(String str) {
        for (ARRequestAsset A : this.f45345C) {
            if (A.m16914A().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void aQA(boolean z) {
        synchronized (this.f45344B.f45350D) {
            if (this.f45346D != null) {
                this.f45346D.aQA(z);
            }
            if (this.f45347E != null) {
                this.f45347E.aQA(z);
            }
        }
    }
}
