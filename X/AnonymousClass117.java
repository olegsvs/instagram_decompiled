package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.117 */
public final class AnonymousClass117 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0kn f13365B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0lB f13366C;

    public AnonymousClass117(AnonymousClass0kn anonymousClass0kn, AnonymousClass0lB anonymousClass0lB) {
        this.f13365B = anonymousClass0kn;
        this.f13366C = anonymousClass0lB;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Dialog C = new AnonymousClass0Sb(this.f13365B.f9367B, C0164R.layout.results_dialog, C0164R.style.SurveyResultsDialog).m4361C();
        AnonymousClass0kn anonymousClass0kn = this.f13365B;
        AnonymousClass0lB anonymousClass0lB = this.f13366C;
        LinearLayout linearLayout = (LinearLayout) C.findViewById(C0164R.id.resultsList);
        ((TextView) C.findViewById(C0164R.id.action_bar_textview_title)).setText(C.getContext().getText(C0164R.string.survey_dialog_survey_results));
        C.findViewById(C0164R.id.action_bar_button_back).setOnClickListener(new AnonymousClass1Yn(anonymousClass0kn, C));
        for (AnonymousClass111 anonymousClass111 : anonymousClass0lB.f9449D) {
            View inflate = LayoutInflater.from(C.getContext()).inflate(C0164R.layout.result_row, null);
            ((TextView) inflate.findViewById(C0164R.id.question_header)).setText(anonymousClass111.f13357D);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0164R.id.answerList);
            for (AnonymousClass3MW anonymousClass3MW : anonymousClass111.f13355B) {
                View anonymousClass1Yo = new AnonymousClass1Yo(C.getContext());
                anonymousClass1Yo.setAnswer(anonymousClass3MW);
                anonymousClass1Yo.setTotalQuestionResponders(anonymousClass111.f13358E);
                linearLayout2.addView(anonymousClass1Yo);
            }
            ((TextView) inflate.findViewById(C0164R.id.question_footer)).setText(C.getContext().getResources().getQuantityString(C0164R.plurals.x_survey_question_responders, anonymousClass111.f13358E, new Object[]{Integer.valueOf(anonymousClass111.f13358E)}));
            linearLayout.addView(inflate);
        }
        C.show();
    }
}
