package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass41u;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0164R;

public class SurveyImageBlockListItemView extends AnonymousClass3hS {
    /* renamed from: B */
    private TextView f48583B;
    /* renamed from: C */
    private TextView f48584C;

    public SurveyImageBlockListItemView(Context context) {
        super(context);
        m22177B();
    }

    public SurveyImageBlockListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22177B();
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        AnonymousClass41u anonymousClass41u = (AnonymousClass41u) anonymousClass3hR;
        this.f48584C.setText(anonymousClass41u.f48572C);
        this.f48583B.setText(anonymousClass41u.f48571B);
    }

    /* renamed from: B */
    private void m22177B() {
        setContentView(C0164R.layout.survey_imageblock_view);
        this.f48584C = (TextView) findViewById(C0164R.id.survey_imageblock_text);
        this.f48583B = (TextView) findViewById(C0164R.id.survey_imageblock_button);
    }
}
