package X;

import android.content.Context;
import android.widget.Toast;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5xU */
public final class AnonymousClass5xU {
    /* renamed from: B */
    public static AnonymousClass0Iw m28670B(AnonymousClass0Pj anonymousClass0Pj, AnonymousClass6Eu anonymousClass6Eu, Context context, boolean z, int i, int i2, AnonymousClass0EE anonymousClass0EE) {
        return new AnonymousClass5xT(anonymousClass0Pj, anonymousClass6Eu, z, i, anonymousClass0EE, context, i2);
    }

    /* renamed from: C */
    public static void m28671C(AnonymousClass0Pj anonymousClass0Pj, AnonymousClass6Eu anonymousClass6Eu, boolean z, boolean z2, int i, AnonymousClass0EE anonymousClass0EE, Context context) {
        AnonymousClass0NN.B("ig_reel_one_tap_fb_sharing", anonymousClass0EE).F("request_type", (z ? AnonymousClass3ap.SHARE : AnonymousClass3ap.DELETE).toString()).H("response", z2).R();
        AnonymousClass14N anonymousClass14N = z ? z2 ? AnonymousClass14N.SHARING : AnonymousClass14N.NOT_SHARED : z2 ? AnonymousClass14N.UNSHARING : AnonymousClass14N.SHARED;
        ReelViewerFragment.c(anonymousClass6Eu.f73250B, anonymousClass0Pj, anonymousClass14N);
        Toast.makeText(context, i, 0).show();
    }
}
