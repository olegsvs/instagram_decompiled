package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.1ZA */
public final class AnonymousClass1ZA implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass13x f20154B;

    public AnonymousClass1ZA(AnonymousClass13x anonymousClass13x) {
        this.f20154B = anonymousClass13x;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f20154B.f13790B.f3962C.f3952F != null) {
            AnonymousClass5Qd.B("ig_ts_reminder_dialog_ok_tap", this.f20154B.f13790B.f3962C.f3952F).m3310R();
        }
        dialogInterface.dismiss();
    }
}
