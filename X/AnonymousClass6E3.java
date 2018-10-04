package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.proxygen.TraceEventType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.video.videocall.intf.VideoCallSource;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.6E3 */
public final class AnonymousClass6E3 implements AnonymousClass5k0 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0dC f73069B;

    public AnonymousClass6E3(AnonymousClass0dC anonymousClass0dC) {
        this.f73069B = anonymousClass0dC;
    }

    public final boolean oG(BaseFragmentActivity baseFragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        Bundle bundle2 = bundle;
        Context context = baseFragmentActivity;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        if (bundle2.getBoolean("missed_call")) {
            AnonymousClass0Cm G = AnonymousClass0Ce.G(bundle2);
            String string = bundle2.getString("surface_id");
            bundle2 = new Bundle();
            bundle2.putString("id", string);
            bundle2.putString("current_user_id", G.f1759C);
            return this.f73069B.f7325B.A(context, anonymousClass0Cm2, bundle2);
        }
        VideoCallInfo videoCallInfo = new VideoCallInfo(bundle2.getString("vc_id"), bundle2.getString("esi"));
        String string2 = bundle2.getString("surface_id");
        VideoCallSource videoCallSource = new VideoCallSource(AnonymousClass0Qr.PUSH_NOTIFICATION, AnonymousClass0RX.B(bundle2.getString("surface")), string2);
        String string3 = bundle2.getString("caller");
        Object string4 = bundle2.getString("group_details");
        VideoCallAudience videoCallAudience = new VideoCallAudience(new ArrayList(), TextUtils.isEmpty(string4) ^ 1, string4, string3, JsonProperty.USE_DEFAULT_NAME);
        AnonymousClass0JS.f2919B.F(context.getApplicationContext()).A(AnonymousClass0Ql.PushLogger).rZ(bundle2, anonymousClass0Cm2.f1759C);
        if (!AnonymousClass0EF.I(context) && AnonymousClass0EF.J(context) && AnonymousClass0FZ.B().B() && ((Boolean) AnonymousClass0CC.Hj.H(anonymousClass0Cm2)).booleanValue() && AnonymousClass0EF.C(context) >= ((Integer) AnonymousClass0CC.Ij.H(anonymousClass0Cm2)).intValue()) {
            AnonymousClass1SX.C(context, anonymousClass0Cm2.f1759C, string2, null, null, UUID.randomUUID().toString(), TraceEventType.Push, null, null);
            AnonymousClass0JS.f2919B.D(anonymousClass0Cm2.f1759C, string2);
            return true;
        }
        AnonymousClass0Iz.f2854L.M(context, "button", null);
        AnonymousClass0JS.f2919B.L(context, anonymousClass0Cm2.f1759C, videoCallInfo, videoCallAudience, videoCallSource, null);
        return true;
    }
}
