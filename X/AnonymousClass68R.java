package X;

import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.68R */
public final class AnonymousClass68R implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68i f72137B;

    public AnonymousClass68R(AnonymousClass68i anonymousClass68i) {
        this.f72137B = anonymousClass68i;
    }

    public final void run() {
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.f72137B.f72163G;
        AnonymousClass6GF anonymousClass6GF = igLiveWithGuestFragment.f73571Q;
        String str = igLiveWithGuestFragment.f73558D;
        String str2 = igLiveWithGuestFragment.f73569O;
        boolean sW = igLiveWithGuestFragment.f73560F.sW();
        anonymousClass6GF.f73642E.m29753S(str, str2, 3000, false);
        anonymousClass6GF.f73639B = str;
        anonymousClass6GF.f73642E.m29756V(sW);
        anonymousClass6GF.f73640C.m26391A(str);
        igLiveWithGuestFragment.f73563I = true;
        igLiveWithGuestFragment.f73564J.m27777B(false);
    }
}
