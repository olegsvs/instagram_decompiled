package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import com.facebook.C0164R;

/* renamed from: X.33D */
public final class AnonymousClass33D {
    /* renamed from: B */
    private Context f37344B;
    /* renamed from: C */
    private int f37345C;
    /* renamed from: D */
    private GradientDrawable f37346D;
    /* renamed from: E */
    private int f37347E;
    /* renamed from: F */
    private Button f37348F;
    /* renamed from: G */
    private Dialog f37349G;
    /* renamed from: H */
    private int f37350H;
    /* renamed from: I */
    private OnClickListener f37351I;
    /* renamed from: J */
    private int f37352J;
    /* renamed from: K */
    private int f37353K;

    public AnonymousClass33D(AnonymousClass33C anonymousClass33C) {
        this.f37352J = anonymousClass33C.f37342G;
        this.f37345C = anonymousClass33C.f37338C;
        this.f37347E = anonymousClass33C.f37339D;
        this.f37353K = anonymousClass33C.f37343H;
        this.f37351I = anonymousClass33C.f37341F;
        this.f37350H = anonymousClass33C.f37340E;
        this.f37344B = anonymousClass33C.f37337B;
    }

    /* renamed from: A */
    public final void m18307A() {
        Button button = (Button) LayoutInflater.from(this.f37344B).inflate(C0164R.layout.bugreporter_takescreenshot_button, null, false);
        this.f37348F = button;
        button.setText(this.f37352J);
        this.f37348F.setOnClickListener(this.f37351I);
        this.f37346D = new GradientDrawable();
        Context context = this.f37344B;
        if (context != null) {
            this.f37346D.setColor(AnonymousClass0Ca.C(context, this.f37345C));
            this.f37346D.setStroke(this.f37344B.getResources().getDimensionPixelSize(C0164R.dimen.bugreporter_takescreenshot_button_border_width), AnonymousClass0Ca.C(this.f37344B, this.f37347E));
            this.f37346D.setCornerRadius((float) this.f37344B.getResources().getDimensionPixelSize(C0164R.dimen.bugreporter_takescreenshot_button_corner_radius));
            this.f37348F.setBackground(this.f37346D);
            this.f37348F.setTextColor(AnonymousClass0Ca.D(this.f37344B, this.f37353K));
            Dialog dialog = new Dialog(this.f37344B);
            this.f37349G = dialog;
            dialog.setContentView(this.f37348F);
            Window window = this.f37349G.getWindow();
            window.addFlags(40);
            window.clearFlags(2);
            window.setGravity(this.f37350H | 80);
            LayoutParams attributes = window.getAttributes();
            Context context2 = this.f37344B;
            if (context2 != null) {
                attributes.x = context2.getResources().getDimensionPixelOffset(C0164R.dimen.bugreporter_takescreenshot_horizontal_offset);
                attributes.y = this.f37344B.getResources().getDimensionPixelOffset(C0164R.dimen.bugreporter_takescreenshot_bottom_offset);
                window.setAttributes(attributes);
                this.f37349G.show();
            }
        }
    }
}
