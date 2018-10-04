package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.21U */
public final class AnonymousClass21U implements ServiceConnection {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass21Q f25309B;

    public AnonymousClass21U(AnonymousClass21Q anonymousClass21Q) {
        this.f25309B = anonymousClass21Q;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25309B.f25298C.m14198A("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        AnonymousClass21Q.m14190B(this.f25309B, new AnonymousClass2TV(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f25309B.f25298C.m14198A("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        AnonymousClass21Q.m14190B(this.f25309B, new AnonymousClass2TW(this));
    }
}
