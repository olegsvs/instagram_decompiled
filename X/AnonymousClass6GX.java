package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.View;
import java.util.List;

/* renamed from: X.6GX */
public final class AnonymousClass6GX {
    /* renamed from: B */
    public final AnonymousClass44N f73780B;
    /* renamed from: C */
    public final AnonymousClass69g f73781C;
    /* renamed from: D */
    public AnonymousClass6Gh f73782D;
    /* renamed from: E */
    public AnonymousClass5LW f73783E;
    /* renamed from: F */
    public AnonymousClass6Ga f73784F;
    /* renamed from: G */
    public List f73785G;
    /* renamed from: H */
    public final boolean f73786H;
    /* renamed from: I */
    public boolean f73787I;
    /* renamed from: J */
    public final AnonymousClass5LZ f73788J;
    /* renamed from: K */
    public AnonymousClass5am f73789K;
    /* renamed from: L */
    public final AnonymousClass69h f73790L;
    /* renamed from: M */
    public final AnonymousClass5J0 f73791M;
    /* renamed from: N */
    public final HandlerThread f73792N;
    /* renamed from: O */
    public final AnonymousClass0Uw f73793O;
    /* renamed from: P */
    public final AnonymousClass5Iz f73794P;
    /* renamed from: Q */
    public boolean f73795Q;
    /* renamed from: R */
    public Surface f73796R;
    /* renamed from: S */
    private final Context f73797S;
    /* renamed from: T */
    private final AnonymousClass5O4 f73798T;
    /* renamed from: U */
    private int f73799U;
    /* renamed from: V */
    private int f73800V;
    /* renamed from: W */
    private int f73801W;

