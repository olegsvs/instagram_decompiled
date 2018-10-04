package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.44h */
public class AnonymousClass44h extends AnonymousClass3yj {
    public AnonymousClass44h(int i, String str, int i2, AnonymousClass3Cu anonymousClass3Cu) {
        super(i, str, i2, anonymousClass3Cu);
    }

    public AnonymousClass44h(String str, int i, AnonymousClass3Cu anonymousClass3Cu) {
        super(-1, str, i, anonymousClass3Cu);
    }

    public final AnonymousClass3D4 vH(Resources resources, Drawable drawable, AnonymousClass3Cs anonymousClass3Cs) {
        if (anonymousClass3Cs != AnonymousClass3Cs.f39116M) {
            if (anonymousClass3Cs != AnonymousClass3Cs.f39115L) {
                if (anonymousClass3Cs == AnonymousClass3Cs.f39113J) {
                    return new AnonymousClass3yq(resources, resources.getDrawable(this.f47742B), AnonymousClass3D6.RECT);
                }
                return new AnonymousClass3yp(resources, resources.getDrawable(this.f47742B));
            }
        }
        return new AnonymousClass3yq(resources, resources.getDrawable(this.f47742B), AnonymousClass3D6.OVAL);
    }
}
