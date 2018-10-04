package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.Collections;

/* renamed from: X.10a */
public final class AnonymousClass10a implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass10V f13288B;

    public AnonymousClass10a(AnonymousClass10V anonymousClass10V) {
        this.f13288B = anonymousClass10V;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Object obj = AnonymousClass10V.m8716B(this.f13288B)[i];
        AnonymousClass0Ci pT = this.f13288B.f13283G.f3385R.pT();
        AnonymousClass10W anonymousClass10W;
        if (this.f13288B.f13278B.getString(C0164R.string.add_to_your_story_option).equals(obj)) {
            anonymousClass10W = this.f13288B.f13281E;
            anonymousClass10W.f13286B.f8403S.OWA(AnonymousClass3jF.B().B(anonymousClass10W.f13286B.f8403S.xJ().mo1417G()).A(true).C("your_story_dialog_option").ID());
        } else if (this.f13288B.f13278B.getString(C0164R.string.edit_favorites_option).equals(obj)) {
            new AnonymousClass0kV(this.f13288B.f13278B, this.f13288B.f13285I).m7177C(AnonymousClass0xq.SELF_REEL_TRAY);
        } else {
            if (pT != null) {
                if (this.f13288B.f13278B.getString(C0164R.string.mute_user, new Object[]{pT.uT()}).equals(obj)) {
                    AnonymousClass3lq.B(this.f13288B.f13279C, AnonymousClass3lp.f44230G, pT, null, "story_tray");
                    AnonymousClass59h.D(true, this.f13288B.f13283G, this.f13288B.f13280D, this.f13288B.f13282F.getLoaderManager(), this.f13288B.f13285I, this.f13288B.f13284H);
                    return;
                }
            }
            if (pT != null) {
                if (this.f13288B.f13278B.getString(C0164R.string.unmute_user, new Object[]{pT.uT()}).equals(obj)) {
                    AnonymousClass3lq.B(this.f13288B.f13279C, AnonymousClass3lp.f44234K, pT, null, "story_tray");
                    AnonymousClass59h.D(false, this.f13288B.f13283G, this.f13288B.f13280D, this.f13288B.f13282F.getLoaderManager(), this.f13288B.f13285I, this.f13288B.f13284H);
                    return;
                }
            }
            if (this.f13288B.f13278B.getString(C0164R.string.mute_follow_mute_option).equals(obj)) {
                AnonymousClass10V anonymousClass10V = this.f13288B;
                AnonymousClass3lq.B(anonymousClass10V.f13279C, AnonymousClass3lp.f44227D, anonymousClass10V.f13283G.f3385R.pT(), null, "story_tray");
                AnonymousClass3lv.B(anonymousClass10V.f13278B, anonymousClass10V.f13285I, anonymousClass10V.f13279C, anonymousClass10V.f13283G.f3385R.pT(), AnonymousClass3lz.f44244D, null, "story_tray", new AnonymousClass5AG(anonymousClass10V));
            } else if (this.f13288B.f13278B.getString(C0164R.string.mute_follow_unmute_story_option).equals(obj)) {
                AnonymousClass10V anonymousClass10V2 = this.f13288B;
                r4 = "story_tray";
                AnonymousClass3lq.B(anonymousClass10V2.f13279C, AnonymousClass3lp.f44227D, anonymousClass10V2.f13283G.f3385R.pT(), null, r4);
                AnonymousClass3lq.B(anonymousClass10V2.f13279C, AnonymousClass3lp.f44234K, anonymousClass10V2.f13283G.f3385R.pT(), null, r4);
                AnonymousClass3m5.E(anonymousClass10V2.f13285I, anonymousClass10V2.f13283G.f3385R.pT(), false, true, new AnonymousClass1Yg(anonymousClass10V2));
            } else if (pT != null && this.f13288B.f13278B.getString(C0164R.string.view_profile).equals(obj)) {
                anonymousClass10W = this.f13288B.f13281E;
                r4 = pT.getId();
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass10W.f13286B.f8392H.getActivity());
                anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.mo659B().m4355D(AnonymousClass0bx.m5660C(anonymousClass10W.f13286B.f8404T, r4, "reel_tray_user_options").m5662A());
                anonymousClass0IZ.m2308B();
            } else if (this.f13288B.f13278B.getString(C0164R.string.message).equals(obj)) {
                AnonymousClass0J7.f2895B.mo535Q(this.f13288B.f13278B, this.f13288B.f13285I, "reel_options_feed_tray", this.f13288B.f13279C).rQA(Collections.singletonList(new PendingRecipient(this.f13288B.f13283G.f3385R.pT()))).DZ();
            } else if (this.f13288B.f13283G.f3385R.gT() == AnonymousClass0Zd.HASHTAG) {
                Hashtag hashtag = new Hashtag(this.f13288B.f13283G.f3385R.getId());
                if (this.f13288B.f13278B.getString(C0164R.string.view_hashtag_page).equals(obj)) {
                    AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(this.f13288B.f13281E.f13286B.f8392H.getActivity());
                    anonymousClass0IZ2.f2754D = AnonymousClass3Qs.f41179B.A().A(hashtag);
                    anonymousClass0IZ2.f2753C = "story_menu_hashtag";
                    anonymousClass0IZ2.m2308B();
                    return;
                }
                if (this.f13288B.f13278B.getString(C0164R.string.mute_hashtag_story, new Object[]{hashtag.f2793M}).equals(obj)) {
                    AnonymousClass59h.B(true, this.f13288B.f13283G, this.f13288B.f13280D, this.f13288B.f13282F.getLoaderManager(), this.f13288B.f13285I, this.f13288B.f13284H);
                    return;
                }
                if (this.f13288B.f13278B.getString(C0164R.string.unmute_hashtag_story, new Object[]{hashtag.f2793M}).equals(obj)) {
                    AnonymousClass59h.B(false, this.f13288B.f13283G, this.f13288B.f13280D, this.f13288B.f13282F.getLoaderManager(), this.f13288B.f13285I, this.f13288B.f13284H);
                }
            }
        }
    }
}
