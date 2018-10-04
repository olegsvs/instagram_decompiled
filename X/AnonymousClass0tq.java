package X;

import android.content.Context;
import android.widget.Adapter;

/* renamed from: X.0tq */
public final class AnonymousClass0tq extends AnonymousClass0tr {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0jP f11760B;
    /* renamed from: C */
    public final /* synthetic */ Context f11761C;

    public AnonymousClass0tq(AnonymousClass0jP anonymousClass0jP, int i, Context context) {
        this.f11760B = anonymousClass0jP;
        this.f11761C = context;
        super(i);
    }

    /* renamed from: A */
    public final void mo1910A(Adapter adapter, int i) {
        Object item = adapter.getItem(i);
        if (item instanceof AnonymousClass0P7) {
            AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) item;
            if (anonymousClass0P7.eA() && this.f11760B.f9139B != null) {
                this.f11760B.f9139B.m8191C(anonymousClass0P7.m3794x(this.f11761C));
            }
        }
    }
}
