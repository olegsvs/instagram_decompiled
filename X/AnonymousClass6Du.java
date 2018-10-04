package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.6Du */
public final class AnonymousClass6Du implements AnonymousClass5k0 {
    public AnonymousClass6Du(AnonymousClass0dC anonymousClass0dC) {
    }

    public final boolean oG(BaseFragmentActivity baseFragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        new AnonymousClass3WF(baseFragmentActivity, bundle.getString("nonce"), bundle.getString("encoded_email"), true).A();
        return true;
    }
}
