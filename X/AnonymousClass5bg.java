package X;

import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.mediaactions.MediaActionsView;

/* renamed from: X.5bg */
public class AnonymousClass5bg extends AnonymousClass5Vz {
    /* renamed from: B */
    public final AnonymousClass0ct f67088B;
    /* renamed from: C */
    public final AnonymousClass0ct f67089C;
    /* renamed from: D */
    public final IgProgressImageView f67090D;
    /* renamed from: E */
    public final MediaActionsView f67091E;
    /* renamed from: F */
    public final MediaFrameLayout f67092F;
    /* renamed from: G */
    public final AnonymousClass4mA f67093G;
    /* renamed from: H */
    public final AnonymousClass0vD f67094H;
    /* renamed from: I */
    private final AnonymousClass0ct f67095I;
    /* renamed from: J */
    private final CircularImageView f67096J;
    /* renamed from: K */
    private final TextView f67097K;
    /* renamed from: L */
    private final FrameLayout f67098L;
    /* renamed from: M */
    private final AnonymousClass0ct f67099M;
    /* renamed from: N */
    private final AnonymousClass1dU f67100N;
    /* renamed from: O */
    private final AnonymousClass0ct f67101O;
    /* renamed from: P */
    private final TextView f67102P;
    /* renamed from: Q */
    private final AnonymousClass5WD f67103Q;
    /* renamed from: R */
    private final AnonymousClass4gT f67104R;
    /* renamed from: S */
    private final AnonymousClass0Cm f67105S;
    /* renamed from: T */
    private final TextView f67106T;

