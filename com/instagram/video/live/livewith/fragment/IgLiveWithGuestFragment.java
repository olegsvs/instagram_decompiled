package com.instagram.video.live.livewith.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cg;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dt;
import X.AnonymousClass0Hj;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IS;
import X.AnonymousClass0LH;
import X.AnonymousClass0Nb;
import X.AnonymousClass0Nr;
import X.AnonymousClass0OR;
import X.AnonymousClass0RC;
import X.AnonymousClass0RG;
import X.AnonymousClass0Sb;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ea;
import X.AnonymousClass14r;
import X.AnonymousClass1R4;
import X.AnonymousClass1RG;
import X.AnonymousClass1Zi;
import X.AnonymousClass1ax;
import X.AnonymousClass38H;
import X.AnonymousClass3ig;
import X.AnonymousClass3oc;
import X.AnonymousClass44N;
import X.AnonymousClass5J0;
import X.AnonymousClass5LW;
import X.AnonymousClass5Lg;
import X.AnonymousClass5MD;
import X.AnonymousClass5MQ;
import X.AnonymousClass5Mx;
import X.AnonymousClass5N7;
import X.AnonymousClass5O8;
import X.AnonymousClass5OQ;
import X.AnonymousClass5OR;
import X.AnonymousClass5P8;
import X.AnonymousClass5PF;
import X.AnonymousClass5PM;
import X.AnonymousClass5Pa;
import X.AnonymousClass5aE;
import X.AnonymousClass5aZ;
import X.AnonymousClass5ao;
import X.AnonymousClass5ax;
import X.AnonymousClass5ay;
import X.AnonymousClass5b1;
import X.AnonymousClass66G;
import X.AnonymousClass66H;
import X.AnonymousClass66I;
import X.AnonymousClass66J;
import X.AnonymousClass66O;
import X.AnonymousClass66i;
import X.AnonymousClass66j;
import X.AnonymousClass66k;
import X.AnonymousClass66l;
import X.AnonymousClass66n;
import X.AnonymousClass66o;
import X.AnonymousClass66p;
import X.AnonymousClass67C;
import X.AnonymousClass68a;
import X.AnonymousClass68i;
import X.AnonymousClass6G2;
import X.AnonymousClass6G4;
import X.AnonymousClass6G5;
import X.AnonymousClass6G6;
import X.AnonymousClass6GF;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.Space;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import java.util.HashSet;
import java.util.Set;

public class IgLiveWithGuestFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass5P8, AnonymousClass5O8, AnonymousClass5OQ {
    /* renamed from: B */
    public AnonymousClass14r f73556B;
    /* renamed from: C */
    public AnonymousClass67C f73557C;
    /* renamed from: D */
    public String f73558D;
    /* renamed from: E */
    public AnonymousClass0Ci f73559E;
    /* renamed from: F */
    public AnonymousClass44N f73560F;
    /* renamed from: G */
    public AnonymousClass5OR f73561G;
    /* renamed from: H */
    public AnonymousClass3ig f73562H;
    /* renamed from: I */
    public boolean f73563I;
    /* renamed from: J */
    public AnonymousClass5b1 f73564J;
    /* renamed from: K */
    public AnonymousClass5ax f73565K;
    /* renamed from: L */
    public AnonymousClass5Lg f73566L;
    /* renamed from: M */
    public AnonymousClass6G2 f73567M;
    /* renamed from: N */
    public AnonymousClass66J f73568N;
    /* renamed from: O */
    public String f73569O;
    /* renamed from: P */
    public LinearLayout f73570P;
    /* renamed from: Q */
    public AnonymousClass6GF f73571Q;
    /* renamed from: R */
    public View f73572R;
    /* renamed from: S */
    public boolean f73573S;
    /* renamed from: T */
    public AnonymousClass68i f73574T;
    /* renamed from: U */
    public AnonymousClass0Cm f73575U;
    /* renamed from: V */
    private final AnonymousClass5PM f73576V = new AnonymousClass66j(this);
    /* renamed from: W */
    private AnonymousClass1ax f73577W;

    public final void Gk(long j) {
    }

    public final String getModuleName() {
        return "live_cobroadcast";
    }

