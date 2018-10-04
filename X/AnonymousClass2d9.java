package X;

import android.support.v4.widget.SlidingPaneLayout;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.2d9 */
public final class AnonymousClass2d9 extends AnonymousClass2Oj {
    /* renamed from: B */
    private Method f31730B;
    /* renamed from: C */
    private Field f31731C;

    public AnonymousClass2d9() {
        try {
            this.f31730B = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
        } catch (Throwable e) {
            Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
        }
        try {
            this.f31731C = View.class.getDeclaredField("mRecreateDisplayList");
            this.f31731C.setAccessible(true);
        } catch (Throwable e2) {
            Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
        }
    }

    public final void ZW(SlidingPaneLayout slidingPaneLayout, View view) {
        if (this.f31730B != null) {
            Field field = this.f31731C;
            if (field != null) {
                try {
                    field.setBoolean(view, true);
                    this.f31730B.invoke(view, (Object[]) null);
                } catch (Throwable e) {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
                }
                super.ZW(slidingPaneLayout, view);
                return;
            }
        }
        view.invalidate();
    }
}
