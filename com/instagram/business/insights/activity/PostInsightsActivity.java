package com.instagram.business.insights.activity;

import X.AnonymousClass0IV;
import X.AnonymousClass0Il;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass1Y6;
import X.AnonymousClass22s;
import X.AnonymousClass34n;
import X.AnonymousClass5gV;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;

public class PostInsightsActivity extends IgFragmentActivity implements AnonymousClass22s {
    /* renamed from: B */
    public OnClickListener f68102B = new AnonymousClass5gV(this);
    /* renamed from: C */
    public AnonymousClass0eT f68103C;
    /* renamed from: D */
    public AnonymousClass1Y6 f68104D;
    /* renamed from: E */
    public View f68105E;

    public final AnonymousClass0eT FI() {
        return this.f68103C;
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 1610636331);
        super.onCreate(bundle);
        setContentView(C0164R.layout.post_insights_activity);
        this.f68103C = new AnonymousClass0eT((ViewGroup) findViewById(C0164R.id.action_bar_container), this.f68102B);
        findViewById(C0164R.id.action_bar_button_action).setVisibility(8);
        this.f68105E = findViewById(C0164R.id.post_insights_loading_container);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0164R.id.post_insights_loading_container);
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = getApplicationContext().getResources().getDimensionPixelSize(C0164R.dimen.post_insights_full_screen_peek_height);
        frameLayout.setLayoutParams(layoutParams);
        AnonymousClass34n.F(this.f68105E);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgReactFragment.ARGUMENT_APP_KEY", "IgInsightsPostInsightsApp");
            bundle2.putInt("IgReactFragment.ARGUMENT_ORIENTATION", 1);
            bundle2.putBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS", extras);
            this.f68104D = (AnonymousClass1Y6) AnonymousClass0Il.getInstance().getFragmentFactory().A(bundle2);
            AnonymousClass0IV B2 = D().B();
            B2.B(C0164R.id.layout_container_main, this.f68104D, "IgInsightsPostInsightsApp");
            B2.F();
        }
        AnonymousClass0cQ.C(this, 1308914071, B);
    }
}
