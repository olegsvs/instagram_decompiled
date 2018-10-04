package X;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.61Z */
public final class AnonymousClass61Z implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0HV f70995B;

    public AnonymousClass61Z(AnonymousClass61a anonymousClass61a, AnonymousClass0HV anonymousClass0HV) {
        this.f70995B = anonymousClass0HV;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            AnonymousClass2Go.B("use_less_data_switched_on");
            this.f70995B.jA(false);
            return;
        }
        AnonymousClass2Go.B("use_less_data_switched_off");
        this.f70995B.jA(true);
    }
}
