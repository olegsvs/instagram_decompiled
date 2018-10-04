package X;

import android.view.View;

/* renamed from: X.67P */
public final class AnonymousClass67P implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6GA f71968B;
    /* renamed from: C */
    public final /* synthetic */ View f71969C;

    public AnonymousClass67P(AnonymousClass6GA anonymousClass6GA, View view) {
        this.f71968B = anonymousClass6GA;
        this.f71969C = view;
    }

    public final void run() {
        AnonymousClass6GA anonymousClass6GA = this.f71968B;
        View view = this.f71969C;
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass6GA.f73617V);
        int i = D.f2646B.getInt("live_with_invite_button_tooltip_view_count", 0);
        if (i < 3) {
            anonymousClass6GA.f73608M.m26418A(anonymousClass6GA.f73611P, view);
            D.f2646B.edit().putInt("live_with_invite_button_tooltip_view_count", i + 1).apply();
        }
    }
}
