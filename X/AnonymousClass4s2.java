package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.4s2 */
public final class AnonymousClass4s2 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f58001B;
    /* renamed from: C */
    private final AnonymousClass5Xq f58002C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4s2(Context context, AnonymousClass5Xq anonymousClass5Xq) {
        this.f58001B = context;
        this.f58002C = anonymousClass5Xq;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1629070201);
        if (view == null) {
            view = LayoutInflater.from(this.f58001B).inflate(C0164R.layout.row_user, viewGroup, false);
            AnonymousClass1Vv anonymousClass1Vv = new AnonymousClass1Vv();
            anonymousClass1Vv.f19403B = (ViewGroup) view;
            anonymousClass1Vv.f19405D = (GradientSpinnerAvatarView) view.findViewById(C0164R.id.row_user_imageview);
            anonymousClass1Vv.f19406E = (TextView) view.findViewById(C0164R.id.row_user_username);
            anonymousClass1Vv.f19407F = (TextView) view.findViewById(C0164R.id.row_user_fullname);
            HashtagFollowButton hashtagFollowButton = (HashtagFollowButton) ((ViewStub) view.findViewById(C0164R.id.hashtag_follow_button_stub)).inflate();
            anonymousClass1Vv.f19404C = hashtagFollowButton;
            hashtagFollowButton.setVisibility(8);
            view.setTag(anonymousClass1Vv);
        }
        Context context = this.f58001B;
        AnonymousClass1Vv anonymousClass1Vv2 = (AnonymousClass1Vv) view.getTag();
        Hashtag hashtag = (Hashtag) obj;
        AnonymousClass1LV anonymousClass1LV = this.f58002C;
        AnonymousClass0yb.C(anonymousClass1Vv2.f19405D, hashtag);
        anonymousClass1Vv2.f19405D.setGradientSpinnerVisible(false);
        anonymousClass1Vv2.f19406E.setText(AnonymousClass0IE.E("#%s", new Object[]{hashtag.f2793M}));
        anonymousClass1Vv2.f19407F.setText(AnonymousClass19B.B(context.getResources(), hashtag.f2789I));
        anonymousClass1Vv2.f19403B.setOnClickListener(new AnonymousClass4s3(anonymousClass1LV, hashtag));
        if (hashtag.f2782B) {
            anonymousClass1Vv2.f19404C.setVisibility(0);
            anonymousClass1Vv2.f19404C.A(hashtag, anonymousClass1LV);
        } else {
            anonymousClass1Vv2.f19404C.setVisibility(8);
        }
        AnonymousClass0cQ.H(this, -1137793657, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Hashtag hashtag = (Hashtag) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
