package X;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.instagram.video.live.streaming.common.BroadcastType;

/* renamed from: X.68w */
public final class AnonymousClass68w implements AnonymousClass5OB {
    /* renamed from: B */
    public long f72222B;
    /* renamed from: C */
    public final AnonymousClass5aZ f72223C;
    /* renamed from: D */
    public final String f72224D;
    /* renamed from: E */
    public final AnonymousClass5O9 f72225E;
    /* renamed from: F */
    public final Handler f72226F = new Handler();
    /* renamed from: G */
    public final AnonymousClass5aa f72227G;
    /* renamed from: H */
    public final AnonymousClass5Nw f72228H;
    /* renamed from: I */
    public final AnonymousClass5Rh f72229I;
    /* renamed from: J */
    public final AnonymousClass68P f72230J;
    /* renamed from: K */
    public AnonymousClass485 f72231K = AnonymousClass485.NORMAL;
    /* renamed from: L */
    public boolean f72232L;
    /* renamed from: M */
    public AnonymousClass3AL f72233M;
    /* renamed from: N */
    public final Runnable f72234N = new AnonymousClass68q(this);
    /* renamed from: O */
    public final boolean f72235O;
    /* renamed from: P */
    public AnonymousClass3AL f72236P;
    /* renamed from: Q */
    public AnonymousClass3AG f72237Q;
    /* renamed from: R */
    public final AnonymousClass47L f72238R;
    /* renamed from: S */
    private final AnonymousClass67w f72239S;
    /* renamed from: T */
    private AnonymousClass68k f72240T;

    public final boolean NX() {
        return true;
    }

    public AnonymousClass68w(Context context, Looper looper, AnonymousClass47L anonymousClass47L, AnonymousClass5Nl anonymousClass5Nl, int i, int i2, AnonymousClass5aa anonymousClass5aa, AnonymousClass5aZ anonymousClass5aZ, AnonymousClass5Nw anonymousClass5Nw, AnonymousClass5O9 anonymousClass5O9) {
        this.f72238R = (AnonymousClass47L) AnonymousClass0LH.E(anonymousClass47L);
        this.f72227G = (AnonymousClass5aa) AnonymousClass0LH.E(anonymousClass5aa);
        this.f72223C = (AnonymousClass5aZ) AnonymousClass0LH.E(anonymousClass5aZ);
        this.f72228H = anonymousClass5Nw;
        this.f72225E = (AnonymousClass5O9) AnonymousClass0LH.E(anonymousClass5O9);
        Integer.valueOf(this.f72238R.f50470u);
        Integer.valueOf(this.f72238R.f50469t);
        this.f72223C.m27727H(this.f72238R.f50470u, this.f72238R.f50469t);
        if (this.f72238R.f50447X.booleanValue()) {
            AnonymousClass5aZ anonymousClass5aZ2 = this.f72223C;
            anonymousClass5aZ2.f66642E = new Pair(Integer.valueOf(this.f72238R.f50443T), Integer.valueOf(this.f72238R.f50442S));
            AnonymousClass5aZ.m27719C(anonymousClass5aZ2);
        }
        boolean z = (anonymousClass47L.f50450a.booleanValue() || AnonymousClass2NH.C() || !((Boolean) AnonymousClass0CC.QQ.G()).booleanValue()) ? false : true;
        this.f72239S = new AnonymousClass67w(z);
        AnonymousClass67w anonymousClass67w = this.f72239S;
        int i3 = this.f72238R.f50470u;
        int i4 = this.f72238R.f50469t;
        anonymousClass67w.f72039D = i3;
        anonymousClass67w.f72038C = i4;
        anonymousClass67w.f72041F = (((float) i) * 1.0f) / ((float) i2);
        this.f72239S.f72040E = new AnonymousClass6GK(this);
        if (((Boolean) AnonymousClass0CC.XQ.G()).booleanValue()) {
            MediaCodecInfo C = AnonymousClass488.C("video/avc");
            this.f72224D = C != null ? C.getName() : "unsupported";
        } else {
            this.f72224D = null;
        }
        boolean booleanValue = ((Boolean) AnonymousClass0CC.UQ.G()).booleanValue();
        boolean booleanValue2 = ((Boolean) AnonymousClass0CC.VQ.G()).booleanValue();
        this.f72235O = anonymousClass5Nl.f62842F;
        this.f72230J = new AnonymousClass68P(context);
        boolean F = AnonymousClass0FZ.B().F();
        this.f72229I = new AnonymousClass5Rh(this.f72238R, this.f72239S, looper, new XAnalyticsAdapterHolder(new AnonymousClass6GL(booleanValue, booleanValue2)), this.f72230J, booleanValue);
        this.f72229I.f63432N.f63457L.set(F);
    }

