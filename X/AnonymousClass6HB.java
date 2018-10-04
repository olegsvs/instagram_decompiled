package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.singlescrolllistview.SingleScrollTopLockingListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.6HB */
public final class AnonymousClass6HB extends AnonymousClass0Ie implements AnonymousClass0EE, AnonymousClass0Ro, AnonymousClass0hq, AnonymousClass0uD, OnScrollListener, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass0vT, AnonymousClass0gg, AnonymousClass3Lk, AnonymousClass0jb {
    /* renamed from: g */
    private static final String f73912g = "VideoFeedFragment";
    /* renamed from: B */
    public AnonymousClass1VM f73913B;
    /* renamed from: C */
    public boolean f73914C;
    /* renamed from: D */
    public AnonymousClass0uk f73915D;
    /* renamed from: E */
    public String f73916E;
    /* renamed from: F */
    public boolean f73917F = true;
    /* renamed from: G */
    public SingleScrollTopLockingListView f73918G;
    /* renamed from: H */
    public final AnonymousClass0hr f73919H = new AnonymousClass0hr(new AnonymousClass6Bo(this));
    /* renamed from: I */
    public String f73920I;
    /* renamed from: J */
    public boolean f73921J;
    /* renamed from: K */
    public AnonymousClass0Cm f73922K;
    /* renamed from: L */
    public AnonymousClass6Bx f73923L;
    /* renamed from: M */
    public AnonymousClass5Po f73924M;
    /* renamed from: N */
    private AnonymousClass4pF f73925N;
    /* renamed from: O */
    private String f73926O;
    /* renamed from: P */
    private int f73927P;
    /* renamed from: Q */
    private AnonymousClass0jP f73928Q;
    /* renamed from: R */
    private AnonymousClass0ng f73929R;
    /* renamed from: S */
    private final AnonymousClass0F8 f73930S = new AnonymousClass6Bq(this);
    /* renamed from: T */
    private String f73931T;
    /* renamed from: U */
    private Hashtag f73932U;
    /* renamed from: V */
    private AnonymousClass0iW f73933V;
    /* renamed from: W */
    private AnonymousClass3Jr f73934W;
    /* renamed from: X */
    private String f73935X;
    /* renamed from: Y */
    private AnonymousClass0db f73936Y;
    /* renamed from: Z */
    private final AnonymousClass0hi f73937Z = new AnonymousClass0hi();
    /* renamed from: a */
    private final AnonymousClass6Bp f73938a = new AnonymousClass6Bp(this);
    /* renamed from: b */
    private int f73939b;
    /* renamed from: c */
    private String f73940c;
    /* renamed from: d */
    private String f73941d;
    /* renamed from: e */
    private AnonymousClass6Bt f73942e;
    /* renamed from: f */
    private Context f73943f;

    public final void au(AnonymousClass0P7 anonymousClass0P7, int i) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static AnonymousClass0P7 m29858B(AnonymousClass6HB anonymousClass6HB) {
        return anonymousClass6HB.f73915D.B();
    }

    /* renamed from: C */
    private void m29859C(AnonymousClass0P7 anonymousClass0P7) {
        if (this.f73921J && anonymousClass0P7 != null) {
            if (this.f73924M == AnonymousClass5Po.CHANNELS) {
                List arrayList = new ArrayList();
                Object obj = null;
                for (AnonymousClass0P7 anonymousClass0P72 : this.f73913B.f19331B.f9605C) {
                    if (obj == null && anonymousClass0P72.NO().equals(anonymousClass0P7.NO())) {
                        obj = 1;
                    }
                    if (obj != null) {
                        arrayList.add(anonymousClass0P72);
                    }
                }
                AnonymousClass1eu.B(this.f73922K).A(this.f73916E, this.f73920I, arrayList);
            }
        }
    }

    public final AnonymousClass0db CIA(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0db C = AnonymousClass0db.C();
        if (this.f73924M == AnonymousClass5Po.CHAINING) {
            C.G("chaining_session_id", this.f73925N.f57662D);
            C.G("parent_m_pk", this.f73931T);
            C.C("chaining_position", this.f73913B.RO(anonymousClass0P7).f9717z);
        }
        C.J(this.f73936Y);
        C.J(AnonymousClass0uC.G(getArguments()));
        return C;
    }

    /* renamed from: D */
    private String m29860D() {
        switch (this.f73924M.ordinal()) {
            case 0:
                String str = this.f73935X;
                if (str == null) {
                    str = this.f73916E;
                }
                return str;
            case 1:
                return this.f73916E;
            default:
                return null;
        }
    }

