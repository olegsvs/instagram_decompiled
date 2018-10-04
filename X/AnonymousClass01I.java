package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.forker.Process;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.Logger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashSet;

/* renamed from: X.01I */
public final class AnonymousClass01I extends Handler {
    /* renamed from: B */
    public final AnonymousClass0Ev f153B;
    /* renamed from: C */
    public final HashSet f154C = new HashSet();

    public AnonymousClass01I(AnonymousClass0Ev anonymousClass0Ev, Looper looper) {
        super(looper);
        this.f153B = anonymousClass0Ev;
    }

    /* renamed from: A */
    public final synchronized void m73A(TraceContext traceContext) {
        if (this.f154C.contains(Long.valueOf(traceContext.f15519K))) {
            sendMessage(obtainMessage(3, traceContext));
            this.f154C.remove(Long.valueOf(traceContext.f15519K));
        }
        if (AnonymousClass01H.f152B) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Aborted trace ");
            stringBuilder.append(traceContext.f15516H);
            stringBuilder.append(" for reason ");
            stringBuilder.append(traceContext.f15510B & Integer.MAX_VALUE);
            stringBuilder.append(((traceContext.f15510B & Process.WAIT_RESULT_TIMEOUT) == Process.WAIT_RESULT_TIMEOUT ? 1 : null) != null ? " (remote process)" : JsonProperty.USE_DEFAULT_NAME);
            stringBuilder.toString();
        }
    }

    public final void handleMessage(Message message) {
        TraceContext traceContext = (TraceContext) message.obj;
        int i = message.what;
        if (i != 0) {
            switch (i) {
                case 2:
                    synchronized (this) {
                        removeMessages(0, traceContext);
                        if ((traceContext.f15517I & 2) != 0) {
                            Logger.postCreateBackwardTrace(traceContext.f15519K);
                        }
                        Logger.postPreCloseTrace(traceContext.f15519K);
                        if (this.f153B != null) {
                            this.f153B.GEA(traceContext);
                        }
                        Logger.postCloseTrace(traceContext.f15519K);
                        break;
                    }
                    return;
                case 3:
                    synchronized (this) {
                        removeMessages(0, traceContext);
                        if (this.f153B != null) {
                            this.f153B.CEA(traceContext);
                            break;
                        }
                    }
                    return;
                default:
                    return;
            }
            return;
        }
        long j = traceContext.f15519K;
        if (AnonymousClass01H.f152B) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Timing out trace ");
            stringBuilder.append(j);
            stringBuilder.toString();
        }
        AnonymousClass0Ey.f2041H.m1494G(j);
    }
}
