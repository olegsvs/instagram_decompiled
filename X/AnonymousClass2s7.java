package X;

import android.media.MediaDrm;
import android.media.MediaDrm.OnEventListener;

/* renamed from: X.2s7 */
public final class AnonymousClass2s7 implements OnEventListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3uM f35178B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2s4 f35179C;

    public AnonymousClass2s7(AnonymousClass3uM anonymousClass3uM, AnonymousClass2s4 anonymousClass2s4) {
        this.f35178B = anonymousClass3uM;
        this.f35179C = anonymousClass2s4;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f35179C.wk(this.f35178B, bArr, i, i2, bArr2);
    }
}
