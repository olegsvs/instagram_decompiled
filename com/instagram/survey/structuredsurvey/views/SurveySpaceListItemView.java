package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass41y;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.C0164R;

public class SurveySpaceListItemView extends AnonymousClass3hS {
    /* renamed from: B */
    public View f48591B = findViewById(C0164R.id.survey_space_view);

    public SurveySpaceListItemView(Context context) {
        super(context);
        setContentView(C0164R.layout.survey_space_view);
    }

    public SurveySpaceListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(C0164R.layout.survey_space_view);
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        AnonymousClass41y anonymousClass41y = (AnonymousClass41y) anonymousClass3hR;
        if (anonymousClass41y.f48578B != 0) {
            LayoutParams layoutParams = (LayoutParams) this.f48591B.getLayoutParams();
            float f = (float) anonymousClass41y.f48578B;
            layoutParams.height = Math.round(getContext().getResources().getDisplayMetrics().density * f);
            this.f48591B.setLayoutParams(layoutParams);
        }
    }
}
