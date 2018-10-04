package com.facebook.browser.lite;

import X.AnonymousClass1pO;
import X.AnonymousClass1q4;
import X.AnonymousClass1q5;
import X.AnonymousClass1q6;
import X.AnonymousClass1q7;
import X.AnonymousClass1qK;
import X.AnonymousClass1qX;
import X.AnonymousClass1qm;
import X.AnonymousClass1qn;
import X.AnonymousClass1qv;
import X.AnonymousClass1r3;
import X.AnonymousClass1rD;
import X.AnonymousClass1rN;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;
import java.util.Map;

public class MessengerLiteChrome extends AnonymousClass1pO {
    /* renamed from: P */
    private static final String f30117P = "MessengerLiteChrome";
    /* renamed from: B */
    public final int f30118B;
    /* renamed from: C */
    public ImageView f30119C;
    /* renamed from: D */
    public ProgressBar f30120D;
    /* renamed from: E */
    public AnonymousClass1qm f30121E;
    /* renamed from: F */
    public AnonymousClass1qK f30122F;
    /* renamed from: G */
    public ImageView f30123G;
    /* renamed from: H */
    public ImageView f30124H;
    /* renamed from: I */
    public Context f30125I;
    /* renamed from: J */
    public Intent f30126J;
    /* renamed from: K */
    public ImageView f30127K;
    /* renamed from: L */
    public ImageView f30128L;
    /* renamed from: M */
    public TextView f30129M;
    /* renamed from: N */
    public Bundle f30130N;
    /* renamed from: O */
    public AnonymousClass1rN f30131O;

    /* renamed from: B */
    public final boolean mo2857B() {
        return false;
    }

    /* renamed from: C */
    public final boolean mo2858C() {
        return false;
    }

    /* renamed from: D */
    public final boolean mo2859D() {
        return true;
    }

    /* renamed from: E */
    public final void mo2860E(String str) {
    }

    public Map getMenuItemActionLog() {
        return null;
    }

    public void setCloseButtonVisibility(boolean z) {
    }

    public void setMenuButtonVisibility(boolean z) {
    }

    public MessengerLiteChrome(Context context) {
        this(context, null);
    }

    public MessengerLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30118B = Color.rgb(0, 132, 255);
        this.f30125I = context;
        Intent intent = ((Activity) this.f30125I).getIntent();
        this.f30126J = intent;
        this.f30130N = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        LayoutInflater.from(getContext()).inflate(C0164R.layout.messenger_lite_chrome, this);
        this.f30123G = (ImageView) findViewById(C0164R.id.close_button);
        this.f30127K = (ImageView) findViewById(C0164R.id.profile_icon);
        this.f30119C = (ImageView) findViewById(C0164R.id.add_extensions_button);
        this.f30124H = (ImageView) findViewById(C0164R.id.confirm_add_extension);
        this.f30120D = (ProgressBar) findViewById(C0164R.id.add_extensions_spinner);
        this.f30129M = (TextView) findViewById(C0164R.id.text_title);
        this.f30123G.setClickable(true);
        AnonymousClass1qX.m13419D(this.f30123G, getResources().getDrawable(C0164R.drawable.clickable_item_bg));
        this.f30123G.setImageDrawable(AnonymousClass1qX.m13418C(this.f30125I, C0164R.drawable.browser_close_button));
        this.f30123G.setOnClickListener(new AnonymousClass1q4(this));
        m15563C(this);
        if (!this.f30126J.getBooleanExtra("BrowserLiteIntent.MessengerExtras.EXTRA_SHOULD_HIDE_SHARE", false)) {
            this.f30120D.setVisibility(8);
            ImageView imageView = (ImageView) findViewById(C0164R.id.share_icon);
            this.f30128L = imageView;
            imageView.setImageDrawable(AnonymousClass1qX.m13418C(this.f30125I, 0));
            this.f30128L.setOnClickListener(new AnonymousClass1q6(this));
        }
        if (this.f30126J.getBooleanExtra("BrowserLiteIntent.MessengerExtras.EXTRA_SHOULD_HIDE_ADD_PLATFORM_EXTENSION", false)) {
            this.f30120D.getIndeterminateDrawable().setColorFilter(this.f30118B, Mode.SRC_IN);
            this.f30120D.setVisibility(8);
            this.f30124H.setImageDrawable(AnonymousClass1qX.m13418C(this.f30125I, 0));
            this.f30124H.setVisibility(8);
            this.f30119C.setClickable(true);
            AnonymousClass1qX.m13419D(this.f30119C, getResources().getDrawable(C0164R.drawable.clickable_item_bg));
            this.f30119C.setImageDrawable(AnonymousClass1qX.m13418C(this.f30125I, 0));
            this.f30119C.setOnClickListener(new AnonymousClass1q5(this));
            new AnonymousClass1qv(this.f30125I).show();
        }
        this.f30122F = AnonymousClass1qK.m13396B();
    }

    /* renamed from: A */
    public final void mo2856A(AnonymousClass1rN anonymousClass1rN) {
        this.f30131O = anonymousClass1rN;
        setTitle(this.f30131O.getTitle());
        BrowserLiteWebChromeClient G = BrowserLiteFragment.m15490G(anonymousClass1rN);
        if (G != null) {
            G.m15541E();
        }
    }

    /* renamed from: B */
    public static void m15562B(MessengerLiteChrome messengerLiteChrome) {
        if (messengerLiteChrome.f30131O != null) {
            Map hashMap = new HashMap();
            hashMap.put("action", "EXPLICITLY_ADD_PLATFORM_EXTENSION");
            hashMap.put(IgReactNavigatorModule.URL, messengerLiteChrome.f30131O.getUrl());
            AnonymousClass1qK.m13396B().m13402D(hashMap, messengerLiteChrome.f30130N);
            messengerLiteChrome.f30119C.setVisibility(8);
            messengerLiteChrome.f30120D.setVisibility(0);
        }
    }

    /* renamed from: C */
    public static void m15563C(MessengerLiteChrome messengerLiteChrome) {
        Bundle bundleExtra = messengerLiteChrome.f30126J.getBundleExtra("BrowserLiteIntent.MessengerExtras.EXTRA_PROFILE_ICON");
        if (bundleExtra != null) {
            CharSequence string = bundleExtra.getString("BrowserLiteIntent.MessengerExtras.KEY_ICON_URL");
            Object string2 = bundleExtra.getString("action");
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(string2)) {
                    try {
                        new AnonymousClass1r3(messengerLiteChrome.f30127K).execute(new String[]{string});
                    } catch (Throwable e) {
                        messengerLiteChrome.f30127K.setVisibility(8);
                        AnonymousClass1rD.m13483C(f30117P, e, "Failed downloading page icon", new Object[0]);
                    }
                    messengerLiteChrome.f30127K.setOnClickListener(new AnonymousClass1q7(messengerLiteChrome, string2));
                }
            }
        }
    }

    public void setControllers(AnonymousClass1qn anonymousClass1qn, AnonymousClass1qm anonymousClass1qm) {
        this.f30121E = anonymousClass1qm;
    }

    public void setTitle(String str) {
        this.f30129M.setVisibility(0);
        this.f30129M.setText(str);
    }
}
