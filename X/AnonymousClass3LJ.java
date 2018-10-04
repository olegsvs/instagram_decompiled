package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3LJ */
public final class AnonymousClass3LJ {
    /* renamed from: B */
    public final Drawable f40290B;
    /* renamed from: C */
    public final AnonymousClass0kQ f40291C;
    /* renamed from: D */
    public final GestureDetector f40292D;
    /* renamed from: E */
    public final AnonymousClass0ph f40293E;
    /* renamed from: F */
    public final Drawable f40294F;
    /* renamed from: G */
    public final AnonymousClass0P7 f40295G;
    /* renamed from: H */
    public final AnonymousClass0m3 f40296H;
    /* renamed from: I */
    private final IgProgressImageView[] f40297I;

    public AnonymousClass3LJ(Context context, AnonymousClass0kQ anonymousClass0kQ, AnonymousClass0ph anonymousClass0ph, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, IgProgressImageView[] igProgressImageViewArr) {
        GestureDetector gestureDetector = new GestureDetector(context, new AnonymousClass1VR(this));
        this.f40292D = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f40291C = anonymousClass0kQ;
        this.f40293E = anonymousClass0ph;
        this.f40295G = anonymousClass0P7;
        this.f40296H = anonymousClass0m3;
        this.f40297I = igProgressImageViewArr;
        this.f40294F = AnonymousClass0Ca.E(context, C0164R.drawable.bg_dark_grey_gradient);
        this.f40290B = AnonymousClass0Ca.E(context, C0164R.drawable.bg_grey_gradient);
    }

    /* renamed from: B */
    public static int m19436B(AnonymousClass3LJ anonymousClass3LJ, int i, int i2) {
        Rect rect = new Rect();
        int i3 = 0;
        while (true) {
            IgProgressImageView[] igProgressImageViewArr = anonymousClass3LJ.f40297I;
            if (i3 >= igProgressImageViewArr.length) {
                return 0;
            }
            View view = (View) igProgressImageViewArr[i3].getParent();
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (rect.contains(i, i2)) {
                return i3;
            }
            i3++;
        }
    }
}
