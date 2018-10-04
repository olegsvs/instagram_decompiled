package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.626 */
public final class AnonymousClass626 extends AnonymousClass0TA {
    /* renamed from: B */
    private final AnonymousClass6Ha f71108B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass626(AnonymousClass6Ha anonymousClass6Ha) {
        this.f71108B = anonymousClass6Ha;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 1393807400);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.product_details_page_information_row, viewGroup, false);
            AnonymousClass628 anonymousClass628 = new AnonymousClass628();
            anonymousClass628.f71111B = view;
            anonymousClass628.f71112C = view.findViewById(C0164R.id.divider);
            anonymousClass628.f71113D = (TextView) view.findViewById(C0164R.id.title);
            view.setTag(anonymousClass628);
        }
        AnonymousClass628 anonymousClass6282 = (AnonymousClass628) view.getTag();
        AnonymousClass3fk anonymousClass3fk = (AnonymousClass3fk) AnonymousClass0LH.E(((AnonymousClass62B) obj).f71130B);
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        AnonymousClass6Ha anonymousClass6Ha = this.f71108B;
        anonymousClass6282.f71112C.setVisibility(booleanValue ? 0 : 8);
        anonymousClass6282.f71113D.setText(anonymousClass3fk.A());
        anonymousClass6282.f71111B.setOnClickListener(new AnonymousClass627(anonymousClass6Ha, anonymousClass3fk));
        AnonymousClass0cQ.H(this, 459018775, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass62B anonymousClass62B = (AnonymousClass62B) obj;
        Boolean bool = (Boolean) obj2;
        anonymousClass0p9.A(0);
    }
}
