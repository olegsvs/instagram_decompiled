package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.3Tc */
public final class AnonymousClass3Tc {
    /* renamed from: B */
    public static void m19714B(Context context, int i) {
        String string;
        if (((int) Math.ceil((double) (((float) i) / 60.0f))) > 1) {
            string = context.getString(C0164R.string.sms_resend_dialog_minutes_body, new Object[]{Integer.valueOf((int) Math.ceil((double) (((float) i) / 60.0f)))});
        } else {
            string = context.getString(C0164R.string.sms_resend_dialog_seconds_body, new Object[]{Integer.valueOf(i)});
        }
        AnonymousClass3nj.m20678B(context, context.getString(C0164R.string.sms_resend_dialog_title), string);
    }
}
