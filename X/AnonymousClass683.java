package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.683 */
public final class AnonymousClass683 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68O f72053B;

    public AnonymousClass683(AnonymousClass68O anonymousClass68O) {
        this.f72053B = anonymousClass68O;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -119230200);
        this.f72053B.f66749G = anonymousClass0Q6.B() ? ((AnonymousClass5MU) anonymousClass0Q6.f4288C).f62622B : null;
        String E = AnonymousClass68O.m29145E(anonymousClass0Q6);
        AnonymousClass0Dc.H("IgLiveStreamingController", "Starting Broadcast Failure (%d): %s", new Object[]{AnonymousClass68O.m29144D(anonymousClass0Q6), E});
        this.f72053B.f72097M.m27737A(false, E);
        AnonymousClass68O anonymousClass68O = this.f72053B;
        AnonymousClass5MU anonymousClass5MU = (AnonymousClass5MU) anonymousClass0Q6.f4288C;
        BroadcastFailureType broadcastFailureType = BroadcastFailureType.InitFailure;
        if (anonymousClass5MU != null) {
            int statusCode = anonymousClass5MU.getStatusCode();
            Object obj = 1;
            Object obj2 = statusCode == 400 ? 1 : null;
            if (statusCode != 403) {
                obj = null;
            }
            if (!(obj2 == null && r2 == null)) {
                broadcastFailureType = BroadcastFailureType.InitFailureFeatureBlock;
            }
        }
        anonymousClass68O.m29162D(broadcastFailureType, new AnonymousClass5ap("API Start Broadcast", E, anonymousClass0Q6.f4287B));
        AnonymousClass0cQ.H(this, -416491436, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -2113489370);
        AnonymousClass5MU anonymousClass5MU = (AnonymousClass5MU) obj;
        int I2 = AnonymousClass0cQ.I(this, -1024519513);
        this.f72053B.f66749G = anonymousClass5MU.f62622B;
        this.f72053B.f72097M.f66682a = anonymousClass5MU.f62622B;
        this.f72053B.f72097M.m27737A(true, null);
        AnonymousClass5ao anonymousClass5ao = this.f72053B;
        if (!AnonymousClass68O.m29151K(anonymousClass5ao)) {
            anonymousClass5ao.f72107W = AnonymousClass68N.Started;
            AnonymousClass68O.m29152L(anonymousClass5ao, AnonymousClass5MI.USER_INITIATED);
            if (((Boolean) AnonymousClass0CC.GS.H(anonymousClass5ao.f66751I)).booleanValue()) {
                Context context = anonymousClass5ao.f66745C;
                AnonymousClass0Cm anonymousClass0Cm = anonymousClass5ao.f66751I;
                Handler handler = anonymousClass5ao.f72092H;
                Runnable anonymousClass5OD = new AnonymousClass5OD(context, anonymousClass5ao.f72101Q, anonymousClass0Cm, anonymousClass5ao.f72093I.f4259C, handler, new AnonymousClass67x(anonymousClass5ao));
                AnonymousClass0OR.F(handler, anonymousClass5OD, 10000, -1510040810);
                anonymousClass5ao.f72104T = anonymousClass5OD;
            }
            AnonymousClass0Sy.F(new AnonymousClass687(anonymousClass5ao));
        }
        AnonymousClass0cQ.H(this, 2030922440, I2);
        AnonymousClass0cQ.H(this, 143143054, I);
    }
}
