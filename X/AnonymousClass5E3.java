package X;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5E3 */
public final class AnonymousClass5E3 {
    /* renamed from: B */
    public static void m26000B(Activity activity, AnonymousClass0Cm anonymousClass0Cm, OnClickListener onClickListener) {
        new AnonymousClass0Sb(activity).R(activity.getString(C0164R.string.no_country_selection_dialog_title)).I(activity.getString(C0164R.string.no_country_selection_dialog_subtitle)).L(C0164R.string.ok, onClickListener).C().show();
    }
}
