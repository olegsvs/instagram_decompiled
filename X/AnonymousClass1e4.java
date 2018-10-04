package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.SystemClock;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi.Stub;
import java.util.Iterator;

/* renamed from: X.1e4 */
public final class AnonymousClass1e4 implements ServiceConnection {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass17X f20870B;

    public AnonymousClass1e4(AnonymousClass17X anonymousClass17X) {
        this.f20870B = anonymousClass17X;
    }

    /* renamed from: B */
    public static void m12265B(AnonymousClass1e4 anonymousClass1e4, ComponentName componentName, IBinder iBinder) {
        AnonymousClass1Gl.m10573C("HeroServiceClient", "onServiceConnected()", new Object[0]);
        anonymousClass1e4.f20870B.f14765J = Stub.m10619B(iBinder);
        AnonymousClass0OR.m3624D(anonymousClass1e4.f20870B.f14758C, anonymousClass1e4.f20870B.f14769N, -1744141833);
        Iterator it;
        if (anonymousClass1e4.f20870B.f14770O) {
            synchronized (anonymousClass1e4.f20870B.f14760E) {
                for (AnonymousClass1Ei lz : anonymousClass1e4.f20870B.f14760E.keySet()) {
                    lz.lz();
                }
            }
        } else {
            it = anonymousClass1e4.f20870B.f14759D.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1Ei) it.next()).lz();
            }
        }
        AnonymousClass17a.m9486B(anonymousClass1e4.f20870B.f14766K);
    }

    /* renamed from: C */
    public static void m12266C(AnonymousClass1e4 anonymousClass1e4) {
        AnonymousClass1Gl.m10573C("HeroServiceClient", "onServiceDisconnected()", new Object[0]);
        anonymousClass1e4.f20870B.f14765J = null;
        Iterator it;
        if (anonymousClass1e4.f20870B.f14770O) {
            synchronized (anonymousClass1e4.f20870B.f14760E) {
                for (AnonymousClass1Ei mz : anonymousClass1e4.f20870B.f14760E.keySet()) {
                    mz.mz();
                }
            }
        } else {
            it = anonymousClass1e4.f20870B.f14759D.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1Ei) it.next()).mz();
            }
        }
        if (anonymousClass1e4.f20870B.f14771P != null) {
            anonymousClass1e4.f20870B.f14771P.A();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass17X.m9476B(anonymousClass1e4.f20870B, elapsedRealtime);
        anonymousClass1e4.f20870B.f14764I = elapsedRealtime;
    }

    /* renamed from: D */
    private boolean m12267D() {
        AnonymousClass1Gy anonymousClass1Gy = this.f20870B.f14762G;
        return anonymousClass1Gy != null && anonymousClass1Gy.f16577H;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (m12267D()) {
            AnonymousClass0OR.m3624D(this.f20870B.f14758C, new AnonymousClass1xB(this, componentName, iBinder), 365456256);
        } else {
            AnonymousClass1e4.m12265B(this, componentName, iBinder);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (m12267D()) {
            AnonymousClass0OR.m3624D(this.f20870B.f14758C, new AnonymousClass1xC(this), -159461873);
        } else {
            AnonymousClass1e4.m12266C(this);
        }
    }
}
