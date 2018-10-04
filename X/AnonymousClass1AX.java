package X;

import android.text.TextPaint;
import android.view.View;

/* renamed from: X.1AX */
public final class AnonymousClass1AX extends AnonymousClass0t7 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0SK f15287B;

    public AnonymousClass1AX(AnonymousClass0kW anonymousClass0kW, boolean z, int i, AnonymousClass0SK anonymousClass0SK) {
        this.f15287B = anonymousClass0SK;
        super(z, i);
    }

    public final void onClick(View view) {
        AnonymousClass0kW.m7180B(this.f15287B.m4320H(), this.f15287B);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f15287B.f4907a != AnonymousClass0zV.Success) {
            textPaint.setAlpha(64);
        }
    }
}
