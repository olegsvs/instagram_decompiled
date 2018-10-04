package X;

import android.graphics.Point;
import android.graphics.Rect;

/* renamed from: X.3D0 */
public final class AnonymousClass3D0 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3ym f39136B;

    public AnonymousClass3D0(AnonymousClass3ym anonymousClass3ym) {
        this.f39136B = anonymousClass3ym;
    }

    public final void run() {
        if (!AnonymousClass3B1.f38644B.m18851D()) {
            Rect rect = new Rect();
            Point point = new Point();
            this.f39136B.getGlobalVisibleRect(rect, point);
            rect.top = point.y;
            rect.left = point.x;
            AnonymousClass3B1.f38644B.m18853F(new AnonymousClass3yk(this.f39136B, (float) rect.left, (float) rect.top));
        }
    }
}
