package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0MW */
public final class AnonymousClass0MW {
    /* renamed from: B */
    public List f3430B;
    /* renamed from: C */
    public boolean f3431C;
    /* renamed from: D */
    public String f3432D;
    /* renamed from: E */
    public String f3433E;
    /* renamed from: F */
    public ArrayList f3434F;

    public AnonymousClass0MW(AnonymousClass1D5 anonymousClass1D5) {
        this.f3432D = anonymousClass1D5.f15623D;
        this.f3433E = anonymousClass1D5.f15624E;
        this.f3431C = anonymousClass1D5.f15622C;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0MY add : anonymousClass1D5.f15626G) {
            arrayList.add(add);
        }
        if (!arrayList.isEmpty()) {
            this.f3434F = arrayList;
        }
        this.f3430B = anonymousClass1D5.f15621B;
    }
}
