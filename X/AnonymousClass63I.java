package X;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.63I */
public final class AnonymousClass63I extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ URLSpan f71303B;
    /* renamed from: C */
    public final /* synthetic */ TextView f71304C;

    public AnonymousClass63I(TextView textView, URLSpan uRLSpan) {
        this.f71304C = textView;
        this.f71303B = uRLSpan;
    }

    public final void onClick(View view) {
        AnonymousClass0IW.T(Uri.parse(this.f71303B.getURL()), this.f71304C.getContext());
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
