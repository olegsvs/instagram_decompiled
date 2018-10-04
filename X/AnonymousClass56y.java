package X;

import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import com.facebook.C0164R;

/* renamed from: X.56y */
public final class AnonymousClass56y implements ViewFactory {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass572 f60244B;
    /* renamed from: C */
    public final /* synthetic */ Resources f60245C;

    public AnonymousClass56y(AnonymousClass572 anonymousClass572, Resources resources) {
        this.f60244B = anonymousClass572;
        this.f60245C = resources;
    }

    public final View makeView() {
        View textView = new TextView(this.f60244B.getContext());
        int dimensionPixelSize = this.f60245C.getDimensionPixelSize(C0164R.dimen.row_text_padding);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setCompoundDrawablesWithIntrinsicBounds(C0164R.drawable.share_facebook, 0, 0, 0);
        textView.setCompoundDrawablePadding(this.f60244B.getResources().getDimensionPixelOffset(C0164R.dimen.margin_of_fb_icon_inside_button));
        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setEllipsize(TruncateAt.END);
        textView.setTextColor(AnonymousClass0Ca.C(this.f60244B.getContext(), C0164R.color.white));
        textView.setTextSize(0, this.f60245C.getDimension(C0164R.dimen.font_medium));
        textView.setTypeface(null, 1);
        AnonymousClass3Xy.F(textView, C0164R.color.white);
        return textView;
    }
}
