package X;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import com.facebook.C0164R;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.1rS */
public final class AnonymousClass1rS extends DialogFragment {
    /* renamed from: B */
    public BrowserLiteFragment f23479B;

    public final Dialog onCreateDialog(Bundle bundle) {
        return new Builder(getActivity()).setTitle(C0164R.string.__external__browser_ssl_error_title).setMessage(C0164R.string.__external__browser_ssl_error_message).setPositiveButton(C0164R.string.__external__browser_ssl_error_positive_button_text, new AnonymousClass1rR(this)).create();
    }
}
