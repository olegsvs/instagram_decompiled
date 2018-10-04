package com.instagram.creation.hashtag.ui;

import X.AnonymousClass0IZ;
import X.AnonymousClass4Wi;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class AddHashtagCreationActivity extends BaseFragmentActivity {
    /* renamed from: T */
    public final void m24411T() {
        Bundle bundle = new Bundle();
        String str = "IgSessionManager.USER_ID";
        bundle.putString(str, getIntent().getStringExtra(str));
        str = "extra_selected_hashtags";
        bundle.putParcelableArrayList(str, getIntent().getParcelableArrayListExtra(str));
        new AnonymousClass0IZ(this).F(new AnonymousClass4Wi(), bundle).B();
    }
}
