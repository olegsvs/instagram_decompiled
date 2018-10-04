package X;

import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.24W */
public final class AnonymousClass24W implements AnonymousClass0al {
    /* renamed from: B */
    public volatile boolean f25620B;
    /* renamed from: C */
    public Handler f25621C;
    /* renamed from: D */
    public volatile boolean f25622D;
    /* renamed from: E */
    public final Runnable f25623E = new AnonymousClass24V(this);
    /* renamed from: F */
    private final AnonymousClass0al f25624F;
    /* renamed from: G */
    private boolean f25625G;
    /* renamed from: H */
    private final MemoryInfo f25626H;
    /* renamed from: I */
    private final AnonymousClass0al f25627I;
    /* renamed from: J */
    private final long f25628J;

    public AnonymousClass24W(int i, boolean z) {
        double maxMemory = (double) Runtime.getRuntime().maxMemory();
        double d = (double) i;
        Double.isNaN(d);
        d /= 100.0d;
        Double.isNaN(maxMemory);
        this.f25628J = Math.round(maxMemory * d);
        this.f25625G = z;
        this.f25627I = AnonymousClass0aS.C();
        this.f25624F = new AnonymousClass24N();
        this.f25626H = new MemoryInfo();
        if (z) {
            Handler handler = new Handler(AnonymousClass0NZ.B());
            this.f25621C = handler;
            AnonymousClass0OR.F(handler, this.f25623E, 1000, 1911871426);
        }
    }

    /* renamed from: B */
    public static boolean m14337B(AnonymousClass24W anonymousClass24W) {
        Debug.getMemoryInfo(anonymousClass24W.f25626H);
        anonymousClass24W.f25622D = ((long) (anonymousClass24W.f25626H.otherPrivateDirty * DexStore.LOAD_RESULT_MIXED_MODE)) < anonymousClass24W.f25628J;
        anonymousClass24W.f25620B = false;
        return anonymousClass24W.f25622D;
    }

    /* renamed from: C */
    private boolean m14338C() {
        if (this.f25625G) {
            return this.f25622D;
        }
        return AnonymousClass24W.m14337B(this);
    }

    public final AnonymousClass0lc IG(int i, byte[] bArr, int i2, int i3) {
        this.f25620B = true;
        if (m14338C()) {
            return this.f25627I.IG(i, bArr, i2, i3);
        }
        return this.f25624F.IG(i, bArr, i2, i3);
    }
}
