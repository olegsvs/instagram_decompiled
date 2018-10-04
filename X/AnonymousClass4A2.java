package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.4A2 */
public final class AnonymousClass4A2 implements AnonymousClass25B {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rt f51023B;

    public AnonymousClass4A2(AnonymousClass5Rt anonymousClass5Rt) {
        this.f51023B = anonymousClass5Rt;
    }

    public final void TDA(Medium medium, boolean z, boolean z2, Bitmap bitmap) {
        this.f51023B.f63550I.setImageDrawable(new AnonymousClass1WM(this.f51023B.f63543B, this.f51023B.f63561T, false, medium.zQ(), bitmap));
    }

    public final void ko(Medium medium) {
        this.f51023B.f63550I.setImageDrawable(this.f51023B.f63545D);
    }

    public final boolean rX(Medium medium) {
        return AnonymousClass0LQ.B(this.f51023B.f63562U, medium);
    }
}
