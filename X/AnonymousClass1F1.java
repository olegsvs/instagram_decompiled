package X;

import android.app.Notification.BigTextStyle;
import android.os.Build.VERSION;

/* renamed from: X.1F1 */
public final class AnonymousClass1F1 extends AnonymousClass0W0 {
    /* renamed from: B */
    private CharSequence f15961B;

    /* renamed from: A */
    public final void mo1348A(AnonymousClass1lc anonymousClass1lc) {
        if (VERSION.SDK_INT >= 16) {
            CharSequence charSequence = this.f5850B;
            boolean z = this.f5853E;
            CharSequence charSequence2 = this.f5852D;
            BigTextStyle bigText = new BigTextStyle(anonymousClass1lc.PJ()).setBigContentTitle(charSequence).bigText(this.f15961B);
            if (z) {
                bigText.setSummaryText(charSequence2);
            }
        }
    }

    /* renamed from: C */
    public final AnonymousClass1F1 m10281C(CharSequence charSequence) {
        this.f15961B = AnonymousClass0RT.m4167B(charSequence);
        return this;
    }
}
