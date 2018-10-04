package X;

import android.view.View;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.62b */
public final class AnonymousClass62b extends AnonymousClass0oo {
    /* renamed from: B */
    public final View f71210B;
    /* renamed from: C */
    public final View f71211C;
    /* renamed from: D */
    public final View f71212D;
    /* renamed from: E */
    public final IgImageView f71213E;

    public AnonymousClass62b(View view) {
        super(view);
        this.f71210B = view;
        this.f71213E = (IgImageView) view.findViewById(C0164R.id.thumbnail_image);
        this.f71211C = view.findViewById(C0164R.id.selected_border);
        this.f71212D = view.findViewById(C0164R.id.sold_out_label);
    }
}
