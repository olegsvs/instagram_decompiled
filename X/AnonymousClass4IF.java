package X;

import android.hardware.Camera.Size;
import com.facebook.C0164R;

/* renamed from: X.4IF */
public final class AnonymousClass4IF extends AnonymousClass3sw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SU f52447B;

    /* renamed from: A */
    public final void mo5128A(Exception exception) {
    }

    public AnonymousClass4IF(AnonymousClass5SU anonymousClass5SU) {
        this.f52447B = anonymousClass5SU;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo5129B(Object obj) {
        CharSequence string;
        Size size = (Size) obj;
        this.f52447B.f63952E.animate().rotationBy(-180.0f).start();
        if (this.f52447B.f63949B.sW()) {
            string = this.f52447B.getResources().getString(C0164R.string.switch_back_camera);
        } else {
            string = this.f52447B.getResources().getString(C0164R.string.switch_front_camera);
        }
        this.f52447B.f63952E.setContentDescription(string);
    }
}
