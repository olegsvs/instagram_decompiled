package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.346 */
public final class AnonymousClass346 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f37494B;
    /* renamed from: C */
    private final CharSequence f37495C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass346(Context context, CharSequence charSequence) {
        this.f37494B = context;
        this.f37495C = charSequence;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 458202053);
        if (view == null) {
            Context context = this.f37494B;
            CharSequence charSequence = this.f37495C;
            view = LayoutInflater.from(context).inflate(C0164R.layout.row_page_footer, viewGroup, false);
            TextView textView = (TextView) view.findViewById(C0164R.id.row_page_footer_text);
            textView.setText(charSequence);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        AnonymousClass0cQ.H(this, -612211272, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
