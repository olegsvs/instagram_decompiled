package X;

import android.graphics.Bitmap;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.ui.widget.avatarlike.AvatarLikesView;

/* renamed from: X.5J5 */
public final class AnonymousClass5J5 implements AnonymousClass0RL {
    /* renamed from: B */
    public final /* synthetic */ AvatarLikesView f61936B;
    /* renamed from: C */
    public final /* synthetic */ boolean f61937C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5J3 f61938D;

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public AnonymousClass5J5(AvatarLikesView avatarLikesView, boolean z, AnonymousClass5J3 anonymousClass5J3) {
        this.f61936B = avatarLikesView;
        this.f61937C = z;
        this.f61938D = anonymousClass5J3;
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        if (this.f61936B.f61951B) {
            AvatarLikesView.m26191B(this.f61936B, this.f61937C, null, false);
            this.f61936B.postInvalidateOnAnimation();
        }
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        if (this.f61936B.f61951B) {
            for (int i = 0; i < this.f61938D.f61932B; i++) {
                this.f61936B.postDelayed(new AnonymousClass5J4(this, bitmap), (long) (i * StartupQEsConfig.DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY));
            }
        }
    }
}
