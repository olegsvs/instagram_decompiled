package X;

import android.view.View;

/* renamed from: X.16Z */
public final class AnonymousClass16Z extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass10O f14558B;

    public AnonymousClass16Z(AnonymousClass10O anonymousClass10O) {
        this.f14558B = anonymousClass10O;
    }

    public final void Xq(View view) {
        if (this.f14558B.tO() != null && this.f14558B.XQ() != null) {
            this.f14558B.tO().uv(this.f14558B.XQ());
        }
    }

    public final boolean yCA(View view) {
        if (this.f14558B.tO() == null || this.f14558B.XQ() == null) {
            return false;
        }
        this.f14558B.tO().Dw(this.f14558B.XQ());
        return true;
    }
}
