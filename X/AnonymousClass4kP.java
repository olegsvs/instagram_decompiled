package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4kP */
public final class AnonymousClass4kP {
    /* renamed from: B */
    public final View f56752B;
    /* renamed from: C */
    public final ImageView f56753C;
    /* renamed from: D */
    public final TextView f56754D;
    /* renamed from: E */
    public final TextView f56755E;
    /* renamed from: F */
    public final AnonymousClass4ky f56756F = new AnonymousClass4ky(this.f56752B, 1);

    public AnonymousClass4kP(View view) {
        this.f56752B = view;
        this.f56753C = (ImageView) view.findViewById(C0164R.id.add_to_fb_story_icon);
        this.f56754D = (TextView) view.findViewById(C0164R.id.add_to_fb_story_label);
        this.f56755E = (TextView) view.findViewById(C0164R.id.add_to_fb_story_target_name);
        ((ViewStub) view.findViewById(C0164R.id.one_tap_button_view_stub)).inflate();
    }
}
