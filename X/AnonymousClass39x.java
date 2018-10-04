package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.39x */
public final class AnonymousClass39x implements AnonymousClass0yy {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass44c f38488B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass39y f38489C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass45k f38490D;
    /* renamed from: E */
    public final /* synthetic */ float f38491E;
    /* renamed from: F */
    public final /* synthetic */ float f38492F;

    public AnonymousClass39x(AnonymousClass39y anonymousClass39y, float f, float f2, AnonymousClass44c anonymousClass44c, AnonymousClass45k anonymousClass45k) {
        this.f38489C = anonymousClass39y;
        this.f38492F = f;
        this.f38491E = f2;
        this.f38488B = anonymousClass44c;
        this.f38490D = anonymousClass45k;
    }

    public final void kp(Bitmap bitmap) {
        Drawable drawable = this.f38489C.f38493B.getIgImageView().getDrawable();
        if ((((float) drawable.getIntrinsicWidth()) * this.f38491E > this.f38492F * ((float) drawable.getIntrinsicHeight()) ? 1 : null) != null) {
            this.f38489C.f38494C.setAspectRatio(this.f38492F / this.f38491E);
            AnonymousClass44c anonymousClass44c = this.f38488B;
            IgProgressImageView igProgressImageView = this.f38489C.f38493B;
            AnonymousClass3we anonymousClass3we = anonymousClass44c.f49474Z;
            IgImageView igImageView = igProgressImageView.getIgImageView();
            anonymousClass3we.f47196B.put(igImageView.getUrl(), igImageView);
            igImageView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2zM(anonymousClass3we, igImageView));
            anonymousClass3we.f47199E.m21643A(anonymousClass3we);
            this.f38489C.f38493B.setScaleType(ScaleType.MATRIX);
            MediaFrameLayout mediaFrameLayout = this.f38489C.f38494C;
            LayoutParams layoutParams = mediaFrameLayout.getLayoutParams();
            layoutParams.height = -1;
            mediaFrameLayout.setLayoutParams(layoutParams);
            return;
        }
        this.f38489C.f38494C.setAspectRatio(this.f38490D.f50000B.A());
        this.f38489C.f38493B.setScaleType(ScaleType.FIT_XY);
    }
}
