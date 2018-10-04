package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.35O */
public final class AnonymousClass35O extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ Context f37682B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass35P f37683C;
    /* renamed from: D */
    public final /* synthetic */ String f37684D;

    public AnonymousClass35O(AnonymousClass35P anonymousClass35P, String str, Context context) {
        this.f37683C = anonymousClass35P;
        this.f37684D = str;
        this.f37682B = context;
    }

    public final void onClick(View view) {
        this.f37683C.m18457A(this.f37684D);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(AnonymousClass0Ca.C(this.f37682B, C0164R.color.blue_5));
    }
}
