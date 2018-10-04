package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.2Hz */
public final class AnonymousClass2Hz extends AnonymousClass0oo {
    /* renamed from: B */
    public final ColorFilterAlphaImageView f28611B;
    /* renamed from: C */
    public final SpinnerImageView f28612C;
    /* renamed from: D */
    public final TextView f28613D;
    /* renamed from: E */
    public final TextView f28614E;
    /* renamed from: F */
    public final TextView f28615F;
    /* renamed from: G */
    public final TextView f28616G;
    /* renamed from: H */
    public final TextView f28617H;

    public AnonymousClass2Hz(View view) {
        super(view);
        this.f28611B = (ColorFilterAlphaImageView) view.findViewById(C0164R.id.empty_state_view_image);
        this.f28612C = (SpinnerImageView) view.findViewById(C0164R.id.empty_state_view_loading_spinner);
        this.f28616G = (TextView) view.findViewById(C0164R.id.empty_state_view_title);
        this.f28615F = (TextView) view.findViewById(C0164R.id.empty_state_view_subtitle);
        this.f28614E = (TextView) view.findViewById(C0164R.id.empty_state_view_primary_inverse_button);
        this.f28613D = (TextView) view.findViewById(C0164R.id.empty_state_view_primary_button);
        this.f28617H = (TextView) view.findViewById(C0164R.id.empty_state_under_button_text);
    }
}
