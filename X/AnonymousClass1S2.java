package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.1S2 */
public final class AnonymousClass1S2 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f18696B;
    /* renamed from: C */
    private final AnonymousClass1bK f18697C;
    /* renamed from: D */
    private final AnonymousClass0Cm f18698D;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1S2(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass1bK anonymousClass1bK) {
        this.f18696B = context;
        this.f18698D = anonymousClass0Cm;
        this.f18697C = anonymousClass1bK;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.m5859I(this, 90449485);
        if (view == null) {
            Context context = this.f18696B;
            view = LayoutInflater.from(context).inflate(C0164R.layout.row_requested_user, viewGroup, false);
            AnonymousClass5KC anonymousClass5KC = new AnonymousClass5KC();
            anonymousClass5KC.f62256E = view;
            anonymousClass5KC.f62255D = (CircularImageView) view.findViewById(C0164R.id.row_user_imageview);
            TextView textView = (TextView) view.findViewById(C0164R.id.row_user_username);
            anonymousClass5KC.f62261J = textView;
            boolean z = true;
            textView.getPaint().setFakeBoldText(true);
            anonymousClass5KC.f62260I = (TextView) view.findViewById(C0164R.id.row_user_subtitle);
            anonymousClass5KC.f62253B = view.findViewById(C0164R.id.row_requested_user_approval_actions);
            anonymousClass5KC.f62254C = view.findViewById(C0164R.id.row_requested_user_accept);
            anonymousClass5KC.f62259H = view.findViewById(C0164R.id.row_requested_user_ignore);
            anonymousClass5KC.f62254C.getBackground().setColorFilter(AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(context, C0164R.color.blue_5)));
            anonymousClass5KC.f62259H.getBackground().setColorFilter(AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(context, C0164R.color.grey_5)));
            if (AnonymousClass0Nm.m3431J(context) > JsonMappingException.MAX_REFS_TO_LIST) {
                z = false;
            }
            anonymousClass5KC.f62257F = view.findViewById(C0164R.id.row_requested_user_dismiss);
            anonymousClass5KC.f62254C.setVisibility(0);
            int i2 = 8;
            anonymousClass5KC.f62259H.setVisibility(z ? 8 : 0);
            View view2 = anonymousClass5KC.f62257F;
            if (z) {
                i2 = 0;
            }
            view2.setVisibility(i2);
            anonymousClass5KC.f62258G = (FollowButton) view.findViewById(C0164R.id.row_requested_user_follow_button_large);
            view.setTag(anonymousClass5KC);
        }
        AnonymousClass1bK anonymousClass1bK = this.f18697C;
        AnonymousClass5KC anonymousClass5KC2 = (AnonymousClass5KC) view.getTag();
        AnonymousClass0Cm anonymousClass0Cm = this.f18698D;
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        int intValue = ((Integer) obj2).intValue();
        if (anonymousClass1bK.f20429E.add(anonymousClass0Ci.getId())) {
            AnonymousClass5K7.f62238F.A(anonymousClass1bK, intValue, anonymousClass0Ci.getId());
        }
        anonymousClass5KC2.f62256E.setOnClickListener(new AnonymousClass5K8(anonymousClass1bK, intValue, anonymousClass0Ci));
        anonymousClass5KC2.f62255D.setUrl(anonymousClass0Ci.DQ());
        anonymousClass5KC2.f62261J.setText(anonymousClass0Ci.uT());
        CharSequence B = AnonymousClass3lm.B(anonymousClass0Ci.OC, anonymousClass0Ci.f1757z);
        if (TextUtils.isEmpty(B)) {
            anonymousClass5KC2.f62260I.setVisibility(8);
        } else {
            anonymousClass5KC2.f62260I.setText(B);
            anonymousClass5KC2.f62260I.setVisibility(0);
        }
        anonymousClass5KC2.f62254C.setOnClickListener(new AnonymousClass5K9(anonymousClass1bK, intValue, anonymousClass0Ci));
        anonymousClass5KC2.f62259H.setOnClickListener(new AnonymousClass5KA(anonymousClass1bK, intValue, anonymousClass0Ci));
        if (anonymousClass5KC2.f62257F != null) {
            anonymousClass5KC2.f62257F.setOnClickListener(new AnonymousClass5KB(anonymousClass1bK, intValue, anonymousClass0Ci));
        }
        anonymousClass5KC2.f62258G.m8654A(anonymousClass0Cm, anonymousClass0Ci, null);
        if (anonymousClass0Ci.m1026q()) {
            anonymousClass5KC2.f62253B.setVisibility(0);
            anonymousClass5KC2.f62258G.setVisibility(8);
        } else {
            anonymousClass5KC2.f62253B.setVisibility(8);
            anonymousClass5KC2.f62258G.setVisibility(0);
        }
        AnonymousClass0cQ.m5858H(this, -1040064499, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        Integer num = (Integer) obj2;
        anonymousClass0p9.m7787A(0);
    }
}
