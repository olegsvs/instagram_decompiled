package X;

import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.65j */
public final class AnonymousClass65j {
    /* renamed from: B */
    public final AnonymousClass65k f71651B;
    /* renamed from: C */
    public AnonymousClass6Fc f71652C = new AnonymousClass6Fc(this);
    /* renamed from: D */
    public AnonymousClass6Fx f71653D;

    public AnonymousClass65j(AnonymousClass65k anonymousClass65k) {
        this.f71651B = anonymousClass65k;
    }

    /* renamed from: A */
    public final void m28962A(AnonymousClass65i anonymousClass65i) {
        AnonymousClass6Fx anonymousClass6Fx;
        if (!anonymousClass65i.f71649D) {
            anonymousClass6Fx = this.f71653D;
            if (anonymousClass6Fx != null) {
                anonymousClass6Fx.m29655b();
                this.f71653D = null;
            }
        } else if (this.f71653D == null) {
            AnonymousClass6Fx PU = this.f71651B.PU();
            PU.f73492E = new AnonymousClass6Fo(this);
            this.f71653D = PU;
            PU.m29656c();
        }
        TextView textView;
        if (anonymousClass65i.f71650E) {
            anonymousClass6Fx = this.f71653D;
            if (anonymousClass6Fx != null) {
                textView = anonymousClass6Fx.f73495H;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        } else {
            anonymousClass6Fx = this.f71653D;
            if (anonymousClass6Fx != null) {
                textView = anonymousClass6Fx.f73495H;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            }
        }
        String str = anonymousClass65i.f71647B;
        anonymousClass6Fx = this.f71653D;
        if (anonymousClass6Fx != null) {
            IgImageView igImageView = anonymousClass6Fx.f73489B;
            if (igImageView != null) {
                igImageView.setUrl(str);
            }
        }
        CharSequence charSequence = anonymousClass65i.f71648C;
        anonymousClass6Fx = this.f71653D;
        if (anonymousClass6Fx != null) {
            TextView textView2 = anonymousClass6Fx.f73493F;
            if (textView2 != null) {
                textView2.setText(charSequence);
            }
        }
    }
}
