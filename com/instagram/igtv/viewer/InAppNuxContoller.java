package com.instagram.igtv.viewer;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EF;
import X.AnonymousClass0HV;
import X.AnonymousClass0Nm;
import X.AnonymousClass0VA;
import X.AnonymousClass0ca;
import X.AnonymousClass4vk;
import X.AnonymousClass4wJ;
import X.AnonymousClass4wK;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

public class InAppNuxContoller extends AnonymousClass0VA {
    /* renamed from: B */
    public final IGTVViewerFragment f58642B;
    /* renamed from: C */
    private final Context f58643C;
    /* renamed from: D */
    private final AnonymousClass0Cm f58644D;
    public TextView mDismissButton;
    public ImageView mIconView;
    public View mNuxView;
    public ViewStub mNuxViewStub;

    public InAppNuxContoller(View view, AnonymousClass0Cm anonymousClass0Cm, IGTVViewerFragment iGTVViewerFragment) {
        this.f58643C = view.getContext();
        this.f58644D = anonymousClass0Cm;
        this.f58642B = iGTVViewerFragment;
        this.mNuxViewStub = (ViewStub) view.findViewById(C0164R.id.igtv_in_app_nux_stub);
    }

    /* renamed from: A */
    public final void m25435A() {
        if (this.mNuxView != null) {
            AnonymousClass0HV.D(this.f58644D).f2646B.edit().putBoolean("felix_in_app_nux_seen", true).apply();
            this.mNuxView.animate().setDuration(100).alpha(0.0f).withEndAction(new AnonymousClass4wK(this)).start();
        }
    }

    /* renamed from: B */
    public final boolean m25436B() {
        View view = this.mNuxView;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: C */
    public final boolean m25437C(boolean z, boolean z2) {
        return (!AnonymousClass0EF.M(this.f58643C) || z || z2 || AnonymousClass0HV.D(this.f58644D).f2646B.getBoolean("felix_in_app_nux_seen", false)) ? false : true;
    }

    /* renamed from: D */
    public final void m25438D() {
        ViewStub viewStub = this.mNuxViewStub;
        if (viewStub != null) {
            this.mNuxView = viewStub.inflate();
            this.mNuxViewStub = null;
            this.mIconView = (ImageView) this.mNuxView.findViewById(C0164R.id.icon_image);
            this.mDismissButton = (TextView) this.mNuxView.findViewById(C0164R.id.watch_now_button);
            Drawable E = AnonymousClass0Ca.E(this.f58643C, C0164R.drawable.igtv_inapp_nux);
            E.setColorFilter(AnonymousClass0ca.B(-1));
            int round = Math.round(AnonymousClass0Nm.C(this.f58643C, 100));
            this.mIconView.setImageDrawable(new AnonymousClass4vk(BitmapFactory.decodeResource(this.f58643C.getResources(), C0164R.drawable.igtv_gradient), E, round, round));
            this.mDismissButton.setOnClickListener(new AnonymousClass4wJ(this));
        }
    }

    public final void gi() {
        InAppNuxContollerLifecycleUtil.cleanupReferences(this);
    }
}
