package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.622 */
public final class AnonymousClass622 extends AnonymousClass0TA {
    /* renamed from: B */
    public boolean f71067B;
    /* renamed from: C */
    private final OnTouchListener f71068C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass622(OnTouchListener onTouchListener, boolean z) {
        this.f71068C = onTouchListener;
        this.f71067B = z;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        int I = AnonymousClass0cQ.I(this, 1430297304);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.product_cta_button, viewGroup, false);
            AnonymousClass623 anonymousClass623 = new AnonymousClass623();
            anonymousClass623.f71069B = (ProgressButton) view.findViewById(C0164R.id.cta_button);
            view.setTag(anonymousClass623);
        }
        AnonymousClass623 anonymousClass6232 = (AnonymousClass623) view.getTag();
        Product product = (Product) obj;
        OnTouchListener onTouchListener = this.f71068C;
        boolean z = this.f71067B;
        boolean z2 = false;
        anonymousClass6232.f71069B.setVisibility(0);
        anonymousClass6232.f71069B.setOnTouchListener(onTouchListener);
        anonymousClass6232.f71069B.setShowProgressBar(z);
        ProgressButton progressButton = anonymousClass6232.f71069B;
        if (!z && (!product.A() || product.G())) {
            z2 = true;
        }
        progressButton.setEnabled(z2);
        if (!product.A()) {
            i2 = C0164R.string.shopping_viewer_offsite_cta_label;
        } else if (product.G()) {
            i2 = C0164R.string.shopping_viewer_checkout_cta_label;
        } else {
            i2 = C0164R.string.shopping_viewer_checkout_sold_out_label;
        }
        anonymousClass6232.f71069B.setText(i2);
        AnonymousClass0cQ.H(this, 1131263695, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Product product = (Product) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
