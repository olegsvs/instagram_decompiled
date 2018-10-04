package X;

import java.io.Writer;

/* renamed from: X.1mT */
public final class AnonymousClass1mT extends Writer {
    /* renamed from: B */
    private StringBuilder f22601B = new StringBuilder(128);

    public AnonymousClass1mT(String str) {
    }

    /* renamed from: B */
    private void m13004B() {
        if (this.f22601B.length() > 0) {
            this.f22601B.toString();
            StringBuilder stringBuilder = this.f22601B;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    public final void close() {
        m13004B();
    }

    public final void flush() {
        m13004B();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m13004B();
            } else {
                this.f22601B.append(c);
            }
        }
    }
}
