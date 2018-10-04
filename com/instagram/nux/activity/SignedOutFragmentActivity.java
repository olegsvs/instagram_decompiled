package com.instagram.nux.activity;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Dt;
import X.AnonymousClass0EE;
import X.AnonymousClass0EF;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0Fj;
import X.AnonymousClass0Fr;
import X.AnonymousClass0Fx;
import X.AnonymousClass0G5;
import X.AnonymousClass0G7;
import X.AnonymousClass0GA;
import X.AnonymousClass0GG;
import X.AnonymousClass0GO;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0IX;
import X.AnonymousClass0MO;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0TK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dp;
import X.AnonymousClass0dy;
import X.AnonymousClass0dz;
import X.AnonymousClass0e1;
import X.AnonymousClass0i7;
import X.AnonymousClass0qE;
import X.AnonymousClass0uY;
import X.AnonymousClass1Pj;
import X.AnonymousClass1UE;
import X.AnonymousClass1fi;
import X.AnonymousClass2aK;
import X.AnonymousClass3VC;
import X.AnonymousClass3Ve;
import X.AnonymousClass3Vf;
import X.AnonymousClass3Vl;
import X.AnonymousClass3WF;
import X.AnonymousClass3Wn;
import X.AnonymousClass3XG;
import X.AnonymousClass3Xr;
import X.AnonymousClass3Y2;
import X.AnonymousClass56t;
import X.AnonymousClass572;
import X.AnonymousClass57K;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SignedOutFragmentActivity extends BaseFragmentActivity implements AnonymousClass3VC, AnonymousClass3XG, AnonymousClass3Y2 {
    /* renamed from: B */
    public boolean f48367B = true;
    /* renamed from: C */
    public AnonymousClass0EE f48368C;
    /* renamed from: D */
    public boolean f48369D = false;
    /* renamed from: E */
    public boolean f48370E;
    /* renamed from: F */
    public boolean f48371F = false;
    /* renamed from: G */
    public final HashSet f48372G = new HashSet();
    /* renamed from: H */
    public boolean f48373H = false;
    /* renamed from: I */
    private boolean f48374I = false;
    /* renamed from: J */
    private boolean f48375J = false;
    /* renamed from: K */
    private boolean f48376K = false;
    /* renamed from: L */
    private final AnonymousClass0F8 f48377L = new AnonymousClass3Ve(this);

    /* renamed from: V */
    public final boolean m22047V() {
        return false;
    }

    /* renamed from: B */
    public static void m22045B(boolean z) {
        AnonymousClass0Fr.InvalidOneTapLinkDialogAction.A().H("has_resent", z).R();
    }

    /* renamed from: T */
    public final void m22046T() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        this.f48373H = extras.getBoolean("SHOULD_START_AT_CONTACT_POINT", false);
        if (extras.containsKey("IS_ADD_ACCOUNT_FLOW")) {
            boolean z = extras.getBoolean("IS_ADD_ACCOUNT_FLOW");
            this.f48375J = z;
            this.f48374I = z;
        }
        if (extras.containsKey("SHOULD_ADD_CLEAR_TASK_FLAG")) {
            if (!this.f48375J) {
                if (!extras.getBoolean("SHOULD_ADD_CLEAR_TASK_FLAG")) {
                    z = false;
                    this.f48374I = z;
                }
            }
            z = true;
            this.f48374I = z;
        }
        AnonymousClass0Cd.f1698B.f1701D = this.f48375J;
        String str = this.f48375J ? "is_add_account" : "is_not_add_account";
        AnonymousClass0dz anonymousClass0dz = AnonymousClass0dy.B().f7558B;
        AnonymousClass0e1 anonymousClass0e1 = AnonymousClass0uY.f11862T;
        anonymousClass0dz.K(anonymousClass0e1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("waterfallId:");
        stringBuilder.append(AnonymousClass0Fr.B());
        anonymousClass0dz.B(anonymousClass0e1, stringBuilder.toString());
        anonymousClass0dz.B(anonymousClass0e1, str);
        extras.putBoolean("IS_ADD_ACCOUNT_FLOW", this.f48375J);
        if (D().E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IV B = D().B();
            AnonymousClass0IL anonymousClass56t;
            AnonymousClass0IJ anonymousClass0IJ;
            if (this.f48373H) {
                AnonymousClass0GO.C().A();
                extras.putBoolean("is_starting_fragment", true);
                anonymousClass56t = new AnonymousClass56t();
                anonymousClass56t.setArguments(extras);
                anonymousClass0IJ = (AnonymousClass0IJ) anonymousClass56t;
                this.f48368C = anonymousClass0IJ;
                B.N(C0164R.id.layout_container_main, anonymousClass0IJ, "android.nux.ContactPointTriageFragment");
            } else if ((AnonymousClass0dp.B().C().isEmpty() ^ 1) != 0) {
                AnonymousClass0GO.C().A();
                anonymousClass56t = new OneTapLoginLandingFragment();
                anonymousClass56t.setArguments(extras);
                anonymousClass0IJ = (AnonymousClass0IJ) anonymousClass56t;
                this.f48368C = anonymousClass0IJ;
                B.N(C0164R.id.layout_container_main, anonymousClass0IJ, "android.nux.OneTapLoginLandingFragment");
            } else {
                if (!AnonymousClass1Pj.C()) {
                    if (AnonymousClass0G5.B(this, C0164R.attr.nuxAllowSignUpFlow, true)) {
                        AnonymousClass0GO.C().A();
                        anonymousClass0IJ = new AnonymousClass572();
                        anonymousClass0IJ.setArguments(getIntent().getExtras());
                        this.f48368C = anonymousClass0IJ;
                        B.N(C0164R.id.layout_container_main, anonymousClass0IJ, "android.nux.FacebookLandingFragment");
                    }
                }
                AnonymousClass0GO.C().A();
                anonymousClass56t = new AnonymousClass57K();
                anonymousClass56t.setArguments(extras);
                anonymousClass0IJ = (AnonymousClass0IJ) anonymousClass56t;
                this.f48368C = anonymousClass0IJ;
                B.N(C0164R.id.layout_container_main, anonymousClass0IJ, "android.nux.LoginLandingFragment");
            }
            B.F();
        }
        if (extras.containsKey("uid") && extras.containsKey("token") && extras.containsKey("source")) {
            this.f48371F = true;
            this.f48370E = extras.getBoolean("bypass");
            Uri B2 = AnonymousClass0IX.B(extras);
            String string = extras.getString("uid");
            String string2 = extras.getString("token");
            str = extras.getString("source");
            String string3 = extras.getString("auto_send");
            String D = AnonymousClass0i7.B().D();
            String str2 = this.f48370E ? "accounts/one_click_login_bypass/" : "accounts/one_click_login/";
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = str2;
            AnonymousClass0GA H = anonymousClass0Pt.D("uid", string).D("token", string2).D("source", str).D("device_id", AnonymousClass0Dt.B(this)).D("guid", AnonymousClass0Dt.f1941C.A(this)).D("adid", AnonymousClass1fi.J()).F("auto_send", string3).F("big_blue_token", D).M(AnonymousClass2aK.class).N().H();
            H.f2849B = new AnonymousClass3Vl(this, B2, string);
            O(H);
        }
        if (extras.getBoolean("allow_confirm_email")) {
            new AnonymousClass3WF(this, extras.getString("confirm_email_nonce"), extras.getString("confirm_email_encoded_email"), false).m19800A();
        }
    }

    public final boolean dW() {
        return this.f48375J;
    }

    public final boolean oTA() {
        return this.f48374I;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.f48372G) {
            Collection collection = null;
            Iterator it = this.f48372G.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                AnonymousClass0TK anonymousClass0TK = (AnonymousClass0TK) weakReference.get();
                if (anonymousClass0TK != null) {
                    anonymousClass0TK.xc(i, i2, intent);
                } else {
                    if (collection == null) {
                        collection = new ArrayList();
                    }
                    collection.add(weakReference);
                }
            }
            if (collection != null) {
                this.f48372G.removeAll(collection);
            }
        }
    }

    public final void onBackPressed() {
        if (this.f48367B) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -2128268932);
        super.onCreate(bundle);
        AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass3Vf(this), -1772527866);
        if (!(!AnonymousClass0EF.M(getApplicationContext()) || AnonymousClass1Pj.C() || AnonymousClass1Pj.F())) {
            AnonymousClass0Fj.f2192B.A(AnonymousClass1UE.B(this));
        }
        if (!AnonymousClass0Cd.f1698B.N()) {
            AnonymousClass0MO.E().A();
        }
        AnonymousClass0F4.f2058E.A(AnonymousClass0qE.class, this.f48377L);
        AnonymousClass3Wn.m19823B().m19829C();
        AnonymousClass0cQ.C(this, 1293936791, B);
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.B(this, 1429927205);
        super.onDestroy();
        AnonymousClass0i7.B().f8571C = null;
        AnonymousClass0Cd.f1698B.f1701D = false;
        AnonymousClass3Wn.m19823B().m19830D();
        AnonymousClass3Xr.f42125E.m19910C(this);
        this.f48372G.clear();
        AnonymousClass0F4.f2058E.D(AnonymousClass0qE.class, this.f48377L);
        AnonymousClass0cQ.C(this, 2075760122, B);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f48367B = bundle.getBoolean("allow_back", true);
        this.f48376K = bundle.getBoolean("is_nux_flow", false);
        this.f48369D = bundle.getBoolean("has_followed", false);
        this.f48371F = bundle.getBoolean("is_one_click_login", false);
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.B(this, 164377301);
        super.onResume();
        if (!(!AnonymousClass0Cd.f1698B.N() || this.f48376K || this.f48375J || this.f48371F)) {
            finish();
        }
        setRequestedOrientation(1);
        AnonymousClass0cQ.C(this, -923890750, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("allow_back", this.f48367B);
        bundle.putBoolean("is_nux_flow", this.f48376K);
        bundle.putBoolean("has_followed", this.f48369D);
        bundle.putBoolean("is_one_click_login", this.f48371F);
    }

    public final void sOA(boolean z) {
        this.f48376K = z;
    }
}
