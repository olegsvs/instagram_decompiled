package X;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.333 */
public final class AnonymousClass333 implements OnErrorListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass338 f37302B;

    public AnonymousClass333(AnonymousClass338 anonymousClass338) {
        this.f37302B = anonymousClass338;
    }

    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        Toast.makeText(this.f37302B.getContext(), C0164R.string.bugreporter_fail_media_recorder, 0).show();
    }
}
