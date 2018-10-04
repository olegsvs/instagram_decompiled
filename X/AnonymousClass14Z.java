package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.reels.viewer.ReelViewGroup;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.14Z */
public final class AnonymousClass14Z implements AnonymousClass14a, AnonymousClass14c, AnonymousClass14d, AnonymousClass5Cl {
    public final View AB;
    /* renamed from: B */
    public final Runnable f13912B;
    public final ScalingTextureView BB;
    /* renamed from: C */
    public final AnonymousClass15N f13913C;
    public final TextView CB;
    /* renamed from: D */
    public final View f13914D;
    public final TextView DB;
    /* renamed from: E */
    public final View f13915E;
    public final LinearLayout EB;
    /* renamed from: F */
    public final AnonymousClass0zD f13916F;
    public final AnonymousClass153 FB;
    /* renamed from: G */
    public ReelBrandingBadgeView f13917G;
    public final View GB;
    /* renamed from: H */
    public final ViewStub f13918H;
    public final View HB;
    /* renamed from: I */
    public final IgImageView f13919I;
    public final View IB;
    /* renamed from: J */
    public final AnonymousClass15H f13920J;
    public final AnonymousClass0ct JB;
    /* renamed from: K */
    public View f13921K;
    public final AnonymousClass0ct KB;
    /* renamed from: L */
    public final ViewStub f13922L;
    private String LB;
    /* renamed from: M */
    public View f13923M;
    private AnonymousClass0ct MB;
    /* renamed from: N */
    public final ViewStub f13924N;
    private AnonymousClass0ct NB;
    /* renamed from: O */
    public FollowButton f13925O;
    /* renamed from: P */
    public final ViewStub f13926P;
    /* renamed from: Q */
    public AnonymousClass15S f13927Q;
    /* renamed from: R */
    public final AnonymousClass0ct f13928R;
    /* renamed from: S */
    public TextView f13929S;
    /* renamed from: T */
    public final IgProgressImageView f13930T;
    /* renamed from: U */
    public final IgImageView f13931U;
    /* renamed from: V */
    public boolean f13932V = false;
    /* renamed from: W */
    public AnonymousClass0QE f13933W;
    /* renamed from: X */
    public final Rect f13934X;
    /* renamed from: Y */
    public final ColorFilterAlphaImageView f13935Y;
    /* renamed from: Z */
    public AnonymousClass0Qf f13936Z;
    /* renamed from: a */
    public final MediaFrameLayout f13937a;
    /* renamed from: b */
    public final AnonymousClass0vR f13938b;
    /* renamed from: c */
    public TextView f13939c;
    /* renamed from: d */
    public final ViewStub f13940d;
    /* renamed from: e */
    public final AnonymousClass15O f13941e;
    /* renamed from: f */
    public final AnonymousClass5Ci f13942f;
    /* renamed from: g */
    public final View f13943g;
    /* renamed from: h */
    public final IgImageView f13944h;
    /* renamed from: i */
    public final AnonymousClass15I f13945i;
    /* renamed from: j */
    public final AnonymousClass15V f13946j;
    /* renamed from: k */
    public final SegmentedProgressBar f13947k;
    /* renamed from: l */
    public final AnonymousClass15L f13948l;
    /* renamed from: m */
    public AnonymousClass0Pj f13949m;
    /* renamed from: n */
    public AnonymousClass14s f13950n;
    /* renamed from: o */
    public AnonymousClass3b5 f13951o;
    /* renamed from: p */
    public final AnonymousClass0ct f13952p;
    /* renamed from: q */
    public final ReelViewGroup f13953q;
    /* renamed from: r */
    public AnonymousClass14t f13954r;
    /* renamed from: s */
    public boolean f13955s;
    /* renamed from: t */
    public final AnonymousClass15M f13956t;
    /* renamed from: u */
    public final TextView f13957u;
    /* renamed from: v */
    public final AnonymousClass5BG f13958v;
    /* renamed from: w */
    public final AnonymousClass5BJ f13959w;
    /* renamed from: x */
    public int f13960x;
    /* renamed from: y */
    public double f13961y;
    /* renamed from: z */
    public boolean f13962z;

