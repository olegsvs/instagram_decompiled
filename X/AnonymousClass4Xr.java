package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.location.Location;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;

/* renamed from: X.4Xr */
public final class AnonymousClass4Xr {
    /* renamed from: N */
    public static final int f55015N = AnonymousClass11J.f13391B.getAndIncrement();
    /* renamed from: B */
    public RectF f55016B;
    /* renamed from: C */
    public AnonymousClass1Qm f55017C;
    /* renamed from: D */
    public ExifImageData f55018D;
    /* renamed from: E */
    public CropInfo f55019E;
    /* renamed from: F */
    public final Handler f55020F = new Handler();
    /* renamed from: G */
    public AnonymousClass2Mw f55021G;
    /* renamed from: H */
    public boolean f55022H;
    /* renamed from: I */
    public final AnonymousClass0Ks f55023I;
    /* renamed from: J */
    public Bitmap f55024J;
    /* renamed from: K */
    public boolean f55025K;
    /* renamed from: L */
    public AnonymousClass0Cm f55026L;
    /* renamed from: M */
    private boolean f55027M;

    public AnonymousClass4Xr(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "cropImageExecutor";
        this.f55023I = B.A();
        this.f55026L = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final String m24438A() {
        AnonymousClass2Mw anonymousClass2Mw = this.f55021G;
        return anonymousClass2Mw != null ? anonymousClass2Mw.vK() : null;
    }

    /* renamed from: B */
    public static FragmentActivity m24435B(AnonymousClass4Xr anonymousClass4Xr) {
        anonymousClass4Xr = anonymousClass4Xr.f55017C;
        if (anonymousClass4Xr == null) {
            return null;
        }
        return anonymousClass4Xr.f18455B;
    }

    /* renamed from: B */
    public final CropInfo m24439B() {
        if (this.f55021G == null || AnonymousClass4Xr.m24436C(this) == null || AnonymousClass4Xr.m24436C(this).getHighlightView() == null) {
            return null;
        }
        AnonymousClass4Y2 C = AnonymousClass4Xr.m24436C(this);
        C.m24454A();
        return new CropInfo(this.f55021G.getWidth(), this.f55021G.getHeight(), AnonymousClass4Xy.m24443C(C, this.f55021G.getWidth(), this.f55021G.getHeight(), this.f55024J.getWidth(), this.f55024J.getHeight(), this.f55016B, this.f55018D.f39813D).f55035C);
    }

    /* renamed from: C */
    public static CropImageView m24436C(AnonymousClass4Xr anonymousClass4Xr) {
        anonymousClass4Xr = anonymousClass4Xr.f55017C;
        if (anonymousClass4Xr == null) {
            return null;
        }
        return anonymousClass4Xr.f18456C;
    }

    /* renamed from: C */
    public final void m24440C() {
        if (this.f55021G != null) {
            if (!this.f55027M) {
                AnonymousClass4Y2 C = AnonymousClass4Xr.m24436C(this);
                if (C == null) {
                    return;
                }
                if (C.getHighlightView() != null) {
                    C.m24454A();
                    AnonymousClass4Xx C2 = AnonymousClass4Xy.m24443C(AnonymousClass4Xr.m24436C(this), this.f55021G.getWidth(), this.f55021G.getHeight(), this.f55024J.getWidth(), this.f55024J.getHeight(), this.f55016B, this.f55018D.f39813D);
                    if (C2.m24441A()) {
                        this.f55027M = true;
                        String vK = this.f55021G.vK();
                        if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7232C) {
                            AnonymousClass0GG.B(this.f55023I, new AnonymousClass4Xq(this, vK), -1137566421);
                        }
                        C.H();
                        C.f65026C = null;
                        if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7231B) {
                            AnonymousClass3CJ.m18995D(this.f55026L).m19004F(new CropInfo(this.f55024J.getWidth(), this.f55024J.getHeight(), C2.f55037E), false, this.f55018D.f39813D);
                        }
                        this.f55019E = new CropInfo(this.f55021G.getWidth(), this.f55021G.getHeight(), C2.f55035C);
                        ((AnonymousClass0PI) this.f55017C.f18455B).VK().m18987X(this.f55024J, C2.f55036D);
                        String vK2 = this.f55021G.vK();
                        if (this.f55017C.f18459F != null) {
                            Location location = null;
                            if (!(this.f55018D.f39811B == null || this.f55018D.f39812C == null)) {
                                location = new Location("photo");
                                location.setLatitude(this.f55018D.f39811B.doubleValue());
                                location.setLongitude(this.f55018D.f39812C.doubleValue());
                            }
                            this.f55017C.f18459F.Lm(vK2, location, this.f55019E, this.f55018D.f39813D, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public static void m24437D(AnonymousClass4Xr anonymousClass4Xr) {
        if (anonymousClass4Xr.f55024J == null) {
            Toast.makeText(AnonymousClass4Xr.m24435B(anonymousClass4Xr), C0164R.string.unable_to_load_image, 0).show();
            if (anonymousClass4Xr.f55017C.f18459F != null) {
                anonymousClass4Xr.f55017C.f18459F.ze();
                return;
            }
            return;
        }
        if (!(AnonymousClass4Xr.m24435B(anonymousClass4Xr) == null || AnonymousClass4Xr.m24435B(anonymousClass4Xr).isFinishing() || AnonymousClass4Xr.m24436C(anonymousClass4Xr) == null)) {
            float f;
            AnonymousClass4Xr.m24436C(anonymousClass4Xr).m24458E(new AnonymousClass3HX(anonymousClass4Xr.f55024J, anonymousClass4Xr.f55018D.f39813D), anonymousClass4Xr.f55017C.f18457D);
            int width = anonymousClass4Xr.f55024J.getWidth();
            int height = anonymousClass4Xr.f55024J.getHeight();
            int min = Math.min(width, height);
            int i = (width - min) / 2;
            int i2 = (height - min) / 2;
            anonymousClass4Xr.f55016B = new RectF((float) i, (float) i2, (float) (i + min), (float) (i2 + min));
            AnonymousClass4Xz anonymousClass4Xz = new AnonymousClass4Xz(AnonymousClass4Xr.m24436C(anonymousClass4Xr));
            RectF rectF = new RectF();
            AnonymousClass4Xr.m24436C(anonymousClass4Xr).getBaseMatrix().mapRect(rectF, anonymousClass4Xr.f55016B);
            anonymousClass4Xz.m24446B(rectF, anonymousClass4Xr.f55025K);
            AnonymousClass4Xr.m24436C(anonymousClass4Xr).setHighlightView(anonymousClass4Xz);
            AnonymousClass4Xr.m24436C(anonymousClass4Xr).f65027D = new RectF(0.0f, 0.0f, (float) width, (float) height);
            AnonymousClass0IC D = AnonymousClass4Xy.m24444D(anonymousClass4Xr.f55021G, anonymousClass4Xr.f55024J, anonymousClass4Xr.f55018D.f39813D);
            AnonymousClass4Y2 C = AnonymousClass4Xr.m24436C(anonymousClass4Xr);
            if (anonymousClass4Xr.f55025K) {
                f = 1.0f;
            } else {
                f = ((Float) D.f2727B).floatValue();
            }
            C.m24459F(f, ((Float) D.f2728C).floatValue(), anonymousClass4Xr.f55016B);
            AnonymousClass4Xr.m24436C(anonymousClass4Xr).G();
        }
        if (anonymousClass4Xr.f55017C.f18459F != null) {
            anonymousClass4Xr.f55017C.f18459F.zh(anonymousClass4Xr.f55024J.getWidth(), anonymousClass4Xr.f55024J.getHeight());
        }
    }
}
