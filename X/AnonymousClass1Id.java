package X;

import android.support.v4.app.INotificationSideChannel;

/* renamed from: X.1Id */
public final class AnonymousClass1Id implements AnonymousClass0Rb {
    /* renamed from: B */
    public final boolean f16891B = false;
    /* renamed from: C */
    public final int f16892C;
    /* renamed from: D */
    public final String f16893D;
    /* renamed from: E */
    public final String f16894E;

    public AnonymousClass1Id(String str, int i, String str2) {
        this.f16893D = str;
        this.f16892C = i;
        this.f16894E = str2;
    }

    public final void DMA(INotificationSideChannel iNotificationSideChannel) {
        if (this.f16891B) {
            iNotificationSideChannel.AE(this.f16893D);
        } else {
            iNotificationSideChannel.yD(this.f16893D, this.f16892C, this.f16894E);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CancelTask[");
        stringBuilder.append("packageName:");
        stringBuilder.append(this.f16893D);
        stringBuilder.append(", id:");
        stringBuilder.append(this.f16892C);
        stringBuilder.append(", tag:");
        stringBuilder.append(this.f16894E);
        stringBuilder.append(", all:");
        stringBuilder.append(this.f16891B);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