    private AnonymousClass6GX(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5J0 anonymousClass5J0, View view, int i, boolean z, AnonymousClass44N anonymousClass44N, AnonymousClass38H anonymousClass38H) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        AnonymousClass44N anonymousClass44N2 = anonymousClass44N;
        this(context, anonymousClass5J0, view, i, z, new HandlerThread("VC Rendering Thread"), anonymousClass44N2, anonymousClass38H != null ? new AnonymousClass5aW(anonymousClass44N2, anonymousClass38H) : new AnonymousClass5aV(anonymousClass0Cm2, anonymousClass44N2, AnonymousClass5Lc.LEGACY, "instagram_vc", AnonymousClass0CC.ui), null, ((Boolean) AnonymousClass0CC.ri.H(anonymousClass0Cm2)).booleanValue());
    }

    public AnonymousClass6GX(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5J0 anonymousClass5J0, View view, AnonymousClass38H anonymousClass38H, int i, boolean z) {
        AnonymousClass38H anonymousClass38H2 = anonymousClass38H;
        this(context, anonymousClass0Cm, anonymousClass5J0, view, i, z, new AnonymousClass44N(anonymousClass0Cm, "instagram_vc"), anonymousClass38H2);
        if (anonymousClass38H != null) {
            this.f73789K = new AnonymousClass5cG(this.f73792N.getLooper(), anonymousClass38H2);
        } else {
            this.f73789K = new AnonymousClass5cH(context, this.f73792N.getLooper());
        }
        this.f73789K.FPA(this.f73798T);
    }

    public AnonymousClass6GX(Context context, AnonymousClass5J0 anonymousClass5J0, View view, int i, boolean z, HandlerThread handlerThread, AnonymousClass44N anonymousClass44N, AnonymousClass5LZ anonymousClass5LZ, AnonymousClass5am anonymousClass5am, boolean z2) {
        this.f73781C = new AnonymousClass69g(this);
        this.f73790L = new AnonymousClass69h(this);
        this.f73798T = new AnonymousClass69k(this);
        this.f73797S = context.getApplicationContext();
        this.f73799U = i;
        this.f73791M = anonymousClass5J0;
        this.f73795Q = z;
        this.f73792N = handlerThread;
        this.f73788J = anonymousClass5LZ;
        this.f73788J.ye(view);
        this.f73789K = anonymousClass5am;
        AnonymousClass5am anonymousClass5am2 = this.f73789K;
        if (anonymousClass5am2 != null) {
            anonymousClass5am2.FPA(this.f73798T);
        }
        this.f73780B = anonymousClass44N;
        AnonymousClass44N anonymousClass44N2 = this.f73780B;
        AnonymousClass69g anonymousClass69g = this.f73781C;
        AnonymousClass0Nc B = AnonymousClass44N.B(anonymousClass44N2);
        if (anonymousClass69g != null) {
            AnonymousClass69x anonymousClass69x;
            B.f3606L.add(anonymousClass69g);
            this.f73794P = new AnonymousClass69i(this);
            this.f73791M.bB(this.f73794P);
            this.f73792N.start();
            this.f73786H = z2;
            AnonymousClass0Uy anonymousClass69j = new AnonymousClass69j(this);
            AnonymousClass0Uw anonymousClass0Uw = new AnonymousClass0Uw("CameraClient", AnonymousClass69x.CAMERA_STOPPED);
            if (z2) {
                anonymousClass0Uw.B(AnonymousClass69x.CAMERA_STOPPED, AnonymousClass69u.class, AnonymousClass69x.SURFACE_CREATION);
                anonymousClass69x = AnonymousClass69x.SURFACE_CREATION;
                anonymousClass0Uw.B(anonymousClass69x, AnonymousClass69v.class, AnonymousClass69x.CAMERA_STOPPING);
                anonymousClass0Uw.B(anonymousClass69x, AnonymousClass69s.class, AnonymousClass69x.CAMERA_STARTING);
            } else {
                anonymousClass0Uw.B(AnonymousClass69x.CAMERA_STOPPED, AnonymousClass69u.class, AnonymousClass69x.CAMERA_STARTING);
            }
            anonymousClass69x = AnonymousClass69x.CAMERA_STARTED;
            anonymousClass0Uw.B(AnonymousClass69x.CAMERA_STARTING, AnonymousClass69q.class, anonymousClass69x);
            Class cls = AnonymousClass69u.class;
            anonymousClass0Uw.B(anonymousClass69x, cls, anonymousClass69x);
            anonymousClass0Uw.D(AnonymousClass69x.CAMERA_STOPPING, cls);
            Class cls2 = AnonymousClass69v.class;
            anonymousClass0Uw.D(AnonymousClass69x.CAMERA_STOPPED, cls2);
            AnonymousClass69x anonymousClass69x2 = AnonymousClass69x.CAMERA_STARTING;
            anonymousClass0Uw.D(anonymousClass69x2, cls2);
            anonymousClass0Uw.D(anonymousClass69x2, AnonymousClass69p.class);
            anonymousClass0Uw.B(anonymousClass69x, AnonymousClass69v.class, AnonymousClass69x.CAMERA_STOPPING);
            anonymousClass0Uw.B(AnonymousClass69x.CAMERA_STOPPING, AnonymousClass69p.class, AnonymousClass69x.CAMERA_STOPPED);
            Class cls3 = AnonymousClass69w.class;
            anonymousClass0Uw.D(AnonymousClass69x.CAMERA_STARTING, cls3);
            anonymousClass69x2 = AnonymousClass69x.CAMERA_STARTED;
            anonymousClass0Uw.B(anonymousClass69x2, cls3, anonymousClass69x2);
            AnonymousClass69x anonymousClass69x3 = AnonymousClass69x.CAMERA_STARTING;
            cls3 = AnonymousClass69r.class;
            anonymousClass69x2 = AnonymousClass69x.CAMERA_STOPPING;
            anonymousClass0Uw.B(anonymousClass69x3, cls3, anonymousClass69x2);
            anonymousClass0Uw.B(AnonymousClass69x.CAMERA_STARTED, cls3, anonymousClass69x2);
            cls3 = AnonymousClass69t.class;
            anonymousClass0Uw.D(AnonymousClass69x.CAMERA_STARTING, cls3);
            anonymousClass0Uw.D(AnonymousClass69x.CAMERA_STARTED, cls3);
            anonymousClass0Uw.D(anonymousClass69x2, cls3);
            anonymousClass0Uw.B(AnonymousClass69x.CAMERA_STOPPED, cls3, AnonymousClass69x.RELEASED);
            this.f73793O = anonymousClass0Uw.A(anonymousClass69j);
            return;
        }
        throw new IllegalArgumentException("listener is required");
    }

    /* renamed from: A */
    public final void m29799A(AnonymousClass6Ga anonymousClass6Ga) {
        AnonymousClass0Sy.C();
        if (this.f73784F != null) {
            AnonymousClass0Gn.G("CameraClient", new IllegalStateException("EncoderSurfaceProvider is already set"));
            return;
        }
        this.f73784F = (AnonymousClass6Ga) AnonymousClass0LH.E(anonymousClass6Ga);
        if (this.f73793O.f5584B == AnonymousClass69x.CAMERA_STARTED) {
            AnonymousClass6GX.m29796F(this, this.f73784F);
        }
    }

    /* renamed from: B */
    public static void m29792B(AnonymousClass6GX anonymousClass6GX, AnonymousClass5LW anonymousClass5LW) {
        anonymousClass6GX.f73783E = anonymousClass5LW;
        anonymousClass6GX.f73789K.IWA(anonymousClass6GX.f73783E.f62421F, anonymousClass6GX.f73783E.f62420E);
        AnonymousClass6GX.m29798H(anonymousClass6GX, anonymousClass6GX.f73801W, anonymousClass6GX.f73800V);
    }

    /* renamed from: C */
    public static void m29793C(AnonymousClass6GX anonymousClass6GX, AnonymousClass69u anonymousClass69u) {
        anonymousClass6GX.f73796R = anonymousClass69u.f72442C;
        anonymousClass6GX.f73801W = anonymousClass69u.f72443D;
        anonymousClass6GX.f73800V = anonymousClass69u.f72441B;
        anonymousClass6GX.f73789K.dSA((Surface) AnonymousClass0LH.E(anonymousClass6GX.f73796R));
    }

    /* renamed from: D */
    public static void m29794D(AnonymousClass6GX anonymousClass6GX, AnonymousClass69u anonymousClass69u) {
        Integer.valueOf(anonymousClass69u.f72443D);
        Integer.valueOf(anonymousClass69u.f72441B);
        if (anonymousClass6GX.f73796R != anonymousClass69u.f72442C) {
            AnonymousClass0Gn.G("CameraClient", new IllegalStateException("Unexpected change of the surface"));
            return;
        }
        if (!(anonymousClass6GX.f73801W == anonymousClass69u.f72443D && anonymousClass6GX.f73800V == anonymousClass69u.f72441B)) {
            anonymousClass6GX.f73801W = anonymousClass69u.f72443D;
            anonymousClass6GX.f73800V = anonymousClass69u.f72441B;
            AnonymousClass6GX.m29798H(anonymousClass6GX, anonymousClass6GX.f73801W, anonymousClass6GX.f73800V);
        }
    }

    /* renamed from: E */
    public static void m29795E(AnonymousClass6GX anonymousClass6GX, SurfaceTexture surfaceTexture) {
        int min = Math.min(anonymousClass6GX.f73799U, anonymousClass6GX.f73801W);
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        anonymousClass6GX.f73788J.WUA(anonymousClass6GX.f73797S, surfaceTexture2, min, (anonymousClass6GX.f73800V * min) / anonymousClass6GX.f73801W, anonymousClass6GX.f73795Q, new AnonymousClass69o(anonymousClass6GX));
    }

    /* renamed from: F */
    public static void m29796F(AnonymousClass6GX anonymousClass6GX, AnonymousClass6Ga anonymousClass6Ga) {
        AnonymousClass0LH.E(anonymousClass6GX.f73783E);
        AnonymousClass3AL anonymousClass69m = new AnonymousClass69m(anonymousClass6GX);
        int i = anonymousClass6GX.f73783E.f62421F;
        int i2 = anonymousClass6GX.f73783E.f62420E;
        int min = Math.min(i, ((Integer) AnonymousClass0CC.Tj.H(anonymousClass6Ga.f73808C)).intValue());
        i2 = (int) (((((float) min) * 1.0f) / ((float) i)) * ((float) i2));
        Integer.valueOf(min);
        Integer.valueOf(i2);
        AnonymousClass3AL.C(anonymousClass69m, anonymousClass6Ga.f73807B.f72477O.m29902A(min, i2));
        anonymousClass6Ga.f73807B.f72477O.startCapture(min, i2, 30);
        AnonymousClass6A5.m29258C(anonymousClass6Ga.f73807B, false);
    }

    /* renamed from: G */
    public static void m29797G(AnonymousClass6GX anonymousClass6GX, AnonymousClass6Ga anonymousClass6Ga) {
        if (anonymousClass6GX.f73785G != null) {
            AnonymousClass3AG anonymousClass69n = new AnonymousClass69n(anonymousClass6GX);
            try {
                anonymousClass6Ga.f73807B.f72477O.stopCapture();
            } catch (Throwable e) {
                AnonymousClass0Dc.Q("VideoCallClient", "Error stopping capture.", e);
            }
            AnonymousClass6A5.m29258C(anonymousClass6Ga.f73807B, true);
            AnonymousClass3AG.C(anonymousClass69n);
        }
    }

    /* renamed from: H */
    private static void m29798H(AnonymousClass6GX anonymousClass6GX, int i, int i2) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
        if (anonymousClass6GX.f73789K instanceof AnonymousClass5cH) {
            AnonymousClass5LW anonymousClass5LW = (AnonymousClass5LW) AnonymousClass0LH.E(anonymousClass6GX.f73783E);
            double d = (double) anonymousClass5LW.f62421F;
            double d2 = (double) anonymousClass5LW.f62420E;
            Double.isNaN(d);
            Double.isNaN(d2);
            d /= d2;
            d2 = (double) i;
            double d3 = (double) i2;
            Double.isNaN(d3);
            i = (int) Math.max(d2, d3 * d);
            d2 = (double) i;
            Double.isNaN(d2);
            i2 = (int) Math.max(d3, d2 / d);
        }
        ((AnonymousClass5am) AnonymousClass0LH.E(anonymousClass6GX.f73789K)).cSA(i, i2);
    }
}
