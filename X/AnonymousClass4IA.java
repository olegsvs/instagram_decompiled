package X;

import com.instagram.creation.capture.MediaCaptureFragment;

/* renamed from: X.4IA */
public final class AnonymousClass4IA extends AnonymousClass3sw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SU f52442B;

    public AnonymousClass4IA(AnonymousClass5SU anonymousClass5SU) {
        this.f52442B = anonymousClass5SU;
    }

    /* renamed from: A */
    public final void mo5128A(Exception exception) {
        AnonymousClass0Dc.G("InAppCaptureView", "stop video encountered error", exception);
        this.f52442B.f63973Z.m23790C();
        this.f52442B.f63968U = false;
        if (this.f52442B.f63954G < this.f52442B.f63973Z.f52519E.f47998B.m19271D()) {
            this.f52442B.f63973Z.f52519E.m21885B();
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo5129B(Object obj) {
        String str = (String) obj;
        this.f52442B.f63973Z.m23790C();
        if (this.f52442B.f63967T) {
            this.f52442B.f63967T = false;
            MediaCaptureFragment mediaCaptureFragment = this.f52442B.f63960M;
            if (mediaCaptureFragment.mCaptureProvider.getCaptureMode() == AnonymousClass4HN.CAMCORDER) {
                mediaCaptureFragment.mCaptureProvider.yHA();
                mediaCaptureFragment.f64006E.m23852A();
            }
        }
        if (this.f52442B.f63965R) {
            AnonymousClass5SU anonymousClass5SU = this.f52442B;
            anonymousClass5SU.f63965R = false;
            anonymousClass5SU.yHA();
        }
    }
}
