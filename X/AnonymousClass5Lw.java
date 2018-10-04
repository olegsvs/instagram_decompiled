package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.5Lw */
public class AnonymousClass5Lw extends AnonymousClass0oo {
    /* renamed from: B */
    public View f62478B;
    /* renamed from: C */
    public LinearLayout f62479C;
    /* renamed from: D */
    public TextView f62480D;
    /* renamed from: E */
    public TextView f62481E;
    /* renamed from: F */
    public final int f62482F;
    /* renamed from: G */
    public final int f62483G;
    /* renamed from: H */
    public int f62484H;
    /* renamed from: I */
    public View f62485I;
    /* renamed from: J */
    public View f62486J;
    /* renamed from: K */
    public CircularImageView f62487K;

    public AnonymousClass5Lw(View view) {
        super(view);
        this.f62485I = view;
        this.f62478B = view.findViewById(C0164R.id.comment_container);
        this.f62487K = (CircularImageView) view.findViewById(C0164R.id.user_imageview);
        this.f62486J = view.findViewById(C0164R.id.user_image_container);
        this.f62479C = (LinearLayout) view.findViewById(C0164R.id.comment_text_container);
        this.f62481E = (TextView) view.findViewById(C0164R.id.comment_text_title);
        this.f62480D = (TextView) view.findViewById(C0164R.id.comment_text_subtitle);
        Context context = this.f62485I.getContext();
        this.f62483G = context.getResources().getDimensionPixelSize(C0164R.dimen.font_medium);
        this.f62482F = AnonymousClass0Ca.C(context, C0164R.color.white);
    }

    /* renamed from: V */
    public void mo5896V() {
        this.f62486J.setVisibility(0);
        this.f62487K.setBackground(null);
        this.f62478B.setBackground(null);
        this.f62481E.setVisibility(8);
        this.f62480D.setTextSize(0, (float) this.f62483G);
        this.f62480D.setTextColor(this.f62482F);
    }
}
