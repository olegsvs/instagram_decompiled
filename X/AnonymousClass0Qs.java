package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.video.videocall.intf.VideoCallSource;

/* renamed from: X.0Qs */
public final class AnonymousClass0Qs {
    /* renamed from: B */
    private final DirectThreadKey f4500B;
    /* renamed from: C */
    private final String f4501C;
    /* renamed from: D */
    private final AnonymousClass0Cm f4502D;

    public AnonymousClass0Qs(AnonymousClass0Cm anonymousClass0Cm, DirectThreadKey directThreadKey, String str) {
        this.f4502D = anonymousClass0Cm;
        this.f4500B = directThreadKey;
        this.f4501C = str;
    }

    /* renamed from: A */
    public final void m4069A(VideoCallInfo videoCallInfo, VideoCallSource videoCallSource, AnonymousClass3AL anonymousClass3AL) {
        String str = videoCallInfo.f4468C;
        DirectThreadKey directThreadKey = this.f4500B;
        if (directThreadKey == null) {
            String str2 = "Null thread key";
            AnonymousClass0Gn.m1881H("VideoCallAttachDelegate", str2);
            AnonymousClass3AL.B(anonymousClass3AL, new IllegalArgumentException(str2));
            return;
        }
        String str3;
        if (directThreadKey.f5871C != null) {
            str3 = this.f4500B.f5871C;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Null thread ID in thread key. VideoCallID=");
            stringBuilder.append(str);
            stringBuilder.append(" Expected thread ID = ");
            stringBuilder.append(this.f4501C);
            AnonymousClass0Gn.m1881H("VideoCallAttachDelegate", stringBuilder.toString());
            str3 = this.f4501C;
        }
        String str4 = videoCallSource.f4476D;
        if (videoCallSource.f4474B != AnonymousClass0Qr.DIRECT || str4 == null || str4.equals(str3)) {
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f4502D);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            AnonymousClass0GA H = anonymousClass0Pt.m3945N().m3943L("direct_v2/threads/%s/add_video_call/", str3).m3944M(AnonymousClass4hj.class).m3935D("video_call_id", str).m3939H();
            H.f2849B = new AnonymousClass1RP(this, anonymousClass3AL, str, str3);
            AnonymousClass0Ix.m2384D(H);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Surface ID and Thread ID do not match. SurfaceID=");
        stringBuilder.append(str4);
        stringBuilder.append(" ThreadID=");
        stringBuilder.append(str3);
        str2 = stringBuilder.toString();
        AnonymousClass0Gn.m1881H("VideoCallAttachDelegate", str2);
        AnonymousClass3AL.B(anonymousClass3AL, new IllegalArgumentException(str2));
    }

    /* renamed from: B */
    public static void m4068B(AnonymousClass0Qs anonymousClass0Qs, AnonymousClass4hi anonymousClass4hi) {
        AnonymousClass0Tw.m4598C(anonymousClass0Qs.f4502D).m4648t(anonymousClass0Qs.f4500B, anonymousClass4hi.f56367B, null);
    }
}
