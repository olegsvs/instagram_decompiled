package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.profile.fragment.ProfileWithMenuFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.recommended.FollowListData;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1fo */
public final class AnonymousClass1fo implements AnonymousClass0Ii, AnonymousClass0QH, AnonymousClass0Ij, AnonymousClass3bG {
    /* renamed from: W */
    private static final String f21251W = "com.instagram.profile.fragment.UserDetailDelegate";
    /* renamed from: B */
    public final FragmentActivity f21252B;
    /* renamed from: C */
    public final AnonymousClass1fH f21253C;
    /* renamed from: D */
    public AutoLaunchReelParams f21254D;
    /* renamed from: E */
    public final AnonymousClass0kd f21255E;
    /* renamed from: F */
    public final AnonymousClass1gG f21256F;
    /* renamed from: G */
    public final AnonymousClass1gJ f21257G;
    /* renamed from: H */
    public final AnonymousClass0kV f21258H;
    /* renamed from: I */
    public final UserDetailFragment f21259I;
    /* renamed from: J */
    public String f21260J;
    /* renamed from: K */
    public String f21261K;
    /* renamed from: L */
    public final AnonymousClass0gl f21262L;
    /* renamed from: M */
    public List f21263M;
    /* renamed from: N */
    public ProfileWithMenuFragment f21264N;
    /* renamed from: O */
    public AnonymousClass41T f21265O;
    /* renamed from: P */
    public final String f21266P;
    /* renamed from: Q */
    public final String f21267Q;
    /* renamed from: R */
    public final AnonymousClass0Hk f21268R;
    /* renamed from: S */
    public final AnonymousClass1fF f21269S;
    /* renamed from: T */
    public final AnonymousClass0Cm f21270T;
    /* renamed from: U */
    private final String f21271U;
    /* renamed from: V */
    private final AnonymousClass3bR f21272V;

