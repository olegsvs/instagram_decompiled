package X;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewStub;
import android.widget.ImageView.ScaleType;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.0ji */
public final class AnonymousClass0ji extends AnonymousClass0VA implements AnonymousClass0jj {
    /* renamed from: B */
    private final AnonymousClass0IL f9243B;
    /* renamed from: C */
    private final AnonymousClass0Hw f9244C;
    /* renamed from: D */
    private final int f9245D;
    /* renamed from: E */
    private final AnonymousClass0vx f9246E = new AnonymousClass0vx();
    /* renamed from: F */
    private IgImageView f9247F;
    /* renamed from: G */
    private ViewStub f9248G;

    public AnonymousClass0ji(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Hw anonymousClass0Hw) {
        this.f9243B = anonymousClass0IL;
        this.f9244C = anonymousClass0Hw;
        this.f9245D = this.f9243B.getResources().getDimensionPixelSize(C0164R.dimen.save_popout_margin_bottom);
    }

    /* renamed from: B */
    private void m7153B() {
        if (this.f9243B.getView() != null) {
            int width = this.f9243B.getView().getWidth();
            int height = this.f9243B.getView().getHeight();
            int measuredWidth = this.f9247F.getMeasuredWidth();
            int measuredHeight = this.f9247F.getMeasuredHeight();
            this.f9247F.setX((float) ((width - (((width / 5) - measuredWidth) / 2)) - measuredWidth));
            this.f9247F.setY((float) ((height - measuredHeight) - this.f9245D));
            this.f9247F.setScaleX(0.0f);
            this.f9247F.setScaleY(0.0f);
        }
    }

    public final void St() {
        if (this.f9247F != null) {
            m7153B();
        }
        this.f9246E.m8379B(null);
        this.f9246E.f12179C.clear();
    }

    public final void Wd(float f, boolean z) {
        IgImageView igImageView = this.f9247F;
        if (igImageView != null) {
            if (z) {
                igImageView.setScaleX(f);
                this.f9247F.setScaleY(f);
                return;
            }
            float f2 = (f / 2.0f) + 0.5f;
            igImageView.setScaleX(f2);
            this.f9247F.setScaleY(f2);
            int width = this.f9245D + this.f9247F.getWidth();
            IgImageView igImageView2 = this.f9247F;
            igImageView2.setY(igImageView2.getY() + ((1.0f - f) * ((float) width)));
        }
    }

    public final void gi() {
        this.f9247F = null;
    }

    public final void gx() {
        this.f9246E.m8379B(this);
        AnonymousClass0vx anonymousClass0vx = this.f9246E;
        anonymousClass0vx.f12179C.add(this.f9244C);
        if (!anonymousClass0vx.f12178B.m5762G()) {
            anonymousClass0vx.FBA(anonymousClass0vx.f12178B);
        }
    }

    public final void qUA(AnonymousClass0P7 anonymousClass0P7, Context context) {
        if (!anonymousClass0P7.vA()) {
            if (this.f9247F == null) {
                IgImageView igImageView = (IgImageView) this.f9248G.inflate();
                this.f9247F = igImageView;
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(igImageView.getResources().getDimensionPixelSize(C0164R.dimen.save_popout_size), 1073741824);
                this.f9247F.measure(makeMeasureSpec, makeMeasureSpec);
                this.f9247F.setScaleType(ScaleType.CENTER_CROP);
            }
            m7153B();
            this.f9247F.setUrl(anonymousClass0P7.m3794x(context));
            AnonymousClass0cN O = this.f9246E.f12178B.m5770O(AnonymousClass0vx.f12177J);
            O.f7108F = false;
            O.m5767L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).m5769N(1.0d);
        }
    }

    public final void wh(View view) {
        this.f9248G = (ViewStub) view.findViewById(C0164R.id.save_popout_image_stub);
    }
}
