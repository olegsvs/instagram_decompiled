package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.3NQ */
public final class AnonymousClass3NQ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3NR f40628B;

    public AnonymousClass3NQ(AnonymousClass3NR anonymousClass3NR) {
        this.f40628B = anonymousClass3NR;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Object obj = AnonymousClass3NR.m19494B(this.f40628B)[i];
        if (this.f40628B.f40629B.getString(C0164R.string.sponsored_label_dialog_title).equals(obj)) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f40628B.f40629B);
            anonymousClass0IZ.f2754D = AnonymousClass0IY.B().A();
            anonymousClass0IZ.B();
        } else if (this.f40628B.f40629B.getString(C0164R.string.hide_survey).equals(obj)) {
            r3 = this.f40628B.f40631D;
            r3.f19278C.f9931B = AnonymousClass0mv.HIDE_THIS;
            AnonymousClass0jA.C(r3.f19277B, r3.f19279D, r3.f19278C);
            AnonymousClass0mx.C(this.f40628B.f40632E, this.f40628B.f40630C, false);
        } else if (this.f40628B.f40629B.getString(C0164R.string.hide_all_sponsored_poll_survey).equals(obj)) {
            r3 = this.f40628B.f40631D;
            r3.f19278C.f9931B = AnonymousClass0mv.HIDE_ALL_SPONSORED_POLLS;
            AnonymousClass0jA.C(r3.f19277B, r3.f19279D, r3.f19278C);
            AnonymousClass0mx.C(this.f40628B.f40632E, this.f40628B.f40630C, true);
        }
    }
}
