package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import com.instagram.url.UrlHandlerActivity;
import java.util.List;

/* renamed from: X.1fe */
public final class AnonymousClass1fe extends AnonymousClass0VA implements AnonymousClass0IT {
    /* renamed from: N */
    public static final Class f21188N = AnonymousClass1fe.class;
    /* renamed from: B */
    public final AnonymousClass22s f21189B;
    /* renamed from: C */
    public View f21190C;
    /* renamed from: D */
    public final AnonymousClass1gn f21191D;
    /* renamed from: E */
    public View f21192E;
    /* renamed from: F */
    public final AnonymousClass1fo f21193F;
    /* renamed from: G */
    public final AnonymousClass0Ci f21194G;
    /* renamed from: H */
    public View f21195H;
    /* renamed from: I */
    public final AnonymousClass0Cm f21196I;
    /* renamed from: J */
    private final Bundle f21197J;
    /* renamed from: K */
    private final boolean f21198K;
    /* renamed from: L */
    private final AnonymousClass0IU f21199L;
    /* renamed from: M */
    private final AnonymousClass1gK f21200M;

    public AnonymousClass1fe(AnonymousClass22s anonymousClass22s, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass1fo anonymousClass1fo, AnonymousClass0IU anonymousClass0IU, Bundle bundle, AnonymousClass1gn anonymousClass1gn, AnonymousClass1gK anonymousClass1gK, boolean z) {
        this.f21189B = anonymousClass22s;
        this.f21196I = anonymousClass0Cm;
        this.f21194G = anonymousClass0Ci;
        this.f21193F = anonymousClass1fo;
        this.f21199L = anonymousClass0IU;
        this.f21197J = bundle;
        this.f21191D = anonymousClass1gn;
        this.f21200M = anonymousClass1gK;
        this.f21198K = z;
    }

    /* renamed from: B */
    public static void m12394B(AnonymousClass1fe anonymousClass1fe) {
        View view = anonymousClass1fe.f21192E;
        if (view != null) {
            AnonymousClass0Ci anonymousClass0Ci = anonymousClass1fe.f21194G;
            if (anonymousClass0Ci != null) {
                view.setSelected(anonymousClass0Ci.m1017h());
            }
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0Ci A;
        String str;
        boolean z = true;
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        if (!(this.f21189B instanceof UrlHandlerActivity)) {
            if (this.f21193F.m12451D()) {
                anonymousClass0eT.m6365n(((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.PI)).booleanValue());
                anonymousClass0eT.m6361j(this.f21193F);
                A = this.f21193F.m12448A();
                if (A == null) {
                    anonymousClass0eT.m6352a(A.uT());
                } else {
                    str = "UserDetailFragment.EXTRA_USER_NAME";
                    if (this.f21197J.containsKey(str)) {
                        anonymousClass0eT.m6352a(this.f21197J.getString(str));
                    }
                }
                if (!this.f21193F.f21253C.dX() && A != null) {
                    if (this.f21198K && (!this.f21193F.m12452E() || this.f21193F.m12451D())) {
                        OnClickListener anonymousClass5p8 = new AnonymousClass5p8(this);
                        OnLongClickListener anonymousClass5p9 = (this.f21193F.m12452E() && AnonymousClass0Co.m1042B(this.f21196I)) ? new AnonymousClass5p9(this) : null;
                        if (this.f21193F.m12451D()) {
                            this.f21195H = anonymousClass0eT2.m6336K(C0164R.layout.navbar_profile_menu_button, C0164R.string.menu_options, anonymousClass5p8, anonymousClass5p9, true, false);
                            AnonymousClass0Nm.m3452e(this.f21195H, ((Context) this.f21189B).getResources().getDimensionPixelSize(C0164R.dimen.action_bar_item_spacing_right));
                            AnonymousClass0ct anonymousClass0ct = new AnonymousClass0ct((ViewStub) this.f21195H.findViewById(C0164R.id.profile_menu_badge_stub));
                            List<AnonymousClass1Rv> list = this.f21193F.f21263M;
                            int i = 0;
                            if (list != null) {
                                for (AnonymousClass1Rv F : list) {
                                    if (F.m11460F()) {
                                        i++;
                                    }
                                }
                            }
                            if (i > 0) {
                                anonymousClass0ct.m5931D(0);
                                AnonymousClass14F.m9156B((TextView) anonymousClass0ct.m5928A(), i < 10 ? Integer.toString(i) : "9+");
                            } else {
                                anonymousClass0ct.m5931D(8);
                            }
                        } else {
                            this.f21195H = anonymousClass0eT2.m6336K(C0164R.layout.navbar_overflow_button, C0164R.string.menu_options, anonymousClass5p8, anonymousClass5p9, true, false);
                        }
                    }
                    if (this.f21193F.m12452E() && this.f21193F.m12451D()) {
                        if (!AnonymousClass0yJ.m8633F(this.f21196I)) {
                            this.f21190C = anonymousClass0eT2.m6338M(C0164R.layout.navbar_archive_button, C0164R.string.profile_me_only_description, new AnonymousClass5pE(this), true, false);
                        } else if (AnonymousClass0yJ.m8631D(this.f21196I)) {
                            View M = anonymousClass0eT2.m6338M(C0164R.layout.navbar_close_friends_list_button, C0164R.string.close_friends_list_description, new AnonymousClass5pA(this), true, false);
                            ImageView imageView = (ImageView) M.findViewById(C0164R.id.action_bar_close_friends_icon);
                            if (AnonymousClass0yJ.m8634G(this.f21196I)) {
                                imageView.setImageResource(C0164R.drawable.nav_close_friends_star_outline);
                            }
                            TextView textView = (TextView) M.findViewById(C0164R.id.action_bar_close_friends_badge);
                            int C = this.f21193F.m12450C();
                            if (C > 0) {
                                textView.setVisibility(0);
                                AnonymousClass14F.m9156B(textView, String.valueOf(C));
                            } else {
                                textView.setVisibility(8);
                            }
                        }
                        this.f21200M.m12493B(anonymousClass0eT);
                        return;
                    } else if (!this.f21193F.m12452E()) {
                        AnonymousClass0Ci anonymousClass0Ci = this.f21194G;
                        if (anonymousClass0Ci != null && AnonymousClass1gm.m12527B(this.f21196I, anonymousClass0Ci) && AnonymousClass0er.m6431B(this.f21196I).m6440R(this.f21194G) && AnonymousClass0yJ.m8630C() && AnonymousClass0yJ.m8635H(this.f21196I)) {
                            this.f21192E = anonymousClass0eT2.m6338M(C0164R.layout.navbar_close_friends_toggle_button, C0164R.string.profile_close_friends_description, new AnonymousClass5pD(this), true, false);
                            AnonymousClass1fe.m12394B(this);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            } else if (this.f21199L.mo1456H() <= 0 && !this.f21193F.f21253C.dX()) {
                if (!(this.f21189B instanceof ModalActivity)) {
                    z = false;
                }
            }
        }
        anonymousClass0eT.m6365n(z);
        anonymousClass0eT.m6361j(this.f21193F);
        A = this.f21193F.m12448A();
        if (A == null) {
            str = "UserDetailFragment.EXTRA_USER_NAME";
            if (this.f21197J.containsKey(str)) {
                anonymousClass0eT.m6352a(this.f21197J.getString(str));
            }
        } else {
            anonymousClass0eT.m6352a(A.uT());
        }
        if (!this.f21193F.f21253C.dX()) {
        }
    }

    public final void gi() {
        this.f21195H = null;
        this.f21190C = null;
        this.f21192E = null;
    }
}
