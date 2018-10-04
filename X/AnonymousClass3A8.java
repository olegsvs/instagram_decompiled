package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.C0164R;

/* renamed from: X.3A8 */
public final class AnonymousClass3A8 {
    /* renamed from: B */
    public static void m18793B(AnonymousClass3A7 anonymousClass3A7, AnonymousClass45o anonymousClass45o, boolean z) {
        anonymousClass3A7.f38507B.setText(anonymousClass45o.f50014B);
        anonymousClass3A7.f38507B.setTextDescriptor(anonymousClass45o.pS());
        if (z) {
            anonymousClass3A7.f38507B.setMinLines(2);
        }
        AnonymousClass39P.m18768B(anonymousClass3A7.f38508C, anonymousClass45o.QS().f47584E);
        anonymousClass3A7.f38508C.setBackgroundColor(anonymousClass45o.QS().f47582C);
        anonymousClass3A7.f38507B.setGravity(anonymousClass45o.QS().f47581B.m18754A());
        ((LayoutParams) anonymousClass3A7.f38507B.getLayoutParams()).gravity = anonymousClass45o.QS().f47581B.m18754A();
    }

    /* renamed from: C */
    public static View m18794C(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.canvas_text_block, viewGroup, false);
    }
}
