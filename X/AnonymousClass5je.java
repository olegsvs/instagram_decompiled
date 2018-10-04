package X;

import android.os.Bundle;
import android.util.Pair;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5je */
public final class AnonymousClass5je extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: B */
    public List f68605B;

    public final String getModuleName() {
        return "report_related_business";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.n(true);
        anonymousClass0eT.Z(C0164R.string.report_business);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1451001701);
        this.f68605B = Arrays.asList(new Pair[]{new Pair(Integer.valueOf(C0164R.string.report_location_inaccurate_info), "INACCURATE"), new Pair(Integer.valueOf(C0164R.string.report_business_reason_spam), "SPAM"), new Pair(Integer.valueOf(C0164R.string.report_location_harassing), "HARASSING"), new Pair(Integer.valueOf(C0164R.string.report_business_not_on_ig), "SHOULD_NOT_BE_ON_IG")});
        super.onCreate(bundle);
        AnonymousClass0cQ.G(this, -651262745, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -257607836);
        super.onResume();
        Collection arrayList = new ArrayList();
        AnonymousClass2If anonymousClass2If = new AnonymousClass2If(C0164R.string.report_business_choose_reason);
        anonymousClass2If.f28721C = false;
        arrayList.add(anonymousClass2If);
        for (Pair pair : this.f68605B) {
            arrayList.add(new AnonymousClass2bo(((Integer) pair.first).intValue(), new AnonymousClass5jd(this, pair)));
        }
        setItems(arrayList);
        AnonymousClass0cQ.G(this, 162685459, F);
    }
}
