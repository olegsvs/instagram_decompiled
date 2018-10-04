package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.instagram.debug.log.DLog$NewLogEvent;
import java.lang.reflect.Method;

/* renamed from: X.0co */
public final class AnonymousClass0co implements AnonymousClass0Fl {
    /* renamed from: G */
    public static final String f7248G = "DebugBarController";
    /* renamed from: B */
    public ViewGroup f7249B;
    /* renamed from: C */
    public Method f7250C;
    /* renamed from: D */
    public boolean f7251D;
    /* renamed from: E */
    public final ViewGroup f7252E;
    /* renamed from: F */
    private final AnonymousClass0F8 f7253F = new AnonymousClass0cp(this);

    public final void uc(Activity activity) {
    }

    public final void vc(Activity activity) {
    }

    public AnonymousClass0co(ViewGroup viewGroup, AnonymousClass0IU anonymousClass0IU) {
        this.f7252E = viewGroup;
    }

    public final void wc(Activity activity) {
        if (this.f7251D) {
            AnonymousClass0F4.f2058E.m1507D(DLog$NewLogEvent.class, this.f7253F);
        }
    }

    public final void zc(Activity activity) {
        if (this.f7251D) {
            AnonymousClass0F4.f2058E.m1504A(DLog$NewLogEvent.class, this.f7253F);
        }
    }
}
