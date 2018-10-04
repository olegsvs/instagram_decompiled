package X;

import android.graphics.RectF;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.5VX */
public final class AnonymousClass5VX implements AnonymousClass4dz {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5VY f65334B;
    /* renamed from: C */
    public final /* synthetic */ boolean f65335C;
    /* renamed from: D */
    public final /* synthetic */ boolean f65336D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass4dx f65337E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0W7 f65338F;
    /* renamed from: G */
    public final /* synthetic */ boolean f65339G;
    /* renamed from: H */
    public final /* synthetic */ int f65340H;
    /* renamed from: I */
    public final /* synthetic */ DirectThreadKey f65341I;
    /* renamed from: J */
    public final /* synthetic */ RectF f65342J;

    public final void Zr(AnonymousClass4go anonymousClass4go, AnonymousClass4go anonymousClass4go2) {
    }

    public AnonymousClass5VX(AnonymousClass5VY anonymousClass5VY, AnonymousClass0W7 anonymousClass0W7, AnonymousClass4dx anonymousClass4dx, DirectThreadKey directThreadKey, int i, boolean z, boolean z2, RectF rectF, boolean z3) {
        this.f65334B = anonymousClass5VY;
        this.f65338F = anonymousClass0W7;
        this.f65337E = anonymousClass4dx;
        this.f65341I = directThreadKey;
        this.f65340H = i;
        this.f65335C = z;
        this.f65339G = z2;
        this.f65342J = rectF;
        this.f65336D = z3;
    }

    public final void Er() {
        this.f65334B.f65343B = null;
        if (((Boolean) AnonymousClass0CC.SG.H(this.f65334B.f65382o)).booleanValue()) {
            AnonymousClass5VY.m27167N(this.f65334B);
            DirectThreadKey F = this.f65334B.f65377j.F();
            String str = this.f65338F.f5885O;
            if (str != null) {
                this.f65334B.f65373f.BA(F, str, this.f65334B.f65349H, false);
                AnonymousClass0U4.C(this.f65334B.f65382o).B(AnonymousClass0UP.B(F, this.f65338F));
            }
            Toast.makeText(this.f65334B.getContext(), this.f65336D ? C0164R.string.failed_to_load_video_toast : C0164R.string.failed_to_load_photo_toast, 0).show();
            return;
        }
        Toast.makeText(this.f65334B.getContext(), this.f65336D ? C0164R.string.failed_to_load_video_toast : C0164R.string.failed_to_load_photo_toast, 0).show();
        AnonymousClass5VY.m27167N(this.f65334B);
    }

    public final void Pr() {
        Object obj = (this.f65334B.f65343B == null || !AnonymousClass0W7.B((AnonymousClass0W7) this.f65334B.f65343B.f2727B, this.f65338F)) ? null : 1;
        if (obj != null) {
            AnonymousClass5VY anonymousClass5VY = this.f65334B;
            if (AnonymousClass5VY.m27156C(anonymousClass5VY, anonymousClass5VY.f65343B)) {
                String str;
                String str2;
                AnonymousClass0IL anonymousClass0IL = this.f65334B;
                AnonymousClass4dx anonymousClass4dx = this.f65337E;
                DirectThreadKey directThreadKey = this.f65341I;
                if (this.f65340H == 1) {
                    str = null;
                } else {
                    str = this.f65338F.f5885O;
                }
                if (this.f65340H == 1) {
                    str2 = null;
                } else {
                    str2 = this.f65338F.f5875E;
                }
                boolean z = this.f65335C;
                boolean z2 = this.f65339G;
                RectF rectF = this.f65342J;
                AnonymousClass5VY.m27167N(anonymousClass0IL);
                if (anonymousClass0IL.isResumed()) {
                    if (anonymousClass4dx != null) {
                        anonymousClass4dx.Sr();
                    }
                    AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "direct_expiring_media_viewer", AnonymousClass0J7.f2895B.N().D(directThreadKey, str, str2, z, z2, rectF, anonymousClass0IL.f65349H, "thread"), anonymousClass0IL.getActivity(), anonymousClass0IL.f65382o.f1759C);
                    anonymousClass0Sn.f5013B = ModalActivity.f5023D;
                    anonymousClass0Sn.B(anonymousClass0IL.getContext());
                }
                this.f65334B.f65343B = null;
                return;
            }
        }
        if (obj != null) {
            AnonymousClass5VY.m27167N(this.f65334B);
        }
    }
}
