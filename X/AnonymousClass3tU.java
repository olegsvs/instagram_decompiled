package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* renamed from: X.3tU */
public final class AnonymousClass3tU implements AnonymousClass2uU {
    /* renamed from: B */
    public final /* synthetic */ HeroExoPlayer2 f46076B;

    public final void Gu(int i) {
    }

    public final void IEA(TrackGroupArray trackGroupArray, AnonymousClass2y5 anonymousClass2y5) {
    }

    public final void Lq(boolean z) {
    }

    public final void Nz() {
    }

    public final void YDA(AnonymousClass2ue anonymousClass2ue, Object obj, int i) {
    }

    public final void pt(AnonymousClass2uT anonymousClass2uT) {
    }

    public AnonymousClass3tU(HeroExoPlayer2 heroExoPlayer2) {
        this.f46076B = heroExoPlayer2;
    }

    public final void st(AnonymousClass2uC anonymousClass2uC) {
        for (AnonymousClass2pO rt : this.f46076B.f46077B) {
            rt.rt(new AnonymousClass2qE(anonymousClass2uC.getMessage(), anonymousClass2uC.getCause()));
        }
    }

    public final void tt(boolean z, int i) {
        for (AnonymousClass2pO tt : this.f46076B.f46077B) {
            tt.tt(z, HeroExoPlayer2.m21178B(i));
        }
    }
}
