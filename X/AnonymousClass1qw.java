package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager.LayoutParams;

/* renamed from: X.1qw */
public final class AnonymousClass1qw extends Dialog {
    /* renamed from: B */
    public View f23371B;

    public AnonymousClass1qw(Context context, View view) {
        super(context);
        this.f23371B = view;
        requestWindowFeature(1);
        setContentView(0);
        getWindow().setBackgroundDrawable(null);
        View findViewById = this.f23371B.findViewById(0);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 51;
        attributes.x = findViewById.getRight() - 510;
        attributes.y = findViewById.getBottom() + 80;
        attributes.flags &= -3;
        getWindow().setAttributes(attributes);
    }
}
