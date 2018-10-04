package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import org.apache.http.client.HttpResponseException;

/* renamed from: X.3ZH */
public final class AnonymousClass3ZH implements AnonymousClass0aK {
    /* renamed from: K */
    private static final Class f42292K = AnonymousClass3ZH.class;
    /* renamed from: B */
    private boolean f42293B;
    /* renamed from: C */
    private final WeakReference f42294C;
    /* renamed from: D */
    private final AnonymousClass1uC f42295D;
    /* renamed from: E */
    private final long f42296E;
    /* renamed from: F */
    private final AnonymousClass1uA f42297F;
    /* renamed from: G */
    private final AnonymousClass1uB f42298G;
    /* renamed from: H */
    private AnonymousClass0qA f42299H;
    /* renamed from: I */
    private ByteArrayOutputStream f42300I = new ByteArrayOutputStream();
    /* renamed from: J */
    private final AnonymousClass3ZS f42301J;

    public AnonymousClass3ZH(AnonymousClass1uB anonymousClass1uB, AnonymousClass1uA anonymousClass1uA, WeakReference weakReference, AnonymousClass1uC anonymousClass1uC, long j, AnonymousClass3ZS anonymousClass3ZS) {
        this.f42298G = anonymousClass1uB;
        this.f42297F = anonymousClass1uA;
        this.f42294C = weakReference;
        this.f42295D = anonymousClass1uC;
        this.f42296E = j;
        this.f42301J = anonymousClass3ZS;
    }

    /* renamed from: B */
    private void m20020B() {
        AnonymousClass0Du.C(this.f42300I);
        AnonymousClass3ZJ anonymousClass3ZJ = (AnonymousClass3ZJ) this.f42294C.get();
        if (anonymousClass3ZJ != null) {
            anonymousClass3ZJ.f42304B.remove(this.f42297F);
        }
    }

    public final void Zx(AnonymousClass0qA anonymousClass0qA) {
        int I = AnonymousClass0cQ.I(this, 888218088);
        this.f42299H = anonymousClass0qA;
        Integer.valueOf(anonymousClass0qA.f10880D);
        Collections.unmodifiableList(anonymousClass0qA.f10878B);
        this.f42300I = new ByteArrayOutputStream();
        this.f42293B = false;
        AnonymousClass0cQ.H(this, 746506289, I);
    }

    public final void el(IOException iOException) {
        int I = AnonymousClass0cQ.I(this, -1517201152);
        AnonymousClass0Dc.C(f42292K, "onFailed()", iOException);
        m20020B();
        this.f42298G.mo2987B(iOException, true);
        AnonymousClass0cQ.H(this, 1224670347, I);
    }

    public final void gs(ByteBuffer byteBuffer) {
        int I = AnonymousClass0cQ.I(this, -1364651690);
        ByteArrayOutputStream byteArrayOutputStream = this.f42300I;
        if (!(byteArrayOutputStream == null || this.f42293B)) {
            try {
                byteArrayOutputStream.write(byteBuffer.array(), 0, byteBuffer.limit());
            } catch (Throwable e) {
                this.f42293B = true;
                AnonymousClass0Dc.C(AnonymousClass3ZJ.class, "Exception while writing response stream", e);
            }
        }
        AnonymousClass0cQ.H(this, 426484695, I);
    }

    public final void onComplete() {
        int I = AnonymousClass0cQ.I(this, -1205529085);
        long E = AnonymousClass0Gd.E() - this.f42296E;
        if (this.f42295D == AnonymousClass1uC.GET) {
            Long.valueOf(E);
            AnonymousClass2bI anonymousClass2bI = this.f42301J.f42316B;
            AnonymousClass0O4 anonymousClass0O4 = anonymousClass2bI.f31392B;
            AnonymousClass0OA anonymousClass0OA = anonymousClass2bI.f31393C;
            AnonymousClass0NN G = AnonymousClass0O4.G(anonymousClass0O4, "fbupload_get_rtt_time", null, anonymousClass0OA);
            G.C("rtt_time_ms", E);
            AnonymousClass0O4.N(anonymousClass0O4, G, anonymousClass0OA.iC, anonymousClass0OA);
        }
        String byteArrayOutputStream = this.f42300I.toString();
        int i = this.f42299H.f10880D;
        if (!this.f42299H.C()) {
            int i2 = this.f42299H.f10880D;
            int i3 = (400 > i2 || i2 >= StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS) ? 0 : 1;
            this.f42298G.mo2987B(new HttpResponseException(i, AnonymousClass0IE.E("status code: %s\n%s", new Object[]{Integer.valueOf(i), byteArrayOutputStream})), i3 ^ true);
        } else if (this.f42293B) {
            this.f42298G.mo2987B(new RuntimeException("Response stream not initialized correctly"), true);
        } else {
            this.f42298G.mo2986A(byteArrayOutputStream);
        }
        m20020B();
        AnonymousClass0cQ.H(this, 805767242, I);
    }
}
