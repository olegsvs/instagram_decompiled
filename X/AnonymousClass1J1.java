package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.1J1 */
public final class AnonymousClass1J1 implements OnTouchListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Cf f16949B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0wx f16950C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0P7 f16951D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0m3 f16952E;
    /* renamed from: F */
    public final /* synthetic */ int f16953F;
    /* renamed from: G */
    public final /* synthetic */ boolean f16954G;
    /* renamed from: H */
    private final AnonymousClass1AI f16955H;

    public AnonymousClass1J1(AnonymousClass1Cf anonymousClass1Cf, boolean z, AnonymousClass0wx anonymousClass0wx, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        AnonymousClass1AI anonymousClass1VO;
        this.f16949B = anonymousClass1Cf;
        this.f16954G = z;
        this.f16950C = anonymousClass0wx;
        this.f16951D = anonymousClass0P7;
        this.f16952E = anonymousClass0m3;
        this.f16953F = i;
        if (this.f16954G) {
            anonymousClass1VO = new AnonymousClass1VO(this.f16949B.f15547B, this.f16949B.f15548C, this.f16950C, this.f16951D, this.f16952E, this.f16953F);
        } else {
            anonymousClass1VO = new AnonymousClass1bu(this.f16949B.f15547B, this.f16949B.f15548C, this.f16950C, this.f16953F, this.f16951D, this.f16952E);
        }
        this.f16955H = anonymousClass1VO;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass0m3.m7447B(this.f16952E, 12);
        return this.f16955H.ql(motionEvent);
    }
}
