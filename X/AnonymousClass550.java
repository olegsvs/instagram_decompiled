package X;

import android.text.TextUtils;
import android.view.View;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.550 */
public final class AnonymousClass550 extends AnonymousClass0t7 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59931B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1Ov f59932C;
    /* renamed from: D */
    public final /* synthetic */ int f59933D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Oq f59934E;

    public AnonymousClass550(boolean z, int i, AnonymousClass1Ov anonymousClass1Ov, AnonymousClass1Oq anonymousClass1Oq, AnonymousClass1LU anonymousClass1LU, int i2) {
        this.f59932C = anonymousClass1Ov;
        this.f59934E = anonymousClass1Oq;
        this.f59931B = anonymousClass1LU;
        this.f59933D = i2;
        super(z, i);
    }

    public final void onClick(View view) {
        String str = this.f59932C.f18077C;
        Object G = AnonymousClass554.m25673G(this.f59934E.U(), this.f59932C.f18078D + 1, this.f59932C.f18076B);
        if (!TextUtils.isEmpty(G)) {
            this.f59931B.km(this.f59934E, new Hashtag(str, G), this.f59933D);
        }
    }
}
