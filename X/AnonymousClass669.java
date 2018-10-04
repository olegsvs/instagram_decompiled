package X;

import android.os.SystemClock;
import java.util.Set;

/* renamed from: X.669 */
public final class AnonymousClass669 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass66C f71712B;
    /* renamed from: C */
    public final /* synthetic */ long f71713C;

    public AnonymousClass669(AnonymousClass66C anonymousClass66C, long j) {
        this.f71712B = anonymousClass66C;
        this.f71713C = j;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1848892010);
        if (this.f71712B.f71718D != null) {
            AnonymousClass0OR.F(this.f71712B.f71718D, new AnonymousClass668(this), ((long) this.f71712B.f71719E) - (SystemClock.elapsedRealtime() - this.f71713C), 1057398770);
        }
        AnonymousClass0cQ.H(this, 1597617200, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -709391814);
        AnonymousClass5Ma anonymousClass5Ma = (AnonymousClass5Ma) obj;
        int I2 = AnonymousClass0cQ.I(this, 506850931);
        if (this.f71712B.f71721G) {
            AnonymousClass6G0 anonymousClass6G0 = this.f71712B.f71717C;
            int i = anonymousClass5Ma.f62642K;
            int i2 = anonymousClass5Ma.f62641J;
            AnonymousClass6GD anonymousClass6GD = anonymousClass6G0.f73536B;
            if (anonymousClass6GD != null) {
                anonymousClass6GD.mo6812G(i, i2);
            }
            anonymousClass6G0 = this.f71712B.f71717C;
            boolean z = anonymousClass5Ma.f62634C;
            String str = anonymousClass5Ma.f62640I;
            anonymousClass6GD = anonymousClass6G0.f73536B;
            if (anonymousClass6GD != null) {
                anonymousClass6GD.mo6810D(z, str);
            }
            anonymousClass6G0 = this.f71712B.f71717C;
            AnonymousClass0Pq anonymousClass0Pq = anonymousClass5Ma.f62638G;
            anonymousClass6GD = anonymousClass6G0.f73536B;
            if (anonymousClass6GD != null) {
                anonymousClass6GD.mo6808A(anonymousClass0Pq);
            }
            anonymousClass6G0 = this.f71712B.f71717C;
            boolean z2 = anonymousClass5Ma.f62635D;
            anonymousClass6GD = anonymousClass6G0.f73536B;
            if (anonymousClass6GD != null) {
                anonymousClass6GD.mo6811F(z2);
            }
            anonymousClass6G0 = this.f71712B.f71717C;
            Set set = anonymousClass5Ma.f62633B;
            i2 = anonymousClass5Ma.f62639H;
            anonymousClass6GD = anonymousClass6G0.f73536B;
            if (anonymousClass6GD != null) {
                anonymousClass6GD.mo6814B(set, i2);
            }
            if (anonymousClass5Ma.f62637F != null) {
                anonymousClass6G0 = this.f71712B.f71717C;
                AnonymousClass5Mp anonymousClass5Mp = anonymousClass5Ma.f62637F;
                anonymousClass6GD = anonymousClass6G0.f73536B;
                if (anonymousClass6GD != null) {
                    anonymousClass6GD.mo6809C(anonymousClass5Mp);
                }
            }
            anonymousClass6G0 = this.f71712B.f71717C;
            z2 = anonymousClass5Ma.f62636E;
            anonymousClass6GD = anonymousClass6G0.f73536B;
            if (anonymousClass6GD != null) {
                anonymousClass6GD.mo6815E(z2);
            }
        }
        AnonymousClass0cQ.H(this, -1795442249, I2);
        AnonymousClass0cQ.H(this, 162435284, I);
    }
}
