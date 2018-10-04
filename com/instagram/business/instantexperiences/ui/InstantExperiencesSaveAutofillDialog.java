package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass5hF;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0164R;

public class InstantExperiencesSaveAutofillDialog extends AnonymousClass5hF {
    public InstantExperiencesSaveAutofillDialog(Context context) {
        super(context);
    }

    public InstantExperiencesSaveAutofillDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((TextView) findViewById(C0164R.id.instant_experiences_confirm_dialog_title)).setText(getResources().getString(C0164R.string.autofill_save_dialog_request_string));
        this.f68194B.setText(getResources().getString(C0164R.string.autofill_save_dialog_accept_button_text));
        this.f68196D.setText(getResources().getString(C0164R.string.autofill_save_dialog_decline_button_text));
    }
}
