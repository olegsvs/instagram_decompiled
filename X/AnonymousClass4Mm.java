package X;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;

/* renamed from: X.4Mm */
public final class AnonymousClass4Mm extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Mn f53250B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5T7 f53251C;

    public AnonymousClass4Mm(AnonymousClass4Mn anonymousClass4Mn, AnonymousClass5T7 anonymousClass5T7) {
        this.f53250B = anonymousClass4Mn;
        this.f53251C = anonymousClass5T7;
    }

    public final boolean yCA(View view) {
        if (this.f53250B.f53252B.getDrawable() instanceof BitmapDrawable) {
            AnonymousClass5T7.B(this.f53251C, this.f53250B.f53253C, ((BitmapDrawable) this.f53250B.f53252B.getDrawable()).getBitmap());
        }
        return true;
    }
}
