package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.372 */
public abstract class AnonymousClass372 implements AnonymousClass0EE {
    /* renamed from: B */
    public final String f37974B;
    /* renamed from: C */
    public final AnonymousClass37m f37975C;
    /* renamed from: D */
    public final AtomicBoolean f37976D = new AtomicBoolean(false);
    /* renamed from: E */
    public final AnonymousClass36n f37977E;
    /* renamed from: F */
    public final String f37978F;
    /* renamed from: G */
    public String f37979G;
    /* renamed from: H */
    private WeakReference f37980H;

    /* renamed from: A */
    public abstract long mo4718A();

    /* renamed from: B */
    public abstract boolean mo4719B();

    /* renamed from: E */
    public abstract void mo4720E(Object obj);

    /* renamed from: H */
    public abstract void mo4721H(AnonymousClass37m anonymousClass37m, AnonymousClass0Iw anonymousClass0Iw);

    public AnonymousClass372(AnonymousClass36n anonymousClass36n, String str, String str2) {
        this.f37977E = anonymousClass36n;
        this.f37974B = str;
        this.f37978F = str2;
        this.f37975C = new AnonymousClass37m();
    }

    /* renamed from: C */
    public boolean m18581C() {
        if (mo4719B() && System.currentTimeMillis() - mo4718A() <= ((long) ((Integer) AnonymousClass0CC.nD.G()).intValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean m18582D() {
        return this.f37976D.get();
    }

    /* renamed from: F */
    public void m18584F(AnonymousClass0Iw anonymousClass0Iw) {
        if (this.f37976D.compareAndSet(false, true)) {
            String str = this.f37979G;
            AnonymousClass0NN.B("ig_face_effect_download_step", this).F("waterfall_id", str).F("download_type", "api").F("api_type", this.f37974B).F("step", "start").R();
            mo4721H(this.f37975C, new AnonymousClass371(this, anonymousClass0Iw));
        }
    }

    /* renamed from: G */
    public final void m18585G(AnonymousClass0EE anonymousClass0EE) {
        this.f37980H = new WeakReference(anonymousClass0EE);
    }

    public final String getModuleName() {
        WeakReference weakReference = this.f37980H;
        AnonymousClass0EE anonymousClass0EE = weakReference == null ? null : (AnonymousClass0EE) weakReference.get();
        return anonymousClass0EE != null ? anonymousClass0EE.getModuleName() : "unknown_ig_composer";
    }
}
