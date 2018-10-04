package X;

import android.media.MediaFormat;
import android.os.Build.VERSION;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3oo */
public final class AnonymousClass3oo {
    /* renamed from: B */
    public boolean f44862B;
    /* renamed from: C */
    public int f44863C;
    /* renamed from: D */
    public int f44864D = -1;
    /* renamed from: E */
    public int f44865E = 384000;
    /* renamed from: F */
    public int f44866F = 15;
    /* renamed from: G */
    private int f44867G;
    /* renamed from: H */
    private int f44868H;
    /* renamed from: I */
    private AnonymousClass3ol f44869I;
    /* renamed from: J */
    private int f44870J;

    public AnonymousClass3oo(AnonymousClass3ol anonymousClass3ol, int i, int i2, int i3) {
        this.f44869I = anonymousClass3ol;
        this.f44870J = i;
        this.f44868H = i2;
        this.f44867G = i3;
    }

    /* renamed from: A */
    public final MediaFormat m20784A() {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f44869I.f44848B, this.f44870J, this.f44868H);
        createVideoFormat.setInteger("color-format", this.f44867G);
        int i = this.f44865E;
        if (i > 0) {
            createVideoFormat.setInteger(TraceFieldType.Bitrate, i);
        }
        i = this.f44866F;
        if (i > 0) {
            createVideoFormat.setInteger("frame-rate", i);
        }
        i = this.f44864D;
        if (i > -1) {
            createVideoFormat.setInteger("i-frame-interval", i);
        }
        if (this.f44862B && VERSION.SDK_INT >= 21) {
            createVideoFormat.setInteger("profile", 8);
            if (((Boolean) AnonymousClass0CC.dj.G()).booleanValue()) {
                createVideoFormat.setInteger("latency", 1);
            }
            createVideoFormat.setInteger("level", 256);
            createVideoFormat.setInteger(TraceFieldType.Bitrate, (int) ((((float) this.f44865E) / 100.0f) * ((float) this.f44863C)));
        }
        return createVideoFormat;
    }
}
