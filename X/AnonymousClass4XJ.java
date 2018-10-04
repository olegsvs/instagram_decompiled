package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.4XJ */
public final class AnonymousClass4XJ implements OnItemClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Uc f54963B;

    public AnonymousClass4XJ(AnonymousClass5Uc anonymousClass5Uc) {
        this.f54963B = anonymousClass5Uc;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f54963B.f64980I != null) {
            int headerViewsCount = i - this.f54963B.f64980I.getHeaderViewsCount();
            if (headerViewsCount < 0) {
                return;
            }
            if (headerViewsCount < this.f54963B.f64974C.getCount()) {
                if (this.f54963B.f64974C.getItemViewType(headerViewsCount) == 0) {
                    Venue venue = (Venue) this.f54963B.f64974C.getItem(headerViewsCount);
                    if (venue != null) {
                        AnonymousClass0EE anonymousClass0EE = this.f54963B;
                        String str = anonymousClass0EE.f64990S;
                        String str2 = venue.f6706C;
                        List B = this.f54963B.f64974C.m24426B();
                        AnonymousClass0NN B2 = AnonymousClass0NN.B("locations_result_tapped", anonymousClass0EE).F("session_id", str).F("selected_id", str2).B("selected_position", headerViewsCount);
                        if (!TextUtils.isEmpty(null)) {
                            B2.F(TraceFieldType.RequestID, null);
                        }
                        if (!(B == null || B.isEmpty())) {
                            B2.I("results_list", AnonymousClass4Wt.m24420B(B));
                        }
                        B2.R();
                        AnonymousClass5Uc anonymousClass5Uc = this.f54963B;
                        AnonymousClass5Uc.E(anonymousClass5Uc, venue, anonymousClass5Uc.f64981J, i);
                        AnonymousClass0F6 anonymousClass4XW = new AnonymousClass4XW(venue, this.f54963B.f64976E);
                        if (this.f54963B.f64984M) {
                            Intent intent = new Intent("NearbyVenuesFragment.VENUE_SELECTED");
                            intent.putExtra("venueId", venue);
                            intent.putExtra("facebookRequestId", this.f54963B.f64976E);
                            this.f54963B.getActivity().setResult(-1, intent);
                            this.f54963B.getActivity().finish();
                            return;
                        }
                        AnonymousClass0F4.f2058E.B(anonymousClass4XW);
                    }
                }
            }
        }
    }
}
