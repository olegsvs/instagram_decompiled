package X;

import java.io.File;

/* renamed from: X.37B */
public final class AnonymousClass37B implements AnonymousClass0G4 {
    /* renamed from: B */
    public final AnonymousClass3xZ f38006B;

    public AnonymousClass37B(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            AnonymousClass2hO.m16929D(file);
            this.f38006B = new AnonymousClass3xZ(this, canonicalPath);
        } catch (Throwable e) {
            throw new RuntimeException("Unable to get canonical path", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.f38006B;
    }
}
