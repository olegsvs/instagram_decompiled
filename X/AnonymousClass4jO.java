package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;

/* renamed from: X.4jO */
public final class AnonymousClass4jO implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4jP f56621B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1lB f56622C;

    public AnonymousClass4jO(AnonymousClass4jP anonymousClass4jP, AnonymousClass1lB anonymousClass1lB) {
        this.f56621B = anonymousClass4jP;
        this.f56622C = anonymousClass1lB;
    }

    public final void run() {
        Context context = this.f56621B.f56624C.getContext();
        AnonymousClass1lB anonymousClass1lB = this.f56622C;
        AnonymousClass5Wt anonymousClass5Wt = this.f56621B.f56623B;
        Bitmap E = AnonymousClass0rm.E(context, anonymousClass1lB.f22448B.KK());
        Bitmap createBitmap = Bitmap.createBitmap(E.getWidth(), E.getHeight(), E.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(E, 0.0f, 0.0f, null);
        E.recycle();
        anonymousClass1lB.m12932A();
        AnonymousClass0Sy.F(new AnonymousClass4jQ(createBitmap, anonymousClass5Wt));
    }
}
