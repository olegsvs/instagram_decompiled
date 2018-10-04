package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView;

/* renamed from: X.3h8 */
public final class AnonymousClass3h8 implements TextWatcher {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Tf f43370B;
    /* renamed from: C */
    public final /* synthetic */ SurveyWriteInListItemView f43371C;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass3h8(AnonymousClass3hD anonymousClass3hD, AnonymousClass1Tf anonymousClass1Tf, SurveyWriteInListItemView surveyWriteInListItemView) {
        this.f43370B = anonymousClass1Tf;
        this.f43371C = surveyWriteInListItemView;
    }

    public final void afterTextChanged(Editable editable) {
        editable = this.f43370B;
        editable.f18948D.m22172B(this.f43371C.getText());
    }
}
