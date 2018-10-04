package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3rN */
public final class AnonymousClass3rN implements AnonymousClass2hE {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2hC f45396B;

    public AnonymousClass3rN(AnonymousClass2hC anonymousClass2hC) {
        this.f45396B = anonymousClass2hC;
    }

    public final void Fh(AnonymousClass2h0 anonymousClass2h0, Exception exception) {
        if (this.f45396B.f32521C != null) {
            this.f45396B.f32521C.m20903A(anonymousClass2h0, exception);
        }
        if (anonymousClass2h0 != null) {
            List<AnonymousClass2hH> list = this.f45396B.f32526H;
            List arrayList = new ArrayList();
            for (AnonymousClass2hH anonymousClass2hH : list) {
                switch (anonymousClass2hH.f32540B.ordinal()) {
                    case 0:
                        if (anonymousClass2h0.f32471C != null && anonymousClass2h0.f32471C.f32502C < anonymousClass2hH.f32542D) {
                            arrayList.add(AnonymousClass2hG.ARVersionedCapabilitiesFacetracker);
                            break;
                        }
                    case 1:
                        if (anonymousClass2h0.f32473E != null && anonymousClass2h0.f32473E.f32502C < anonymousClass2hH.f32542D) {
                            arrayList.add(AnonymousClass2hG.ARVersionedCapabilitiesSegmentation);
                            break;
                        }
                    case 2:
                        if (anonymousClass2h0.f32470B != null && anonymousClass2h0.f32470B.f32502C < anonymousClass2hH.f32542D) {
                            arrayList.add(AnonymousClass2hG.ARVersionedCapabilitiesBodytracker);
                            break;
                        }
                    case 3:
                        if (anonymousClass2h0.f32472D != null && anonymousClass2h0.f32472D.f32502C < anonymousClass2hH.f32542D) {
                            arrayList.add(AnonymousClass2hG.ARVersionedCapabilitiesHandtracker);
                            break;
                        }
                    case 4:
                        if (anonymousClass2h0.f32474F != null && anonymousClass2h0.f32474F.f32502C < anonymousClass2hH.f32542D) {
                            arrayList.add(AnonymousClass2hG.ARVersionedCapabilitiesTargetRecognition);
                            break;
                        }
                    case 5:
                        AnonymousClass2h6 anonymousClass2h6 = anonymousClass2h0.f32475G;
                        if (anonymousClass2h6 != null && anonymousClass2h6.f32502C < anonymousClass2hH.f32542D) {
                            arrayList.add(AnonymousClass2hG.ARVersionedCapabilitiesXRay);
                            break;
                        }
                    default:
                        break;
                }
            }
            if (!arrayList.isEmpty()) {
                this.f45396B.f32520B.m16919A(arrayList, null);
            }
        }
    }
}
