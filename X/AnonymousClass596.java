package X;

/* renamed from: X.596 */
public final class AnonymousClass596 implements AnonymousClass0EJ {
    public final void onAppForegrounded() {
    }

    public final void onAppBackgrounded() {
        if (AnonymousClass0Nb.f3595C) {
            String str;
            AnonymousClass0Nd anonymousClass0Nd = AnonymousClass0Nc.D().f3633m;
            synchronized (anonymousClass0Nd.f3652F) {
                str = anonymousClass0Nd.f3650D;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Camera leak detected after app backgrounded. Product name: ");
            stringBuilder.append(str);
            AnonymousClass0Gn.D("camera_leak", stringBuilder.toString(), 1);
        }
    }
}
