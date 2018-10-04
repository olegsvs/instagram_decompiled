package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5oK */
public final class AnonymousClass5oK implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5oN f69093B;

    public AnonymousClass5oK(AnonymousClass5oN anonymousClass5oN) {
        this.f69093B = anonymousClass5oN;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -2136835261);
        if (this.f69093B.f69098B.getText().length() != 0) {
            if (!AnonymousClass0IE.L(this.f69093B.f69098B.getText().toString())) {
                this.f69093B.f69098B.requestFocus();
                AnonymousClass0IG.F(C0164R.string.please_enter_a_valid_email_address);
                AnonymousClass0cQ.L(this, 1178615944, M);
            }
        }
        AnonymousClass0IL anonymousClass0IL = this.f69093B;
        AnonymousClass0GA G = AnonymousClass1fh.G(anonymousClass0IL.f69101E, AnonymousClass1fq.B(anonymousClass0IL.getArguments().getString("sendSource")), anonymousClass0IL.f69098B.getText().toString(), AnonymousClass0Dt.B(anonymousClass0IL.getContext()), null, null, null);
        G.f2849B = new AnonymousClass5oM(anonymousClass0IL);
        anonymousClass0IL.schedule(G);
        AnonymousClass0cQ.L(this, 1178615944, M);
    }
}
