package X;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.facebook.C0164R;

/* renamed from: X.60y */
public final class AnonymousClass60y extends AnonymousClass0Ie implements AnonymousClass0IT, AnonymousClass3eF {
    /* renamed from: B */
    public AnonymousClass60s f70906B;
    /* renamed from: C */
    public final Handler f70907C = new AnonymousClass60u(this);
    /* renamed from: D */
    public final AnonymousClass1DP f70908D = new AnonymousClass60v(this);
    /* renamed from: E */
    private AnonymousClass5Ef f70909E;
    /* renamed from: F */
    private AnonymousClass5Es f70910F;
    /* renamed from: G */
    private AnonymousClass0Cm f70911G;

    public final String getModuleName() {
        return "search_places";
    }

    public final boolean kt(AnonymousClass1Ak anonymousClass1Ak) {
        return false;
    }

    /* renamed from: B */
    public static void m28769B(AnonymousClass60y anonymousClass60y, Location location) {
        AnonymousClass0GA B = AnonymousClass3df.B(anonymousClass60y.f70911G, null, location, false);
        B.f2849B = new AnonymousClass60x(anonymousClass60y);
        anonymousClass60y.schedule(B);
    }

    /* renamed from: C */
    public static void m28770C(AnonymousClass60y anonymousClass60y) {
        AnonymousClass0JI.getInstance().removeLocationUpdates(anonymousClass60y.f70908D);
        anonymousClass60y.f70907C.removeMessages(0);
        AnonymousClass2IF.B(false, anonymousClass60y.getView());
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.nearby_places);
        anonymousClass0eT.n(true);
    }

    public final void jt(AnonymousClass1Ak anonymousClass1Ak, int i) {
        String string = getArguments().getString("query_text");
        String string2 = getArguments().getString("rank_token");
        AnonymousClass5Ef anonymousClass5Ef = this.f70909E;
        AnonymousClass1KN anonymousClass1KN = AnonymousClass1KN.PLACE;
        AnonymousClass1Ak anonymousClass1Ak2 = anonymousClass1Ak;
        int i2 = i;
        anonymousClass5Ef.m26038A(string2, string, anonymousClass1KN, anonymousClass1KN.toString(), anonymousClass1Ak2.A(), i2, this.f70906B.m28768F()).R();
        AnonymousClass0NN.B("place_picker_clicked", this).F("selected_id", anonymousClass1Ak2.A()).B("selected_position", i2).G("results_list", this.f70906B.m28768F()).R();
        AnonymousClass3di.f42918B.A(anonymousClass1Ak2);
        this.f70910F.m26056B(getActivity(), anonymousClass1Ak2, string, string2, i2, true, this);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -867583405);
        super.onCreate(bundle);
        this.f70911G = AnonymousClass0Ce.G(getArguments());
        Bundle arguments = getArguments();
        AnonymousClass5Ew anonymousClass5Ew = new AnonymousClass5Ew((String) AnonymousClass0LH.E(arguments.getString("initialization_id")), (String) AnonymousClass0LH.E(arguments.getString("search_session_id")), (AnonymousClass0Cm) AnonymousClass0LH.E(AnonymousClass0Ce.G(arguments)));
        this.f70909E = new AnonymousClass5Ef(this, anonymousClass5Ew);
        this.f70910F = new AnonymousClass5Es(anonymousClass5Ew);
        ListAdapter anonymousClass60s = new AnonymousClass60s(getContext(), this);
        this.f70906B = anonymousClass60s;
        setListAdapter(anonymousClass60s);
        AnonymousClass0cQ.G(this, 250884969, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 696279923);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_progress, viewGroup, false);
        AnonymousClass0cQ.G(this, 2061105112, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1159762391);
        super.onPause();
        AnonymousClass60y.m28770C(this);
        AnonymousClass0cQ.G(this, 502577460, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1988915102);
        super.onResume();
        if ((this.f70906B.f70895E.isEmpty() ^ 1) == 0) {
            boolean isLocationEnabled = AnonymousClass0JI.isLocationEnabled(getContext());
            boolean isLocationPermitted = AnonymousClass0JI.isLocationPermitted(getContext());
            AnonymousClass60s anonymousClass60s = this.f70906B;
            AnonymousClass5EY anonymousClass5EY = anonymousClass60s.f70894D;
            anonymousClass5EY.f61487B = isLocationEnabled;
            anonymousClass5EY.f61488C = isLocationPermitted;
            AnonymousClass60s.m28767B(anonymousClass60s);
            if (isLocationEnabled && isLocationPermitted) {
                Location lastLocation = AnonymousClass0JI.getInstance().getLastLocation();
                if (lastLocation == null || !AnonymousClass0JI.getInstance().isLocationValid(lastLocation)) {
                    this.f70907C.removeMessages(0);
                    this.f70907C.sendEmptyMessageDelayed(0, 10000);
                    AnonymousClass0JI.getInstance().requestLocationUpdates(getRootActivity(), this.f70908D, new AnonymousClass60w(this), "NearbyPlacesFragment");
                    AnonymousClass2IF.B(true, getView());
                } else {
                    AnonymousClass60y.m28769B(this, lastLocation);
                }
            }
        }
        AnonymousClass0cQ.G(this, -1926677022, F);
    }
}
