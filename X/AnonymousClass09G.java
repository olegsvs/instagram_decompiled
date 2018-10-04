package X;

import com.facebook.profilo.logger.Logger;

/* renamed from: X.09G */
public final class AnonymousClass09G implements Runnable {
    /* renamed from: B */
    private int f1055B;
    /* renamed from: C */
    private int f1056C;
    /* renamed from: D */
    private Runnable f1057D;

    public AnonymousClass09G(Runnable runnable, int i, int i2) {
        this.f1057D = runnable;
        this.f1056C = i;
        this.f1055B = i2;
    }

    public final void run() {
        int writeEntry = Logger.writeEntry(AnonymousClass0CI.f1513C, 12, this.f1055B, this.f1056C);
        try {
            this.f1057D.run();
        } finally {
            Logger.writeEntry(AnonymousClass0CI.f1513C, 13, this.f1055B, writeEntry);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RunnableWrapper for ");
        stringBuilder.append(this.f1057D);
        return stringBuilder.toString();
    }
}
