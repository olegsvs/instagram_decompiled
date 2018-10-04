package X;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import com.instagram.ui.widget.imagebutton.IgImageButton;

/* renamed from: X.3jd */
public final class AnonymousClass3jd extends Handler {
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            IgImageButton igImageButton = (IgImageButton) message.obj;
            ValueAnimator valueAnimator = igImageButton.f11498B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            igImageButton.f11502F = 1.0f;
            igImageButton.invalidate();
        } else if (message.what == 2) {
            IgImageButton.C((IgImageButton) message.obj);
        }
    }
}
