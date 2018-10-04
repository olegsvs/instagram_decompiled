package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0lj */
public final class AnonymousClass0lj {
    /* renamed from: B */
    public final ArrayList f9600B = new ArrayList();

    /* renamed from: A */
    public final void m7369A() {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).oh();
        }
    }

    /* renamed from: B */
    public final void m7370B(View view) {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).wh(view);
        }
    }

    /* renamed from: C */
    public final void m7371C() {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).ei();
        }
    }

    /* renamed from: D */
    public final void m7372D() {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).gi();
        }
    }

    /* renamed from: E */
    public final void m7373E() {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).St();
        }
    }

    /* renamed from: F */
    public final void m7374F() {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).gx();
        }
    }

    /* renamed from: G */
    public final void m7375G(Bundle bundle) {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).Ry(bundle);
        }
    }

    /* renamed from: H */
    public final void m7376H() {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).onStart();
        }
    }

    /* renamed from: I */
    public final void m7377I() {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).cBA();
        }
    }

    /* renamed from: J */
    public final void m7378J(View view, Bundle bundle) {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).PGA(view, bundle);
        }
    }

    /* renamed from: K */
    public final void m7379K(int i, int i2, Intent intent) {
        for (int size = this.f9600B.size() - 1; size >= 0; size--) {
            ((AnonymousClass0TK) this.f9600B.get(size)).xc(i, i2, intent);
        }
    }

    /* renamed from: L */
    public final void m7380L(AnonymousClass0TK anonymousClass0TK) {
        if (!this.f9600B.contains(anonymousClass0TK)) {
            this.f9600B.add(anonymousClass0TK);
        }
    }

    /* renamed from: M */
    public final void m7381M(AnonymousClass0lj anonymousClass0lj) {
        for (int i = 0; i < anonymousClass0lj.f9600B.size(); i++) {
            m7380L((AnonymousClass0TK) anonymousClass0lj.f9600B.get(i));
        }
    }
}
