package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.3iM */
public final class AnonymousClass3iM extends AnonymousClass0TA {
    /* renamed from: B */
    private AnonymousClass453 f43551B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3iM(AnonymousClass453 anonymousClass453) {
        this.f43551B = anonymousClass453;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1996032635);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.current_catalog, viewGroup, false);
            AnonymousClass3iL anonymousClass3iL = new AnonymousClass3iL();
            anonymousClass3iL.f43550C = view;
            anonymousClass3iL.f43549B = (TextView) view.findViewById(C0164R.id.row_current_catalog);
            view.setTag(anonymousClass3iL);
        }
        AnonymousClass3iL anonymousClass3iL2 = (AnonymousClass3iL) view.getTag();
        String str = (String) obj;
        anonymousClass3iL2.f43550C.setOnClickListener(new AnonymousClass3iK(this.f43551B));
        anonymousClass3iL2.f43549B.setText(str);
        AnonymousClass0cQ.H(this, -123341888, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        String str = (String) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
