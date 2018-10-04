package X;

import android.text.SpannableStringBuilder;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import com.instagram.model.venue.Venue;

/* renamed from: X.3LT */
public final class AnonymousClass3LT implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Wv f40333B;
    /* renamed from: C */
    public final /* synthetic */ SpannableStringBuilder f40334C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3LU f40335D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0P7 f40336E;
    /* renamed from: F */
    public final /* synthetic */ boolean f40337F;
    /* renamed from: G */
    public final /* synthetic */ Venue f40338G;

    public AnonymousClass3LT(AnonymousClass1Wv anonymousClass1Wv, AnonymousClass3LU anonymousClass3LU, AnonymousClass0P7 anonymousClass0P7, boolean z, Venue venue, SpannableStringBuilder spannableStringBuilder) {
        this.f40333B = anonymousClass1Wv;
        this.f40335D = anonymousClass3LU;
        this.f40336E = anonymousClass0P7;
        this.f40337F = z;
        this.f40338G = venue;
        this.f40334C = spannableStringBuilder;
    }

    public final boolean onPreDraw() {
        int left;
        int width;
        this.f40335D.f40355R.getViewTreeObserver().removeOnPreDrawListener(this);
        if (AnonymousClass0e8.D(this.f40333B.f19627B)) {
            left = this.f40335D.f40351N.getLeft();
            width = this.f40335D.f40350M.getWidth();
        } else {
            left = this.f40335D.f40350M.getRight();
            width = (this.f40335D.f40348K.getRight() - this.f40335D.f40355R.getRight()) - this.f40335D.f40350M.getRight();
        }
        AnonymousClass0P7 anonymousClass0P7 = this.f40336E;
        TextView textView = this.f40335D.f40355R;
        AnonymousClass3LU anonymousClass3LU = this.f40335D;
        if (anonymousClass3LU.f40345H == null) {
            anonymousClass3LU.f40345H = (TextView) anonymousClass3LU.f40346I.inflate();
        }
        AnonymousClass0pq.D(null, anonymousClass0P7, textView, anonymousClass3LU.f40345H, this.f40337F, false, this.f40338G, this.f40334C, this.f40333B.f19631F, this.f40333B.f19630E, left, this.f40335D.f40355R.getBottom(), width, 0);
        return false;
    }
}
