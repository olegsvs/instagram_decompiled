package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.1zn */
public final class AnonymousClass1zn implements Callable {
    /* renamed from: B */
    private /* synthetic */ SharedPreferences f25112B;
    /* renamed from: C */
    private /* synthetic */ String f25113C;
    /* renamed from: D */
    private /* synthetic */ Integer f25114D;

    public AnonymousClass1zn(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f25112B = sharedPreferences;
        this.f25113C = str;
        this.f25114D = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f25112B.getInt(this.f25113C, this.f25114D.intValue()));
    }
}
