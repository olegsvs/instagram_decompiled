package X;

import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2HQ */
public final class AnonymousClass2HQ {
    /* renamed from: B */
    public static boolean m14917B(List list, String str) {
        if (list != null) {
            for (Tag A : list) {
                if (A.A().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static List m14918C(List list, List list2) {
        List arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 == null) {
            return list;
        }
        arrayList.removeAll(list2);
        return arrayList;
    }
}
