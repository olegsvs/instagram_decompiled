package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.5pj */
public final class AnonymousClass5pj extends AnonymousClass0TA {
    public final int getViewTypeCount() {
        return 1;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -29642005);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.profile_slideout_menu_options_row, viewGroup, false);
            view.setTag(new AnonymousClass5pl(view));
        }
        AnonymousClass1Rv anonymousClass1Rv = (AnonymousClass1Rv) obj;
        AnonymousClass5pl anonymousClass5pl = (AnonymousClass5pl) view.getTag();
        anonymousClass5pl.f69259D.setEnabled(true);
        anonymousClass5pl.f69259D.setOnClickListener(new AnonymousClass5pk(anonymousClass1Rv, anonymousClass5pl));
        anonymousClass5pl.f69258C.setImageResource(anonymousClass1Rv.B());
        anonymousClass5pl.f69260E.setText(anonymousClass1Rv.D());
        if (anonymousClass1Rv.F()) {
            int A = anonymousClass1Rv.A();
            if (A > 0) {
                ((TextView) anonymousClass5pl.f69257B.A()).setText(A < 10 ? String.valueOf(A) : "9+");
            }
            ((TextView) anonymousClass5pl.f69257B.A()).setBackgroundResource(A > 0 ? C0164R.drawable.red_pill_profile_slideout_menu : C0164R.drawable.red_donut_profile_slideout_menu);
            anonymousClass5pl.f69257B.D(0);
        } else {
            anonymousClass5pl.f69257B.D(8);
        }
        AnonymousClass0cQ.H(this, -1189908387, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass1Rv anonymousClass1Rv = (AnonymousClass1Rv) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
