package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.4o6 */
public final class AnonymousClass4o6 {
    /* renamed from: B */
    public View f57471B;
    /* renamed from: C */
    public TextView f57472C;
    /* renamed from: D */
    public IgImageView f57473D;
    /* renamed from: E */
    public TextView f57474E;

    public AnonymousClass4o6(View view) {
        this.f57471B = view;
        this.f57473D = (IgImageView) view.findViewById(C0164R.id.spotlight_image);
        this.f57472C = (TextView) view.findViewById(C0164R.id.spotlight_header);
        this.f57474E = (TextView) view.findViewById(C0164R.id.spotlight_subheader);
    }
}
