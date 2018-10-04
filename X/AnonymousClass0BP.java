package X;

import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: X.0BP */
public final class AnonymousClass0BP extends AnonymousClass1Nb {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0BQ f1370B;
    /* renamed from: C */
    private int f1371C;

    public AnonymousClass0BP(AnonymousClass0BQ anonymousClass0BQ) {
        this.f1370B = anonymousClass0BQ;
    }

    /* renamed from: A */
    public final boolean mo155A() {
        return this.f1371C < this.f1370B.f1372B.length;
    }

    /* renamed from: B */
    public final AnonymousClass090 mo156B() {
        AnonymousClass0BR[] anonymousClass0BRArr = this.f1370B.f1372B;
        int i = this.f1371C;
        this.f1371C = i + 1;
        AnonymousClass1NZ anonymousClass1NZ = anonymousClass0BRArr[i];
        InputStream fileInputStream = new FileInputStream(anonymousClass1NZ.f1373B);
        try {
            return new AnonymousClass090(anonymousClass1NZ, fileInputStream);
        } catch (Throwable th) {
            fileInputStream.close();
        }
    }
}
