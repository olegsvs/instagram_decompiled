package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass41s;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;
import com.facebook.C0164R;

public class SurveyCheckboxListItemView extends AnonymousClass3hS implements Checkable {
    /* renamed from: B */
    private boolean f48579B;
    /* renamed from: C */
    private CheckBox f48580C;
    /* renamed from: D */
    private TextView f48581D;

    public SurveyCheckboxListItemView(Context context) {
        super(context);
        m22173B();
    }

    public SurveyCheckboxListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22173B();
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        this.f43431B = anonymousClass3hR;
        this.f48581D.setText(((AnonymousClass41s) anonymousClass3hR).VI().f43399B);
    }

    /* renamed from: B */
    private void m22173B() {
        setContentView(C0164R.layout.survey_checkbox_view);
        this.f48581D = (TextView) findViewById(C0164R.id.survey_checkbox_text);
        this.f48580C = (CheckBox) findViewById(C0164R.id.survey_checkbox);
    }

    public final boolean isChecked() {
        return this.f48579B;
    }

    public void setChecked(boolean z) {
        this.f48579B = z;
        this.f48580C.setChecked(this.f48579B);
        ((AnonymousClass41s) this.f43431B).f48568B = Boolean.valueOf(this.f48579B).booleanValue();
    }

    public final void toggle() {
        setChecked(this.f48579B ^ 1);
    }
}
