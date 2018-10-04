package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.creation.capture.quickcapture.music.search.MusicOverlayResultsListController;

/* renamed from: X.5U4 */
public final class AnonymousClass5U4 extends AnonymousClass0IJ implements AnonymousClass4SM, AnonymousClass4SS, AnonymousClass3Lk {
    /* renamed from: B */
    private AnonymousClass53X f64714B;
    /* renamed from: C */
    private MusicOverlayResultsListController f64715C;
    /* renamed from: D */
    private AnonymousClass4SN f64716D;
    /* renamed from: E */
    private AnonymousClass0Cm f64717E;

    public final String getModuleName() {
        return "music_overlay_trending_results";
    }

    public final boolean hTA() {
        return true;
    }

    public final Object mQ() {
        return null;
    }

    public final void Jx() {
        this.f64715C.m27832F();
    }

    public final void Nx(AnonymousClass4RM anonymousClass4RM, boolean z, Object obj) {
        this.f64715C.m27830D(anonymousClass4RM.f54072C, z);
    }

    public final boolean UY() {
        return this.f64715C.m27828B();
    }

    public final boolean VY() {
        return this.f64715C.m27829C();
    }

    public final boolean XV() {
        return this.f64715C.m27827A();
    }

    public final void gC() {
        if (this.f64716D.A()) {
            this.f64716D.B(false);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -269790433);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f64717E = AnonymousClass0Ce.G(arguments);
        AnonymousClass27y anonymousClass27y = (AnonymousClass27y) arguments.getSerializable("camera_upload_step");
        bundle = arguments.getInt("list_bottom_padding_px");
        this.f64714B = new AnonymousClass53X(getContext(), this.f64717E);
        this.f64716D = new AnonymousClass4SN(this, this.f64717E, this);
        AnonymousClass0TK musicOverlayResultsListController = new MusicOverlayResultsListController(this, this.f64717E, new AnonymousClass2Fv("trending", null), anonymousClass27y, this.f64714B, this, this.f64716D, true, bundle);
        this.f64715C = musicOverlayResultsListController;
        registerLifecycleListener(musicOverlayResultsListController);
        addFragmentVisibilityListener(this.f64715C);
        this.f64716D.B(true);
        AnonymousClass0cQ.G(this, -1988769121, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -136098628);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_music_overlay_results, viewGroup, false);
        AnonymousClass0cQ.G(this, -1596820123, F);
        return inflate;
    }

    public final AnonymousClass0Iu wF(String str) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f64717E);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        String str2 = "music/trending/";
        anonymousClass0Pt.f4229M = str2;
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass4RN.class);
        AnonymousClass4RK.C(M, str);
        AnonymousClass4RK.B(M, str2, 1000, str);
        return M.H();
    }

    public final void yw(AnonymousClass0Q6 anonymousClass0Q6) {
        this.f64715C.m27831E();
    }
}
