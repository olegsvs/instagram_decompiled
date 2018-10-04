package X;

import android.net.Uri;
import java.io.File;
import java.util.Map;

/* renamed from: X.43X */
public final class AnonymousClass43X implements AnonymousClass3up {
    /* renamed from: B */
    private AnonymousClass2t7 f49095B;
    /* renamed from: C */
    private final AnonymousClass2t7 f49096C;
    /* renamed from: D */
    private final Map f49097D;

    public final void MWA(int i) {
    }

    public final void cancel() {
    }

    public AnonymousClass43X(String str, AnonymousClass2t7 anonymousClass2t7, Map map) {
        this.f49096C = anonymousClass2t7;
        this.f49097D = map;
    }

    public final void close() {
        AnonymousClass2t7 anonymousClass2t7 = this.f49095B;
        if (anonymousClass2t7 != null) {
            anonymousClass2t7.close();
            this.f49095B = null;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        AnonymousClass2t7 anonymousClass2t7 = this.f49095B;
        if (anonymousClass2t7 == null) {
            return -1;
        }
        return anonymousClass2t7.read(bArr, i, i2);
    }

    public final long tGA(AnonymousClass2tB anonymousClass2tB) {
        String str;
        AnonymousClass2tB anonymousClass2tB2 = anonymousClass2tB;
        if (this.f49097D.size() == 1) {
            str = null;
            for (String str2 : r12.f49097D.values()) {
            }
        } else {
            str = (String) r12.f49097D.get(anonymousClass2tB2.f35407I);
        }
        if (str != null) {
            Uri fromFile = Uri.fromFile(new File(str));
            long j = anonymousClass2tB2.f35400B;
            long j2 = anonymousClass2tB2.f35410L;
            long j3 = anonymousClass2tB2.f35408J;
            String str3 = anonymousClass2tB2.f35407I;
            int i = anonymousClass2tB2.f35405G;
            int i2 = anonymousClass2tB2.f35402D;
            int i3 = anonymousClass2tB2.f35415Q;
            int i4 = anonymousClass2tB2.f35414P;
            String str4 = anonymousClass2tB2.f35404F;
            long j4 = j3;
            int i5 = i;
            int i6 = i2;
            int i7 = i3;
            int i8 = i4;
            String str5 = str4;
            long j5 = j;
            long j6 = j2;
            AnonymousClass2tB anonymousClass2tB3 = new AnonymousClass2tB(fromFile, null, j5, j6, j4, str3, i5, i6, i7, i8, str5, anonymousClass2tB2.f35409K, anonymousClass2tB2.f35401C, anonymousClass2tB2.f35406H, anonymousClass2tB2.f35403E, anonymousClass2tB2.f35417S, anonymousClass2tB2.f35412N);
            r12.f49095B = new AnonymousClass43p();
            anonymousClass2tB2 = anonymousClass2tB3;
        } else {
            r12.f49095B = r12.f49096C;
        }
        return r12.f49095B.tGA(anonymousClass2tB2);
    }
}
