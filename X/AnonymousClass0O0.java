package X;

/* renamed from: X.0O0 */
public final class AnonymousClass0O0 extends AnonymousClass0Iw {
    public AnonymousClass0O0(AnonymousClass0G8 anonymousClass0G8) {
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.m5859I(this, 1414509971);
        AnonymousClass0FM.m1565B("init_to_reel_fetch_req_started", "AppStartPerformanceTracer");
        AnonymousClass0F9 C = AnonymousClass0F9.m1509C();
        AnonymousClass0F9.m1510D(C, "STORIES_REQUEST_STARTED");
        AnonymousClass0FB anonymousClass0FB = C.f2070C;
        if (anonymousClass0FB != null) {
            anonymousClass0FB.f2083H = true;
        }
        AnonymousClass0cQ.m5858H(this, 415491580, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 765140142);
        AnonymousClass3Uw anonymousClass3Uw = (AnonymousClass3Uw) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 386056702);
        AnonymousClass0F9.m1510D(AnonymousClass0F9.m1509C(), "STORIES_RESPONSE_PARSED");
        AnonymousClass0cQ.m5858H(this, 239446737, I2);
        AnonymousClass0cQ.m5858H(this, -714535235, I);
    }
}
