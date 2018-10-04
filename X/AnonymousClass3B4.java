package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.3B4 */
public abstract class AnonymousClass3B4 {
    /* renamed from: B */
    public final float f38648B;
    /* renamed from: C */
    public final float f38649C;
    /* renamed from: D */
    public WeakReference f38650D;

    /* renamed from: B */
    public abstract void mo4778B(RoundedCornerImageView roundedCornerImageView, Context context);

    public AnonymousClass3B4(View view, float f, float f2) {
        this.f38650D = new WeakReference(view);
        this.f38648B = f;
        this.f38649C = f2;
    }

    /* renamed from: A */
    public final synchronized WeakReference m18854A() {
        return this.f38650D;
    }
}
