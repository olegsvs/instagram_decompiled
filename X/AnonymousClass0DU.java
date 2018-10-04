package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.0DU */
public final class AnonymousClass0DU implements FilenameFilter {
    /* renamed from: B */
    public final /* synthetic */ String[] f1873B;

    public AnonymousClass0DU(AnonymousClass0DF anonymousClass0DF, String[] strArr) {
        this.f1873B = strArr;
    }

    public final boolean accept(File file, String str) {
        for (String endsWith : this.f1873B) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }
}
