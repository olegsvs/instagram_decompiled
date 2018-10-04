package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.5Kn */
public final class AnonymousClass5Kn implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Id f62334B;
    /* renamed from: C */
    public final /* synthetic */ String f62335C;

    public AnonymousClass5Kn(AnonymousClass0Id anonymousClass0Id, String str) {
        this.f62334B = anonymousClass0Id;
        this.f62335C = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (AnonymousClass0Id.F(this.f62334B)) {
            AnonymousClass0Fr.ContactListEmptyStatePrivacyPolicyDialogLearnMoreTapped.C(this.f62334B.f2807N).R();
        }
        Context context = this.f62334B.getContext();
        String str = this.f62334B.f2809P.f1759C;
        AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su("http://help.instagram.com/227486307449481");
        anonymousClass0Su.f5039M = this.f62335C;
        SimpleWebViewActivity.C(context, str, anonymousClass0Su.A());
        dialogInterface.dismiss();
    }
}
