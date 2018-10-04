package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.5QQ */
public final class AnonymousClass5QQ extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public String f63244B;
    /* renamed from: C */
    public AnonymousClass5Pp f63245C;
    /* renamed from: D */
    public ListView f63246D;
    /* renamed from: E */
    public View f63247E;
    /* renamed from: F */
    public AnonymousClass0Cm f63248F;

    public final String getModuleName() {
        return "account_transparency";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.former_username_title);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1559223659);
        super.onCreate(bundle);
        this.f63248F = AnonymousClass0Ce.G(getArguments());
        this.f63244B = getArguments().getString("displayed_user_id");
        Object C = AnonymousClass5Pw.m26447C();
        AnonymousClass0NN B = AnonymousClass0NN.B(AnonymousClass5Pu.FORMER_USERNAME.m26444A(), C);
        AnonymousClass5Pw.m26446B(C, B);
        B.R();
        AnonymousClass0cQ.G(this, -668166225, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 882797945);
        View inflate = layoutInflater.inflate(C0164R.layout.former_username_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.intro_textview);
        if (this.f63244B.equals(this.f63248F.f1759C)) {
            textView.setText(C0164R.string.former_username_body);
        } else {
            textView.setText(getString(C0164R.string.former_username_body_viewer, new Object[]{getArguments().getString("displayed_username")}));
        }
        this.f63247E = inflate.findViewById(C0164R.id.loading_indicator);
        this.f63246D = (ListView) inflate.findViewById(C0164R.id.former_username_listview);
        this.f63245C = new AnonymousClass5Pp(getContext());
        this.f63247E.setVisibility(0);
        AnonymousClass0Iw anonymousClass5QP = new AnonymousClass5QP(this);
        AnonymousClass0Cn anonymousClass0Cn = this.f63248F;
        String str = this.f63244B;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("users/");
        stringBuilder.append(str);
        stringBuilder.append("/former_usernames/");
        str = stringBuilder.toString();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = str;
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass5QB.class).H();
        H.f2849B = anonymousClass5QP;
        AnonymousClass0Ix.D(H);
        AnonymousClass0cQ.G(this, -1795284116, F);
        return inflate;
    }
}
