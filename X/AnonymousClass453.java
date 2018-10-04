package X;

import android.content.Intent;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.453 */
public final class AnonymousClass453 extends AnonymousClass0IJ implements AnonymousClass0PZ, AnonymousClass0IS, AnonymousClass3iD, AnonymousClass1ev {
    /* renamed from: B */
    public AnonymousClass3iP f49629B;
    /* renamed from: C */
    public String f49630C = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: D */
    public AnonymousClass3ht f49631D;
    /* renamed from: E */
    public AnonymousClass0Cm f49632E;
    /* renamed from: F */
    private String f49633F;
    /* renamed from: G */
    private final Handler f49634G = new AnonymousClass3iH(this, Looper.getMainLooper());
    /* renamed from: H */
    private boolean f49635H;
    /* renamed from: I */
    private ListView f49636I;
    /* renamed from: J */
    private AnonymousClass422 f49637J;
    /* renamed from: K */
    private String f49638K;
    /* renamed from: L */
    private List f49639L;
    /* renamed from: M */
    private SearchEditText f49640M;

    public final void Wi(Product product) {
    }

    public final String getModuleName() {
        return "tagging_search";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static void m22743B(AnonymousClass453 anonymousClass453, List list) {
        if (anonymousClass453.f49639L != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Product product = (Product) it.next();
                for (ProductTag A : anonymousClass453.f49639L) {
                    if (A.A().equals(product.getId())) {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public static void m22744C(AnonymousClass453 anonymousClass453, String str) {
        anonymousClass453.f49637J.m22197A(str, true);
        AnonymousClass453.m22746E(anonymousClass453, str);
    }

    public final void Cz() {
        if (this.f49637J.f48636F == AnonymousClass3iG.NEEDS_RETRY) {
            m22747b(this.f49630C);
            this.f49640M.B();
        }
    }

    /* renamed from: D */
    public static void m22745D(FragmentActivity fragmentActivity, String str, AnonymousClass3ht anonymousClass3ht, ArrayList arrayList, String str2) {
        Bundle bundle = new Bundle();
        if (arrayList != null) {
            bundle.putParcelableArrayList("productTags", arrayList);
        }
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putString("prior_module_name", str2);
        AnonymousClass453 anonymousClass453 = (AnonymousClass453) AnonymousClass0IY.B().c(bundle);
        anonymousClass453.f49631D = anonymousClass3ht;
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
        anonymousClass0IZ.f2752B = "ProductTagSearch";
        anonymousClass0IZ.f2754D = anonymousClass453;
        anonymousClass0IZ.B();
    }

    /* renamed from: E */
    public static void m22746E(AnonymousClass453 anonymousClass453, CharSequence charSequence) {
        switch (AnonymousClass3iJ.f43547B[anonymousClass453.f49637J.f48636F.ordinal()]) {
            case 1:
                anonymousClass453.f49629B.m20469F(anonymousClass453.getResources().getString(C0164R.string.search_for_x, new Object[]{charSequence}), AnonymousClass0Ca.C(anonymousClass453.getContext(), C0164R.color.blue_5), false);
                return;
            case 2:
                anonymousClass453.f49629B.m20469F(anonymousClass453.getContext().getString(C0164R.string.searching), AnonymousClass0Ca.C(anonymousClass453.getContext(), C0164R.color.grey_5), true);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final void m22747b(String str) {
        AnonymousClass3iP anonymousClass3iP = this.f49629B;
        anonymousClass3iP.f43556C = false;
        AnonymousClass3iP.m20468B(anonymousClass3iP);
        if (!this.f49630C.equals(str) || this.f49637J.f48636F == AnonymousClass3iG.NEEDS_RETRY) {
            this.f49630C = str;
            if (this.f49634G.hasMessages(1)) {
                this.f49634G.removeMessages(1);
            }
            this.f49634G.sendMessageDelayed(this.f49634G.obtainMessage(1, this.f49630C), 300);
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass0Sl.C("instagram_cancel_tagging_search", this.f49632E, this.f49638K, this);
        if (this.f49635H) {
            getActivity().setResult(0);
            getActivity().finish();
            return true;
        }
        AnonymousClass3ht anonymousClass3ht = this.f49631D;
        if (anonymousClass3ht == null) {
            return false;
        }
        anonymousClass3ht.jH();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 787514483);
        super.onCreate(bundle);
        setRetainInstance(true);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f49632E = G;
        this.f49633F = AnonymousClass2FT.m14834C(G);
        this.f49637J = new AnonymousClass422(getContext(), getLoaderManager(), this.f49632E, this);
        this.f49629B = new AnonymousClass3iP(getContext(), this.f49632E, this, this.f49637J);
        this.f49635H = getArguments().getBoolean("is_transparent_modal_mode");
        this.f49639L = getArguments().getParcelableArrayList("productTags");
        this.f49638K = getArguments().getString("prior_module_name");
        AnonymousClass0Sl.C("instagram_open_tagging_search", this.f49632E, this.f49638K, this);
        AnonymousClass0cQ.G(this, -609757798, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1631223177);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0164R.layout.fragment_product_tag_search, viewGroup, false);
        this.f49640M = (SearchEditText) viewGroup2.findViewById(C0164R.id.row_search_edit_text);
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.glyphColorPrimary)));
        this.f49640M.getCompoundDrawablesRelative()[0].mutate().setColorFilter(B);
        this.f49640M.setClearButtonAlpha(128);
        this.f49640M.setClearButtonColorFilter(B);
        if (this.f49640M.getBackground() != null) {
            this.f49640M.getBackground().mutate().setColorFilter(B);
        }
        this.f49640M.setOnFilterTextListener(new AnonymousClass3iI(this));
        ListView listView = (ListView) viewGroup2.findViewById(16908298);
        this.f49636I = listView;
        listView.setAdapter(this.f49629B);
        this.f49636I.setOnScrollListener(this.f49637J);
        AnonymousClass0rF.B(this.f49629B, -1776668618);
        AnonymousClass0cQ.G(this, -477268833, F);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1374482595);
        super.onDestroyView();
        this.f49640M.setOnFilterTextListener(null);
        this.f49640M = null;
        this.f49636I = null;
        AnonymousClass0cQ.G(this, 1555635701, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1887901923);
        super.onPause();
        this.f49640M.B();
        AnonymousClass0cQ.G(this, 2081953199, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -343214835);
        super.onResume();
        String C = AnonymousClass2FT.m14834C(this.f49632E);
        String str = this.f49633F;
        if (!(str == null || str.equals(C))) {
            this.f49633F = AnonymousClass2FT.m14834C(this.f49632E);
            AnonymousClass453.m22744C(this, this.f49640M.getSearchString());
        }
        AnonymousClass0cQ.G(this, -838725244, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass453.m22744C(this, this.f49640M.getSearchString());
        this.f49640M.E();
        this.f49640M.F();
    }

    public final void ru(Product product) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f49632E);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0Ix.D(anonymousClass0Pt.L("commerce/products/%s/on_tag/", new Object[]{product.getId()}).M(AnonymousClass0Pv.class).N().H());
        if (this.f49635H) {
            Intent intent = new Intent();
            intent.putExtra("selected_product", product);
            getActivity().setResult(-1, intent);
            getActivity().finish();
            return;
        }
        AnonymousClass0LH.E(this.f49631D);
        this.f49631D.AC(product);
    }
}
