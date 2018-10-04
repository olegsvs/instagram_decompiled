package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3sK */
public final class AnonymousClass3sK implements AnonymousClass2rQ {
    /* renamed from: B */
    private final String f45719B;

    public final void BH() {
    }

    public final void WG() {
    }

    public final AnonymousClass2rO qLA(List list, int i, long j, AnonymousClass2rO[] anonymousClass2rOArr, AnonymousClass2rc anonymousClass2rc, boolean z, AnonymousClass3u8 anonymousClass3u8, AnonymousClass2rO anonymousClass2rO, long j2) {
        return null;
    }

    public AnonymousClass3sK(String str) {
        this.f45719B = str;
    }

    public final void QH(List list, long j, AnonymousClass2rO[] anonymousClass2rOArr, AnonymousClass2rP anonymousClass2rP, long j2, Map map, long j3, float[] fArr, int i) {
        AnonymousClass2rO anonymousClass2rO = null;
        if (this.f45719B != null) {
            for (AnonymousClass2rO anonymousClass2rO2 : anonymousClass2rOArr) {
                if (anonymousClass2rO2.f35068Q.equals(this.f45719B)) {
                    anonymousClass2rO = anonymousClass2rO2;
                }
            }
        }
        int i2 = 1;
        if (anonymousClass2rO == null) {
            anonymousClass2rO = anonymousClass2rOArr[anonymousClass2rOArr.length - 1];
        }
        if (anonymousClass2rP.f35072B != anonymousClass2rO) {
            if (anonymousClass2rP.f35072B != null) {
                i2 = 3;
            }
            anonymousClass2rP.f35074D = i2;
            anonymousClass2rP.f35072B = anonymousClass2rO;
        }
    }
}
