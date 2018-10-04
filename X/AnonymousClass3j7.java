package X;

import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.List;

/* renamed from: X.3j7 */
public final class AnonymousClass3j7 extends BaseAdapter {
    /* renamed from: B */
    private int f43672B;
    /* renamed from: C */
    private boolean f43673C;
    /* renamed from: D */
    private boolean f43674D;
    /* renamed from: E */
    private int f43675E;
    /* renamed from: F */
    private final List f43676F;

    public final long getItemId(int i) {
        return 0;
    }

    public AnonymousClass3j7(List list, ViewGroup viewGroup, int i, boolean z, boolean z2) {
        this.f43676F = list;
        this.f43672B = i;
        this.f43673C = z;
        this.f43674D = z2;
        DisplayMetrics displayMetrics = viewGroup.getContext().getResources().getDisplayMetrics();
        for (int i2 = 0; i2 < this.f43676F.size(); i2++) {
            View view = getView(i2, null, viewGroup);
            view.measure(MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Process.WAIT_RESULT_TIMEOUT), 0);
            this.f43675E = this.f43675E < view.getMeasuredHeight() ? view.getMeasuredHeight() : this.f43675E;
        }
        viewGroup.setLayoutParams(new LayoutParams(-1, this.f43675E));
    }

    public final int getCount() {
        return this.f43676F.size();
    }

    public final Object getItem(int i) {
        return this.f43676F.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f43672B, viewGroup, false);
        }
        SlideCardViewModel slideCardViewModel = (SlideCardViewModel) this.f43676F.get(i);
        ImageView imageView = (ImageView) view.findViewById(C0164R.id.image);
        CircularImageView circularImageView = (CircularImageView) view.findViewById(C0164R.id.circular_image);
        if (slideCardViewModel.f43680E != 0) {
            imageView.setImageDrawable(AnonymousClass2LZ.m15163B(viewGroup.getResources(), slideCardViewModel.f43680E));
            imageView.setVisibility(0);
            circularImageView.setVisibility(8);
        } else if (slideCardViewModel.f43678C != 0) {
            imageView.setImageResource(slideCardViewModel.f43678C);
            imageView.setVisibility(0);
            circularImageView.setVisibility(8);
        } else if (slideCardViewModel.f43677B != null) {
            imageView.setVisibility(8);
            circularImageView.setUrl(slideCardViewModel.f43677B);
            circularImageView.setVisibility(0);
        } else if (slideCardViewModel.f43679D != null && (imageView instanceof IgImageView)) {
            imageView.setVisibility(0);
            ((IgImageView) imageView).setUrl(slideCardViewModel.f43679D);
            circularImageView.setVisibility(8);
        }
        if (slideCardViewModel.f43683H != null) {
            ((TextView) view.findViewById(C0164R.id.title)).setText(slideCardViewModel.f43683H);
        }
        if (slideCardViewModel.f43682G != null) {
            ((TextView) view.findViewById(C0164R.id.subtitle)).setText(slideCardViewModel.f43682G);
        }
        View findViewById = view.findViewById(C0164R.id.row_divider);
        if (findViewById != null) {
            if (this.f43673C && slideCardViewModel.f43679D == null) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
        TextView textView = (TextView) view.findViewById(C0164R.id.subtitle_footer);
        if (textView != null) {
            if (!this.f43674D || slideCardViewModel.f43681F == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(slideCardViewModel.f43681F);
            }
        }
        return view;
    }
}
