package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.114 */
public final class AnonymousClass114 {
    /* renamed from: B */
    public static void m8778B(AnonymousClass0IU anonymousClass0IU) {
        AnonymousClass1Ee anonymousClass1Ee = (AnonymousClass1Ee) anonymousClass0IU.mo1454F("progressDialog");
        if (anonymousClass1Ee != null) {
            anonymousClass1Ee.m10218B();
        }
    }

    /* renamed from: C */
    public static void m8779C(Dialog dialog, boolean z) {
        ((TextView) dialog.findViewById(C0164R.id.button_blue)).setVisibility(z ? 8 : 0);
    }

    /* renamed from: D */
    public static void m8780D(Context context) {
        new AnonymousClass0Sb(context).m4375Q(C0164R.string.error).m4366H(C0164R.string.could_not_submit_flag).m4373O(C0164R.string.dismiss, null).m4361C().show();
    }

    /* renamed from: E */
    public static void m8781E(AnonymousClass0IU anonymousClass0IU) {
        new AnonymousClass2Hg().m10220D(anonymousClass0IU, "progressDialog");
    }

    /* renamed from: F */
    public static void m8782F(Context context) {
        new AnonymousClass0Sb(context).m4375Q(C0164R.string.error).m4366H(C0164R.string.request_error).m4373O(C0164R.string.dismiss, null).m4361C().show();
    }
}
