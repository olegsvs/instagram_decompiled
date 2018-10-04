package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.0JC */
public final class AnonymousClass0JC implements AnonymousClass0JB {
    /* renamed from: B */
    public final Context f2897B;
    /* renamed from: C */
    private final Handler f2898C = new Handler(Looper.getMainLooper());

    public AnonymousClass0JC(Context context) {
        this.f2897B = context.getApplicationContext();
    }

    public final void Wx(AnonymousClass0Cm anonymousClass0Cm, List list, AnonymousClass0VH anonymousClass0VH) {
        List A = anonymousClass0VH.m4869A();
        AnonymousClass0OR.m3624D(this.f2898C, new AnonymousClass0VW(this, this.f2897B.getString(anonymousClass0VH.f5676H ? C0164R.string.reel_reaction_composer_sent_confirmation : C0164R.string.reel_message_composer_sent_confirmation, new Object[]{AnonymousClass0VU.m4885D(A)})), -1446430799);
    }

    public final boolean lY(AnonymousClass0VH anonymousClass0VH) {
        anonymousClass0VH = anonymousClass0VH.f5673E;
        return anonymousClass0VH != null && (anonymousClass0VH.equals("reel") || anonymousClass0VH.equals("live_replay_reel"));
    }
}
