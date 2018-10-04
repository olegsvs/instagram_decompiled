package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.0qP */
public final class AnonymousClass0qP extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f10924B;
    /* renamed from: C */
    private final AnonymousClass0Cm f10925C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass0qP(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        this.f10924B = context;
        this.f10925C = anonymousClass0Cm;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        String str;
        int I = AnonymousClass0cQ.m5859I(this, 1111394767);
        if (view == null) {
            view = LayoutInflater.from(this.f10924B).inflate(C0164R.layout.row_pending_media, null);
            AnonymousClass0ri anonymousClass0ri = new AnonymousClass0ri();
            anonymousClass0ri.f11253B = view.findViewById(C0164R.id.row_pending_container);
            anonymousClass0ri.f11257F = (ImageView) view.findViewById(C0164R.id.row_pending_media_imageview);
            anonymousClass0ri.f11259H = (ImageView) view.findViewById(C0164R.id.row_pending_media_imageview_overlay);
            anonymousClass0ri.f11262K = view.findViewById(C0164R.id.row_pending_media_retry_button);
            anonymousClass0ri.f11255D = view.findViewById(C0164R.id.vertical_divider);
            anonymousClass0ri.f11254C = view.findViewById(C0164R.id.row_pending_media_discard_button);
            anonymousClass0ri.f11258G = view.findViewById(C0164R.id.row_pending_media_options_button);
            anonymousClass0ri.f11261J = (ProgressBar) view.findViewById(C0164R.id.row_pending_media_progress_bar);
            anonymousClass0ri.f11264M = view.findViewById(C0164R.id.row_pending_media_status_text_views);
            anonymousClass0ri.f11263L = (TextView) view.findViewById(C0164R.id.row_pending_media_status_textview);
            anonymousClass0ri.f11265N = (TextView) view.findViewById(C0164R.id.row_pending_media_sub_status_textview);
            anonymousClass0ri.f11256E = view.findViewById(C0164R.id.row_pending_media_imageview_container);
            ProgressBar progressBar = anonymousClass0ri.f11261J;
            ((LayerDrawable) progressBar.getProgressDrawable()).setDrawableByLayerId(16908301, new AnonymousClass0rj(AnonymousClass0Ca.m939E(progressBar.getContext(), C0164R.drawable.upload_track)));
            LayerDrawable layerDrawable = (LayerDrawable) AnonymousClass0Ca.m939E(progressBar.getContext(), C0164R.drawable.progress_horizontal_upload);
            layerDrawable.setDrawableByLayerId(16908301, new AnonymousClass0rk(AnonymousClass0Ca.m939E(progressBar.getContext(), C0164R.drawable.upload_track), progressBar.getResources().getDimensionPixelSize(C0164R.dimen.indeterminate_progress_foreground_width)));
            progressBar.setIndeterminateDrawable(layerDrawable);
            view.addOnAttachStateChangeListener(new AnonymousClass0rl(anonymousClass0ri));
            view.setTag(anonymousClass0ri);
        }
        AnonymousClass0ri anonymousClass0ri2 = (AnonymousClass0ri) view.getTag();
        AnonymousClass0OA anonymousClass0OA = (AnonymousClass0OA) obj;
        AnonymousClass0Cm anonymousClass0Cm = this.f10925C;
        if (anonymousClass0ri2.f11260I != null && ((Boolean) AnonymousClass0CC.rL.m846H(anonymousClass0Cm)).booleanValue()) {
            anonymousClass0ri2.f11260I.m3602v(anonymousClass0ri2);
        }
        anonymousClass0ri2.f11260I = anonymousClass0OA;
        anonymousClass0ri2.f11266O = anonymousClass0Cm;
        int dimensionPixelSize = anonymousClass0ri2.m7969C().getResources().getDimensionPixelSize(C0164R.dimen.pending_media_row_height);
        if (anonymousClass0OA.m3591k()) {
            str = ((AnonymousClass0OA) anonymousClass0OA.m3558D().get(0)).DB;
        } else {
            str = anonymousClass0OA.DB;
        }
        anonymousClass0ri2.f11257F.setImageBitmap(AnonymousClass0rm.m7977F(str, dimensionPixelSize, dimensionPixelSize));
        if (anonymousClass0OA.m3599s()) {
            anonymousClass0ri2.f11259H.setBackgroundResource(C0164R.drawable.grid_camera_icon_small);
        } else {
            anonymousClass0ri2.f11259H.setBackground(null);
        }
        AnonymousClass0rn.m7992B(anonymousClass0ri2);
        anonymousClass0ri2.f11262K.setOnClickListener(new AnonymousClass0ro(anonymousClass0ri2));
        anonymousClass0ri2.f11254C.setOnClickListener(new AnonymousClass0rp(anonymousClass0ri2));
        anonymousClass0ri2.f11258G.setOnClickListener(new AnonymousClass0rq(anonymousClass0ri2));
        if (((Boolean) AnonymousClass0CC.rL.m846H(anonymousClass0Cm)).booleanValue()) {
            anonymousClass0OA.m3555A(anonymousClass0ri2);
        }
        AnonymousClass0cQ.m5858H(this, 493475823, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0OA anonymousClass0OA = (AnonymousClass0OA) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.m7787A(0);
    }
}
