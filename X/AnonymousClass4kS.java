package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4kS */
public final class AnonymousClass4kS {
    /* renamed from: B */
    public final View f56763B;
    /* renamed from: C */
    public final ImageView f56764C;
    /* renamed from: D */
    public final TextView f56765D;
    /* renamed from: E */
    public final AnonymousClass4ky f56766E = new AnonymousClass4ky(this.f56763B, 1);
    /* renamed from: F */
    public final View f56767F;

    public AnonymousClass4kS(View view) {
        this.f56763B = view.findViewById(C0164R.id.row_add_to_story_favorites_container);
        this.f56764C = (ImageView) view.findViewById(C0164R.id.icon);
        this.f56765D = (TextView) view.findViewById(C0164R.id.label);
        this.f56767F = ((ViewStub) view.findViewById(C0164R.id.one_tap_button_view_stub)).inflate();
    }
}
