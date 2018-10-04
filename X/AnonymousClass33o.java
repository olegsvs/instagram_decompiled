package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.33o */
public final class AnonymousClass33o {
    /* renamed from: B */
    public final View f37464B;
    /* renamed from: C */
    public final TextView f37465C;
    /* renamed from: D */
    public final IgImageView f37466D;
    /* renamed from: E */
    public final TextView f37467E;

    public AnonymousClass33o(View view) {
        this.f37464B = view;
        this.f37466D = (IgImageView) view.findViewById(C0164R.id.thumbnail);
        this.f37467E = (TextView) view.findViewById(C0164R.id.title);
        this.f37465C = (TextView) view.findViewById(C0164R.id.subtitle);
    }
}
