package X;

import android.os.Bundle;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5Gj */
public final class AnonymousClass5Gj extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass0iO f61712B;
    /* renamed from: C */
    public AnonymousClass0Cm f61713C;

    public final String getModuleName() {
        return "settings_follow_and_invite_options";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.follow_and_invite_friends);
        anonymousClass0eT.n(true);
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25408B = AnonymousClass0ca.B(AnonymousClass0G5.D(getContext(), C0164R.attr.actionBarGlyphColor));
        anonymousClass0eT.d(B.B());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1514449706);
        super.onCreate(bundle);
        this.f61713C = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0Cm anonymousClass0Cm = this.f61713C;
        this.f61712B = new AnonymousClass0iO(anonymousClass0Cm, this, this, new AnonymousClass5Hr(this, anonymousClass0Cm));
        AnonymousClass0cQ.G(this, 754060516, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -947963742);
        super.onResume();
        Collection arrayList = new ArrayList();
        new AnonymousClass5Gi(this.f61712B, this, this, this.f61713C).m26126F(arrayList);
        setItems(arrayList);
        AnonymousClass0cQ.G(this, -2025366424, F);
    }
}
