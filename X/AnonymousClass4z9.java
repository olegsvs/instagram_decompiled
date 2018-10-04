package X;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4z9 */
public final class AnonymousClass4z9 extends AnonymousClass0TM implements AnonymousClass0IT, AnonymousClass0Pe {
    /* renamed from: B */
    public Dialog f59075B;
    /* renamed from: C */
    public String f59076C;
    /* renamed from: D */
    public final Handler f59077D = new Handler();
    /* renamed from: E */
    public boolean f59078E;
    /* renamed from: F */
    public boolean f59079F;
    /* renamed from: G */
    public String f59080G;
    /* renamed from: H */
    public String f59081H;
    /* renamed from: I */
    public final AnonymousClass0Iw f59082I = new AnonymousClass4yx(this);
    /* renamed from: J */
    public AnonymousClass1To f59083J;
    /* renamed from: K */
    public AnonymousClass0Cm f59084K;

    public final String getModuleName() {
        return "account_security";
    }

    public final boolean vU() {
        return false;
    }

    /* renamed from: B */
    public static void m25519B(AnonymousClass4z9 anonymousClass4z9, AnonymousClass2DN anonymousClass2DN) {
        Collection arrayList = new ArrayList();
        if (anonymousClass2DN != null) {
            anonymousClass4z9.f59081H = anonymousClass2DN.f27583H;
            anonymousClass4z9.f59076C = anonymousClass2DN.f27580E;
            anonymousClass4z9.f59080G = anonymousClass2DN.f27582G;
            anonymousClass4z9.f59079F = anonymousClass2DN.f27581F;
        }
        boolean z = anonymousClass2DN != null && anonymousClass2DN.f27578C;
        AnonymousClass1To anonymousClass1To = new AnonymousClass1To(C0164R.string.text_message_verification, z, new AnonymousClass4yy(anonymousClass4z9), new AnonymousClass4yz(anonymousClass4z9));
        anonymousClass4z9.f59083J = anonymousClass1To;
        arrayList.add(anonymousClass1To);
        arrayList.add(new AnonymousClass2JP(AnonymousClass1g3.D(anonymousClass4z9.getString(C0164R.string.learn_more), anonymousClass4z9.getString(C0164R.string.text_message_verification_description_learn_more), Uri.parse(AnonymousClass0rE.B("https://help.instagram.com/566810106808145?ref=igapp", anonymousClass4z9.getActivity())))));
        if (anonymousClass2DN != null && anonymousClass2DN.f27578C) {
            arrayList.add(new AnonymousClass2If(C0164R.string.backup_access_header));
            arrayList.add(new AnonymousClass2bo(C0164R.string.backup_access_backup_codes, new AnonymousClass4z0(anonymousClass4z9, anonymousClass2DN)));
            arrayList.add(new AnonymousClass2JP(anonymousClass4z9.getString(C0164R.string.backup_access_description)));
        }
        anonymousClass4z9.setItems(arrayList);
    }

    /* renamed from: C */
    public static void m25520C(AnonymousClass4z9 anonymousClass4z9, boolean z) {
        anonymousClass4z9.f59083J.f18979C = z;
        AnonymousClass0rF.B((AnonymousClass2JC) anonymousClass4z9.getListAdapter(), 1423582936);
    }

    /* renamed from: D */
    private void m25521D(int i) {
        if (getRootActivity() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) getRootActivity()).CSA(i);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getString(C0164R.string.login_security_user_option));
        anonymousClass0eT.n(true);
        anonymousClass0eT.m(this.f59078E, null);
        anonymousClass0eT.Y(this.f59078E);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -139107681);
        super.onCreate(bundle);
        this.f59084K = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0cQ.G(this, 1662160527, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1019084957);
        super.onPause();
        m25521D(0);
        AnonymousClass0cQ.G(this, 9862761, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -30142207);
        super.onResume();
        m25521D(8);
        AnonymousClass0cQ.G(this, -1097043455, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 793775239);
        super.onStart();
        Dialog dialog = this.f59075B;
        if (dialog == null || !dialog.isShowing()) {
            AnonymousClass0GA G = AnonymousClass2DM.G(this.f59084K);
            G.f2849B = new AnonymousClass4z8(this);
            schedule(G);
            AnonymousClass0cQ.G(this, 1786576759, F);
            return;
        }
        AnonymousClass0cQ.G(this, 719474574, F);
    }
}
