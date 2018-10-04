package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.checkbox.IgCheckBox;

/* renamed from: X.2J8 */
public final class AnonymousClass2J8 {
    /* renamed from: B */
    public IgCheckBox f28779B;
    /* renamed from: C */
    public View f28780C;
    /* renamed from: D */
    public TextView f28781D;

    public AnonymousClass2J8(View view) {
        this.f28781D = (TextView) view.findViewById(C0164R.id.row_simple_text_textview);
        this.f28780C = view.findViewById(C0164R.id.row_divider);
        this.f28779B = (IgCheckBox) view.findViewById(C0164R.id.checkbox);
        view.setTag(this);
    }
}
