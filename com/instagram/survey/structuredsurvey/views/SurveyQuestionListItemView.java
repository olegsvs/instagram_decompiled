package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass41w;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0164R;

public class SurveyQuestionListItemView extends AnonymousClass3hS {
    /* renamed from: B */
    private TextView f48586B;
    /* renamed from: C */
    private TextView f48587C;

    public SurveyQuestionListItemView(Context context) {
        super(context);
        m22181B();
    }

    public SurveyQuestionListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22181B();
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        AnonymousClass41w anonymousClass41w = (AnonymousClass41w) anonymousClass3hR;
        if (TextUtils.isEmpty(anonymousClass41w.f48575C)) {
            this.f48586B.setVisibility(8);
        } else {
            this.f48586B.setText(anonymousClass41w.f48575C);
        }
        this.f48587C.setText(anonymousClass41w.f48574B);
    }

    /* renamed from: B */
    private void m22181B() {
        setContentView(C0164R.layout.survey_question_view);
        this.f48586B = (TextView) findViewById(C0164R.id.survey_question_number);
        this.f48587C = (TextView) findViewById(C0164R.id.survey_question);
    }
}
