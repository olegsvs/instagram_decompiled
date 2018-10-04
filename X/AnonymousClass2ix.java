package X;

import android.view.Surface;

/* renamed from: X.2ix */
public final class AnonymousClass2ix implements AnonymousClass1rn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3rt f32958B;

    public AnonymousClass2ix(AnonymousClass3rt anonymousClass3rt) {
        this.f32958B = anonymousClass3rt;
    }

    public final void onSuccess() {
        AnonymousClass2hV anonymousClass2hV = (AnonymousClass2hV) this.f32958B.f45520L.get();
        if (anonymousClass2hV != null) {
            AnonymousClass3rv anonymousClass3rv;
            Surface surface;
            AnonymousClass3rt anonymousClass3rt = this.f32958B;
            if (anonymousClass3rt.f45517I != null) {
                anonymousClass3rv = this.f32958B.f45517I.f45484R;
                if (anonymousClass3rv == null) {
                    surface = null;
                } else {
                    surface = anonymousClass3rv.f45563C;
                }
            } else {
                surface = null;
            }
            anonymousClass3rt.f45522N = surface;
            anonymousClass3rt = this.f32958B;
            if (anonymousClass3rt.f45517I != null) {
                anonymousClass3rv = this.f32958B.f45517I.f45477K;
                if (anonymousClass3rv == null) {
                    surface = null;
                } else {
                    surface = anonymousClass3rv.f45563C;
                }
            } else {
                surface = null;
            }
            anonymousClass3rt.f45524P = surface;
            if (this.f32958B.f45522N != null) {
                if (!this.f32958B.f45517I.f45482P || this.f32958B.f45524P != null) {
                    AnonymousClass3rt anonymousClass3rt2 = this.f32958B;
                    anonymousClass3rt2.f45521M = new AnonymousClass2f1(anonymousClass3rt2.f45522N, this.f32958B.f45534Z.f23484C, this.f32958B.f45534Z.f23483B);
                    anonymousClass2hV.f32567B.m16941A(this.f32958B.f45521M);
                    if (this.f32958B.f45524P != null) {
                        anonymousClass2hV.f32567B.m16941A(this.f32958B.f45521M);
                    }
                    this.f32958B.f45528T = AnonymousClass2jF.RECORDING;
                    this.f32958B.f45530V.Nf();
                    AnonymousClass3rt.m20976G(this.f32958B, 2);
                    AnonymousClass3rt.m20978I(this.f32958B, "start_recording_video_finished", null);
                    AnonymousClass3rt.m20972C(this.f32958B);
                    return;
                }
            }
            tk(new IllegalStateException("Recording surface not available. Make sure prepare is called"));
        }
    }

    public final void tk(Throwable th) {
        this.f32958B.f45530V.Hf(new AnonymousClass1rY("Failed to start video recording", th));
        AnonymousClass3rt.m20975F(this.f32958B, 2);
        AnonymousClass3rt.m20977H(this.f32958B, "start_recording_video_failed", th, "high");
        AnonymousClass3rt.m20971B(this.f32958B);
    }
}
