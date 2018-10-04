package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;
import com.instagram.model.fbfriend.FbFriend;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4GX */
public final class AnonymousClass4GX extends AnonymousClass0Rq {
    /* renamed from: B */
    public AnonymousClass2Hy f52193B;
    /* renamed from: C */
    public boolean f52194C;
    /* renamed from: D */
    public final Resources f52195D;
    /* renamed from: E */
    public final List f52196E = new ArrayList();
    /* renamed from: F */
    private final AnonymousClass1VC f52197F;
    /* renamed from: G */
    private boolean f52198G;
    /* renamed from: H */
    private final AnonymousClass2Lm f52199H;
    /* renamed from: I */
    private final AnonymousClass0Ro f52200I;
    /* renamed from: J */
    private final AnonymousClass4GY f52201J;

    public AnonymousClass4GX(Context context, AnonymousClass5SP anonymousClass5SP, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass0Cm anonymousClass0Cm) {
        this.f52195D = context.getResources();
        this.f52200I = anonymousClass0Ro;
        this.f52201J = new AnonymousClass4GY(context, anonymousClass5SP, anonymousClass0Cm);
        this.f52199H = new AnonymousClass2Lm(context);
        this.f52197F = new AnonymousClass1VC(context);
        D(new AnonymousClass0TB[]{this.f52201J, this.f52199H, this.f52197F});
    }

    /* renamed from: B */
    public static void m23711B(AnonymousClass4GX anonymousClass4GX) {
        anonymousClass4GX.C();
        AnonymousClass2Hx anonymousClass2Hx;
        if (anonymousClass4GX.f52198G) {
            anonymousClass2Hx = new AnonymousClass2Hx();
            anonymousClass2Hx.f28600F = C0164R.drawable.instagram_hero_refresh;
            anonymousClass2Hx.f28608N = anonymousClass4GX.f52195D.getString(C0164R.string.find_friends_error_state_title);
            anonymousClass2Hx.f28606L = anonymousClass4GX.f52195D.getString(C0164R.string.find_friends_error_state_body);
            anonymousClass2Hx.f28597C = anonymousClass4GX.f52195D.getString(C0164R.string.find_friends_error_state_button_text);
            anonymousClass2Hx.f28598D = anonymousClass4GX.f52193B;
            anonymousClass2Hx.f28605K = false;
            anonymousClass4GX.B(anonymousClass2Hx, AnonymousClass2I0.EMPTY, anonymousClass4GX.f52197F);
        } else if (anonymousClass4GX.f52194C && anonymousClass4GX.f52196E.isEmpty()) {
            anonymousClass2Hx = new AnonymousClass2Hx();
            anonymousClass2Hx.f28600F = C0164R.drawable.instagram_hero_person;
            anonymousClass2Hx.f28608N = anonymousClass4GX.f52195D.getString(C0164R.string.no_suggestions_invite_title);
            anonymousClass2Hx.f28606L = anonymousClass4GX.f52195D.getString(C0164R.string.no_suggestions_invite_subtitle);
            anonymousClass2Hx.f28605K = false;
            anonymousClass4GX.B(anonymousClass2Hx, AnonymousClass2I0.EMPTY, anonymousClass4GX.f52197F);
        } else {
            for (FbFriend B : anonymousClass4GX.f52196E) {
                anonymousClass4GX.B(B, null, anonymousClass4GX.f52201J);
            }
            AnonymousClass0Ro anonymousClass0Ro = anonymousClass4GX.f52200I;
            if (anonymousClass0Ro != null && anonymousClass0Ro.QV()) {
                anonymousClass4GX.A(anonymousClass4GX.f52200I, anonymousClass4GX.f52199H);
            }
        }
        anonymousClass4GX.E();
    }

    /* renamed from: F */
    public final int m23712F(String str) {
        for (int i = 0; i < this.f52196E.size(); i++) {
            if (str.equals(((FbFriend) this.f52196E.get(i)).getId())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: G */
    public final void m23713G(AnonymousClass2Hy anonymousClass2Hy) {
        this.f52193B = anonymousClass2Hy;
        if (anonymousClass2Hy != null) {
            this.f52198G = true;
            AnonymousClass4GX.m23711B(this);
            return;
        }
        this.f52198G = false;
    }

    public final void notifyDataSetChanged() {
        E();
    }
}
