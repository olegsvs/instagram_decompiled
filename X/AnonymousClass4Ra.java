package X;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* renamed from: X.4Ra */
public final class AnonymousClass4Ra implements OnSeekBarChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Rb f54114B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5Tj f54115C;

    public AnonymousClass4Ra(AnonymousClass4Rb anonymousClass4Rb, AnonymousClass5Tj anonymousClass5Tj) {
        this.f54114B = anonymousClass4Rb;
        this.f54115C = anonymousClass5Tj;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        seekBar = this.f54115C;
        if (z) {
            seekBar.f64597B.f64599B = i;
            seekBar.f64597B.f64607J.m24250C(i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f54114B.f54118D = true;
        AnonymousClass5Tl.I(this.f54115C.f64597B);
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f54114B.f54118D = false;
        AnonymousClass5Tl.H(this.f54115C.f64597B);
    }
}
