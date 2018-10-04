package X;

import android.widget.TextView;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.5Uj */
public final class AnonymousClass5Uj implements AnonymousClass4kx, AnonymousClass1SI {
    /* renamed from: B */
    public final AnonymousClass0ES f65072B;
    /* renamed from: C */
    public final AnonymousClass4io f65073C = AnonymousClass4io.B(this.f65075E);
    /* renamed from: D */
    private final AnonymousClass4ZA f65074D;
    /* renamed from: E */
    private final DirectShareTarget f65075E;
    /* renamed from: F */
    private String f65076F;
    /* renamed from: G */
    private final AnonymousClass4ZN f65077G;

    public final int nR() {
        return -1;
    }

    public AnonymousClass5Uj(DirectShareTarget directShareTarget, AnonymousClass0ES anonymousClass0ES, AnonymousClass4ZA anonymousClass4ZA, AnonymousClass4ZN anonymousClass4ZN) {
        this.f65075E = directShareTarget;
        this.f65072B = anonymousClass0ES;
        this.f65074D = anonymousClass4ZA;
        this.f65077G = anonymousClass4ZN;
    }

    public final void HMA() {
        this.f65074D.xz(this.f65075E, this.f65076F);
    }

    public final void bEA() {
        ((AnonymousClass4im) this.f65072B.get()).B(this.f65073C);
        this.f65074D.cEA(this.f65075E);
    }

    public final void bz() {
        this.f65076F = this.f65077G.qQ();
        ((AnonymousClass4im) this.f65072B.get()).F(this.f65073C, this);
        this.f65074D.cz(this.f65075E);
    }

    public final int xN(TextView textView) {
        return AnonymousClass4kg.C(textView);
    }
}
