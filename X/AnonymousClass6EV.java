package X;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.6EV */
public final class AnonymousClass6EV extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: E */
    public static final String f73190E = "QuickPromotionDebugItemFragment";
    /* renamed from: B */
    public AnonymousClass5r2 f73191B;
    /* renamed from: C */
    public AnonymousClass5qx f73192C;
    /* renamed from: D */
    public AnonymousClass0Cm f73193D;

    public final String getModuleName() {
        return "quick_promotion_item";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.n(true);
        AnonymousClass5qx anonymousClass5qx = this.f73192C;
        String name = anonymousClass5qx != null ? anonymousClass5qx.f69374D.name() : "Slot";
        anonymousClass0eT.a(getString(C0164R.string.dev_qp_slot_details_title, new Object[]{name}));
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 280954916);
        super.onCreate(bundle);
        this.f73193D = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0cQ.G(this, 378528926, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1044080801);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C0164R.layout.quick_promotion_slot_details_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0164R.id.qp_slot_details_rv);
        AnonymousClass5qx anonymousClass5qx = this.f73192C;
        List arrayList = new ArrayList();
        Map map = anonymousClass5qx.f69373C;
        Map map2 = anonymousClass5qx.f69372B;
        for (Entry entry : map.entrySet()) {
            List<AnonymousClass19A> list = (List) entry.getValue();
            AnonymousClass0o2 anonymousClass0o2 = (AnonymousClass0o2) entry.getKey();
            if (!(list == null || list.isEmpty())) {
                for (AnonymousClass19A anonymousClass19A : list) {
                    arrayList.add(new AnonymousClass5qp(anonymousClass19A, (Set) map2.get(anonymousClass19A), anonymousClass0o2));
                }
            }
        }
        this.f73191B = new AnonymousClass5r2(arrayList, this);
        recyclerView.setLayoutManager(new AnonymousClass0rr(getContext()));
        recyclerView.A(new AnonymousClass1o7(getContext(), 1));
        recyclerView.setAdapter(this.f73191B);
        schedule(new AnonymousClass5qq(this));
        AnonymousClass0cQ.G(this, 533966296, F);
        return inflate;
    }
}
