package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.creation.capture.quickcapture.music.search.MusicOverlayResultsListController;
import com.instagram.reels.music.model.MusicSearchGenre;

/* renamed from: X.5Tt */
public final class AnonymousClass5Tt extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass4SM, AnonymousClass4SS, AnonymousClass3Lk {
    /* renamed from: G */
    public static String f64650G = "MusicOverlayMoodDetailResultsFragment.genre";
    /* renamed from: B */
    private MusicSearchGenre f64651B;
    /* renamed from: C */
    private AnonymousClass53X f64652C;
    /* renamed from: D */
    private MusicOverlayResultsListController f64653D;
    /* renamed from: E */
    private AnonymousClass4SN f64654E;
    /* renamed from: F */
    private AnonymousClass0Cm f64655F;

    public final String getModuleName() {
        return "music_overlay_genre_detail_results";
    }

    public final boolean hTA() {
        return true;
    }

    public final Object mQ() {
        return null;
    }

    public final void Jx() {
        this.f64653D.m27832F();
    }

    public final void Nx(AnonymousClass4RM anonymousClass4RM, boolean z, Object obj) {
        this.f64653D.m27830D(anonymousClass4RM.f54072C, z);
    }

    public final boolean UY() {
        return this.f64653D.m27828B();
    }

    public final boolean VY() {
        return this.f64653D.m27829C();
    }

    public final boolean XV() {
        return this.f64653D.m27827A();
    }

    public final void gC() {
        if (this.f64654E.A()) {
            this.f64654E.B(false);
        }
    }

    public final boolean onBackPressed() {
        getFragmentManager().L();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1782137922);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f64655F = AnonymousClass0Ce.G(arguments);
        this.f64651B = (MusicSearchGenre) arguments.getParcelable(f64650G);
        AnonymousClass27y anonymousClass27y = (AnonymousClass27y) arguments.getSerializable("camera_upload_step");
        bundle = arguments.getInt("list_bottom_padding_px");
        this.f64652C = new AnonymousClass53X(getContext(), this.f64655F);
        this.f64654E = new AnonymousClass4SN(this, this.f64655F, this);
        AnonymousClass0TK musicOverlayResultsListController = new MusicOverlayResultsListController(this, this.f64655F, new AnonymousClass2Fv("genres", this.f64651B.f31417C), anonymousClass27y, this.f64652C, this, this.f64654E, false, bundle);
        this.f64653D = musicOverlayResultsListController;
        registerLifecycleListener(musicOverlayResultsListController);
        this.f64654E.B(true);
        AnonymousClass0cQ.G(this, -1149420416, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1890954660);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_music_overlay_results_detail, viewGroup, false);
        AnonymousClass0cQ.G(this, -537598471, F);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass4SH.B(view.findViewById(C0164R.id.header_container), this.f64651B, new AnonymousClass5Ts(this));
    }

    public final AnonymousClass0Iu wF(String str) {
        AnonymousClass0Cn anonymousClass0Cn = this.f64655F;
        String str2 = this.f64651B.f31417C;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("music/genres/");
        stringBuilder.append(str2);
        stringBuilder.append("/");
        String stringBuilder2 = stringBuilder.toString();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = stringBuilder2;
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass4RN.class);
        AnonymousClass4RK.C(M, str);
        AnonymousClass4RK.B(M, stringBuilder2, 1000, str);
        return M.H();
    }

    public final void yw(AnonymousClass0Q6 anonymousClass0Q6) {
        this.f64653D.m27831E();
    }
}
