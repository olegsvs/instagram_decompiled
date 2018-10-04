package X;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.188 */
public final class AnonymousClass188 {
    /* renamed from: B */
    public static List m9529B(String str) {
        List arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String findAddress = WebView.findAddress(str);
            if (findAddress == null) {
                break;
            }
            int indexOf = str.indexOf(findAddress);
            i += indexOf;
            if (i < 0) {
                break;
            }
            int length = findAddress.length() + i;
            arrayList.add(new AnonymousClass1Az(i, length, findAddress));
            str = str.substring(indexOf + findAddress.length());
            i = length;
        }
        return arrayList;
    }

    /* renamed from: C */
    public static List m9530C(String str) {
        str = AnonymousClass189.m9536D(str);
        List arrayList = new ArrayList();
        while (str.find()) {
            arrayList.add(new AnonymousClass1Az(str.start(1), str.end(1), str.group(1)));
        }
        return arrayList;
    }

    /* renamed from: D */
    public static List m9531D(String str) {
        str = AnonymousClass0IE.m2147O(str);
        List arrayList = new ArrayList();
        while (str.find()) {
            arrayList.add(new AnonymousClass1Az(str.start(1), str.end(1), str.group(1)));
        }
        return arrayList;
    }

    /* renamed from: E */
    public static List m9532E(String str) {
        Context context = AnonymousClass0EV.f1977B;
        String str2 = str;
        Iterable<AnonymousClass1w6> anonymousClass1w9 = new AnonymousClass1w9(PhoneNumberUtil.C(context), str2, AnonymousClass3a3.E(context).f28032B, AnonymousClass1wB.f24366C, Long.MAX_VALUE);
        List arrayList = new ArrayList();
        for (AnonymousClass1w6 anonymousClass1w6 : anonymousClass1w9) {
            arrayList.add(new AnonymousClass1Az(anonymousClass1w6.f24335C, anonymousClass1w6.A(), anonymousClass1w6.f24334B));
        }
        return arrayList;
    }

    /* renamed from: F */
    public static List m9533F(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        str = AnonymousClass0IE.f2729B.matcher(str);
        List arrayList = new ArrayList();
        while (str.find()) {
            arrayList.add(new AnonymousClass1Az(str.start(0), str.end(0), str.group(0)));
        }
        return arrayList;
    }
}
