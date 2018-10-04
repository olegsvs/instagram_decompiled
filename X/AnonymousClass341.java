package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.341 */
public final class AnonymousClass341 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f37484B;
    /* renamed from: C */
    private final AnonymousClass3xB f37485C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass341(Context context, AnonymousClass3xB anonymousClass3xB) {
        this.f37484B = context;
        this.f37485C = anonymousClass3xB;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1777442723);
        if (view == null) {
            view = (ViewGroup) LayoutInflater.from(this.f37484B).inflate(C0164R.layout.row_fb_page_category, viewGroup, false);
            AnonymousClass340 anonymousClass340 = new AnonymousClass340();
            anonymousClass340.f37482C = (ViewGroup) view.findViewById(C0164R.id.row_category_container);
            anonymousClass340.f37481B = (TextView) view.findViewById(C0164R.id.row_category_name);
            anonymousClass340.f37483D = (RadioButton) view.findViewById(C0164R.id.radio);
            view.setTag(anonymousClass340);
        }
        AnonymousClass340 anonymousClass3402 = (AnonymousClass340) view.getTag();
        AnonymousClass2Xv anonymousClass2Xv = (AnonymousClass2Xv) obj;
        AnonymousClass3xB anonymousClass3xB = this.f37485C;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        anonymousClass3402.f37481B.setText(anonymousClass2Xv.f31205C);
        anonymousClass3402.f37483D.setChecked(booleanValue);
        anonymousClass3402.f37482C.setOnClickListener(new AnonymousClass33z(anonymousClass3xB, anonymousClass2Xv));
        AnonymousClass0cQ.H(this, -801310430, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2Xv anonymousClass2Xv = (AnonymousClass2Xv) obj;
        Boolean bool = (Boolean) obj2;
        anonymousClass0p9.A(0);
    }
}
