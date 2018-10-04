package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.1VY */
public final class AnonymousClass1VY extends AnonymousClass1Pn {
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        AnonymousClass0Cn E = AnonymousClass0Ce.m948E(arguments);
        CharSequence string = arguments.getString("feedback_message");
        String string2 = arguments.getString("feedback_title");
        Object string3 = arguments.getString("feedback_url");
        bundle = arguments.getString("feedback_appeal_label");
        String string4 = arguments.getString("feedback_action");
        String string5 = arguments.getString("feedback_ignore_label");
        AnonymousClass0Sb I = new AnonymousClass0Sb(getActivity()).m4367I(string);
        if (string2 != null) {
            I.m4376R(string2);
        }
        if (!(TextUtils.isEmpty(string3) || TextUtils.isEmpty(bundle))) {
            I.m4374P(bundle, new AnonymousClass3Od(r5, string4, E, string3, bundle));
        }
        if (TextUtils.isEmpty(string5)) {
            string5 = getString(C0164R.string.dismiss);
        }
        return I.m4371M(string5, null).m4361C();
    }
}
