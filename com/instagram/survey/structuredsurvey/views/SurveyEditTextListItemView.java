package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass41t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.facebook.C0164R;

public class SurveyEditTextListItemView extends AnonymousClass3hS {
    /* renamed from: B */
    public EditText f48582B;

    public SurveyEditTextListItemView(Context context) {
        super(context);
        m22175B();
    }

    public SurveyEditTextListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22175B();
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        this.f43431B = anonymousClass3hR;
        this.f48582B.setHint(C0164R.string.structuredsurvey_edittext_hint);
        this.f48582B.setText(((AnonymousClass41t) this.f43431B).m22171A());
    }

    /* renamed from: B */
    private void m22175B() {
        setContentView(C0164R.layout.survey_editext_view);
        EditText editText = (EditText) findViewById(C0164R.id.survey_edit_text);
        this.f48582B = editText;
        editText.setFocusable(true);
        this.f48582B.setFocusableInTouchMode(true);
    }

    public String getText() {
        return this.f48582B.getText().toString();
    }

    public final void onStartTemporaryDetach() {
        ((AnonymousClass41t) this.f43431B).m22172B(getText());
        super.onStartTemporaryDetach();
    }

    public void setItemOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f48582B.setOnFocusChangeListener(onFocusChangeListener);
    }
}
