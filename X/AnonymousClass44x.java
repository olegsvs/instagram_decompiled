package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.44x */
public final class AnonymousClass44x implements AnonymousClass3SF {
    /* renamed from: B */
    public CheckBox f49619B;
    /* renamed from: C */
    public View f49620C;
    /* renamed from: D */
    public TextView f49621D;
    /* renamed from: E */
    public AnonymousClass3Rv f49622E;
    /* renamed from: F */
    public InlineErrorMessageView f49623F;
    /* renamed from: G */
    private final String f49624G;

    public AnonymousClass44x(View view) {
        this.f49623F = (InlineErrorMessageView) view.findViewById(C0164R.id.checkbox_error_view);
        this.f49621D = (TextView) view.findViewById(C0164R.id.text_view);
        this.f49619B = (CheckBox) view.findViewById(C0164R.id.check_box);
        this.f49620C = view.findViewById(C0164R.id.checkbox_separator);
        this.f49621D.setFocusable(true);
        this.f49621D.setFocusableInTouchMode(true);
        this.f49624G = view.getResources().getString(C0164R.string.lead_ad_custom_disclaimer_checkbox_error);
    }

    public final void BLA() {
        this.f49621D.post(new AnonymousClass3SC(this));
    }

    public final void YE() {
        this.f49623F.m20525A();
    }

    public final void zTA() {
        this.f49623F.m20526B(this.f49624G);
    }
}
