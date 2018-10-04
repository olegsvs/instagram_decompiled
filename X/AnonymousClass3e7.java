package X;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.3e7 */
public final class AnonymousClass3e7 implements OnLongClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3e8 f42964B;
    /* renamed from: C */
    public final /* synthetic */ Hashtag f42965C;

    public AnonymousClass3e7(AnonymousClass3e8 anonymousClass3e8, Hashtag hashtag) {
        this.f42964B = anonymousClass3e8;
        this.f42965C = hashtag;
    }

    public final boolean onLongClick(View view) {
        return this.f42964B.hn(this.f42965C);
    }
}
