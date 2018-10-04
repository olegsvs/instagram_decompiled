package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.52S */
public final class AnonymousClass52S extends AnonymousClass0oo {
    /* renamed from: B */
    public final TextView f59452B;
    /* renamed from: C */
    public final CircularImageView f59453C;
    /* renamed from: D */
    public final TextView f59454D;
    /* renamed from: E */
    public final TextView f59455E;

    public AnonymousClass52S(View view) {
        super(view);
        this.f59453C = (CircularImageView) view.findViewById(C0164R.id.activators_row_card_image);
        this.f59455E = (TextView) view.findViewById(C0164R.id.activators_row_card_title);
        this.f59454D = (TextView) view.findViewById(C0164R.id.activators_row_card_message);
        this.f59452B = (TextView) view.findViewById(C0164R.id.activators_row_card_primary_button);
    }
}
