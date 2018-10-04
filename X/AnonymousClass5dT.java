package X;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.5dT */
public final class AnonymousClass5dT {
    /* renamed from: B */
    public final ProgressBar f67621B;
    /* renamed from: C */
    private ObjectAnimator f67622C;

    public AnonymousClass5dT(ProgressBar progressBar) {
        this.f67621B = progressBar;
    }

    /* renamed from: A */
    public final void m28157A(WebView webView, int i) {
        int i2 = i * 10;
        if (i2 <= 100) {
            i2 = 100;
        }
        String url = webView.getUrl();
        Object obj = (AnonymousClass0Ip.B(url) || !AnonymousClass5ea.m28192C(Uri.parse(url))) ? null : 1;
        if (obj != null) {
            i2 = 100;
        }
        if (i2 == JsonMappingException.MAX_REFS_TO_LIST) {
            View view = this.f67621B;
            if (view.getVisibility() == 0) {
                Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration((long) 300);
                alphaAnimation.setAnimationListener(new AnonymousClass5d8(view));
                view.startAnimation(alphaAnimation);
            } else if (view.getVisibility() == 4) {
                view.setVisibility(8);
            }
        } else {
            if (this.f67621B.getVisibility() == 8) {
                this.f67621B.setVisibility(0);
            }
            if (i2 < this.f67621B.getProgress()) {
                this.f67621B.setProgress(0);
            }
            if (i2 != this.f67621B.getProgress()) {
                ObjectAnimator objectAnimator = this.f67622C;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                this.f67622C = ObjectAnimator.ofInt(this.f67621B, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{this.f67621B.getProgress(), i2});
                this.f67622C.setDuration((long) ((i2 - this.f67621B.getProgress()) * 2));
                this.f67622C.setInterpolator(new LinearInterpolator());
                this.f67622C.start();
            }
        }
    }
}
