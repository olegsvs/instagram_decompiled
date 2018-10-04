package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.272 */
public final class AnonymousClass272 implements FilenameFilter {
    /* renamed from: B */
    public final /* synthetic */ FilenameFilter f26084B;

    public AnonymousClass272(AnonymousClass274 anonymousClass274, FilenameFilter filenameFilter) {
        this.f26084B = filenameFilter;
    }

    public final boolean accept(File file, String str) {
        return this.f26084B.accept(file, str) ^ 1;
    }
}
