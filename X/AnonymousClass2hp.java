package X;

import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.2hp */
public final class AnonymousClass2hp implements AnonymousClass1y2 {
    /* renamed from: B */
    public AnonymousClass2hm f32649B = new AnonymousClass2hm(new AnonymousClass3rh(this), -1);
    /* renamed from: C */
    private int f32650C;
    /* renamed from: D */
    private int f32651D;

    public AnonymousClass2hp(int i, int i2) {
        this.f32651D = i;
        this.f32650C = i2;
    }

    public final boolean AIA(AnonymousClass2SA anonymousClass2SA, boolean z) {
        if (!this.f32649B.m16955C(anonymousClass2SA, z)) {
            if (!this.f32649B.m16953A()) {
                return false;
            }
        }
        return true;
    }

    public final AnonymousClass1y3 GM() {
        return AnonymousClass1y3.LUM;
    }

    public final void GMA() {
        this.f32649B.m16957E();
    }

    public final boolean VV() {
        return this.f32649B.m16954B(GM());
    }

    public final void YOA(boolean z) {
        this.f32649B.f32624E = z;
    }

    public final void fRA(int i, int i2) {
        this.f32651D = i;
        this.f32650C = i2;
        this.f32649B.m16959G(i, i2);
    }

    public final void qQA(List list) {
        this.f32649B.m16958F(list, this);
    }

    public final void release() {
        this.f32649B.m16956D();
    }

    public final void yV(AnonymousClass2R4 anonymousClass2R4, AnonymousClass1ui anonymousClass1ui) {
        release();
        fRA(this.f32651D, this.f32650C);
        AnonymousClass2hm anonymousClass2hm = this.f32649B;
        AnonymousClass2ho anonymousClass2ho = new AnonymousClass2ho(anonymousClass2R4, C0164R.raw.lum_vs, C0164R.raw.lum_fs, true);
        if (anonymousClass2hm.f32626G != null) {
            anonymousClass2hm.f32626G.m16962A();
        }
        anonymousClass2hm.f32626G = anonymousClass2ho;
    }
}
