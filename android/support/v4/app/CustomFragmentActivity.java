package android.support.v4.app;

import X.AnonymousClass0cJ;
import X.AnonymousClass0cP;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;

public class CustomFragmentActivity extends FragmentActivity {
    /* renamed from: M */
    public final void mo436M() {
        super.mo436M();
        AnonymousClass0cJ.m5754D((AnonymousClass0cP) this.f2707C.m5694H());
    }

    public void gOA(boolean z) {
        this.f2716B = z;
    }

    public final MenuInflater getMenuInflater() {
        MenuInflater C = AnonymousClass0cJ.m5753C((AnonymousClass0cP) this.f2707C.m5694H());
        if (C != null) {
            return C;
        }
        return super.getMenuInflater();
    }

    public final View onCreatePanelView(int i) {
        if (i == 0) {
            View B = AnonymousClass0cJ.m5752B((AnonymousClass0cP) this.f2707C.m5694H());
            if (B != null) {
                return B;
            }
        }
        return super.onCreatePanelView(i);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        View onCreateView = this.f2707C.f7000B.f7003D.onCreateView(view, str, context, attributeSet);
        if (onCreateView == null) {
            onCreateView = super.onCreateView(view, str, context, attributeSet);
        }
        return onCreateView;
    }
}
