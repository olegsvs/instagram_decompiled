package X;

import android.util.Pair;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.3tF */
public final class AnonymousClass3tF {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2pd f46020B;
    /* renamed from: C */
    public final /* synthetic */ VideoPlayRequest f46021C;

    public AnonymousClass3tF(AnonymousClass2pd anonymousClass2pd, VideoPlayRequest videoPlayRequest) {
        this.f46020B = anonymousClass2pd;
        this.f46021C = videoPlayRequest;
    }

    /* renamed from: A */
    public final void m21171A(AnonymousClass3ty anonymousClass3ty, AnonymousClass3ty anonymousClass3ty2, AnonymousClass3ty anonymousClass3ty3, AnonymousClass1eC anonymousClass1eC, int i, AnonymousClass2rg anonymousClass2rg, long j, long j2, long j3, long j4, boolean z) {
        AnonymousClass2pd.m17371T(this.f46020B, "buildRenderers onCompleted", new Object[0]);
        AnonymousClass2pd anonymousClass2pd = this.f46020B;
        AnonymousClass3ty anonymousClass3ty4 = anonymousClass3ty;
        AnonymousClass3ty anonymousClass3ty5 = anonymousClass3ty2;
        AnonymousClass3ty anonymousClass3ty6 = anonymousClass3ty3;
        AnonymousClass1eC anonymousClass1eC2 = anonymousClass1eC;
        int i2 = i;
        AnonymousClass2rg anonymousClass2rg2 = anonymousClass2rg;
        long j5 = j;
        AnonymousClass2pd.m17366O(anonymousClass2pd, new AnonymousClass2pZ(anonymousClass2pd, this.f46021C, anonymousClass3ty4, anonymousClass3ty5, anonymousClass3ty6, anonymousClass1eC2, i2, anonymousClass2rg2, j5, j2, j3, j4, z));
    }

    /* renamed from: B */
    public final void m21172B(String str, Exception exception) {
        AnonymousClass2pd.m17371T(this.f46020B, "buildRenderers onError: %s", exception.getMessage());
        AnonymousClass2pd anonymousClass2pd = this.f46020B;
        AnonymousClass2pd.m17367P(anonymousClass2pd, anonymousClass2pd.f34571L.obtainMessage(12, Pair.create(str, exception)));
    }
}
