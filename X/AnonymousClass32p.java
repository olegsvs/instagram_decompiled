package X;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.32p */
public final class AnonymousClass32p extends AnonymousClass0Ie implements AnonymousClass0IT {
    /* renamed from: B */
    public boolean f37260B;
    /* renamed from: C */
    public AnonymousClass4V1 f37261C;
    /* renamed from: D */
    public BrandedContentTag f37262D = null;
    /* renamed from: E */
    public AnonymousClass0Cm f37263E;
    /* renamed from: F */
    private AnonymousClass2JC f37264F;
    /* renamed from: G */
    private AnonymousClass2Ik f37265G;
    /* renamed from: H */
    private BrandedContentTag f37266H = null;
    /* renamed from: I */
    private boolean f37267I;

    public final String getModuleName() {
        return "branded_content_edit_settings";
    }

    /* renamed from: B */
    public static void m18279B(AnonymousClass32p anonymousClass32p) {
        anonymousClass32p.f37267I = AnonymousClass32u.m18288D(anonymousClass32p.f37266H, anonymousClass32p.f37262D);
        AnonymousClass0eT.E(anonymousClass32p.getActivity()).S(anonymousClass32p.f37267I);
    }

    /* renamed from: C */
    public static void m18280C(AnonymousClass32p anonymousClass32p) {
        BrandedContentTag brandedContentTag = anonymousClass32p.f37262D;
        if (brandedContentTag == null) {
            anonymousClass32p.f37265G.f28743C = null;
            return;
        }
        anonymousClass32p.f37265G.f28743C = brandedContentTag.f27936D;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.g(C0164R.string.business_partner_settings, new AnonymousClass32o(this)).setEnabled(this.f37267I);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -523400478);
        super.onCreate(bundle);
        this.f37263E = AnonymousClass0Ce.G(getArguments());
        BrandedContentTag brandedContentTag = (BrandedContentTag) getArguments().getParcelable("BRANDED_CONTENT_TAG");
        this.f37266H = brandedContentTag;
        if (brandedContentTag != null) {
            this.f37262D = new BrandedContentTag(brandedContentTag);
            this.f37260B = this.f37266H.f27934B.equals("true");
        }
        this.f37264F = new AnonymousClass2JC(getContext());
        Collection arrayList = new ArrayList();
        arrayList.add(new AnonymousClass2If((int) C0164R.string.branded_content));
        this.f37265G = new AnonymousClass2Ik((int) C0164R.string.tag_business_partner, new AnonymousClass32m(this));
        AnonymousClass32p.m18280C(this);
        arrayList.add(this.f37265G);
        String string = getString(C0164R.string.learn_more_text);
        FragmentActivity activity = getActivity();
        AnonymousClass0Cm anonymousClass0Cm = this.f37263E;
        String string2 = getString(C0164R.string.add_partner_post_description, new Object[]{string});
        String str = "https://help.instagram.com/128845584325492";
        Context context = getContext();
        AnonymousClass239 anonymousClass239 = AnonymousClass239.EDIT;
        arrayList.add(new AnonymousClass2JP(AnonymousClass32u.m18286B(activity, anonymousClass0Cm, string2, string, str, context, anonymousClass239, getModuleName())));
        AnonymousClass1To anonymousClass1To = new AnonymousClass1To(C0164R.string.allow_business_partner_to_promote, false, new AnonymousClass32n(this));
        anonymousClass1To.f18979C = this.f37260B;
        arrayList.add(anonymousClass1To);
        arrayList.add(new AnonymousClass2JP(AnonymousClass32u.m18286B(getActivity(), this.f37263E, getString(C0164R.string.allow_business_partner_promote_description, new Object[]{string}), string, str, getContext(), anonymousClass239, getModuleName())));
        this.f37264F.setItems(arrayList);
        setListAdapter(this.f37264F);
        AnonymousClass0cQ.G(this, 1473409977, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -401666127);
        View inflate = layoutInflater.inflate(C0164R.layout.edit_settings_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, -45408630, F);
        return inflate;
    }
}
