package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.1ZG */
public final class AnonymousClass1ZG {
    /* renamed from: B */
    public IgImageView f20190B;
    /* renamed from: C */
    public IgImageView f20191C;
    /* renamed from: D */
    public View f20192D;

    public AnonymousClass1ZG(View view) {
        this.f20192D = ((ViewStub) view.findViewById(C0164R.id.reel_viewer_double_avatar)).inflate();
        this.f20190B = (IgImageView) view.findViewById(C0164R.id.iglive_broadcaster_avatar);
        this.f20191C = (IgImageView) view.findViewById(C0164R.id.iglive_cobroadcaster_avatar);
    }
}
