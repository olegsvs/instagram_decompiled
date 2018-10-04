package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.3qO */
public final class AnonymousClass3qO implements AnonymousClass0RL {
    /* renamed from: B */
    public final Set f45228B = new HashSet();
    /* renamed from: C */
    public final int f45229C;
    /* renamed from: D */
    public final int f45230D;
    /* renamed from: E */
    public final ConcurrentMap f45231E = new AnonymousClass0LF().A(20).C().B();
    /* renamed from: F */
    public final Map f45232F = new HashMap();
    /* renamed from: G */
    private final Context f45233G;

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public AnonymousClass3qO(Context context, int i, int i2) {
        this.f45233G = context;
        this.f45230D = i;
        this.f45229C = i2;
    }

    /* renamed from: A */
    public final void m20894A(AnonymousClass3nn anonymousClass3nn, AnonymousClass3z3 anonymousClass3z3) {
        String B = anonymousClass3nn.m20699B();
        this.f45231E.put(B, anonymousClass3z3);
        if (this.f45232F.containsKey(B)) {
            AnonymousClass3qO.m20893B(this, anonymousClass3nn, (String) this.f45232F.get(B));
        } else if (!this.f45228B.contains(B)) {
            AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass3qN(this, this.f45233G, anonymousClass3nn, anonymousClass3z3));
            anonymousClass0n3.f9990B = new AnonymousClass3qK(this, B, anonymousClass3nn);
            this.f45228B.add(B);
            AnonymousClass0Ix.D(anonymousClass0n3);
        }
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        AnonymousClass0Sy.F(new AnonymousClass3qL(this, anonymousClass0aa));
    }

    /* renamed from: B */
    public static void m20893B(AnonymousClass3qO anonymousClass3qO, AnonymousClass3nn anonymousClass3nn, String str) {
        AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.D(str);
        D.f4646Q = anonymousClass3nn;
        D.C(anonymousClass3qO).B();
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        AnonymousClass0Sy.F(new AnonymousClass3qM(this, anonymousClass0aa, bitmap));
    }
}
