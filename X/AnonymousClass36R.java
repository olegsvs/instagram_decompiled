package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.36R */
public final class AnonymousClass36R implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass36S f37842B;

    public AnonymousClass36R(AnonymousClass36S anonymousClass36S) {
        this.f37842B = anonymousClass36S;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (AnonymousClass36S.m18524B(this.f37842B)[i].equals(this.f37842B.f37843B.getResources().getString(C0164R.string.delete_promotion))) {
            this.f37842B.f37845D.m23496A();
        } else if (this.f37842B.f37844C == AnonymousClass2Bj.ACTIVE) {
            r3 = this.f37842B.f37845D;
            new AnonymousClass0P2(r3.getContext()).V(C0164R.string.confirm_pause_boosted_post_title).K(C0164R.string.confirm_pause_boosted_post_subtitle).S(C0164R.string.ok, new AnonymousClass4Be(r3)).N(C0164R.string.cancel, null).A().show();
        } else {
            r3 = this.f37842B.f37845D;
            new AnonymousClass0P2(r3.getContext()).V(C0164R.string.confirm_resume_boosted_post_title).K(C0164R.string.confirm_resume_boosted_post_subtitle).S(C0164R.string.ok, new AnonymousClass4Bf(r3)).N(C0164R.string.cancel, null).A().show();
        }
    }
}
