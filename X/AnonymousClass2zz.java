package X;

import android.widget.TextView;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.imagebutton.IgImageButton;

/* renamed from: X.2zz */
public final class AnonymousClass2zz {
    /* renamed from: B */
    public final CircularImageView f36752B;
    /* renamed from: C */
    public final MediaFrameLayout f36753C;
    /* renamed from: D */
    public final TextView f36754D;
    /* renamed from: E */
    public final IgImageButton f36755E;
    /* renamed from: F */
    public AnonymousClass3wn f36756F;

    public AnonymousClass2zz(MediaFrameLayout mediaFrameLayout, IgImageButton igImageButton, CircularImageView circularImageView, TextView textView) {
        this.f36753C = mediaFrameLayout;
        this.f36755E = igImageButton;
        this.f36752B = circularImageView;
        this.f36754D = textView;
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f36753C);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14389I = 0.98f;
        anonymousClass15z.f14385E = new AnonymousClass2zy(this);
        anonymousClass15z.A();
    }
}
