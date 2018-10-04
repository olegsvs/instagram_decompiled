package X;

import android.content.SharedPreferences;

/* renamed from: X.0NV */
public final class AnonymousClass0NV {
    /* renamed from: B */
    private final long f3572B;
    /* renamed from: C */
    private final String f3573C;
    /* renamed from: D */
    private final SharedPreferences f3574D;

    public AnonymousClass0NV(SharedPreferences sharedPreferences, String str, long j) {
        this.f3574D = sharedPreferences;
        this.f3573C = str;
        this.f3572B = j;
    }

    /* renamed from: A */
    public final void m3332A() {
        this.f3574D.edit().remove(this.f3573C).apply();
    }

    /* renamed from: B */
    public final Long m3333B() {
        return Long.valueOf(this.f3574D.getLong(this.f3573C, this.f3572B));
    }

    /* renamed from: C */
    public final void m3334C(Long l) {
        if (l == null) {
            m3332A();
        } else {
            this.f3574D.edit().putLong(this.f3573C, l.longValue()).apply();
        }
    }
}
