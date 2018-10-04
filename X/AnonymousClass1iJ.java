package X;

import java.util.Comparator;

/* renamed from: X.1iJ */
public final class AnonymousClass1iJ implements Comparator {
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return AnonymousClass0Wx.f6072B.compare(str, str2);
    }
}