    /* renamed from: B */
    public static void m29681B(IgLiveWithGuestFragment igLiveWithGuestFragment, boolean z, Bundle bundle) {
        Intent intent;
        if (bundle != null) {
            intent = new Intent();
            intent.putExtras(bundle);
        } else {
            intent = null;
        }
        igLiveWithGuestFragment.f73573S = true;
        Activity activity = igLiveWithGuestFragment.getActivity();
        if (activity != null) {
            activity.setResult(z ? -1 : 0, intent);
            activity.onBackPressed();
        }
    }

    /* renamed from: C */
    public static AnonymousClass1RG m29682C(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        return new AnonymousClass66o(igLiveWithGuestFragment);
    }

    /* renamed from: D */
    public static void m29683D(IgLiveWithGuestFragment igLiveWithGuestFragment, AnonymousClass5LW anonymousClass5LW, Exception exception) {
        if (exception == null) {
            igLiveWithGuestFragment.f73571Q.f73642E.m29740F(igLiveWithGuestFragment.f73560F.sW());
            AnonymousClass66J anonymousClass66J = igLiveWithGuestFragment.f73568N;
            AnonymousClass5MD anonymousClass5MD = anonymousClass5LW.f62419D ? AnonymousClass5MD.FRONT : AnonymousClass5MD.BACK;
            anonymousClass66J.f71778K.incrementAndGet();
            AnonymousClass66J.m28985B(anonymousClass66J, AnonymousClass66I.CAMERA_FLIP).F("camera", anonymousClass5MD.f62519B).R();
        }
        igLiveWithGuestFragment.m29686G();
    }

    /* renamed from: E */
    public static void m29684E(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        CharSequence string = igLiveWithGuestFragment.getContext().getString(C0164R.string.live_cobroadcast_leave_dialog_confirm);
        String string2 = igLiveWithGuestFragment.getContext().getString(C0164R.string.cancel);
        CharSequence[] charSequenceArr = new CharSequence[]{string, string2};
        new AnonymousClass0Sb(igLiveWithGuestFragment.getContext()).G(charSequenceArr, new AnonymousClass66p(igLiveWithGuestFragment, charSequenceArr, string)).I(igLiveWithGuestFragment.getContext().getString(C0164R.string.live_cobroadcast_leave_dialog_message, new Object[]{igLiveWithGuestFragment.f73559E.uT()})).E(true).F(true).C().show();
    }

    /* renamed from: F */
    public static void m29685F(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        AnonymousClass5ao anonymousClass5ao = igLiveWithGuestFragment.f73574T;
        if (anonymousClass5ao != null) {
            anonymousClass5ao.f66747E.TVA(new AnonymousClass66i(igLiveWithGuestFragment));
        }
    }

    /* renamed from: G */
    private void m29686G() {
        this.f73568N.f71769B = this.f73560F.sW() ? AnonymousClass5MD.FRONT : AnonymousClass5MD.BACK;
    }

