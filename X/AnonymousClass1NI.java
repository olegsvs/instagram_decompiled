package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.1NI */
public final class AnonymousClass1NI implements Comparator {
    public AnonymousClass1NI(AnonymousClass0Ez anonymousClass0Ez) {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
