package com.instagram.debug.devoptions.api;

import X.AnonymousClass2D5;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.facebook.C0164R;

public final class DeveloperOptionsLauncher$1 implements AnonymousClass2D5 {
    public final /* synthetic */ Context val$context;
    public final /* synthetic */ FragmentActivity val$fragmentActivity;
    public final /* synthetic */ Bundle val$fragmentArguments;

    public DeveloperOptionsLauncher$1(FragmentActivity fragmentActivity, Bundle bundle, Context context) {
        this.val$fragmentActivity = fragmentActivity;
        this.val$fragmentArguments = bundle;
        this.val$context = context;
    }

    public void onFailure() {
        Toast.makeText(this.val$context, C0164R.string.dev_options_download_failed, 1).show();
    }

    public void onSuccess() {
        DeveloperOptionsLauncher.launchDevoptionsMenu(this.val$fragmentActivity, this.val$fragmentArguments);
    }
}
