package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.2J5 */
public final class AnonymousClass2J5 {
    /* renamed from: B */
    public static void m14999B(View view, AnonymousClass2If anonymousClass2If, boolean z, boolean z2) {
        AnonymousClass2J4 anonymousClass2J4 = (AnonymousClass2J4) view.getTag();
        anonymousClass2J4.f28775B.getLayoutParams().height = view.getResources().getDimensionPixelSize(C0164R.dimen.row_height_small);
        if (anonymousClass2If.f28720B) {
            anonymousClass2J4.f28776C.setAlpha(0.3f);
        } else {
            anonymousClass2J4.f28776C.setAlpha(1.0f);
        }
        anonymousClass2J4.f28776C.setSingleLine(anonymousClass2If.f28721C);
        TextView textView = anonymousClass2J4.f28776C;
        CharSequence charSequence = anonymousClass2If.f28722D;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(anonymousClass2If.f28723E);
        }
    }

    /* renamed from: C */
    public static View m15000C(Context context, ViewGroup viewGroup) {
        context = LayoutInflater.from(context).inflate(C0164R.layout.row_header, viewGroup, false);
        AnonymousClass2J4 anonymousClass2J4 = new AnonymousClass2J4();
        anonymousClass2J4.f28776C = (TextView) context.findViewById(C0164R.id.row_header_textview);
        anonymousClass2J4.f28775B = context.findViewById(C0164R.id.frame_header);
        context.findViewById(C0164R.id.row_divider);
        context.setTag(anonymousClass2J4);
        return context;
    }
}
