package X;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.List;

/* renamed from: X.3wA */
public class AnonymousClass3wA extends AnonymousClass2xJ {
    /* renamed from: B */
    private final String f47126B;
    /* renamed from: C */
    private final AnonymousClass2xI f47127C;
    /* renamed from: D */
    private final AnonymousClass3wD f47128D;

    public AnonymousClass3wA(String str, long j, Format format, String str2, AnonymousClass3wC anonymousClass3wC, List list, String str3, long j2) {
        String str4 = str3;
        String str5 = str;
        long j3 = j;
        Format format2 = format;
        super(str5, j3, format2, str2, anonymousClass3wC, list);
        Uri.parse(str2);
        list = anonymousClass3wC.f47132B;
        r4.f47127C = list <= 0 ? null : new AnonymousClass2xI(null, anonymousClass3wC.f47133C, list);
        AnonymousClass3wD anonymousClass3wD = null;
        if (str4 == null) {
            if (str5 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str5);
                stringBuilder.append(".");
                stringBuilder.append(format2.f35568R);
                stringBuilder.append(".");
                stringBuilder.append(j3);
                str4 = stringBuilder.toString();
            } else {
                str4 = null;
            }
        }
        r4.f47126B = str4;
        if (r4.f47127C == null) {
            anonymousClass3wD = new AnonymousClass3wD(new AnonymousClass2xI(null, 0, j2));
        }
        r4.f47128D = anonymousClass3wD;
    }

    /* renamed from: A */
    public final String mo4619A() {
        return this.f47126B;
    }

    /* renamed from: B */
    public final AnonymousClass2x7 mo4620B() {
        return this.f47128D;
    }

    /* renamed from: C */
    public final AnonymousClass2xI mo4621C() {
        return this.f47127C;
    }
}
