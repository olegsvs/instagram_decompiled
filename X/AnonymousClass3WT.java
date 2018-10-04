package X;

import android.content.SharedPreferences;
import com.facebook.C0164R;

/* renamed from: X.3WT */
public final class AnonymousClass3WT {
    /* renamed from: B */
    public static boolean m19807B() {
        SharedPreferences B = AnonymousClass0Mv.B("ExitRegistrationDialogHelper");
        SharedPreferences sharedPreferences = B.f3484D;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(B);
        }
        B.f3484D = null;
        return B.getBoolean("has_user_confirmed_dialog", false);
    }

    /* renamed from: C */
    public static void m19808C(boolean z) {
        SharedPreferences B = AnonymousClass0Mv.B("ExitRegistrationDialogHelper");
        SharedPreferences sharedPreferences = B.f3484D;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(B);
        }
        B.f3484D = null;
        B.edit().putBoolean("has_user_confirmed_dialog", z).apply();
    }

    /* renamed from: D */
    public static void m19809D(AnonymousClass0IL anonymousClass0IL, AnonymousClass2Na anonymousClass2Na, AnonymousClass0Oh anonymousClass0Oh, AnonymousClass3WS anonymousClass3WS) {
        Object obj = (anonymousClass2Na == AnonymousClass2Na.EMAIL_STEP || anonymousClass2Na == AnonymousClass2Na.PHONE_STEP) ? null : 1;
        new AnonymousClass0Sb(anonymousClass0IL.getActivity()).Q(obj != null ? C0164R.string.reg_back_dialog_cancel_title : C0164R.string.reg_back_dialog_discard_title).H(obj != null ? C0164R.string.reg_back_dialog_cancel_content : C0164R.string.reg_back_dialog_discard_content).O(obj != null ? C0164R.string.reg_back_dialog_option_go_back : C0164R.string.reg_back_dialog_option_discard, new AnonymousClass3WR(anonymousClass2Na, anonymousClass0Oh, anonymousClass0IL, anonymousClass3WS)).L(C0164R.string.cancel, null).C().show();
    }
}
