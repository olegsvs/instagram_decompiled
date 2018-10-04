package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.0NT */
public abstract class AnonymousClass0NT {
    /* renamed from: C */
    public abstract void mo893C();

    /* renamed from: D */
    public abstract String mo894D();

    /* renamed from: E */
    public abstract String mo895E();

    /* renamed from: F */
    public abstract long mo896F();

    /* renamed from: A */
    public final AnonymousClass0NN m3325A(String str) {
        return m3324E(AnonymousClass0NN.m3292C(str, mo894D()));
    }

    /* renamed from: B */
    public final AnonymousClass0NN m3326B(String str, AnonymousClass0EE anonymousClass0EE) {
        return m3324E(AnonymousClass0NN.m3291B(str, anonymousClass0EE));
    }

    /* renamed from: D */
    public static String m3323D(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("waterfall_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: E */
    private synchronized AnonymousClass0NN m3324E(AnonymousClass0NN anonymousClass0NN) {
        long currentTimeMillis;
        mo893C();
        currentTimeMillis = System.currentTimeMillis();
        return anonymousClass0NN.m3298F("waterfall_id", mo895E()).m3295C(TraceFieldType.StartTime, mo896F()).m3295C("current_time", currentTimeMillis).m3295C("elapsed_time", currentTimeMillis - mo896F());
    }
}
