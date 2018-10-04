package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.65u */
public final class AnonymousClass65u extends AnonymousClass0oo {
    /* renamed from: B */
    public final TextView f71684B;
    /* renamed from: C */
    public final CircularImageView f71685C;
    /* renamed from: D */
    public AnonymousClass6Fr f71686D;
    /* renamed from: E */
    public final TextView f71687E;

    public AnonymousClass65u(View view, TextView textView, TextView textView2, CircularImageView circularImageView) {
        super(view);
        this.f71687E = textView;
        this.f71684B = textView2;
        this.f71685C = circularImageView;
        view.setOnClickListener(new AnonymousClass65t(this));
    }
}
