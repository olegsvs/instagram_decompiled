package com.instagram.osversionblock;

import X.AnonymousClass0cQ;
import X.AnonymousClass1QR;
import android.os.Bundle;
import android.widget.Button;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;

public class OsVersionBlockingActivity extends IgFragmentActivity {
    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, -1936183618);
        super.onCreate(bundle);
        setContentView(C0164R.layout.osversionblock);
        ((Button) findViewById(C0164R.id.os_version_blocking_nav_button)).setOnClickListener(new AnonymousClass1QR(this));
        AnonymousClass0cQ.m5853C(this, -853442433, B);
    }
}
