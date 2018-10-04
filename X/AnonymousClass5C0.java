package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;

/* renamed from: X.5C0 */
public final class AnonymousClass5C0 implements AnonymousClass3As {
    /* renamed from: B */
    public final /* synthetic */ Activity f61033B;
    /* renamed from: C */
    public final /* synthetic */ int f61034C;
    /* renamed from: D */
    public final /* synthetic */ RectF f61035D;
    /* renamed from: E */
    public final /* synthetic */ RectF f61036E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0P7 f61037F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Cm f61038G;

    public AnonymousClass5C0(AnonymousClass5C1 anonymousClass5C1, RectF rectF, RectF rectF2, AnonymousClass0P7 anonymousClass0P7, int i, Activity activity, AnonymousClass0Cm anonymousClass0Cm) {
        this.f61035D = rectF;
        this.f61036E = rectF2;
        this.f61037F = anonymousClass0P7;
        this.f61034C = i;
        this.f61033B = activity;
        this.f61038G = anonymousClass0Cm;
    }

    public final void hl(Exception exception) {
        Toast.makeText(this.f61033B, C0164R.string.unknown_error_occured, 0).show();
    }

    public final /* bridge */ /* synthetic */ void uBA(Object obj) {
        File file = (File) obj;
        Bundle bundle = new Bundle();
        bundle.putString("ReelFeedPostShareFragment.ARGUMENTS_KEY_ENTRY_POINT", "feed_post_to_story_button");
        bundle.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS", this.f61035D);
        bundle.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_KEY_EXIT_VIEW_BOUNDS", this.f61036E);
        bundle.putString("ReelFeedPostShareFragment.ARGUMENTS_KEY_MEDIA_ID", this.f61037F.getId());
        bundle.putInt("ReelFeedPostShareFragment.ARGUMENTS_CAROUSEL_INDEX", this.f61034C);
        bundle.putString("ReelFeedPostShareFragment.ARGUMENTS_KEY_FILE_PATH", file.getAbsolutePath());
        new AnonymousClass0Sn(TransparentModalActivity.class, "reel_feed_post_share", bundle, this.f61033B, this.f61038G.f1759C).B(this.f61033B);
    }
}
