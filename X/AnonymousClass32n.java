package X;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.32n */
public final class AnonymousClass32n implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass32p f37258B;

    public AnonymousClass32n(AnonymousClass32p anonymousClass32p) {
        this.f37258B = anonymousClass32p;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f37258B.f37260B = z;
        if (this.f37258B.f37262D != null) {
            this.f37258B.f37262D.m14797A(z);
            AnonymousClass32p.m18279B(this.f37258B);
        }
    }
}
