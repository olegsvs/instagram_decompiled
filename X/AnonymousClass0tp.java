package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0tp */
public final class AnonymousClass0tp {
    /* renamed from: B */
    public boolean f11753B = true;
    /* renamed from: C */
    public final int[] f11754C;
    /* renamed from: D */
    public final Map f11755D = new HashMap();
    /* renamed from: E */
    public final AnonymousClass0p9 f11756E = new AnonymousClass0p9(this);
    /* renamed from: F */
    public final List f11757F = new ArrayList();
    /* renamed from: G */
    public int f11758G;
    /* renamed from: H */
    public int f11759H;

    public AnonymousClass0tp(AnonymousClass0TB... anonymousClass0TBArr) {
        int[] iArr = new int[anonymousClass0TBArr.length];
        this.f11754C = iArr;
        iArr[0] = anonymousClass0TBArr[0].getViewTypeCount();
        this.f11755D.put(anonymousClass0TBArr[0], Integer.valueOf(0));
        for (int i = 1; i < anonymousClass0TBArr.length; i++) {
            int[] iArr2 = this.f11754C;
            iArr2[i] = iArr2[i - 1] + anonymousClass0TBArr[i].getViewTypeCount();
            this.f11755D.put(anonymousClass0TBArr[i], Integer.valueOf(i));
        }
        this.f11758G = this.f11754C[anonymousClass0TBArr.length - 1];
    }

    /* renamed from: B */
    public static AnonymousClass0pA m8181B(AnonymousClass0tp anonymousClass0tp, Object obj, Object obj2, AnonymousClass0TB anonymousClass0TB, int i, boolean z) {
        AnonymousClass0pA anonymousClass0pA;
        boolean z2 = true;
        Object obj3 = obj;
        Object obj4 = obj2;
        AnonymousClass0TB anonymousClass0TB2 = anonymousClass0TB;
        int i2 = i;
        boolean z3 = z;
        if (anonymousClass0tp.f11759H < anonymousClass0tp.f11757F.size()) {
            anonymousClass0pA = (AnonymousClass0pA) anonymousClass0tp.f11757F.get(anonymousClass0tp.f11759H);
            anonymousClass0pA.f10505D = obj;
            anonymousClass0pA.f10506E = obj2;
            anonymousClass0pA.f10503B = anonymousClass0TB;
            anonymousClass0pA.f10507F = i;
            anonymousClass0pA.f10504C = z;
            anonymousClass0pA.f10508G = AnonymousClass0pB.f10509E;
            anonymousClass0tp.f11759H++;
        } else if (anonymousClass0tp.f11759H == anonymousClass0tp.f11757F.size()) {
            anonymousClass0pA = new AnonymousClass0pA(obj3, obj4, anonymousClass0TB2, i2, z3);
            anonymousClass0tp.f11757F.add(anonymousClass0pA);
            anonymousClass0tp.f11759H++;
        } else {
            throw new RuntimeException("Adding new view model on invalid position");
        }
        if (!anonymousClass0tp.f11753B || !z) {
            z2 = false;
        }
        anonymousClass0tp.f11753B = z2;
        return anonymousClass0pA;
    }
}
