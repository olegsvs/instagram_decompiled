package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.3n3 */
public final class AnonymousClass3n3 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f44508B;
    /* renamed from: C */
    private final AnonymousClass3n7 f44509C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3n3(Context context, AnonymousClass3n7 anonymousClass3n7) {
        this.f44508B = context;
        this.f44509C = anonymousClass3n7;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -547861254);
        if (view == null) {
            view = LayoutInflater.from(this.f44508B).inflate(C0164R.layout.row_userlist_view_all, viewGroup, false);
            AnonymousClass3n8 anonymousClass3n8 = new AnonymousClass3n8();
            anonymousClass3n8.f44516B = (TextView) view.findViewById(C0164R.id.see_all_button);
            view.setTag(anonymousClass3n8);
        }
        Context context = this.f44508B;
        AnonymousClass3n8 anonymousClass3n82 = (AnonymousClass3n8) view.getTag();
        AnonymousClass3n5 anonymousClass3n5 = (AnonymousClass3n5) obj;
        AnonymousClass3n7 anonymousClass3n7 = this.f44509C;
        AnonymousClass3n4 anonymousClass3n4 = anonymousClass3n5.f44513B;
        if (anonymousClass3n4 == AnonymousClass3n4.FOLLOWERS) {
            anonymousClass3n82.f44516B.setText(context.getString(C0164R.string.see_all_followers));
        } else if (anonymousClass3n4 == AnonymousClass3n4.SUGGESTED_USERS) {
            anonymousClass3n82.f44516B.setText(context.getString(C0164R.string.see_all_suggestions));
        }
        anonymousClass3n82.f44516B.setOnClickListener(new AnonymousClass3n6(anonymousClass3n4, anonymousClass3n7));
        AnonymousClass0cQ.H(this, 1245056706, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3n5 anonymousClass3n5 = (AnonymousClass3n5) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
