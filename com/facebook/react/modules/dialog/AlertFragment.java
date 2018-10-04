package com.facebook.react.modules.dialog;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule.AlertFragmentListener;

public final class AlertFragment extends DialogFragment implements OnClickListener {
    private final AlertFragmentListener mListener;

    public AlertFragment() {
        this.mListener = null;
    }

    public AlertFragment(AlertFragmentListener alertFragmentListener, Bundle bundle) {
        this.mListener = alertFragmentListener;
        setArguments(bundle);
    }

    public static Dialog createDialog(Context context, Bundle bundle, OnClickListener onClickListener) {
        Builder title = new Builder(context).setTitle(bundle.getString(DialogModule.KEY_TITLE));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey(DialogModule.KEY_ITEMS)) {
            title.setItems(bundle.getCharSequenceArray(DialogModule.KEY_ITEMS), onClickListener);
        }
        return title.create();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AlertFragmentListener alertFragmentListener = this.mListener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onClick(dialogInterface, i);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return createDialog(getActivity(), getArguments(), this);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AlertFragmentListener alertFragmentListener = this.mListener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onDismiss(dialogInterface);
        }
    }
}
