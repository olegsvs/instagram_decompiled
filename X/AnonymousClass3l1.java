package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.user.follow.BlockButton;

/* renamed from: X.3l1 */
public final class AnonymousClass3l1 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ BlockButton f44111B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5S1 f44112C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f44113D;

    public AnonymousClass3l1(BlockButton blockButton, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass5S1 anonymousClass5S1) {
        this.f44111B = blockButton;
        this.f44113D = anonymousClass0Ci;
        this.f44112C = anonymousClass5S1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BlockButton.m20582B(this.f44111B, this.f44113D, this.f44112C);
        BlockButton.m20583C(this.f44111B, this.f44113D);
    }
}
