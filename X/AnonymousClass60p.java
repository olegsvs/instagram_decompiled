package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.60p */
public final class AnonymousClass60p extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f70868B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass60p(Context context) {
        this.f70868B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 217214120);
        if (view == null) {
            AnonymousClass60n anonymousClass60n = (AnonymousClass60n) obj;
            view = LayoutInflater.from(this.f70868B).inflate(C0164R.layout.row_twoline_text_textview, viewGroup, false);
            AnonymousClass60o anonymousClass60o = new AnonymousClass60o();
            anonymousClass60o.f70866B = (TextView) view.findViewById(C0164R.id.first_line_textview);
            anonymousClass60o.f70867C = (TextView) view.findViewById(C0164R.id.second_line_textview);
            view.setTag(anonymousClass60o);
        }
        AnonymousClass60o anonymousClass60o2 = (AnonymousClass60o) view.getTag();
        AnonymousClass60n anonymousClass60n2 = (AnonymousClass60n) obj;
        anonymousClass60o2.f70866B.setText(anonymousClass60n2.f70864B);
        anonymousClass60o2.f70867C.setText(anonymousClass60n2.f70865C);
        AnonymousClass0cQ.H(this, -673927669, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass60n anonymousClass60n = (AnonymousClass60n) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
