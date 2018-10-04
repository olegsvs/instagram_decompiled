package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.feed.ui.text.BulletAwareTextView;
import com.instagram.feed.ui.text.IgLikeTextView;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.0pz */
public final class AnonymousClass0pz implements AnonymousClass0je {
    /* renamed from: B */
    public BulletAwareTextView f10810B;
    /* renamed from: C */
    public ViewStub f10811C;
    /* renamed from: D */
    public View f10812D;
    /* renamed from: E */
    public ViewStub f10813E;
    /* renamed from: F */
    public BulletAwareTextView f10814F;
    /* renamed from: G */
    public IgTextLayoutView f10815G;
    /* renamed from: H */
    public ViewStub f10816H;
    /* renamed from: I */
    public ImageView f10817I;
    /* renamed from: J */
    public ViewStub f10818J;
    /* renamed from: K */
    public IgLikeTextView f10819K;
    /* renamed from: L */
    public AnonymousClass0P7 f10820L;
    /* renamed from: M */
    public AnonymousClass0m3 f10821M;
    /* renamed from: N */
    public ViewStub f10822N;
    /* renamed from: O */
    public TextView f10823O;
    /* renamed from: P */
    private final Context f10824P;
    /* renamed from: Q */
    private final AnonymousClass0jM f10825Q;
    /* renamed from: R */
    private final AnonymousClass0rG f10826R;

    public AnonymousClass0pz(Context context, AnonymousClass0jM anonymousClass0jM, AnonymousClass0rG anonymousClass0rG) {
        this.f10824P = context;
        this.f10825Q = anonymousClass0jM;
        this.f10826R = anonymousClass0rG;
    }

    /* renamed from: A */
    public final BulletAwareTextView m7892A() {
        if (this.f10810B == null) {
            this.f10810B = (BulletAwareTextView) this.f10811C.inflate();
        }
        return this.f10810B;
    }

    /* renamed from: B */
    public static TextView m7890B(AnonymousClass0pz anonymousClass0pz) {
        if (anonymousClass0pz.f10814F == null) {
            anonymousClass0pz.f10814F = (BulletAwareTextView) anonymousClass0pz.f10813E.inflate();
        }
        return anonymousClass0pz.f10814F;
    }

    /* renamed from: B */
    public final IgTextLayoutView m7893B() {
        if (this.f10815G == null) {
            this.f10815G = (IgTextLayoutView) this.f10816H.inflate();
        }
        return this.f10815G;
    }

    /* renamed from: C */
    public static TextView m7891C(AnonymousClass0pz anonymousClass0pz) {
        if (anonymousClass0pz.f10823O == null) {
            anonymousClass0pz.f10823O = (TextView) anonymousClass0pz.f10822N.inflate();
        }
        return anonymousClass0pz.f10823O;
    }

    public final void cr(AnonymousClass0m3 anonymousClass0m3, int i) {
        if (i == 4) {
            AnonymousClass0pa.m7871C(this, this.f10820L, anonymousClass0m3.f9672G, this.f10825Q);
        } else if (i == 13) {
            this.f10825Q.m7101H(this.f10820L);
            AnonymousClass0pa.m7872D(this.f10819K, this.f10820L, this.f10825Q);
            AnonymousClass0rG anonymousClass0rG = this.f10826R;
            if (anonymousClass0rG != null) {
                anonymousClass0rG.m7950A(this.f10820L);
                AnonymousClass0pa.m7873E(this.f10824P, this.f10819K, this.f10820L, this.f10826R);
            }
        }
    }
}
