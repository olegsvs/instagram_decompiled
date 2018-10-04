package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.2w1 */
public final class AnonymousClass2w1 {
    /* renamed from: B */
    public static void m17850B(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: C */
    public static void m17851C(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("csd-");
            stringBuilder.append(i);
            mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
