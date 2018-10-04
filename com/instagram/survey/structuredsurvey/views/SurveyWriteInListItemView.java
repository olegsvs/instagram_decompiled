package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass0Nm;
import X.AnonymousClass1Te;
import X.AnonymousClass1Tf;
import X.AnonymousClass3hQ;
import X.AnonymousClass3hR;
import X.AnonymousClass3hS;
import X.AnonymousClass3hT;
import X.AnonymousClass3hU;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;

public class SurveyWriteInListItemView extends AnonymousClass3hS implements Checkable {
    /* renamed from: B */
    public View f48592B;
    /* renamed from: C */
    public Checkable f48593C;
    /* renamed from: D */
    public TextView f48594D;
    /* renamed from: E */
    public EditText f48595E;
    /* renamed from: F */
    public OnFocusChangeListener f48596F;
    /* renamed from: G */
    public AnonymousClass3hQ f48597G;

    public SurveyWriteInListItemView(Context context) {
        super(context);
    }

    public SurveyWriteInListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A */
    public final void mo5028A(AnonymousClass3hR anonymousClass3hR) {
        this.f43431B = anonymousClass3hR;
        AnonymousClass1Tf anonymousClass1Tf = (AnonymousClass1Tf) anonymousClass3hR;
        this.f48595E.setText(anonymousClass1Tf.f18948D.m22171A());
        this.f48594D.setText(anonymousClass1Tf.f18946B.f43399B);
        if (this.f48597G == AnonymousClass3hQ.CHECKBOXWRITEIN) {
            this.f48595E.setOnClickListener(new AnonymousClass3hT(this));
        } else if (this.f48597G == AnonymousClass3hQ.RADIOWRITEIN) {
            this.f48595E.setOnClickListener(new AnonymousClass3hU(this));
        }
        this.f48595E.setOnFocusChangeListener(new AnonymousClass1Te(this));
    }

    public String getText() {
        return this.f48595E.getText().toString();
    }

    public final boolean isChecked() {
        return this.f48593C.isChecked();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        AnonymousClass1Tf anonymousClass1Tf = (AnonymousClass1Tf) this.f43431B;
        anonymousClass1Tf.f18948D.m22172B(getText());
    }

    public void setChecked(boolean z) {
        this.f48593C.setChecked(z);
        ((AnonymousClass1Tf) this.f43431B).f18947C = Boolean.valueOf(z).booleanValue();
        if (z) {
            this.f48592B.setVisibility(0);
            this.f48595E.setVisibility(0);
            return;
        }
        this.f48592B.setVisibility(4);
        this.f48595E.setVisibility(4);
        Activity activity = (Activity) getContext();
        AnonymousClass0Nm.N(getRootView());
        activity.getWindow().setSoftInputMode(3);
    }

    public void setItemOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f48596F = onFocusChangeListener;
    }

    public final void toggle() {
        setChecked(this.f48593C.isChecked() ^ 1);
    }
}
