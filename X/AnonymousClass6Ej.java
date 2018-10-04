package X;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6Ej */
public final class AnonymousClass6Ej extends AnonymousClass5tu {
    /* renamed from: B */
    public final IgImageView f73201B;
    /* renamed from: C */
    public final TextView f73202C;
    /* renamed from: D */
    public final Drawable f73203D;

    public AnonymousClass6Ej(FrameLayout frameLayout) {
        super(frameLayout);
        this.f73201B = (IgImageView) frameLayout.findViewById(C0164R.id.image_view);
        this.f73202C = (TextView) frameLayout.findViewById(C0164R.id.text_view);
        Drawable mutate = AnonymousClass0Ca.E(frameLayout.getContext(), C0164R.drawable.viewers_icon).mutate();
        this.f73203D = mutate;
        mutate.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(frameLayout.getContext(), C0164R.color.white)));
    }
}
