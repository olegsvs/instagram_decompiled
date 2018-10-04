package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.1zm */
public final class AnonymousClass1zm implements Callable {
    /* renamed from: B */
    private /* synthetic */ SharedPreferences f25109B;
    /* renamed from: C */
    private /* synthetic */ String f25110C;
    /* renamed from: D */
    private /* synthetic */ Boolean f25111D;

    public AnonymousClass1zm(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f25109B = sharedPreferences;
        this.f25110C = str;
        this.f25111D = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f25109B.getBoolean(this.f25110C, this.f25111D.booleanValue()));
    }
}
