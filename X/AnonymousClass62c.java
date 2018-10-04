package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.62c */
public final class AnonymousClass62c extends AnonymousClass0nJ {
    /* renamed from: B */
    public final Context f71214B;
    /* renamed from: C */
    public final AnonymousClass6Ha f71215C;
    /* renamed from: D */
    public boolean[] f71216D;
    /* renamed from: E */
    public int f71217E;
    /* renamed from: F */
    public String[] f71218F;
    /* renamed from: G */
    public final int f71219G;

    public AnonymousClass62c(Context context, AnonymousClass6Ha anonymousClass6Ha, AnonymousClass3g3 anonymousClass3g3) {
        this.f71214B = context;
        this.f71215C = anonymousClass6Ha;
        AnonymousClass0LH.E(anonymousClass3g3.f43233B);
        this.f71218F = anonymousClass3g3.f43233B;
        this.f71216D = anonymousClass3g3.f43234C;
        this.f71219G = anonymousClass3g3.f43238G;
        this.f71217E = anonymousClass3g3.f43236E;
    }

    /* renamed from: B */
    public final int m28814B() {
        return this.f71218F.length;
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m28815I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass62b anonymousClass62b = (AnonymousClass62b) anonymousClass0oo;
        int i2 = 0;
        Object obj = this.f71217E == i ? 1 : null;
        anonymousClass62b.f71213E.setUrl(this.f71218F[i]);
        anonymousClass62b.f71211C.setVisibility(obj != null ? 0 : 8);
        View view = anonymousClass62b.f71212D;
        if (this.f71216D[i]) {
            i2 = 8;
        }
        view.setVisibility(i2);
        anonymousClass62b.f71210B.setOnClickListener(new AnonymousClass62a(this, i));
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m28816J(ViewGroup viewGroup, int i) {
        return new AnonymousClass62b(LayoutInflater.from(this.f71214B).inflate(C0164R.layout.thumbnail_image_selector_item, viewGroup, false));
    }
}
