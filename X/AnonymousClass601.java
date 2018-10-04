package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.601 */
public final class AnonymousClass601 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6F8 f70750B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f70751C;

    public AnonymousClass601(AnonymousClass6F8 anonymousClass6F8, AnonymousClass0Ci anonymousClass0Ci) {
        this.f70750B = anonymousClass6F8;
        this.f70751C = anonymousClass0Ci;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        i = this.f70750B;
        dialogInterface = this.f70751C;
        AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(i.f73263C);
        anonymousClass0P2.f3974H = i.f73263C.getString(C0164R.string.school_user_report_confirm_title, new Object[]{dialogInterface.uT()});
        anonymousClass0P2.K(C0164R.string.school_user_report_confirm_message).S(C0164R.string.yes, new AnonymousClass602(i, dialogInterface)).N(C0164R.string.cancel, null).F(true).A().show();
    }
}
