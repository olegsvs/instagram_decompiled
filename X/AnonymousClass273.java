package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.273 */
public final class AnonymousClass273 implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.endsWith("_native");
    }
}
