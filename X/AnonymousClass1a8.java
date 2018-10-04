package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1a8 */
public final class AnonymousClass1a8 {
    /* renamed from: B */
    public static void m11906B(Context context, AnonymousClass5me anonymousClass5me, List list, SpannableStringBuilder spannableStringBuilder) {
        if (list != null) {
            if (!list.isEmpty()) {
                Map hashMap = new HashMap();
                for (AnonymousClass1IN anonymousClass1IN : list) {
                    Object stringBuilder;
                    StringBuilder stringBuilder2;
                    if (anonymousClass1IN.f16861C == AnonymousClass1IO.USER) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("@");
                        stringBuilder2.append(anonymousClass1IN.f16862D.f17227C);
                        stringBuilder = stringBuilder2.toString();
                    } else {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("#");
                        stringBuilder2.append(anonymousClass1IN.f16860B.f2793M);
                        stringBuilder = stringBuilder2.toString();
                    }
                    hashMap.put(stringBuilder, anonymousClass1IN);
                }
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                List C = AnonymousClass1a8.m11907C(spannableStringBuilder2, hashMap, AnonymousClass188.m9531D(spannableStringBuilder2));
                List C2 = AnonymousClass1a8.m11907C(spannableStringBuilder2, hashMap, AnonymousClass188.m9530C(spannableStringBuilder2));
                AnonymousClass3OU anonymousClass3OU = new AnonymousClass3OU();
                anonymousClass3OU.f40750D = (List) AnonymousClass0LH.m2927E(C);
                anonymousClass3OU.f40749C = (List) AnonymousClass0LH.m2927E(C2);
                AnonymousClass1YM anonymousClass1YM = new AnonymousClass1YM(anonymousClass3OU);
                int C3 = AnonymousClass0Ca.m937C(context, C0164R.color.bioTextEntityFontColor);
                AnonymousClass0ps anonymousClass0ps = new AnonymousClass0ps(spannableStringBuilder, anonymousClass1YM);
                anonymousClass0ps.f10767F = false;
                anonymousClass0ps.f10770I = C3;
                anonymousClass0ps.f10766E = false;
                anonymousClass0ps.f10764C = C3;
                anonymousClass0ps.m7888B(new AnonymousClass1aE(anonymousClass5me, hashMap)).m7889C(new AnonymousClass3OQ(anonymousClass5me, hashMap)).m7887A();
            }
        }
    }

    /* renamed from: C */
    private static List m11907C(String str, Map map, List list) {
        List arrayList = new ArrayList();
        for (AnonymousClass1Az anonymousClass1Az : list) {
            if (map.containsKey(str.substring(anonymousClass1Az.f15354D, anonymousClass1Az.f15352B).toLowerCase())) {
                arrayList.add(anonymousClass1Az);
            }
        }
        return arrayList;
    }
}
