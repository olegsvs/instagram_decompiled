package X;

import android.content.Context;
import android.os.Build.VERSION;
import com.facebook.voltron.runtime.AppModuleFileUtil$ModuleResolver;
import java.io.File;
import java.io.IOException;

/* renamed from: X.09M */
public final class AnonymousClass09M {
    /* renamed from: B */
    public final File f1065B;

    public AnonymousClass09M(String str) {
        this(str, "modules");
    }

    public AnonymousClass09M(String str, String str2) {
        this.f1065B = new File(str, str2);
    }

    /* renamed from: A */
    public final void m595A(String str, String str2) {
        str2 = m593C(str, str2);
        if (!str2.exists()) {
            if (!str2.mkdirs()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error creating directory: ");
                stringBuilder.append(str2);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: B */
    public final File m596B(String str, String str2) {
        return new File(m593C(str, str2), "download.zip");
    }

    /* renamed from: B */
    public static void m592B(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File B : listFiles) {
                    AnonymousClass09M.m592B(B);
                }
            }
        }
        file.delete();
    }

    /* renamed from: C */
    public final File m597C(String str, String str2) {
        return new File(this.f1065B, AnonymousClass09M.m593C(str, str2));
    }

    /* renamed from: C */
    public static String m593C(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_");
        if (str2 == null) {
            str2 = "0";
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: D */
    public static boolean m594D(String str, Context context) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        String B = AppModuleFileUtil$ModuleResolver.m591B(str, context);
        if (B == null) {
            return false;
        }
        return new File(B).exists();
    }
}
