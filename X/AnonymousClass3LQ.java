package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.3LQ */
public final class AnonymousClass3LQ extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0k0 f40320B;
    /* renamed from: C */
    public final /* synthetic */ TextView f40321C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0P7 f40322D;

    public AnonymousClass3LQ(TextView textView, AnonymousClass0k0 anonymousClass0k0, AnonymousClass0P7 anonymousClass0P7) {
        this.f40321C = textView;
        this.f40320B = anonymousClass0k0;
        this.f40322D = anonymousClass0P7;
    }

    public final void onClick(View view) {
        this.f40320B.Po(this.f40322D);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(AnonymousClass0Ca.C(this.f40321C.getContext(), C0164R.color.blue_5));
    }
}
