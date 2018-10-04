package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.react.bridge.BaseJavaModule;

/* renamed from: X.0CI */
public final class AnonymousClass0CI extends AnonymousClass0CJ {
    /* renamed from: B */
    public static final int f1512B = (((((((f1513C | f1516F) | f1520J) | f1519I) | f1521K) | f1514D) | f1518H) | f1515E);
    /* renamed from: C */
    public static final int f1513C = ProvidersRegistry.m1051C(BaseJavaModule.METHOD_TYPE_ASYNC);
    /* renamed from: D */
    public static final int f1514D = ProvidersRegistry.m1051C("class_load");
    /* renamed from: E */
    public static final int f1515E = ProvidersRegistry.m1051C("fbsystrace");
    /* renamed from: F */
    public static final int f1516F = ProvidersRegistry.m1051C("lifecycle");
    /* renamed from: G */
    public static final int f1517G = ProvidersRegistry.m1051C("liger");
    /* renamed from: H */
    public static final int f1518H = ProvidersRegistry.m1051C("main_thread_messages");
    /* renamed from: I */
    public static final int f1519I = ProvidersRegistry.m1051C("other");
    /* renamed from: J */
    public static final int f1520J = ProvidersRegistry.m1051C("qpl");
    /* renamed from: K */
    public static final int f1521K = ProvidersRegistry.m1051C("user_counters");

    public final void disable() {
    }

    public final void enable() {
    }

    static {
        ProvidersRegistry.m1051C("liger_http2");
    }

    public final int getSupportedProviders() {
        return f1512B;
    }

    public final int getTracingProviders() {
        TraceContext traceContext = this.f1522B;
        if (traceContext == null) {
            return 0;
        }
        return traceContext.f15515G & f1512B;
    }
}
