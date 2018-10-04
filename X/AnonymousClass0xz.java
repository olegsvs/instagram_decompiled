package X;

import android.view.View;
import android.widget.ListView;
import com.facebook.C0164R;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0xz */
public final class AnonymousClass0xz extends AnonymousClass0VA implements AnonymousClass0kY {
    /* renamed from: B */
    public final boolean f12696B;
    /* renamed from: C */
    public final boolean f12697C;
    /* renamed from: D */
    public final AnonymousClass1YJ f12698D;
    /* renamed from: E */
    public final AnonymousClass0y1 f12699E;
    /* renamed from: F */
    public final AnonymousClass0y3 f12700F;
    /* renamed from: G */
    private final AnonymousClass0vy f12701G;
    /* renamed from: H */
    private final AnonymousClass0Ie f12702H;

    public AnonymousClass0xz(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0vy anonymousClass0vy, AnonymousClass0y0 anonymousClass0y0, AnonymousClass0y1 anonymousClass0y1, AnonymousClass0y3 anonymousClass0y3) {
        boolean z;
        this.f12702H = anonymousClass0Ie;
        this.f12701G = anonymousClass0vy;
        this.f12698D = anonymousClass0y0.f12703B;
        this.f12699E = anonymousClass0y1;
        if (!AnonymousClass0ku.m7222B()) {
            if (!AnonymousClass0ku.m7223C()) {
                z = false;
                this.f12696B = z;
                this.f12697C = AnonymousClass3MV.B();
                this.f12700F = anonymousClass0y3;
            }
        }
        z = true;
        this.f12696B = z;
        this.f12697C = AnonymousClass3MV.B();
        this.f12700F = anonymousClass0y3;
    }

    public final void St() {
        this.f12698D.f19982B.m3210C();
        AnonymousClass0y3 anonymousClass0y3 = this.f12700F;
        if (anonymousClass0y3 != null) {
            anonymousClass0y3.f12711D.A();
        }
    }

    public final void wh(View view) {
        AnonymousClass0IL anonymousClass0IL = this.f12702H;
        AnonymousClass1cg anonymousClass1cf = new AnonymousClass1cf((StickyHeaderListView) view.findViewById(C0164R.id.sticky_header_list), (ListView) view.findViewById(16908298));
        AnonymousClass1YI anonymousClass1YI = new AnonymousClass1YI(this.f12701G);
        List arrayList = new ArrayList();
        if (this.f12696B) {
            arrayList.add(new AnonymousClass1VA(0, this.f12698D));
            arrayList.add(new AnonymousClass1ck(1, this.f12698D));
            arrayList.add(new AnonymousClass3MU(2, this.f12698D, new AnonymousClass1bU(0.5f), 1000));
            arrayList.add(new AnonymousClass1co(3, this.f12698D, new AnonymousClass1bU(0.5f), 1000, AnonymousClass1cp.f20664B));
            arrayList.add(new AnonymousClass1cq(4, new AnonymousClass1bU(0.5f), new AnonymousClass1cr(), 500));
            arrayList.add(new AnonymousClass1bM(5, new AnonymousClass1bU(0.5f), 500));
        }
        AnonymousClass0y1 anonymousClass0y1 = this.f12699E;
        if (anonymousClass0y1 != null) {
            arrayList.add(new AnonymousClass1cs(6, anonymousClass0y1));
            arrayList.add(new AnonymousClass1ct(7, this.f12699E));
        }
        if (this.f12697C) {
            AnonymousClass0y3 anonymousClass0y3 = this.f12700F;
            if (anonymousClass0y3 != null) {
                arrayList.add(new AnonymousClass1cu(anonymousClass0y3, 8, ((Boolean) AnonymousClass0CC.Ym.m845G()).booleanValue()));
                arrayList.add(new AnonymousClass1cv(this.f12700F, 9));
            }
        }
        AnonymousClass1by.m12028B(anonymousClass0IL, anonymousClass1cf, anonymousClass1YI, (AnonymousClass1ci[]) arrayList.toArray(new AnonymousClass1ci[arrayList.size()]));
    }
}
