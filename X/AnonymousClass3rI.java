package X;

import com.facebook.cameracore.assets.model.ARRequestAsset;
import java.io.File;
import java.util.List;

/* renamed from: X.3rI */
public final class AnonymousClass3rI {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2gk f45388B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2gq f45389C;

    public AnonymousClass3rI(AnonymousClass2gk anonymousClass2gk, AnonymousClass2gq anonymousClass2gq) {
        this.f45388B = anonymousClass2gk;
        this.f45389C = anonymousClass2gq;
    }

    /* renamed from: A */
    public final void m20929A(ARRequestAsset aRRequestAsset, File file, AnonymousClass2hQ anonymousClass2hQ) {
        synchronized (this.f45388B.f32426F) {
            AnonymousClass2gk.m16887H(this.f45388B);
            List E = AnonymousClass2gk.m16884E(this.f45388B, this.f45389C);
            Object obj = !this.f45389C.m16898B() ? 1 : null;
            AnonymousClass2gr anonymousClass2gr = this.f45388B.f32425E;
            AnonymousClass2gq anonymousClass2gq = this.f45389C;
            if (anonymousClass2gr.f32448B.remove(anonymousClass2gq.f32447E.m16914A()) != null) {
                AnonymousClass2gk.m16887H(this.f45388B);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("InternalLoadRequest has no linked token: ");
                stringBuilder.append(anonymousClass2gq.f32447E.m16914A());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        if (!E.isEmpty()) {
            AnonymousClass3xX anonymousClass3xX = this.f45388B.f32423C;
            Object obj2 = anonymousClass2hQ == null ? 1 : null;
            if (anonymousClass2hQ != null) {
                anonymousClass2hQ.getMessage();
            }
            AnonymousClass2gp anonymousClass2gp = (AnonymousClass2gp) E.get(0);
            if (file != null) {
                file.length();
            }
            synchronized (anonymousClass3xX) {
                if (obj2 != null) {
                    AnonymousClass0dg.C(aRRequestAsset.m16914A(), "download_end");
                } else {
                    AnonymousClass0dg.C(aRRequestAsset.m16914A(), "download_failed");
                    AnonymousClass0dg.E(aRRequestAsset.m16914A(), false);
                }
            }
        }
        if (file == null) {
            AnonymousClass2gk.m16885F(this.f45388B, this.f45389C, null, anonymousClass2hQ, false);
            AnonymousClass2gk.m16882C(this.f45388B);
            return;
        }
        AnonymousClass0GG.B(obj != null ? this.f45388B.f32427G : this.f45388B.f32424D, new AnonymousClass2gi(this, aRRequestAsset, file), 568510565);
    }

    /* renamed from: B */
    public final void m20930B(ARRequestAsset aRRequestAsset) {
        aRRequestAsset = AnonymousClass2gk.m16883D(this.f45388B, this.f45389C);
        if (!aRRequestAsset.isEmpty()) {
            AnonymousClass2gp anonymousClass2gp = (AnonymousClass2gp) aRRequestAsset.get(0);
        }
    }

    /* renamed from: C */
    public final void m20931C(ARRequestAsset aRRequestAsset) {
        aRRequestAsset = AnonymousClass2gk.m16883D(this.f45388B, this.f45389C);
        if (!aRRequestAsset.isEmpty()) {
            AnonymousClass2gp anonymousClass2gp = (AnonymousClass2gp) aRRequestAsset.get(0);
        }
    }

    /* renamed from: D */
    public final void m20932D(ARRequestAsset aRRequestAsset) {
        List D = AnonymousClass2gk.m16883D(this.f45388B, this.f45389C);
        if (!D.isEmpty()) {
            AnonymousClass2gp anonymousClass2gp = (AnonymousClass2gp) D.get(0);
            synchronized (this.f45388B.f32423C) {
                AnonymousClass0dg.C(aRRequestAsset.m16914A(), "download_start");
            }
        }
    }
}
