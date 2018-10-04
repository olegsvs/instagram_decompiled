package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.5b6 */
public final class AnonymousClass5b6 extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public String f66810B;
    /* renamed from: C */
    public String f66811C;
    /* renamed from: D */
    public boolean f66812D;
    /* renamed from: E */
    public View f66813E;
    /* renamed from: F */
    public ListView f66814F;
    /* renamed from: G */
    public AnonymousClass0Cm f66815G;

    public final String getModuleName() {
        return "account_transparency";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.shared_followers_title);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1428325322);
        super.onCreate(bundle);
        this.f66815G = AnonymousClass0Ce.G(getArguments());
        this.f66810B = getArguments().getString("displayed_user_id");
        this.f66811C = getArguments().getString("displayed_username");
        this.f66812D = this.f66815G.f1759C == this.f66810B;
        Object C = AnonymousClass5Pw.m26447C();
        AnonymousClass0NN B = AnonymousClass0NN.B(AnonymousClass5Pu.SHARED_FOLLOWER.m26444A(), C);
        AnonymousClass5Pw.m26446B(C, B);
        B.R();
        AnonymousClass0cQ.G(this, -830501981, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -2084986111);
        View inflate = layoutInflater.inflate(C0164R.layout.shared_follower_account_fragment, viewGroup, false);
        this.f66813E = inflate.findViewById(C0164R.id.loading_indicator);
        this.f66814F = (ListView) inflate.findViewById(C0164R.id.shared_follower_accounts_listview);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.intro_textview);
        if (this.f66812D) {
            textView.setText(C0164R.string.share_follower_fragment_body);
        } else {
            textView.setText(getString(C0164R.string.share_follower_fragment_body_profile, new Object[]{this.f66811C}));
        }
        this.f66813E.setVisibility(0);
        AnonymousClass0Iw anonymousClass5QW = new AnonymousClass5QW(this);
        AnonymousClass0Cn anonymousClass0Cn = this.f66815G;
        String str = this.f66810B;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("users/");
        stringBuilder.append(str);
        stringBuilder.append("/shared_follower_accounts/");
        str = stringBuilder.toString();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = str;
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass5QD.class).H();
        H.f2849B = anonymousClass5QW;
        AnonymousClass0Ix.D(H);
        AnonymousClass0cQ.G(this, -972865486, F);
        return inflate;
    }
}
