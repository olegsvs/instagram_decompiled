package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.13G */
public final class AnonymousClass13G extends AnonymousClass0oo {
    /* renamed from: B */
    public final TextView f13662B;
    /* renamed from: C */
    public final TextView f13663C;
    /* renamed from: D */
    public final View f13664D;
    /* renamed from: E */
    public Drawable f13665E;
    /* renamed from: F */
    public final ImageView f13666F;
    /* renamed from: G */
    public final int f13667G;
    /* renamed from: H */
    public int f13668H;
    /* renamed from: I */
    public int f13669I;
    /* renamed from: J */
    public int f13670J;
    /* renamed from: K */
    public int f13671K;
    /* renamed from: L */
    public AnonymousClass0oq f13672L;

    public AnonymousClass13G(View view, int i) {
        super(view);
        this.f13664D = view.findViewById(C0164R.id.suggestion_unit_banner_container);
        this.f13666F = (ImageView) view.findViewById(C0164R.id.facepile);
        this.f13663C = (TextView) view.findViewById(C0164R.id.banner_title);
        this.f13662B = (TextView) view.findViewById(C0164R.id.banner_subtitle);
        this.f13667G = i;
    }
}
