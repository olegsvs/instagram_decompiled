package X;

import android.media.MediaCrypto;
import android.media.MediaDrm;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.3uM */
public final class AnonymousClass3uM implements AnonymousClass2s6 {
    /* renamed from: B */
    private final MediaDrm f46411B;

    public AnonymousClass3uM(UUID uuid) {
        this.f46411B = new MediaDrm((UUID) AnonymousClass2td.m17605D(uuid));
    }

    public final void BQA(AnonymousClass2s4 anonymousClass2s4) {
        this.f46411B.setOnEventListener(anonymousClass2s4 == null ? null : new AnonymousClass2s7(this, anonymousClass2s4));
    }

    public final byte[] FIA(byte[] bArr, byte[] bArr2) {
        return this.f46411B.provideKeyResponse(bArr, bArr2);
    }

    public final AnonymousClass2s5 GQ() {
        return new AnonymousClass3uL(this, this.f46411B.getProvisionRequest());
    }

    public final void HIA(byte[] bArr) {
        this.f46411B.provideProvisionResponse(bArr);
    }

    public final AnonymousClass2s3 bN(byte[] bArr, byte[] bArr2, String str, int i, HashMap hashMap) {
        return new AnonymousClass3uK(this, this.f46411B.getKeyRequest(bArr, bArr2, str, i, hashMap));
    }

    public final void jQA(String str, String str2) {
        this.f46411B.setPropertyString(str, str2);
    }

    public final AnonymousClass2s2 kF(UUID uuid, byte[] bArr) {
        return new AnonymousClass3uJ(new MediaCrypto(uuid, bArr));
    }

    public final void lE(byte[] bArr) {
        this.f46411B.closeSession(bArr);
    }

    public final byte[] yGA() {
        return this.f46411B.openSession();
    }
}
