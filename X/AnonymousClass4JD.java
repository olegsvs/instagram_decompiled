package X;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.4JD */
public final class AnonymousClass4JD {
    /* renamed from: B */
    public final AnonymousClass13K f52634B;
    /* renamed from: C */
    public final ConstrainedImageView f52635C;
    /* renamed from: D */
    public AnonymousClass5SY f52636D;
    /* renamed from: E */
    public final ConstrainedImageView f52637E;
    /* renamed from: F */
    public final Matrix f52638F = new Matrix();
    /* renamed from: G */
    public final float f52639G;

    public AnonymousClass4JD(FrameLayout frameLayout, int i) {
        this.f52637E = (ConstrainedImageView) frameLayout.findViewById(C0164R.id.item_emoji);
        this.f52635C = (ConstrainedImageView) frameLayout.findViewById(C0164R.id.item_emoji_overlay);
        if (VERSION.SDK_INT >= 24) {
            this.f52635C.setImageResource(C0164R.drawable.right_bottom_triangle);
        }
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f52637E);
        anonymousClass15z.f14393M = true;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = new AnonymousClass4JC(this);
        this.f52634B = anonymousClass15z.A();
        LayoutParams layoutParams = this.f52637E.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f52637E.setLayoutParams(layoutParams);
        layoutParams = this.f52635C.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f52635C.setLayoutParams(layoutParams);
        this.f52639G = ((float) i) / ((float) this.f52637E.getContext().getResources().getDimensionPixelSize(C0164R.dimen.emoji_icon_size));
    }
}
