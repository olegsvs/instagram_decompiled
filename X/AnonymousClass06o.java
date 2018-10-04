package X;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* renamed from: X.06o */
public abstract class AnonymousClass06o {
    /* renamed from: B */
    public final ExecutorService f418B;

    /* renamed from: B */
    public abstract Socket mo98B(Socket socket, String str, int i);

    public AnonymousClass06o(ExecutorService executorService) {
        this.f418B = executorService;
    }

    /* renamed from: A */
    public final Socket m417A() {
        if (!AnonymousClass069.m374B()) {
            return new Socket();
        }
        throw new IOException("Restricted mode is enabled.");
    }
}
