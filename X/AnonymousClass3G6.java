package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.C0164R;

/* renamed from: X.3G6 */
public final class AnonymousClass3G6 {
    /* renamed from: B */
    public static SpannableStringBuilder m19167B(Context context, boolean z, int i, int i2) {
        Drawable F;
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.append(resources.getString(C0164R.string.internal_sticker_default_text));
        if (z) {
            int[] iArr = AnonymousClass27E.f26114D;
            AnonymousClass3GE.m19179D(spannableStringBuilder, resources, i, iArr);
            F = AnonymousClass0TJ.F(context, C0164R.drawable.ig_logo, iArr[0], iArr[1]);
        } else {
            AnonymousClass3GE.m19178C(spannableStringBuilder, resources, i);
            F = AnonymousClass0TJ.K(context, C0164R.drawable.ig_logo, C0164R.color.white);
        }
        AnonymousClass2Jd.m15023H(resources, F, i2);
        AnonymousClass2Jd.m15021F(spannableStringBuilder, 0, F);
        return spannableStringBuilder;
    }
}
