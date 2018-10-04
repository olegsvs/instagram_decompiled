package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.008 */
public final class AnonymousClass008 implements Comparator {
    public AnonymousClass008(AnonymousClass0DE anonymousClass0DE) {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
    }
}
