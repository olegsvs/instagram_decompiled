package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.0yb */
public final class AnonymousClass0yb {
    /* renamed from: B */
    public static void m8643B(IgImageView igImageView, Hashtag hashtag) {
        if (TextUtils.isEmpty(hashtag.f2790J)) {
            igImageView.setImageDrawable(AnonymousClass0Ca.m939E(igImageView.getContext(), C0164R.drawable.instagram_hashtag_outline_24));
            int dimensionPixelSize = igImageView.getContext().getResources().getDimensionPixelSize(C0164R.dimen.hashtag_image_header_view_padding);
            igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return;
        }
        igImageView.setUrl(hashtag.f2790J);
        igImageView.setPadding(0, 0, 0, 0);
    }

    /* renamed from: C */
    public static void m8644C(GradientSpinnerAvatarView gradientSpinnerAvatarView, Hashtag hashtag) {
        if (TextUtils.isEmpty(hashtag.f2790J)) {
            gradientSpinnerAvatarView.f12679B.setImageDrawable(AnonymousClass0Ca.m939E(gradientSpinnerAvatarView.getContext(), C0164R.drawable.instagram_hashtag_outline_24));
            GradientSpinnerAvatarView.m8605C(gradientSpinnerAvatarView, null);
            int dimensionPixelSize = gradientSpinnerAvatarView.getContext().getResources().getDimensionPixelSize(C0164R.dimen.hashtag_image_row_view_padding);
            gradientSpinnerAvatarView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return;
        }
        gradientSpinnerAvatarView.m8607B(hashtag.f2790J, null);
        gradientSpinnerAvatarView.setPadding(0, 0, 0, 0);
    }

    /* renamed from: D */
    public static void m8645D(Context context) {
        AnonymousClass0IG.m2162D(context, context.getString(C0164R.string.follow_hashtag_error));
    }

    /* renamed from: E */
    public static void m8646E(Context context) {
        AnonymousClass0IG.m2162D(context, context.getString(C0164R.string.unfollow_hashtag_error));
    }
}
