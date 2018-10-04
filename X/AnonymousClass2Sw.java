package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.zzbej;

/* renamed from: X.2Sw */
public final class AnonymousClass2Sw extends AnonymousClass1yp {
    /* renamed from: B */
    public final AnonymousClass2SU f30662B;
    /* renamed from: C */
    private final AnonymousClass2ST f30663C;
    /* renamed from: D */
    private final AnonymousClass1za f30664D;
    /* renamed from: E */
    private final AnonymousClass2Sr f30665E;

    public AnonymousClass2Sw(Context context, AnonymousClass1yl anonymousClass1yl, Looper looper, AnonymousClass2SU anonymousClass2SU, AnonymousClass2Sr anonymousClass2Sr, AnonymousClass1za anonymousClass1za, AnonymousClass2ST anonymousClass2ST) {
        super(context, anonymousClass1yl, looper);
        this.f30662B = anonymousClass2SU;
        this.f30665E = anonymousClass2Sr;
        this.f30664D = anonymousClass1za;
        this.f30663C = anonymousClass2ST;
        Handler handler = this.f24966G.f25179C;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    /* renamed from: A */
    public final AnonymousClass2SU mo3085A(Looper looper, AnonymousClass2dn anonymousClass2dn) {
        this.f30665E.f30643B = anonymousClass2dn;
        return this.f30662B;
    }

    /* renamed from: B */
    public final zzbej mo3086B(Context context, Handler handler) {
        return new zzbej(context, handler, this.f30664D, this.f30663C);
    }
}
