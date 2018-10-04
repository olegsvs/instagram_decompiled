package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.34B */
public final class AnonymousClass34B extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f37505B;
    /* renamed from: C */
    private final AnonymousClass349 f37506C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass34B(Context context, AnonymousClass349 anonymousClass349) {
        this.f37505B = context;
        this.f37506C = anonymousClass349;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        String str;
        int I = AnonymousClass0cQ.I(this, 428204789);
        if (view == null) {
            view = (ViewGroup) LayoutInflater.from(this.f37505B).inflate(C0164R.layout.row_page, viewGroup, false);
            AnonymousClass34A anonymousClass34A = new AnonymousClass34A();
            anonymousClass34A.f37504F = (ViewGroup) view.findViewById(C0164R.id.row_page_container);
            anonymousClass34A.f37502D = (ConstrainedImageView) view.findViewById(C0164R.id.row_page_imageview);
            anonymousClass34A.f37503E = (TextView) view.findViewById(C0164R.id.row_page_name);
            anonymousClass34A.f37501C = (TextView) view.findViewById(C0164R.id.row_page_category);
            anonymousClass34A.f37500B = (CheckBox) view.findViewById(C0164R.id.checkbox);
            view.setTag(anonymousClass34A);
        }
        AnonymousClass34A anonymousClass34A2 = (AnonymousClass34A) view.getTag();
        AnonymousClass2W3 anonymousClass2W3 = (AnonymousClass2W3) obj;
        AnonymousClass349 anonymousClass349 = this.f37506C;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (anonymousClass2W3.f31098L == null) {
            str = null;
        } else {
            str = anonymousClass2W3.f31098L.f31087B;
        }
        anonymousClass34A2.f37502D.setUrl(str);
        anonymousClass34A2.f37503E.setText(anonymousClass2W3.f31097K);
        anonymousClass34A2.f37501C.setText(anonymousClass2W3.f31092F);
        anonymousClass34A2.f37500B.setChecked(booleanValue);
        anonymousClass34A2.f37504F.setOnClickListener(new AnonymousClass348(anonymousClass349, anonymousClass2W3));
        AnonymousClass0cQ.H(this, -1171106701, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2W3 anonymousClass2W3 = (AnonymousClass2W3) obj;
        Boolean bool = (Boolean) obj2;
        anonymousClass0p9.A(0);
    }
}
