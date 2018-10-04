package X;

import android.content.res.Configuration;
import java.io.File;

/* renamed from: X.0CH */
public abstract class AnonymousClass0CH implements AnonymousClass0C8 {
    private static String processName;

    public File getCacheDir(File file) {
        return file;
    }

    public String getDir(String str, int i) {
        return str;
    }

    public void onConfigurationChangedCallback(Configuration configuration) {
    }

    public static String currentProcessName() {
        return processName;
    }

    public void onCreate(String str, long j, long j2) {
        processName = str;
    }
}
