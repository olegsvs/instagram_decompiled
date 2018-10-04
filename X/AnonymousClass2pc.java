package X;

import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.2pc */
public final class AnonymousClass2pc implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3tH f34558B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2pk f34559C;
    /* renamed from: D */
    public final /* synthetic */ VideoPlayRequest f34560D;

    public AnonymousClass2pc(AnonymousClass3tH anonymousClass3tH, AnonymousClass2pk anonymousClass2pk, VideoPlayRequest videoPlayRequest) {
        this.f34558B = anonymousClass3tH;
        this.f34559C = anonymousClass2pk;
        this.f34560D = videoPlayRequest;
    }

    public final void run() {
        AnonymousClass2pd.m17353B(this.f34558B.f46023B, this.f34559C, this.f34560D, (DynamicPlayerSettings) this.f34558B.f46023B.f34565F.get());
    }
}
