package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$LeaveReason;

/* renamed from: X.6H4 */
public final class AnonymousClass6H4 implements AnonymousClass6Bk {
    /* renamed from: B */
    public final View f73885B;
    /* renamed from: C */
    public final ImageView f73886C;
    /* renamed from: D */
    public final Drawable f73887D;
    /* renamed from: E */
    public final Drawable f73888E;
    /* renamed from: F */
    public final View f73889F;
    /* renamed from: G */
    public final ImageView f73890G;
    /* renamed from: H */
    public final Drawable f73891H;
    /* renamed from: I */
    public final Drawable f73892I;
    /* renamed from: J */
    public final View f73893J;
    /* renamed from: K */
    public final View f73894K;
    /* renamed from: L */
    public final AnonymousClass1Xh f73895L;
    /* renamed from: M */
    public final View f73896M;
    /* renamed from: N */
    public AnonymousClass6Gq f73897N;
    /* renamed from: O */
    public final View f73898O;
    /* renamed from: P */
    public AnonymousClass0iq f73899P;
    /* renamed from: Q */
    public final Resources f73900Q;
    /* renamed from: R */
    public final ViewGroup f73901R;
    /* renamed from: S */
    public final View f73902S;
    /* renamed from: T */
    public final int f73903T;
    /* renamed from: U */
    public final Interpolator f73904U;

    public AnonymousClass6H4(Resources resources, ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, ImageView imageView, ImageView imageView2, View view6, View view7, AnonymousClass1Xh anonymousClass1Xh, Interpolator interpolator, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i) {
        this.f73900Q = resources;
        this.f73901R = viewGroup;
        this.f73902S = view;
        this.f73894K = view2;
        this.f73898O = view3;
        this.f73885B = view4;
        this.f73889F = view5;
        this.f73890G = imageView;
        this.f73886C = imageView2;
        this.f73893J = view6;
        this.f73896M = view7;
        this.f73895L = anonymousClass1Xh;
        this.f73904U = interpolator;
        this.f73903T = i;
        this.f73888E = drawable;
        this.f73887D = drawable2;
        this.f73892I = drawable3;
        this.f73891H = drawable4;
        this.f73895L.f19861B = this;
        this.f73895L.A(this.f73894K, true);
        this.f73895L.A(this.f73898O, true);
        this.f73895L.A(this.f73890G, true);
        this.f73895L.A(this.f73886C, true);
        this.f73895L.A(this.f73893J, true);
        this.f73895L.A(this.f73896M, true);
    }

