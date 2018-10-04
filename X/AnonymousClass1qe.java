package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.facebook.browser.lite.extensions.watchandbrowse.BrowserLiteHeaderLoadingScreen;

/* renamed from: X.1qe */
public final class AnonymousClass1qe extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ BrowserLiteHeaderLoadingScreen f23314B;

    public AnonymousClass1qe(BrowserLiteHeaderLoadingScreen browserLiteHeaderLoadingScreen) {
        this.f23314B = browserLiteHeaderLoadingScreen;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f23314B.setVisibility(8);
    }
}
