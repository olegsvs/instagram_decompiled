package X;

import android.os.Bundle;
import android.util.Pair;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4yq */
public final class AnonymousClass4yq extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5Yz f59054B;
    /* renamed from: C */
    public List f59055C;

    public final String getModuleName() {
        return "location_page_info_page_report_fragment";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.n(true);
        anonymousClass0eT.Z(C0164R.string.report_location);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1138602116);
        super.onCreate(bundle);
        boolean z = getArguments().getBoolean("show_linked_business_report_options");
        this.f59055C = Arrays.asList(new Pair[]{new Pair(Integer.valueOf(C0164R.string.report_location_inaccurate_info), "INACCURATE_INFO"), new Pair(Integer.valueOf(C0164R.string.report_location_not_like_it), "DISLIKE"), new Pair(Integer.valueOf(C0164R.string.report_location_harassing), "HARASSING"), new Pair(Integer.valueOf(C0164R.string.report_location_should_not_on_ig), "SHOULD_NOT_BE_ON_IG"), new Pair(Integer.valueOf(C0164R.string.report_location_scam), "SCAM"), new Pair(Integer.valueOf(C0164R.string.report_location_intellectual_property), "IP")});
        if (z) {
            List arrayList = new ArrayList(this.f59055C);
            this.f59055C = arrayList;
            arrayList.addAll(Arrays.asList(new Pair[]{new Pair(Integer.valueOf(C0164R.string.report_business_reason_too_far), "TOO_FAR"), new Pair(Integer.valueOf(C0164R.string.report_business_reason_spam), "SPAM"), new Pair(Integer.valueOf(C0164R.string.report_business_wrong_claim), "WRONG_CLAIM")}));
        }
        Collection arrayList2 = new ArrayList();
        AnonymousClass2If anonymousClass2If = new AnonymousClass2If(C0164R.string.report_business_choose_reason);
        anonymousClass2If.f28721C = false;
        arrayList2.add(anonymousClass2If);
        for (Pair pair : this.f59055C) {
            arrayList2.add(new AnonymousClass2bo(((Integer) pair.first).intValue(), new AnonymousClass4yp(this, pair)));
        }
        setItems(arrayList2);
        AnonymousClass0cQ.G(this, 351360826, F);
    }
}
