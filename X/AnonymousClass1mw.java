package X;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.1mw */
public final class AnonymousClass1mw extends AnonymousClass1br {
    /* renamed from: A */
    public final boolean m13040A(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onNestedFling");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: B */
    public final boolean m13041B(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onNestedPreFling");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: C */
    public final void m13042C(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onNestedPreScroll");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
        }
    }

    /* renamed from: D */
    public final void m13043D(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onNestedScroll");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
        }
    }

    /* renamed from: E */
    public final void m13044E(ViewParent viewParent, View view, View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onNestedScrollAccepted");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
        }
    }

    /* renamed from: F */
    public final boolean m13045F(ViewParent viewParent, View view, View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onStartNestedScroll");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: G */
    public final void m13046G(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onStopNestedScroll");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
        }
    }
}
