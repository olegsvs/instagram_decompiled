package X;

import java.util.List;

/* renamed from: X.3Ox */
public abstract class AnonymousClass3Ox {
    /* renamed from: B */
    public static AnonymousClass3Ox f40799B;

    /* renamed from: A */
    public abstract List m19526A();

    /* renamed from: B */
    public abstract AnonymousClass3UU m19527B(int i);

    /* renamed from: C */
    public abstract String m19528C(int i);

    /* renamed from: D */
    public abstract String m19529D(int i);

    /* renamed from: E */
    public abstract AnonymousClass3UU m19530E();

    /* renamed from: B */
    public static AnonymousClass3Ox m19525B() {
        if (f40799B == null) {
            try {
                f40799B = (AnonymousClass3Ox) Class.forName("com.instagram.filterkit.impl.FilterFactoryImpl").newInstance();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return f40799B;
    }
}
