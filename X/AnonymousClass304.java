package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.imagebutton.IgImageButton;

/* renamed from: X.304 */
public final class AnonymousClass304 {
    /* renamed from: B */
    public final View f36760B;
    /* renamed from: C */
    public final IgImageButton f36761C;
    /* renamed from: D */
    public final TextView f36762D;
    /* renamed from: E */
    public final MediaFrameLayout f36763E;
    /* renamed from: F */
    public final AnonymousClass13K f36764F;
    /* renamed from: G */
    public final CheckBox f36765G;
    /* renamed from: H */
    public final TextView f36766H;
    /* renamed from: I */
    public final int f36767I;
    /* renamed from: J */
    public AnonymousClass3wo f36768J;
    /* renamed from: K */
    public final View f36769K;

    public AnonymousClass304(MediaFrameLayout mediaFrameLayout, IgImageButton igImageButton, View view, TextView textView, TextView textView2, View view2, CheckBox checkBox) {
        this.f36767I = AnonymousClass0Ca.C(mediaFrameLayout.getContext(), C0164R.color.grey_1);
        this.f36763E = mediaFrameLayout;
        this.f36761C = igImageButton;
        this.f36760B = view;
        this.f36762D = textView2;
        this.f36762D.setTypeface(AnonymousClass0nA.E());
        this.f36766H = textView;
        this.f36769K = view2;
        this.f36765G = checkBox;
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f36763E);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14389I = 0.98f;
        anonymousClass15z.f14385E = new AnonymousClass303(this);
        this.f36764F = anonymousClass15z.A();
    }
}
