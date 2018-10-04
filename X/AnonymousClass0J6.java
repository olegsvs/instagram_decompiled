package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Looper;
import android.view.ViewStub;
import com.instagram.direct.share.handler.DirectShareHandlerActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.0J6 */
public final class AnonymousClass0J6 extends AnonymousClass0J7 implements AnonymousClass0F8 {
    /* renamed from: B */
    private final List f2888B = new ArrayList();
    /* renamed from: C */
    private final AnonymousClass0J9 f2889C;
    /* renamed from: D */
    private final AnonymousClass0J8 f2890D;
    /* renamed from: E */
    private final AnonymousClass0F8 f2891E = new AnonymousClass0Tc(this);
    /* renamed from: F */
    private final List f2892F = new ArrayList();
    /* renamed from: G */
    private final Uri f2893G;
    /* renamed from: H */
    private final AnonymousClass0F8 f2894H = new AnonymousClass0Td(this);

    public AnonymousClass0J6(Context context, AnonymousClass0J8 anonymousClass0J8, AnonymousClass0J9 anonymousClass0J9, List list, List list2, AnonymousClass0Cn anonymousClass0Cn, Uri uri) {
        boolean z;
        AnonymousClass0Tq anonymousClass0Tq;
        AnonymousClass0V5 anonymousClass0V5;
        this.f2890D = anonymousClass0J8;
        this.f2889C = anonymousClass0J9;
        this.f2893G = uri;
        AnonymousClass0Tf.f5226B = new AnonymousClass0Te();
        AnonymousClass0GK.m1768B(new AnonymousClass0Tg(this));
        AnonymousClass0GK.f2339R = new AnonymousClass0O5();
        RealtimeClientManager.addRealtimeDelegateProvider(new AnonymousClass0Th(this));
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new AnonymousClass0Ti(this));
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(AnonymousClass0Tj.f5227C);
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(AnonymousClass0Tk.f5229E);
        AnonymousClass0E9 anonymousClass0Tl = new AnonymousClass0Tl(context);
        AnonymousClass0EA.m1327G("direct_v2_message", anonymousClass0Tl);
        AnonymousClass0EA.m1327G("direct_v2_delete_item", anonymousClass0Tl);
        AnonymousClass55Q.C().A(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, new AnonymousClass0Tm(context));
        AnonymousClass0J6.m2434B(anonymousClass0Cn);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0F5.class, this);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0Tn.class, this.f2891E);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0Tp.class, this.f2894H);
        String canonicalName = DirectShareHandlerActivity.class.getCanonicalName();
        if (!AnonymousClass0EF.m1358I(context)) {
            if (AnonymousClass0EF.m1359J(context)) {
                z = false;
                AnonymousClass0EF.m1368S(context, canonicalName, z);
                anonymousClass0Tq = new AnonymousClass0Tq();
                AnonymousClass0Tt.f5271J = anonymousClass0Tq;
                AnonymousClass0Tt.f5269H = anonymousClass0Tq;
                AnonymousClass0Tt.f5270I = new AnonymousClass0Tu();
                AnonymousClass0Tw.f5281d.add(new AnonymousClass0Tv());
                anonymousClass0V5 = new AnonymousClass0V5(this);
                AnonymousClass0U4.f5333X.add(anonymousClass0V5);
                AnonymousClass0U4.f5334Y.add(anonymousClass0V5);
                AnonymousClass0U4.m4676B("send_text_message", AnonymousClass0Ty.f5317C, AnonymousClass0U1.f5328E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_link_message", AnonymousClass0U5.f5356C, AnonymousClass0U1.f5328E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_like_message", AnonymousClass0U6.f5358B, AnonymousClass0U1.f5328E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_media_message", AnonymousClass0U7.f5360C, AnonymousClass0U8.f5362E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_reel_share_message", AnonymousClass0U9.f5366P, AnonymousClass0UA.f5381E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_live_video_share_message", AnonymousClass0UB.f5385F, AnonymousClass0UC.f5390E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_story_share_message", AnonymousClass0UD.f5394E, AnonymousClass0UE.f5398E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_live_viewer_invite_message", AnonymousClass0UF.f5402E, AnonymousClass0UG.f5406E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_media_share_message", AnonymousClass0UH.f5410E, AnonymousClass0UI.f5414E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_animated_media_message", AnonymousClass4k4.f56716C, AnonymousClass4iG.f56414E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("forward_visual_message", AnonymousClass0UV.f5457F, AnonymousClass0UW.f5462E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_reshare", AnonymousClass0UJ.f5418C, AnonymousClass0UK.f5420D).m627A(AnonymousClass5Wg.f65651B).m628B();
                AnonymousClass0U4.m4676B("configure_media_message", AnonymousClass4jq.f56695C, AnonymousClass5WW.f65638E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("configure_voice_message", AnonymousClass4jt.f56697C, AnonymousClass5WX.f65642E).m627A(AnonymousClass5Wc.f65649B).m628B();
                AnonymousClass0U4.m4676B("send_reaction", AnonymousClass0UL.f5423F, AnonymousClass0UM.f5428E).m627A(AnonymousClass5We.f65650B).m628B();
                AnonymousClass0U4.m4676B("unsend_message", AnonymousClass4kJ.f56738D, AnonymousClass4iP.f56430E).m628B();
                AnonymousClass0U4.m4676B("send_thread_seen_marker", AnonymousClass0UN.f5432D, AnonymousClass0UO.f5435E).m627A(AnonymousClass5Wa.f65648B).m628B();
                AnonymousClass0U4.m4676B("send_visual_item_seen_marker", AnonymousClass0UP.f5439C, AnonymousClass0UQ.f5441C).m627A(AnonymousClass5Wa.f65648B).m628B();
                AnonymousClass0U4.m4676B("send_mark_unread", AnonymousClass0UR.f5443D, AnonymousClass0US.f5446D).m628B();
                AnonymousClass0U4.m4676B("send_mute_thread", AnonymousClass4jx.f56699D, AnonymousClass4iB.f56405D).m628B();
                AnonymousClass0U4.m4676B("send_mute_video_call", AnonymousClass4k0.f56702D, AnonymousClass4iD.f56408D).m628B();
                AnonymousClass0U4.m4676B("send_poll_vote", AnonymousClass0UT.f5449F, AnonymousClass0UU.f5454D).m628B();
                AnonymousClass0U4.m4676B("direct_app_invite", AnonymousClass4k7.f56718D, AnonymousClass4iJ.f56421E).m627A(AnonymousClass5Wc.f65649B).m628B();
                this.f2888B.addAll(list);
                this.f2892F.addAll(list2);
            }
        }
        z = true;
        AnonymousClass0EF.m1368S(context, canonicalName, z);
        anonymousClass0Tq = new AnonymousClass0Tq();
        AnonymousClass0Tt.f5271J = anonymousClass0Tq;
        AnonymousClass0Tt.f5269H = anonymousClass0Tq;
        AnonymousClass0Tt.f5270I = new AnonymousClass0Tu();
        AnonymousClass0Tw.f5281d.add(new AnonymousClass0Tv());
        anonymousClass0V5 = new AnonymousClass0V5(this);
        AnonymousClass0U4.f5333X.add(anonymousClass0V5);
        AnonymousClass0U4.f5334Y.add(anonymousClass0V5);
        AnonymousClass0U4.m4676B("send_text_message", AnonymousClass0Ty.f5317C, AnonymousClass0U1.f5328E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_link_message", AnonymousClass0U5.f5356C, AnonymousClass0U1.f5328E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_like_message", AnonymousClass0U6.f5358B, AnonymousClass0U1.f5328E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_media_message", AnonymousClass0U7.f5360C, AnonymousClass0U8.f5362E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_reel_share_message", AnonymousClass0U9.f5366P, AnonymousClass0UA.f5381E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_live_video_share_message", AnonymousClass0UB.f5385F, AnonymousClass0UC.f5390E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_story_share_message", AnonymousClass0UD.f5394E, AnonymousClass0UE.f5398E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_live_viewer_invite_message", AnonymousClass0UF.f5402E, AnonymousClass0UG.f5406E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_media_share_message", AnonymousClass0UH.f5410E, AnonymousClass0UI.f5414E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_animated_media_message", AnonymousClass4k4.f56716C, AnonymousClass4iG.f56414E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("forward_visual_message", AnonymousClass0UV.f5457F, AnonymousClass0UW.f5462E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_reshare", AnonymousClass0UJ.f5418C, AnonymousClass0UK.f5420D).m627A(AnonymousClass5Wg.f65651B).m628B();
        AnonymousClass0U4.m4676B("configure_media_message", AnonymousClass4jq.f56695C, AnonymousClass5WW.f65638E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("configure_voice_message", AnonymousClass4jt.f56697C, AnonymousClass5WX.f65642E).m627A(AnonymousClass5Wc.f65649B).m628B();
        AnonymousClass0U4.m4676B("send_reaction", AnonymousClass0UL.f5423F, AnonymousClass0UM.f5428E).m627A(AnonymousClass5We.f65650B).m628B();
        AnonymousClass0U4.m4676B("unsend_message", AnonymousClass4kJ.f56738D, AnonymousClass4iP.f56430E).m628B();
        AnonymousClass0U4.m4676B("send_thread_seen_marker", AnonymousClass0UN.f5432D, AnonymousClass0UO.f5435E).m627A(AnonymousClass5Wa.f65648B).m628B();
        AnonymousClass0U4.m4676B("send_visual_item_seen_marker", AnonymousClass0UP.f5439C, AnonymousClass0UQ.f5441C).m627A(AnonymousClass5Wa.f65648B).m628B();
        AnonymousClass0U4.m4676B("send_mark_unread", AnonymousClass0UR.f5443D, AnonymousClass0US.f5446D).m628B();
        AnonymousClass0U4.m4676B("send_mute_thread", AnonymousClass4jx.f56699D, AnonymousClass4iB.f56405D).m628B();
        AnonymousClass0U4.m4676B("send_mute_video_call", AnonymousClass4k0.f56702D, AnonymousClass4iD.f56408D).m628B();
        AnonymousClass0U4.m4676B("send_poll_vote", AnonymousClass0UT.f5449F, AnonymousClass0UU.f5454D).m628B();
        AnonymousClass0U4.m4676B("direct_app_invite", AnonymousClass4k7.f56718D, AnonymousClass4iJ.f56421E).m627A(AnonymousClass5Wc.f65649B).m628B();
        this.f2888B.addAll(list);
        this.f2892F.addAll(list2);
    }

    /* renamed from: A */
    public final void mo519A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0MP anonymousClass0MP) {
        AnonymousClass0Ul.m4764B(anonymousClass0Cm.f1759C).f5554B.add(anonymousClass0MP);
    }

    /* renamed from: B */
    public final void mo520B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Um anonymousClass0Um, String str) {
        AnonymousClass0Tw.m4598C(anonymousClass0Cm).m4604B(anonymousClass0Um, str, 0, 1, null);
    }

    /* renamed from: B */
    public static void m2434B(AnonymousClass0Cn anonymousClass0Cn) {
        if (anonymousClass0Cn.xX()) {
            anonymousClass0Cn = AnonymousClass4eA.B(AnonymousClass0FL.m1559B(anonymousClass0Cn));
            AnonymousClass0Uh.m4756B(anonymousClass0Cn.f55941D);
            if (!AnonymousClass0EF.m1358I(anonymousClass0Cn.f55939B) && AnonymousClass0EF.m1359J(anonymousClass0Cn.f55939B)) {
                AnonymousClass0EJ B = AnonymousClass0Uj.m4757B(anonymousClass0Cn.f55941D);
                AnonymousClass0Fk anonymousClass0Fk = AnonymousClass0Fj.f2192B;
                if (anonymousClass0Fk.m1668C()) {
                    B.onAppBackgrounded();
                } else {
                    B.onAppForegrounded();
                }
                anonymousClass0Fk.m1666A(B);
            }
            if (!((Boolean) AnonymousClass0CC.Ya.m846H(anonymousClass0Cn.f55941D)).booleanValue()) {
                AnonymousClass0Ud.m4745B(anonymousClass0Cn.f55941D);
            }
            if (((Boolean) AnonymousClass0CC.va.m846H(anonymousClass0Cn.f55941D)).booleanValue()) {
                AnonymousClass0F4.f2058E.m1504A(AnonymousClass0W6.class, AnonymousClass0Uk.m4759B(anonymousClass0Cn.f55941D).f5549D);
            }
        }
    }

    /* renamed from: C */
    public final void mo521C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Un anonymousClass0Un) {
        anonymousClass0Cm = AnonymousClass0Uk.m4759B(anonymousClass0Cm);
        if (!anonymousClass0Cm.f5548C.contains(anonymousClass0Un)) {
            anonymousClass0Cm.f5548C.add(anonymousClass0Un);
        }
    }

    /* renamed from: D */
    public final void mo522D(AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass5pe anonymousClass5pe) {
        anonymousClass5pe.f69246B.f5562B.f5569G.show();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0GA H = anonymousClass0Pt.m3943L("direct_v2/whitelist/%s/", str).m3944M(AnonymousClass0Pv.class).m3939H();
        H.f2849B = new AnonymousClass0Us(anonymousClass0Cm, str, anonymousClass5pe);
        AnonymousClass0Ix.m2384D(H);
    }

    /* renamed from: E */
    public final void mo523E(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0Uu.m4785B(anonymousClass0Cm).m4788A(anonymousClass0EE, anonymousClass0OA);
    }

    /* renamed from: F */
    public final AnonymousClass3Il mo524F(AnonymousClass0Uv anonymousClass0Uv, AnonymousClass0Cm anonymousClass0Cm, ViewStub viewStub, AnonymousClass0Uw anonymousClass0Uw) {
        return new AnonymousClass0Ux(anonymousClass0Uv, anonymousClass0Cm, viewStub, anonymousClass0Uw);
    }

    /* renamed from: G */
    public final AnonymousClass4e8 mo525G(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0hK anonymousClass0hK) {
        return new AnonymousClass4e8(context, anonymousClass0Cm, anonymousClass0hK);
    }

    /* renamed from: H */
    public final void mo526H(AnonymousClass0Cm anonymousClass0Cm, DirectShareTarget directShareTarget, String str, AnonymousClass0Pm anonymousClass0Pm, int i, String str2, String str3) {
        AnonymousClass0Tw C = AnonymousClass0Tw.m4598C(anonymousClass0Cm);
        List arrayList = new ArrayList(1);
        String str4 = str;
        AnonymousClass0Pm anonymousClass0Pm2 = anonymousClass0Pm;
        int i2 = i;
        String str5 = str2;
        String str6 = str3;
        AnonymousClass0U0 anonymousClass0UB = new AnonymousClass0UB((DirectShareTarget) arrayList.get(0), str4, anonymousClass0Pm2, i2, str5, str6, AnonymousClass0Uz.m4809C(C, Collections.singletonList(directShareTarget), arrayList), AnonymousClass0Gd.m1839D());
        AnonymousClass0U4.m4677C(anonymousClass0Cm).m4686B(anonymousClass0UB);
        AnonymousClass0V1.m4834W(anonymousClass0UB.mo1289F(), anonymousClass0UB.f5319B);
    }

    /* renamed from: I */
    public final void mo527I(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass2E6 anonymousClass2E6) {
        AnonymousClass0Tw C = AnonymousClass0Tw.m4598C(anonymousClass0Cm);
        List arrayList = new ArrayList(1);
        AnonymousClass2E6 anonymousClass2E62 = anonymousClass2E6;
        Long C2 = AnonymousClass0Uz.m4809C(C, Collections.singletonList(anonymousClass2E62.f27800L), arrayList);
        DirectShareTarget directShareTarget = (DirectShareTarget) arrayList.get(0);
        String str = anonymousClass2E62.f27799K;
        String str2 = anonymousClass2E62.f27798J;
        AnonymousClass0P7 anonymousClass0P7 = anonymousClass2E62.f27792D;
        String str3 = anonymousClass2E62.f27804P;
        String str4 = anonymousClass2E62.f27796H;
        String str5 = anonymousClass2E62.f27803O;
        String str6 = anonymousClass2E62.f27791C;
        String str7 = anonymousClass2E62.f27795G;
        String str8 = anonymousClass2E62.f27793E;
        String str9 = anonymousClass2E62.f27794F;
        String str10 = anonymousClass2E62.f27801M;
        String str11 = anonymousClass2E62.f27802N;
        Integer num = anonymousClass2E62.f27797I;
        String str12 = str11;
        AnonymousClass0U0 anonymousClass0U9 = new AnonymousClass0U9(directShareTarget, str, str2, anonymousClass0P7, str3, str4, str5, str6, str7, str8, str9, str10, str12, num, anonymousClass2E62.f27790B, C2, AnonymousClass0Gd.m1839D());
        AnonymousClass0U4.m4677C(anonymousClass0Cm).m4686B(anonymousClass0U9);
        AnonymousClass0V1.m4834W(anonymousClass0U9.mo1289F(), anonymousClass0U9.f5319B);
    }

    /* renamed from: J */
    public final void mo528J(AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        AnonymousClass4eA.B(anonymousClass0Cm).A(z);
    }

    /* renamed from: K */
    public final void mo529K(AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        anonymousClass0Cm = AnonymousClass4eA.B(anonymousClass0Cm);
        if (!anonymousClass0Cm.f55940C) {
            if (((Boolean) AnonymousClass0CC.Xa.m846H(anonymousClass0Cm.f55941D)).booleanValue()) {
                Looper.myQueue().addIdleHandler(new AnonymousClass4e9(anonymousClass0Cm, z));
            } else {
                anonymousClass0Cm.A(z);
            }
        }
    }

    /* renamed from: L */
    public final int mo530L(AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass0Ul.m4764B(anonymousClass0Cm.f1759C).m4765A();
    }

    /* renamed from: M */
    public final List mo531M(AnonymousClass0Cm anonymousClass0Cm) {
        return Arrays.asList(new AnonymousClass0Ui[]{AnonymousClass0Uh.m4756B(anonymousClass0Cm), AnonymousClass4ie.B(anonymousClass0Cm), AnonymousClass0V2.m4852B(anonymousClass0Cm), AnonymousClass5Wh.C(anonymousClass0Cm)});
    }

    /* renamed from: N */
    public final AnonymousClass0J9 mo532N() {
        return this.f2889C;
    }

    /* renamed from: O */
    public final AnonymousClass0J8 mo533O() {
        return this.f2890D;
    }

    /* renamed from: P */
    public final Uri mo534P() {
        return this.f2893G;
    }

    /* renamed from: Q */
    public final AnonymousClass0V4 mo535Q(Activity activity, AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass0EE anonymousClass0EE) {
        return new AnonymousClass0V3(activity, anonymousClass0Cm, str, anonymousClass0EE);
    }

    /* renamed from: R */
    public final void mo536R(Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, String str) {
        Context applicationContext = context.getApplicationContext();
        int i = 335544320;
        if (AnonymousClass0EF.m1358I(applicationContext) || !AnonymousClass0EF.m1359J(applicationContext)) {
            if (AnonymousClass0T1.m4441B(context, Activity.class) != null) {
                i = 67108864;
            }
            AnonymousClass0IW.m2243I(AnonymousClass0V7.m4858B(context, i), context);
            return;
        }
        Intent addFlags = AnonymousClass0RW.m4197C(applicationContext, anonymousClass0Cm.f1759C, "com.instagram.direct", UUID.randomUUID().toString(), str, new Builder().scheme("directapp").authority("main-direct-inbox").build()).addFlags(335544320);
        AnonymousClass0V6.m4853B(anonymousClass0Cm);
        String str2 = "direct_inbox";
        AnonymousClass0V6.m4854C(anonymousClass0EE, str, str2, AnonymousClass0RW.m4199E(addFlags.getData()));
        if (!AnonymousClass0IW.m2249O(addFlags, AnonymousClass0RW.m4200F(context), applicationContext)) {
            AnonymousClass0V6.m4853B(anonymousClass0Cm);
            AnonymousClass0V6.m4855D(anonymousClass0EE, str, str2, AnonymousClass0RW.m4199E(addFlags.getData()), "destination_app_not_started");
        }
    }

    /* renamed from: S */
    public final AnonymousClass0TK mo537S(Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0V8 anonymousClass0V8, boolean z, List list, AnonymousClass0EE anonymousClass0EE) {
        return new AnonymousClass0V9(context, anonymousClass0Fz, anonymousClass0Cm, anonymousClass0V8, z, list, anonymousClass0EE);
    }

    /* renamed from: T */
    public final void mo538T(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass0VF.m4866C(anonymousClass0Cm, anonymousClass0OA);
    }

    /* renamed from: U */
    public final void mo539U(AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, String str) {
        for (AnonymousClass0JD anonymousClass0JD : this.f2892F) {
            if ("direct_story_viewer_fragment".equals(anonymousClass0EE.getModuleName()) && str.equals(AnonymousClass0V0.TEXT.m4811A())) {
                AnonymousClass0OR.m3626F(anonymousClass0JD.f2900C, new AnonymousClass0VG(anonymousClass0JD), 500, -979984221);
            }
        }
    }

    /* renamed from: V */
    public final void mo540V(AnonymousClass0Cm anonymousClass0Cm, List list, AnonymousClass0VH anonymousClass0VH) {
        for (AnonymousClass0JB anonymousClass0JB : this.f2888B) {
            if (anonymousClass0JB.lY(anonymousClass0VH)) {
                anonymousClass0JB.Wx(anonymousClass0Cm, list, anonymousClass0VH);
            }
        }
    }

    /* renamed from: W */
    public final void mo541W(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA, List list, String str, List list2) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        for (AnonymousClass0VI anonymousClass0VI : list2) {
            hashMap.put(anonymousClass0VI.f5692D, anonymousClass0VI);
            Collections.sort(anonymousClass0VI.f5691C);
            hashMap2.put(anonymousClass0VI.f5691C, anonymousClass0VI);
        }
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        AnonymousClass0Tw C = AnonymousClass0Tw.m4598C(anonymousClass0Cm2);
        for (DirectShareTarget directShareTarget : list) {
            AnonymousClass0W7 U;
            DirectThreadKey F = C.m4625W(directShareTarget.m4805C(), directShareTarget.m4804B()).m4934F();
            String str2 = str;
            if (str != null) {
                U = C.m4623U(F, AnonymousClass0V0.EXPIRING_MEDIA, str2);
            } else {
                AnonymousClass0WH S = C.m4621S(F);
                AnonymousClass0OA anonymousClass0OA2 = anonymousClass0OA;
                U = S != null ? S.m5076M(AnonymousClass0V0.EXPIRING_MEDIA, anonymousClass0OA2) : null;
                if (U == null) {
                    AnonymousClass0Gn.m1876C("DirectShareHelper", "directMessage null");
                    U = AnonymousClass0W7.m4992C(anonymousClass0Cm2.m1037B(), AnonymousClass0V0.EXPIRING_MEDIA, new AnonymousClass0WE(anonymousClass0OA2), null, AnonymousClass0Gd.m1839D(), AnonymousClass0W7.m4993D());
                    U.m5029e(AnonymousClass0VM.UPLOADING);
                }
            }
            if (U != null) {
                AnonymousClass0VI anonymousClass0VI2;
                List A = directShareTarget.m4803A();
                Collections.sort(A);
                if (directShareTarget.m4805C() == null) {
                    anonymousClass0VI2 = (AnonymousClass0VI) hashMap2.get(A);
                } else {
                    anonymousClass0VI2 = (AnonymousClass0VI) hashMap.get(directShareTarget.m4805C());
                }
                AnonymousClass0Xb.m5255B(anonymousClass0Cm2, F, U, anonymousClass0VI2.f5690B, anonymousClass0VI2.f5692D, anonymousClass0VI2.f5693E);
            }
        }
    }

    /* renamed from: X */
    public final void mo542X(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA, List list) {
        if (list != null) {
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0VL());
        }
    }

    /* renamed from: Y */
    public final void mo543Y(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0MP anonymousClass0MP) {
        AnonymousClass0Ul.m4764B(anonymousClass0Cm.f1759C).f5554B.remove(anonymousClass0MP);
    }

    /* renamed from: Z */
    public final void mo544Z(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Un anonymousClass0Un) {
        AnonymousClass0Uk.m4759B(anonymousClass0Cm).f5548C.remove(anonymousClass0Un);
    }

    /* renamed from: a */
    public final void mo545a(AnonymousClass0OA anonymousClass0OA, String str) {
        AnonymousClass0V1.m4835X(AnonymousClass4ZX.C(anonymousClass0OA), str);
    }

    /* renamed from: b */
    public final void mo546b(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0VO anonymousClass0VO) {
        AnonymousClass0Ul.m4764B(anonymousClass0Cm.f1759C).m4766B(anonymousClass0VO);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.m5859I(this, 1375768269);
        AnonymousClass0F5 anonymousClass0F5 = (AnonymousClass0F5) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.m5859I(this, 135047982);
        AnonymousClass0J6.m2434B(anonymousClass0F5.f2062B);
        AnonymousClass0cQ.m5858H(this, -1094988075, I2);
        AnonymousClass0cQ.m5858H(this, 248312260, I);
    }
}
