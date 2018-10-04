package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0yI */
public final class AnonymousClass0yI {
    /* renamed from: B */
    public static CharSequence m8625B(Context context, AnonymousClass0P7 anonymousClass0P7, boolean z) {
        List KA = anonymousClass0P7.KA();
        if (anonymousClass0P7.iB == 0) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        if (z && KA != null) {
            if (!KA.isEmpty()) {
                return AnonymousClass0yI.m8628E(context, anonymousClass0P7, KA, true, 3);
            }
        }
        return AnonymousClass0yI.m8627D(context.getResources(), anonymousClass0P7, false, AnonymousClass0G5.m1723D(context, C0164R.attr.textColorBoldLink));
    }

    /* renamed from: C */
    public static CharSequence m8626C(Context context, AnonymousClass0P7 anonymousClass0P7, boolean z) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(AnonymousClass0yI.m8627D(context.getResources(), anonymousClass0P7, true, AnonymousClass0G5.m1723D(context, C0164R.attr.textColorBoldLink)));
        List KA = anonymousClass0P7.KA();
        if (z && anonymousClass0P7.wY() && KA != null && !KA.isEmpty()) {
            spannableStringBuilder.append(context.getResources().getString(C0164R.string.dot_with_space));
            spannableStringBuilder.append(AnonymousClass0yI.m8628E(context, anonymousClass0P7, KA, false, 2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: D */
    private static SpannableStringBuilder m8627D(Resources resources, AnonymousClass0P7 anonymousClass0P7, boolean z, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            spannableStringBuilder.append(AnonymousClass19B.m9657F(C0164R.string.views, resources, anonymousClass0P7.FD));
        } else {
            spannableStringBuilder.append(AnonymousClass19B.m9654C(resources, anonymousClass0P7.iB));
        }
        spannableStringBuilder.setSpan(new AnonymousClass19P(true, i, z, anonymousClass0P7), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: E */
    private static CharSequence m8628E(Context context, AnonymousClass0P7 anonymousClass0P7, List list, boolean z, int i) {
        Resources resources = context.getResources();
        int D = AnonymousClass0G5.m1723D(context, C0164R.attr.textColorBoldLink);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(resources.getString(C0164R.string.liked_by)).append(" ");
        List arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("@");
            stringBuilder.append(str);
            arrayList.add(stringBuilder.toString());
        }
        int i2 = anonymousClass0P7.iB;
        if (i2 <= list.size() || !z) {
            int min = Math.min(arrayList.size(), i);
            if (min == 1) {
                spannableStringBuilder.append((CharSequence) arrayList.get(0));
            } else if (min == 2) {
                spannableStringBuilder.append(resources.getString(C0164R.string.x_and_y, new Object[]{arrayList.get(0), arrayList.get(1)}));
            } else {
                spannableStringBuilder.append(resources.getString(C0164R.string.x_y_and_z, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)}));
            }
        } else if (arrayList.size() == 1) {
            spannableStringBuilder.append(Html.fromHtml(resources.getQuantityString(C0164R.plurals.x_and_n_others, i2 - 1, new Object[]{arrayList.get(0), NumberFormat.getInstance(Locale.getDefault()).format((long) (i2 - 1))})));
        } else {
            spannableStringBuilder.append(Html.fromHtml(resources.getQuantityString(C0164R.plurals.x_y_and_n_others, i2 - 2, new Object[]{arrayList.get(0), arrayList.get(1), NumberFormat.getInstance(Locale.getDefault()).format((long) (i2 - 2))})));
        }
        AnonymousClass0ps anonymousClass0ps = new AnonymousClass0ps(spannableStringBuilder);
        anonymousClass0ps.f10766E = true;
        anonymousClass0ps.f10764C = D;
        anonymousClass0ps.f10780S = true;
        CharSequence A = anonymousClass0ps.m7889C(new AnonymousClass0yK(anonymousClass0P7, false)).m7888B(new AnonymousClass0pt(anonymousClass0P7)).m7887A();
        A.setSpan(new AnonymousClass1B4(anonymousClass0P7), 0, A.length(), 33);
        return A;
    }
}
