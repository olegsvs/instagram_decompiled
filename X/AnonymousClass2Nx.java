package X;

import java.util.ArrayList;

/* renamed from: X.2Nx */
public class AnonymousClass2Nx extends AnonymousClass1kw {
    /* renamed from: B */
    public ArrayList f29872B = new ArrayList();

    /* renamed from: N */
    public void mo2740N() {
        this.f29872B.clear();
        super.mo2740N();
    }

    /* renamed from: Q */
    public final void mo2741Q(AnonymousClass1ki anonymousClass1ki) {
        super.mo2741Q(anonymousClass1ki);
        int size = this.f29872B.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass1kw) this.f29872B.get(i)).mo2741Q(anonymousClass1ki);
        }
    }

    /* renamed from: W */
    public final void mo2742W(int i, int i2) {
        super.mo2742W(i, i2);
        int size = this.f29872B.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AnonymousClass1kw) this.f29872B.get(i3)).mo2742W(this.BB + this.f22411j, this.CB + this.f22412k);
        }
    }

    /* renamed from: Z */
    public final void mo2743Z() {
        super.mo2743Z();
        ArrayList arrayList = this.f29872B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass1kw anonymousClass1kw = (AnonymousClass1kw) this.f29872B.get(i);
                anonymousClass1kw.mo2742W(this.f22389N + this.f22411j, this.f22390O + this.f22412k);
                if (!(anonymousClass1kw instanceof AnonymousClass1Pi)) {
                    anonymousClass1kw.mo2743Z();
                }
            }
        }
    }

    /* renamed from: b */
    public void m15405b() {
        mo2743Z();
        ArrayList arrayList = this.f29872B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass1kw anonymousClass1kw = (AnonymousClass1kw) this.f29872B.get(i);
                if (anonymousClass1kw instanceof AnonymousClass2Nx) {
                    ((AnonymousClass2Nx) anonymousClass1kw).m15405b();
                }
            }
        }
    }
}