    public final void DW(AnonymousClass3AG anonymousClass3AG) {
        this.f72240T = new AnonymousClass68k(this.f72238R.f50454e.doubleValue(), new AnonymousClass68r(this, anonymousClass3AG), this.f72227G);
        this.f72229I.f63439U = this.f72240T;
        this.f72229I.f63440V = new AnonymousClass68v(this);
        Handler handler = this.f72229I.f63438T;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(0));
    }

    public final BroadcastType FJ() {
        return BroadcastType.LIVESWAP_RTMP;
    }

    public final long LT() {
        return this.f72222B;
    }

    public final void NJA(boolean z, AnonymousClass3AL anonymousClass3AL) {
        Boolean.valueOf(z);
        AnonymousClass68k anonymousClass68k = this.f72240T;
        if (anonymousClass68k != null) {
            AnonymousClass0OR.G(anonymousClass68k.f72181B, anonymousClass68k.f72183D, 962847893);
        }
        this.f72233M = new AnonymousClass68s(this, anonymousClass3AL);
        Handler handler = this.f72229I.f63438T;
        handler.sendMessage(handler.obtainMessage(4, Boolean.valueOf(z)));
        this.f72227G.m27739C(z ? "stopBroadcastAndSeal" : "stopBroadcastNoSeal");
        AnonymousClass0OR.G(this.f72226F, null, 277538122);
        this.f72239S.f72040E = null;
    }

    public final void Pc() {
        Handler handler = this.f72229I.f63438T;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(3));
    }

    public final void UWA() {
        if (this.f72232L) {
            boolean z = ((Integer) AnonymousClass0CC.RQ.G()).intValue() == 2;
            Handler handler = this.f72229I.f63438T;
            handler.sendMessage(handler.obtainMessage(12, Boolean.valueOf(z)));
            AnonymousClass5aZ anonymousClass5aZ = this.f72223C;
            anonymousClass5aZ.f66651N = (double) this.f72229I.m26537A();
            AnonymousClass5aZ.m27719C(anonymousClass5aZ);
        }
    }

    public final void ZUA(AnonymousClass3AL anonymousClass3AL) {
        this.f72236P = new AnonymousClass68t(this, anonymousClass3AL);
        anonymousClass3AL = this.f72229I.f63438T;
        anonymousClass3AL.sendMessageAtFrontOfQueue(anonymousClass3AL.obtainMessage(7, Float.valueOf(1.0f)));
    }

    public final void lMA(boolean z) {
        this.f72229I.f63432N.f63457L.set(z);
    }

    public final void zUA(boolean z, AnonymousClass3AG anonymousClass3AG) {
        AnonymousClass0OR.G(this.f72226F, this.f72234N, -1775979036);
        this.f72237Q = anonymousClass3AG;
        AnonymousClass5Rk anonymousClass5Rk = this.f72229I.f63432N;
        synchronized (anonymousClass5Rk) {
            anonymousClass5Rk.f63452G.set(false);
            anonymousClass5Rk.f63453H.set(false);
        }
        Handler handler = this.f72229I.f63438T;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(2, Boolean.valueOf(z)));
    }
}
