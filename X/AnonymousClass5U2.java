package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.creation.capture.quickcapture.music.search.MusicOverlayResultsListController;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5U2 */
public final class AnonymousClass5U2 extends AnonymousClass0IJ implements AnonymousClass4SM, AnonymousClass4SS, AnonymousClass3Lk {
    /* renamed from: B */
    public final List f64697B = new ArrayList();
    /* renamed from: C */
    public String f64698C;
    /* renamed from: D */
    public AnonymousClass4SN f64699D;
    /* renamed from: E */
    private String f64700E;
    /* renamed from: F */
    private String f64701F;
    /* renamed from: G */
    private AnonymousClass53X f64702G;
    /* renamed from: H */
    private MusicOverlayResultsListController f64703H;
    /* renamed from: I */
    private final AnonymousClass26S f64704I = new AnonymousClass26S(new Handler(Looper.getMainLooper()), new AnonymousClass4SR(this));
    /* renamed from: J */
    private AnonymousClass27y f64705J;
    /* renamed from: K */
    private AnonymousClass0Cm f64706K;

    public final String getModuleName() {
        return "music_overlay_search_results";
    }

    public final void Jx() {
        this.f64703H.m27832F();
    }

    public final void Nx(AnonymousClass4RM anonymousClass4RM, boolean z, Object obj) {
        if (AnonymousClass0LQ.B(mQ(), obj)) {
            this.f64703H.m27830D(anonymousClass4RM.f54072C, z);
        }
    }

    public final boolean UY() {
        return this.f64703H.m27828B();
    }

    public final boolean VY() {
        return this.f64703H.m27829C();
    }

    public final boolean XV() {
        return this.f64703H.m27827A();
    }

    /* renamed from: b */
    public final void m26983b(String str) {
        if (this.f64704I.A(str.trim())) {
            AnonymousClass53X anonymousClass53X = this.f64702G;
            if (anonymousClass53X != null) {
                anonymousClass53X.m25652G();
            }
            this.f64698C = JsonProperty.USE_DEFAULT_NAME;
            MusicOverlayResultsListController musicOverlayResultsListController = this.f64703H;
            if (musicOverlayResultsListController != null) {
                AnonymousClass4SE anonymousClass4SE = musicOverlayResultsListController.f66879B;
                anonymousClass4SE.f54223E.clear();
                AnonymousClass4SE.B(anonymousClass4SE);
            }
        }
    }

    public final void gC() {
        if (this.f64699D.A()) {
            this.f64699D.B(false);
        }
    }

    public final boolean hTA() {
        return TextUtils.isEmpty(this.f64698C) ^ 1;
    }

    public final Object mQ() {
        return this.f64698C;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1461742496);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f64706K = AnonymousClass0Ce.G(arguments);
        this.f64705J = (AnonymousClass27y) arguments.getSerializable("camera_upload_step");
        this.f64700E = arguments.getString("browse_session_full_id");
        this.f64701F = arguments.getString("browse_session_single_id");
        AnonymousClass27y anonymousClass27y = (AnonymousClass27y) arguments.getSerializable("camera_upload_step");
        bundle = arguments.getInt("list_bottom_padding_px");
        this.f64702G = new AnonymousClass53X(getContext(), this.f64706K);
        this.f64699D = new AnonymousClass4SN(this, this.f64706K, this);
        MusicOverlayResultsListController musicOverlayResultsListController = new MusicOverlayResultsListController(this, this.f64706K, new AnonymousClass2Fv("search", null), anonymousClass27y, this.f64702G, this, this.f64699D, false, bundle);
        this.f64703H = musicOverlayResultsListController;
        musicOverlayResultsListController.f66886I = this;
        registerLifecycleListener(this.f64703H);
        addFragmentVisibilityListener(this.f64703H);
        AnonymousClass0cQ.G(this, -1891509079, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1851117804);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_music_overlay_results, viewGroup, false);
        AnonymousClass0cQ.G(this, -1399471761, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -649607236);
        super.onDestroy();
        if (!this.f64697B.isEmpty()) {
            AnonymousClass0Cn anonymousClass0Cn = this.f64706K;
            String str = this.f64700E;
            List<AnonymousClass2G5> list = this.f64697B;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "music/search_session_tracking/";
            AnonymousClass0Pt M = anonymousClass0Pt.D("browse_session_id", str).M(AnonymousClass0Pv.class);
            try {
                String str2 = "search_sessions";
                Writer stringWriter = new StringWriter();
                JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
                createGenerator.writeStartArray();
                for (AnonymousClass2G5 anonymousClass2G5 : list) {
                    createGenerator.writeStartObject();
                    createGenerator.writeStringField("audio_asset_id", anonymousClass2G5.f28194I);
                    createGenerator.writeStringField("alacorn_session_id", anonymousClass2G5.f28187B);
                    createGenerator.writeStringField("type", "song_selection");
                    createGenerator.writeEndObject();
                }
                createGenerator.writeEndArray();
                createGenerator.close();
                M.D(str2, stringWriter.toString());
            } catch (Throwable e) {
                AnonymousClass0Gn.J("MusicOverlayApiUtil", "Failed to generate search session data", e);
            }
            AnonymousClass0Ix.D(M.H());
        }
        AnonymousClass0cQ.G(this, 1483719655, F);
    }

    public final AnonymousClass0Iu wF(String str) {
        AnonymousClass0Cn anonymousClass0Cn = this.f64706K;
        String str2 = this.f64700E;
        String str3 = this.f64698C;
        AnonymousClass27y anonymousClass27y = this.f64705J;
        String str4 = this.f64701F;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "music/search/";
        AnonymousClass0Pt M = anonymousClass0Pt.D("browse_session_id", str2).D("q", str3).D("upload_step", anonymousClass27y.A()).D("search_session_id", str4).M(AnonymousClass4RN.class);
        AnonymousClass4RK.C(M, str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("music/search/");
        stringBuilder.append(str3);
        AnonymousClass4RK.B(M, stringBuilder.toString(), 4000, str);
        return M.H();
    }

    public final void yw(AnonymousClass0Q6 anonymousClass0Q6) {
        this.f64703H.m27831E();
    }
}
