package X;

import android.widget.Toast;
import com.facebook.C0164R;
import java.lang.ref.WeakReference;

/* renamed from: X.393 */
public final class AnonymousClass393 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ WeakReference f38314B;

    public AnonymousClass393(AnonymousClass394 anonymousClass394, WeakReference weakReference) {
        this.f38314B = weakReference;
    }

    public final void run() {
        AnonymousClass3y9 anonymousClass3y9 = (AnonymousClass3y9) this.f38314B.get();
        Toast.makeText(anonymousClass3y9.getActivity(), C0164R.string.could_not_load_canvas, 0).show();
        anonymousClass3y9.f47535F.setLoadingStatus(AnonymousClass2M2.FAILED);
    }
}
