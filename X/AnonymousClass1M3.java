package X;

import android.util.Base64OutputStream;
import com.facebook.common.dextricks.DexStore;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1M3 */
public final class AnonymousClass1M3 {
    /* renamed from: D */
    public static final Map f17511D = new HashMap();
    /* renamed from: E */
    public static int f17512E = 1;
    /* renamed from: B */
    public final Object f17513B = new Object();
    /* renamed from: C */
    public final File f17514C;

    public AnonymousClass1M3(File file) {
        this.f17514C = file;
    }

    /* renamed from: A */
    public final String m10940A() {
        InputStream fileInputStream;
        OutputStream base64OutputStream;
        try {
            fileInputStream = new FileInputStream(this.f17514C);
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) this.f17514C.length());
            base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            byte[] bArr = new byte[DexStore.LOAD_RESULT_MIXED_MODE];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    base64OutputStream.close();
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    fileInputStream.close();
                    base64OutputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[I/O error: ");
            stringBuilder.append(e.getMessage());
            stringBuilder.append("]");
            return stringBuilder.toString();
        } catch (Throwable th) {
            fileInputStream.close();
            base64OutputStream.close();
        }
    }
}
