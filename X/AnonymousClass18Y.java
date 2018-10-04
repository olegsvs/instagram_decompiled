package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.18Y */
public abstract class AnonymousClass18Y {
    /* renamed from: B */
    public static Iterable m9627B(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.dc)).booleanValue()) {
            str = AnonymousClass0IE.m2150R(str);
        }
        str = str.split(" ");
        Iterable arrayList = new ArrayList(str.length);
        for (String str2 : str) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
