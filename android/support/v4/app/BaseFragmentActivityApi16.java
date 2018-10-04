package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

public abstract class BaseFragmentActivityApi16 extends BaseFragmentActivityApi14 {
    /* renamed from: B */
    public boolean f2716B;

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.f2716B || i == -1)) {
            BaseFragmentActivityApi14.m2106J(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.f2717B || i == -1)) {
            BaseFragmentActivityApi14.m2106J(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
