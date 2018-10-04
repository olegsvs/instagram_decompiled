package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass41x;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.C0164R;

public class SurveyRadioListItemView extends AnonymousClass3hS implements Checkable {
    /* renamed from: B */
    public boolean f48588B;
    /* renamed from: C */
    public RadioButton f48589C;
    /* renamed from: D */
    public TextView f48590D;

    public SurveyRadioListItemView(Context context) {
        super(context);
        m22184B();
    }

    public SurveyRadioListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22184B();
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        this.f43431B = anonymousClass3hR;
        this.f48590D.setText(((AnonymousClass41x) anonymousClass3hR).VI().f43399B);
    }

    /* renamed from: B */
    public final void m22184B() {
        setContentView(C0164R.layout.survey_radio_view);
        this.f48590D = (TextView) findViewById(C0164R.id.survey_radio_text);
        this.f48589C = (RadioButton) findViewById(C0164R.id.survey_radio_button);
    }

    public final boolean isChecked() {
        return this.f48588B;
    }

    public void setChecked(boolean z) {
        this.f48588B = z;
        this.f48589C.setChecked(this.f48588B);
        ((AnonymousClass41x) this.f43431B).f48577C = Boolean.valueOf(this.f48588B).booleanValue();
    }

    public final void toggle() {
        setChecked(this.f48588B ^ 1);
    }
}
