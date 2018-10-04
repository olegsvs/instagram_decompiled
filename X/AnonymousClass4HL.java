package X;

import android.content.Context;
import com.instagram.creation.capture.MediaCaptureFragment;

/* renamed from: X.4HL */
public final class AnonymousClass4HL extends AnonymousClass3HW {
    /* renamed from: B */
    public float f52318B = -1.0f;
    /* renamed from: C */
    private MediaCaptureFragment f52319C;
    /* renamed from: D */
    private int f52320D = -1;
    /* renamed from: E */
    private int f52321E = 0;

    public AnonymousClass4HL(MediaCaptureFragment mediaCaptureFragment, Context context) {
        super(context);
        this.f52319C = mediaCaptureFragment;
    }

    /* renamed from: C */
    public final void mo5592C(float f) {
        if (f != -1.0f) {
            if (this.f52319C.b() != null) {
                float f2;
                int E = AnonymousClass2MV.m15217E(Math.round(f), this.f52320D);
                this.f52320D = E;
                this.f52318B = f - ((float) E);
                while (true) {
                    f2 = this.f52318B;
                    if (f2 <= 180.0f) {
                        break;
                    }
                    this.f52318B = f2 - 360.0f;
                }
                while (true) {
                    f2 = this.f52318B;
                    if (f2 >= -180.0f) {
                        break;
                    }
                    this.f52318B = f2 + 360.0f;
                }
                int C = this.f52320D + AnonymousClass2MV.m15215C(this.f52319C.b());
                if (this.f52321E != C) {
                    this.f52321E = C;
                    this.f52319C.d(this.f52321E);
                }
                return;
            }
        }
        this.f52318B = 0.0f;
    }
}
