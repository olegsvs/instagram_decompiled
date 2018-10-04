package X;

import com.facebook.react.modules.appstate.AppStateModule;

/* renamed from: X.0GY */
public final class AnonymousClass0GY implements AnonymousClass0EJ {
    public final void onAppBackgrounded() {
        synchronized (AnonymousClass0GX.class) {
            AnonymousClass0GX anonymousClass0GX = AnonymousClass0GX.f2383E;
        }
        if (anonymousClass0GX != null) {
            AnonymousClass0GX.m1821B(anonymousClass0GX, "foreground");
        }
    }

    public final void onAppForegrounded() {
        synchronized (AnonymousClass0GX.class) {
            AnonymousClass0GX anonymousClass0GX = AnonymousClass0GX.f2383E;
        }
        if (anonymousClass0GX != null) {
            AnonymousClass0GX.m1821B(anonymousClass0GX, AppStateModule.APP_STATE_BACKGROUND);
        }
    }
}
