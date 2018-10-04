package X;

import android.media.MediaCodec.CodecException;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.2qZ */
public final class AnonymousClass2qZ extends Exception {
    public AnonymousClass2qZ(AnonymousClass2qi anonymousClass2qi, Throwable th, boolean z, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoder init failed: [");
        stringBuilder.append(i);
        stringBuilder.append("], ");
        stringBuilder.append(anonymousClass2qi);
        super(stringBuilder.toString(), th);
        String str = i < 0 ? "neg_" : JsonProperty.USE_DEFAULT_NAME;
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
        stringBuilder.append(str);
        stringBuilder.append(Math.abs(i));
        stringBuilder.toString();
    }

    public AnonymousClass2qZ(AnonymousClass2qi anonymousClass2qi, Throwable th, boolean z, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoder init failed: ");
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(anonymousClass2qi);
        super(stringBuilder.toString(), th);
        if (AnonymousClass2u6.f35518F >= 21) {
            AnonymousClass2qZ.m17447B(th);
        }
    }

    /* renamed from: B */
    private static String m17447B(Throwable th) {
        return th instanceof CodecException ? ((CodecException) th).getDiagnosticInfo() : null;
    }
}
