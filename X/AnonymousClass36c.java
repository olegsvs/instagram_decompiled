package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.36c */
public final class AnonymousClass36c {
    /* renamed from: B */
    private static final int[] f37858B = new int[]{C0164R.drawable.insights, C0164R.drawable.promote, C0164R.drawable.profile};
    /* renamed from: C */
    private static final int[] f37859C = new int[]{C0164R.drawable.instagram_business_images_business_new_props_followers, C0164R.drawable.instagram_business_images_business_new_props_megaphone, C0164R.drawable.instagram_business_images_business_new_props_contacts};
    /* renamed from: D */
    private static final int[] f37860D = new int[]{C0164R.drawable.instagram_business_images_props1, C0164R.drawable.instagram_business_images_props2, C0164R.drawable.instagram_business_images_props3};
    /* renamed from: E */
    private static final int[] f37861E = new int[]{C0164R.string.learn_about_follower, C0164R.string.create_promotions_message, C0164R.string.your_business_profile_message};
    /* renamed from: F */
    private static final int[] f37862F = new int[]{C0164R.string.get_insights, C0164R.string.create_promotions_value_props, C0164R.string.your_business_profile_value_props};

    /* renamed from: B */
    public static AnonymousClass3j7 m18530B(Context context, ViewGroup viewGroup, String str, boolean z, SlideCardViewModel slideCardViewModel) {
        ViewGroup viewGroup2 = viewGroup;
        if (str.equals("new_slide_card")) {
            return new AnonymousClass3j7(AnonymousClass36c.m18532D(context, f37859C, true, slideCardViewModel), viewGroup2, C0164R.layout.slide_card_new_illustrations, true, null);
        }
        if (z) {
            return new AnonymousClass3j7(AnonymousClass36c.m18532D(context, f37860D, true, slideCardViewModel), viewGroup2, C0164R.layout.slide_card_new, true, null);
        }
        return new AnonymousClass3j7(AnonymousClass36c.m18532D(context, f37858B, false, slideCardViewModel), viewGroup2, C0164R.layout.slide_card, true, null);
    }

    /* renamed from: C */
    public static void m18531C(ViewGroup viewGroup) {
        int[] iArr = f37858B;
        boolean z = iArr.length <= f37862F.length && iArr.length <= f37861E.length;
        AnonymousClass1mY.m13014E(z);
        for (int i = 0; i < f37858B.length; i++) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.row_value_props, viewGroup, false);
            viewGroup.addView(inflate);
            ((ImageView) inflate.findViewById(C0164R.id.row_image)).setImageResource(f37858B[i]);
            ((TextView) inflate.findViewById(C0164R.id.row_title)).setText(f37862F[i]);
            ((TextView) inflate.findViewById(C0164R.id.row_subtitle)).setText(f37861E[i]);
        }
    }

    /* renamed from: D */
    private static List m18532D(Context context, int[] iArr, boolean z, SlideCardViewModel slideCardViewModel) {
        int i = 0;
        boolean z2 = iArr.length <= f37862F.length && iArr.length <= f37861E.length;
        AnonymousClass1mY.m13014E(z2);
        List arrayList = new ArrayList();
        if (slideCardViewModel != null) {
            arrayList.add(slideCardViewModel);
        }
        while (i < iArr.length) {
            Object slideCardViewModel2;
            if (z) {
                slideCardViewModel2 = new SlideCardViewModel(0, iArr[i], null, null, context.getString(f37862F[i]), context.getString(f37861E[i]), null);
            } else {
                slideCardViewModel2 = SlideCardViewModel.m20499B(iArr[i], context.getString(f37862F[i]), context.getString(f37861E[i]));
            }
            arrayList.add(slideCardViewModel2);
            i++;
        }
        return arrayList;
    }
}
