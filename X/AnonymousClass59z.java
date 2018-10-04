package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.facebook.C0164R;

/* renamed from: X.59z */
public final class AnonymousClass59z implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5AB f60703B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5AA f60704C;
    /* renamed from: D */
    public final /* synthetic */ boolean f60705D;
    /* renamed from: E */
    public final /* synthetic */ OnDismissListener f60706E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass5ww f60707F;

    public AnonymousClass59z(AnonymousClass5AB anonymousClass5AB, AnonymousClass5AA anonymousClass5AA, boolean z, OnDismissListener onDismissListener, AnonymousClass5ww anonymousClass5ww) {
        this.f60703B = anonymousClass5AB;
        this.f60704C = anonymousClass5AA;
        this.f60705D = z;
        this.f60706E = onDismissListener;
        this.f60707F = anonymousClass5ww;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = AnonymousClass5AB.m25887F(this.f60703B)[i];
        if (this.f60703B.f60740P.getString(C0164R.string.report_options).equals(obj)) {
            new AnonymousClass3o5(this.f60703B.f60727C, this.f60703B.f60732H, this.f60703B.f60734J.f4134F, this.f60703B.f60734J.getId(), this.f60703B.f60742R, this.f60704C, this.f60703B.f60735K, false, this.f60705D ? AnonymousClass3o4.LIVE : AnonymousClass3o4.MEDIA).A();
        } else if (this.f60703B.f60740P.getString(C0164R.string.stories_show_less).equals(obj)) {
            AnonymousClass0Px.B(this.f60703B.f60727C, this.f60703B.f60736L, AnonymousClass0Nz.D(this.f60703B.f60742R, this.f60703B.f60734J.f4138J, "explore_viewer", this.f60703B.f60738N.f14103H.H()));
            r2 = this.f60703B.f60742R;
            r3 = this.f60703B.f60732H;
            r4 = AnonymousClass3KW.f40183B;
            AnonymousClass0Pj anonymousClass0Pj = this.f60703B.f60734J;
            AnonymousClass1Pl.B(r2, r3, r4, anonymousClass0Pj.f4134F.NO(), anonymousClass0Pj.f4134F.TO(), anonymousClass0Pj.f4138J.getId(), AnonymousClass3KX.f40187D, this.f60703B.f60741Q, this.f60703B.f60738N.f14103H.f3374G, null, null, null, AnonymousClass1Pl.f18230B);
            AnonymousClass0Zc H = this.f60703B.f60738N.H();
            if (H.gT() == AnonymousClass0Zd.USER && this.f60703B.f60734J.f4138J.equals(H.pT())) {
                this.f60703B.f60738N.f14103H.f3383P = true;
                this.f60704C.qn();
            } else {
                this.f60704C.pn(AnonymousClass0x3.ORGANIC_SHOW_LESS);
            }
        } else if (this.f60703B.f60740P.getString(C0164R.string.live_videos_show_less).equals(obj)) {
            r2 = this.f60703B.f60742R;
            r3 = this.f60703B.f60732H;
            r4 = AnonymousClass3KW.f40183B;
            AnonymousClass0Pm anonymousClass0Pm = this.f60703B.f60734J.f4131C;
            AnonymousClass1Pl.B(r2, r3, r4, anonymousClass0Pm.f4162P, AnonymousClass0ON.LIVE, anonymousClass0Pm.f4174b.getId(), AnonymousClass3KX.f40187D, this.f60703B.f60741Q, this.f60703B.f60738N.f14103H.f3374G, null, null, null, AnonymousClass1Pl.f18230B);
            this.f60704C.pn(AnonymousClass0x3.ORGANIC_SHOW_LESS);
        } else if (this.f60703B.f60740P.getString(C0164R.string.sponsor_tag_dialog_title).equals(obj)) {
            AnonymousClass0bN.Q("branded_content_click", this.f60703B.f60732H, this.f60703B.f60734J.G(), this.f60703B.f60733I, -1, "about");
            new AnonymousClass0he(this.f60703B.f60727C, this.f60703B.f60742R, "https://help.instagram.com/1199202110205564", AnonymousClass0hf.BRANDED_CONTENT_ABOUT).E(this.f60703B.getModuleName()).D();
        } else if (this.f60703B.f60740P.getString(C0164R.string.remove_me_from_post).equals(obj)) {
            new AnonymousClass0Sb(this.f60703B.f60727C).Q(C0164R.string.remove_sponsor_tag_title).H(C0164R.string.remove_sponsor_tag_subtitle).O(C0164R.string.ok, new AnonymousClass59y(this)).L(C0164R.string.cancel, new AnonymousClass59x(this)).C().show();
        } else if (this.f60703B.f60740P.getString(C0164R.string.copy_link_url).equals(obj)) {
            AnonymousClass5AB.m25886E(this.f60703B);
            r3 = this.f60703B;
            AnonymousClass3f3.F(r3, r3.f60734J.getId(), "story_highlight_action_sheet", "copy_link");
        } else if (this.f60703B.f60740P.getString(C0164R.string.highlight_share_to_story_option).equals(obj)) {
            AnonymousClass5AB.m25892K(this.f60703B, this.f60707F);
        }
        this.f60703B.f60735K = null;
    }
}
