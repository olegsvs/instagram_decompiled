package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ListView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.actionbar.ActionButton;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5Vp */
public final class AnonymousClass5Vp extends AnonymousClass0IJ implements AnonymousClass3dy, AnonymousClass3kY, AnonymousClass0bt, AnonymousClass0VD {
    /* renamed from: B */
    public AnonymousClass4kp f65440B;
    /* renamed from: C */
    public String f65441C = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: D */
    public final ArrayList f65442D = new ArrayList();
    /* renamed from: E */
    public AnonymousClass3e0 f65443E;
    /* renamed from: F */
    private final AnonymousClass41j f65444F = new AnonymousClass41j();
    /* renamed from: G */
    private EditText f65445G;
    /* renamed from: H */
    private boolean f65446H;
    /* renamed from: I */
    private AnonymousClass4lj f65447I;
    /* renamed from: J */
    private AnonymousClass0Cm f65448J;

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
    }

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public final void Lx(String str) {
    }

    public final boolean bW() {
        return true;
    }

    public final String getModuleName() {
        return "direct_story_create_group";
    }

    public final void onFocusChange(View view, boolean z) {
    }

    /* renamed from: B */
    public static void m27200B(AnonymousClass5Vp anonymousClass5Vp) {
        if (anonymousClass5Vp.f65442D.size() >= 2) {
            AnonymousClass2IF.B(true, anonymousClass5Vp.getView());
            AnonymousClass0Cn anonymousClass0Cn = anonymousClass5Vp.f65448J;
            Object obj = anonymousClass5Vp.f65445G.getText().toString();
            List D = AnonymousClass0X7.D(anonymousClass5Vp.f65442D);
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt = anonymousClass0Pt.N();
            anonymousClass0Pt.f4229M = "direct_v2/create_group_thread/";
            anonymousClass0Pt = anonymousClass0Pt.M(AnonymousClass1HB.class).D("recipient_users", AnonymousClass0Vq.E(D));
            if (!TextUtils.isEmpty(obj)) {
                anonymousClass0Pt.D("thread_title", obj);
            }
            AnonymousClass0GA H = anonymousClass0Pt.H();
            H.f2849B = new AnonymousClass4dJ(anonymousClass5Vp, anonymousClass5Vp.f65448J);
            AnonymousClass0Ix.D(H);
        }
    }

    /* renamed from: C */
    public static void m27201C(AnonymousClass5Vp anonymousClass5Vp, List list) {
        AnonymousClass2IF.B(false, anonymousClass5Vp.getView());
        AnonymousClass4kp anonymousClass4kp = anonymousClass5Vp.f65440B;
        anonymousClass4kp.f56824C.clear();
        anonymousClass4kp.f56824C.addAll(list);
        anonymousClass4kp.F();
    }

    /* renamed from: D */
    public static void m27202D(AnonymousClass5Vp anonymousClass5Vp) {
        AnonymousClass0eT.E(anonymousClass5Vp.getActivity()).S(anonymousClass5Vp.f65442D.size() >= 2);
    }

    public final void Fx(String str) {
        AnonymousClass2IF.B(false, getView());
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        searchTextChanged(AnonymousClass0IE.G(searchEditText.getStrippedText().toString().toLowerCase()));
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass1FY anonymousClass1FY = (AnonymousClass1FY) anonymousClass0Pn;
        if (this.f65441C.equals(str)) {
            AnonymousClass5Vp.m27201C(this, AnonymousClass1Hp.D(anonymousClass1FY.f16023E));
        }
    }

    /* renamed from: b */
    public final boolean m27203b(PendingRecipient pendingRecipient, boolean z) {
        int indexOf = this.f65440B.f56824C.indexOf(pendingRecipient);
        if (z) {
            Context context = getContext();
            if (AnonymousClass1Pz.B(this.f65448J, this.f65442D.size())) {
                this.f65442D.add(pendingRecipient);
                AnonymousClass0V1.a(this, "direct_compose_select_recipient", indexOf, Collections.singletonList(pendingRecipient), null);
            } else {
                int intValue = ((Integer) AnonymousClass0E6.D(AnonymousClass0CC.cG, this.f65448J)).intValue() - 1;
                AnonymousClass0V1.f(this, "direct_compose_too_many_recipients_alert");
                new AnonymousClass0Sb(context).Q(C0164R.string.direct_max_recipients_reached_title).I(context.getResources().getQuantityString(C0164R.plurals.direct_group_max_size, intValue, new Object[]{Integer.valueOf(intValue)})).O(C0164R.string.ok, null).C().show();
                return false;
            }
        }
        this.f65442D.remove(pendingRecipient);
        AnonymousClass0V1.a(this, "direct_compose_unselect_recipient", indexOf, Collections.singletonList(pendingRecipient), "recipient_list");
        AnonymousClass5Vp.m27202D(this);
        this.f65447I.m25014C();
        return true;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        if (this.f65446H) {
            AnonymousClass4Yh.B(getContext(), anonymousClass0eT);
        }
        anonymousClass0eT.Z(C0164R.string.direct_new_group);
        boolean z = true;
        anonymousClass0eT.n(true);
        anonymousClass0eT.l(this.f65446H ^ true);
        ActionButton b = anonymousClass0eT.b(C0164R.drawable.nav_check, new AnonymousClass4dI(this), C0164R.attr.modalActionBarPrimaryButtonForeground);
        if (this.f65442D.size() < 2) {
            z = false;
        }
        b.setEnabled(z);
        b.setContentDescription(getResources().getString(C0164R.string.direct_new_group));
    }

    public final void fv(PendingRecipient pendingRecipient) {
        AnonymousClass0V1.a(this, "direct_compose_unselect_recipient", this.f65440B.f56824C.indexOf(pendingRecipient), Collections.singletonList(pendingRecipient), "recipient_bar");
        this.f65442D.remove(pendingRecipient);
        this.f65447I.m25014C();
        AnonymousClass5Vp.m27202D(this);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -265355883);
        super.onCreate(bundle);
        this.f65448J = AnonymousClass0Ce.G(getArguments());
        AnonymousClass3e0 anonymousClass3e0 = new AnonymousClass3e0(this, this.f65444F);
        this.f65443E = anonymousClass3e0;
        anonymousClass3e0.f42947D = this;
        this.f65446H = AnonymousClass0G5.B(getContext(), C0164R.attr.directSearchInActionBar, false);
        this.f65440B = new AnonymousClass4kp(getContext(), this);
        if (AnonymousClass0UX.B(this.f65448J).B()) {
            List arrayList;
            AnonymousClass0UX B = AnonymousClass0UX.B(this.f65448J);
            synchronized (B) {
                arrayList = new ArrayList(B.f5473I);
            }
            AnonymousClass5Vp.m27201C(this, arrayList);
            this.f65443E.C(this.f65441C);
        } else {
            AnonymousClass4kp anonymousClass4kp = this.f65440B;
            anonymousClass4kp.f56824C.clear();
            anonymousClass4kp.F();
            AnonymousClass2IF.B(true, getView());
            this.f65443E.C(this.f65441C);
        }
        AnonymousClass0cQ.G(this, -1499525894, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1853287512);
        View inflate = layoutInflater.inflate(C0164R.layout.direct_expiring_media_create_group_fragment_layout, viewGroup, false);
        AnonymousClass0cQ.G(this, 143649107, F);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ListView) view.findViewById(16908298)).setAdapter(this.f65440B);
        ViewGroup viewGroup = (ViewGroup) ((ViewStub) view.findViewById(this.f65446H ? C0164R.id.action_bar_search_stub : C0164R.id.user_search_bar_stub)).inflate();
        if (this.f65446H) {
            View findViewById = viewGroup.findViewById(C0164R.id.direct_action_bar_search_bar);
            if (VERSION.SDK_INT >= 21) {
                findViewById.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                findViewById.setElevation((float) getResources().getDimensionPixelSize(C0164R.dimen.direct_action_bar_search_bar_elevation));
            }
        } else {
            AnonymousClass0Nm.f(view, AnonymousClass0ip.B(getContext()));
        }
        this.f65447I = new AnonymousClass4lj(getContext(), viewGroup, (AnonymousClass0VD) this, this.f65442D);
        this.f65445G = (EditText) view.findViewById(C0164R.id.group_name);
        AnonymousClass5Vp.m27202D(this);
    }

    public final void onViewStateRestored(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1962186496);
        super.onViewStateRestored(bundle);
        this.f65447I.m25015E();
        AnonymousClass0cQ.G(this, 1304872437, F);
    }

    public final void searchTextChanged(String str) {
        this.f65441C = str;
        AnonymousClass3e3 KQ = this.f65444F.KQ(this.f65441C);
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass0V1.b(this, str);
        }
        switch (KQ.f42956F.ordinal()) {
            case 0:
                AnonymousClass2IF.B(true, getView());
                this.f65443E.C(this.f65441C);
                return;
            case 1:
                AnonymousClass5Vp.m27201C(this, AnonymousClass1Hp.D(KQ.f42954D));
                this.f65443E.C(this.f65441C);
                return;
            case 2:
                AnonymousClass5Vp.m27201C(this, AnonymousClass1Hp.D(KQ.f42954D));
                return;
            default:
                return;
        }
    }

    public final AnonymousClass0Iu tF(String str) {
        return AnonymousClass1ER.B(this.f65448J, this.f65441C, false, "raven");
    }
}
