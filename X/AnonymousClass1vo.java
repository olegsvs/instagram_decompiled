package X;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1vo */
public final class AnonymousClass1vo {
    /* renamed from: B */
    public static void m13801B(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        stringBuilder.append(str2);
        File file = new File(stringBuilder.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
    }

    /* renamed from: C */
    public static void m13802C(File file) {
        if (file.isDirectory()) {
            for (File C : file.listFiles()) {
                AnonymousClass1vo.m13802C(C);
            }
        }
        file.delete();
    }

    /* renamed from: D */
    public static File m13803D(Context context, String str, String str2) {
        File file = new File(context.getCacheDir(), str2);
        try {
            InputStream open = context.getAssets().open(str);
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        open.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                open.close();
            }
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not open ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString(), e);
        }
    }
}
