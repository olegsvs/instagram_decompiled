package X;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0hj */
public final class AnonymousClass0hj {
    /* renamed from: B */
    public int f8522B = -1;
    /* renamed from: C */
    public int f8523C = -1;
    /* renamed from: D */
    public int f8524D = -1;
    /* renamed from: E */
    public final int[] f8525E = new int[2];
    /* renamed from: F */
    public final Set f8526F = new CopyOnWriteArraySet();
    /* renamed from: G */
    public View f8527G;
    /* renamed from: H */
    private OnAttachStateChangeListener f8528H;
    /* renamed from: I */
    private final OnGlobalLayoutListener f8529I = new AnonymousClass0ll(this);
    /* renamed from: J */
    private View f8530J;
    /* renamed from: K */
    private int f8531K;
    /* renamed from: L */
    private WindowManager f8532L;

    /* renamed from: A */
    public final void m6815A(AnonymousClass0Qd anonymousClass0Qd) {
        this.f8526F.add(anonymousClass0Qd);
    }

    /* renamed from: B */
    public static void m6812B(AnonymousClass0hj anonymousClass0hj, int i) {
        for (AnonymousClass0Qd Sp : anonymousClass0hj.f8526F) {
            Sp.Sp(i, anonymousClass0hj.f8531K == 48);
        }
    }

    /* renamed from: B */
    public final void m6816B(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        this.f8530J = decorView;
        if (decorView.getWindowToken() != null) {
            AnonymousClass0hj.m6813C(this, activity);
        } else if (this.f8528H == null) {
            this.f8528H = new AnonymousClass13r(this, activity);
            this.f8530J.addOnAttachStateChangeListener(this.f8528H);
        }
    }

    /* renamed from: C */
    public final void m6817C() {
        m6814D();
        this.f8530J = null;
    }

    /* renamed from: C */
    public static void m6813C(AnonymousClass0hj anonymousClass0hj, Activity activity) {
        anonymousClass0hj.m6814D();
        IBinder windowToken = anonymousClass0hj.f8530J.getWindowToken();
        if (!activity.isFinishing()) {
            Object obj = (VERSION.SDK_INT < 17 || !activity.isDestroyed()) ? null : 1;
            if (obj == null) {
                if (windowToken != null) {
                    int i = activity.getWindow().getAttributes().type;
                    if (i < JsonMappingException.MAX_REFS_TO_LIST || i > 1999) {
                        anonymousClass0hj.f8531K = activity.getWindow().getAttributes().softInputMode & 240;
                        anonymousClass0hj.f8532L = (WindowManager) activity.getSystemService("window");
                        anonymousClass0hj.f8527G = new View(activity);
                        LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 131096, -3);
                        layoutParams.softInputMode = 16;
                        layoutParams.token = windowToken;
                        try {
                            anonymousClass0hj.f8532L.addView(anonymousClass0hj.f8527G, layoutParams);
                            anonymousClass0hj.f8527G.getViewTreeObserver().addOnGlobalLayoutListener(anonymousClass0hj.f8529I);
                            return;
                        } catch (Throwable e) {
                            AnonymousClass0Gn.m1884K("KeyboardHeightChangeDetector", "BadTokenException when trying to add window", e, 1);
                            anonymousClass0hj.f8532L = null;
                            anonymousClass0hj.f8527G = null;
                            anonymousClass0hj.f8531K = 0;
                            return;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Attempted to add window with token that is a sub-window of type: ");
                    stringBuilder.append(i);
                    AnonymousClass0Gn.m1882I("KeyboardHeightChangeDetector", stringBuilder.toString(), 1);
                }
            }
        }
    }

    /* renamed from: D */
    private void m6814D() {
        View view = this.f8530J;
        if (view != null) {
            OnAttachStateChangeListener onAttachStateChangeListener = this.f8528H;
            if (onAttachStateChangeListener != null) {
                view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
        }
        this.f8528H = null;
        View view2 = this.f8527G;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this.f8529I);
            this.f8532L.removeViewImmediate(this.f8527G);
            this.f8532L = null;
            this.f8527G = null;
            this.f8531K = 0;
        }
    }

    /* renamed from: D */
    public final void m6818D(AnonymousClass0Qd anonymousClass0Qd) {
        this.f8526F.remove(anonymousClass0Qd);
    }
}
