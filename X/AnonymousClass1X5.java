package X;

import android.view.View;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.ui.widget.imagebutton.IgImageButton;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.1X5 */
public final class AnonymousClass1X5 extends AnonymousClass0oo {
    /* renamed from: B */
    public final IgImageButton f19670B;
    /* renamed from: C */
    public final View f19671C;
    /* renamed from: D */
    public final View f19672D;
    /* renamed from: E */
    public final HashtagFollowButton f19673E;
    /* renamed from: F */
    public final CircularImageView f19674F;
    /* renamed from: G */
    public final IgImageButton f19675G;
    /* renamed from: H */
    public final TitleTextView f19676H;
    /* renamed from: I */
    public final TitleTextView f19677I;
    /* renamed from: J */
    public final IgImageButton f19678J;
    /* renamed from: K */
    public final FollowButton f19679K;

    public AnonymousClass1X5(View view, CircularImageView circularImageView, TitleTextView titleTextView, TitleTextView titleTextView2, FollowButton followButton, HashtagFollowButton hashtagFollowButton, View view2, IgImageButton igImageButton, IgImageButton igImageButton2, IgImageButton igImageButton3, String str) {
        super(view);
        this.f19671C = view;
        this.f19674F = circularImageView;
        this.f19677I = titleTextView;
        this.f19676H = titleTextView2;
        this.f19679K = followButton;
        this.f19679K.setClickPoint(str);
        this.f19673E = hashtagFollowButton;
        this.f19672D = view2;
        this.f19675G = igImageButton;
        this.f19678J = igImageButton2;
        this.f19670B = igImageButton3;
    }
}
