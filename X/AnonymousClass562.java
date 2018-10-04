package X;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.562 */
public final class AnonymousClass562 {
    /* renamed from: B */
    public static boolean m25719B(AnonymousClass0Cn anonymousClass0Cn, String str, AnonymousClass55n anonymousClass55n, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Ds anonymousClass2Ds, OnClickListener onClickListener, AnonymousClass2Na anonymousClass2Na) {
        OnClickListener onClickListener2 = onClickListener;
        AnonymousClass5ZN C = anonymousClass55n.m25713C(str, AnonymousClass5cD.class);
        if (C == null || !((Boolean) AnonymousClass0CC.JW.G()).booleanValue()) {
            return false;
        }
        int i;
        if (C instanceof AnonymousClass5cB) {
            i = C0164R.string.recovery_known_account_login_dialog_message_facebook;
        } else if (C instanceof AnonymousClass5cC) {
            i = C0164R.string.recovery_known_account_login_dialog_message_gmail_via_username_or_phone;
        } else {
            i = C0164R.string.recovery_known_account_login_dialog_message_one_tap;
        }
        if (onClickListener == null) {
            onClickListener2 = new AnonymousClass55x();
        }
        AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(anonymousClass0IJ.getActivity());
        anonymousClass0P2.f3974H = anonymousClass0IJ.getString(C0164R.string.log_in_as_handle, new Object[]{C.mo6066H()});
        anonymousClass0P2.K(i).H(C.mo6063E()).T(anonymousClass0IJ.getString(C0164R.string.contact_point_already_taken_login_dialog_positive_button_text, new Object[]{C.mo6066H()}), new AnonymousClass55y(anonymousClass0Cn, C, anonymousClass0IJ, anonymousClass2Na, anonymousClass2Ds)).O(anonymousClass0IJ.getString(C0164R.string.one_tap_login_text_link_text), onClickListener2).A().show();
        return true;
    }

    /* renamed from: C */
    public static void m25720C(AnonymousClass0Cn anonymousClass0Cn, int i, int i2, AnonymousClass5ZN anonymousClass5ZN, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Ds anonymousClass2Ds, AnonymousClass561 anonymousClass561, AnonymousClass2Na anonymousClass2Na) {
        AnonymousClass0IJ anonymousClass0IJ2 = anonymousClass0IJ;
        Resources resources = anonymousClass0IJ.getResources();
        View circularImageView = new CircularImageView(anonymousClass0IJ.getContext());
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.contact_point_already_taken_dialog_avatar_size);
        circularImageView.setLayoutParams(new LayoutParams(dimensionPixelSize, dimensionPixelSize));
        circularImageView.H(resources.getDimensionPixelSize(C0164R.dimen.circular_avatar_stroke_width), AnonymousClass0Ca.C(anonymousClass0IJ.getContext(), C0164R.color.avatar_stroke));
        AnonymousClass5ZN anonymousClass5ZN2 = anonymousClass5ZN;
        circularImageView.setUrl(anonymousClass5ZN.mo6063E());
        AnonymousClass563 anonymousClass563 = new AnonymousClass563(anonymousClass0IJ.getContext());
        anonymousClass563.f60079D = anonymousClass0IJ.getString(C0164R.string.contact_point_already_taken_login_dialog_title, new Object[]{anonymousClass5ZN.mo6066H()});
        anonymousClass563.f60078C = resources.getString(i);
        anonymousClass563.f60077B.J(circularImageView);
        anonymousClass563.f60077B.P(anonymousClass0IJ.getString(C0164R.string.contact_point_already_taken_login_dialog_positive_button_text, new Object[]{anonymousClass5ZN.mo6066H()}), new AnonymousClass560(anonymousClass0Cn, anonymousClass5ZN2, anonymousClass0IJ2, anonymousClass2Na, anonymousClass2Ds));
        anonymousClass563.f60077B.M(resources.getString(i2), new AnonymousClass55z(anonymousClass561));
        Dialog C = anonymousClass563.f60077B.C();
        ((TitleTextView) C.findViewById(C0164R.id.contact_point_taken_title)).setText(anonymousClass563.f60079D);
        ((TextView) C.findViewById(C0164R.id.contact_point_taken_message)).setText(anonymousClass563.f60078C);
        C.show();
    }

    /* renamed from: D */
    public static void m25721D(AnonymousClass0Cn anonymousClass0Cn, AnonymousClass5ZN anonymousClass5ZN, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Ds anonymousClass2Ds, AnonymousClass565 anonymousClass565, AnonymousClass561 anonymousClass561) {
        int i = C0164R.string.contact_point_already_taken_login_dialog_message_default;
        AnonymousClass5ZN anonymousClass5ZN2 = anonymousClass5ZN;
        if (anonymousClass5ZN instanceof AnonymousClass5cC) {
            i = anonymousClass565 == AnonymousClass565.Email ? C0164R.string.recovery_known_account_login_dialog_message_gmail_via_email : C0164R.string.recovery_known_account_login_dialog_message_gmail_via_username_or_phone;
        } else if (anonymousClass5ZN instanceof AnonymousClass5cD) {
            i = C0164R.string.recovery_known_account_login_dialog_message_one_tap;
        } else if (anonymousClass5ZN instanceof AnonymousClass5cB) {
            i = C0164R.string.recovery_known_account_login_dialog_message_facebook;
        }
        AnonymousClass562.m25720C(anonymousClass0Cn, i, anonymousClass565 == AnonymousClass565.Email ? C0164R.string.recovery_known_account_login_dialog_send_email : C0164R.string.recovery_known_account_login_dialog_send_sms, anonymousClass5ZN2, anonymousClass0IJ, anonymousClass2Ds, anonymousClass561, AnonymousClass2Na.EMAIL_STEP);
    }
}
