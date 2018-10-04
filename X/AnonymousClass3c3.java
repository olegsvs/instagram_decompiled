package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3c3 */
public final class AnonymousClass3c3 extends AnonymousClass0oo {
    /* renamed from: B */
    public final CircularImageView f42698B;
    /* renamed from: C */
    public final ImageView f42699C;
    /* renamed from: D */
    public final View f42700D;
    /* renamed from: E */
    public final AnonymousClass0ct f42701E;
    /* renamed from: F */
    private final TextView f42702F;

    public AnonymousClass3c3(View view) {
        super(view);
        this.f42700D = view;
        this.f42699C = (ImageView) view.findViewById(C0164R.id.inner_button_view);
        this.f42698B = (CircularImageView) view.findViewById(C0164R.id.button_background_view);
        this.f42702F = (TextView) view.findViewById(C0164R.id.label);
        this.f42701E = new AnonymousClass0ct(view.findViewById(C0164R.id.notification));
    }

    /* renamed from: V */
    public final void m20177V(int i) {
        if (i == 0) {
            this.f42702F.setText(JsonProperty.USE_DEFAULT_NAME);
            this.f42702F.setVisibility(8);
            return;
        }
        this.f42702F.setText(i);
        this.f42702F.setVisibility(0);
    }
}
