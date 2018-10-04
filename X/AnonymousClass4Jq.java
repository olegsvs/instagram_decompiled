package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: X.4Jq */
public final class AnonymousClass4Jq implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Jr f52724B;
    /* renamed from: C */
    public final /* synthetic */ Bitmap f52725C;

    public AnonymousClass4Jq(AnonymousClass4Jr anonymousClass4Jr, Bitmap bitmap) {
        this.f52724B = anonymousClass4Jr;
        this.f52725C = bitmap;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f52724B.f52726B.removeOnLayoutChangeListener(this);
        view = this.f52724B;
        view.f52728D = null;
        view.f52726B.setImageBitmap(this.f52725C);
    }
}
