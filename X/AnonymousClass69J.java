package X;

import android.text.TextUtils;
import com.instagram.video.live.ui.streaming.IgLiveWithInviteFragment;
import java.util.Collection;

/* renamed from: X.69J */
public final class AnonymousClass69J extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ IgLiveWithInviteFragment f72296B;

    public AnonymousClass69J(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        this.f72296B = igLiveWithInviteFragment;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1406339710);
        AnonymousClass0OR.G(this.f72296B.f73722G, this.f72296B.f73720E, 913709999);
        AnonymousClass0OR.F(this.f72296B.f73722G, this.f72296B.f73720E, IgLiveWithInviteFragment.f73715S, -26484298);
        AnonymousClass0cQ.H(this, 85605120, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 907843126);
        AnonymousClass3nW anonymousClass3nW = (AnonymousClass3nW) obj;
        int I2 = AnonymousClass0cQ.I(this, -149746411);
        if (!anonymousClass3nW.VN().isEmpty()) {
            this.f72296B.f73727L = false;
        }
        AnonymousClass69B D = IgLiveWithInviteFragment.m29772D(this.f72296B);
        Collection VN = anonymousClass3nW.VN();
        D.f72272E.clear();
        D.f72272E.addAll(VN);
        AnonymousClass69B.m29220E(D);
        if (TextUtils.isEmpty(this.f72296B.f73726K.LQ())) {
            IgLiveWithInviteFragment.m29775G(this.f72296B);
        }
        this.f72296B.f73724I = anonymousClass3nW.VN();
        AnonymousClass0cQ.H(this, 1208664332, I2);
        AnonymousClass0cQ.H(this, 801303929, I);
    }
}
