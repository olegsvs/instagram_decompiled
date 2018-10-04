package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.1YT */
public final class AnonymousClass1YT {
    /* renamed from: B */
    public final Drawable f20012B;
    /* renamed from: C */
    public final AnonymousClass0kP f20013C;
    /* renamed from: D */
    public final GestureDetector f20014D;
    /* renamed from: E */
    public final AnonymousClass0ph f20015E;
    /* renamed from: F */
    public final Drawable f20016F;
    /* renamed from: G */
    public boolean f20017G = ((Boolean) AnonymousClass0CC.nE.m845G()).booleanValue();
    /* renamed from: H */
    public final MediaFrameLayout f20018H;
    /* renamed from: I */
    public final AnonymousClass0P7 f20019I;
    /* renamed from: J */
    public final int f20020J;
    /* renamed from: K */
    public final AnonymousClass0m3 f20021K;
    /* renamed from: L */
    public final int f20022L;

    public AnonymousClass1YT(Context context, AnonymousClass0kP anonymousClass0kP, AnonymousClass0ph anonymousClass0ph, MediaFrameLayout mediaFrameLayout, int i, int i2, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        GestureDetector gestureDetector = new GestureDetector(context, new AnonymousClass1VQ(this));
        this.f20014D = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f20013C = anonymousClass0kP;
        this.f20015E = anonymousClass0ph;
        this.f20018H = mediaFrameLayout;
        this.f20022L = i;
        this.f20020J = i2;
        this.f20019I = anonymousClass0P7;
        this.f20021K = anonymousClass0m3;
        this.f20016F = AnonymousClass0Ca.m939E(context, C0164R.drawable.bg_dark_grey_gradient);
        this.f20012B = AnonymousClass0Ca.m939E(context, C0164R.drawable.bg_grey_gradient);
    }
}
