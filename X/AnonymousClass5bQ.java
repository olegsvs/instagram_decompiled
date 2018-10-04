package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogChronologicalFragment;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.5bQ */
public final class AnonymousClass5bQ implements AnonymousClass0pu, AnonymousClass0yL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5VY f66939B;

    public AnonymousClass5bQ(AnonymousClass5VY anonymousClass5VY) {
        this.f66939B = anonymousClass5VY;
    }

    /* renamed from: A */
    public final void m27838A(AnonymousClass0P7 anonymousClass0P7, RectF rectF) {
        AnonymousClass2CW A;
        this.f66939B.f65359R.m27192A();
        AnonymousClass0TP anonymousClass0TP = new AnonymousClass0TP(AnonymousClass2CQ.DIRECT, System.currentTimeMillis());
        anonymousClass0TP.f5195I = anonymousClass0P7.getId();
        anonymousClass0TP.f5197K = rectF;
        anonymousClass0TP.f5188B = true;
        if (((Boolean) AnonymousClass0CC.fO.H(this.f66939B.f65382o)).booleanValue()) {
            A = AnonymousClass2CP.f27395B.A(this.f66939B.f65382o);
            A.G(Collections.singletonList(A.A(anonymousClass0P7, this.f66939B.getResources())));
            anonymousClass0TP.A();
        } else {
            anonymousClass0TP.C();
            A = null;
        }
        anonymousClass0TP.D(this.f66939B.getActivity(), this.f66939B.f65382o, A);
    }

    /* renamed from: B */
    public final void m27839B(AnonymousClass0P7 anonymousClass0P7, String str, View view, GradientSpinner gradientSpinner) {
        this.f66939B.f65359R.m27192A();
        this.f66939B.f65346E.m25023A(anonymousClass0P7, str, view, gradientSpinner);
        AnonymousClass0V1.g(this.f66939B, AnonymousClass0V0.REEL_SHARE.A());
    }

    /* renamed from: C */
    public final void m27840C(AnonymousClass0W7 anonymousClass0W7, boolean z, boolean z2, RectF rectF, AnonymousClass4dx anonymousClass4dx) {
        AnonymousClass0W7 anonymousClass0W72 = anonymousClass0W7;
        if (this.f66939B.f65377j != null) {
            if (this.f66939B.f65377j.F().f5871C != null) {
                AnonymousClass5VY anonymousClass5VY = this.f66939B;
                AnonymousClass5VY.m27166M(anonymousClass5VY, 2, anonymousClass5VY.f65377j.F(), anonymousClass0W72, z, z2, "launch_surface_thread_message", rectF, anonymousClass4dx);
                return;
            }
        }
        AnonymousClass0Gn.C("Unable to navigate to expiring media viewer fragment", String.format("mThreadSummary or threadId is null for message id: %s", new Object[]{anonymousClass0W7.f5885O}));
    }

    /* renamed from: D */
    public final void m27841D(String str) {
        AnonymousClass0IL anonymousClass0IL = this.f66939B;
        AnonymousClass0NN.B("direct_thread_tap_sender_profile", anonymousClass0IL).F("thread_id", anonymousClass0IL.f65374g).F("sender_id", str).R();
        AnonymousClass0bx C = AnonymousClass0bx.C(anonymousClass0IL.f65382o, str, "direct_thread_username");
        C.f6914N = false;
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(C.A());
        anonymousClass0IZ.B();
    }

    /* renamed from: E */
    public final void m27842E(AnonymousClass0W7 anonymousClass0W7) {
        if (this.f66939B.f65377j == null) {
            AnonymousClass0Gn.C("Unable to start video call", String.format("mThreadSummary is null for message id: %s", new Object[]{anonymousClass0W7.f5885O}));
        } else if (this.f66939B.f65374g == null) {
            AnonymousClass0Gn.C("Unable to start video call", String.format("mThreadId is null for message id: %s", new Object[]{anonymousClass0W7.f5885O}));
        } else {
            AnonymousClass0WA.C(this.f66939B.getContext(), this.f66939B.f65382o, this.f66939B.f65377j, this.f66939B.f65374g, this.f66939B, "direct_action_log");
        }
    }

    public final void Eg(String str, View view, ClickableSpan clickableSpan) {
        Object obj = this.f66939B;
        AnonymousClass0V1.O(obj, "direct_thread_link_tap", obj.f65374g, obj.f65377j.J()).F("hashtag", str).R();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(obj.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass3Qs.f41179B.A().m25253A(new Hashtag(str));
        anonymousClass0IZ.B();
    }

    /* renamed from: F */
    public final void m27843F(String str, String str2, String str3, AnonymousClass0yh anonymousClass0yh) {
        Object obj = this.f66939B;
        AnonymousClass0V1.O(obj, "direct_thread_link_tap", obj.f65374g, obj.f65377j.J()).F("media_id", str).R();
        AnonymousClass1Vp VMA = AnonymousClass0IY.B().Y(str).SPA(str2).cPA(str3).VMA();
        if (anonymousClass0yh == AnonymousClass0yh.ARCHIVED) {
            VMA.UPA();
        }
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(obj.getActivity());
        anonymousClass0IZ.f2754D = VMA.DD();
        anonymousClass0IZ.B();
    }

    /* renamed from: G */
    public final void m27844G(AnonymousClass0W7 anonymousClass0W7) {
        if (!anonymousClass0W7.f5889S.contains(this.f66939B.f65382o.B()) && AnonymousClass5VY.m27168O(this.f66939B, anonymousClass0W7, true)) {
            this.f66939B.f65356O = true;
            AnonymousClass0OR.F(this.f66939B.f65380m, new AnonymousClass4cW(this), 3000, -1780181936);
        }
    }

    /* renamed from: H */
    public final void m27845H() {
        new AnonymousClass0Sn(ModalActivity.class, "archive_home", new Bundle(), this.f66939B.getActivity(), this.f66939B.f65382o.f1759C).B(this.f66939B.getContext());
    }

    /* renamed from: I */
    public final void m27846I(String str) {
        this.f66939B.f65359R.m27192A();
        AnonymousClass0bz B = AnonymousClass0bz.B(this.f66939B.getContext());
        AnonymousClass0J7.f2895B.O();
        String str2 = this.f66939B.f65374g;
        String str3 = this.f66939B.f65382o.f1759C;
        Collection B2 = PendingRecipient.B(this.f66939B.f65377j.J());
        boolean d = this.f66939B.f65377j.d();
        AnonymousClass0J7.f2895B.N();
        Bundle bundle = new Bundle();
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", str2);
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID", str);
        bundle.putParcelableArrayList("DirectFragment.ARGUMENT_RECIPIENTS", new ArrayList(B2));
        bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_GROUP", d);
        bundle.putString("IgSessionManager.USER_ID", str3);
        AnonymousClass0IL directVisualMessageActionLogChronologicalFragment = ((Boolean) AnonymousClass0CC.sI.G()).booleanValue() ? new DirectVisualMessageActionLogChronologicalFragment() : new DirectVisualMessageActionLogPriorityFragment();
        directVisualMessageActionLogChronologicalFragment.setArguments(bundle);
        B.C(directVisualMessageActionLogChronologicalFragment);
    }

    /* renamed from: J */
    public final void m27847J(AnonymousClass0W7 anonymousClass0W7) {
        AnonymousClass0IL anonymousClass0IL = this.f66939B;
        List arrayList = new ArrayList(2);
        arrayList.add(anonymousClass0IL.getString(C0164R.string.direct_unsend_message));
        if (anonymousClass0W7.f5887Q != AnonymousClass0VM.WILL_NOT_UPLOAD) {
            arrayList.add(anonymousClass0IL.getString(C0164R.string.direct_retry_send_message));
            if (((Boolean) AnonymousClass0CC.f1474j.H(anonymousClass0IL.f65382o)).booleanValue()) {
                arrayList.add(anonymousClass0IL.getString(C0164R.string.rageshake_title));
            }
        }
        new AnonymousClass0Sb(anonymousClass0IL.getContext()).G((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new AnonymousClass4cJ(anonymousClass0IL, arrayList, anonymousClass0W7)).E(true).F(true).C().show();
    }

    /* renamed from: K */
    public final void m27848K(AnonymousClass0W7 anonymousClass0W7, View view) {
        if (this.f66939B.f65377j == null) {
            AnonymousClass0Gn.C("Unable to show media viewer", String.format("mThreadSummary is null for message id: %s", new Object[]{anonymousClass0W7.f5885O}));
            return;
        }
        AnonymousClass5Vf anonymousClass5Vf = this.f66939B.f65358Q;
        this.f66939B.f65377j.F();
        if (anonymousClass5Vf.f65403B.f55745F.D()) {
            anonymousClass5Vf.f65403B.f55745F.F();
            anonymousClass5Vf.f65403B.f55756Q = true;
        }
        anonymousClass5Vf.f65403B.f55744E.m25007B(anonymousClass0W7, view, anonymousClass5Vf.f65403B.f55742C, anonymousClass5Vf.f65403B.f55741B.f7727C);
        AnonymousClass0V1.g(this.f66939B, anonymousClass0W7.H() == AnonymousClass0ON.PHOTO ? "photo" : MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    /* renamed from: L */
    public final void m27849L(AnonymousClass0W7 anonymousClass0W7) {
        if (this.f66939B.f65377j == null) {
            AnonymousClass0Gn.C("Unable to unsend message", String.format("mThreadSummary is null for message id: %s", new Object[]{anonymousClass0W7.f5885O}));
            return;
        }
        if (anonymousClass0W7.f5887Q.A()) {
            AnonymousClass0Uu anonymousClass0Uu = this.f66939B.f65370c;
            AnonymousClass0EE anonymousClass0EE = this.f66939B;
            anonymousClass0Uu.B(anonymousClass0EE, anonymousClass0EE.f65377j.F(), anonymousClass0W7);
        } else if (AnonymousClass0HV.D(this.f66939B.f65382o).f2646B.getBoolean("seen_direct_unseen_message_dialog", false)) {
            AnonymousClass4i1.B(this.f66939B.f65382o, this.f66939B.f65377j.F(), anonymousClass0W7);
        } else {
            AnonymousClass0IL anonymousClass0IL = this.f66939B;
            new AnonymousClass0Sb(anonymousClass0IL.getContext()).Q(C0164R.string.direct_unsend_message_dialog_title).H(C0164R.string.direct_unsend_message_dialog_message).O(C0164R.string.direct_unsend, new AnonymousClass4cP(anonymousClass0IL, anonymousClass0W7)).L(C0164R.string.cancel, new AnonymousClass4cO(anonymousClass0IL)).E(true).F(true).C().show();
            AnonymousClass0HV.D(anonymousClass0IL.f65382o).f2646B.edit().putBoolean("seen_direct_unseen_message_dialog", true).apply();
        }
    }

    public final void Lg(String str, View view, ClickableSpan clickableSpan) {
        AnonymousClass0IL anonymousClass0IL = this.f66939B;
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(AnonymousClass0bx.D(anonymousClass0IL.f65382o, str, "direct_thread_username").A());
        anonymousClass0IZ.f2753C = "ds_message_mention";
        anonymousClass0IZ.B();
    }
}
