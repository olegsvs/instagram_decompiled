package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

public abstract class BaseFragmentActivityApi14 extends SupportActivity {
    /* renamed from: B */
    public boolean f2717B;

    /* renamed from: A */
    public abstract View mo438A(View view, String str, Context context, AttributeSet attributeSet);

    /* renamed from: J */
    public static void m2106J(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View A = mo438A(view, str, context, attributeSet);
        return A == null ? super.onCreateView(view, str, context, attributeSet) : A;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View A = mo438A(null, str, context, attributeSet);
        return A == null ? super.onCreateView(str, context, attributeSet) : A;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!(this.f2717B || i == -1)) {
            m2106J(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
