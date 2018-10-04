package X;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import java.io.File;

/* renamed from: X.477 */
public final class AnonymousClass477 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rh f50397B;
    /* renamed from: C */
    public final /* synthetic */ Exception f50398C;
    /* renamed from: D */
    public final /* synthetic */ boolean f50399D;

    public AnonymousClass477(AnonymousClass5Rh anonymousClass5Rh, boolean z, Exception exception) {
        this.f50397B = anonymousClass5Rh;
        this.f50399D = z;
        this.f50398C = exception;
    }

    public final void run() {
        AnonymousClass68v anonymousClass68v = this.f50397B.f63440V;
        if (anonymousClass68v != null) {
            String anonymousClass47J;
            File A;
            boolean z = this.f50399D;
            Exception exception = this.f50398C;
            boolean B = anonymousClass68v.f72221B.f72229I.B();
            boolean z2 = true;
            if ((anonymousClass68v.f72221B.f72235O || z) && !B) {
                LiveStreamingError anonymousClass5ap;
                anonymousClass47J = anonymousClass68v.f72221B.f72229I.f63436R.toString();
                AnonymousClass5Nw anonymousClass5Nw = anonymousClass68v.f72221B.f72228H;
                if (exception != null) {
                    anonymousClass5ap = new AnonymousClass5ap("DVR Failure", exception);
                } else {
                    anonymousClass5ap = new AnonymousClass5ap("RtmpLiveStreamingSession", "DVR unavailable", AnonymousClass0IE.E("state: %s, shouldSaveToCameraRoll: %b, wasDvrEnabled: %b, discFull: %b", new Object[]{anonymousClass47J, Boolean.valueOf(anonymousClass68v.f72221B.f72235O), Boolean.valueOf(z), Boolean.valueOf(anonymousClass68v.f72221B.f72230J.B())}));
                }
                anonymousClass5Nw.B(anonymousClass5ap);
            }
            AnonymousClass5aa anonymousClass5aa = anonymousClass68v.f72221B.f72227G;
            anonymousClass47J = "didStopBroadcast";
            String str = exception != null ? "dvr:failed" : !B ? "dvr:missing" : anonymousClass68v.f72221B.f72230J.B() ? "dvr:full" : "dvr:ok";
            anonymousClass5aa.D(anonymousClass47J, str);
            AnonymousClass3AL anonymousClass3AL = anonymousClass68v.f72221B.f72233M;
            if (anonymousClass68v.f72221B.f72235O) {
                AnonymousClass5Rh anonymousClass5Rh = anonymousClass68v.f72221B.f72229I;
                A = anonymousClass5Rh.B() ? anonymousClass5Rh.f63434P.A() : null;
            } else {
                A = null;
            }
            if (!anonymousClass68v.f72221B.f72235O || anonymousClass68v.f72221B.f72230J.B()) {
                z2 = false;
            }
            AnonymousClass3AL.m18800C(anonymousClass3AL, new AnonymousClass5OA(A, z2));
            anonymousClass68v.f72221B.f72233M = null;
        }
    }
}
