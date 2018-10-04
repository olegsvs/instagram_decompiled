package X;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0bI */
public final class AnonymousClass0bI extends AnonymousClass0Tb {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0bH f6703B;
    /* renamed from: C */
    private final Map f6704C = Collections.synchronizedMap(new HashMap());

    public AnonymousClass0bI(AnonymousClass0bH anonymousClass0bH) {
        this.f6703B = anonymousClass0bH;
    }

    /* renamed from: B */
    public final void mo1282B(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, ByteBuffer byteBuffer) {
        this.f6704C.put(anonymousClass0a8, Integer.valueOf(Integer.valueOf(this.f6704C.get(anonymousClass0a8) == null ? 0 : ((Integer) this.f6704C.get(anonymousClass0a8)).intValue()).intValue() + byteBuffer.limit()));
    }

    /* renamed from: C */
    public final void mo1401C(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA) {
        this.f6703B.f6700B.m3040A(anonymousClass0aA.f6460H, anonymousClass0aA.m5433A(), 1, (long) Integer.valueOf(this.f6704C.get(anonymousClass0a8) == null ? 0 : ((Integer) this.f6704C.get(anonymousClass0a8)).intValue()).intValue());
        this.f6704C.remove(anonymousClass0a8);
    }
}
