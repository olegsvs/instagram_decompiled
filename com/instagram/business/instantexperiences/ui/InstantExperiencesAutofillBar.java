package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass5h1;
import X.AnonymousClass5h2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import java.util.List;

public class InstantExperiencesAutofillBar extends RelativeLayout {
    public InstantExperiencesAutofillBar(Context context) {
        super(context);
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m28263A(List list, AnonymousClass5h2 anonymousClass5h2) {
        LinearLayout linearLayout = (LinearLayout) findViewById(C0164R.id.autofill_bar_container);
        linearLayout.removeAllViews();
        for (FbAutofillData fbAutofillData : list) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) fbAutofillData;
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(getContext()).inflate(C0164R.layout.instant_experiences_browser_autofill_bar_list_entry, null, false);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 20, 0);
            linearLayout2.setLayoutParams(layoutParams);
            TextView textView = (TextView) linearLayout2.findViewById(C0164R.id.autofill_bar_list_entry_text);
            textView.setText(browserExtensionsAutofillData.mo6777D());
            setAutofillSelectedOnClickListener(textView, anonymousClass5h2, browserExtensionsAutofillData);
            linearLayout.addView(linearLayout2);
        }
    }

    private void setAutofillSelectedOnClickListener(View view, AnonymousClass5h2 anonymousClass5h2, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        view.setOnClickListener(new AnonymousClass5h1(this, anonymousClass5h2, browserExtensionsAutofillData));
    }
}
