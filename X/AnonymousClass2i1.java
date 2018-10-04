package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingService;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.ref.WeakReference;

/* renamed from: X.2i1 */
public final class AnonymousClass2i1 extends Handler {
    /* renamed from: B */
    public StringBuilder f32741B = new StringBuilder();
    /* renamed from: C */
    public final WeakReference f32742C;

    public AnonymousClass2i1(AsyncScriptingService asyncScriptingService) {
        this.f32742C = new WeakReference(asyncScriptingService);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case JsonMappingException.MAX_REFS_TO_LIST /*1000*/:
                this.f32741B.append(message.getData().getString("script"));
                return;
            case 1001:
                ((AsyncScriptingService) this.f32742C.get()).nativeExecute(this.f32741B.toString());
                this.f32741B = new StringBuilder();
                return;
            case 1002:
                String access$100 = ((AsyncScriptingService) this.f32742C.get()).nativeSendPostMessage();
                int length = access$100.length();
                int i = 0;
                while (i <= length / 50000) {
                    int i2 = i * 50000;
                    i++;
                    int i3 = 50000 * i;
                    if (i3 > length) {
                        i3 = length;
                    }
                    Messenger messenger = message.replyTo;
                    Message obtain = Message.obtain(null, 1003);
                    Bundle bundle = new Bundle();
                    bundle.putString("postMessages", access$100.substring(i2, i3));
                    obtain.setData(bundle);
                    try {
                        messenger.send(obtain);
                    } catch (Throwable e) {
                        throw new RuntimeException("AsyncScripting message is too big.", e);
                    }
                }
                try {
                    message.replyTo.send(Message.obtain(null, 1004));
                    return;
                } catch (Throwable e2) {
                    throw new RuntimeException("AsyncScripting message is too big.", e2);
                }
            default:
                super.handleMessage(message);
                return;
        }
    }
}
