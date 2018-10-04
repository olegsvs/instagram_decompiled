package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.4g7 */
public final class AnonymousClass4g7 {
    /* renamed from: B */
    public final ViewGroup f56212B;
    /* renamed from: C */
    public final ViewGroup f56213C;
    /* renamed from: D */
    private final IgImageView[] f56214D = new IgImageView[6];

    public AnonymousClass4g7(View view) {
        this.f56213C = (ViewGroup) view.findViewById(C0164R.id.top_image_row);
        this.f56214D[0] = (IgImageView) this.f56213C.findViewById(C0164R.id.image1);
        this.f56214D[1] = (IgImageView) this.f56213C.findViewById(C0164R.id.image2);
        this.f56214D[2] = (IgImageView) this.f56213C.findViewById(C0164R.id.image3);
        this.f56212B = (ViewGroup) view.findViewById(C0164R.id.bottom_image_row);
        this.f56214D[3] = (IgImageView) this.f56212B.findViewById(C0164R.id.image4);
        this.f56214D[4] = (IgImageView) this.f56212B.findViewById(C0164R.id.image5);
        this.f56214D[5] = (IgImageView) this.f56212B.findViewById(C0164R.id.image6);
        int C = AnonymousClass4ew.m24683C(view.getContext()) / 3;
        LayoutParams layoutParams = this.f56213C.getLayoutParams();
        layoutParams.height = C;
        this.f56213C.setLayoutParams(layoutParams);
        layoutParams = this.f56212B.getLayoutParams();
        layoutParams.height = C;
        this.f56212B.setLayoutParams(layoutParams);
    }

    /* renamed from: A */
    public final void m24725A(List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                int i;
                if (list.size() <= 3) {
                    this.f56213C.setVisibility(0);
                    this.f56212B.setVisibility(8);
                } else {
                    this.f56213C.setVisibility(0);
                    this.f56212B.setVisibility(0);
                }
                for (IgImageView visibility : this.f56214D) {
                    visibility.setVisibility(4);
                }
                int min = Math.min(list.size(), this.f56214D.length);
                for (i = 0; i < min; i++) {
                    this.f56214D[i].setUrl(((AnonymousClass1dN) list.get(i)).f20735C.E());
                    this.f56214D[i].setVisibility(0);
                }
                return;
            }
        }
        this.f56213C.setVisibility(8);
        this.f56212B.setVisibility(8);
    }
}
