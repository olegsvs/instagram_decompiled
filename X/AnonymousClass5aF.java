package X;

import com.instagram.ui.widget.countdowntimer.CountdownTimerView;

/* renamed from: X.5aF */
public final class AnonymousClass5aF implements AnonymousClass5Jb {
    /* renamed from: B */
    public final /* synthetic */ CountdownTimerView f66559B;

    public AnonymousClass5aF(CountdownTimerView countdownTimerView) {
        this.f66559B = countdownTimerView;
    }

    public final void UDA(int i) {
        this.f66559B.f62006F.setText(String.valueOf(i));
        this.f66559B.f62006F.animate().alpha(1.0f).setDuration(400).withEndAction(new AnonymousClass5JB(this));
    }

    public final void onFinish() {
        AnonymousClass5Ss anonymousClass5Ss = this.f66559B.f62002B;
        anonymousClass5Ss.f64119B.f7608V = false;
        anonymousClass5Ss.f64120C.run();
        this.f66559B.f62004D.H();
        this.f66559B.f62004D.setVisibility(8);
    }
}
