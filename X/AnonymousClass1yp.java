package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.zzbej;

/* renamed from: X.1yp */
public class AnonymousClass1yp {
    /* renamed from: B */
    public final Context f24961B;
    /* renamed from: C */
    public final int f24962C;
    /* renamed from: D */
    public final AnonymousClass1zz f24963D;
    /* renamed from: E */
    public final AnonymousClass1yt f24964E;
    /* renamed from: F */
    public final AnonymousClass20c f24965F;
    /* renamed from: G */
    public final AnonymousClass20K f24966G;
    /* renamed from: H */
    public final AnonymousClass1yl f24967H;
    /* renamed from: I */
    public final Looper f24968I;
    /* renamed from: J */
    private final AnonymousClass1yh f24969J;
    /* renamed from: K */
    private final Account f24970K;

    public AnonymousClass1yp(Context context, AnonymousClass1yl anonymousClass1yl, AnonymousClass1yh anonymousClass1yh, AnonymousClass1yo anonymousClass1yo) {
        AnonymousClass1Ew.E(context, "Null context is not permitted.");
        AnonymousClass1Ew.E(anonymousClass1yl, "Api must not be null.");
        AnonymousClass1Ew.E(anonymousClass1yo, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f24961B = context.getApplicationContext();
        this.f24967H = anonymousClass1yl;
        this.f24969J = anonymousClass1yh;
        this.f24968I = anonymousClass1yo.f24960D;
        this.f24963D = new AnonymousClass1zz(this.f24967H, this.f24969J);
        this.f24964E = new AnonymousClass2do(this);
        AnonymousClass20K B = AnonymousClass20K.m14145B(this.f24961B);
        this.f24966G = B;
        this.f24962C = B.f25186J.getAndIncrement();
        this.f24965F = anonymousClass1yo.f24959C;
        this.f24970K = anonymousClass1yo.f24958B;
        Handler handler = this.f24966G.f25179C;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public AnonymousClass1yp(Context context, AnonymousClass1yl anonymousClass1yl, AnonymousClass1yh anonymousClass1yh, AnonymousClass20c anonymousClass20c) {
        AnonymousClass1z3 anonymousClass1z3 = new AnonymousClass1z3();
        AnonymousClass1Ew.E(anonymousClass20c, "StatusExceptionMapper must not be null.");
        anonymousClass1z3.f24994B = anonymousClass20c;
        this(context, anonymousClass1yl, anonymousClass1yh, anonymousClass1z3.m14021A());
    }

    public AnonymousClass1yp(Context context, AnonymousClass1yl anonymousClass1yl, Looper looper) {
        AnonymousClass1Ew.E(context, "Null context is not permitted.");
        AnonymousClass1Ew.E(anonymousClass1yl, "Api must not be null.");
        AnonymousClass1Ew.E(looper, "Looper must not be null.");
        this.f24961B = context.getApplicationContext();
        this.f24967H = anonymousClass1yl;
        this.f24969J = null;
        this.f24968I = looper;
        this.f24963D = new AnonymousClass1zz(anonymousClass1yl);
        this.f24964E = new AnonymousClass2do(this);
        AnonymousClass20K B = AnonymousClass20K.m14145B(this.f24961B);
        this.f24966G = B;
        this.f24962C = B.f25186J.getAndIncrement();
        this.f24965F = new AnonymousClass2Sn();
        this.f24970K = null;
    }

    /* renamed from: B */
    public static final AnonymousClass2dk m13991B(AnonymousClass1yp anonymousClass1yp, int i, AnonymousClass2dk anonymousClass2dk) {
        anonymousClass2dk.m15841K();
        AnonymousClass20K anonymousClass20K = anonymousClass1yp.f24966G;
        AnonymousClass1zy anonymousClass2Sl = new AnonymousClass2Sl(i, anonymousClass2dk);
        Handler handler = anonymousClass20K.f25179C;
        handler.sendMessage(handler.obtainMessage(4, new AnonymousClass20W(anonymousClass2Sl, anonymousClass20K.f25187K.get(), anonymousClass1yp)));
        return anonymousClass2dk;
    }

    /* renamed from: A */
    public AnonymousClass2SU mo3085A(Looper looper, AnonymousClass2dn anonymousClass2dn) {
        AnonymousClass1yq anonymousClass1yq = new AnonymousClass1yq(this.f24961B);
        anonymousClass1yq.f24979J = this.f24970K;
        return this.f24967H.m13988A().mo3542B(this.f24961B, looper, anonymousClass1yq.m13996C(), this.f24969J, anonymousClass2dn, anonymousClass2dn);
    }

    /* renamed from: B */
    public zzbej mo3086B(Context context, Handler handler) {
        return new zzbej(context, handler);
    }
}
