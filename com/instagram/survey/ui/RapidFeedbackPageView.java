package com.instagram.survey.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.facebook.C0164R;

public class RapidFeedbackPageView extends RelativeLayout {
    public RapidFeedbackPageView(Context context) {
        super(context, null);
        LayoutInflater.from(getContext()).inflate(C0164R.layout.rapidfeedback_page, this);
    }

    public RapidFeedbackPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0164R.layout.rapidfeedback_page, this);
    }
}
