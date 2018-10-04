package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: X.1Ej */
public final class AnonymousClass1Ej implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass17a f15938B;

    public AnonymousClass1Ej(AnonymousClass17a anonymousClass17a) {
        this.f15938B = anonymousClass17a;
    }

    public final void run() {
        while (!this.f15938B.f14806D.isEmpty()) {
            VideoPrefetchRequest videoPrefetchRequest = (VideoPrefetchRequest) this.f15938B.f14806D.poll();
            if (videoPrefetchRequest != null) {
                if (this.f15938B.f14807E) {
                    Object obj;
                    AnonymousClass17c anonymousClass17c = this.f15938B.f14805C;
                    String str = videoPrefetchRequest.f14725N.f14750O;
                    synchronized (anonymousClass17c) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        obj = 1;
                        if (anonymousClass17c.f14810B.containsKey(str)) {
                            if (elapsedRealtime - ((Long) anonymousClass17c.f14810B.get(str)).longValue() <= 500) {
                                obj = null;
                            }
                        }
                        if (obj != null) {
                            anonymousClass17c.f14810B.put(str, Long.valueOf(elapsedRealtime));
                        }
                        if (anonymousClass17c.f14810B.size() > 200) {
                            Iterator it = anonymousClass17c.f14810B.entrySet().iterator();
                            while (it.hasNext()) {
                                if (elapsedRealtime - ((Long) ((Entry) it.next()).getValue()).longValue() > 500) {
                                    it.remove();
                                }
                            }
                        }
                    }
                    if (obj == null) {
                        continue;
                    }
                }
                String str2 = "PrefetchClient";
                AnonymousClass1Gl.m10573C(str2, "prefetch() %s", videoPrefetchRequest.f14725N);
                HeroPlayerServiceApi A = this.f15938B.f14804B.m9487A();
                if (A == null) {
                    AnonymousClass1Gl.m10573C(str2, "Service is not connected", new Object[0]);
                    return;
                }
                try {
                    A.bHA(videoPrefetchRequest);
                } catch (Throwable e) {
                    AnonymousClass1Gl.m10574D("PrefetchClient", e, "RemoteException when prefetch", new Object[0]);
                    return;
                }
            }
        }
    }
}
