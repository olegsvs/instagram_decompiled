package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.40B */
public final class AnonymousClass40B implements AnonymousClass3OD {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Cg f48181B;
    /* renamed from: C */
    public final /* synthetic */ boolean f48182C;

    public AnonymousClass40B(AnonymousClass1Cg anonymousClass1Cg, boolean z) {
        this.f48181B = anonymousClass1Cg;
        this.f48182C = z;
    }

    public final void Pg(AnonymousClass0P7 anonymousClass0P7) {
        if (this.f48182C) {
            Toast.makeText(this.f48181B.f15554B, C0164R.string.product_tagging_carousel_editing_not_available, 1).show();
        }
    }
}
