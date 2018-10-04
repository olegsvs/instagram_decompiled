package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.60K */
public final class AnonymousClass60K extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass42K, AnonymousClass0IT, AnonymousClass3kY {
    /* renamed from: B */
    public View f70788B;
    /* renamed from: C */
    public boolean f70789C;
    /* renamed from: D */
    public View f70790D;
    /* renamed from: E */
    public AnonymousClass5z7 f70791E;
    /* renamed from: F */
    public long f70792F;
    /* renamed from: G */
    public AnonymousClass5zj f70793G;
    /* renamed from: H */
    public AnonymousClass0Cm f70794H;
    /* renamed from: I */
    private Handler f70795I;
    /* renamed from: J */
    private boolean f70796J;
    /* renamed from: K */
    private final Map f70797K = new HashMap();
    /* renamed from: L */
    private TypeaheadHeader f70798L;

    public final String getModuleName() {
        return "school_directory_invite";
    }

    /* renamed from: B */
    public static void m28746B(AnonymousClass60K anonymousClass60K, boolean z) {
        Iterator it = anonymousClass60K.f70797K.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            AnonymousClass0OR.G(anonymousClass60K.f70795I, (Runnable) entry.getValue(), 1311268816);
            if (z) {
                AnonymousClass0Ix.D(AnonymousClass5za.m28730B(anonymousClass60K.f70794H, (String) entry.getKey()));
            }
            it.remove();
        }
    }

    /* renamed from: C */
    public static void m28747C(AnonymousClass60K anonymousClass60K) {
        anonymousClass60K.f70793G = new AnonymousClass5zj();
        anonymousClass60K.f70791E = new AnonymousClass5z7(anonymousClass60K.getContext(), anonymousClass60K.f70793G, anonymousClass60K);
        anonymousClass60K.f70795I = new Handler(Looper.getMainLooper());
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass60K.f70794H);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "school/invitation_list/";
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass5zV.class).N().H();
        H.f2849B = new AnonymousClass60E(anonymousClass60K);
        anonymousClass60K.schedule(H);
        boolean z = anonymousClass60K.getArguments().getBoolean("ARGUMENT_IS_START_OF_SESSION", false);
        anonymousClass60K.f70789C = z;
        if (z) {
            AnonymousClass5zL.m28722F(anonymousClass60K.getArguments().getString("ARGUMENT_ENTRY_POINT"), null, anonymousClass60K.getArguments().getBoolean("ARGUMENT_IS_PUSH"));
            AnonymousClass5zL.m28719C("ig_school_session_will_start", anonymousClass60K.f70792F).R();
        }
        AnonymousClass5zL.m28721E("invitation").R();
        anonymousClass60K.f70798L.setDelegate(anonymousClass60K);
        anonymousClass60K.f70798L.D(anonymousClass60K.getString(C0164R.string.search));
        anonymousClass60K.f70798L.setOnSearchEditTextFocusChangeListener(new AnonymousClass60G(anonymousClass60K));
        anonymousClass60K.f70798L.setSearchIconPadding((int) anonymousClass60K.getResources().getDimension(C0164R.dimen.school_search_bar_icon_padding));
        anonymousClass60K.setListAdapter(anonymousClass60K.f70791E);
    }

    public final void Fg(AnonymousClass0mc anonymousClass0mc) {
        this.f70797K.remove(anonymousClass0mc.getId());
        AnonymousClass5zL.m28719C("ig_school_invite_tap_invite", this.f70792F).R();
        AnonymousClass0GA B = AnonymousClass5za.m28730B(this.f70794H, anonymousClass0mc.getId());
        B.f2849B = new AnonymousClass60J(this, anonymousClass0mc);
        schedule(B);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Q(getString(C0164R.string.done), new AnonymousClass60H(this));
        anonymousClass0eT.c(C0164R.drawable.instagram_x_outline_24, new AnonymousClass60I(this));
        anonymousClass0eT.Z(C0164R.string.invite_title);
    }

    public final boolean lX(String str) {
        return this.f70797K.containsKey(str);
    }

    public final void mo(String str) {
        AnonymousClass0OR.G(this.f70795I, (Runnable) this.f70797K.remove(str), 930834783);
    }

    public final void no(String str, Runnable runnable) {
        this.f70797K.put(str, runnable);
        AnonymousClass0OR.F(this.f70795I, runnable, 2000, -567482247);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 632192385);
        super.onCreate(bundle);
        this.f70794H = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0cQ.G(this, -1545982761, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 811763221);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_school_directory_invite_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, 978902343, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1922770678);
        super.onDestroy();
        if (this.f70789C) {
            AnonymousClass5zL.m28719C("ig_school_session_end", this.f70792F).R();
        }
        AnonymousClass0cQ.G(this, -360015150, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -827037534);
        super.onDestroyView();
        this.f70798L.A();
        AnonymousClass0cQ.G(this, -66447438, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 404492580);
        if (this.f70796J) {
            this.f70798L.A();
        }
        AnonymousClass0cQ.H(this, 9235326, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 445136466);
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            }
        }
        this.f70796J = z;
        AnonymousClass0cQ.H(this, -1546715221, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70790D = view.findViewById(C0164R.id.listview_progressbar);
        this.f70788B = view.findViewById(C0164R.id.content_container);
        this.f70798L = (TypeaheadHeader) view.findViewById(C0164R.id.typeahead_header);
        this.f70788B.setVisibility(4);
        this.f70790D.setVisibility(0);
        if (this.f70794H.B().DC == null) {
            String E = AnonymousClass0IE.E("users/%s/info/", new Object[]{this.f70794H.B().getId()});
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(r4);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = E;
            AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass1IX.class).H();
            H.f2849B = new AnonymousClass60F(this);
            schedule(H);
            return;
        }
        this.f70792F = this.f70794H.B().DC.E();
        AnonymousClass60K.m28747C(this);
    }

    public final void searchTextChanged(String str) {
        this.f70791E.m28714F(this.f70793G.m28736A(str));
    }
}
