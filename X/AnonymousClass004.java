package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.004 */
public abstract class AnonymousClass004 {
    /* renamed from: B */
    public final ComponentName f2B;
    /* renamed from: C */
    public boolean f3C;
    /* renamed from: D */
    public int f4D;

    /* renamed from: A */
    public abstract void mo13A(Intent intent);

    /* renamed from: C */
    public void mo14C() {
    }

    /* renamed from: D */
    public void mo15D() {
    }

    /* renamed from: E */
    public void mo16E() {
    }

    public AnonymousClass004(Context context, ComponentName componentName) {
        this.f2B = componentName;
    }

    /* renamed from: B */
    public final void m1B(int i) {
        if (!this.f3C) {
            this.f3C = true;
            this.f4D = i;
        } else if (this.f4D != i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Given job ID ");
            stringBuilder.append(i);
            stringBuilder.append(" is different than previous ");
            stringBuilder.append(this.f4D);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
