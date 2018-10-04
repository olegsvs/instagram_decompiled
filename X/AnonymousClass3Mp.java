package X;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.UpdatableButton;

/* renamed from: X.3Mp */
public final class AnonymousClass3Mp extends AnonymousClass0oo {
    /* renamed from: B */
    public final CircularImageView f40520B;
    /* renamed from: C */
    public final View f40521C;
    /* renamed from: D */
    public final UpdatableButton f40522D;
    /* renamed from: E */
    public final AnonymousClass3lD f40523E;
    /* renamed from: F */
    public final TextView f40524F;
    /* renamed from: G */
    public final View f40525G;
    /* renamed from: H */
    public final FollowButton f40526H;
    /* renamed from: I */
    public final TextView f40527I;
    /* renamed from: J */
    public final View f40528J;
    /* renamed from: K */
    public final View f40529K;

    public AnonymousClass3Mp(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0IP anonymousClass0IP, AnonymousClass0Cm anonymousClass0Cm, View view) {
        super(view);
        this.f40521C = view.findViewById(C0164R.id.suggested_entity_card_container);
        this.f40520B = (CircularImageView) view.findViewById(C0164R.id.suggested_entity_card_image);
        this.f40527I = (TextView) view.findViewById(C0164R.id.suggested_entity_card_name);
        this.f40524F = (TextView) view.findViewById(C0164R.id.suggested_entity_card_context);
        this.f40525G = view.findViewById(C0164R.id.dismiss_button);
        FollowButton followButton = (FollowButton) view.findViewById(C0164R.id.suggested_user_card_follow_button);
        this.f40526H = followButton;
        followButton.setClickPoint("feed_suggested_user_carousel");
        this.f40522D = (UpdatableButton) view.findViewById(C0164R.id.suggested_entity_card_close_friend_button);
        UpdatableButton updatableButton = this.f40522D;
        if (updatableButton != null) {
            this.f40523E = new AnonymousClass3lD(activity, anonymousClass0EE, anonymousClass0IP, anonymousClass0Cm, updatableButton);
        } else {
            this.f40523E = null;
        }
        this.f40528J = view.findViewById(C0164R.id.suggested_user_card_new_badge);
        this.f40529K = view.findViewById(C0164R.id.suggested_entity_card_small_circle_new_badge);
    }
}
