package X;

import android.content.Context;
import android.media.MediaRecorder;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4mL */
public final class AnonymousClass4mL {
    /* renamed from: B */
    public final Context f57136B;
    /* renamed from: C */
    public AnonymousClass4mN f57137C;
    /* renamed from: D */
    public final AnonymousClass4mK f57138D;
    /* renamed from: E */
    public MediaRecorder f57139E;
    /* renamed from: F */
    public final AnonymousClass5Jc f57140F = new AnonymousClass5Jc(301, 200, new AnonymousClass5X8(this));

    public AnonymousClass4mL(Context context, AnonymousClass4mK anonymousClass4mK) {
        this.f57136B = context;
        this.f57138D = anonymousClass4mK;
    }

    /* renamed from: B */
    public static float m25039B(AnonymousClass4mL anonymousClass4mL) {
        return anonymousClass4mL.f57139E != null ? (float) Math.pow(2.0d, (Math.log10(AnonymousClass4mL.m25040C(anonymousClass4mL) / 2700.0d) * 20.0d) / 6.0d) : 0.0f;
    }

    /* renamed from: C */
    private static double m25040C(AnonymousClass4mL anonymousClass4mL) {
        MediaRecorder mediaRecorder = anonymousClass4mL.f57139E;
        return mediaRecorder != null ? (double) mediaRecorder.getMaxAmplitude() : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }
}
