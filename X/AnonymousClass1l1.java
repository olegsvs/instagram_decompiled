package X;

import java.util.ArrayList;

/* renamed from: X.1l1 */
public final class AnonymousClass1l1 {
    /* renamed from: B */
    public ArrayList f22436B = new ArrayList();
    /* renamed from: C */
    public int f22437C;
    /* renamed from: D */
    public int f22438D;
    /* renamed from: E */
    public int f22439E;
    /* renamed from: F */
    public int f22440F;

    public AnonymousClass1l1(AnonymousClass1kw anonymousClass1kw) {
        this.f22439E = anonymousClass1kw.BB;
        this.f22440F = anonymousClass1kw.CB;
        this.f22438D = anonymousClass1kw.m12907L();
        this.f22437C = anonymousClass1kw.m12902G();
        ArrayList F = anonymousClass1kw.mo2736F();
        int size = F.size();
        for (int i = 0; i < size; i++) {
            this.f22436B.add(new AnonymousClass1l0((AnonymousClass1kt) F.get(i)));
        }
    }
}
