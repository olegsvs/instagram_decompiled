package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.3ml */
public final class AnonymousClass3ml extends AnonymousClass0TA {
    /* renamed from: B */
    public boolean f44408B;
    /* renamed from: C */
    private final Context f44409C;
    /* renamed from: D */
    private final AnonymousClass3mp f44410D;
    /* renamed from: E */
    private final boolean f44411E;
    /* renamed from: F */
    private final AnonymousClass0Cm f44412F;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3ml(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3mp anonymousClass3mp, boolean z) {
        this.f44409C = context;
        this.f44412F = anonymousClass0Cm;
        this.f44410D = anonymousClass3mp;
        this.f44411E = z;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        CharSequence charSequence;
        int i2;
        Object obj3 = obj;
        View view2 = view;
        int I = AnonymousClass0cQ.I(this, 275499676);
        if (view == null) {
            view2 = LayoutInflater.from(this.f44409C).inflate(C0164R.layout.follow_list_row, viewGroup, false);
            AnonymousClass3mq anonymousClass3mq = new AnonymousClass3mq();
            anonymousClass3mq.f44420B = (ViewGroup) view2.findViewById(C0164R.id.follow_list_container);
            anonymousClass3mq.f44428J = (GradientSpinnerAvatarView) view2.findViewById(C0164R.id.follow_list_user_imageview);
            anonymousClass3mq.f44429K = (TextView) view2.findViewById(C0164R.id.follow_list_username);
            anonymousClass3mq.f44427I = (TextView) view2.findViewById(C0164R.id.follow_list_subtitle);
            anonymousClass3mq.f44426H = (TextView) view2.findViewById(C0164R.id.follow_list_social_context);
            anonymousClass3mq.f44423E = (ViewStub) view2.findViewById(C0164R.id.follow_list_large_follow_button_stub);
            anonymousClass3mq.f44425G = (ViewStub) view2.findViewById(C0164R.id.follow_more_button_stub);
            anonymousClass3mq.f44421C = view2.findViewById(C0164R.id.row_divider);
            view2.setTag(anonymousClass3mq);
        }
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj3;
        AnonymousClass0MI R = this.f44408B ? AnonymousClass0Jd.f2931B.R(this.f44412F, anonymousClass0Ci, anonymousClass0Ci.fB) : null;
        AnonymousClass3mq anonymousClass3mq2 = (AnonymousClass3mq) view2.getTag();
        AnonymousClass0Cm anonymousClass0Cm = this.f44412F;
        AnonymousClass3mp anonymousClass3mp = this.f44410D;
        Context context = this.f44409C;
        boolean z = this.f44411E;
        anonymousClass3mq2.f44421C.setVisibility(8);
        anonymousClass3mq2.f44428J.B(anonymousClass0Ci.DQ(), null);
        anonymousClass3mq2.f44429K.setText(anonymousClass0Ci.uT());
        AnonymousClass15G.C(anonymousClass3mq2.f44429K, anonymousClass0Ci.u());
        if (TextUtils.isEmpty(anonymousClass0Ci.f1743l)) {
            charSequence = anonymousClass0Ci.f1757z;
        } else {
            charSequence = anonymousClass0Ci.f1743l;
        }
        if (TextUtils.isEmpty(charSequence)) {
            anonymousClass3mq2.f44427I.setVisibility(8);
        } else {
            anonymousClass3mq2.f44427I.setText(charSequence);
            anonymousClass3mq2.f44427I.setVisibility(0);
        }
        if (TextUtils.isEmpty(anonymousClass0Ci.OC)) {
            anonymousClass3mq2.f44426H.setVisibility(8);
        } else {
            anonymousClass3mq2.f44426H.setVisibility(0);
            anonymousClass3mq2.f44426H.setText(anonymousClass0Ci.OC);
        }
        if (anonymousClass3mq2.f44422D == null) {
            FollowButton followButton = (FollowButton) anonymousClass3mq2.f44423E.inflate();
            anonymousClass3mq2.f44422D = followButton;
            followButton.setVisibility(0);
        }
        ((LayoutParams) anonymousClass3mq2.f44422D.getLayoutParams()).width = anonymousClass3mq2.f44422D.getContext().getResources().getDimensionPixelSize(C0164R.dimen.follow_button_in_row_width);
        anonymousClass3mq2.f44422D.A(anonymousClass0Cm, anonymousClass0Ci, anonymousClass3mp);
        int dimension = (int) context.getResources().getDimension(C0164R.dimen.row_padding);
        if (z) {
            if (anonymousClass3mq2.f44424F == null) {
                anonymousClass3mq2.f44424F = (ImageView) anonymousClass3mq2.f44425G.inflate();
            }
            anonymousClass3mq2.f44424F.setVisibility(0);
            anonymousClass3mq2.f44424F.setOnClickListener(new AnonymousClass3mo(anonymousClass3mp, anonymousClass0Ci));
            i2 = 0;
        } else {
            if (anonymousClass3mq2.f44424F != null) {
                anonymousClass3mq2.f44424F.setVisibility(8);
                anonymousClass3mq2.f44424F.setOnClickListener(null);
            }
            i2 = dimension;
        }
        anonymousClass3mq2.f44420B.setPadding(dimension, 0, i2, 0);
        OnClickListener anonymousClass3mm = new AnonymousClass3mm(anonymousClass3mp, anonymousClass0Ci);
        anonymousClass3mq2.f44420B.setOnClickListener(anonymousClass3mm);
        if (R != null) {
            anonymousClass3mq2.f44428J.setGradientSpinnerVisible(true);
            anonymousClass3mq2.f44428J.setOnClickListener(new AnonymousClass3mn(anonymousClass3mp, R, anonymousClass3mq2));
        } else {
            anonymousClass3mq2.f44428J.setGradientSpinnerVisible(false);
            anonymousClass3mq2.f44428J.setOnClickListener(anonymousClass3mm);
        }
        AnonymousClass0cQ.H(this, 1399239810, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
