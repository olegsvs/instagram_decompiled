package X;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.List;

/* renamed from: X.3k7 */
public final class AnonymousClass3k7 implements AnonymousClass0QP, AnimatorListener, AnimatorUpdateListener {
    /* renamed from: J */
    private static final AnonymousClass0e5 f43896J = AnonymousClass0e5.C(5.0d, 5.0d);
    /* renamed from: B */
    public final List f43897B;
    /* renamed from: C */
    public int f43898C;
    /* renamed from: D */
    public final List f43899D;
    /* renamed from: E */
    public final List f43900E;
    /* renamed from: F */
    private AnonymousClass3jz f43901F;
    /* renamed from: G */
    private final List f43902G;
    /* renamed from: H */
    private int f43903H;
    /* renamed from: I */
    private final AnonymousClass0cN f43904I;

    /* renamed from: A */
    public final boolean m20538A() {
        return this.f43901F != AnonymousClass3jz.IDLE;
    }

    /* renamed from: B */
    public final void m20539B(AnonymousClass3jz anonymousClass3jz) {
        this.f43901F = anonymousClass3jz;
        for (int i = 0; i < this.f43902G.size(); i++) {
            ((AnonymousClass3k5) this.f43902G.get(i)).onAnimationStateChanged(anonymousClass3jz);
        }
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        for (int i = 0; i < this.f43897B.size(); i++) {
            ((AnonymousClass3k4) this.f43897B.get(i)).CBA(this.f43904I, this.f43901F);
        }
    }

    /* renamed from: C */
    public final void m20540C(int i, float f, int i2) {
        Object obj = this.f43898C != i2 ? 1 : null;
        this.f43903H = this.f43898C;
        this.f43898C = i2;
        if (m20538A()) {
            BBA(this.f43904I);
        }
        this.f43904I.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).P((double) f).N((double) i);
        m20539B(obj != null ? AnonymousClass3jz.CHANGE_SELECTION : AnonymousClass3jz.RETURN_TO_SELECTION);
    }
}
