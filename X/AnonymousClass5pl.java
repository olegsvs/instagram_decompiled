package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.5pl */
public final class AnonymousClass5pl {
    /* renamed from: B */
    public final AnonymousClass0ct f69257B;
    /* renamed from: C */
    public final ImageView f69258C;
    /* renamed from: D */
    public final View f69259D;
    /* renamed from: E */
    public final TextView f69260E;

    public AnonymousClass5pl(View view) {
        this.f69259D = view;
        this.f69258C = (ImageView) view.findViewById(C0164R.id.menu_option_icon);
        this.f69260E = (TextView) view.findViewById(C0164R.id.menu_option_text);
        this.f69257B = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.menu_badge_stub));
    }
}
