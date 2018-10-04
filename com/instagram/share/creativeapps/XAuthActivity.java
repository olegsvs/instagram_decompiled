package com.instagram.share.creativeapps;

import X.AnonymousClass0G5;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eU;
import X.AnonymousClass0eV;
import X.AnonymousClass3fF;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;

public abstract class XAuthActivity extends IgFragmentActivity {
    /* renamed from: B */
    public Handler f43129B = new Handler();

    /* renamed from: P */
    public abstract String mo5024P();

    /* renamed from: Q */
    public abstract void mo5025Q();

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 1168443285);
        AnonymousClass0G5.I(this);
        super.onCreate(bundle);
        if (((double) getResources().getDisplayMetrics().density) >= 1.5d) {
            getWindow().setSoftInputMode(4);
        }
        setContentView(C0164R.layout.activity_xauth_redesign);
        ((TextView) findViewById(C0164R.id.action_bar_textview_title)).setText(mo5024P());
        View findViewById = findViewById(C0164R.id.action_bar_button_back);
        findViewById.setOnClickListener(new AnonymousClass3fF(this));
        findViewById.setBackground(new AnonymousClass0eU(getTheme(), AnonymousClass0eV.MODAL));
        mo5025Q();
        AnonymousClass0cQ.C(this, -1226897779, B);
    }
}
