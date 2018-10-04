package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.3O1 */
public final class AnonymousClass3O1 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f40704B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3O1(Context context) {
        this.f40704B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1000407049);
        if (view == null) {
            view = LayoutInflater.from(this.f40704B).inflate(C0164R.layout.row_feed_notice, viewGroup, false);
            AnonymousClass1YO anonymousClass1YO = new AnonymousClass1YO();
            anonymousClass1YO.f20006C = (TextView) view.findViewById(C0164R.id.notice_text_view);
            anonymousClass1YO.f20005B = (TextView) view.findViewById(C0164R.id.notice_button_view);
            view.setTag(anonymousClass1YO);
        }
        AnonymousClass3O2 anonymousClass3O2 = (AnonymousClass3O2) obj;
        AnonymousClass1YO anonymousClass1YO2 = (AnonymousClass1YO) view.getTag();
        if (anonymousClass3O2.f40707D != null) {
            anonymousClass1YO2.f20006C.setText(anonymousClass3O2.f40707D);
            anonymousClass1YO2.f20006C.setVisibility(0);
        } else {
            anonymousClass1YO2.f20006C.setVisibility(8);
        }
        if (anonymousClass3O2.f40706C != null) {
            anonymousClass1YO2.f20005B.setVisibility(0);
            anonymousClass1YO2.f20005B.setText(anonymousClass3O2.f40706C);
            anonymousClass1YO2.f20005B.setOnClickListener(anonymousClass3O2.f40705B);
        } else {
            anonymousClass1YO2.f20005B.setVisibility(8);
        }
        AnonymousClass0cQ.H(this, -844279353, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3O2 anonymousClass3O2 = (AnonymousClass3O2) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