    public final void Dy(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final void Iw(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void bw(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void dm(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final void fm(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void gm(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void kv(AnonymousClass0MI anonymousClass0MI) {
    }

    public AnonymousClass1fo(FragmentActivity fragmentActivity, UserDetailFragment userDetailFragment, AnonymousClass1fH anonymousClass1fH, AnonymousClass0kd anonymousClass0kd, AnonymousClass1fF anonymousClass1fF, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Hk anonymousClass0Hk, AnonymousClass0kV anonymousClass0kV, AnonymousClass1gG anonymousClass1gG, AnonymousClass1gJ anonymousClass1gJ) {
        this.f21252B = fragmentActivity;
        this.f21259I = userDetailFragment;
        this.f21253C = anonymousClass1fH;
        this.f21255E = anonymousClass0kd;
        this.f21269S = anonymousClass1fF;
        this.f21270T = anonymousClass0Cm;
        this.f21268R = anonymousClass0Hk;
        this.f21258H = anonymousClass0kV;
        this.f21256F = anonymousClass1gG;
        this.f21257G = anonymousClass1gJ;
        AnonymousClass0P7 anonymousClass0P7 = this.f21259I.f8253l;
        this.f21266P = anonymousClass0P7 != null ? anonymousClass0P7.NO() : null;
        anonymousClass0P7 = this.f21259I.f8253l;
        this.f21267Q = anonymousClass0P7 != null ? anonymousClass0P7.YT() : null;
        this.f21262L = new AnonymousClass3li(AnonymousClass1fo.m12445E(this));
        AnonymousClass0Cm anonymousClass0Cm2 = this.f21270T;
        Object obj = this.f21259I;
        this.f21272V = new AnonymousClass3bR(anonymousClass0Cm2, obj, obj);
        this.f21271U = this.f21259I.getArguments().getString("UserDetailFragment.EXTRA_FROM_MODULE");
    }

    /* renamed from: A */
    public final AnonymousClass0Ci m12448A() {
        return this.f21259I.f8224I;
    }

    /* renamed from: B */
    public final int m12449B() {
        AnonymousClass1gJ anonymousClass1gJ = this.f21257G;
        return anonymousClass1gJ != null ? anonymousClass1gJ.m12491B() : 0;
    }

    /* renamed from: B */
    public static int m12442B(AnonymousClass1fo anonymousClass1fo) {
        int i = 0;
        while (i < anonymousClass1fo.f21253C.getCount()) {
            if (!(anonymousClass1fo.f21253C.getItem(i) instanceof AnonymousClass2MJ)) {
                if (!(anonymousClass1fo.f21253C.getItem(i) instanceof AnonymousClass0P7)) {
                    i++;
                }
            }
            return i - 1;
        }
        return 0;
    }

    /* renamed from: C */
    public final int m12450C() {
        if (m12448A() != null && m12448A().m1009Z() && AnonymousClass0yJ.m8632E(this.f21270T)) {
            return m12448A().BC.intValue();
        }
        return (m12448A() == null || !m12448A().JC || AnonymousClass0HV.m2008D(this.f21270T).f2646B.getBoolean("has_tapped_on_favorites_profile_navbar_icon", false)) ? 0 : 1;
    }

    /* renamed from: C */
    public static Context m12443C(AnonymousClass1fo anonymousClass1fo) {
        return anonymousClass1fo.f21259I.getContext();
    }

    /* renamed from: D */
    public static AnonymousClass1gU m12444D(AnonymousClass1fo anonymousClass1fo) {
        AnonymousClass0Ci pT = anonymousClass1fo.f21253C.pT();
        if (anonymousClass1fo.f21270T.m1037B().getId().equals(pT.getId())) {
            return AnonymousClass1gU.SELF;
        }
        return AnonymousClass0er.m6431B(anonymousClass1fo.f21270T).m6439Q(pT).equals(AnonymousClass0Lq.FollowStatusFollowing) ? AnonymousClass1gU.FOLLOWING : AnonymousClass1gU.NOT_FOLLOWING;
    }

    /* renamed from: D */
    public final boolean m12451D() {
        return this.f21259I.f8235T;
    }

    /* renamed from: E */
    public static String m12445E(AnonymousClass1fo anonymousClass1fo) {
        AnonymousClass0Ci pT = anonymousClass1fo.f21253C.pT();
        if (pT != null) {
            return pT.getId();
        }
        return anonymousClass1fo.f21259I.getArguments().getString("UserDetailFragment.EXTRA_USER_ID");
    }

    /* renamed from: E */
    public final boolean m12452E() {
        return this.f21259I.mo2677H();
    }

    /* renamed from: F */
    public final void m12453F(String str, String str2) {
        AnonymousClass1gV.m12506D(this.f21259I, str, AnonymousClass1gU.SELF, AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q, str2);
    }

    /* renamed from: F */
    public static boolean m12446F(AnonymousClass1fo anonymousClass1fo) {
        return anonymousClass1fo.f21259I.f8229N.A();
    }

    /* renamed from: G */
    public final void m12454G(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass1YG.m11831B(this.f21271U, "book_appointment", "business_profile", anonymousClass0Ci.getId(), AnonymousClass0Ci.m982D(anonymousClass0Ci.f1751t));
        AnonymousClass1gV.m12505C(this.f21259I, "tap_instant_experience", AnonymousClass1fo.m12444D(this), AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q);
        String str = anonymousClass0Ci.f1748q;
        if (TextUtils.isEmpty(str)) {
            AnonymousClass0Gn.m1876C(f21251W, "IX CTA url is empty");
            return;
        }
        Context C = AnonymousClass1fo.m12443C(this);
        Activity activity = this.f21259I.getActivity();
        AnonymousClass0Cm anonymousClass0Cm = this.f21270T;
        String moduleName = this.f21259I.getModuleName();
        if (AnonymousClass5gn.B(anonymousClass0Ci.f1745n)) {
            AnonymousClass0he B = new AnonymousClass0he(activity, anonymousClass0Cm, str, AnonymousClass0hf.PROFILE_CTA).m6776B(anonymousClass0Ci.getId());
            B.f8460I = AnonymousClass5hH.B(anonymousClass0Cm);
            B.m6779E(moduleName).m6774D();
        } else {
            AnonymousClass0IW.m2245K(AnonymousClass5go.getInstance(C).getInstantExperiencesIntent(C, anonymousClass0Ci.getId(), anonymousClass0Cm.f1759C, str, "instagram", "ig_profile_cta", anonymousClass0Ci.f1747p), 1001, activity);
        }
    }

    /* renamed from: G */
    public static void m12447G(AnonymousClass1fo anonymousClass1fo) {
        AnonymousClass0Ie anonymousClass0Ie = anonymousClass1fo.f21259I;
        AnonymousClass0GA B = AnonymousClass3nU.B(anonymousClass1fo.f21270T, anonymousClass1fo.f21253C.pT().getId());
        B.f2849B = new AnonymousClass5pX(anonymousClass1fo);
        anonymousClass0Ie.schedule(B);
    }

    /* renamed from: H */
    public final void m12455H(AnonymousClass0Ci anonymousClass0Ci, Context context, String str) {
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        AnonymousClass1YG.m11831B(this.f21271U, "get_directions", "business_profile", anonymousClass0Ci.getId(), AnonymousClass0Ci.m982D(anonymousClass0Ci.f1751t));
        AnonymousClass36C.B(AnonymousClass36B.f37806E, anonymousClass0Ci2, this.f21270T.m1037B(), this.f21259I, this.f21266P, this.f21267Q);
        AnonymousClass1gV.m12505C(this.f21259I, "tap_directions", AnonymousClass1fo.m12444D(this), AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q);
        AnonymousClass3UM.C(context, anonymousClass0Ci.f1709D, anonymousClass0Ci.f1707B, anonymousClass0Ci.f1708C);
    }

    /* renamed from: I */
    public final void m12456I(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        AnonymousClass1YG.m11831B(this.f21271U, "send_email", "business_profile", anonymousClass0Ci.getId(), AnonymousClass0Ci.m982D(anonymousClass0Ci.f1751t));
        AnonymousClass36C.B(AnonymousClass36B.f37807F, anonymousClass0Ci2, this.f21270T.m1037B(), this.f21259I, this.f21266P, this.f21267Q);
        AnonymousClass1gV.m12505C(this.f21259I, "tap_email", AnonymousClass1fo.m12444D(this), AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mailto:");
        stringBuilder.append(anonymousClass0Ci.zB);
        String stringBuilder2 = stringBuilder.toString();
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.setData(Uri.parse(stringBuilder2));
        AnonymousClass0IW.m2252R(intent, this.f21259I);
    }

    /* renamed from: J */
    public final void m12457J(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        AnonymousClass1YG.m11831B(this.f21271U, "call_phone_number", "business_profile", anonymousClass0Ci.getId(), AnonymousClass0Ci.m982D(anonymousClass0Ci.f1751t));
        AnonymousClass36C.B(AnonymousClass36B.f37805D, anonymousClass0Ci2, this.f21270T.m1037B(), this.f21259I, this.f21266P, this.f21267Q);
        AnonymousClass1gV.m12505C(this.f21259I, "tap_call", AnonymousClass1fo.m12444D(this), AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tel:");
        stringBuilder.append(anonymousClass0Ci.f1739h.trim());
        String stringBuilder2 = stringBuilder.toString();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.addFlags(268435456);
        intent.setData(Uri.parse(stringBuilder2));
        AnonymousClass0IW.m2252R(intent, this.f21259I);
    }

    /* renamed from: K */
    public final void m12458K(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        AnonymousClass1YG.m11831B(this.f21271U, "text_phone_number", "business_profile", anonymousClass0Ci.getId(), AnonymousClass0Ci.m982D(anonymousClass0Ci.f1751t));
        AnonymousClass36C.B(AnonymousClass36B.f37808G, anonymousClass0Ci2, this.f21270T.m1037B(), this.f21259I, this.f21266P, this.f21267Q);
        AnonymousClass1gV.m12505C(this.f21259I, "tap_text", AnonymousClass1fo.m12444D(this), AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q);
        String trim = anonymousClass0Ci.f1739h.trim();
        AnonymousClass0IW.m2239E(AnonymousClass5LQ.B(trim, null), this.f21259I);
    }

    /* renamed from: L */
    public final void m12459L() {
        AnonymousClass1gV.m12506D(this.f21259I, "tap_archive", AnonymousClass1gU.SELF, AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q, "user_profile_header");
        new AnonymousClass0Sn(ModalActivity.class, "archive_home", new Bundle(), this.f21252B, this.f21270T.f1759C).m4403B(AnonymousClass1fo.m12443C(this));
    }

    /* renamed from: M */
    public final void m12460M(String str) {
        String str2 = "edit_profile";
        AnonymousClass1gV.m12506D(this.f21259I, str2, AnonymousClass1gU.SELF, AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q, "user_profile_header");
        if (str != null) {
            AnonymousClass33e.f37447L.A().m3298F("entry_point", str).m3298F("fb_user_id", AnonymousClass0a2.m5424I(this.f21270T)).m3298F("step", str2).m3310R();
        }
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f21252B);
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.mo659B().m4354C("profile");
        anonymousClass0IZ.f2752B = "EditProfileFragment.BACK_STACK_NAME";
        anonymousClass0IZ.f2757G = this.f21262L;
        anonymousClass0IZ.m2308B();
    }

    public final void Mm(AnonymousClass3Uq anonymousClass3Uq) {
        AnonymousClass0rF.m7947B(this.f21253C, 1224316190);
        if (!anonymousClass3Uq.f41679C.isEmpty()) {
            Context C = AnonymousClass1fo.m12443C(this);
            FragmentActivity fragmentActivity = this.f21252B;
            new AnonymousClass10F(C, fragmentActivity instanceof AnonymousClass0Hk ? (AnonymousClass0Hk) fragmentActivity : null).m8711A(AnonymousClass10T.PROFILE, anonymousClass3Uq.f41679C);
        }
    }

    /* renamed from: N */
    public final void m12461N() {
        AnonymousClass0Ci A = m12448A();
        AnonymousClass1Zf anonymousClass1Zf = (A != null && A.m1009Z() && AnonymousClass0yJ.m8632E(this.f21270T)) ? AnonymousClass1Zf.SUGGESTIONS : AnonymousClass1Zf.MEMBERS;
        AnonymousClass0HV.m2008D(this.f21270T).f2646B.edit().putBoolean("has_tapped_on_favorites_profile_navbar_icon", true).apply();
        this.f21258H.m7178D(AnonymousClass0xq.SELF_PROFILE_NAV_BUTTON, anonymousClass1Zf);
    }

    /* renamed from: O */
    public final void m12462O() {
        AnonymousClass1gV.m12506D(this.f21259I, "tap_followers", AnonymousClass1fo.m12444D(this), AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q, "user_profile_header");
        FollowListData B = FollowListData.B(AnonymousClass3m9.f44270D, this.f21253C.pT().getId());
        AnonymousClass0uX anonymousClass0uX = new AnonymousClass0uX();
        AnonymousClass0IZ B2 = AnonymousClass0uX.m8246B(this.f21252B, B);
        B2.f2757G = this.f21262L;
        B2.m2308B();
    }

    public final void OFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f21252B);
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.mo659B().m4355D(AnonymousClass0bx.m5660C(this.f21270T, anonymousClass0Ci.getId(), "profile_user_row").m5662A());
        anonymousClass0IZ.f2753C = "suggested_users";
        anonymousClass0IZ.m2308B();
    }

    /* renamed from: P */
    public final void m12463P() {
        AnonymousClass0LH.m2927E(m12448A());
        if (m12448A().m1035z()) {
            AnonymousClass0Ir.f2848B.mo557A();
            AnonymousClass0IL anonymousClass34i = new AnonymousClass34i();
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f21252B);
            anonymousClass0IZ.f2754D = anonymousClass34i;
            anonymousClass0IZ.m2308B();
            return;
        }
        AnonymousClass0Iy.m2391G(this.f21270T, AnonymousClass1fo.m12443C(this).getString(C0164R.string.insights), this.f21252B);
    }

    /* renamed from: Q */
    public final void m12464Q(AnonymousClass5nF anonymousClass5nF, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass5nG anonymousClass5nG) {
        AnonymousClass1gV.m12505C(this.f21259I, "tap_profile_pic", AnonymousClass1fo.m12444D(this), anonymousClass0Ci.getId(), this.f21266P, this.f21267Q);
        Object obj = (anonymousClass5nG == null || anonymousClass5nG.I()) ? null : 1;
        if (AnonymousClass0Co.m1044D(this.f21270T, anonymousClass0Ci) && this.f21268R != null && obj == null) {
            this.f21268R.OWA(AnonymousClass3jF.B().B(this.f21268R.xJ().mo1417G()).A(true).C("profile_picture_tap_on_self_profile").ID());
        } else if (obj != null) {
            m12465R(anonymousClass5nF, anonymousClass5nG.E(), anonymousClass5nG.D());
        }
    }

    /* renamed from: R */
    public final void m12465R(AnonymousClass10I anonymousClass10I, List list, AnonymousClass0MI anonymousClass0MI) {
        String str;
        AnonymousClass10I anonymousClass10I2 = anonymousClass10I;
        View kI = anonymousClass10I.kI();
        if (this.f21265O == null) {
            this.f21265O = new AnonymousClass41T(kI, this);
        }
        if (!this.f21265O.I(kI)) {
            this.f21265O.f48475B = AnonymousClass0Nm.m3433L(kI);
        }
        AnonymousClass3bR anonymousClass3bR = this.f21272V;
        anonymousClass3bR.f42625M = this.f21259I.f8247f.f10353G;
        anonymousClass3bR.f42621I = new AnonymousClass3li(AnonymousClass1fo.m12445E(this));
        anonymousClass3bR.f42622J = this.f21265O;
        List list2 = list;
        anonymousClass3bR.f42623K = list.size() >= 2;
        AutoLaunchReelParams autoLaunchReelParams = this.f21254D;
        if (autoLaunchReelParams != null) {
            str = autoLaunchReelParams.f8450D;
            AnonymousClass3bR anonymousClass3bR2 = this.f21272V;
            anonymousClass3bR2.f42624L = this.f21254D.f8452F;
            anonymousClass3bR2.f42619G = this.f21254D.f8449C;
        } else {
            str = null;
        }
        this.f21272V.B(anonymousClass10I2, anonymousClass0MI, list2, list, list, str != null ? AnonymousClass0Qf.PUSH_NOTIFICATION : AnonymousClass0Qf.PROFILE, null, str);
        this.f21254D = null;
    }

    /* renamed from: S */
    public final void m12466S(String str) {
        AnonymousClass1gV.m12506D(this.f21259I, "direct_message", AnonymousClass1fo.m12444D(this), AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q, str);
        AnonymousClass0J7.f2895B.mo535Q(this.f21252B, this.f21270T, str, this.f21259I).rQA(Collections.singletonList(new PendingRecipient(this.f21253C.pT()))).DZ();
    }

    public final void oLA() {
        this.f21259I.oLA();
    }

    public final void zf(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0Lq anonymousClass0Lq = anonymousClass0Ci.eB;
        AnonymousClass0Lq anonymousClass0Lq2 = AnonymousClass0Lq.FollowStatusFollowing;
        String str = anonymousClass0Lq == anonymousClass0Lq2 ? "unfollow" : "follow";
        AnonymousClass0EE anonymousClass0EE = this.f21259I;
        AnonymousClass0Lq anonymousClass0Lq3 = AnonymousClass0Lq.FollowStatusFollowing;
        AnonymousClass1gV.m12507E(anonymousClass0EE, str, anonymousClass0Lq == anonymousClass0Lq2 ? AnonymousClass1gU.FOLLOWING : AnonymousClass1gU.NOT_FOLLOWING, AnonymousClass1fo.m12445E(this), this.f21266P, this.f21267Q, this.f21260J, this.f21261K, "user_profile_header");
        if (anonymousClass0Lq == AnonymousClass0Lq.FollowStatusNotFollowing) {
            if (AnonymousClass1fo.m12446F(this) || !this.f21253C.pT().m1014e()) {
                this.f21253C.m12379K(AnonymousClass3P8.f40818E);
            } else {
                AnonymousClass1fo.m12447G(this);
            }
        }
        if (!(this.f21259I.getArguments() == null || TextUtils.isEmpty(this.f21259I.getArguments().getString("UserDetailFragment.EXTRA_SEARCH_RANK_TOKEN")))) {
            Object obj;
            AnonymousClass0EE anonymousClass0EE2 = this.f21259I;
            String string = anonymousClass0EE2.getArguments().getString("UserDetailFragment.EXTRA_SEARCH_RANK_TOKEN");
            str = this.f21260J;
            String str2 = this.f21261K;
            if (anonymousClass0Ci.f1751t != anonymousClass0Lq3) {
                if (anonymousClass0Ci.f1751t != AnonymousClass0Lq.FollowStatusRequested) {
                    obj = null;
                    if (obj != null) {
                        AnonymousClass0NN.m3291B("search_follow_button_clicked", anonymousClass0EE2).m3298F("rank_token", string).m3298F(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0Ci.getId()).m3300H("inline", false).m3298F("follow_status", anonymousClass0Ci.f1751t != anonymousClass0Lq3 ? "follow" : "requested").m3303K("hashtag_id", str).m3303K("hashtag_name", str2).m3310R();
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                if (anonymousClass0Ci.f1751t != anonymousClass0Lq3) {
                }
                AnonymousClass0NN.m3291B("search_follow_button_clicked", anonymousClass0EE2).m3298F("rank_token", string).m3298F(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0Ci.getId()).m3300H("inline", false).m3298F("follow_status", anonymousClass0Ci.f1751t != anonymousClass0Lq3 ? "follow" : "requested").m3303K("hashtag_id", str).m3303K("hashtag_name", str2).m3310R();
            }
        }
        if (AnonymousClass0er.m6431B(this.f21270T).m6439Q(anonymousClass0Ci) == AnonymousClass0Lq.FollowStatusNotFollowing && anonymousClass0Ci.qB == AnonymousClass0Lo.PrivacyStatusPrivate) {
            AnonymousClass0Jd.f2931B.mo639M(this.f21270T).m3094M(anonymousClass0Ci.getId());
            AnonymousClass1fH anonymousClass1fH = this.f21253C;
            anonymousClass1fH.f21117P = null;
            AnonymousClass1fH.m12368B(anonymousClass1fH);
        }
    }
}
