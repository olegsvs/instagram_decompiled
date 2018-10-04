package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.C0164R;

/* renamed from: X.2J1 */
public final class AnonymousClass2J1 {
    /* renamed from: B */
    public static void m14996B(View view, AnonymousClass2Ie anonymousClass2Ie) {
        AnonymousClass2J0 anonymousClass2J0 = (AnonymousClass2J0) view.getTag();
        if (anonymousClass2J0.f28770B != null) {
            anonymousClass2J0.f28771C.removeTextChangedListener(anonymousClass2J0.f28770B);
        }
        anonymousClass2J0.f28770B = anonymousClass2Ie;
        anonymousClass2J0.f28771C.setHint(anonymousClass2Ie.f28716D);
        anonymousClass2J0.f28771C.setOnEditorActionListener(anonymousClass2Ie.f28715C);
        anonymousClass2J0.f28771C.addTextChangedListener(anonymousClass2Ie);
        anonymousClass2J0.f28771C.setText(anonymousClass2Ie.f28714B);
        anonymousClass2J0.f28771C.setInputType(anonymousClass2Ie.f28717E != null ? anonymousClass2Ie.f28717E.intValue() : 1);
        if (anonymousClass2J0.f28770B.f28718F) {
            anonymousClass2J0.f28771C.requestFocus();
            AnonymousClass0Nm.l(anonymousClass2J0.f28771C);
        }
    }

    /* renamed from: C */
    public static View m14997C(Context context, ViewGroup viewGroup) {
        context = LayoutInflater.from(context).inflate(C0164R.layout.row_edit_text_item, viewGroup, false);
        AnonymousClass2J0 anonymousClass2J0 = new AnonymousClass2J0();
        anonymousClass2J0.f28771C = (EditText) context.findViewById(C0164R.id.row_edit_text_content);
        context.setTag(anonymousClass2J0);
        return context;
    }
}
