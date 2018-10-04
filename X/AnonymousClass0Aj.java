package X;

/* renamed from: X.0Aj */
public final class AnonymousClass0Aj {
    /* renamed from: B */
    public final AnonymousClass07m f1279B;
    /* renamed from: C */
    public final long f1280C;
    /* renamed from: D */
    public final int f1281D;
    /* renamed from: E */
    public final AnonymousClass086 f1282E;
    /* renamed from: F */
    public volatile AnonymousClass06Y f1283F;

    public AnonymousClass0Aj(AnonymousClass07m anonymousClass07m, AnonymousClass086 anonymousClass086, int i, long j) {
        this.f1279B = anonymousClass07m;
        this.f1282E = anonymousClass086;
        this.f1281D = i;
        this.f1280C = j;
    }

    /* renamed from: A */
    public final void m708A() {
        if (this.f1283F != null) {
            this.f1283F.cancel(false);
        }
    }

    /* renamed from: B */
    public final void m709B(Throwable th) {
        synchronized (this) {
        }
        m708A();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MqttOperation{mResponseType=");
        stringBuilder.append(this.f1282E);
        stringBuilder.append(", mOperationId=");
        stringBuilder.append(this.f1281D);
        stringBuilder.append(", mCreationTime=");
        stringBuilder.append(this.f1280C);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
