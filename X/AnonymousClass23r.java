package X;

import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;

/* renamed from: X.23r */
public abstract class AnonymousClass23r implements AnonymousClass0RB {
    /* renamed from: A */
    public abstract AnonymousClass0Pp mo3762A(JsonParser jsonParser);

    /* renamed from: B */
    public final AnonymousClass0Pp m14309B(AnonymousClass0aE anonymousClass0aE) {
        Closeable closeable;
        Throwable th;
        Closeable closeable2 = null;
        try {
            closeable = anonymousClass0aE.f6476D;
            try {
                PrintStream printStream = System.out;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("entity = ");
                stringBuilder.append(closeable);
                printStream.println(stringBuilder.toString());
                if (closeable != null) {
                    closeable2 = AnonymousClass0Lm.f3274B.createParser(closeable.UJ());
                    try {
                        closeable2.nextToken();
                        if (closeable2.getCurrentToken() == null) {
                            throw new IOException("Response body is empty");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        AnonymousClass0Du.C(closeable2);
                        AnonymousClass0Du.C(closeable);
                        throw th;
                    }
                }
                AnonymousClass0Pp A = mo3762A(closeable2);
                A.setStatusCode(anonymousClass0aE.f6477E);
                AnonymousClass0Du.C(closeable2);
                AnonymousClass0Du.C(closeable);
                return A;
            } catch (Throwable th3) {
                th = th3;
                AnonymousClass0Du.C(closeable2);
                AnonymousClass0Du.C(closeable);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            AnonymousClass0Du.C(closeable2);
            AnonymousClass0Du.C(closeable);
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ Object VVA(Object obj) {
        return m14309B((AnonymousClass0aE) obj);
    }
}
