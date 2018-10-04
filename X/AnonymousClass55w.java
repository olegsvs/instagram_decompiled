package X;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.facebook.C0164R;

/* renamed from: X.55w */
public final class AnonymousClass55w {
    /* renamed from: B */
    public final AnonymousClass55n f60062B;
    /* renamed from: C */
    public final AnonymousClass0IJ f60063C;
    /* renamed from: D */
    public final AnonymousClass56A f60064D;
    /* renamed from: E */
    private Context f60065E;

    public AnonymousClass55w(AnonymousClass0Cn anonymousClass0Cn, AutoCompleteTextView autoCompleteTextView, View view, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Ds anonymousClass2Ds, AnonymousClass2Na anonymousClass2Na, AnonymousClass569 anonymousClass569) {
        this.f60063C = anonymousClass0IJ;
        this.f60065E = anonymousClass0IJ.getContext();
        this.f60062B = new AnonymousClass55n(anonymousClass0IJ, anonymousClass2Ds);
        AnonymousClass568 anonymousClass568 = new AnonymousClass568(autoCompleteTextView, this.f60065E, anonymousClass2Na);
        anonymousClass568.f60091D = new AnonymousClass55e(true, true, true);
        anonymousClass568.f60093F = anonymousClass569;
        anonymousClass568.f60089B = anonymousClass0IJ.getResources().getDimensionPixelOffset(C0164R.dimen.field_with_glyph_left_padding);
        AnonymousClass56A anonymousClass56A = new AnonymousClass56A(anonymousClass568);
        this.f60064D = anonymousClass56A;
        anonymousClass56A.f60097C = new ArrayAdapter(this.f60063C.getActivity(), C0164R.layout.row_autocomplete_email, AnonymousClass3KN.E(this.f60063C.getActivity()));
        autoCompleteTextView.addOnLayoutChangeListener(new AnonymousClass55r(anonymousClass0IJ.getResources(), autoCompleteTextView, view));
    }

    /* renamed from: A */
    public final AnonymousClass5ZN m25718A(String str, AnonymousClass564 anonymousClass564) {
        for (AnonymousClass5ZN anonymousClass5ZN : this.f60062B.f60043F) {
            if (anonymousClass564.mo5841A(anonymousClass5ZN, str)) {
                return anonymousClass5ZN;
            }
        }
        return null;
    }
}
