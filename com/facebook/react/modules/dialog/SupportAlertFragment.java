package com.facebook.react.modules.dialog;

import X.AnonymousClass1Ee;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule.AlertFragmentListener;

public final class SupportAlertFragment extends AnonymousClass1Ee implements OnClickListener {
    private final AlertFragmentListener mListener;

    public SupportAlertFragment() {
        this.mListener = null;
    }

    public SupportAlertFragment(AlertFragmentListener alertFragmentListener, Bundle bundle) {
        this.mListener = alertFragmentListener;
        setArguments(bundle);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AlertFragmentListener alertFragmentListener = this.mListener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onClick(dialogInterface, i);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return AlertFragment.createDialog(getActivity(), getArguments(), this);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AlertFragmentListener alertFragmentListener = this.mListener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onDismiss(dialogInterface);
        }
    }
}