    public AnonymousClass5bg(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass4mA anonymousClass4mA, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        super(view, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        this.f67105S = anonymousClass0Cm;
        AnonymousClass4gT anonymousClass4gT2 = anonymousClass4gT;
        this.f67104R = anonymousClass4gT;
        this.f67098L = (FrameLayout) view.findViewById(C0164R.id.message_content_media_share_bubble_container);
        this.f67096J = (CircularImageView) view.findViewById(C0164R.id.avatar);
        this.f67088B = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.avatar_badge));
        this.f67106T = (TextView) view.findViewById(C0164R.id.username);
        this.f67102P = (TextView) view.findViewById(C0164R.id.subtitle);
        this.f67092F = (MediaFrameLayout) view.findViewById(C0164R.id.media_container);
        this.f67090D = (IgProgressImageView) view.findViewById(C0164R.id.image);
        this.f67094H = AnonymousClass0zH.C((ViewStub) view.findViewById(C0164R.id.zero_rating_video_play_button_stub));
        this.f67097K = (TextView) view.findViewById(C0164R.id.caption);
        this.f67091E = (MediaActionsView) view.findViewById(C0164R.id.video_indicator);
        this.f67095I = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.album_indicator_stub));
        this.f67101O = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.shopping_indicator_stub));
        this.f67089C = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.message_content_media_share_gated_stub));
        this.f67093G = anonymousClass4mA;
        this.f67100N = new AnonymousClass1dU(new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_reactions_bar_stub)), anonymousClass4gT, this.f56219B, this.f67105S.B());
        this.f67099M = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.message_context_label_stub));
        AnonymousClass0ct anonymousClass0ct = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_text_message_text_view_stub));
        this.f67103Q = new AnonymousClass5WD(V(), anonymousClass0Cm2, anonymousClass4gT2, this.f56219B, this, anonymousClass0ct);
    }

    /* renamed from: C */
    public static AnonymousClass0P7 m27912C(AnonymousClass0W7 anonymousClass0W7) {
        AnonymousClass0P7 G = anonymousClass0W7.G();
        if (G == null) {
            G = anonymousClass0W7.G();
            String str = "MediaShareMessageViewHolder";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("media_share is ");
            stringBuilder.append(G == null ? "null" : "not null");
            stringBuilder.append(" and message type is ");
            stringBuilder.append(anonymousClass0W7.f5915s);
            stringBuilder.append(", and message content is ");
            stringBuilder.append(anonymousClass0W7.f5876F);
            AnonymousClass0Gn.H(str, stringBuilder.toString());
        }
        return G;
    }

    /* renamed from: Z */
    public final void mo6027Z() {
        if (m27252I()) {
            AnonymousClass1dU.G(this.f67100N, this.f65523E.f65618B);
        }
        AnonymousClass5WD anonymousClass5WD = this.f67103Q;
        AnonymousClass4er anonymousClass4er = anonymousClass5WD.f65583C;
        if (anonymousClass4er != null) {
            anonymousClass4er.f56050B = null;
        }
        if (anonymousClass5WD.f65584D.C()) {
            ((TightTextView) anonymousClass5WD.f65584D.A()).setOnTouchListener(null);
        }
        super.mo6027Z();
    }

    /* renamed from: b */
    public int mo6028b() {
        return C0164R.layout.message_content_media_share;
    }

    /* renamed from: d */
    public final boolean mo6032d(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        if (super.mo6032d(anonymousClass5WQ)) {
            AnonymousClass0P7 G = anonymousClass0W7.G();
            if (!(G == null || G.qA())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo6029e(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass5WQ anonymousClass5WQ2 = anonymousClass5WQ;
        m27261f(anonymousClass5WQ2);
        AnonymousClass1dU.D(this.f67100N, anonymousClass5WQ2, this.f67105S.B());
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ2.f65618B;
        AnonymousClass0P7 C = AnonymousClass5bg.m27912C(anonymousClass0W7);
        if (C != null) {
            TextView textView;
            float L = C.L();
            r4.f67092F.setAspectRatio(L);
            r4.f67090D.setAspectRatio(L);
            r4.f67090D.C(C0164R.id.listener_id_for_direct_gated_media_item_viewer_image_binding);
            if (C.qA()) {
                r4.f67090D.setMiniPreviewBlurRadius(AnonymousClass0wA.f12223F);
                r4.f67090D.E(C0164R.id.listener_id_for_direct_gated_media_item_viewer_image_binding, new AnonymousClass4fO(r4, C));
                r4.f67090D.setUrl(AnonymousClass0Gs.D(C.wB));
            } else {
                IgProgressImageView igProgressImageView = r4.f67090D;
                igProgressImageView.setUrl(C.x(igProgressImageView.getContext()));
                r4.f67089C.D(8);
            }
            Object obj = C.MB != null ? 1 : null;
            AnonymousClass0Ci MA = C.MA();
            if (obj != null) {
                AnonymousClass0yb.B(r4.f67096J, C.MB);
                r4.f67088B.D(0);
                ((ReelBrandingBadgeView) r4.f67088B.A()).B(AnonymousClass0ya.HASHTAG);
                ((ReelBrandingBadgeView) r4.f67088B.A()).setBorderWidth(1.0f);
            } else {
                r4.f67096J.setUrl(MA.DQ());
                r4.f67096J.setPadding(0, 0, 0, 0);
                r4.f67088B.D(8);
            }
            boolean wY = C.wY();
            if (wY && AnonymousClass0vE.B(r4.f67105S).A()) {
                r4.f67091E.setVisibility(0);
                r4.f67091E.setVideoIconState(C.qA() ? AnonymousClass0pj.PLAY : AnonymousClass0pj.AUTOPLAY);
            } else {
                r4.f67091E.setVisibility(8);
            }
            AnonymousClass0vD anonymousClass0vD = r4.f67094H;
            AnonymousClass0Cm anonymousClass0Cm = r4.f67105S;
            AnonymousClass4fP anonymousClass4fP = new AnonymousClass4fP(r4, anonymousClass0W7);
            boolean B = AnonymousClass0im.B(r4.f67105S);
            anonymousClass5WQ = (!wY || r4.f67093G.m25026A(anonymousClass0W7)) ? AnonymousClass0pk.HIDDEN : AnonymousClass0pk.SHOW;
            AnonymousClass0zH.B(anonymousClass0vD, anonymousClass0Cm, anonymousClass4fP, B, false, anonymousClass5WQ);
            AnonymousClass0ct anonymousClass0ct = r4.f67095I;
            int i = (!C.iA() || C.cA()) ? 8 : 0;
            anonymousClass0ct.D(i);
            r4.f67101O.D(C.cA() ? 0 : 8);
            ColorStateList D = AnonymousClass4et.D(r4.f67104R, anonymousClass0W7, r4.f67105S.B());
            ColorStateList E = AnonymousClass4et.E(r4.f67104R, anonymousClass0W7, r4.f67105S.B());
            r4.f67106T.setTextColor(D);
            TextView textView2;
            if (C.MA().t()) {
                r4.f67106T.setText(C.LA());
                textView2 = r4.f67106T;
                textView2.setTypeface(textView2.getTypeface(), 0);
            } else if (obj != null) {
                textView = r4.f67106T;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("#");
                stringBuilder.append(C.MB.f2793M);
                textView.setText(stringBuilder.toString());
                textView2 = r4.f67106T;
                textView2.setTypeface(textView2.getTypeface(), 1);
            } else {
                r4.f67106T.setText(MA.uT());
                textView2 = r4.f67106T;
                textView2.setTypeface(textView2.getTypeface(), 1);
            }
            if (C.fA()) {
                r4.f67102P.setVisibility(0);
                r4.f67102P.setTextColor(E);
                r4.f67102P.setText(AnonymousClass0Gk.I(C.z().uT(), V().getString(C0164R.string.sponsor_tag_label), null));
            } else if (obj != null) {
                r4.f67102P.setVisibility(0);
                r4.f67102P.setTextColor(E);
                r4.f67102P.setText(MA.uT());
            } else {
                r4.f67102P.setVisibility(8);
            }
            wY = anonymousClass0W7.S(r4.f67105S.B());
            if (C.f4028c == null || TextUtils.isEmpty(C.f4028c.f4910d)) {
                r4.f67097K.setVisibility(8);
                r4.f67090D.setForeground(AnonymousClass0Ca.E(V(), C0164R.drawable.bubble_border_bottom_round));
            } else {
                CharSequence spannableStringBuilder;
                if (MA.t()) {
                    spannableStringBuilder = new SpannableStringBuilder(JsonProperty.USE_DEFAULT_NAME);
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(C.MA().uT());
                    stringBuilder2.append(" ");
                    spannableStringBuilder = new SpannableStringBuilder(stringBuilder2.toString());
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(D.getDefaultColor()), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
                }
                if (C.f4028c.f4910d != null) {
                    textView = r4.f67097K;
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    charSequenceArr[0] = spannableStringBuilder;
                    AnonymousClass0ps B2 = new AnonymousClass0ps(new SpannableStringBuilder(C.f4028c.f4910d)).C(r4.f56219B).B(r4.f56219B);
                    if (wY) {
                        i = r4.f67104R.f56263B.f56252G;
                    } else {
                        i = r4.f67104R.f56264C.f56252G;
                    }
                    B2.f10771J = i;
                    if (wY) {
                        i = r4.f67104R.f56263B.f56251F;
                    } else {
                        i = r4.f67104R.f56264C.f56251F;
                    }
                    B2.f10770I = i;
                    if (wY) {
                        i = r4.f67104R.f56263B.f56248C;
                    } else {
                        i = r4.f67104R.f56264C.f56248C;
                    }
                    B2.f10764C = i;
                    charSequenceArr[1] = B2.A();
                    textView.setText(TextUtils.concat(charSequenceArr));
                } else {
                    r4.f67097K.setText(spannableStringBuilder);
                }
                r4.f67097K.setTextColor(D);
                r4.f67097K.setVisibility(0);
                r4.f67090D.setForeground(AnonymousClass0Ca.E(V(), C0164R.drawable.bubble_border_square));
            }
            if (C.PA() == AnonymousClass0yh.ARCHIVED) {
                r4.f67099M.D(0);
                ((TextView) r4.f67099M.A()).setText(C0164R.string.direct_message_sent_from_archive);
                ((TextView) r4.f67099M.A()).setTextColor(E);
            } else {
                r4.f67099M.D(8);
            }
            AnonymousClass4mA anonymousClass4mA = r4.f67093G;
            if (anonymousClass4mA.f57104C != null) {
                AnonymousClass4m9 anonymousClass4m9 = anonymousClass4mA.f57107F;
                Object obj2 = 1;
                Object obj3 = (anonymousClass4m9 == null || !equals(anonymousClass4m9.f57101B)) ? null : 1;
                anonymousClass4m9 = anonymousClass4mA.f57107F;
                if (anonymousClass4m9 == null || !anonymousClass0W7.equals(anonymousClass4m9.f57102C)) {
                    obj2 = null;
                }
                AnonymousClass3ph anonymousClass3ph;
                if (obj3 != null && r2 == null) {
                    String str = "media_mismatch";
                    anonymousClass3ph = anonymousClass4mA.f57104C;
                    if (anonymousClass3ph != null) {
                        anonymousClass3ph.F(str, true);
                    }
                } else if (obj3 == null && r2 != null) {
                    anonymousClass4mA.f57107F.f57101B = r4;
                    anonymousClass3ph = anonymousClass4mA.f57104C;
                    AnonymousClass0tZ anonymousClass0tZ = r4.f67092F;
                    AnonymousClass0Sy.C();
                    AnonymousClass1mY.B(anonymousClass3ph.f45005F ^ 1);
                    AnonymousClass3pz.G(anonymousClass3ph.f45007H, anonymousClass0tZ, false);
                }
            }
            AnonymousClass4ep.B(r4.f67105S, anonymousClass5WQ2, r4.f67104R, r4.f56219B);
            r4.f67098L.setForeground(AnonymousClass4et.C(r4.f67104R, anonymousClass0W7, r4.f67105S.B()));
            r4.f67098L.setBackground(AnonymousClass4et.B(r4.f67104R, anonymousClass0W7, r4.f67105S.B()));
            if (anonymousClass5WQ2.f65620D == null) {
                r4.f67103Q.f65584D.D(8);
            } else if (anonymousClass0W7.T()) {
                r4.f67103Q.m27303A(anonymousClass5WQ2, wY);
            } else {
                r4.f67103Q.m27304B(anonymousClass5WQ2, wY);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    AQ().setPressed(true);
                    this.f67103Q.m27305C(true);
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        AQ().setPressed(false);
        this.f67103Q.m27305C(false);
        return false;
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        if (AnonymousClass1aH.C(anonymousClass5WQ, this.f56219B)) {
            return true;
        }
        AnonymousClass0P7 G = anonymousClass5WQ.f65618B.G();
        this.f56219B.m27843F(G.NO(), G.MA().getId(), anonymousClass5WQ.f65618B.f5918v, G.PA());
        return true;
    }
}
