package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.List;

/* renamed from: X.62I */
public final class AnonymousClass62I extends BaseAdapter {
    /* renamed from: B */
    public Context f71142B;
    /* renamed from: C */
    private AnonymousClass6Ha f71143C;
    /* renamed from: D */
    private final List f71144D;

    public AnonymousClass62I(Context context, List list, AnonymousClass6Ha anonymousClass6Ha) {
        this.f71142B = context;
        this.f71144D = list;
        this.f71143C = anonymousClass6Ha;
    }

    /* renamed from: B */
    private void m28808B(View view, int i) {
        AnonymousClass62G anonymousClass62G = (AnonymousClass62G) view.getTag();
        IgProgressImageView igProgressImageView = anonymousClass62G.f71138B;
        int J = AnonymousClass0Nm.J(this.f71142B);
        igProgressImageView.setLayoutParams(new LayoutParams(J, J));
        igProgressImageView.setScaleType(ScaleType.FIT_CENTER);
        AnonymousClass0X2 anonymousClass0X2 = (AnonymousClass0X2) this.f71144D.get(i);
        if (anonymousClass0X2 != null) {
            String C = anonymousClass0X2.C(this.f71142B);
            igProgressImageView.setUrl(C);
            if (anonymousClass0X2.A() != 1.0f) {
                igProgressImageView.setImageRenderer(new AnonymousClass62E(this, C));
            }
            if (((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.Od)).booleanValue()) {
                AnonymousClass0vl anonymousClass0vl = new AnonymousClass0vl(this.f71142B);
                anonymousClass0vl.A(new AnonymousClass62H(this.f71143C, anonymousClass62G.f71139C));
                anonymousClass62G.f71139C.setOnTouchListener(new AnonymousClass62F(this, anonymousClass0vl));
            }
        }
    }

    public final int getCount() {
        return this.f71144D.size();
    }

    public final Object getItem(int i) {
        return this.f71144D.get(i);
    }

    public final long getItemId(int i) {
        AnonymousClass0X2 anonymousClass0X2 = (AnonymousClass0X2) this.f71144D.get(i);
        if (anonymousClass0X2 == null) {
            return 0;
        }
        return (long) anonymousClass0X2.hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f71142B).inflate(C0164R.layout.product_image, viewGroup, false);
            AnonymousClass62G anonymousClass62G = new AnonymousClass62G();
            anonymousClass62G.f71139C = (MediaFrameLayout) view.findViewById(C0164R.id.product_image_frame);
            anonymousClass62G.f71138B = (IgProgressImageView) view.findViewById(C0164R.id.product_imageview);
            view.setTag(anonymousClass62G);
        }
        m28808B(view, i);
        return view;
    }
}
