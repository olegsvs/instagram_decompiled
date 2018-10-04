package X;

import java.io.File;
import java.util.Set;

/* renamed from: X.1Ff */
public final class AnonymousClass1Ff {
    /* renamed from: B */
    public static void m10360B(File file, Set set) {
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (!set.contains(str)) {
                        AnonymousClass1Ff.m10361C(new File(file, str).getAbsolutePath());
                    }
                }
            }
        }
    }

    /* renamed from: C */
    private static void m10361C(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    AnonymousClass1Ff.m10361C(file2.toString());
                }
            }
        }
        file.delete();
    }
}
