package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.6G6 */
public final class AnonymousClass6G6 implements AnonymousClass66N {
    /* renamed from: B */
    public final /* synthetic */ IgLiveWithGuestFragment f73555B;

    public AnonymousClass6G6(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.f73555B = igLiveWithGuestFragment;
    }

    public final void Rt(AnonymousClass64k anonymousClass64k) {
        if (anonymousClass64k.f71536B.equals(this.f73555B.f73575U.f1759C)) {
            IgLiveWithGuestFragment igLiveWithGuestFragment = this.f73555B;
            if (anonymousClass64k.f71537C == AnonymousClass1R4.DISCONNECTED) {
                igLiveWithGuestFragment.f73568N.m28994C(AnonymousClass66H.BROADCASTER_INITIATED, JsonProperty.USE_DEFAULT_NAME);
                igLiveWithGuestFragment.m29688b(false);
            } else if (anonymousClass64k.f71537C == AnonymousClass1R4.DISMISSED) {
                igLiveWithGuestFragment.f73568N.m28994C(AnonymousClass66H.BROADCASTER_INITIATED, JsonProperty.USE_DEFAULT_NAME);
                AnonymousClass68i anonymousClass68i = igLiveWithGuestFragment.f73574T;
                if (anonymousClass68i != null) {
                    anonymousClass68i.m29200C();
                }
            }
            if (anonymousClass64k.f71537C == AnonymousClass1R4.CONNECTED) {
                AnonymousClass66J anonymousClass66J = igLiveWithGuestFragment.f73568N;
                if (anonymousClass66J.f71776I == AnonymousClass66G.ATTEMPT) {
                    AnonymousClass5MQ.m26328C(AnonymousClass66J.m28986C(anonymousClass66J, AnonymousClass66I.STARTED), anonymousClass66J.f71770C, anonymousClass66J.f71773F).R();
                    anonymousClass66J.f71776I = AnonymousClass66G.STARTED;
                } else {
                    AnonymousClass66J.m28988E(anonymousClass66J, AnonymousClass66G.ATTEMPT, "starting broadcast");
                }
                AnonymousClass66J anonymousClass66J2 = igLiveWithGuestFragment.f73568N;
                anonymousClass66J2.f71782O = true;
                anonymousClass66J2.m28996E();
            }
        }
    }
}
