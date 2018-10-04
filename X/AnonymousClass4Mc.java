package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Mc */
public final class AnonymousClass4Mc implements AnonymousClass25B {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5T4 f53233B;
    /* renamed from: C */
    public final /* synthetic */ List f53234C;

    public final boolean rX(Medium medium) {
        return true;
    }

    public AnonymousClass4Mc(AnonymousClass5T4 anonymousClass5T4, List list) {
        this.f53233B = anonymousClass5T4;
        this.f53234C = list;
    }

    public final void TDA(Medium medium, boolean z, boolean z2, Bitmap bitmap) {
        this.f53233B.f64259Y = null;
        AnonymousClass5T4.B(this.f53233B, medium, bitmap);
        this.f53233B.f64242H.H(this.f53233B, Collections.unmodifiableList(this.f53234C));
    }

    public final void ko(Medium medium) {
        this.f53233B.f64259Y = null;
        this.f53233B.f64242H.H(this.f53233B, Collections.unmodifiableList(this.f53234C));
    }
}
