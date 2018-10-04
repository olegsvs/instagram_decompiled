package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.56S */
public final class AnonymousClass56S implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass56X f60141B;

    public AnonymousClass56S(AnonymousClass56X anonymousClass56X) {
        this.f60141B = anonymousClass56X;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -454015367);
        AnonymousClass0NN B = AnonymousClass56X.m25733B(this.f60141B, AnonymousClass0Fr.RegNextPressed);
        if (AnonymousClass56X.m25735D(this.f60141B)) {
            B.H("shared_photo_to_feed", this.f60141B.f60155K.isChecked());
        }
        B.R();
        AnonymousClass3Wn B2 = AnonymousClass3Wn.B();
        synchronized (B2) {
            Boolean bool = B2.f41957D;
        }
        synchronized (B2) {
            CharSequence charSequence = B2.f41958E;
        }
        if (bool == null || !Boolean.FALSE.equals(bool) || TextUtils.isEmpty(charSequence)) {
            AnonymousClass32T.B(this.f60141B.getContext(), this.f60141B.f60158N, this.f60141B.f60153I, this.f60141B.f60155K.isChecked());
        } else {
            Context context = this.f60141B.getContext();
            AnonymousClass0Cm anonymousClass0Cm = this.f60141B.f60158N;
            boolean isChecked = this.f60141B.f60155K.isChecked();
            synchronized (B2) {
                if (B2.f41959F) {
                    B2.f41955B = context.getApplicationContext();
                    B2.f41963J = anonymousClass0Cm;
                    B2.f41962I = Boolean.valueOf(isChecked);
                    B2.f41961H = true;
                    AnonymousClass3Wn.E(B2);
                }
            }
        }
        AnonymousClass56X.m25734C(this.f60141B, true);
        AnonymousClass0cQ.L(this, -1863526034, M);
    }
}
