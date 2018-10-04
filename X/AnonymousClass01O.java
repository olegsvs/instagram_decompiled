package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.01O */
public final class AnonymousClass01O implements Comparator {
    public AnonymousClass01O(AnonymousClass0Ez anonymousClass0Ez) {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
