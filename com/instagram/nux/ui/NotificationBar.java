package com.instagram.nux.ui;

import X.AnonymousClass3Y8;
import X.AnonymousClass3Y9;
import X.AnonymousClass3YA;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.C0164R;

public class NotificationBar extends TextView {
    /* renamed from: B */
    public final Runnable f42173B = new AnonymousClass3Y8(this);
    /* renamed from: C */
    public AnonymousClass3YA f42174C = AnonymousClass3YA.HIDDEN;
    /* renamed from: D */
    private Context f42175D;
    /* renamed from: E */
    private Animation f42176E;
    /* renamed from: F */
    private Animation f42177F;

    public NotificationBar(Context context) {
        super(context);
        m19930D(context);
    }

    public NotificationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19930D(context);
    }

    public NotificationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19930D(context);
    }

    /* renamed from: A */
    public final void m19931A() {
        if (this.f42174C == AnonymousClass3YA.SHOWING_STICKY) {
            m19928B(this);
        }
    }

    /* renamed from: B */
    public final void m19932B() {
        if (this.f42174C != AnonymousClass3YA.HIDDEN) {
            removeCallbacks(this.f42173B);
            m19928B(this);
        }
    }

    /* renamed from: B */
    public static void m19928B(NotificationBar notificationBar) {
        if (notificationBar.f42175D != null) {
            notificationBar.startAnimation(notificationBar.f42177F);
        }
        notificationBar.f42174C = AnonymousClass3YA.HIDDEN;
    }

    /* renamed from: C */
    public static void m19929C(NotificationBar notificationBar, String str, int i, int i2) {
        notificationBar.setText(str);
        notificationBar.setTextColor(i2);
        notificationBar.setBackground(new ColorDrawable(i));
        notificationBar.setVisibility(0);
        notificationBar.startAnimation(notificationBar.f42176E);
    }

    /* renamed from: C */
    public final void m19933C(String str, int i, int i2) {
        removeCallbacks(this.f42173B);
        if (this.f42174C != AnonymousClass3YA.HIDDEN) {
            m19928B(this);
        }
        this.f42174C = AnonymousClass3YA.SHOWING_STICKY;
        m19929C(this, str, i, i2);
    }

    /* renamed from: D */
    private void m19930D(Context context) {
        this.f42175D = context;
        this.f42176E = AnimationUtils.loadAnimation(context, C0164R.anim.notification_slide_down);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f42175D, C0164R.anim.notification_slide_up);
        this.f42177F = loadAnimation;
        loadAnimation.setAnimationListener(new AnonymousClass3Y9(this));
    }
}
