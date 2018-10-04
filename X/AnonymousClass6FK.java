package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.model.shopping.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6FK */
public final class AnonymousClass6FK extends AnonymousClass0Ie implements AnonymousClass0PZ, OnScrollListener, AnonymousClass0Pb, AnonymousClass22s, AnonymousClass0gi, AnonymousClass63R {
    /* renamed from: B */
    public AnonymousClass624 f73349B;
    /* renamed from: C */
    public AnonymousClass3fr f73350C;
    /* renamed from: D */
    public String f73351D;
    /* renamed from: E */
    public String f73352E;
    /* renamed from: F */
    public AnonymousClass62l f73353F;
    /* renamed from: G */
    public AnonymousClass0P7 f73354G;
    /* renamed from: H */
    public String f73355H;
    /* renamed from: I */
    public long f73356I;
    /* renamed from: J */
    public Product f73357J;
    /* renamed from: K */
    public String f73358K;
    /* renamed from: L */
    public AnonymousClass0TH f73359L;
    /* renamed from: M */
    public AnonymousClass5qP f73360M;
    /* renamed from: N */
    public AnonymousClass3bR f73361N;
    /* renamed from: O */
    public AnonymousClass3dI f73362O;
    /* renamed from: P */
    public final AnonymousClass0hq f73363P = new AnonymousClass0hp();
    /* renamed from: Q */
    public AnonymousClass0Cm f73364Q;
    /* renamed from: R */
    public AnonymousClass62t f73365R;
    /* renamed from: S */
    public AnonymousClass3kj f73366S;
    /* renamed from: T */
    private final AnonymousClass0IT f73367T = new AnonymousClass633(this);
    /* renamed from: U */
    private AnonymousClass0eT f73368U;
    /* renamed from: V */
    private AnonymousClass1Uv f73369V;
    /* renamed from: W */
    private AnonymousClass0iP f73370W;
    /* renamed from: X */
    private AnonymousClass0jP f73371X;
    /* renamed from: Y */
    private final AnonymousClass0hi f73372Y = new AnonymousClass0hi();
    /* renamed from: Z */
    private AnonymousClass0w0 f73373Z;
    /* renamed from: a */
    private boolean f73374a;
    /* renamed from: b */
    private final AnonymousClass0hi f73375b = new AnonymousClass0hi();
    /* renamed from: c */
    private final AnonymousClass6FJ f73376c = new AnonymousClass6FJ(this);
    /* renamed from: d */
    private AnonymousClass62s f73377d;
    /* renamed from: e */
    private final AnonymousClass0F8 f73378e = new AnonymousClass635(this);
    /* renamed from: f */
    private int f73379f;
    /* renamed from: g */
    private AnonymousClass0iW f73380g;
    /* renamed from: h */
    private AnonymousClass1UI f73381h;
    /* renamed from: i */
    private final AnonymousClass0F8 f73382i = new AnonymousClass636(this);
    /* renamed from: j */
    private final AnonymousClass0F8 f73383j = new AnonymousClass634(this);
    /* renamed from: k */
    private AnonymousClass62D f73384k;

    public final boolean Xn(View view, MotionEvent motionEvent, AnonymousClass0P7 anonymousClass0P7, int i) {
        return false;
    }

