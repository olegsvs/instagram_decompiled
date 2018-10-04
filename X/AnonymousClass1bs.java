package X;

import java.util.Comparator;

/* renamed from: X.1bs */
public final class AnonymousClass1bs implements Comparator {
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int length = str.length() - str2.length();
        return length == 0 ? str.compareTo(str2) : length;
    }
}
