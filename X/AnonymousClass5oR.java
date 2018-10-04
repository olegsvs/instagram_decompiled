package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.actionbar.ActionButton;

/* renamed from: X.5oR */
public final class AnonymousClass5oR extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public ActionButton f69107B;
    /* renamed from: C */
    public AnonymousClass5od f69108C;
    /* renamed from: D */
    private final AnonymousClass6EJ f69109D = new AnonymousClass6EJ(this);

    public final String getModuleName() {
        return "profile_edit_bio";
    }

    /* renamed from: B */
    private void m28469B(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        this.f69107B = anonymousClass0eT.g(C0164R.string.bio, new AnonymousClass5oP(this));
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25412F = C0164R.string.close;
        B.f25409C = C0164R.string.done;
        anonymousClass0eT.d(B.B());
        anonymousClass0eT.c(C0164R.drawable.instagram_x_outline_24, new AnonymousClass5oQ(this));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        m28469B(8);
        super.onConfigurationChanged(configuration);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -418792521);
        View inflate = layoutInflater.inflate(C0164R.layout.edit_bio_layout, viewGroup, false);
        AnonymousClass0cQ.G(this, -930126034, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -2036932633);
        m28469B(0);
        super.onPause();
        AnonymousClass0Nm.N(getActivity().getWindow().getDecorView());
        Z().getWindow().setSoftInputMode(48);
        AnonymousClass0cQ.G(this, 1154467408, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -805775869);
        m28469B(8);
        super.onResume();
        Z().getWindow().setSoftInputMode(16);
        AnonymousClass5od anonymousClass5od = this.f69108C;
        AnonymousClass5od.m28470B(anonymousClass5od, anonymousClass5od.f69123C.getText().toString());
        AnonymousClass0cQ.G(this, 59792135, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass5od anonymousClass5od = new AnonymousClass5od(this, this, AnonymousClass0Ce.G(getArguments()), (EditText) view.findViewById(C0164R.id.caption_edit_text), (TextView) view.findViewById(C0164R.id.caption_limit_text), (ListView) view.findViewById(C0164R.id.entity_suggestions_list), this.f69109D);
        this.f69108C = anonymousClass5od;
        anonymousClass5od.f69130J = new AnonymousClass5m6(anonymousClass5od.f69124D.getActivity(), anonymousClass5od.f69136P, anonymousClass5od.f69135O, anonymousClass5od.f69127G);
        anonymousClass5od.f69131K.setAdapter(anonymousClass5od.f69130J);
        AnonymousClass3e1 anonymousClass41i = new AnonymousClass41i(new AnonymousClass0Px(anonymousClass5od.f69124D.getActivity(), anonymousClass5od.f69124D.getLoaderManager()), anonymousClass5od.f69122B, new AnonymousClass5oV(anonymousClass5od));
        anonymousClass5od.f69128H = anonymousClass41i;
        anonymousClass41i.EPA(new AnonymousClass5oW(anonymousClass5od));
        anonymousClass5od.f69123C.setText(anonymousClass5od.f69136P.B().O());
        AnonymousClass5od.m28470B(anonymousClass5od, anonymousClass5od.f69123C.getText().toString());
        AnonymousClass5od.m28473E(anonymousClass5od);
        anonymousClass5od.f69123C.addTextChangedListener(anonymousClass5od.f69134N);
        anonymousClass5od.f69123C.addTextChangedListener(new AnonymousClass5oX(anonymousClass5od));
        anonymousClass5od.f69123C.requestFocus();
        AnonymousClass0Nm.l(anonymousClass5od.f69123C);
    }
}
