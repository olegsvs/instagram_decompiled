package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.InviteButton;

/* renamed from: X.1X8 */
public final class AnonymousClass1X8 extends AnonymousClass0oo {
    /* renamed from: B */
    public final CircularImageView f19683B;
    /* renamed from: C */
    public final View f19684C;
    /* renamed from: D */
    public final InviteButton f19685D;
    /* renamed from: E */
    public final TextView f19686E;

    public AnonymousClass1X8(View view) {
        super(view);
        this.f19683B = (CircularImageView) view.findViewById(C0164R.id.suggested_invite_card_image);
        this.f19686E = (TextView) view.findViewById(C0164R.id.suggested_invite_card_name);
        this.f19685D = (InviteButton) view.findViewById(C0164R.id.suggested_invite_card_invite_button);
        this.f19684C = view.findViewById(C0164R.id.dismiss_button);
    }
}
