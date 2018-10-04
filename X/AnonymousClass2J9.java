package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.ui.widget.checkbox.IgCheckBox;

/* renamed from: X.2J9 */
public final class AnonymousClass2J9 {
    /* renamed from: B */
    public static void m15001B(View view, AnonymousClass2bo anonymousClass2bo, AnonymousClass2Ih anonymousClass2Ih) {
        AnonymousClass2J8 anonymousClass2J8 = (AnonymousClass2J8) view.getTag();
        int i = 0;
        if (anonymousClass2bo.f31489E != null) {
            view.setOnClickListener(anonymousClass2bo.f31489E);
        } else {
            view.setClickable(false);
        }
        if (anonymousClass2bo.f31491G != null) {
            anonymousClass2J8.f28781D.setText(anonymousClass2bo.f31491G);
        } else {
            anonymousClass2J8.f28781D.setText(anonymousClass2bo.f31494J);
        }
        AnonymousClass0LH.H(anonymousClass2J8.f28781D.getPaddingLeft() == anonymousClass2J8.f28781D.getPaddingRight());
        anonymousClass2J8.f28781D.setCompoundDrawablePadding((int) AnonymousClass0Nm.C(view.getContext(), 8));
        AnonymousClass1nn.m13176B(anonymousClass2J8.f28781D, anonymousClass2bo.f31486B, null, anonymousClass2bo.f31487C, null);
        if (anonymousClass2Ih.f28729C) {
            if (anonymousClass2Ih.f28728B) {
                view.setBackgroundResource(C0164R.drawable.dialog_row_single);
            } else {
                view.setBackgroundResource(C0164R.drawable.dialog_row_top);
            }
        } else if (anonymousClass2Ih.f28728B) {
            view.setBackgroundResource(C0164R.drawable.dialog_row_bottom);
        } else {
            view.setBackgroundResource(C0164R.drawable.bg_simple_row);
        }
        anonymousClass2J8.f28780C.setVisibility(8);
        if (anonymousClass2Ih.f28730D) {
            anonymousClass2J8.f28781D.setGravity(17);
        } else {
            anonymousClass2J8.f28781D.setGravity(19);
        }
        IgCheckBox igCheckBox = anonymousClass2J8.f28779B;
        if (!anonymousClass2bo.f31492H) {
            i = 8;
        }
        igCheckBox.setVisibility(i);
        anonymousClass2J8.f28779B.setOnCheckedChangeListener(null);
        anonymousClass2J8.f28779B.setChecked(anonymousClass2bo.f31493I);
        anonymousClass2J8.f28779B.setOnCheckedChangeListener(anonymousClass2bo.f31490F);
        if (anonymousClass2bo.f31488D) {
            anonymousClass2J8.f28781D.setTypeface(Typeface.DEFAULT_BOLD);
            anonymousClass2J8.f28781D.setTextColor(AnonymousClass0Ca.C(view.getContext(), C0164R.color.blue_5));
            return;
        }
        anonymousClass2J8.f28781D.setTypeface(null);
        anonymousClass2J8.f28781D.setTextColor(AnonymousClass0Ca.C(view.getContext(), C0164R.color.black));
    }

    /* renamed from: C */
    public static View m15002C(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.row_menu_item, null);
        AnonymousClass2J8 anonymousClass2J8 = new AnonymousClass2J8(inflate);
        return inflate;
    }
}
