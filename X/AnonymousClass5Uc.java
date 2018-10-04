package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.ColorFilter;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.actionbar.ActionButton;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5Uc */
public final class AnonymousClass5Uc extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass3dy {
    /* renamed from: B */
    public ActionButton f64973B;
    /* renamed from: C */
    public AnonymousClass4X6 f64974C;
    /* renamed from: D */
    public final AnonymousClass3e5 f64975D = new AnonymousClass41j();
    /* renamed from: E */
    public String f64976E;
    /* renamed from: F */
    public volatile AnonymousClass5iY f64977F;
    /* renamed from: G */
    public final Handler f64978G = new AnonymousClass4XG(this);
    /* renamed from: H */
    public final boolean f64979H = ((Boolean) AnonymousClass0CC.JV.G()).booleanValue();
    /* renamed from: I */
    public ListView f64980I;
    /* renamed from: J */
    public Location f64981J;
    /* renamed from: K */
    public boolean f64982K;
    /* renamed from: L */
    public LocationSignalPackage f64983L;
    /* renamed from: M */
    public boolean f64984M;
    /* renamed from: N */
    public Dialog f64985N;
    /* renamed from: O */
    public View f64986O;
    /* renamed from: P */
    public ViewStub f64987P;
    /* renamed from: Q */
    public SearchEditText f64988Q;
    /* renamed from: R */
    public String f64989R;
    /* renamed from: S */
    public String f64990S;
    /* renamed from: T */
    public boolean f64991T;
    /* renamed from: U */
    private final AnonymousClass1DQ f64992U = new AnonymousClass4XF(this);
    /* renamed from: V */
    private Handler f64993V;
    /* renamed from: W */
    private final AnonymousClass1DP f64994W = new AnonymousClass4XH(this);
    /* renamed from: X */
    private final AnonymousClass1DO f64995X = new AnonymousClass4XI(this);
    /* renamed from: Y */
    private boolean f64996Y;
    /* renamed from: Z */
    private OnItemClickListener f64997Z = new AnonymousClass4XJ(this);
    /* renamed from: a */
    private AnonymousClass3e0 f64998a;
    /* renamed from: b */
    private long f64999b;
    /* renamed from: c */
    private AnonymousClass0Cm f65000c;
    /* renamed from: d */
    private AnonymousClass0F8 f65001d;

