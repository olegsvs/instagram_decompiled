package X;

import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import java.util.Set;

/* renamed from: X.5sH */
public final class AnonymousClass5sH implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Exception f69502B;
    /* renamed from: C */
    public final /* synthetic */ Set f69503C;

    public AnonymousClass5sH(IgReactExceptionManager igReactExceptionManager, Set set, Exception exception) {
        this.f69503C = set;
        this.f69502B = exception;
    }

    public final void run() {
        for (NativeModuleCallExceptionHandler handleException : this.f69503C) {
            handleException.handleException(this.f69502B);
        }
    }
}
