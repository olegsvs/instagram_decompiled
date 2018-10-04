package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.49T */
public final class AnonymousClass49T implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ SelectHighlightsCoverFragment f50920B;
    /* renamed from: C */
    public final /* synthetic */ Bitmap f50921C;

    public AnonymousClass49T(SelectHighlightsCoverFragment selectHighlightsCoverFragment, Bitmap bitmap) {
        this.f50920B = selectHighlightsCoverFragment;
        this.f50921C = bitmap;
    }

    public final void run() {
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f50920B.mTouchImageView.getWidth(), (float) this.f50920B.mTouchImageView.getHeight());
        RectF rectF2 = new RectF(rectF);
        Rect rect = new Rect(0, 0, this.f50921C.getWidth(), this.f50921C.getHeight());
        float width = rectF2.width() / ((float) rect.width());
        Rect rect2 = this.f50920B.f50926D.f36861B;
        RectF rectF3 = new RectF(((float) rect2.left) * width, ((float) rect2.top) * width, ((float) rect2.right) * width, ((float) rect2.bottom) * width);
        rectF.offsetTo(rectF3.left, rectF3.top - ((float) ((int) (((((float) rect.height()) * width) - (((float) rect.width()) * width)) / 2.0f))));
        this.f50920B.mTouchImageView.setRenderState(new AnonymousClass4GH(rectF, rectF2, rect, this.f50921C, false, false));
        this.f50920B.mRootView.setBackground(new BitmapDrawable(this.f50920B.getResources(), BlurUtil.blur(this.f50921C, 0.1f, 6)));
    }
}
