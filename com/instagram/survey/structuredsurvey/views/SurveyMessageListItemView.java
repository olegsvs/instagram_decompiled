package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass41v;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0164R;

public class SurveyMessageListItemView extends AnonymousClass3hS {
    /* renamed from: B */
    private TextView f48585B;

    public SurveyMessageListItemView(Context context) {
        super(context);
        m22179B();
    }

    public SurveyMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22179B();
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        this.f48585B.setText(((AnonymousClass41v) anonymousClass3hR).f48573B);
    }

    /* renamed from: B */
    private void m22179B() {
        setContentView(C0164R.layout.survey_message_view);
        this.f48585B = (TextView) findViewById(C0164R.id.survey_message_text);
    }
}
