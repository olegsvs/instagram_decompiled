package X;

import android.app.Dialog;
import android.content.Context;
import android.view.WindowManager.LayoutParams;

/* renamed from: X.1qv */
public final class AnonymousClass1qv extends Dialog {
    public AnonymousClass1qv(Context context) {
        super(context);
        requestWindowFeature(1);
        setContentView(0);
        getWindow().setBackgroundDrawable(null);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 3;
        attributes.flags &= -3;
        getWindow().setAttributes(attributes);
    }
}
