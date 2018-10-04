package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4mx */
public final class AnonymousClass4mx extends AnonymousClass0TA {
    /* renamed from: B */
    public final AnonymousClass5Y0 f57263B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4mx(AnonymousClass5Y0 anonymousClass5Y0) {
        this.f57263B = anonymousClass5Y0;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1795408729);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.static_search_bar, viewGroup, false);
            AnonymousClass4mw anonymousClass4mw = new AnonymousClass4mw();
            anonymousClass4mw.f57262B = (TextView) view.findViewById(C0164R.id.search_text);
            view.setTag(anonymousClass4mw);
            anonymousClass4mw.f57262B.setHint(C0164R.string.search_places);
            AnonymousClass3ka.B(anonymousClass4mw.f57262B);
        }
        String str = (String) obj2;
        int I2 = AnonymousClass0cQ.I(this, 1723787493);
        TextView textView = ((AnonymousClass4mw) view.getTag()).f57262B;
        textView.setText(str);
        textView.setOnClickListener(new AnonymousClass4mv(this));
        AnonymousClass0cQ.H(this, -2061642744, I2);
        AnonymousClass0cQ.H(this, -915981936, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3Iz anonymousClass3Iz = (AnonymousClass3Iz) obj;
        String str = (String) obj2;
        anonymousClass0p9.A(0);
    }
}
