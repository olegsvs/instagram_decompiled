package X;

import java.util.Comparator;

/* renamed from: X.0XP */
public final class AnonymousClass0XP implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass0XJ anonymousClass0XJ = (AnonymousClass0XJ) obj;
        AnonymousClass0XJ anonymousClass0XJ2 = (AnonymousClass0XJ) obj2;
        int i = anonymousClass0XJ.f6135C;
        int i2 = anonymousClass0XJ2.f6135C;
        i2 = i < i2 ? -1 : i > i2 ? 1 : 0;
        return i2 != 0 ? i2 : AnonymousClass0XO.f6158B.f5988B.compare(anonymousClass0XJ.f6134B, anonymousClass0XJ2.f6134B);
    }
}