    public AnonymousClass14Z(ViewGroup viewGroup) {
        AnonymousClass0ct anonymousClass0ct = new AnonymousClass0ct((ViewStub) viewGroup.findViewById(C0164R.id.reel_viewer_loading_spinner_stub));
        this.f13952p = anonymousClass0ct;
        anonymousClass0ct.f7268B = new AnonymousClass15x(this);
        this.IB = viewGroup.findViewById(C0164R.id.video_loading_spinner);
        this.f13947k = (SegmentedProgressBar) viewGroup.findViewById(C0164R.id.reel_viewer_progress_bar);
        View findViewById = viewGroup.findViewById(C0164R.id.back_shadow_affordance);
        this.f13915E = findViewById;
        findViewById.setBackgroundResource(AnonymousClass0e8.m6200D(viewGroup.getContext()) ? C0164R.drawable.reel_viewer_shadow_right : C0164R.drawable.reel_viewer_shadow_left);
        this.EB = (LinearLayout) viewGroup.findViewById(C0164R.id.reel_item_toolbar_container);
        this.FB = new AnonymousClass153((ViewGroup) viewGroup.findViewById(C0164R.id.toolbar_container));
        this.f13953q = (ReelViewGroup) viewGroup.findViewById(C0164R.id.reel_mention_overlay);
        this.BB = (ScalingTextureView) viewGroup.findViewById(C0164R.id.reel_viewer_texture_view);
        this.HB = viewGroup.findViewById(C0164R.id.reel_viewer_top_shadow);
        this.f13914D = viewGroup.findViewById(C0164R.id.reel_viewer_attribution);
        this.f13943g = viewGroup.findViewById(C0164R.id.profile_picture_container);
        IgImageView igImageView = (IgImageView) viewGroup.findViewById(C0164R.id.reel_viewer_profile_picture);
        this.f13944h = igImageView;
        ScaleType scaleType = ScaleType.CENTER_CROP;
        igImageView.setScaleType(scaleType);
        this.AB = viewGroup.findViewById(C0164R.id.reel_viewer_text_container);
        this.DB = (TextView) viewGroup.findViewById(C0164R.id.reel_viewer_title);
        this.CB = (TextView) viewGroup.findViewById(C0164R.id.reel_viewer_timestamp);
        this.f13957u = (TextView) viewGroup.findViewById(C0164R.id.reel_viewer_subtitle);
        this.f13937a = (MediaFrameLayout) viewGroup.findViewById(C0164R.id.reel_viewer_media_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) viewGroup.findViewById(C0164R.id.reel_viewer_image_view);
        this.f13930T = igProgressImageView;
        igProgressImageView.getIgImageView().setScaleType(scaleType);
        this.f13930T.setPlaceHolderColor(AnonymousClass0Ca.m937C(viewGroup.getContext(), C0164R.color.grey_9));
        this.f13930T.setProgressBarDrawable(AnonymousClass0Ca.m939E(viewGroup.getContext(), C0164R.drawable.reel_image_determinate_progress));
        IgImageView igImageView2 = (IgImageView) viewGroup.findViewById(C0164R.id.reel_viewer_image_view_transition);
        this.f13931U = igImageView2;
        igImageView2.setVisibility(8);
        this.f13931U.setScaleType(ScaleType.CENTER_CROP);
        this.f13919I = (IgImageView) viewGroup.findViewById(C0164R.id.reel_viewer_decor_overlay);
        this.KB = new AnonymousClass0ct((ViewStub) viewGroup.findViewById(C0164R.id.reel_viewer_zero_rating_data_banner_stub));
        this.f13924N = (ViewStub) viewGroup.findViewById(C0164R.id.reel_item_feedback_balloons_stub);
        this.f13940d = (ViewStub) viewGroup.findViewById(C0164R.id.reel_item_mention_reshare_button_stub);
        this.f13922L = (ViewStub) viewGroup.findViewById(C0164R.id.close_friends_badge_stub);
        this.f13926P = (ViewStub) viewGroup.findViewById(C0164R.id.follow_button_stub);
        this.f13918H = (ViewStub) viewGroup.findViewById(C0164R.id.branding_badge_stub);
        this.GB = viewGroup.findViewById(C0164R.id.top_menu_button);
        this.f13945i = new AnonymousClass15I((ViewStub) viewGroup.findViewById(C0164R.id.reel_poll_stub));
        this.f13948l = new AnonymousClass15L((ViewStub) viewGroup.findViewById(C0164R.id.reel_question_sticker_stub));
        this.f13956t = new AnonymousClass15M((ViewStub) viewGroup.findViewById(C0164R.id.reel_slider_sticker_stub));
        this.f13942f = new AnonymousClass5Ci((ViewStub) viewGroup.findViewById(C0164R.id.reel_music_sticker_stub));
        this.f13916F = new AnonymousClass0zD((ViewStub) viewGroup.findViewById(C0164R.id.reel_branded_content_violation_banner));
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) viewGroup.findViewById(C0164R.id.reel_retry_icon);
        this.f13935Y = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setNormalColorFilter(-1);
        this.f13935Y.setActiveColorFilter(-16777216);
        this.f13913C = new AnonymousClass15N((ViewStub) viewGroup.findViewById(C0164R.id.reel_app_attribution_subtitle_stub));
        this.f13920J = new AnonymousClass15H((ViewStub) viewGroup.findViewById(C0164R.id.reel_effect_attribution_subtitle_stub));
        this.f13941e = new AnonymousClass15O((ViewStub) viewGroup.findViewById(C0164R.id.reel_music_attribution_subtitle_stub));
        this.f13946j = new AnonymousClass15V(this.f13953q);
        this.f13959w = new AnonymousClass5BJ((ViewStub) viewGroup.findViewById(C0164R.id.reel_item_suggested_highlight_footer));
        this.f13958v = new AnonymousClass5BG((ViewStub) viewGroup.findViewById(C0164R.id.reel_viewer_suggested_highlight_end_card_stub));
        this.f13934X = new Rect();
        this.f13912B = new AnonymousClass5DE(this, (int) AnonymousClass0Nm.m3424C(viewGroup.getContext(), 44));
        this.f13928R = new AnonymousClass0ct((ViewStub) viewGroup.findViewById(C0164R.id.reel_identifier_overlay_stub));
        this.JB = new AnonymousClass0ct((ViewStub) viewGroup.findViewById(C0164R.id.video_play_button_stub));
        this.f13938b = AnonymousClass0vS.m8329C((ViewStub) viewGroup.findViewById(C0164R.id.media_subtitle_view_stub));
    }

    /* renamed from: A */
    public final String m9210A() {
        if (this.LB == null) {
            this.LB = this.f13957u.getContext().getResources().getString(C0164R.string.reel_reshared_from_archive_label);
        }
        return this.LB;
    }

    /* renamed from: B */
    public final AnonymousClass0ct m9211B() {
        if (this.MB == null) {
            this.MB = new AnonymousClass0ct((ViewStub) this.f13928R.m5928A().findViewById(C0164R.id.reel_identifier_overlay_avatar_stub));
        }
        return this.MB;
    }

    /* renamed from: C */
    public final AnonymousClass0ct m9212C() {
        if (this.NB == null) {
            this.NB = new AnonymousClass0ct((ViewStub) this.f13928R.m5928A().findViewById(C0164R.id.reel_identifier_overlay_subtitle_stub));
        }
        return this.NB;
    }

    /* renamed from: D */
    public final int m9213D() {
        return (this.FB.f14168Q == null || !this.FB.f14168Q.isVisible() || this.FB.AB == null || this.FB.AB.getVisibility() != 0) ? 0 : Math.max(this.FB.f14168Q.getIntrinsicWidth(), this.FB.AB.getMeasuredWidth());
    }

    /* renamed from: E */
    public final void m9214E(float f) {
        this.HB.setAlpha(f);
        this.f13947k.setAlpha(f);
        this.FB.f14173V.setAlpha(f);
        this.f13914D.setAlpha(f);
        TextView textView = this.f13939c;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    /* renamed from: F */
    public final void m9215F() {
        this.f13944h.m1960A();
        TextView textView = this.DB;
        CharSequence charSequence = JsonProperty.USE_DEFAULT_NAME;
        textView.setText(charSequence);
        this.CB.setText(charSequence);
        this.f13957u.setText(charSequence);
        this.f13949m = null;
        this.f13950n = null;
        this.f13954r = null;
        this.f13920J.f14237L = null;
        this.f13951o = null;
        this.f13930T.m7587D();
        this.f13931U.m1960A();
        this.f13947k.setProgress(0.0f);
        this.FB.f14164M.setText(JsonProperty.USE_DEFAULT_NAME);
    }

    public final void Jv(float f) {
        AnonymousClass14s anonymousClass14s = this.f13950n;
        if (anonymousClass14s != null) {
            anonymousClass14s.m9235C(f);
        }
    }

    public final View LS() {
        return this.FB.f14170S;
    }

    public final View QU() {
        return this.FB.f14202y;
    }

    public final AnonymousClass0vR SO() {
        return this.f13938b;
    }

    public final View UQ() {
        return this.FB.f14195r;
    }

    public final void VCA() {
        this.f13930T.setVisibility(0);
    }

    public final AnonymousClass15y VJ() {
        return this.FB.VJ();
    }

    public final View ZQ() {
        return this.f13945i.f14252B;
    }

    public final void ZSA(int i) {
        this.IB.setVisibility(i);
    }

    public final void be(boolean z) {
        this.f13930T.setVisibility(0);
    }

    public final View kL() {
        return this.FB.f14165N;
    }

    public final View lL() {
        return this.f13921K;
    }

    public final AnonymousClass15S qM() {
        if (this.f13927Q == null) {
            this.f13927Q = new AnonymousClass15S(this.f13928R.m5928A());
        }
        return this.f13927Q;
    }

    public final ScalingTextureView rS() {
        return this.BB;
    }

    public final void tv(AnonymousClass14s anonymousClass14s, int i) {
        switch (i) {
            case 1:
                this.f13947k.setProgress(anonymousClass14s.f14090R);
                return;
            case 2:
                this.f13933W.ZGA(this.f13954r, this.f13949m, anonymousClass14s.f14094V);
                return;
            default:
                return;
        }
    }

    public final IgProgressImageView vM() {
        return this.f13930T;
    }
}
