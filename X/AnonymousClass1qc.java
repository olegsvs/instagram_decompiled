package X;

import java.io.File;

/* renamed from: X.1qc */
public final class AnonymousClass1qc {
    /* renamed from: B */
    public static boolean f23312B;

    /* renamed from: B */
    public static File m13424B(File file) {
        if (f23312B) {
            File file2 = new File(file, "browser_proc");
            if (file2.isDirectory() || file2.mkdirs()) {
                return file2;
            }
        }
        return file;
    }

    /* renamed from: C */
    public static String m13425C(String str) {
        return (f23312B && "webview".equals(str)) ? "browser_proc_webview" : str;
    }
}
