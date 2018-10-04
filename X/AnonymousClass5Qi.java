package X;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;

/* renamed from: X.5Qi */
public final class AnonymousClass5Qi implements OnValueChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Qm f63308B;

    public AnonymousClass5Qi(AnonymousClass5Qm anonymousClass5Qm) {
        this.f63308B = anonymousClass5Qm;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.f63308B.f63315C = i2;
        AnonymousClass5Qm.m26482B(this.f63308B);
    }
}
