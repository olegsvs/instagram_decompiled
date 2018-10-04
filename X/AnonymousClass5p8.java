package X;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.profile.fragment.ProfileWithMenuFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5p8 */
public final class AnonymousClass5p8 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fe f69198B;

    public AnonymousClass5p8(AnonymousClass1fe anonymousClass1fe) {
        this.f69198B = anonymousClass1fe;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1511291776);
        AnonymousClass1fo anonymousClass1fo = this.f69198B.f21193F;
        if (anonymousClass1fo.E()) {
            ProfileWithMenuFragment profileWithMenuFragment = anonymousClass1fo.f21264N;
            if (profileWithMenuFragment != null) {
                profileWithMenuFragment.mSlidingPaneLayout.F();
                AnonymousClass0cQ.L(r1, 358053720, M);
            }
        }
        if (anonymousClass1fo.E()) {
            AnonymousClass1gV.D(anonymousClass1fo.f21259I, "tap_settings", AnonymousClass1gU.SELF, AnonymousClass1fo.E(anonymousClass1fo), anonymousClass1fo.f21266P, anonymousClass1fo.f21267Q, "user_profile_header");
            AnonymousClass0IZ anonymousClass0IZ;
            if (((Boolean) AnonymousClass0CC.Ad.H(anonymousClass1fo.f21270T)).booleanValue()) {
                anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass1fo.f21252B);
                AnonymousClass0Jl.f2940B.A();
                anonymousClass0IZ.f2754D = new AnonymousClass5IK();
                anonymousClass0IZ.f2752B = "UserOptionsFragment.USER_OPTIONS_FRAGMENT_REDESIGN_BACKSTATE_NAME";
                anonymousClass0IZ.B();
            } else {
                anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass1fo.f21252B);
                AnonymousClass0Jl.f2940B.A();
                anonymousClass0IZ.f2754D = new AnonymousClass5IH();
                anonymousClass0IZ.f2752B = "UserOptionsFragment.USER_OPTIONS_FRAGMENT_BACKSTATE_NAME";
                anonymousClass0IZ.B();
            }
        } else {
            CharSequence string;
            FragmentActivity fragmentActivity = anonymousClass1fo.f21252B;
            Context C = AnonymousClass1fo.C(anonymousClass1fo);
            AnonymousClass0Ie anonymousClass0Ie = anonymousClass1fo.f21259I;
            AnonymousClass0Cm anonymousClass0Cm = anonymousClass1fo.f21270T;
            AnonymousClass0Ci A = anonymousClass1fo.A();
            AnonymousClass1fH anonymousClass1fH = anonymousClass1fo.f21253C;
            AnonymousClass0EE anonymousClass0EE = anonymousClass1fo.f21259I;
            AnonymousClass0Uq anonymousClass0Uq = new AnonymousClass0Uq(fragmentActivity, C, anonymousClass0Ie, anonymousClass0Cm, A, anonymousClass1fH, anonymousClass0EE, anonymousClass0EE, anonymousClass1fo, anonymousClass1fo.f21258H, anonymousClass0EE.getLoaderManager());
            AnonymousClass3f3.B(anonymousClass0Uq, anonymousClass0Uq.f5570H.getId(), "profile_action_sheet");
            List arrayList = new ArrayList();
            arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.REPORT, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.report_options)));
            AnonymousClass1SR anonymousClass1SR = AnonymousClass1SR.BLOCK;
            AnonymousClass0Ci anonymousClass0Ci = anonymousClass0Uq.f5570H;
            Resources C2 = AnonymousClass0Uq.C(anonymousClass0Uq);
            if (anonymousClass0Ci.f1721P) {
                string = C2.getString(C0164R.string.menu_label_unblock_user);
            } else {
                string = C2.getString(C0164R.string.menu_label_block_user);
            }
            arrayList.add(AnonymousClass0Uq.E(anonymousClass1SR, string));
            if (Boolean.TRUE.equals(anonymousClass0Uq.f5570H.HC)) {
                arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.ACCOUNT_DETAILS, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.account_details_entry_point)));
            }
            Object obj = (AnonymousClass0er.B(anonymousClass0Uq.f5578P).R(anonymousClass0Uq.f5570H) && ((Boolean) AnonymousClass0CC.fL.H(anonymousClass0Uq.f5578P)).booleanValue()) ? 1 : null;
            if (obj != null) {
                AnonymousClass1SR anonymousClass1SR2 = AnonymousClass1SR.MUTE;
                if (anonymousClass0Uq.f5570H.IB && anonymousClass0Uq.f5570H.JB) {
                    string = AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.mute_follow_unmute_option);
                } else {
                    string = AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.mute_follow_mute_option);
                }
                arrayList.add(AnonymousClass0Uq.E(anonymousClass1SR2, string));
            }
            if (anonymousClass0Uq.f5565C.I() && AnonymousClass0er.B(anonymousClass0Uq.f5578P).R(anonymousClass0Uq.f5570H) && AnonymousClass0yJ.C() && !AnonymousClass0yJ.H(anonymousClass0Uq.f5578P)) {
                if (anonymousClass0Uq.f5570H.h()) {
                    arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.REMOVE_FROM_CLOSE_FRIENDS, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.remove_from_close_friends)));
                } else {
                    arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.ADD_TO_CLOSE_FRIENDS, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.add_to_close_friends)));
                }
            }
            anonymousClass1SR = AnonymousClass1SR.BLOCK_STORY;
            anonymousClass0Ci = anonymousClass0Uq.f5570H;
            C2 = AnonymousClass0Uq.C(anonymousClass0Uq);
            if (anonymousClass0Ci.f1722Q) {
                string = C2.getString(C0164R.string.menu_label_reel_unblock_user);
            } else {
                string = C2.getString(C0164R.string.menu_label_reel_block_user);
            }
            arrayList.add(AnonymousClass0Uq.E(anonymousClass1SR, string));
            if (((Boolean) AnonymousClass0CC.Dd.H(anonymousClass0Uq.f5578P)).booleanValue()) {
                arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.SHARE_URL, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.share_profile_url)));
            }
            if (!((Boolean) AnonymousClass0CC.Cd.H(anonymousClass0Uq.f5578P)).booleanValue()) {
                arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.COPY_URL, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.copy_profile_url)));
                AnonymousClass3f3.G(anonymousClass0Uq, anonymousClass0Uq.f5570H.getId(), "profile_action_sheet", "copy_link");
            }
            arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.DIRECT_MESSAGE, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.direct_message_user)));
            arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.DIRECT_SHARE, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.direct_share_profile)));
            Boolean bool = anonymousClass0Uq.f5570H.jB;
            obj = (bool == null || !bool.booleanValue()) ? null : 1;
            if (obj != null) {
                arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.DIRECT_ACCEPT, AnonymousClass0Uq.D(anonymousClass0Uq, C0164R.string.direct_accept_message)));
            }
            if (anonymousClass0Uq.f5565C.I() && AnonymousClass0er.B(anonymousClass0Uq.f5578P).R(anonymousClass0Uq.f5570H)) {
                arrayList.add(AnonymousClass0Uq.E(AnonymousClass1SR.FAVORITE, AnonymousClass3ku.B(anonymousClass0Uq.f5570H, AnonymousClass0Uq.C(anonymousClass0Uq))));
            }
            if (anonymousClass0Uq.f5565C.I() && AnonymousClass0er.B(anonymousClass0Uq.f5578P).R(anonymousClass0Uq.f5570H) && !anonymousClass0Uq.f5570H.JB) {
                if ((anonymousClass0Uq.f5570H.XB != null ? 1 : null) != null) {
                    anonymousClass1SR = AnonymousClass1SR.FAVORITE_STORY;
                    anonymousClass0Ci = anonymousClass0Uq.f5570H;
                    C2 = AnonymousClass0Uq.C(anonymousClass0Uq);
                    if (anonymousClass0Ci.l()) {
                        string = C2.getString(C0164R.string.menu_label_turn_off_story_notifications);
                    } else {
                        string = C2.getString(C0164R.string.menu_label_turn_on_story_notifications);
                    }
                    arrayList.add(AnonymousClass0Uq.E(anonymousClass1SR, string));
                }
            }
            CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
            for (int i = 0; i < charSequenceArr.length; i++) {
                charSequenceArr[i] = (CharSequence) ((AnonymousClass0IC) arrayList.get(i)).f2728C;
            }
            new AnonymousClass0Sb(anonymousClass0Uq.f5568F).G(charSequenceArr, new AnonymousClass0Up(anonymousClass0Uq, arrayList)).F(true).C().show();
            AnonymousClass3oG.H(anonymousClass0Uq.f5566D, anonymousClass0Uq.f5570H.getId(), anonymousClass0Uq.f5578P.B().getId(), AnonymousClass3oD.IG_REPORT_ACTION_OPEN_USER_DIALOG);
            AnonymousClass10A.B(anonymousClass0Uq.f5572J.getActivity(), anonymousClass0Uq.f5566D, anonymousClass0Uq.f5570H, anonymousClass0Uq.f5578P.B(), AnonymousClass1YY.ACTION_OPEN_USER_DIALOG);
            AnonymousClass3lq.B(anonymousClass0Uq.f5566D, AnonymousClass3lp.OVERFLOW_MENU_SELECTED, anonymousClass0Uq.f5570H, null, null);
        }
        AnonymousClass0cQ.L(r1, 358053720, M);
    }
}
