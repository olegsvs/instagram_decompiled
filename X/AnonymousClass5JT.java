package X;

import android.os.SystemClock;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.5JT */
public final class AnonymousClass5JT extends AnonymousClass1wg {
    /* renamed from: B */
    public final /* synthetic */ ShutterButton f62087B;

    public AnonymousClass5JT(ShutterButton shutterButton) {
        this.f62087B = shutterButton;
    }

    /* renamed from: A */
    public final void m26229A(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f62087B.f62115R;
        if (elapsedRealtime < this.f62087B.f62105H) {
            this.f62087B.setVideoRecordingProgress(((float) elapsedRealtime) / ((float) this.f62087B.f62105H));
            this.f62087B.f62100C.A(this.f62087B.f62114Q);
        } else if (this.f62087B.f62104G <= 0 || this.f62087B.f62101D >= this.f62087B.f62104G - 1) {
            this.f62087B.m26242D();
        } else {
            this.f62087B.setVideoRecordingProgress(((float) elapsedRealtime) / ((float) this.f62087B.f62105H));
            this.f62087B.f62100C.A(this.f62087B.f62114Q);
            ShutterButton shutterButton = this.f62087B;
            shutterButton.f62101D++;
            this.f62087B.f62115R = SystemClock.elapsedRealtime();
            this.f62087B.f62113P = 0.0f;
            if (this.f62087B.f62107J != null) {
                AnonymousClass5T9 anonymousClass5T9 = this.f62087B.f62107J.f64111B.f7611Y.f7385Y;
                anonymousClass5T9.f64317I.m26913C(anonymousClass5T9.f64310B.A(anonymousClass5T9.f64318J, anonymousClass5T9.f64316H));
            }
        }
    }
}
