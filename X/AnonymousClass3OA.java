package X;

import android.content.Context;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.3OA */
public final class AnonymousClass3OA {
    /* renamed from: B */
    public static final String f40722B = "MediaHashtagsViewBinderHelper";

    /* renamed from: B */
    public static String m19509B(Context context, AnonymousClass0P7 anonymousClass0P7, boolean z) {
        int size = anonymousClass0P7.NB.size() - 1;
        if (size == 0) {
            return null;
        }
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" + ");
        stringBuilder.append(String.valueOf(size));
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        if (z) {
            str = JsonProperty.USE_DEFAULT_NAME;
        } else {
            str = context.getResources().getString(C0164R.string.more_hashtags_label);
        }
        stringBuilder2.append(str);
        return stringBuilder2.toString();
    }

    /* renamed from: C */
    public static void m19510C(AnonymousClass0pl anonymousClass0pl) {
        anonymousClass0pl.f10724O.setVisibility(8);
        anonymousClass0pl.f10713D.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3O6(anonymousClass0pl));
    }
}
