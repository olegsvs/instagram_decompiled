package X;

import android.widget.Adapter;

/* renamed from: X.0wl */
public final class AnonymousClass0wl implements AnonymousClass0wm {
    /* renamed from: B */
    private final Adapter f12333B;

    public AnonymousClass0wl(Adapter adapter) {
        this.f12333B = adapter;
    }

    public final Object UT(int i) {
        return this.f12333B.getItem(i);
    }

    public final Class VT(Object obj) {
        if (obj instanceof AnonymousClass0qv) {
            return AnonymousClass0qv.class;
        }
        return obj.getClass();
    }
}
