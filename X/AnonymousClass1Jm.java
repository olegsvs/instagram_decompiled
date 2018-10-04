package X;

import com.facebook.profilo.logger.Logger;
import java.io.InputStream;

/* renamed from: X.1Jm */
public final class AnonymousClass1Jm extends InputStream {
    /* renamed from: B */
    private int f17110B;
    /* renamed from: C */
    private InputStream f17111C;

    public AnonymousClass1Jm(InputStream inputStream, int i) {
        this.f17111C = inputStream;
        this.f17110B = i;
    }

    public final int available() {
        return this.f17111C.available();
    }

    public final void close() {
        this.f17111C.close();
    }

    public final synchronized void mark(int i) {
        this.f17111C.mark(i);
    }

    public final boolean markSupported() {
        return this.f17111C.markSupported();
    }

    public final int read() {
        int writeEntryWithoutMatch = Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 23, this.f17110B);
        try {
            int read = this.f17111C.read();
            return read;
        } finally {
            Logger.writeEntry(AnonymousClass0CI.f1519I, 24, this.f17110B, writeEntryWithoutMatch);
        }
    }

    public final int read(byte[] bArr) {
        int writeEntryWithoutMatch = Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 23, this.f17110B);
        try {
            int read = this.f17111C.read(bArr);
            return read;
        } finally {
            Logger.writeEntry(AnonymousClass0CI.f1519I, 24, this.f17110B, writeEntryWithoutMatch);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int writeEntryWithoutMatch = Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 23, this.f17110B);
        try {
            int read = this.f17111C.read(bArr, i, i2);
            return read;
        } finally {
            Logger.writeEntry(AnonymousClass0CI.f1519I, 24, this.f17110B, writeEntryWithoutMatch);
        }
    }

    public final synchronized void reset() {
        this.f17111C.reset();
    }

    public final long skip(long j) {
        return this.f17111C.skip(j);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InputStreamWrapper for ");
        stringBuilder.append(this.f17111C);
        return stringBuilder.toString();
    }
}
