package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.5WC */
public final class AnonymousClass5WC extends AnonymousClass4gA {
    /* renamed from: B */
    public final LinearLayout f65576B;
    /* renamed from: C */
    public final View f65577C;
    /* renamed from: D */
    public final TextView f65578D;

    public AnonymousClass5WC(View view, AnonymousClass5bQ anonymousClass5bQ) {
        super(view, anonymousClass5bQ);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0164R.id.seen_state_container);
        this.f65576B = linearLayout;
        this.f65577C = linearLayout.findViewById(C0164R.id.eye_icon);
        TextView textView = (TextView) this.f65576B.findViewById(C0164R.id.text);
        this.f65578D = textView;
        textView.setMaxWidth(AnonymousClass4ew.C(V()));
    }

    /* renamed from: X */
    public final /* bridge */ /* synthetic */ void m27301X(AnonymousClass4gR anonymousClass4gR) {
        AnonymousClass5WT anonymousClass5WT = (AnonymousClass5WT) anonymousClass4gR;
        CharSequence B = AnonymousClass4gO.B(anonymousClass5WT.f65635D, anonymousClass5WT.f65633B);
        this.f65577C.setVisibility(B.isEmpty() ? 4 : 0);
        this.f65578D.setText(B);
        boolean z = anonymousClass5WT.f65634C;
        int i = 5;
        this.f65576B.setGravity(z ? 5 : 3);
        TextView textView = this.f65578D;
        if (!z) {
            i = 3;
        }
        textView.setGravity(i);
        this.f10370B.setOnClickListener(new AnonymousClass4fw(this));
    }
}
