package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.4km */
public final class AnonymousClass4km extends AnonymousClass0oo {
    /* renamed from: B */
    public final TextView f56812B;
    /* renamed from: C */
    public final CircularImageView f56813C;
    /* renamed from: D */
    public final TextView f56814D;
    /* renamed from: E */
    public final TextView f56815E;

    public AnonymousClass4km(View view) {
        super(view);
        this.f56813C = (CircularImageView) view.findViewById(C0164R.id.direct_action_row_avatar);
        this.f56812B = (TextView) view.findViewById(C0164R.id.direct_action_row_name);
        this.f56814D = (TextView) view.findViewById(C0164R.id.direct_action_row_status);
        this.f56815E = (TextView) view.findViewById(C0164R.id.direct_action_row_time_stamp);
    }
}
