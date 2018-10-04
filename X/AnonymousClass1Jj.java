package X;

import com.facebook.profilo.logger.Logger;
import java.io.OutputStream;

/* renamed from: X.1Jj */
public final class AnonymousClass1Jj extends OutputStream {
    /* renamed from: B */
    private int f17104B;
    /* renamed from: C */
    private OutputStream f17105C;

    public AnonymousClass1Jj(OutputStream outputStream, int i) {
        this.f17105C = outputStream;
        this.f17104B = i;
    }

    public final void close() {
        this.f17105C.close();
    }

    public final void flush() {
        this.f17105C.flush();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OutpuStreamWrapper for ");
        stringBuilder.append(this.f17105C);
        return stringBuilder.toString();
    }

    public final void write(int i) {
        int i2 = AnonymousClass0CI.f1519I;
        int writeEntryWithoutMatch = Logger.writeEntryWithoutMatch(i2, 23, this.f17104B);
        try {
            this.f17105C.write(i);
            Logger.writeEntry(i2, 24, this.f17104B, writeEntryWithoutMatch);
        } catch (Throwable th) {
            Logger.writeEntry(AnonymousClass0CI.f1519I, 24, this.f17104B, writeEntryWithoutMatch);
        }
    }

    public final void write(byte[] bArr) {
        int writeEntryWithoutMatch = Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 23, this.f17104B);
        try {
            this.f17105C.write(bArr);
        } finally {
            Logger.writeEntry(AnonymousClass0CI.f1513C, 24, this.f17104B, writeEntryWithoutMatch);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = AnonymousClass0CI.f1519I;
        int writeEntryWithoutMatch = Logger.writeEntryWithoutMatch(i3, 23, this.f17104B);
        try {
            this.f17105C.write(bArr, i, i2);
            Logger.writeEntry(i3, 24, this.f17104B, writeEntryWithoutMatch);
        } catch (Throwable th) {
            Logger.writeEntry(AnonymousClass0CI.f1519I, 24, this.f17104B, writeEntryWithoutMatch);
        }
    }
}
