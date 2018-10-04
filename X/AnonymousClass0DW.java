package X;

import java.util.Comparator;

/* renamed from: X.0DW */
public final class AnonymousClass0DW implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass0DX anonymousClass0DX = (AnonymousClass0DX) obj;
        AnonymousClass0DX anonymousClass0DX2 = (AnonymousClass0DX) obj2;
        if (anonymousClass0DX.f1877C == anonymousClass0DX2.f1877C) {
            return 0;
        }
        return anonymousClass0DX.f1877C < anonymousClass0DX2.f1877C ? -1 : 1;
    }
}
