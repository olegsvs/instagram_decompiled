package X;

import android.view.Surface;

/* renamed from: X.2Pj */
public final class AnonymousClass2Pj implements AnonymousClass1ui {
    /* renamed from: B */
    private AnonymousClass1ui f30220B;

    public AnonymousClass2Pj(AnonymousClass1ui anonymousClass1ui, AnonymousClass2Pl anonymousClass2Pl) {
        this.f30220B = anonymousClass1ui;
        if (anonymousClass2Pl == null) {
            AnonymousClass2Pk anonymousClass2Pk = new AnonymousClass2Pk();
        }
    }

    public final boolean BX() {
        return this.f30220B.BX();
    }

    public final boolean cY() {
        return this.f30220B.cY();
    }

    public final void finalize() {
        boolean cY = this.f30220B.cY();
        super.finalize();
    }

    public final AnonymousClass1uo mF(int i, int i2) {
        return this.f30220B.mF(i, i2);
    }

    public final AnonymousClass1uo nF(Surface surface) {
        return this.f30220B.nF(surface);
    }

    public final AnonymousClass1uw qS() {
        return this.f30220B.qS();
    }

    public final void release() {
        boolean cY = this.f30220B.cY();
        this.f30220B.release();
    }

    public final AnonymousClass1ui sSA(int i) {
        this.f30220B.sSA(i);
        return this;
    }

    public final AnonymousClass1ui tSA(int i, AnonymousClass1ui anonymousClass1ui) {
        if (anonymousClass1ui instanceof AnonymousClass2Pj) {
            this.f30220B.tSA(i, ((AnonymousClass2Pj) anonymousClass1ui).f30220B);
        } else {
            this.f30220B.tSA(i, anonymousClass1ui);
        }
        return this;
    }
}
