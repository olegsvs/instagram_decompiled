package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;

/* renamed from: X.3iR */
public final class AnonymousClass3iR {
    /* renamed from: B */
    public static CharSequence m20471B(Product product, Context context, Integer num) {
        AnonymousClass0Sj anonymousClass0Sj = product.f4993O;
        if (anonymousClass0Sj.equals(AnonymousClass0Sj.APPROVED)) {
            return AnonymousClass1fg.C(product, context, num);
        }
        int i;
        CharSequence B = AnonymousClass1fg.B(product.f4993O, context, false);
        if (anonymousClass0Sj.equals(AnonymousClass0Sj.PENDING)) {
            i = C0164R.style.PendingReviewSubtitleStyle;
        } else {
            i = C0164R.style.NotApprovedSubtitleStyle;
        }
        CharSequence spannableString = new SpannableString(B);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, spannableString.length(), 33);
        return spannableString;
    }
}
