package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.31R */
public final class AnonymousClass31R extends View {
    /* renamed from: B */
    private final ArrayList f37077B;

    public AnonymousClass31R(AnonymousClass31S anonymousClass31S, Context context, ArrayList arrayList) {
        super(context);
        this.f37077B = arrayList;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f37077B.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass31Q anonymousClass31Q = (AnonymousClass31Q) this.f37077B.get(i);
            anonymousClass31Q.f37071L.reset();
            anonymousClass31Q.f37071L.postTranslate(anonymousClass31Q.f37064E, anonymousClass31Q.f37065F);
            anonymousClass31Q.f37072M.setAlpha(anonymousClass31Q.f37063D);
            canvas.drawBitmap(anonymousClass31Q.f37068I, anonymousClass31Q.f37071L, anonymousClass31Q.f37072M);
        }
    }
}
