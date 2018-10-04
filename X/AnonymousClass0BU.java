package X;

import com.facebook.xzdecoder.XzInputStream;
import java.io.InputStream;

/* renamed from: X.0BU */
public final class AnonymousClass0BU extends AnonymousClass1Nb {
    /* renamed from: B */
    public final XzInputStream f1377B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0BV f1378C;
    /* renamed from: D */
    private int f1379D;

    public AnonymousClass0BU(AnonymousClass0BV anonymousClass0BV) {
        this.f1378C = anonymousClass0BV;
        InputStream inputStream = anonymousClass0BV.f1382D.getInputStream(anonymousClass0BV.f1381C);
        try {
            this.f1377B = new XzInputStream(inputStream);
            if (!mo155A()) {
                close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* renamed from: A */
    public final boolean mo155A() {
        int i = this.f1379D;
        while (i < this.f1378C.f1380B.length && !this.f1378C.f1380B[i].f1375C) {
            i++;
        }
        return i < this.f1378C.f1380B.length;
    }

    /* renamed from: B */
    public final AnonymousClass090 mo156B() {
        AnonymousClass090 anonymousClass090;
        while (true) {
            anonymousClass090 = null;
            if (this.f1379D >= this.f1378C.f1380B.length) {
                break;
            }
            AnonymousClass0BT[] anonymousClass0BTArr = this.f1378C.f1380B;
            int i = this.f1379D;
            this.f1379D = i + 1;
            AnonymousClass1NZ anonymousClass1NZ = anonymousClass0BTArr[i];
            InputStream anonymousClass092 = new AnonymousClass092(this, anonymousClass1NZ.f1376D);
            try {
                anonymousClass090 = new AnonymousClass090(anonymousClass1NZ, anonymousClass092);
                if (anonymousClass1NZ.f1375C) {
                    break;
                }
                anonymousClass090.close();
            } catch (Throwable th) {
                anonymousClass092.close();
            }
        }
        return anonymousClass090;
    }

    public final void close() {
        this.f1377B.close();
    }
}
