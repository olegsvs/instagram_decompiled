package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.33j */
public final class AnonymousClass33j extends AnonymousClass0TA {
    /* renamed from: B */
    public final AnonymousClass4Bh f37460B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass33j(AnonymousClass4Bh anonymousClass4Bh) {
        this.f37460B = anonymousClass4Bh;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 1925630279);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.ads_manager_appeal_button, viewGroup, false);
            view.setTag(new AnonymousClass33i(view.findViewById(C0164R.id.appeal_button_view)));
        }
        AnonymousClass33i anonymousClass33i = (AnonymousClass33i) view.getTag();
        Boolean bool = (Boolean) obj;
        int I2 = AnonymousClass0cQ.I(this, -966924267);
        TextView textView = anonymousClass33i.f37459B;
        int i2 = bool.booleanValue() ? ((Boolean) AnonymousClass0CC.KP.G()).booleanValue() ? C0164R.string.review_request : C0164R.string.view_appeal : ((Boolean) AnonymousClass0CC.KP.G()).booleanValue() ? C0164R.string.request_review : C0164R.string.appeal;
        textView.setText(i2);
        anonymousClass33i.f37459B.setOnClickListener(new AnonymousClass33h(this));
        AnonymousClass0cQ.H(this, 1135200986, I2);
        AnonymousClass0cQ.H(this, -1871146458, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
