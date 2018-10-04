package X;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.os.Bundle;

/* renamed from: X.1rQ */
public final class AnonymousClass1rQ extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        bundle = new ProgressDialog(getActivity());
        bundle.setTitle("Rage Shake");
        bundle.setMessage("Preparing debug information...");
        bundle.setIndeterminate(true);
        return bundle;
    }
}
