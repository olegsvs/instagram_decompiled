package X;

import com.facebook.wifiscan.WifiScanResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.1jq */
public final class AnonymousClass1jq {
    /* renamed from: B */
    private static final Comparator f22011B = new AnonymousClass48J();

    /* renamed from: B */
    public static List m12791B(List list, int i, int i2, int i3) {
        if (list == null) {
            return new ArrayList();
        }
        int size = list.size();
        List arrayList = new ArrayList(list);
        Collections.sort(arrayList, f22011B);
        List arrayList2 = new ArrayList(Math.min(i3, arrayList.size()));
        for (int i4 = 0; i4 < size && arrayList2.size() < i3; i4++) {
            WifiScanResult wifiScanResult = (WifiScanResult) arrayList.get(i4);
            if (wifiScanResult.f22016F >= i || arrayList2.size() < i2) {
                arrayList2.add(wifiScanResult);
            }
        }
        return arrayList2;
    }
}
