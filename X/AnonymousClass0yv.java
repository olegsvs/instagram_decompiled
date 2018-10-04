package X;

import android.text.SpannableStringBuilder;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.facebook.C0164R;
import com.instagram.model.venue.Venue;

/* renamed from: X.0yv */
public final class AnonymousClass0yv implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0pS f12923B;
    /* renamed from: C */
    public final /* synthetic */ SpannableStringBuilder f12924C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0pl f12925D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0P7 f12926E;
    /* renamed from: F */
    public final /* synthetic */ boolean f12927F;
    /* renamed from: G */
    public final /* synthetic */ Venue f12928G;

    public AnonymousClass0yv(AnonymousClass0pS anonymousClass0pS, AnonymousClass0pl anonymousClass0pl, AnonymousClass0P7 anonymousClass0P7, boolean z, Venue venue, SpannableStringBuilder spannableStringBuilder) {
        this.f12923B = anonymousClass0pS;
        this.f12925D = anonymousClass0pl;
        this.f12926E = anonymousClass0P7;
        this.f12927F = z;
        this.f12928G = venue;
        this.f12924C = spannableStringBuilder;
    }

    public final boolean onPreDraw() {
        int width;
        int right;
        this.f12925D.f10713D.getViewTreeObserver().removeOnPreDrawListener(this);
        if (AnonymousClass0e8.m6200D(this.f12923B.f10614B)) {
            width = this.f12925D.m7877A().getWidth();
            right = (this.f12925D.f10734Y.getRight() - this.f12925D.f10711B.getLeft()) + this.f12923B.f10614B.getResources().getDimensionPixelSize(C0164R.dimen.media_header_location_padding);
        } else {
            width = this.f12925D.f10711B.getRight();
            right = this.f12925D.f10734Y.getRight() - this.f12925D.f10727R.getWidth();
        }
        AnonymousClass0pq.m7882D(this.f12923B.f10615C, this.f12926E, this.f12925D.f10713D, this.f12925D.m7878B(), this.f12927F, true, this.f12928G, this.f12924C, this.f12923B.f10619G, this.f12923B.f10618F, width, this.f12925D.f10737b.getBottom(), right, 0);
        return false;
    }
}
