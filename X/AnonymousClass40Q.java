package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.WeakReference;

/* renamed from: X.40Q */
public final class AnonymousClass40Q {
    /* renamed from: B */
    public WeakReference f48213B;
    /* renamed from: C */
    public RelativeLayout f48214C;
    /* renamed from: D */
    public AnonymousClass0m3 f48215D;
    /* renamed from: E */
    public final Handler f48216E = new AnonymousClass3OJ(this, Looper.getMainLooper());
    /* renamed from: F */
    public SlideInAndOutIconView f48217F;
    /* renamed from: G */
    public final AnonymousClass0vN f48218G = new AnonymousClass0vN();
    /* renamed from: H */
    public TextView f48219H;
    /* renamed from: I */
    public final ViewStub f48220I;

    public AnonymousClass40Q(ViewStub viewStub) {
        this.f48220I = viewStub;
    }

    /* renamed from: A */
    public final void m22010A() {
        RelativeLayout relativeLayout = this.f48214C;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* renamed from: B */
    public final void m22011B(AnonymousClass0m3 anonymousClass0m3) {
        if (this.f48217F != null) {
            this.f48216E.removeMessages(0);
            this.f48216E.removeMessages(1);
            AnonymousClass3OO anonymousClass3OO = anonymousClass0m3.IB;
            if (anonymousClass3OO == AnonymousClass3OO.EXPANDING) {
                this.f48218G.A(null);
                anonymousClass0m3.IB = AnonymousClass3OO.ANIMATED;
            } else if (anonymousClass3OO == AnonymousClass3OO.PENDING) {
                anonymousClass0m3.IB = AnonymousClass3OO.NOT_ANIMATED;
            }
        }
    }
}
