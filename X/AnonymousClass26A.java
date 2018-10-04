package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.ui.widget.imageview.FadingCarouselImageView;

/* renamed from: X.26A */
public final class AnonymousClass26A extends Handler {
    /* renamed from: B */
    public final /* synthetic */ FadingCarouselImageView f25948B;

    public AnonymousClass26A(FadingCarouselImageView fadingCarouselImageView, Looper looper) {
        this.f25948B = fadingCarouselImageView;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            this.f25948B.f25954E.start();
        }
    }
}