    public final String getModuleName() {
        return "nearby_venues";
    }

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
        if (str.equalsIgnoreCase(this.f64989R)) {
            List arrayList = new ArrayList();
            Collection collection = this.f64975D.KQ(str).f42954D;
            if (collection != null) {
                arrayList.addAll(collection);
            }
            AnonymousClass5Uc.m27069J(this, arrayList, str, true);
        }
    }

    /* renamed from: B */
    public static void m27061B(AnonymousClass5Uc anonymousClass5Uc) {
        if (AnonymousClass0JI.isLocationEnabled(anonymousClass5Uc.getContext())) {
            anonymousClass5Uc.m27071L();
            return;
        }
        anonymousClass5Uc.f64993V.removeMessages(2);
        anonymousClass5Uc.f64993V.sendEmptyMessage(2);
    }

    /* renamed from: C */
    public static Location m27062C(AnonymousClass5Uc anonymousClass5Uc) {
        return (Location) anonymousClass5Uc.getArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION");
    }

    /* renamed from: D */
    public static void m27063D(AnonymousClass5Uc anonymousClass5Uc) {
        AnonymousClass5Uc.m27067H(anonymousClass5Uc);
        anonymousClass5Uc.m27070K();
        ActionButton actionButton = anonymousClass5Uc.f64973B;
        if (actionButton != null) {
            actionButton.setDisplayedChild(1);
        }
        Activity activity = anonymousClass5Uc.getActivity();
        if (activity != null) {
            NearbyVenuesService.F(activity, anonymousClass5Uc.f65000c, anonymousClass5Uc.f64981J, anonymousClass5Uc.f64983L, Long.valueOf(anonymousClass5Uc.f64999b));
        }
    }

    /* renamed from: E */
    public static void m27064E(AnonymousClass5Uc anonymousClass5Uc, Venue venue, Location location, int i) {
        if (venue.f6707D.equals("facebook_places")) {
            AnonymousClass0NN B = AnonymousClass0NN.B("facebook_places_venue_select", anonymousClass5Uc);
            if (location != null) {
                String str = "%.8f";
                B.F("lat", AnonymousClass0IE.E(str, new Object[]{Double.valueOf(location.getLatitude())}));
                B.F("lng", AnonymousClass0IE.E(str, new Object[]{Double.valueOf(location.getLongitude())}));
                String str2 = anonymousClass5Uc.f64989R;
                if (str2 != null) {
                    B.F("query", str2);
                }
                B.B("index", i);
                B.F("place_name", venue.f6716M);
                B.F("place_id", venue.f6706C);
                B.R();
            }
        }
    }

    /* renamed from: F */
    public static void m27065F(AnonymousClass5Uc anonymousClass5Uc) {
        if (anonymousClass5Uc.f64981J == null) {
            Location C;
            if (AnonymousClass5Uc.m27062C(anonymousClass5Uc) != null) {
                C = AnonymousClass5Uc.m27062C(anonymousClass5Uc);
            } else {
                C = AnonymousClass0JI.getInstance().getLastLocation();
            }
            anonymousClass5Uc.f64981J = C;
        }
    }

    public final void Fx(String str) {
        this.f64973B.setDisplayedChild(0);
    }

    /* renamed from: G */
    public static void m27066G(AnonymousClass5Uc anonymousClass5Uc) {
        if (anonymousClass5Uc.f64981J != null) {
            anonymousClass5Uc.m27070K();
            AnonymousClass4X6 anonymousClass4X6 = anonymousClass5Uc.f64974C;
            anonymousClass4X6.f54949C.clear();
            anonymousClass4X6.f54948B.clear();
            List D = NearbyVenuesService.D(anonymousClass5Uc.f64981J);
            if (D == null) {
                AnonymousClass0rF.B(anonymousClass5Uc.f64974C, -1672339063);
                anonymousClass5Uc.f64973B.setDisplayedChild(1);
                NearbyVenuesService.F(anonymousClass5Uc.getActivity(), anonymousClass5Uc.f65000c, anonymousClass5Uc.f64981J, anonymousClass5Uc.f64983L, Long.valueOf(anonymousClass5Uc.f64999b));
                return;
            }
            AnonymousClass0rF.B(anonymousClass5Uc.f64974C.A(D), -925093788);
        }
    }

    /* renamed from: H */
    public static void m27067H(AnonymousClass5Uc anonymousClass5Uc) {
        ActionButton actionButton = anonymousClass5Uc.f64973B;
        if (actionButton != null) {
            actionButton.setDisplayedChild(0);
        }
        anonymousClass5Uc.f64978G.removeMessages(1);
        anonymousClass5Uc.f64978G.removeMessages(0);
        AnonymousClass0JI.getInstance().removeLocationUpdates(anonymousClass5Uc.f64994W);
        AnonymousClass0JI.getInstance().cancelSignalPackageRequest(anonymousClass5Uc.f64995X);
        anonymousClass5Uc.f64996Y = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: I */
    public static void m27068I(X.AnonymousClass5Uc r5, java.lang.String r6) {
        /*
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 == 0) goto L_0x0017;
    L_0x000b:
        r0 = r5.f64981J;
        r4 = com.instagram.creation.location.NearbyVenuesService.D(r0);
        if (r4 == 0) goto L_0x005f;
    L_0x0013:
        r3.addAll(r4);
        goto L_0x005f;
    L_0x0017:
        r0 = r5.f64975D;
        r0 = r0.KQ(r6);
        r4 = r0.f42954D;
        if (r4 != 0) goto L_0x0013;
    L_0x0021:
        r4 = new java.util.ArrayList;
        r0 = r5.f64974C;
        r0 = r0.B();
        r4.<init>(r0);
        r2 = r4.iterator();
    L_0x0030:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0058;
    L_0x0036:
        r0 = r2.next();
        r0 = (com.instagram.model.venue.Venue) r0;
        r1 = r0.f6716M;
        r0 = X.AnonymousClass0EH.E();
        r1 = r1.toLowerCase(r0);
        r0 = X.AnonymousClass0EH.E();
        r0 = r6.toLowerCase(r0);
        r0 = r1.startsWith(r0);
        if (r0 != 0) goto L_0x0030;
    L_0x0054:
        r2.remove();
        goto L_0x0030;
    L_0x0058:
        r1 = r5.f64975D;
        r0 = 0;
        r1.xB(r6, r4, r0);
        goto L_0x0013;
    L_0x005f:
        r0 = r5.f64998a;
        r0 = r0.f42945B;
        r1 = r0.KQ(r6);
        r0 = r1.f42954D;
        if (r0 == 0) goto L_0x0070;
    L_0x006b:
        r0 = r1.f42954D;
        r3.addAll(r0);
    L_0x0070:
        r0 = r1.f42956F;
        r2 = X.AnonymousClass3e4.FULL;
        if (r0 == r2) goto L_0x0087;
    L_0x0076:
        r0 = r5.f64989R;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0087;
    L_0x007e:
        r0 = r5.f64981J;
        if (r0 == 0) goto L_0x0087;
    L_0x0082:
        r0 = r5.f64998a;
        r0.C(r6);
    L_0x0087:
        r1 = r1.f42956F;
        if (r1 != r2) goto L_0x008d;
    L_0x008b:
        r0 = 1;
        goto L_0x008e;
    L_0x008d:
        r0 = 0;
    L_0x008e:
        X.AnonymousClass5Uc.m27069J(r5, r3, r6, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5Uc.I(X.5Uc, java.lang.String):void");
    }

    /* renamed from: J */
    public static void m27069J(AnonymousClass5Uc anonymousClass5Uc, List list, String str, boolean z) {
        AnonymousClass4X6 anonymousClass4X6 = anonymousClass5Uc.f64974C;
        anonymousClass4X6.f54949C.clear();
        anonymousClass4X6.f54948B.clear();
        anonymousClass4X6.A(list);
        if (anonymousClass5Uc.f64974C.B().isEmpty() && z) {
            AnonymousClass4X6 anonymousClass4X62 = anonymousClass5Uc.f64974C;
            anonymousClass4X62.f54948B.add(AnonymousClass4X5.NO_RESULTS);
        }
        AnonymousClass0rF.B(anonymousClass5Uc.f64974C, -1564013858);
    }

    /* renamed from: K */
    private void m27070K() {
        View view = this.f64986O;
        if (view != null) {
            view.setVisibility(8);
        }
        SearchEditText searchEditText = this.f64988Q;
        if (searchEditText != null) {
            searchEditText.post(new AnonymousClass4XB(this));
            this.f64988Q.setVisibility(0);
        }
    }

    /* renamed from: L */
    private void m27071L() {
        if (!this.f64982K || AnonymousClass1Ba.D(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            this.f64978G.sendEmptyMessageDelayed(1, 15000);
            this.f64978G.sendEmptyMessageDelayed(0, 3000);
            this.f64973B.setDisplayedChild(1);
            this.f64982K = true;
            if (((Boolean) AnonymousClass0CC.ei.H(this.f65000c)).booleanValue()) {
                AnonymousClass0JI.getInstance().requestLocationSignalPackage(Z(), this.f64995X, this.f64992U, "NearbyVenuesFragment");
            } else {
                AnonymousClass0JI.getInstance().requestLocationUpdates(Z(), this.f64994W, this.f64992U, "NearbyVenuesFragment");
            }
            return;
        }
        this.f64978G.sendEmptyMessage(1);
        this.f64996Y = true;
    }

    public final void Lx(String str) {
        this.f64973B.setDisplayedChild(1);
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass4XT anonymousClass4XT = (AnonymousClass4XT) anonymousClass0Pn;
        List arrayList = new ArrayList();
        Collection collection = this.f64975D.KQ(str).f42954D;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        arrayList.addAll(anonymousClass4XT.VN());
        AnonymousClass0NN F = AnonymousClass0NN.B("locations_query_results", this).F("session_id", this.f64990S).F("query", str);
        if (!(arrayList == null || arrayList.isEmpty())) {
            F.I("results_list", AnonymousClass4Wt.B(arrayList));
        }
        F.R();
        if (str.equalsIgnoreCase(this.f64989R)) {
            AnonymousClass5Uc.m27069J(this, arrayList, str, true);
        }
    }

    /* renamed from: b */
    public final void m27072b(AnonymousClass4ru anonymousClass4ru) {
        switch (anonymousClass4ru.ordinal()) {
            case 1:
                AnonymousClass5Uc.m27067H(this);
                return;
            default:
                m27071L();
                return;
        }
    }

    public final boolean onBackPressed() {
        if (!this.f64984M) {
            AnonymousClass0F4.f2058E.B(new AnonymousClass4XP());
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1803419564);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f64989R = bundle.getString("currentSearch");
            this.f64982K = bundle.getBoolean("locationPermissionRequested");
            this.f64981J = (Location) bundle.getParcelable("currentLocation");
            this.f64996Y = bundle.getBoolean("locationUpdatesRequested", false);
        }
        this.f64990S = getArguments().getString("INTENT_EXTRA_SESSION_ID");
        this.f64999b = getArguments().getLong("INTENT_EXTRA_TIMESTAMP");
        this.f64984M = getArguments().getBoolean("INTENT_EXTRA_TRANSPARENT_MODAL_MODE", false);
        this.f65000c = AnonymousClass0Ce.G(getArguments());
        this.f64974C = new AnonymousClass4X6(getContext());
        this.f65001d = new AnonymousClass4XM(this);
        AnonymousClass0F4.f2058E.A(AnonymousClass4XX.class, this.f65001d);
        HandlerThread handlerThread = new HandlerThread("GPSLocationLibraryThread");
        handlerThread.start();
        this.f64993V = new AnonymousClass4XS(this, handlerThread.getLooper());
        this.f64993V.sendEmptyMessage(1);
        AnonymousClass0cQ.G(this, -1600087873, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1406295816);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_nearby_venues, viewGroup, false);
        this.f64980I = (ListView) inflate.findViewById(16908298);
        if (this.f64984M) {
            this.f64980I.setBackgroundColor(-1);
        }
        this.f64980I.setOnItemClickListener(this.f64997Z);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.row_text_padding);
        this.f64980I.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        this.f64980I.setClipToPadding(false);
        this.f64980I.setOnScrollListener(new AnonymousClass4XK(this));
        AnonymousClass3e0 anonymousClass3e0 = new AnonymousClass3e0(this, new AnonymousClass41j());
        this.f64998a = anonymousClass3e0;
        anonymousClass3e0.f42947D = this;
        View inflate2 = layoutInflater.inflate(C0164R.layout.row_search_venue_edit, null);
        SearchEditText searchEditText = (SearchEditText) inflate2.findViewById(C0164R.id.row_search_edit_text);
        this.f64988Q = searchEditText;
        searchEditText.setHint(getResources().getString(C0164R.string.find_a_location));
        this.f64988Q.setOnFilterTextListener(new AnonymousClass4X9(this));
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
        this.f64988Q.setClearButtonColorFilter(B);
        this.f64988Q.getCompoundDrawablesRelative()[0].mutate().setColorFilter(B);
        AnonymousClass0FC.B().IJA(this.f64988Q);
        this.f64987P = (ViewStub) inflate2.findViewById(C0164R.id.placeholder_stub);
        this.f64980I.addHeaderView(inflate2);
        inflate2 = inflate.findViewById(C0164R.id.action_bar_button_back);
        inflate2.setBackground(new AnonymousClass0eU(getActivity().getTheme(), AnonymousClass0eV.MODAL));
        inflate2.setOnClickListener(new AnonymousClass4XL(this));
        ActionButton actionButton = (ActionButton) inflate.findViewById(C0164R.id.action_bar_button_action);
        this.f64973B = actionButton;
        actionButton.setBackgroundResource(AnonymousClass0G5.F(getContext(), C0164R.attr.modalActionBarButtonBackground));
        this.f64973B.setColorFilter(AnonymousClass0ca.B(AnonymousClass0G5.D(getContext(), C0164R.attr.actionBarGlyphColor)));
        this.f64980I.setAdapter(this.f64974C);
        SearchEditText searchEditText2 = this.f64988Q;
        if (searchEditText2 != null) {
            CharSequence charSequence = this.f64989R;
            if (charSequence != null) {
                searchEditText2.setText(charSequence);
            }
        }
        AnonymousClass0cQ.G(this, 935057087, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 247733685);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass4XX.class, this.f65001d);
        this.f64998a.ei();
        AnonymousClass5Uc.m27067H(this);
        if (this.f64977F != null) {
            unregisterLifecycleListener(this.f64977F);
        }
        Handler handler = this.f64993V;
        if (handler != null) {
            ((HandlerThread) handler.getLooper().getThread()).quit();
        }
        AnonymousClass0cQ.G(this, 1323687091, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -783611411);
        super.onDestroyView();
        this.f64998a.gi();
        if (this.f64988Q != null) {
            AnonymousClass0FC.B().qVA(this.f64988Q);
        }
        this.f64980I = null;
        this.f64973B = null;
        this.f64988Q = null;
        this.f64987P = null;
        this.f64986O = null;
        AnonymousClass0cQ.G(this, 770666638, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1485329869);
        super.onPause();
        Dialog dialog = this.f64985N;
        if (dialog != null && dialog.isShowing()) {
            this.f64985N.dismiss();
        }
        AnonymousClass5Uc.m27067H(this);
        if (getView() != null) {
            AnonymousClass0Nm.N(getView());
        }
        getActivity().getWindow().setSoftInputMode(3);
        this.f64973B.setOnClickListener(null);
        this.f64978G.removeCallbacksAndMessages(null);
        AnonymousClass0cQ.G(this, -475167020, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1173944237);
        super.onResume();
        Location C = AnonymousClass5Uc.m27062C(this);
        this.f64981J = C;
        if (C != null) {
            if (!((Boolean) AnonymousClass0CC.ei.H(this.f65000c)).booleanValue() || this.f64983L != null) {
                m27070K();
                if (!this.f64988Q.getText().toString().equals(this.f64989R)) {
                    this.f64988Q.setText(this.f64989R);
                    this.f64988Q.setSelection(this.f64989R.length());
                }
                this.f64973B.setOnClickListener(new AnonymousClass4XN(this));
                if (getActivity() instanceof AnonymousClass22s) {
                    AnonymousClass0OR.D(this.f64978G, new AnonymousClass4XO(this), -132320150);
                }
                if (this.f64996Y) {
                    m27071L();
                }
                AnonymousClass0cQ.G(this, -394353951, F);
            }
        }
        if (this.f64986O == null) {
            this.f64986O = this.f64987P.inflate();
        }
        if (this.f64979H) {
            this.f64986O.setOnClickListener(new AnonymousClass4XA(this));
        }
        this.f64988Q.setVisibility(8);
        ((TextView) this.f64986O.findViewById(C0164R.id.placeholder_text)).getCompoundDrawablesRelative()[0].mutate().setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5)));
        AnonymousClass5Uc.m27061B(this);
        this.f64973B.setOnClickListener(new AnonymousClass4XN(this));
        if (getActivity() instanceof AnonymousClass22s) {
            AnonymousClass0OR.D(this.f64978G, new AnonymousClass4XO(this), -132320150);
        }
        if (this.f64996Y) {
            m27071L();
        }
        AnonymousClass0cQ.G(this, -394353951, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("currentSearch", this.f64989R);
        bundle.putBoolean("locationPermissionRequested", this.f64982K);
        bundle.putParcelable("currentLocation", this.f64981J);
        bundle.putBoolean("locationUpdatesRequested", this.f64996Y);
    }

    public final AnonymousClass0Iu tF(String str) {
        return AnonymousClass4X7.B(this.f65000c, str, null, this.f64981J, this.f64983L, Long.valueOf(this.f64999b));
    }
}
