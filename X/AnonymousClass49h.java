package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.arlink.ui.CoachMarkOverlay;

/* renamed from: X.49h */
public final class AnonymousClass49h {
    /* renamed from: N */
    private static final AnonymousClass0e5 f50969N = AnonymousClass0e5.C(40.0d, 7.0d);
    /* renamed from: B */
    public View f50970B;
    /* renamed from: C */
    public View f50971C;
    /* renamed from: D */
    public CoachMarkOverlay f50972D;
    /* renamed from: E */
    public final ViewStub f50973E;
    /* renamed from: F */
    public ViewGroup f50974F;
    /* renamed from: G */
    public final AnonymousClass0cN f50975G;
    /* renamed from: H */
    public AnonymousClass49g f50976H;
    /* renamed from: I */
    public final AnonymousClass0cN f50977I;
    /* renamed from: J */
    public final ViewGroup f50978J;
    /* renamed from: K */
    public TextView f50979K;
    /* renamed from: L */
    public View f50980L;
    /* renamed from: M */
    public TextView f50981M;

    public AnonymousClass49h(ViewGroup viewGroup) {
        this.f50978J = viewGroup;
        this.f50973E = (ViewStub) viewGroup.findViewById(C0164R.id.coach_mark_stub);
        AnonymousClass0e7 B = AnonymousClass0e6.B();
        AnonymousClass0cN C = B.C();
        AnonymousClass0e5 anonymousClass0e5 = f50969N;
        AnonymousClass0cN O = C.O(anonymousClass0e5);
        O.f7108F = true;
        this.f50975G = O.A(new AnonymousClass49b(this));
        O = B.C().O(anonymousClass0e5);
        O.f7108F = true;
        this.f50977I = O.A(new AnonymousClass49c(this));
    }

    /* renamed from: B */
    public static void m23445B(AnonymousClass49h anonymousClass49h, AnonymousClass49g anonymousClass49g) {
        if (anonymousClass49h.f50976H != anonymousClass49g) {
            anonymousClass49h.f50976H = anonymousClass49g;
            View findViewById = anonymousClass49h.f50978J.findViewById(anonymousClass49g.f50968F);
            CoachMarkOverlay coachMarkOverlay = anonymousClass49h.f50972D;
            boolean z = anonymousClass49g.f50966D;
            findViewById.setDrawingCacheEnabled(true);
            findViewById.buildDrawingCache();
            coachMarkOverlay.f36973B = Bitmap.createBitmap(findViewById.getDrawingCache());
            if (z) {
                coachMarkOverlay.f36974C.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_IN));
            } else {
                coachMarkOverlay.f36974C.setColorFilter(null);
            }
            findViewById.destroyDrawingCache();
            findViewById.setDrawingCacheEnabled(false);
            AnonymousClass0Nm.M(findViewById, coachMarkOverlay.f36975D);
            coachMarkOverlay.invalidate();
            anonymousClass49h.f50981M.setText(anonymousClass49g.f50967E);
            anonymousClass49h.f50979K.setText(anonymousClass49h.f50978J.getResources().getString(C0164R.string.tutorial_step_progress, new Object[]{Integer.valueOf(anonymousClass49g.f50965C), Integer.valueOf(AnonymousClass49g.values().length)}));
            int i = 8;
            anonymousClass49h.f50971C.setVisibility(anonymousClass49g.f50964B ? 0 : 8);
            View view = anonymousClass49h.f50970B;
            if (!anonymousClass49g.f50964B) {
                i = 0;
            }
            view.setVisibility(i);
            anonymousClass49h.f50980L.post(new AnonymousClass49e(anonymousClass49h, findViewById, anonymousClass49g));
        }
    }
}
