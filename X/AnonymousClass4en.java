package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.simplewebview.SimpleWebViewActivity;
import java.util.List;

/* renamed from: X.4en */
public final class AnonymousClass4en implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ OnClickListener f56039B;
    /* renamed from: C */
    public final /* synthetic */ Context f56040C;
    /* renamed from: D */
    public final /* synthetic */ List f56041D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass5WQ f56042E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass5bQ f56043F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Cm f56044G;

    public AnonymousClass4en(AnonymousClass5WQ anonymousClass5WQ, List list, Context context, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, OnClickListener onClickListener) {
        this.f56042E = anonymousClass5WQ;
        this.f56041D = list;
        this.f56040C = context;
        this.f56043F = anonymousClass5bQ;
        this.f56044G = anonymousClass0Cm;
        this.f56039B = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0W7 anonymousClass0W7 = this.f56042E.f65618B;
        int i2 = i;
        String str = (String) this.f56041D.get(i2);
        if (str.equals(this.f56040C.getString(C0164R.string.direct_unsend_message))) {
            this.f56043F.L(anonymousClass0W7);
        } else if (str.equals(this.f56040C.getString(C0164R.string.direct_save))) {
            AnonymousClass0GA C;
            AnonymousClass0IL anonymousClass0IL = this.f56043F.f66939B;
            Context context = anonymousClass0IL.getContext();
            AnonymousClass0WE anonymousClass0WE = anonymousClass0W7.f5877G;
            if (anonymousClass0WE != null) {
                C = AnonymousClass1RC.C(context, AnonymousClass1RC.H(anonymousClass0WE, "DirectThreadFragment"), true);
            } else {
                AnonymousClass0P7 anonymousClass0P7;
                if (anonymousClass0W7.f5915s == AnonymousClass0V0.MEDIA) {
                    anonymousClass0P7 = anonymousClass0W7.f5896Z;
                } else {
                    anonymousClass0P7 = anonymousClass0W7.I();
                }
                C = AnonymousClass1RC.D(context, anonymousClass0P7, true, "DirectThreadFragment");
            }
            C.f9990B = new AnonymousClass4cQ(anonymousClass0IL, context, anonymousClass0W7);
            AnonymousClass0Ix.D(C);
        } else if (str.equals(this.f56040C.getString(C0164R.string.direct_report_message))) {
            AnonymousClass5bQ anonymousClass5bQ = this.f56043F;
            AnonymousClass5WQ anonymousClass5WQ = this.f56042E;
            AnonymousClass0W7 anonymousClass0W72 = anonymousClass5WQ.f65618B;
            if (anonymousClass0W72.f5915s == AnonymousClass0V0.EXPIRING_MEDIA) {
                AnonymousClass0P7 I = anonymousClass0W72.I();
                new AnonymousClass3o5(anonymousClass5bQ.f66939B.getActivity(), anonymousClass5bQ.f66939B, I, I.getId(), anonymousClass5bQ.f66939B.f65382o, new AnonymousClass4cX(anonymousClass5bQ, anonymousClass0W72, anonymousClass5WQ), null, false, anonymousClass5WQ.f65627K.f56244E, anonymousClass5WQ.f65618B.f5885O, AnonymousClass3o4.DIRECT_STORY).m20720A();
            } else if (anonymousClass5bQ.f66939B.f65377j != null) {
                String B;
                AnonymousClass3oG.m20731D(anonymousClass5bQ.f66939B, anonymousClass5WQ.f65627K.f56244E, anonymousClass5WQ.f65618B.f5885O, anonymousClass5bQ.f66939B.f65382o.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_REPORT_IN_WEBVIEW);
                Context context2 = anonymousClass5bQ.f66939B.getContext();
                str = anonymousClass5bQ.f66939B.f65382o.f1759C;
                DirectThreadKey F = anonymousClass5bQ.f66939B.f65377j.F();
                if (AnonymousClass1Uo.f19166C.f19167B != null) {
                    AnonymousClass0Qu anonymousClass0Qu = new AnonymousClass0Qu();
                    anonymousClass0Qu.H(AnonymousClass3oF.REPORT_FLOW_ID.m20728A(), AnonymousClass1Uo.f19166C.f19167B);
                    AnonymousClass16y.C(anonymousClass0Qu);
                    B = AnonymousClass0fz.B(AnonymousClass0IE.E("/direct_v2/threads/%s/items/%s/flag/?%s", new Object[]{F.f5871C, anonymousClass0W72.f5885O, anonymousClass0Qu.C()}));
                } else {
                    B = AnonymousClass0fz.B(AnonymousClass0IE.E("/direct_v2/threads/%s/items/%s/flag/", new Object[]{F.f5871C, anonymousClass0W72.f5885O}));
                }
                AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su(B);
                anonymousClass0Su.f5039M = context2.getString(C0164R.string.report_inappropriate);
                SimpleWebViewActivity.C(context2, str, anonymousClass0Su.A());
            } else {
                AnonymousClass0Gn.C("Unable to report message", String.format("mThreadSummary is null for message id: %s", new Object[]{anonymousClass0W72.f5885O}));
            }
        } else if (str.equals(this.f56040C.getString(C0164R.string.direct_copy_message_text))) {
            AnonymousClass3BY.m18926B(this.f56040C, AnonymousClass0Tf.f5226B.A(anonymousClass0W7.f5915s).PS(this.f56042E.f65627K.f56242C, this.f56044G, anonymousClass0W7, this.f56040C.getResources()));
        } else if (str.equals(this.f56040C.getString(C0164R.string.direct_save_quick_reply))) {
            String PS = AnonymousClass0Tf.f5226B.A(anonymousClass0W7.f5915s).PS(this.f56042E.f65627K.f56242C, this.f56044G, anonymousClass0W7, this.f56040C.getResources());
            AnonymousClass5Vd anonymousClass5Vd = this.f56043F.f66939B.f65359R;
            AnonymousClass4am anonymousClass4am = anonymousClass5Vd.f65401B.f55745F.f56610p;
            AnonymousClass0LH.E(anonymousClass4am);
            AnonymousClass0V1.L(anonymousClass5Vd.f65401B, "thread_save_tap", anonymousClass4am.f55542B, anonymousClass4am.f55544D, anonymousClass4am.f55543C).R();
            Bundle bundle = new Bundle();
            anonymousClass4am.m24539A(bundle);
            bundle.putString("DirectEditQuickReplyFragment.quick_reply_message", PS);
            new AnonymousClass0Sn(ModalActivity.class, "direct_edit_quick_reply", bundle, anonymousClass5Vd.f65401B.getActivity(), anonymousClass5Vd.f65401B.f55755P.f1759C).B(anonymousClass5Vd.f65401B.getActivity());
        } else if (str.equals(this.f56040C.getString(C0164R.string.unlike))) {
            AnonymousClass5VY.O(this.f56043F.f66939B, anonymousClass0W7, false);
        } else if (str.equals(this.f56040C.getString(C0164R.string.direct_see_all_by_creator))) {
            AnonymousClass4di anonymousClass4di = ((AnonymousClass4db) this.f56042E.f65618B.f5876F).f55863F;
            AnonymousClass5bQ anonymousClass5bQ2 = this.f56043F;
            str = anonymousClass4di.f55874C;
            AnonymousClass5Vd anonymousClass5Vd2 = anonymousClass5bQ2.f66939B.f65359R;
            anonymousClass5Vd2.f65401B.f55745F.m24898B();
            anonymousClass5Vd2.f65401B.f55745F.m24897A();
            AnonymousClass4jh anonymousClass4jh = anonymousClass5Vd2.f65401B.f55745F.f56580L;
            anonymousClass4jh.m24924B();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("@");
            stringBuilder.append(str);
            Object stringBuilder2 = stringBuilder.toString();
            anonymousClass4jh.f56676N.setText(stringBuilder2);
            AnonymousClass4jh.m24915D(anonymousClass4jh, stringBuilder2);
        } else {
            OnClickListener onClickListener = this.f56039B;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
        }
    }
}
