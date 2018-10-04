package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.4CZ */
public final class AnonymousClass4CZ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ry f51417B;
    /* renamed from: C */
    public final /* synthetic */ Runnable f51418C;

    public AnonymousClass4CZ(AnonymousClass5Ry anonymousClass5Ry, Runnable runnable) {
        this.f51417B = anonymousClass5Ry;
        this.f51418C = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass33b.m18369K("contact", this.f51417B.f63651J, "phone_steal_dialog", AnonymousClass0db.C().G("phone_steal_dialog_option", this.f51417B.getString(C0164R.string.business_signup_continue_stealing_phone_number)), AnonymousClass0a2.I(this.f51417B.f63660S));
        if (this.f51418C != null) {
            AnonymousClass0OR.D(this.f51417B.f63652K, this.f51418C, -936335010);
        } else {
            AnonymousClass5Ry.D(this.f51417B);
        }
    }
}
