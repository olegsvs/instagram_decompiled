package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.5Lo */
public final class AnonymousClass5Lo extends AnonymousClass0nJ {
    /* renamed from: B */
    public final AnonymousClass6GI f62449B;
    /* renamed from: C */
    public final AnonymousClass5NV[] f62450C;

    public AnonymousClass5Lo(AnonymousClass6GI anonymousClass6GI, AnonymousClass5NV[] anonymousClass5NVArr) {
        this.f62449B = anonymousClass6GI;
        this.f62450C = anonymousClass5NVArr;
    }

    /* renamed from: B */
    public final int m26293B() {
        return this.f62450C.length;
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m26294I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass5Ln anonymousClass5Ln = (AnonymousClass5Ln) anonymousClass0oo;
        AnonymousClass5NV anonymousClass5NV = this.f62450C[i];
        anonymousClass5NV.f62761D = i;
        anonymousClass5Ln.f62448B.setText(anonymousClass5NV.f62759B);
        anonymousClass5Ln.f10370B.setOnClickListener(new AnonymousClass5Lm(this, anonymousClass5NV));
    }

    /* renamed from: J */
    public final AnonymousClass0oo m26295J(ViewGroup viewGroup, int i) {
        return new AnonymousClass5Ln(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_iglive_comment_prompt_item, viewGroup, false));
    }
}
