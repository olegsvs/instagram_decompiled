package com.facebook.browser.lite;

import X.AnonymousClass0Ca;
import X.AnonymousClass1q8;
import X.AnonymousClass1q9;
import X.AnonymousClass1qK;
import X.AnonymousClass1qP;
import X.AnonymousClass1qX;
import X.AnonymousClass1rN;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;

public class WatchAndBrowseChrome extends DefaultBrowserLiteChrome {
    /* renamed from: B */
    private boolean f31732B;

    /* renamed from: K */
    public final void mo3504K(String str, boolean z) {
    }

    public void setCloseButtonVisibility(boolean z) {
    }

    public void setMenuButtonVisibility(boolean z) {
    }

    public void setTitle(String str) {
    }

    public WatchAndBrowseChrome(Context context) {
        this(context, null);
    }

    public WatchAndBrowseChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A */
    public final void mo2856A(AnonymousClass1rN anonymousClass1rN) {
        this.f30115V = anonymousClass1rN;
        setTitle(anonymousClass1rN.getUrl());
        this.f30112S.setCompoundDrawablesWithIntrinsicBounds(this.f30105L, null, null, null);
    }

    /* renamed from: D */
    public final boolean mo2859D() {
        return this.f31732B;
    }

    /* renamed from: E */
    private void m16579E(AnonymousClass1qP anonymousClass1qP) {
        Bundle bundleExtra = this.f30102I.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
        if (bundleExtra != null) {
            String string = bundleExtra.getString("KEY_LABEL");
            AnonymousClass1qP anonymousClass1qP2 = new AnonymousClass1qP(bundleExtra.getString("action"));
            anonymousClass1qP2.f23275E = string;
            anonymousClass1qP2.f23274D = C0164R.drawable.browser_share;
            anonymousClass1qP.m13405A(anonymousClass1qP2);
        }
    }

    /* renamed from: E */
    public final void mo2860E(String str) {
        Uri parse = str == null ? null : Uri.parse(str);
        if (parse != null) {
            CharSequence host = parse.getHost();
            boolean equals = "https".equals(parse.getScheme());
            if (host != null) {
                this.f30112S.setVisibility(0);
                this.f30112S.setText(host);
            }
            if (equals) {
                this.f30112S.setCompoundDrawablesWithIntrinsicBounds(this.f30105L, null, null, null);
            } else {
                this.f30112S.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            }
        }
    }

    /* renamed from: F */
    private void m16580F() {
        ArrayList parcelableArrayListExtra = this.f30102I.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null) {
            if (!parcelableArrayListExtra.isEmpty()) {
                this.f30104K.setImageDrawable(AnonymousClass1qX.m13418C(getContext(), ((Activity) getContext()).getIntent().getIntExtra("extra_menu_button_icon", C0164R.drawable.browser_more_button)));
                this.f30104K.setOnClickListener(new AnonymousClass1q9(this, parcelableArrayListExtra));
            }
        }
    }

    /* renamed from: F */
    public final void mo3502F(AnonymousClass1qP anonymousClass1qP, ArrayList arrayList) {
        m16579E(anonymousClass1qP);
        super.mo3502F(anonymousClass1qP, arrayList);
    }

    /* renamed from: J */
    public final void mo3503J() {
        LayoutInflater.from(getContext()).inflate(0, this);
        this.f30099F = (ImageView) findViewById(0);
        this.f30112S = (TextView) findViewById(0);
        this.f30104K = (ImageView) findViewById(0);
        this.f30105L = getContext().getResources().getDrawable(C0164R.drawable.browser_ssl_lock);
        this.f30105L.setAlpha(127);
        this.f30105L.setColorFilter(AnonymousClass0Ca.C(getContext(), C0164R.color.browser_burd_url_bar_foreground_color), Mode.SRC_ATOP);
        this.f30099F.setClickable(true);
        AnonymousClass1qX.m13419D(this.f30099F, getResources().getDrawable(C0164R.drawable.clickable_item_bg));
        this.f30099F.setImageDrawable(AnonymousClass1qX.m13418C(getContext(), C0164R.drawable.browser_close_button));
        this.f30099F.setOnClickListener(new AnonymousClass1q8(this));
        m16580F();
        this.f30104K.setScaleX(0.0f);
        this.f30104K.setScaleY(0.0f);
        this.f30099F.setScaleX(0.0f);
        this.f30099F.setScaleY(0.0f);
        this.f30098E = AnonymousClass1qK.m13396B();
    }

    public void setActive(boolean z) {
        this.f31732B = z;
    }
}
