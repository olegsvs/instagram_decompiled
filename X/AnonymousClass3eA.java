package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.3eA */
public final class AnonymousClass3eA {
    /* renamed from: B */
    public static void m20290B(AnonymousClass3e9 anonymousClass3e9, Hashtag hashtag, Context context, int i, AnonymousClass3e8 anonymousClass3e8, boolean z, boolean z2, boolean z3, boolean z4) {
        ImageView imageView = anonymousClass3e9.f42967C;
        if (!z) {
            imageView.setImageDrawable(AnonymousClass0Ca.E(context, C0164R.drawable.instagram_hashtag_outline_24));
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.inner_padding);
            imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else if (TextUtils.isEmpty(hashtag.f2790J)) {
            IgImageView igImageView = (IgImageView) imageView;
            igImageView.setPlaceHolderColor(AnonymousClass0Ca.C(context, C0164R.color.grey_3));
            igImageView.F();
        } else {
            ((IgImageView) imageView).setUrl(hashtag.f2790J);
            imageView.setPadding(0, 0, 0, 0);
        }
        View view = anonymousClass3e9.f42967C;
        Resources resources = view.getContext().getResources();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        AnonymousClass0eY.E(marginLayoutParams, resources.getDimensionPixelSize(C0164R.dimen.avatar_extra_margin_left_list_redesign));
        AnonymousClass0eY.D(marginLayoutParams, resources.getDimensionPixelSize(C0164R.dimen.avatar_extra_margin_right_list_redesign));
        if (z) {
            anonymousClass3e9.f42966B.setVisibility(0);
            anonymousClass3e9.f42966B.B(AnonymousClass0ya.HASHTAG);
        } else {
            anonymousClass3e9.f42966B.setVisibility(8);
        }
        if (anonymousClass3e8 != null) {
            anonymousClass3e9.f42969E.setOnClickListener(new AnonymousClass3e6(anonymousClass3e8, hashtag, i));
            anonymousClass3e9.f42969E.setOnLongClickListener(new AnonymousClass3e7(anonymousClass3e8, hashtag));
        }
        anonymousClass3e9.f42968D.setText(AnonymousClass0IE.E("#%s", new Object[]{hashtag.f2793M}));
        CharSequence D = AnonymousClass3eA.m20292D(context, hashtag, z2);
        if (TextUtils.isEmpty(D)) {
            anonymousClass3e9.f42972H.setVisibility(8);
        } else {
            anonymousClass3e9.f42972H.setVisibility(0);
            anonymousClass3e9.f42972H.setText(D);
        }
        if (z3) {
            if (anonymousClass3e9.f42970F == null) {
                CheckBox checkBox = (CheckBox) anonymousClass3e9.f42971G.inflate();
                anonymousClass3e9.f42970F = checkBox;
                checkBox.setBackground(AnonymousClass31T.m18238F(checkBox.getContext(), AnonymousClass0G5.F(anonymousClass3e9.f42970F.getContext(), C0164R.attr.directPaletteColor5)));
            }
            CheckBox checkBox2 = anonymousClass3e9.f42970F;
            checkBox2.setVisibility(0);
            checkBox2.setChecked(z4);
            return;
        }
        CheckBox checkBox3 = anonymousClass3e9.f42970F;
        if (checkBox3 != null) {
            checkBox3.setVisibility(8);
        }
    }

    /* renamed from: C */
    public static View m20291C(Context context, ViewGroup viewGroup) {
        viewGroup = LayoutInflater.from(context).inflate(C0164R.layout.row_hashtag, viewGroup, false);
        context = new AnonymousClass3e9();
        context.f42967C = (IgImageView) viewGroup.findViewById(C0164R.id.row_search_hash_tag_image_view);
        context.f42966B = (ReelBrandingBadgeView) viewGroup.findViewById(C0164R.id.branding_badge);
        context.f42969E = viewGroup.findViewById(C0164R.id.row_hashtag_container);
        TextView textView = (TextView) viewGroup.findViewById(C0164R.id.row_hashtag_textview_tag_name);
        context.f42968D = textView;
        textView.getPaint().setFakeBoldText(true);
        context.f42972H = (TextView) viewGroup.findViewById(C0164R.id.row_hashtag_textview_tag_subtitle);
        context.f42971G = (ViewStub) viewGroup.findViewById(C0164R.id.selection_toggle_stub);
        viewGroup.setTag(context);
        return viewGroup;
    }

    /* renamed from: D */
    private static String m20292D(Context context, Hashtag hashtag, boolean z) {
        context = AnonymousClass19B.D(context.getResources(), hashtag.f2789I);
        if (!z) {
            if (hashtag.f2792L != null) {
                return hashtag.f2792L;
            }
            Object obj = hashtag.f2791K;
            if (!TextUtils.isEmpty(obj)) {
                return obj;
            }
            if (TextUtils.isEmpty(context)) {
                return null;
            }
        }
        return context;
    }
}
