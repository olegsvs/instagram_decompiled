package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.reels.fragment.ReelMoreOptionsFragment;

/* renamed from: X.5vR */
public final class AnonymousClass5vR implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ ReelMoreOptionsFragment f70049B;

    public AnonymousClass5vR(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        this.f70049B = reelMoreOptionsFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1658493314);
        ReelMoreOptionsFragment.G(this.f70049B, false);
        this.f70049B.f5163N.f28714B = JsonProperty.USE_DEFAULT_NAME;
        AnonymousClass0Nm.N(view);
        ReelMoreOptionsFragment.B(this.f70049B, AnonymousClass5vX.ALL_OPTIONS_HIDDEN);
        AnonymousClass0cQ.L(this, -2071941316, M);
    }
}