    /* renamed from: H */
    private void m29687H(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    public final void Sp(int i, boolean z) {
        if (i > 0) {
            this.f73564J.m27776A(true);
        } else if (this.f73563I) {
            this.f73564J.m27777B(true);
        }
    }

    public final void an(AnonymousClass3oc anonymousClass3oc, AnonymousClass0Ci anonymousClass0Ci) {
        throw new IllegalStateException("Guests cannot select candidates to invite");
    }

    /* renamed from: b */
    public final void m29688b(boolean z) {
        int C = this.f73567M.m29005C(AnonymousClass1R4.ACTIVE, true) + this.f73567M.m29005C(AnonymousClass1R4.STALLED, true);
        AnonymousClass66O anonymousClass66O = this.f73567M;
        anonymousClass66O.f71811D.A(this.f73558D, AnonymousClass5Mx.LEAVE_BROADCAST, Integer.valueOf(C), new AnonymousClass66l(this, z));
    }

    public final void bGA(int i, int i2, AnonymousClass3oc anonymousClass3oc) {
        AnonymousClass66J.m28985B(this.f73568N, AnonymousClass66I.VIEWERS_LIST_IMPRESSION).B("num_viewers", i).R();
    }

    public final void fe(AnonymousClass5aZ anonymousClass5aZ) {
        this.f73561G.m26400D(anonymousClass5aZ);
    }

    public final void fy() {
        m29685F(this);
    }

    public final boolean onBackPressed() {
        if (this.f73573S) {
            return false;
        }
        AnonymousClass5ax anonymousClass5ax = this.f73565K;
        if (anonymousClass5ax != null && anonymousClass5ax.m27756B()) {
            return true;
        }
        m29684E(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -562708065);
        super.onCreate(bundle);
        this.f73575U = AnonymousClass0Ce.G(getArguments());
        this.f73558D = getArguments().getString("args.broadcast_id");
        this.f73569O = getArguments().getString("args.media_id");
        this.f73559E = AnonymousClass0Cg.f1704B.B(getArguments().getString("args.broadcaster_id"));
        String string = getArguments().getString("args.tracking_token");
        AnonymousClass1ax anonymousClass1ax = new AnonymousClass1ax(getContext(), getLoaderManager(), AnonymousClass0Dt.f1941C.B(), this.f73575U, getArguments().getString("args.server_info"));
        this.f73577W = anonymousClass1ax;
        anonymousClass1ax.f20389B = this.f73558D;
        this.f73568N = new AnonymousClass66J(getContext(), new AnonymousClass0Nr(getContext()), this, this.f73558D, this.f73559E.getId(), this.f73569O, string, getArguments().getString("args.invite_type"));
        if (AnonymousClass0RC.E(getContext())) {
            r9.f73566L = new AnonymousClass5Lg(getContext(), r9.f73575U, ((Boolean) AnonymousClass0CC.PR.H(r9.f73575U)).booleanValue(), getArguments().getString("IgLiveCapture.ARGUMENTS_KEY_EXTRA_FACE_EFFECT_ID"), new AnonymousClass66k(r9));
        }
        r9.f73560F = AnonymousClass0Nb.B(r9.f73575U, "live_with_guest");
        m29686G();
        Context applicationContext = getContext().getApplicationContext();
        AnonymousClass0Cm anonymousClass0Cm = r9.f73575U;
        String str = r9.f73558D;
        AnonymousClass1ax anonymousClass1ax2 = r9.f73577W;
        AnonymousClass44N anonymousClass44N = r9.f73560F;
        AnonymousClass5Lg anonymousClass5Lg = r9.f73566L;
        AnonymousClass38H anonymousClass38H = null;
        if (anonymousClass5Lg != null) {
            anonymousClass38H = anonymousClass5Lg.f62432B;
        }
        r9.f73574T = new AnonymousClass68i(applicationContext, anonymousClass0Cm, str, anonymousClass1ax2, r9, anonymousClass44N, anonymousClass38H, r9.f73568N, getArguments().getBoolean("args.camera_front_facing", true));
        AnonymousClass66O anonymousClass6G2 = new AnonymousClass6G2(r9.f73575U, r9.f73577W, new AnonymousClass6G6(r9));
        r9.f73567M = anonymousClass6G2;
        anonymousClass6G2.mo6601F(r9.f73558D);
        AnonymousClass66J anonymousClass66J = r9.f73568N;
        if (anonymousClass66J.f71776I == AnonymousClass66G.INIT) {
            AnonymousClass5MQ.m26328C(AnonymousClass66J.m28986C(anonymousClass66J, AnonymousClass66I.JOIN_ATTEMPT), anonymousClass66J.f71770C, anonymousClass66J.f71773F).R();
            anonymousClass66J.f71776I = AnonymousClass66G.ATTEMPT;
        } else {
            AnonymousClass66J.m28988E(anonymousClass66J, AnonymousClass66G.INIT, "entering guest screen");
        }
        AnonymousClass0cQ.G(r9, 1333341712, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1328268431);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_iglive_livewith, viewGroup, false);
        AnonymousClass0cQ.G(this, 1584960340, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1913164800);
        super.onDestroy();
        AnonymousClass5ao anonymousClass5ao = this.f73574T;
        if (anonymousClass5ao != null) {
            anonymousClass5ao.mo6275A();
            this.f73574T = null;
        }
        AnonymousClass66O anonymousClass66O = this.f73567M;
        if (anonymousClass66O != null) {
            anonymousClass66O.mo6602G();
            this.f73567M = null;
        }
        this.f73556B = null;
        this.f73568N = null;
        AnonymousClass0cQ.G(this, 1682248150, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -702546022);
        super.onDestroyView();
        this.f73561G.f62943L.setOnTouchListener(null);
        this.f73561G.f62938G = null;
        this.f73570P = null;
        this.f73571Q = null;
        this.f73556B.C();
        this.f73561G.m26397A();
        this.f73562H = null;
        this.f73572R = null;
        this.f73577W = null;
        this.f73564J.f66793B = null;
        this.f73564J = null;
        this.f73557C = null;
        this.f73565K.f66767C = null;
        AnonymousClass0ea.E(Z().getWindow(), getView(), true);
        AnonymousClass0cQ.G(this, 1888326848, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1072450154);
        super.onPause();
        AnonymousClass66J anonymousClass66J = this.f73568N;
        AnonymousClass0OR.G(anonymousClass66J.f71774G, anonymousClass66J.f71780M, 992521450);
        AnonymousClass0RG.D().f4619B = false;
        AnonymousClass68i anonymousClass68i = this.f73574T;
        if (anonymousClass68i != null) {
            anonymousClass68i.m29202E();
            AnonymousClass66J.m28987D(this.f73568N, AnonymousClass66I.PAUSED, AnonymousClass66H.USER_INITIATED).R();
        }
        AnonymousClass0cQ.G(this, 851617183, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -206341143);
        super.onResume();
        AnonymousClass0ea.E(Z().getWindow(), getView(), false);
        this.f73568N.m28996E();
        AnonymousClass0RG.D().f4619B = true;
        AnonymousClass68i anonymousClass68i = this.f73574T;
        if (anonymousClass68i != null) {
            anonymousClass68i.f72162F = false;
            if (!anonymousClass68i.f72161E) {
                if (anonymousClass68i.f72173Q != null) {
                    AnonymousClass68i.m29194E(anonymousClass68i);
                }
                anonymousClass68i.f72171O.m26380B();
            }
            AnonymousClass66J anonymousClass66J = this.f73568N;
            AnonymousClass66H anonymousClass66H = AnonymousClass66H.USER_INITIATED;
            if (anonymousClass66J.f71776I == AnonymousClass66G.STARTED) {
                AnonymousClass66J.m28987D(anonymousClass66J, AnonymousClass66I.RESUMED, anonymousClass66H).R();
            }
        }
        AnonymousClass0cQ.G(this, 1094330358, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 1997203768);
        super.onStart();
        AnonymousClass5OR anonymousClass5OR = this.f73561G;
        anonymousClass5OR.f62937F.B(anonymousClass5OR.f62933B);
        m29687H(8);
        AnonymousClass0cQ.G(this, 1436640564, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 1787113565);
        super.onStop();
        this.f73561G.f62937F.C();
        m29687H(0);
        AnonymousClass0cQ.G(this, -1321532387, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AnonymousClass6G4 anonymousClass6G4;
        AnonymousClass66n anonymousClass66n;
        AnonymousClass6G4 anonymousClass6G42;
        Activity activity;
        ViewGroup viewGroup;
        View view2;
        AnonymousClass44N anonymousClass44N;
        AnonymousClass6GF anonymousClass6GF;
        AnonymousClass5ax anonymousClass5ax;
        AnonymousClass66J anonymousClass66J;
        View view3;
        View view4 = view;
        super.onViewCreated(view4, bundle);
        this.f73572R = view4;
        this.f73567M.f73542B = (AnonymousClass5N7) AnonymousClass0LH.E(new AnonymousClass5N7(this.f73572R));
        this.f73556B = new AnonymousClass14r(view4);
        Set hashSet = new HashSet();
        hashSet.add(this.f73575U.B());
        this.f73570P = (LinearLayout) view4.findViewById(C0164R.id.iglive_surface_view_frame);
        AnonymousClass5ao anonymousClass5ao = this.f73574T;
        if (anonymousClass5ao != null) {
            AnonymousClass5PF anonymousClass5PF = new AnonymousClass5PF(r12.f73570P);
            anonymousClass5ao.f72167K = anonymousClass5PF;
            AnonymousClass5J0 anonymousClass5aE = new AnonymousClass5aE(anonymousClass5ao.f66745C);
            View space = new Space(anonymousClass5ao.f66745C);
            anonymousClass5ao.f72170N = space;
            anonymousClass5PF.m26424A(space);
            anonymousClass5PF.m26424A((View) anonymousClass5aE);
            anonymousClass5aE.bB(new AnonymousClass68a(anonymousClass5ao));
            AnonymousClass5ao anonymousClass5ao2 = r12.f73574T;
            anonymousClass5ao2.f66747E.ye(r12.f73570P);
        }
        AnonymousClass1Zi.B(r12.f73556B, hashSet, r12.f73559E, false, false, null, null);
        AnonymousClass5b1 anonymousClass5b1 = new AnonymousClass5b1(new AnonymousClass5Pa(view4));
        r12.f73564J = anonymousClass5b1;
        anonymousClass5b1.f66793B = r12;
        r12.f73564J.f66794C.f63145D.setVisibility(8);
        r12.f73562H = AnonymousClass3ig.B(view4, C0164R.id.iglive_livewith_capture_end_stub);
        ViewGroup viewGroup2 = (ViewGroup) r12.f73572R;
        AnonymousClass0Cm anonymousClass0Cm = r12.f73575U;
        AnonymousClass0Ci B = anonymousClass0Cm.B();
        if (AnonymousClass0RC.E(getContext())) {
            AnonymousClass5Lg anonymousClass5Lg = r12.f73566L;
            if (anonymousClass5Lg != null && anonymousClass5Lg.f62432B.O()) {
                z = true;
                anonymousClass6G4 = new AnonymousClass6G4(r12);
                anonymousClass66n = new AnonymousClass66n(r12);
                anonymousClass6G42 = anonymousClass6G4;
                r12.f73571Q = new AnonymousClass6GF(viewGroup2, r12, anonymousClass0Cm, B, z, anonymousClass6G42, anonymousClass66n, new AnonymousClass6G5(r12), m29682C(r12));
                r12.f73557C = new AnonymousClass67C(new AnonymousClass5ay(getActivity(), r12.f73576V));
                r12.f73565K = new AnonymousClass5ax(r12.f73575U, r12, view4, m29682C(r12));
                r12.f73565K.f66767C = null;
                activity = getActivity();
                viewGroup = (ViewGroup) r12.f73572R;
                view2 = r12.f73570P;
                anonymousClass44N = r12.f73560F;
                anonymousClass6GF = r12.f73571Q;
                anonymousClass5ao = r12.f73574T;
                anonymousClass5ax = r12.f73565K;
                anonymousClass66J = r12.f73568N;
                view3 = view2;
                r12.f73561G = new AnonymousClass5OR(activity, viewGroup, view3, anonymousClass44N, anonymousClass6GF, anonymousClass5ao, anonymousClass5ax, anonymousClass66J, r12.f73566L, getArguments().getBoolean("IgLiveCapture.ARGUMENTS_KEY_EXTRA_EMPLOYEE_MODE"), r12.f73575U, r12);
                r12.f73561G.m26402F();
                r12.f73561G.f62938G = r12;
            }
        }
        z = false;
        anonymousClass6G4 = new AnonymousClass6G4(r12);
        anonymousClass66n = new AnonymousClass66n(r12);
        anonymousClass6G42 = anonymousClass6G4;
        r12.f73571Q = new AnonymousClass6GF(viewGroup2, r12, anonymousClass0Cm, B, z, anonymousClass6G42, anonymousClass66n, new AnonymousClass6G5(r12), m29682C(r12));
        r12.f73557C = new AnonymousClass67C(new AnonymousClass5ay(getActivity(), r12.f73576V));
        r12.f73565K = new AnonymousClass5ax(r12.f73575U, r12, view4, m29682C(r12));
        r12.f73565K.f66767C = null;
        activity = getActivity();
        viewGroup = (ViewGroup) r12.f73572R;
        view2 = r12.f73570P;
        anonymousClass44N = r12.f73560F;
        anonymousClass6GF = r12.f73571Q;
        anonymousClass5ao = r12.f73574T;
        anonymousClass5ax = r12.f73565K;
        anonymousClass66J = r12.f73568N;
        view3 = view2;
        r12.f73561G = new AnonymousClass5OR(activity, viewGroup, view3, anonymousClass44N, anonymousClass6GF, anonymousClass5ao, anonymousClass5ax, anonymousClass66J, r12.f73566L, getArguments().getBoolean("IgLiveCapture.ARGUMENTS_KEY_EXTRA_EMPLOYEE_MODE"), r12.f73575U, r12);
        r12.f73561G.m26402F();
        r12.f73561G.f62938G = r12;
    }
}
