package X;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* renamed from: X.3ci */
public final class AnonymousClass3ci extends Resources {
    public AnonymousClass3ci(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    }

    public final Drawable getDrawable(int i) {
        if (VERSION.SDK_INT <= 19) {
            AnonymousClass3cj.m20205B(this, i);
        }
        return super.getDrawable(i);
    }

    public final Drawable getDrawable(int i, Theme theme) {
        AnonymousClass3cj.m20205B(this, i);
        return super.getDrawable(i, theme);
    }
}
