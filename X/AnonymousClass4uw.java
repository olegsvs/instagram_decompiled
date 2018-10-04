package X;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/* renamed from: X.4uw */
public final class AnonymousClass4uw extends AnonymousClass0VA {
    /* renamed from: B */
    public final Activity f58428B;
    /* renamed from: C */
    public boolean f58429C;
    /* renamed from: D */
    private final boolean f58430D;

    public AnonymousClass4uw(Activity activity) {
        this.f58428B = activity;
        this.f58430D = AnonymousClass0ea.B(activity.getWindow(), this.f58428B.getWindow().getDecorView());
    }

    /* renamed from: A */
    public final void m25352A() {
        Window window = this.f58428B.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            this.f58429C = false;
            AnonymousClass0ea.E(window, decorView, false);
            window.addFlags(134217856);
        }
    }

    public final void PGA(View view, Bundle bundle) {
        if (VERSION.SDK_INT >= 19) {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new AnonymousClass4uv(this));
        }
        m25352A();
    }

    public final void gi() {
        Window window = this.f58428B.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (!this.f58429C) {
                AnonymousClass0ea.E(window, decorView, this.f58430D);
            }
            AnonymousClass4v0.m25353B(this.f58428B).m25361F();
            window.clearFlags(134217856);
            decorView.setSystemUiVisibility(256);
        }
    }

    public final void gx() {
        AnonymousClass4v0.m25353B(this.f58428B).m25362G();
    }
}
