package X;

import android.os.Handler;
import android.os.Message;
import com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingManager;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: X.2i0 */
public final class AnonymousClass2i0 extends Handler {
    /* renamed from: B */
    public final WeakReference f32739B;
    /* renamed from: C */
    public StringBuilder f32740C = new StringBuilder();

    public AnonymousClass2i0(AsyncScriptingManager asyncScriptingManager) {
        this.f32739B = new WeakReference(asyncScriptingManager);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1003:
                this.f32740C.append(message.getData().getString("postMessages"));
                return;
            case 1004:
                if (this.f32739B.get() != null) {
                    Collections.addAll(((AsyncScriptingManager) this.f32739B.get()).mAsyncMessages, this.f32740C.toString().split(";"));
                    this.f32740C = new StringBuilder();
                    return;
                }
                throw new RuntimeException("AsyncScriptingHandler.mManager is null.");
            default:
                super.handleMessage(message);
                return;
        }
    }
}
