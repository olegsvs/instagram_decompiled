package X;

import android.text.style.ClickableSpan;
import android.widget.TextView;

/* renamed from: X.3OV */
public final class AnonymousClass3OV implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1WW f40753B;
    /* renamed from: C */
    public final /* synthetic */ ClickableSpan f40754C;
    /* renamed from: D */
    public final /* synthetic */ TextView f40755D;

    public AnonymousClass3OV(AnonymousClass1WW anonymousClass1WW, ClickableSpan clickableSpan, TextView textView) {
        this.f40753B = anonymousClass1WW;
        this.f40754C = clickableSpan;
        this.f40755D = textView;
    }

    public final void run() {
        this.f40754C.onClick(this.f40755D);
        this.f40753B.f19534G = false;
    }
}
