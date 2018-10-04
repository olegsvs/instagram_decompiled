package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.55A */
public final class AnonymousClass55A {
    /* renamed from: B */
    public final ImageView f59955B;
    /* renamed from: C */
    public final TextView f59956C;
    /* renamed from: D */
    public final View f59957D;
    /* renamed from: E */
    public final TextView f59958E;
    /* renamed from: F */
    public final TextView f59959F;

    public AnonymousClass55A(View view) {
        this.f59957D = view;
        this.f59959F = (TextView) view.findViewById(C0164R.id.title);
        this.f59958E = (TextView) view.findViewById(C0164R.id.subtitle);
        this.f59955B = (ImageView) view.findViewById(C0164R.id.notification_badge_icon);
        this.f59956C = (TextView) view.findViewById(C0164R.id.count_badge);
    }
}
