package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.2hD */
public final class AnonymousClass2hD {
    /* renamed from: B */
    public final AnonymousClass3rV f32527B;
    /* renamed from: C */
    public final ExecutorService f32528C;
    /* renamed from: D */
    private final AnonymousClass3xT f32529D;
    /* renamed from: E */
    private final AnonymousClass3xa f32530E;

    public AnonymousClass2hD(AnonymousClass3rV anonymousClass3rV, AnonymousClass3xT anonymousClass3xT, AnonymousClass3xY anonymousClass3xY, AnonymousClass3xX anonymousClass3xX, AnonymousClass3xa anonymousClass3xa, ExecutorService executorService) {
        this.f32527B = anonymousClass3rV;
        this.f32529D = anonymousClass3xT;
        this.f32530E = anonymousClass3xa;
        this.f32528C = executorService;
    }

    /* renamed from: A */
    public final void m16919A(List list, AnonymousClass3r1 anonymousClass3r1) {
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            for (AnonymousClass2hG anonymousClass2hG : list) {
                int C = AnonymousClass2hD.m16918C(this, anonymousClass2hG);
                AnonymousClass2hH B = AnonymousClass2hD.m16917B(this, anonymousClass2hG, C, C);
                if (B != null) {
                    arrayList.add(B);
                }
            }
            if (!arrayList.isEmpty()) {
                String A = this.f32530E.m21728A();
                AnonymousClass2gs anonymousClass2gs = new AnonymousClass2gs();
                this.f32530E.m21728A();
                AnonymousClass0GG.B(this.f32528C, new AnonymousClass2hB(this, arrayList, A, anonymousClass3r1), 631817212);
            }
        }
    }

    /* renamed from: B */
    public static AnonymousClass2hH m16917B(AnonymousClass2hD anonymousClass2hD, AnonymousClass2hG anonymousClass2hG, int i, int i2) {
        if (i2 > 0) {
            return new AnonymousClass2hH(anonymousClass2hG, i, i2);
        }
        anonymousClass2hD.f32529D.m21716A("ARModelManager", "Cannot get the correct version for models", null, true);
        return null;
    }

    /* renamed from: C */
    public static int m16918C(AnonymousClass2hD anonymousClass2hD, AnonymousClass2hG anonymousClass2hG) {
        switch (anonymousClass2hG.ordinal()) {
            case null:
                return ((Integer) AnonymousClass0CC.fD.G()).intValue();
            case 1:
                return ((Integer) AnonymousClass0CC.lc.G()).intValue();
            case 2:
            case 3:
            case 4:
            case 5:
                throw new UnsupportedOperationException();
            default:
                AnonymousClass0Dc.T("ARModelManager", "Unknown capability, skipping the request");
                return null;
        }
    }
}
