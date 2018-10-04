package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.3tg */
public final class AnonymousClass3tg {
    /* renamed from: A */
    public final AnonymousClass3ty m21182A(Context context, AnonymousClass2pd anonymousClass2pd, AnonymousClass1Gy anonymousClass1Gy, VideoPlayRequest videoPlayRequest, Handler handler) {
        if (videoPlayRequest.f15797M.f14747L == null) {
            return new AnonymousClass43b();
        }
        AnonymousClass2t7 anonymousClass43o;
        AnonymousClass2qi C = AnonymousClass2qi.m17461C("0", "application/x-subrip", -1, -2, null);
        if (AnonymousClass2lf.m17114B(videoPlayRequest.f15797M.f14747L, anonymousClass1Gy)) {
            anonymousClass43o = new AnonymousClass43o(context, anonymousClass1Gy.aC);
        } else {
            anonymousClass43o = AnonymousClass2kt.m17043B(anonymousClass1Gy.aC, null);
        }
        return new AnonymousClass45M(new AnonymousClass3tu(videoPlayRequest.f15797M.f14747L, anonymousClass43o, C), new AnonymousClass3tf(this, anonymousClass2pd), handler.getLooper(), new AnonymousClass2sx[0]);
    }
}
