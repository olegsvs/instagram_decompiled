package X;

import android.text.TextPaint;
import android.view.View;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.3O8 */
public final class AnonymousClass3O8 extends AnonymousClass0t7 {
    /* renamed from: B */
    public final /* synthetic */ int f40718B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0P7 f40719C;

    public AnonymousClass3O8(boolean z, int i, AnonymousClass0P7 anonymousClass0P7, int i2) {
        this.f40719C = anonymousClass0P7;
        this.f40718B = i2;
        super(z, i);
    }

    public final void onClick(View view) {
        new AnonymousClass0yK(this.f40719C, false).Eg(((Hashtag) this.f40719C.NB.get(0)).f2793M, null, this);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f40718B);
    }
}
