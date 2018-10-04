package X;

import android.opengl.GLES20;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.VideoFilter;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.42o */
public final class AnonymousClass42o implements AnonymousClass3oX {
    /* renamed from: B */
    public Queue f48845B;
    /* renamed from: C */
    public BaseFilter f48846C;
    /* renamed from: D */
    private VideoFilter f48847D;
    /* renamed from: E */
    private final AnonymousClass2Mf f48848E = AnonymousClass2Mk.m15236B();
    /* renamed from: F */
    private AnonymousClass28b f48849F;
    /* renamed from: G */
    private AnonymousClass2fM f48850G;
    /* renamed from: H */
    private AnonymousClass2fM f48851H;
    /* renamed from: I */
    private VideoFilter f48852I;

    public AnonymousClass42o(AnonymousClass28b anonymousClass28b, VideoFilter videoFilter) {
        this.f48849F = anonymousClass28b;
        this.f48847D = videoFilter;
        this.f48852I = AnonymousClass3Os.m19524C();
        this.f48845B = new LinkedList();
        this.f48847D.f49568I = this.f48848E;
        this.f48852I.f49568I = this.f48848E;
    }

    public final void QLA(int i, int i2) {
        this.f48850G.m16802A(i, i2);
        AnonymousClass2fM anonymousClass2fM = this.f48851H;
        if (anonymousClass2fM != null) {
            anonymousClass2fM.m16802A(i, i2);
        }
    }

    public final void iH() {
        this.f48850G.cleanup();
        AnonymousClass28q anonymousClass28q = this.f48851H;
        if (anonymousClass28q != null) {
            anonymousClass28q.cleanup();
        }
    }

    public final void tV(int i, int i2) {
        this.f48850G = new AnonymousClass2fM(i, i2);
        this.f48847D.m22723A();
        this.f48852I.m22723A();
        if (this.f48846C != null) {
            this.f48851H = new AnonymousClass2fM(i, i2);
        }
    }

    public final void zJA(AnonymousClass2Vi anonymousClass2Vi) {
        this.f48847D.yJA(this.f48849F.f26570D, (AnonymousClass2Vh) this.f48845B.peek(), this.f48850G);
        GLES20.glFlush();
        BaseFilter baseFilter = this.f48846C;
        if (baseFilter != null) {
            try {
                baseFilter.yJA(this.f48849F.f26570D, this.f48850G, this.f48851H);
            } catch (Throwable e) {
                AnonymousClass0Dc.G("FilterYUVRenderer", "Secondary filter failed", e);
                AnonymousClass0Gn.L("FilterYUVRenderer render exception", e);
            }
            GLES20.glFlush();
            this.f48852I.yJA(this.f48849F.f26570D, this.f48851H, anonymousClass2Vi);
            return;
        }
        this.f48852I.yJA(this.f48849F.f26570D, this.f48850G, anonymousClass2Vi);
    }
}
