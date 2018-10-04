package X;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;

/* renamed from: X.1WJ */
public final class AnonymousClass1WJ extends AnonymousClass0Gv {
    /* renamed from: B */
    public final /* synthetic */ String f19479B;
    /* renamed from: C */
    public final /* synthetic */ int f19480C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3bC f19481D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0MI f19482E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0Qf f19483F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0ot f19484G;

    public AnonymousClass1WJ(int i, AnonymousClass3bC anonymousClass3bC, AnonymousClass0MI anonymousClass0MI, AnonymousClass0ot anonymousClass0ot, String str, AnonymousClass0Qf anonymousClass0Qf) {
        this.f19480C = i;
        this.f19481D = anonymousClass3bC;
        this.f19482E = anonymousClass0MI;
        this.f19484G = anonymousClass0ot;
        this.f19479B = str;
        this.f19483F = anonymousClass0Qf;
    }

    /* renamed from: B */
    public final void mo1902B(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        AnonymousClass10H anonymousClass10H = (AnonymousClass10H) recyclerView.m6978a(this.f19480C);
        if (anonymousClass10H != null) {
            Rect rect = new Rect();
            recyclerView.getDrawingRect(rect);
            float x = anonymousClass10H.VQ().getX();
            if (((float) rect.left) <= x && ((float) rect.right) >= x + ((float) anonymousClass10H.VQ().getWidth())) {
                recyclerView.BA(this);
                this.f19481D.Vp(this.f19482E, this.f19480C, this.f19484G.f10423E, this.f19479B, recyclerView2, this.f19483F);
            }
        }
    }
}
