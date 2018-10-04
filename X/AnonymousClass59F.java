package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.instagram.ui.widget.balloonsview.BalloonsView;

/* renamed from: X.59F */
public final class AnonymousClass59F {
    /* renamed from: B */
    public BalloonsView f60567B;
    /* renamed from: C */
    public final View f60568C;

    public AnonymousClass59F(View view) {
        this.f60568C = view;
    }

    /* renamed from: B */
    public static void m25850B(AnonymousClass59F anonymousClass59F, AnonymousClass5J9 anonymousClass5J9) {
        BalloonsView balloonsView;
        if (anonymousClass59F.f60567B == null) {
            balloonsView = (BalloonsView) ((ViewStub) anonymousClass59F.f60568C.findViewById(C0164R.id.reel_reaction_balloons_viewstub)).inflate();
            anonymousClass59F.f60567B = balloonsView;
            balloonsView.setOnTouchListener(new AnonymousClass59E(anonymousClass59F));
        }
        balloonsView = anonymousClass59F.f60567B;
        anonymousClass59F.f60567B = balloonsView;
        balloonsView.setVisibility(0);
        anonymousClass59F.f60567B.setAnimationListener(new AnonymousClass5Zs(anonymousClass59F, anonymousClass5J9));
    }
}
