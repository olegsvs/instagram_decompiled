package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;

/* renamed from: X.0vm */
public final class AnonymousClass0vm {
    /* renamed from: B */
    public static int m8367B(Activity activity) {
        return VERSION.SDK_INT >= 21 ? activity.getWindow().getNavigationBarColor() : 0;
    }

    /* renamed from: C */
    public static int m8368C(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point2 = new Point();
        defaultDisplay.getRealSize(point2);
        return point.y < point2.y ? point2.y - point.y : 0;
    }

    /* renamed from: D */
    public static void m8369D(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().addFlags(Process.WAIT_RESULT_TIMEOUT);
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    /* renamed from: E */
    public static void m8370E(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? (systemUiVisibility & -513) & -3 : ((systemUiVisibility | 256) | DexStore.LOAD_RESULT_DEX2OAT_QUICKENED) | 2);
    }
}