    /* renamed from: A */
    public final void m29853A(AnonymousClass6Ag anonymousClass6Ag) {
        View view;
        if (anonymousClass6Ag.f72572G) {
            if (this.f73902S.getVisibility() == 8) {
                this.f73902S.setVisibility(0);
                this.f73902S.setAlpha(0.0f);
                view = this.f73902S;
                view.setTranslationY((float) (-view.getMeasuredHeight()));
                this.f73902S.animate().alpha(1.0f).translationY(0.0f).setDuration((long) this.f73903T).withEndAction(new AnonymousClass6BA(this)).setInterpolator(this.f73904U).start();
            }
            if (this.f73889F.getVisibility() == 8) {
                this.f73889F.setVisibility(0);
                this.f73889F.setAlpha(0.0f);
                view = this.f73889F;
                view.setTranslationY((float) view.getMeasuredHeight());
                this.f73889F.animate().alpha(1.0f).translationY(0.0f).setDuration((long) this.f73903T).withEndAction(new AnonymousClass6BB(this)).setInterpolator(this.f73904U).start();
            }
        } else if (anonymousClass6Ag.f72569D) {
            this.f73902S.setVisibility(8);
            this.f73889F.setVisibility(8);
        } else {
            if (this.f73902S.getVisibility() == 0) {
                this.f73902S.setTranslationY(0.0f);
                this.f73902S.animate().cancel();
                this.f73902S.animate().alpha(0.0f).setDuration((long) this.f73903T).setInterpolator(this.f73904U).translationY((float) (-this.f73902S.getMeasuredHeight())).withEndAction(new AnonymousClass6BC(this)).start();
            }
            if (this.f73889F.getVisibility() == 0) {
                this.f73889F.setTranslationY(0.0f);
                this.f73889F.animate().cancel();
                this.f73889F.animate().alpha(0.0f).translationY((float) this.f73889F.getMeasuredHeight()).setDuration((long) this.f73903T).setInterpolator(this.f73904U).withEndAction(new AnonymousClass6BD(this)).start();
            }
        }
        if (anonymousClass6Ag.f72567B) {
            this.f73886C.setActivated(true);
            this.f73886C.setImageDrawable(this.f73888E);
            AnonymousClass6H4.m29851B(this, true);
        } else {
            this.f73886C.setActivated(false);
            this.f73886C.setImageDrawable(this.f73887D);
            AnonymousClass6H4.m29851B(this, false);
        }
        if (anonymousClass6Ag.f72568C) {
            this.f73890G.setActivated(true);
            this.f73890G.setImageDrawable(this.f73892I);
            AnonymousClass6H4.m29852C(this, true);
        } else {
            this.f73890G.setActivated(false);
            this.f73890G.setImageDrawable(this.f73891H);
            AnonymousClass6H4.m29852C(this, false);
        }
        if (anonymousClass6Ag.f72575J) {
            this.f73893J.setVisibility(0);
        } else {
            this.f73893J.setVisibility(8);
        }
        if (anonymousClass6Ag.f72573H) {
            this.f73896M.setVisibility(0);
        } else {
            this.f73896M.setVisibility(8);
        }
        if (anonymousClass6Ag.f72574I) {
            this.f73898O.setVisibility(0);
        } else {
            this.f73898O.setVisibility(8);
        }
        if (anonymousClass6Ag.f72571F) {
            view = this.f73885B;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            view = this.f73885B;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        this.f73893J.setContentDescription(this.f73900Q.getString(anonymousClass6Ag.f72570E ? C0164R.string.switch_back_camera : C0164R.string.switch_front_camera));
    }

    /* renamed from: B */
    public static void m29851B(AnonymousClass6H4 anonymousClass6H4, boolean z) {
        anonymousClass6H4.f73886C.setContentDescription(anonymousClass6H4.f73900Q.getString(z ? C0164R.string.videocall_audio_button_turn_off_description : C0164R.string.videocall_audio_button_turn_on_description));
    }

    /* renamed from: C */
    public static void m29852C(AnonymousClass6H4 anonymousClass6H4, boolean z) {
        anonymousClass6H4.f73890G.setContentDescription(anonymousClass6H4.f73900Q.getString(z ? C0164R.string.videocall_camera_button_turn_off_description : C0164R.string.videocall_camera_button_turn_on_description));
    }

    public final void TGA(View view) {
        AnonymousClass6Gq anonymousClass6Gq = this.f73897N;
        if (anonymousClass6Gq != null) {
            AnonymousClass6Af B;
            if (view == this.f73886C) {
                AnonymousClass6HX anonymousClass6HX;
                if (anonymousClass6Gq.f73834C.f72567B) {
                    anonymousClass6Gq.f73833B.m29955D().va(AnonymousClass69b.AUDIO_OFF);
                    B = AnonymousClass6Ag.m29283B(anonymousClass6Gq.f73834C);
                    B.f72558B = false;
                    anonymousClass6Gq.f73834C = B.m29282A();
                    anonymousClass6HX = anonymousClass6Gq.f73833B;
                    AnonymousClass6HX.m29949F(anonymousClass6HX, false);
                    anonymousClass6HX.f74104M.H(true);
                } else {
                    anonymousClass6Gq.f73833B.m29955D().va(AnonymousClass69b.AUDIO_ON);
                    B = AnonymousClass6Ag.m29283B(anonymousClass6Gq.f73834C);
                    B.f72558B = true;
                    anonymousClass6Gq.f73834C = B.m29282A();
                    anonymousClass6HX = anonymousClass6Gq.f73833B;
                    AnonymousClass6HX.m29949F(anonymousClass6HX, true);
                    anonymousClass6HX.f74104M.H(false);
                }
            } else if (view == this.f73890G) {
                if (anonymousClass6Gq.f73834C.f72568C) {
                    B = AnonymousClass6Ag.m29283B(anonymousClass6Gq.f73834C);
                    B.f72559C = false;
                    B.f72566J = false;
                    anonymousClass6Gq.f73834C = B.m29282A();
                    AnonymousClass6HX.m29950G(anonymousClass6Gq.f73833B, false);
                } else {
                    B = AnonymousClass6Ag.m29283B(anonymousClass6Gq.f73834C);
                    B.f72559C = true;
                    B.f72566J = true;
                    anonymousClass6Gq.f73834C = B.m29282A();
                    AnonymousClass6HX.m29950G(anonymousClass6Gq.f73833B, true);
                }
            } else if (view == this.f73893J) {
                anonymousClass6Gq.m29822E();
                return;
            } else if (view == this.f73894K) {
                anonymousClass6Gq.m29821D();
                AnonymousClass6HX anonymousClass6HX2 = anonymousClass6Gq.f73833B;
                anonymousClass6HX2.f74104M.E(VideoCallWaterfall$LeaveReason.USER_INITIATED);
                anonymousClass6HX2.f74104M.K();
                AnonymousClass6H1 anonymousClass6H1 = anonymousClass6Gq.f73836E;
                if (anonymousClass6H1 != null) {
                    AnonymousClass6H1.m29843B(anonymousClass6H1, AnonymousClass6Ah.LEFT, anonymousClass6H1.f73875G.m29951H());
                }
                return;
            } else if (view == this.f73896M) {
                r0 = anonymousClass6Gq.f73836E;
                return;
            } else if (view == this.f73898O) {
                r0 = anonymousClass6Gq.f73836E;
                if (r0 != null) {
                    r0.f73876H.m29781A();
                }
                return;
            } else {
                return;
            }
            anonymousClass6Gq.f73835D.m29853A(anonymousClass6Gq.f73834C);
        }
    }
}
