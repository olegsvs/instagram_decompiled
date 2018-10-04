package X;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.6FA */
public final class AnonymousClass6FA extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass3dy, AnonymousClass0VE, AnonymousClass0IT {
    /* renamed from: B */
    public String f73289B = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: C */
    public AnonymousClass5zK f73290C;
    /* renamed from: D */
    private AnonymousClass3e0 f73291D;
    /* renamed from: E */
    private SearchEditText f73292E;
    /* renamed from: F */
    private final AnonymousClass3e5 f73293F = new AnonymousClass41j();
    /* renamed from: G */
    private AnonymousClass0Cm f73294G;

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public final String getModuleName() {
        return "search_school";
    }

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
        Toast.makeText(getContext().getApplicationContext(), C0164R.string.something_went_wrong, 0).show();
    }

    public final void Fx(String str) {
        str = this.f73290C;
        if (str.f70671D.f43664B) {
            str.f70671D.f43664B = false;
            str.f70669B = true;
            str.m28717F();
        }
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String G = AnonymousClass0IE.G(searchEditText.getTextForSearch());
        if (!this.f73289B.equals(G)) {
            this.f73289B = G;
            Collection collection = this.f73293F.KQ(this.f73289B).f42954D;
            if (collection != null) {
                AnonymousClass5zK anonymousClass5zK = this.f73290C;
                anonymousClass5zK.f70670C = new ArrayList(collection);
                anonymousClass5zK.m28717F();
                return;
            }
            this.f73291D.C(this.f73289B);
        }
    }

    public final void Lx(String str) {
        str = this.f73290C;
        if (!str.f70671D.f43664B) {
            str.f70671D.f43664B = true;
            str.f70670C.clear();
            str.f70669B = false;
            str.m28717F();
        }
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass5zd anonymousClass5zd = (AnonymousClass5zd) anonymousClass0Pn;
        if (str.equals(this.f73289B)) {
            str = this.f73290C;
            str.f70670C = new ArrayList(anonymousClass5zd.VN());
            str.m28717F();
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.c(C0164R.drawable.instagram_x_outline_24, new AnonymousClass60S(this));
        SearchEditText i = anonymousClass0eT.i();
        this.f73292E = i;
        i.setOnFilterTextListener(this);
        this.f73292E.E();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1511660824);
        super.onCreate(bundle);
        this.f73294G = AnonymousClass0Ce.G(getArguments());
        AnonymousClass3e0 anonymousClass3e0 = new AnonymousClass3e0(this, this.f73293F);
        this.f73291D = anonymousClass3e0;
        anonymousClass3e0.f42947D = this;
        AnonymousClass0cQ.G(this, -570829027, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1253111685);
        super.onPause();
        this.f73292E.B();
        AnonymousClass0cQ.G(this, 662195249, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.H(this, -1280297324, AnonymousClass0cQ.I(this, 1643004159));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 1789336686);
        if (i == 1) {
            this.f73292E.B();
        }
        AnonymousClass0cQ.H(this, 924465587, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass5zK anonymousClass5zK = new AnonymousClass5zK(getContext(), this);
        this.f73290C = anonymousClass5zK;
        anonymousClass5zK.m28717F();
        setListAdapter(this.f73290C);
        this.f73291D.C(this.f73289B);
        getListView().setOnScrollListener(this);
        view.setBackgroundColor(AnonymousClass0Ca.C(getActivity(), AnonymousClass0G5.F(getActivity(), C0164R.attr.backgroundColorPrimary)));
    }

    public final AnonymousClass0Iu tF(String str) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f73294G);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "school/get_school_typeahead/";
        return anonymousClass0Pt.M(AnonymousClass5ze.class).D("query", str).N().H();
    }
}
