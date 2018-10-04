package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.0pX */
public final class AnonymousClass0pX {
    /* renamed from: B */
    public final View f10644B;
    /* renamed from: C */
    public final IgTextLayoutView f10645C;
    /* renamed from: D */
    public AnonymousClass0zX f10646D;
    /* renamed from: E */
    public IgBouncyUfiButtonImageView f10647E;
    /* renamed from: F */
    public View f10648F;
    /* renamed from: G */
    public final ViewStub f10649G;

    public AnonymousClass0pX(View view) {
        this.f10644B = view.findViewById(C0164R.id.row_feed_comment_textview_child_comment_indent);
        this.f10645C = (IgTextLayoutView) view.findViewById(C0164R.id.row_feed_comment_textview_layout);
        this.f10649G = (ViewStub) view.findViewById(C0164R.id.row_feed_comment_like_button_stub);
    }
}
