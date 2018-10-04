package X;

import android.content.Context;
import com.google.android.gms.internal.zzccz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5fl */
public final class AnonymousClass5fl {
    /* renamed from: B */
    public final Map f68003B = new HashMap();
    /* renamed from: C */
    public final AnonymousClass5fp f68004C;
    /* renamed from: D */
    public boolean f68005D = false;
    /* renamed from: E */
    public final Map f68006E = new HashMap();

    public AnonymousClass5fl(Context context, AnonymousClass5fp anonymousClass5fp) {
        this.f68004C = anonymousClass5fp;
    }

    /* renamed from: A */
    public final void m28242A() {
        if (this.f68005D) {
            try {
                this.f68004C.bYA();
                ((zzccz) this.f68004C.cYA()).qXA(false);
                this.f68005D = false;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
