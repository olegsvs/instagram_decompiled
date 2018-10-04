package X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.List;

/* renamed from: X.68V */
public final class AnonymousClass68V extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68i f72141B;

    public AnonymousClass68V(AnonymousClass68i anonymousClass68i) {
        this.f72141B = anonymousClass68i;
    }

    /* renamed from: A */
    public final void m29182A(Exception exception) {
        this.f72141B.m29201D(new AnonymousClass5Nj(BroadcastFailureType.InitFailure, "ApiStartBroadcast", exception.getMessage()));
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m29183B(Object obj) {
        List list = (List) obj;
    }
}
