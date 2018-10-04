package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.3yk */
public final class AnonymousClass3yk extends AnonymousClass3B4 {
    public AnonymousClass3yk(View view, float f, float f2) {
        super(view, f, f2);
    }

    /* renamed from: B */
    public final void mo4778B(RoundedCornerImageView roundedCornerImageView, Context context) {
        roundedCornerImageView.setRadius((float) context.getResources().getDimensionPixelSize(C0164R.dimen.draggable_corner_radius));
        roundedCornerImageView.setAlpha(204);
        roundedCornerImageView.setBackgroundDrawable(AnonymousClass0Ca.E(context, C0164R.drawable.draggable_rounded_border_whiteout));
        View view = (View) m18854A().get();
        view.setDrawingCacheEnabled(true);
        roundedCornerImageView.setImageBitmap(Bitmap.createBitmap(view.getDrawingCache()));
        view.setDrawingCacheEnabled(false);
        roundedCornerImageView.setLayoutParams(new LayoutParams(roundedCornerImageView.getDrawable().getIntrinsicWidth(), roundedCornerImageView.getDrawable().getIntrinsicHeight(), 51));
    }
}
