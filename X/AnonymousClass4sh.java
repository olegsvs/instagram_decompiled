package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.4sh */
public final class AnonymousClass4sh {
    /* renamed from: B */
    public final AnonymousClass0EE f58108B;
    /* renamed from: C */
    public final Context f58109C;
    /* renamed from: D */
    public final Hashtag f58110D;
    /* renamed from: E */
    public final String f58111E;
    /* renamed from: F */
    public final String f58112F;
    /* renamed from: G */
    private final boolean f58113G;
    /* renamed from: H */
    private final AnonymousClass5Y1 f58114H;
    /* renamed from: I */
    private final AnonymousClass0Cm f58115I;

    public AnonymousClass4sh(Context context, AnonymousClass0EE anonymousClass0EE, Hashtag hashtag, String str, AnonymousClass0Cm anonymousClass0Cm, String str2, boolean z, AnonymousClass5Y1 anonymousClass5Y1) {
        this.f58109C = context;
        this.f58108B = anonymousClass0EE;
        this.f58110D = hashtag;
        this.f58112F = str;
        this.f58115I = anonymousClass0Cm;
        this.f58111E = str2;
        this.f58113G = z;
        this.f58114H = anonymousClass5Y1;
    }

    /* renamed from: A */
    public final void m25280A(AnonymousClass0eT anonymousClass0eT, boolean z) {
        if (z) {
            if (this.f58110D.f2788H) {
                Object obj = (AnonymousClass3KY.B() && ((Boolean) AnonymousClass0CC.KN.G()).booleanValue()) ? 1 : null;
                if (obj != null) {
                    View inflate = LayoutInflater.from(this.f58109C).inflate(C0164R.layout.hashtag_follow_button_in_action_bar, anonymousClass0eT.V(), false);
                    HashtagFollowButton hashtagFollowButton = (HashtagFollowButton) inflate.findViewById(C0164R.id.follow_button);
                    hashtagFollowButton.setVisibility(0);
                    hashtagFollowButton.A(this.f58110D, new AnonymousClass4sb(this));
                    anonymousClass0eT.O(inflate, C0164R.string.follow, new AnonymousClass4sc(this), true);
                }
            }
        } else if (this.f58113G) {
            anonymousClass0eT.F(AnonymousClass0eb.OVERFLOW, new AnonymousClass4se(this));
        } else {
            anonymousClass0eT.F(AnonymousClass0eb.SHARE, new AnonymousClass4sa(this));
        }
    }

    /* renamed from: B */
    public static void m25276B(AnonymousClass4sh anonymousClass4sh, AnonymousClass0NN anonymousClass0NN) {
        AnonymousClass5Y1 anonymousClass5Y1 = anonymousClass4sh.f58114H;
        int firstVisiblePosition = anonymousClass5Y1.f66000B.getListViewSafe() != null ? anonymousClass5Y1.f66000B.getListViewSafe().getFirstVisiblePosition() : -1;
        anonymousClass5Y1 = anonymousClass4sh.f58114H;
        int lastVisiblePosition = anonymousClass5Y1.f66000B.getListViewSafe() != null ? anonymousClass5Y1.f66000B.getListViewSafe().getLastVisiblePosition() : -1;
        anonymousClass0NN.B("start_row", firstVisiblePosition);
        anonymousClass0NN.B("end_row", lastVisiblePosition);
        AnonymousClass0uC.E(anonymousClass0NN, anonymousClass4sh.f58114H.f66000B.f58159C.dR(), anonymousClass4sh.f58114H.f66000B.f58159C.H());
    }

    /* renamed from: C */
    public static CharSequence m25277C(AnonymousClass4sh anonymousClass4sh, CharSequence charSequence) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass0Ca.C(anonymousClass4sh.f58109C, C0164R.color.red_4)), 0, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }

    /* renamed from: D */
    public static void m25278D(AnonymousClass4sh anonymousClass4sh, AnonymousClass0mj anonymousClass0mj) {
        AnonymousClass3J2 dR = anonymousClass4sh.f58114H.f66000B.f58159C.dR();
        int H = anonymousClass4sh.f58114H.f66000B.f58159C.H();
        AnonymousClass0db C = AnonymousClass0db.C();
        C.G("hashtag_feed_type", dR.toString());
        C.C("tab_index", H);
        AnonymousClass0mm.C(anonymousClass4sh.f58110D, "hashtag_contextual_feed_action_bar", anonymousClass0mj, anonymousClass4sh.f58108B, C);
    }

    /* renamed from: E */
    public static void m25279E(AnonymousClass4sh anonymousClass4sh) {
        Context context = anonymousClass4sh.f58109C;
        AnonymousClass0EE anonymousClass0EE = anonymousClass4sh.f58108B;
        Hashtag hashtag = anonymousClass4sh.f58110D;
        String str = anonymousClass4sh.f58112F;
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass4sh.f58115I;
        AnonymousClass0xk.B(anonymousClass0EE).F("hashtag", str).R();
        AnonymousClass0bz.B(context).C(AnonymousClass0J7.f2895B.O().D(anonymousClass0Cm, hashtag.f2793M, AnonymousClass0V0.HASHTAG, anonymousClass0EE).ED());
    }
}
