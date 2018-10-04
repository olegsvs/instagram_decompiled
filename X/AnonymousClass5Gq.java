package X;

import android.os.Bundle;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5Gq */
public final class AnonymousClass5Gq extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass0Cm f61719B;

    public final String getModuleName() {
        return "settings_help_options";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.instagram_help);
        anonymousClass0eT.n(getFragmentManager().H() > 0);
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25408B = AnonymousClass0ca.B(AnonymousClass0G5.D(getContext(), C0164R.attr.actionBarGlyphColor));
        anonymousClass0eT.d(B.B());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1914170046);
        super.onCreate(bundle);
        this.f61719B = AnonymousClass0Ce.G(getArguments());
        AnonymousClass5Gp anonymousClass5Gp = new AnonymousClass5Gp(this.f61719B, this);
        Collection arrayList = new ArrayList();
        anonymousClass5Gp.m26128A(arrayList);
        setItems(arrayList);
        AnonymousClass0cQ.G(this, -1251962069, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1054470077);
        super.onResume();
        AnonymousClass0cQ.G(this, -1398256309, F);
    }
}
