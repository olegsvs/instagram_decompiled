package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.4n3 */
public final class AnonymousClass4n3 extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f57270B;
    /* renamed from: C */
    public final AnonymousClass4n1 f57271C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4n3(Context context, AnonymousClass4n1 anonymousClass4n1) {
        this.f57270B = context;
        this.f57271C = anonymousClass4n1;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        AnonymousClass4n2 anonymousClass4n2;
        int I = AnonymousClass0cQ.I(this, -1413298950);
        AnonymousClass0LH.H(i == 0);
        if (view == null) {
            view = LayoutInflater.from(this.f57270B).inflate(C0164R.layout.row_header_button_group, viewGroup, false);
            anonymousClass4n2 = new AnonymousClass4n2();
            anonymousClass4n2.f57269B = (ViewGroup) view.findViewById(C0164R.id.tab_layout);
            view.setTag(anonymousClass4n2);
        }
        anonymousClass4n2 = (AnonymousClass4n2) view.getTag();
        AnonymousClass3J1 anonymousClass3J1 = (AnonymousClass3J1) obj;
        AnonymousClass3J2 anonymousClass3J2 = (AnonymousClass3J2) obj2;
        int I2 = AnonymousClass0cQ.I(this, 412734519);
        ViewGroup viewGroup2 = anonymousClass4n2.f57269B;
        List list = anonymousClass3J1.f39985C;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= list.size()) {
                break;
            }
            TextView textView;
            AnonymousClass3J0 anonymousClass3J0 = (AnonymousClass3J0) list.get(i2);
            if (i2 < viewGroup2.getChildCount()) {
                textView = (TextView) viewGroup2.getChildAt(i2);
            } else {
                textView = (TextView) LayoutInflater.from(viewGroup2.getContext()).inflate(C0164R.layout.button_group_tab, viewGroup2, false);
                viewGroup2.addView(textView);
            }
            textView.setText(anonymousClass3J0.f39981C);
            textView.setContentDescription(anonymousClass3J0.f39980B);
            if (anonymousClass3J0.f39982D != anonymousClass3J2) {
                z = false;
            }
            textView.setSelected(z);
            textView.setOnClickListener(new AnonymousClass4n0(this, anonymousClass3J0));
            i2++;
        }
        for (int childCount = viewGroup2.getChildCount() - 1; childCount >= list.size(); childCount--) {
            viewGroup2.removeViewAt(childCount);
        }
        AnonymousClass0cQ.H(this, 700873605, I2);
        AnonymousClass0cQ.H(this, 482912310, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3J1 anonymousClass3J1 = (AnonymousClass3J1) obj;
        AnonymousClass3J2 anonymousClass3J2 = (AnonymousClass3J2) obj2;
        anonymousClass0p9.A(0);
    }
}