    public final String getModuleName() {
        return "instagram_shopping_pdp";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: A */
    public final void m29635A(Intent intent) {
        List<String> stringArrayListExtra = intent.getStringArrayListExtra("pdp_media_ids");
        boolean booleanExtra = intent.getBooleanExtra("pdp_show_see_all", false);
        AnonymousClass0LH.E(stringArrayListExtra);
        Collection arrayList = new ArrayList();
        for (String A : stringArrayListExtra) {
            arrayList.add(AnonymousClass107.f13182C.A(A));
        }
        AnonymousClass624 anonymousClass624 = this.f73349B;
        AnonymousClass0LH.E(anonymousClass624.f71082N);
        AnonymousClass0LH.E(anonymousClass624.f71082N.f71130B);
        AnonymousClass61s anonymousClass61s = (AnonymousClass61s) anonymousClass624.f71082N.f71130B;
        anonymousClass61s.f71035C.clear();
        anonymousClass61s.f71035C.addAll(arrayList);
        anonymousClass61s.f71034B = booleanExtra;
        AnonymousClass624.m28804B(anonymousClass624);
    }

    /* renamed from: B */
    public static Product m29629B(AnonymousClass6FK anonymousClass6FK) {
        AnonymousClass62t anonymousClass62t = anonymousClass6FK.f73365R;
        if (anonymousClass62t == null) {
            return anonymousClass6FK.f73357J;
        }
        return anonymousClass62t.f71259C;
    }

    public final void BAA(boolean z) {
        AnonymousClass0rF.B(this.f73349B, 733911913);
        Toast.makeText(getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
    }

    /* renamed from: C */
    public static void m29630C(AnonymousClass6FK anonymousClass6FK) {
        AnonymousClass0LH.E(anonymousClass6FK.f73354G);
        anonymousClass6FK.f73353F.f71234C = anonymousClass6FK.f73354G;
        if (anonymousClass6FK.getActivity() != null) {
            AnonymousClass0TK anonymousClass3kj = new AnonymousClass3kj(anonymousClass6FK.getActivity(), new AnonymousClass3Nn(anonymousClass6FK.f73354G), anonymousClass6FK);
            anonymousClass6FK.f73366S = anonymousClass3kj;
            anonymousClass6FK.registerLifecycleListener(anonymousClass3kj);
        }
    }

    public final void CAA(AnonymousClass0ft anonymousClass0ft, boolean z, boolean z2) {
        if (z) {
            AnonymousClass624 anonymousClass624 = this.f73349B;
            anonymousClass624.f71075G.D();
            AnonymousClass624.m28804B(anonymousClass624);
        }
        AnonymousClass624 anonymousClass6242 = this.f73349B;
        Collection collection = anonymousClass0ft.f8015E;
        List list = anonymousClass6242.f71073E;
        if (list == null) {
            anonymousClass6242.f71073E = collection;
        } else {
            list.addAll(collection);
        }
        AnonymousClass624.m28804B(anonymousClass6242);
    }

    /* renamed from: D */
    public static void m29631D(AnonymousClass6FK anonymousClass6FK, AnonymousClass62m anonymousClass62m) {
        AnonymousClass0Ie anonymousClass0Ie = anonymousClass6FK;
        AnonymousClass0LH.E(anonymousClass6FK.f73357J);
        anonymousClass6FK.f73353F.f71233B = anonymousClass6FK.f73357J.A();
        List list = null;
        if (anonymousClass62m == null) {
            anonymousClass6FK.f73349B.m28807F(anonymousClass6FK.f73357J, false);
        } else {
            String str;
            if (anonymousClass6FK.f73357J.A() && anonymousClass62m.f71241F != null && !anonymousClass62m.f71241F.A().isEmpty() && ((Boolean) AnonymousClass0CC.Md.H(anonymousClass6FK.f73364Q)).booleanValue()) {
                anonymousClass6FK.f73365R = new AnonymousClass62t(anonymousClass6FK.f73349B, anonymousClass6FK.f73353F, anonymousClass0Ie, anonymousClass6FK.f73357J, anonymousClass62m.f71241F);
            }
            AnonymousClass624 anonymousClass624 = anonymousClass6FK.f73349B;
            Product B = AnonymousClass6FK.m29629B(anonymousClass6FK);
            AnonymousClass62t anonymousClass62t = anonymousClass6FK.f73365R;
            if (anonymousClass62t != null) {
                list = anonymousClass62t.m28831A(0);
            }
            anonymousClass624.f71078J = B;
            anonymousClass624.f71080L = anonymousClass62m.f71241F;
            anonymousClass624.f71071C = new AnonymousClass62B(anonymousClass62m.f71244I, AnonymousClass62A.SOLD_BY);
            anonymousClass624.f71072D = anonymousClass62m.f71237B;
            anonymousClass624.f71082N = new AnonymousClass62B(new AnonymousClass61s(anonymousClass62m.f71243H), AnonymousClass62A.UGC_POSTS);
            anonymousClass624.f71081M = new AnonymousClass62B(new AnonymousClass61s(anonymousClass62m.f71242G), AnonymousClass62A.RELATED_POSTS);
            anonymousClass624.f71077I = new AnonymousClass62B(anonymousClass62m.f71239D, anonymousClass624.f71074F.m29960A() ? AnonymousClass62A.OTHER_PRODUCTS_FROM_STORY : AnonymousClass62A.OTHER_PRODUCTS);
            anonymousClass624.f71084P = list;
            anonymousClass624.f71076H = true;
            anonymousClass624.f71079K.f71067B = false;
            if (anonymousClass62m.f71238C != null) {
                anonymousClass624.f71075G.B(anonymousClass62m.f71238C.f8015E);
                AnonymousClass624.m28804B(anonymousClass624);
            }
            AnonymousClass62B anonymousClass62B = anonymousClass624.f71071C;
            if (anonymousClass62B == null || anonymousClass62B.f71130B == null) {
                str = null;
            } else {
                str = ((AnonymousClass0Ci) anonymousClass624.f71071C.f71130B).f1757z;
            }
            anonymousClass624.f71070B = str;
            AnonymousClass624.m28804B(anonymousClass624);
            anonymousClass6FK.f73359L.A();
        }
        if (anonymousClass6FK.f73384k == null) {
            anonymousClass0Ie.f73384k = new AnonymousClass62D(anonymousClass6FK.f73364Q, anonymousClass0Ie, anonymousClass0Ie, anonymousClass6FK.f73349B, anonymousClass6FK.f73357J, anonymousClass0Ie.f73353F);
            anonymousClass0Ie.f73375b.A(anonymousClass0Ie.f73384k);
        }
        String str2 = anonymousClass0Ie.f73355H;
        if (str2 != null && anonymousClass0Ie.f73354G == null) {
            AnonymousClass0GA B2 = AnonymousClass0It.B(str2, anonymousClass0Ie.f73364Q);
            B2.f2849B = new AnonymousClass63E(anonymousClass0Ie);
            anonymousClass0Ie.schedule(B2);
        } else if (anonymousClass0Ie.f73354G != null) {
            AnonymousClass6FK.m29630C(anonymousClass0Ie);
        }
    }

    /* renamed from: E */
    public static boolean m29632E(AnonymousClass6FK anonymousClass6FK) {
        return anonymousClass6FK.f73351D.equals(anonymousClass6FK.f73364Q.f1759C);
    }

    /* renamed from: F */
    public static void m29633F(AnonymousClass6FK anonymousClass6FK) {
        AnonymousClass6FK anonymousClass6FK2 = anonymousClass6FK;
        if (anonymousClass6FK.f73355H != null) {
            AnonymousClass0P7 anonymousClass0P7 = anonymousClass6FK.f73354G;
            AnonymousClass63G anonymousClass63G = new AnonymousClass63G(anonymousClass6FK2, anonymousClass6FK.f73355H, anonymousClass0P7 != null ? anonymousClass0P7.TO() : null, anonymousClass6FK.f73358K, anonymousClass6FK.f73364Q.f1759C);
            new AnonymousClass0Sb(anonymousClass63G.f71295B.getContext()).G(anonymousClass63G.f71299F, anonymousClass63G.f71296C).F(true).C().show();
            AnonymousClass0EE anonymousClass0EE = anonymousClass63G.f71295B;
            String str = anonymousClass63G.f71300G;
            String B = AnonymousClass0q1.B(anonymousClass63G.f71297D);
            AnonymousClass0ON anonymousClass0ON = anonymousClass63G.f71298E;
            AnonymousClass3oG.G(anonymousClass0EE, str, B, anonymousClass0ON != null ? anonymousClass0ON.name() : null, anonymousClass63G.f71301H, AnonymousClass3oD.IG_REPORT_ACTION_OPEN_PRODUCT_DIALOG);
            AnonymousClass10A.D(anonymousClass63G.f71295B.getActivity(), anonymousClass63G.f71295B, anonymousClass63G.f71300G, anonymousClass63G.f71301H, anonymousClass63G.f71297D, AnonymousClass3o0.ACTION_OPEN_PRODUCT_DIALOG);
        }
    }

    public final AnonymousClass0eT FI() {
        return this.f73368U;
    }

    /* renamed from: G */
    private void m29634G(AbsListView absListView, int i, int i2, int i3) {
        this.f73375b.onScroll(absListView, i, i2, i3);
        if (this.f73349B.f71085Q == AnonymousClass0nS.FEED) {
            this.f73372Y.onScroll(absListView, i, i2, i3);
        }
        this.f73361N.A();
    }

    public final void Vn(AnonymousClass0P7 anonymousClass0P7, int i) {
        this.f73380g.E();
        this.f73369V.A(anonymousClass0P7);
    }

    public final AnonymousClass0Pt WI() {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f73364Q);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        return anonymousClass0Pt.L("feed/user/%s/shoppable_media/", new Object[]{this.f73351D}).M(AnonymousClass11j.class);
    }

    public final AnonymousClass0iW iM() {
        return this.f73380g;
    }

    public final boolean isEmpty() {
        return this.f73349B.isEmpty();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1336 && i2 == -1) {
            int i3;
            m29635A(intent);
            AnonymousClass1Rz anonymousClass1Rz = (AnonymousClass1Rz) intent.getSerializableExtra("ugc_edit_mode");
            List stringArrayListExtra = intent.getStringArrayListExtra("media_ids");
            if (anonymousClass1Rz == AnonymousClass1Rz.ADD_POSTS) {
                i3 = C0164R.plurals.shopping_viewer_ugc_edit_posts_added_toast;
            } else {
                i3 = C0164R.plurals.shopping_viewer_ugc_edit_posts_removed_toast;
            }
            AnonymousClass0IG.D(getContext(), getResources().getQuantityString(i3, stringArrayListExtra.size()));
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 559199657);
        this.f73364Q = AnonymousClass0Ce.G(getArguments());
        super.onCreate(bundle);
        String string = getArguments().getString("prior_module_name");
        AnonymousClass0F4.f2058E.A(AnonymousClass0ko.class, this.f73382i).A(AnonymousClass0uG.class, this.f73383j).A(AnonymousClass2EU.class, this.f73378e);
        boolean booleanValue = ((Boolean) AnonymousClass0CC.Sd.H(this.f73364Q)).booleanValue();
        this.f73374a = booleanValue;
        if (!booleanValue) {
            registerLifecycleListener(new AnonymousClass235(getActivity()));
        }
        AnonymousClass0Jv anonymousClass0Jv = AnonymousClass0Jv.f2949B;
        AnonymousClass0Cm anonymousClass0Cm = r11.f73364Q;
        Map hashMap = new HashMap();
        hashMap.put(AnonymousClass3af.SAVE_ICON, new AnonymousClass5z4());
        AnonymousClass0TK L = anonymousClass0Jv.L(anonymousClass0Cm, hashMap);
        r11.f73360M = L;
        registerLifecycleListener(L);
        r11.f73359L = AnonymousClass0Jv.f2949B.I(r11, r11, r11.f73364Q, AnonymousClass0TD.SHOPPING_PRODUCT_DETAILS, AnonymousClass0Jv.f2949B.K().GQA(new AnonymousClass637(r11), r11.f73360M).HD());
        String string2 = getArguments().getString("displayed_username");
        r11.f73352E = string2;
        AnonymousClass0LH.E(string2);
        string2 = getArguments().getString("displayed_user_id");
        r11.f73351D = string2;
        AnonymousClass0LH.E(string2);
        string2 = getArguments().getString("media_id");
        r11.f73355H = string2;
        if (string2 != null) {
            r11.f73354G = AnonymousClass107.f13182C.A(r11.f73355H);
        }
        r11.f73357J = (Product) getArguments().getParcelable("product");
        r11.f73361N = new AnonymousClass3bR(r11.f73364Q, r11, r11);
        r11.f73353F = new AnonymousClass62l(r11.f73363P.kR(), string);
        AnonymousClass0TK anonymousClass0w0 = new AnonymousClass0w0(r11, r11.f73353F, r11.f73364Q);
        r11.f73373Z = anonymousClass0w0;
        registerLifecycleListener(anonymousClass0w0);
        AnonymousClass0jC anonymousClass0jC = new AnonymousClass0jC(r11, true, getContext());
        r11.f73362O = new AnonymousClass3dI(getActivity(), getContext(), r11.f73364Q, r11, string);
        ListAdapter anonymousClass624 = new AnonymousClass624(getContext(), r11.f73364Q, new AnonymousClass6Ha(r11), AnonymousClass6FK.m29632E(r11), r11.f73374a, string, r11, new AnonymousClass3Nw(getActivity(), false, true), anonymousClass0jC);
        r11.f73349B = anonymousClass624;
        setListAdapter(anonymousClass624);
        if (r11.f73364Q.B().getId().equals(r11.f73351D)) {
            boolean AA = r11.f73364Q.B().AA();
        }
        r11.f73379f = getResources().getDimensionPixelSize(C0164R.dimen.reel_actionbar_height);
        r11.f73380g = new AnonymousClass0iW(getContext());
        r11.f73381h = new AnonymousClass1UI(getContext(), getLoaderManager(), r11.f73364Q, r11);
        if (((Boolean) AnonymousClass0CC.Nd.H(r11.f73364Q)).booleanValue()) {
            r11.f73370W = new AnonymousClass0kZ(getContext(), r11, getFragmentManager(), r11.f73349B, r11, r11.f73364Q).A();
            OnScrollListener anonymousClass0kd = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 6, r11.f73381h);
            r11.f73371X = AnonymousClass0jP.B(getContext(), r11.f73364Q, r11).A(r11.f73349B);
            r11.f73369V = new AnonymousClass1Uv(getContext(), r11.f73375b, r11.f73349B, ((BaseFragmentActivity) getActivity()).FI(), anonymousClass0kd, r11.f73370W, r11, r11, r11.f73371X, true);
            new AnonymousClass0hr(r11.f73349B).B();
            r11.f73375b.A(anonymousClass0kd);
            r11.f73375b.A(r11.f73380g);
            r11.f73372Y.A(r11.f73370W);
            AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
            anonymousClass0lj.L(AnonymousClass0kr.B(getActivity()));
            anonymousClass0lj.L(r11.f73369V);
            anonymousClass0lj.L(r11.f73370W);
            anonymousClass0lj.L(r11.f73371X);
            anonymousClass0lj.L(new AnonymousClass0jR(r11, r11, r11.f73364Q));
            registerLifecycleListenerSet(anonymousClass0lj);
        }
        Product product = r11.f73357J;
        if (product == null) {
            r11.f73358K = getArguments().getString("product_id");
        } else {
            r11.f73358K = product.getId();
            AnonymousClass6FK.m29631D(r11, null);
        }
        AnonymousClass0LH.E(r11.f73358K);
        String str = r11.f73358K;
        string2 = r11.f73355H;
        String B = string2 != null ? AnonymousClass0q1.B(string2) : null;
        Context context = getContext();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(r11.f73364Q);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("commerce/products/");
        stringBuilder.append(str);
        stringBuilder.append("/");
        anonymousClass0Pt.f4229M = stringBuilder.toString();
        AnonymousClass0GA H = anonymousClass0Pt.F("media_id", B).D("device_width", String.valueOf(AnonymousClass0Nm.J(context))).M(AnonymousClass62n.class).H();
        H.f2849B = new AnonymousClass639(r11);
        schedule(H);
        AnonymousClass0cQ.G(r11, 1458961998, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1495464867);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0164R.layout.product_details_page, viewGroup, false);
        viewGroup2.setClipChildren(false);
        this.f73368U = new AnonymousClass0eT((ViewGroup) viewGroup2.findViewById(C0164R.id.pdp_action_bar), new AnonymousClass638(this));
        AnonymousClass0cQ.G(this, 716881852, F);
        return viewGroup2;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 2088531326);
        super.onDestroy();
        this.f73372Y.B(this.f73371X);
        unregisterLifecycleListener(this.f73373Z);
        unregisterLifecycleListener(this.f73360M);
        AnonymousClass0TK anonymousClass0TK = this.f73366S;
        if (anonymousClass0TK != null) {
            unregisterLifecycleListener(anonymousClass0TK);
        }
        anonymousClass0TK = this.f73377d;
        if (anonymousClass0TK != null) {
            unregisterLifecycleListener(anonymousClass0TK);
        }
        AnonymousClass0F4.f2058E.D(AnonymousClass0ko.class, this.f73382i).D(AnonymousClass0uG.class, this.f73383j).D(AnonymousClass2EU.class, this.f73378e);
        AnonymousClass0cQ.G(this, -2038023107, F);
    }

    public final void onResume() {
        AnonymousClass6FK anonymousClass6FK = this;
        int F = AnonymousClass0cQ.F(this, 997937137);
        super.onResume();
        this.f73368U.R(this.f73367T);
        this.f73356I = System.currentTimeMillis();
        Product product = this.f73357J;
        if (product != null) {
            this.f73353F.m28821A(anonymousClass6FK, product, -1, 0, null);
        }
        AnonymousClass0cQ.G(anonymousClass6FK, -1132254141, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -1374457141);
        if (!this.f73349B.FX()) {
            m29634G(absListView, i, i2, i3);
        } else if (AnonymousClass0iI.E(absListView)) {
            this.f73349B.Tc();
            m29634G(absListView, i, i2, i3);
        }
        AnonymousClass0cQ.H(this, -802393494, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -164268138);
        if (!this.f73349B.FX()) {
            this.f73375b.onScrollStateChanged(absListView, i);
        }
        if (this.f73349B.f71085Q == AnonymousClass0nS.FEED) {
            this.f73372Y.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0cQ.H(this, 1255732556, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f73374a) {
            if (this.f73377d == null) {
                this.f73377d = new AnonymousClass62s(this, this.f73376c, AnonymousClass6FK.m29632E(this));
                this.f73375b.A(this.f73377d);
                registerLifecycleListener(this.f73377d);
            }
            AnonymousClass62s anonymousClass62s = this.f73377d;
            AnonymousClass0eT anonymousClass0eT = this.f73368U;
            View inflate = ((ViewStub) view.findViewById(C0164R.id.action_bar_overlay_viewstub)).inflate();
            anonymousClass62s.f71251D = (ImageView) inflate.findViewById(C0164R.id.action_bar_back_button);
            anonymousClass62s.f71253F = inflate.findViewById(C0164R.id.action_bar_menu_button);
            anonymousClass62s.f71251D.setOnClickListener(new AnonymousClass62q(anonymousClass62s));
            anonymousClass62s.f71253F.setOnClickListener(new AnonymousClass62r(anonymousClass62s));
            ((View) AnonymousClass1Cy.G(anonymousClass62s.f71253F)).setVisibility(anonymousClass62s.f71256I ? 8 : 0);
            View view2 = anonymousClass0eT.f7727C;
            anonymousClass62s.f71249B = view2;
            view2.measure(-1, -2);
            anonymousClass62s.f71250C = anonymousClass62s.f71249B.getMeasuredHeight();
            anonymousClass62s.f71249B.setVisibility(anonymousClass62s.f71254G ? 0 : 8);
            anonymousClass62s.f71249B.setAlpha(anonymousClass62s.f71254G ? 1.0f : 0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            anonymousClass62s.f71255H = ofFloat;
            ofFloat.setDuration(250);
            anonymousClass62s.f71255H.addUpdateListener(new AnonymousClass62o(anonymousClass62s));
            anonymousClass62s.f71255H.addListener(new AnonymousClass62p(anonymousClass62s));
        }
        if (((Boolean) AnonymousClass0CC.Nd.H(this.f73364Q)).booleanValue()) {
            this.f73372Y.A(this.f73371X);
            this.f73380g.G(getListView(), this.f73349B, this.f73379f);
        }
        getListView().setOnScrollListener(this);
    }
}
