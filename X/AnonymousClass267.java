package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: X.267 */
public final class AnonymousClass267 extends ConstantState {
    /* renamed from: B */
    public boolean f25932B;
    /* renamed from: C */
    public int f25933C;
    /* renamed from: D */
    public boolean f25934D;
    /* renamed from: E */
    public Drawable f25935E;

    public AnonymousClass267(AnonymousClass267 anonymousClass267, AnonymousClass0rj anonymousClass0rj, Resources resources) {
        if (anonymousClass267 != null) {
            if (resources != null) {
                this.f25935E = anonymousClass267.f25935E.getConstantState().newDrawable(resources);
            } else {
                this.f25935E = anonymousClass267.f25935E.getConstantState().newDrawable();
            }
            this.f25935E.setCallback(anonymousClass0rj);
            this.f25932B = true;
            this.f25934D = true;
        }
    }

    public final int getChangingConfigurations() {
        return this.f25933C;
    }

    public final Drawable newDrawable() {
        return new AnonymousClass0rj(this, null);
    }

    public final Drawable newDrawable(Resources resources) {
        return new AnonymousClass0rj(this, resources);
    }
}
