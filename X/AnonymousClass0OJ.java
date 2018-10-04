package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;

/* renamed from: X.0OJ */
public final class AnonymousClass0OJ implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ String f3867B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f3868C;

    public AnonymousClass0OJ(AnonymousClass0Cm anonymousClass0Cm, String str) {
        this.f3868C = anonymousClass0Cm;
        this.f3867B = str;
    }

    public final void run() {
        PendingMediaStore C = PendingMediaStore.m3537C();
        if (!C.m3540B(AnonymousClass0Ze.ALL_SHARES).isEmpty()) {
            Runnable anonymousClass3YU = new AnonymousClass3YU(this);
            int intValue = ((Integer) AnonymousClass0CC.bX.m846H(this.f3868C)).intValue();
            if (intValue > 0) {
                AnonymousClass0OR.m3626F(new Handler(Looper.getMainLooper()), anonymousClass3YU, (long) intValue, -869869854);
            } else {
                anonymousClass3YU.run();
            }
        }
        for (String A : new ArrayList(C.f3787B.keySet())) {
            AnonymousClass0OA A2 = C.m3539A(A);
            if (A2 != null) {
                if (A2.m3567M() > 0) {
                    AnonymousClass0O4 anonymousClass0O4 = AnonymousClass0O2.m3497B(this.f3868C).f2344F;
                    AnonymousClass0O4.m3512N(anonymousClass0O4, AnonymousClass0O4.m3505G(anonymousClass0O4, "pending_media_info", null, A2).m3298F("step", "pending_media_migrated").m3294B("render_duration_forecast", A2.m3567M()), A2.iC, A2);
                }
            }
        }
    }
}
