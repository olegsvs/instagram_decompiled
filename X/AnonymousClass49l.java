package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.arlink.fragment.NametagBackgroundController;

/* renamed from: X.49l */
public final class AnonymousClass49l implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ NametagBackgroundController f50993B;

    public AnonymousClass49l(NametagBackgroundController nametagBackgroundController) {
        this.f50993B = nametagBackgroundController;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 119776839);
        NametagBackgroundController nametagBackgroundController = this.f50993B;
        if (nametagBackgroundController.f67391C != AnonymousClass31B.EMOJI) {
            nametagBackgroundController.f67397I = (nametagBackgroundController.f67397I + 1) % AnonymousClass31D.values().length;
            NametagBackgroundController.B(nametagBackgroundController);
            AnonymousClass311.CONFIG_SELFIE_STICKER_CHANGED.m18207A().B("value", nametagBackgroundController.f67397I).H("capture_mode", false).R();
        } else if (!nametagBackgroundController.f67393E.D()) {
            nametagBackgroundController.f67393E.F(false);
        }
        AnonymousClass0cQ.L(this, -567477361, M);
    }
}