    /* renamed from: E */
    private void m29861E(int i) {
        if (getRootActivity() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) getRootActivity()).CSA(i);
        }
    }

    public final Map GIA() {
        if (this.f73924M != AnonymousClass5Po.CHAINING) {
            return null;
        }
        Map hashMap = new HashMap();
        hashMap.put("chaining_session_id", this.f73925N.f57662D);
        hashMap.put("parent_m_pk", this.f73931T);
        return hashMap;
    }

    public final boolean NV() {
        return this.f73913B.L();
    }

    public final void OZ() {
        this.f73923L.m29380C();
    }

    public final boolean QV() {
        return this.f73929R.A();
    }

    public final boolean UX() {
        return this.f73929R.f10111G == AnonymousClass0nq.NEEDS_RETRY;
    }

    public final Hashtag eM() {
        return this.f73932U;
    }

    public final void gC() {
        this.f73923L.m29380C();
    }

    public final String getModuleName() {
        return AnonymousClass6Bs.f72832B[this.f73934W.ordinal()] != 1 ? "explore_event_viewer" : "hashtag_immersive_viewer";
    }

    public final void iBA(AnonymousClass0P7 anonymousClass0P7, int i, int i2, int i3) {
        if (this.f73934W == AnonymousClass3Jr.HASHTAG) {
            AnonymousClass4sN B = AnonymousClass4sN.m25255B(this.f73922K);
            String NO = anonymousClass0P7.NO();
            String str = "seen_media_ids";
            Set E = B.f58060B.E(str, null);
            if (E == null) {
                E = new HashSet();
            }
            E.add(NO);
            B.f58060B.G(str, E);
        }
        AnonymousClass0NN.B("event_media_impression", this).F("endpoint_type", this.f73941d).F("event_id", this.f73916E).F("session_id", this.f73940c).F("media_id", anonymousClass0P7.NO()).F("media_owner_id", anonymousClass0P7.MA().getId()).B("media_type", anonymousClass0P7.TO().A()).B("media_position", this.f73913B.K(anonymousClass0P7)).C(anonymousClass0P7.wY() ? "video_duration" : "photo_duration", (long) i3).C(anonymousClass0P7.wY() ? "video_time_spent" : "photo_time_spent", (long) (i - i2)).R();
    }

    public final AnonymousClass0iW iM() {
        return this.f73933V;
    }

    public final String kR() {
        return this.f73940c;
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.C(this, this.f73918G);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1426593843);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f73922K = AnonymousClass0Ce.G(arguments);
        this.f73940c = UUID.randomUUID().toString();
        this.f73926O = arguments.getString("VideoFeedFragment.ARGUMENT_ENTRY_POINT");
        this.f73916E = arguments.getString("VideoFeedFragment.ARGUMENT_VIDEO_ITEM_ID");
        this.f73941d = arguments.getString("VideoFeedFragment.ARGUMENT_VIDEO_ITEM_TYPE");
        this.f73931T = arguments.getString("VideoFeedFragment.ARGUMENT_FIRST_MEDIA_ID");
        this.f73934W = (AnonymousClass3Jr) arguments.getSerializable("VideoFeedFragment.ARGUMENT_VIDEO_FEED_URL_PATH");
        this.f73932U = (Hashtag) arguments.getParcelable("VideoFeedFragment.ARGUMENT_VIDEO_FEED_HASHTAG");
        this.f73936Y = AnonymousClass0db.C();
        HashMap hashMap = (HashMap) arguments.getSerializable("VideoFeedFragment.ARGUMENT_LOGGING_EXTRAS");
        if (hashMap != null) {
            r15.f73936Y.K(hashMap);
        }
        r15.f73943f = new ContextThemeWrapper(getContext(), C0164R.style.VideoOptimizedDarkFeed);
        r15.f73913B = new AnonymousClass1VM(r15.f73943f, null, r15, false, AnonymousClass3Js.C(r15.f73934W), AnonymousClass3Js.B(r15.f73934W), true, AnonymousClass3mP.MEDIA, AnonymousClass1ew.f21063B, AnonymousClass0a4.EXPLORE_FEED, r15, r15, AnonymousClass1ex.f21064C, r15.f73922K, true, true, null, true);
        registerLifecycleListener(new AnonymousClass1et(getContext(), r15.f73922K, new AnonymousClass6Br(r15)));
        AnonymousClass0TK B = AnonymousClass0jP.B(r15.f73943f, r15.f73922K, r15);
        r15.f73928Q = B;
        registerLifecycleListener(B);
        AnonymousClass0jY anonymousClass0jY = new AnonymousClass0jY();
        Object obj = r15.f73913B;
        r15.f73925N = new AnonymousClass4pF(r15, obj, obj);
        AnonymousClass0jZ anonymousClass0jZ = new AnonymousClass0jZ(getContext(), r15.f73922K, r15, r15.f73913B, anonymousClass0jY, false, false, ((AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getStreamVolume(3) > 0, r15.f73940c);
        anonymousClass0jZ.f9214J = true;
        AnonymousClass0uk anonymousClass0uk = anonymousClass0jZ.f9207C;
        r15.f73915D = anonymousClass0uk;
        anonymousClass0uk.A(r15);
        r15.f73933V = new AnonymousClass0iW(getContext());
        AnonymousClass0jS anonymousClass0jS = new AnonymousClass0jS(r15, r15.f73933V, r15.f73913B, r15.f73937Z);
        AnonymousClass0kZ anonymousClass0kZ = new AnonymousClass0kZ(getContext(), r15, getFragmentManager(), r15.f73913B, r15, r15.f73922K);
        anonymousClass0kZ.f9320I = anonymousClass0jZ;
        anonymousClass0kZ.f9330S = anonymousClass0jS;
        Object A = anonymousClass0kZ.A();
        registerLifecycleListener(A);
        OnScrollListener anonymousClass0kd = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 3, r15);
        r15.f73921J = ((Boolean) AnonymousClass0CC.HD.H(r15.f73922K)).booleanValue();
        Context context = getContext();
        String str = r15.f73922K.f1759C;
        AnonymousClass0Fz loaderManager = getLoaderManager();
        String str2 = null;
        if (r15.f73921J) {
            str2 = (String) AnonymousClass1eu.B(r15.f73922K).f21062C.get(r15.f73916E);
        }
        r15.f73929R = new AnonymousClass0ng(context, str, loaderManager, str2, true);
        r15.f73942e = new AnonymousClass6Bt(r15);
        r15.f73915D.f11902I.add(r15.f73942e);
        Object anonymousClass28Z = new AnonymousClass28Z(r15.f73922K, r15, arguments.getString("VideoFeedFragment.ARGUMENT_VIDEO_FEED_TITLE"));
        registerLifecycleListener(anonymousClass28Z);
        r15.f73927P = AnonymousClass0vm.B(getRootActivity());
        r15.f73937Z.A(r15.f73933V);
        r15.f73937Z.A(anonymousClass28Z);
        r15.f73937Z.A(A);
        r15.f73937Z.A(anonymousClass0kd);
        r15.f73939b = AnonymousClass0ip.B(getContext());
        registerLifecycleListener(r15.f73919H);
        registerLifecycleListener(new AnonymousClass0jR(r15, r15, r15.f73922K));
        List arrayList = new ArrayList();
        AnonymousClass0P7 A2 = AnonymousClass107.f13182C.A(r15.f73931T);
        if (A2 != null) {
            arrayList.add(A2);
            r15.f73913B.F(arrayList);
        } else {
            String str3 = f73912g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaCache.getInstance().get(");
            stringBuilder.append(r15.f73931T);
            stringBuilder.append(") = null");
            AnonymousClass0Gn.C(str3, stringBuilder.toString());
        }
        AnonymousClass5Po anonymousClass5Po = (AnonymousClass5Po) arguments.getSerializable("VideoFeedFragment.ARGUMENT_VIDEO_FEED_SERVICE_TYPE");
        r15.f73924M = anonymousClass5Po;
        r15.f73923L = AnonymousClass6Bz.m29381B(anonymousClass5Po, r15.f73922K, r15.f73934W, r15.f73929R, r15, r15.f73926O, r15.f73916E, r15.f73941d, arguments.getString("VideoFeedFragment.ARGUMENT_SOURCE_MODULE"));
        r15.f73914C = true;
        AnonymousClass0F4.f2058E.A(AnonymousClass0xC.class, r15.f73930S);
        setListAdapter(r15.f73913B);
        AnonymousClass1eu B2 = AnonymousClass1eu.B(r15.f73922K);
        if (r15.f73921J && r15.f73924M == AnonymousClass5Po.CHANNELS) {
            if (B2.f21061B.containsKey(r15.f73916E)) {
                AnonymousClass1VM anonymousClass1VM = r15.f73913B;
                String str4 = r15.f73916E;
                List arrayList2 = new ArrayList();
                for (Object obj2 : (List) B2.f21061B.get(str4)) {
                    if (obj2 instanceof AnonymousClass0P7) {
                        arrayList2.add((AnonymousClass0P7) obj2);
                    }
                }
                anonymousClass1VM.F(arrayList2);
                AnonymousClass0cQ.G(r15, -29139786, F);
            }
        }
        r15.f73923L.m29380C();
        AnonymousClass0cQ.G(r15, -29139786, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1390801987);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_video_optimized_feed, viewGroup, false);
        inflate.setBackgroundColor(AnonymousClass0G5.D(this.f73943f, C0164R.attr.backgroundColorPrimary));
        AnonymousClass0cQ.G(this, 1184699510, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 879410545);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass0xC.class, this.f73930S);
        AnonymousClass0cQ.G(this, 707039878, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1887115722);
        super.onDestroyView();
        this.f73937Z.B(this.f73918G);
        OnScrollListener onScrollListener = this.f73928Q;
        if (onScrollListener != null) {
            this.f73937Z.B(onScrollListener);
        }
        this.f73918G = null;
        AnonymousClass0cQ.G(this, -914166699, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1138827812);
        super.onPause();
        AnonymousClass0ea.E(getRootActivity().getWindow(), getRootActivity().getWindow().getDecorView(), true);
        this.f73915D.f11902I.remove(this.f73942e);
        this.f73933V.B(this.f73918G);
        AnonymousClass0P7 B = this.f73915D.B();
        String D = m29860D();
        this.f73935X = B != null ? B.getId() : null;
        AnonymousClass0F4.f2058E.C(new AnonymousClass4oH(D, B, this.f73924M));
        m29859C(B);
        AnonymousClass0cQ.G(this, 754413199, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 72540163);
        super.onResume();
        AnonymousClass0ea.E(getRootActivity().getWindow(), getRootActivity().getWindow().getDecorView(), false);
        AnonymousClass0uk anonymousClass0uk = this.f73915D;
        anonymousClass0uk.f11902I.add(this.f73942e);
        AnonymousClass0cQ.G(this, -2130269985, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 2035670045);
        if (!this.f73913B.FX()) {
            this.f73937Z.onScroll(absListView, i, i2, i3);
        } else if (AnonymousClass0iI.E(absListView)) {
            this.f73913B.Tc();
            this.f73937Z.onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0cQ.H(this, 1392187764, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 622186506);
        this.f73937Z.onScrollStateChanged(absListView, i);
        if (this.f73924M == AnonymousClass5Po.CHAINING && !this.f73917F && absListView.getLastVisiblePosition() == this.f73913B.getCount() - 1) {
            this.f73925N.m25163D();
        }
        AnonymousClass0cQ.H(this, 2109816357, I);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 1409146133);
        super.onStart();
        m29861E(8);
        AnonymousClass0vm.D(getRootActivity(), AnonymousClass0Ca.C(getContext(), C0164R.color.grey_9));
        if (this.f73924M == AnonymousClass5Po.CHAINING) {
            this.f73925N.m25161A(this.f73931T);
        }
        AnonymousClass0cQ.G(this, 315112786, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -320915888);
        super.onStop();
        m29861E(0);
        AnonymousClass0vm.D(getRootActivity(), this.f73927P);
        if (this.f73924M == AnonymousClass5Po.CHAINING) {
            this.f73925N.m25162B();
        }
        AnonymousClass0cQ.G(this, -1476768320, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SingleScrollTopLockingListView singleScrollTopLockingListView = (SingleScrollTopLockingListView) view.findViewById(16908298);
        this.f73918G = singleScrollTopLockingListView;
        singleScrollTopLockingListView.f12076C = this.f73938a;
        this.f73918G.setScrollOffset(this.f73939b);
        this.f73937Z.A(this.f73918G);
        OnScrollListener onScrollListener = this.f73928Q;
        if (onScrollListener != null) {
            this.f73937Z.A(onScrollListener);
        }
        registerLifecycleListener(this.f73918G);
        this.f73933V.G(this.f73918G, this.f73913B, AnonymousClass0ip.B(getContext()));
        this.f73918G.setOnScrollListener(this);
        this.f73933V.E();
        this.f73925N.f57670L = this.f73918G;
    }

    public final boolean tX() {
        if (!UX()) {
            if (!this.f73913B.L() || !uX()) {
                return false;
            }
        }
        return true;
    }

    public final boolean uX() {
        return this.f73929R.f10111G == AnonymousClass0nq.LOADING;
    }
}
