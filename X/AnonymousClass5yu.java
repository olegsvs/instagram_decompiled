package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.ui.viewpager.ScrollingOptionalViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5yu */
public final class AnonymousClass5yu extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0Ii, AnonymousClass3dQ, AnonymousClass0gg, AnonymousClass0bw, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass2Gg f70588B = AnonymousClass2Gg.ALL;
    /* renamed from: C */
    public List f70589C;
    /* renamed from: D */
    public AnonymousClass1LM f70590D;
    /* renamed from: E */
    public AnonymousClass0Cm f70591E;
    /* renamed from: F */
    private OnClickListener f70592F;
    /* renamed from: G */
    private ScrollingOptionalViewPager f70593G;
    /* renamed from: H */
    private boolean f70594H = true;

    /* renamed from: B */
    public static AnonymousClass0Ih m28708B(AnonymousClass5yu anonymousClass5yu) {
        return (AnonymousClass0Ih) anonymousClass5yu.f70590D.M();
    }

    public final Map GIA() {
        Map hashMap = new HashMap();
        hashMap.put(MemoryDumpUploadJob.EXTRA_USER_ID, this.f70591E.f1759C);
        return hashMap;
    }

    public final void JH() {
        this.f70593G.setScrollingEnabled(true);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        switch (((AnonymousClass2Gg) obj).ordinal()) {
            case 0:
                return AnonymousClass0Jf.f2933B.A().B(this.f70591E.f1759C, AnonymousClass2Gi.ALL_TAB, null);
            case 1:
                AnonymousClass0Jf.f2933B.A();
                obj = this.f70591E.f1759C;
                AnonymousClass0IL anonymousClass5yU = new AnonymousClass5yU();
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.USER_ID", obj);
                anonymousClass5yU.setArguments(bundle);
                return anonymousClass5yU;
            default:
                throw new IllegalArgumentException("Invalid position");
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.saved_feed);
        anonymousClass0eT.n(getFragmentManager().H() > 0);
        anonymousClass0eT.l(false);
        anonymousClass0eT.j(this);
        if (this.f70594H) {
            anonymousClass0eT.F(AnonymousClass0eb.ADD, this.f70592F);
        }
    }

    public final void dG() {
        this.f70593G.setScrollingEnabled(false);
    }

    public final String getModuleName() {
        return this.f70588B == AnonymousClass2Gg.ALL ? "feed_saved" : "saved_collections_list";
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        AnonymousClass2Gg anonymousClass2Gg = (AnonymousClass2Gg) obj;
        if (isResumed() && anonymousClass2Gg != this.f70588B) {
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.K(this, getFragmentManager().H(), getModuleName());
            this.f70588B = anonymousClass2Gg;
            anonymousClass0Iz.H(this);
            AnonymousClass5yu.m28708B(this).Jt();
        }
    }

    public final void oLA() {
        AnonymousClass5yu.m28708B(this).oLA();
    }

    public final boolean onBackPressed() {
        AnonymousClass1YD.B(this.f70591E).edit().putString("save_tab_last_opened", this.f70588B.toString()).apply();
        AnonymousClass0IL M = this.f70590D.M();
        return M instanceof AnonymousClass0IS ? ((AnonymousClass0IS) M).onBackPressed() : false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1280813677);
        super.onCreate(bundle);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f70591E = G;
        this.f70592F = new AnonymousClass3dN(this, G);
        List arrayList = new ArrayList();
        this.f70589C = arrayList;
        arrayList.add(AnonymousClass2Gg.ALL);
        this.f70589C.add(AnonymousClass2Gg.COLLECTIONS);
        AnonymousClass0cQ.G(this, -1919871941, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1680767070);
        View inflate = layoutInflater.inflate(C0164R.layout.save_home, viewGroup, false);
        AnonymousClass0cQ.G(this, 1426150659, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -2141276134);
        super.onDestroyView();
        this.f70590D = null;
        this.f70593G = null;
        AnonymousClass0cQ.G(this, 1837313422, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70593G = (ScrollingOptionalViewPager) view.findViewById(C0164R.id.save_home_pager);
        this.f70590D = new AnonymousClass1LM(this, getChildFragmentManager(), this.f70593G, (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view), this.f70589C);
        AnonymousClass2Gg anonymousClass2Gg = null;
        String string = AnonymousClass1YD.B(this.f70591E).getString("save_tab_last_opened", null);
        if (string != null) {
            anonymousClass2Gg = AnonymousClass2Gg.valueOf(string);
        }
        if (anonymousClass2Gg != null) {
            AnonymousClass2Gg anonymousClass2Gg2 = AnonymousClass2Gg.COLLECTIONS;
            if (anonymousClass2Gg.equals(anonymousClass2Gg2)) {
                r3.f70590D.O(anonymousClass2Gg2);
                return;
            }
        }
        r3.f70590D.O(AnonymousClass2Gg.ALL);
    }

    public final boolean tD(AnonymousClass0Ih anonymousClass0Ih) {
        return isResumed() && anonymousClass0Ih == AnonymousClass5yu.m28708B(this);
    }

    public final AnonymousClass1LP vF(Object obj) {
        return AnonymousClass1LP.D(((AnonymousClass2Gg) obj).f28400B);
    }

    public final void wOA(boolean z) {
        this.f70594H = z;
        this.f70590D.f17319B.setVisibility(z ? 0 : 8);
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }
}
