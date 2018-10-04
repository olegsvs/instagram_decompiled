package com.facebook.browser.lite;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass1pO;
import X.AnonymousClass1pz;
import X.AnonymousClass1q0;
import X.AnonymousClass1q1;
import X.AnonymousClass1q2;
import X.AnonymousClass1q3;
import X.AnonymousClass1qK;
import X.AnonymousClass1qP;
import X.AnonymousClass1qQ;
import X.AnonymousClass1qS;
import X.AnonymousClass1qX;
import X.AnonymousClass1qm;
import X.AnonymousClass1qn;
import X.AnonymousClass1qu;
import X.AnonymousClass1r5;
import X.AnonymousClass1rN;
import X.AnonymousClass2P1;
import X.AnonymousClass2PP;
import X.AnonymousClass2PR;
import X.AnonymousClass2PS;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DefaultBrowserLiteChrome extends AnonymousClass1pO {
    /* renamed from: B */
    public TextView f30095B;
    /* renamed from: C */
    public AnonymousClass1qm f30096C;
    /* renamed from: D */
    public AnonymousClass1qn f30097D;
    /* renamed from: E */
    public AnonymousClass1qK f30098E;
    /* renamed from: F */
    public ImageView f30099F;
    /* renamed from: G */
    public Context f30100G;
    /* renamed from: H */
    public OnClickListener f30101H;
    /* renamed from: I */
    public Intent f30102I;
    /* renamed from: J */
    public boolean f30103J;
    /* renamed from: K */
    public ImageView f30104K;
    /* renamed from: L */
    public Drawable f30105L;
    /* renamed from: M */
    public AnonymousClass1qQ f30106M;
    /* renamed from: N */
    public ImageView f30107N;
    /* renamed from: O */
    public LinearLayout f30108O;
    /* renamed from: P */
    public EditText f30109P;
    /* renamed from: Q */
    public TextView f30110Q;
    /* renamed from: R */
    public AnonymousClass1qu f30111R;
    /* renamed from: S */
    public TextView f30112S;
    /* renamed from: T */
    public View f30113T;
    /* renamed from: U */
    public Bundle f30114U;
    /* renamed from: V */
    public AnonymousClass1rN f30115V;
    /* renamed from: W */
    private final HashMap f30116W;

    public DefaultBrowserLiteChrome(Context context) {
        this(context, null);
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30103J = false;
        this.f30116W = new HashMap();
        this.f30100G = context;
        Intent intent = ((Activity) this.f30100G).getIntent();
        this.f30102I = intent;
        this.f30114U = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        this.f30111R = AnonymousClass1qu.m13434B();
        this.f30102I.getBooleanExtra("BrowserLiteIntent.EXTRA_REPORT_SHOULD_INCLUDE_CLOAKING_DATA", false);
        mo3503J();
    }

    /* renamed from: A */
    public void mo2856A(AnonymousClass1rN anonymousClass1rN) {
        this.f30115V = anonymousClass1rN;
        setTitle(this.f30115V.getTitle());
        BrowserLiteWebChromeClient G = BrowserLiteFragment.m15490G(anonymousClass1rN);
        if (G != null) {
            G.m15541E();
        }
        mo2860E(this.f30115V.getUrl());
    }

    /* renamed from: B */
    public static void m15545B(DefaultBrowserLiteChrome defaultBrowserLiteChrome, String str) {
        if (defaultBrowserLiteChrome.f30116W.containsKey(str)) {
            HashMap hashMap = defaultBrowserLiteChrome.f30116W;
            hashMap.put(str, Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1));
            return;
        }
        defaultBrowserLiteChrome.f30116W.put(str, Integer.valueOf(1));
    }

    /* renamed from: B */
    public final boolean mo2857B() {
        Intent intent = this.f30102I;
        if (intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
            if (parcelableArrayListExtra != null) {
                if (!parcelableArrayListExtra.isEmpty()) {
                    m15559G(parcelableArrayListExtra);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static void m15546C(DefaultBrowserLiteChrome defaultBrowserLiteChrome, int i, int i2) {
        AnonymousClass1qX.m13419D(defaultBrowserLiteChrome, new ColorDrawable(AnonymousClass0Ca.C(defaultBrowserLiteChrome.f30100G, i)));
        defaultBrowserLiteChrome.f30112S.setTextColor(AnonymousClass0Ca.C(defaultBrowserLiteChrome.f30100G, i2));
        defaultBrowserLiteChrome.f30099F.setColorFilter(AnonymousClass0Ca.C(defaultBrowserLiteChrome.f30100G, i2));
    }

    /* renamed from: C */
    public final boolean mo2858C() {
        AnonymousClass1qQ anonymousClass1qQ = this.f30106M;
        if (anonymousClass1qQ == null || !anonymousClass1qQ.isShowing()) {
            return false;
        }
        this.f30106M.dismiss();
        this.f30106M = null;
        return true;
    }

    /* renamed from: D */
    public boolean mo2859D() {
        return getVisibility() == 0;
    }

    /* renamed from: D */
    public static boolean m15547D(DefaultBrowserLiteChrome defaultBrowserLiteChrome, Uri uri) {
        if (uri != null) {
            if (uri.getHost() != null) {
                Bundle bundleExtra = defaultBrowserLiteChrome.f30102I.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
                if (bundleExtra != null) {
                    String string = bundleExtra.getString("KEY_BLACKLIST_DOMAIN");
                    if (string != null) {
                        if (AnonymousClass1r5.m13444B(string, uri.getHost())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    private void m15548E() {
        Bundle bundleExtra = this.f30102I.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
        if (bundleExtra != null) {
            CharSequence string = bundleExtra.getString("KEY_LABEL");
            String string2 = bundleExtra.getString("action");
            if (!TextUtils.isEmpty(string)) {
                if (string2 != null) {
                    this.f30095B.setText(string);
                    this.f30095B.setVisibility(0);
                    this.f30095B.setOnClickListener(new AnonymousClass1q0(this, string2));
                }
            }
        }
    }

    /* renamed from: E */
    public void mo2860E(String str) {
        setDomain(str);
        if (!TextUtils.isEmpty(str)) {
            boolean equals = str.equals(ReactWebViewManager.BLANK_URL);
        }
    }

    /* renamed from: F */
    private void m15549F() {
        ArrayList parcelableArrayListExtra = this.f30102I.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null) {
            if (!parcelableArrayListExtra.isEmpty()) {
                this.f30104K.setImageDrawable(AnonymousClass1qX.m13418C(this.f30100G, this.f30102I.getIntExtra("extra_menu_button_icon", C0164R.drawable.browser_more_button)));
                this.f30104K.setOnClickListener(new AnonymousClass1q2(this, parcelableArrayListExtra));
                setMenuButtonVisibility(this.f30102I.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM", true));
            }
        }
    }

    /* renamed from: F */
    public void mo3502F(AnonymousClass1qP anonymousClass1qP, ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        hashSet.add("OPEN_SAVED_LINKS");
        AnonymousClass1qS.m13412B(this.f30100G, this.f30097D, this.f30096C, anonymousClass1qP, arrayList, hashSet);
    }

    /* renamed from: G */
    private void m15550G() {
        Object obj;
        int i;
        String stringExtra = this.f30102I.getStringExtra("BrowserLiteIntent.EXTRA_THEME");
        if (!("THEME_MESSENGER_FB4A".equals(stringExtra) || "THEME_WORK_CHAT".equals(stringExtra))) {
            if (!"THEME_MESSENGER_IAB".equals(stringExtra)) {
                obj = null;
                if (obj == null) {
                    if (this.f30102I.getExtras() == null) {
                        i = this.f30102I.getExtras().getInt("BrowserLiteIntent.EXTRA_USE_ALTERNATIVE_TITLE_BAR_COLOR_SCHEME", 0);
                        if (i != 0) {
                            setTitleBarColorScheme(i);
                        }
                    }
                }
                return;
            }
        }
        obj = 1;
        if (obj == null) {
            return;
        }
        if (this.f30102I.getExtras() == null) {
            i = this.f30102I.getExtras().getInt("BrowserLiteIntent.EXTRA_USE_ALTERNATIVE_TITLE_BAR_COLOR_SCHEME", 0);
            if (i != 0) {
                setTitleBarColorScheme(i);
            }
        }
    }

    /* renamed from: G */
    public final void m15559G(ArrayList arrayList) {
        AnonymousClass1rN anonymousClass1rN = this.f30115V;
        if (anonymousClass1rN != null) {
            if (!TextUtils.isEmpty(anonymousClass1rN.getUrl())) {
                AnonymousClass1qP anonymousClass1qP = new AnonymousClass1qP();
                if (this.f30097D.mD() || this.f30097D.nD()) {
                    AnonymousClass1qP anonymousClass1qP2 = new AnonymousClass1qP("navigation");
                    anonymousClass1qP.m13405A(anonymousClass1qP2);
                    AnonymousClass1qP anonymousClass2PP = new AnonymousClass2PP();
                    anonymousClass2PP.f23273C = this.f30097D.mD();
                    anonymousClass1qP2.m13405A(anonymousClass2PP);
                    anonymousClass2PP = new AnonymousClass2PR();
                    anonymousClass2PP.f23273C = this.f30097D.nD();
                    anonymousClass1qP2.m13405A(anonymousClass2PP);
                }
                mo3502F(anonymousClass1qP, arrayList);
                AnonymousClass1qP C = AnonymousClass2PS.m15598C(this.f30100G, this.f30096C, this.f30097D);
                if (C != null) {
                    anonymousClass1qP.m13405A(C);
                }
                if (anonymousClass1qP.m13406B()) {
                    AnonymousClass1qQ anonymousClass1qQ = new AnonymousClass1qQ(this.f30100G, anonymousClass1qP.f23276F, new AnonymousClass2P1(this), false);
                    this.f30106M = anonymousClass1qQ;
                    anonymousClass1qQ.m13410A(C0164R.drawable.browser_menu_bg);
                    this.f30106M.setAnchorView(this.f30104K);
                    this.f30106M.show();
                    this.f30106M.getListView().setOverScrollMode(2);
                    this.f30106M.getListView().setVerticalScrollBarEnabled(false);
                    this.f30106M.getListView().setDivider(null);
                    this.f30106M.getListView().setOnKeyListener(new AnonymousClass1q3(this));
                }
            }
        }
    }

    /* renamed from: H */
    private void m15551H() {
        if (this.f30102I.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_SEARCH_BAR", false)) {
            this.f30103J = true;
            this.f30108O.setVisibility(0);
            AnonymousClass1qX.m13419D(this.f30108O, new ColorDrawable(AnonymousClass1qX.m13417B(this.f30100G, 0)));
            this.f30107N.setImageResource(0);
            this.f30107N.setOnClickListener(this.f30101H);
            int B = AnonymousClass1qX.m13417B(this.f30100G, 0);
            Drawable C = AnonymousClass1qX.m13418C(this.f30100G, 0);
            C.setColorFilter(B, Mode.SRC_IN);
            this.f30109P.setCompoundDrawablesWithIntrinsicBounds(C, null, null, null);
            this.f30109P.setHintTextColor(B);
            this.f30109P.setOnClickListener(new AnonymousClass1q1(this));
            this.f30113T.setPadding(this.f30100G.getResources().getDimensionPixelSize(C0164R.dimen.browser_menu_horizontal_padding), 0, 0, 0);
        }
    }

    /* renamed from: I */
    private void m15552I() {
        AnonymousClass1qX.m13419D(this, new ColorDrawable(AnonymousClass0Ca.C(this.f30100G, 0)));
        int C = AnonymousClass0Ca.C(this.f30100G, 0);
        this.f30112S.setTextColor(C);
        this.f30110Q.setTextColor(AnonymousClass0Ca.C(this.f30100G, C0164R.color.browser_alternative_subtitle_color));
        this.f30099F.setColorFilter(C);
        this.f30095B.setTextColor(C);
        this.f30104K.setColorFilter(C);
    }

    /* renamed from: J */
    public void mo3503J() {
        LayoutInflater.from(getContext()).inflate(C0164R.layout.browser_lite_chrome, this);
        this.f30112S = (TextView) findViewById(C0164R.id.text_title);
        this.f30110Q = (TextView) findViewById(C0164R.id.text_subtitle);
        this.f30101H = new AnonymousClass1pz(this);
        ImageView imageView = (ImageView) findViewById(C0164R.id.close_button);
        this.f30099F = imageView;
        imageView.setClickable(true);
        AnonymousClass1qX.m13419D(this.f30099F, getResources().getDrawable(C0164R.drawable.clickable_item_bg));
        this.f30099F.setOnClickListener(this.f30101H);
        this.f30095B = (TextView) findViewById(C0164R.id.browser_action_button);
        this.f30104K = (ImageView) findViewById(C0164R.id.browser_menu_button);
        this.f30113T = findViewById(C0164R.id.layout_title_and_subtitle);
        Drawable drawable = this.f30100G.getResources().getDrawable(C0164R.drawable.browser_ssl_lock);
        this.f30105L = drawable;
        drawable.setAlpha(127);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0164R.id.layout_title_container);
        this.f30108O = (LinearLayout) findViewById(C0164R.id.browser_chrome_search_bar);
        this.f30107N = (ImageView) findViewById(C0164R.id.browser_chrome_search_back_button);
        this.f30109P = (EditText) findViewById(C0164R.id.browser_chrome_search_text);
        m15548E();
        m15549F();
        if (this.f30104K.getVisibility() == 8 && this.f30095B.getVisibility() != 8) {
            TextView textView = this.f30095B;
            textView.setPadding(textView.getPaddingLeft(), this.f30095B.getPaddingTop(), this.f30100G.getResources().getDimensionPixelSize(C0164R.dimen.action_button_optional_padding_right), this.f30095B.getPaddingBottom());
        }
        m15550G();
        setCloseButtonVisibility(this.f30102I.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_CLOSE_BUTTON", true));
        m15551H();
        String stringExtra = this.f30102I.getStringExtra("BrowserLiteIntent.EXTRA_THEME");
        if ("THEME_MESSENGER_IAB".equals(stringExtra)) {
            int i = (this.f30102I.getDoubleExtra("BrowserLiteIntent.DISPLAY_HEIGHT_RATIO", 1.0d) > 1.0d ? 1 : (this.f30102I.getDoubleExtra("BrowserLiteIntent.DISPLAY_HEIGHT_RATIO", 1.0d) == 1.0d ? 0 : -1));
            this.f30099F.setImageDrawable(AnonymousClass1qX.m13418C(this.f30100G, 0));
        } else {
            this.f30099F.setImageDrawable(AnonymousClass1qX.m13418C(this.f30100G, C0164R.drawable.browser_close_button));
            if (!"THEME_MESSENGER_FB4A".equals(stringExtra)) {
                if (!"THEME_WORK_CHAT".equals(stringExtra)) {
                    if ("THEME_INSTAGRAM_WATCHBROWSE".equals(stringExtra)) {
                        this.f30110Q.getLayoutParams().height = -1;
                        this.f30110Q.setTextSize(0, this.f30112S.getTextSize());
                        LayoutParams layoutParams = (LayoutParams) this.f30113T.getLayoutParams();
                        layoutParams.setMargins(this.f30100G.getResources().getDimensionPixelOffset(C0164R.dimen.browser_watchbrowse_title_left_margin), layoutParams.topMargin, 0, layoutParams.bottomMargin);
                    }
                }
            }
            m15546C(this, 0, 0);
        }
        this.f30098E = AnonymousClass1qK.m13396B();
    }

    /* renamed from: K */
    public void mo3504K(String str, boolean z) {
        if (str == null) {
            this.f30110Q.setVisibility(8);
        } else {
            this.f30110Q.setVisibility(0);
            this.f30110Q.setText(str);
        }
        if (z) {
            this.f30110Q.setCompoundDrawablesWithIntrinsicBounds(this.f30105L, null, null, null);
        } else {
            this.f30110Q.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public HashMap getMenuItemActionLog() {
        return this.f30116W;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 1898141511);
        super.onAttachedToWindow();
        if (this.f30103J) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height *= 2;
        }
        AnonymousClass0cQ.O(this, -135209956, N);
    }

    public void setCloseButtonVisibility(boolean z) {
        this.f30099F.setVisibility(z ? 0 : 8);
    }

    public void setControllers(AnonymousClass1qn anonymousClass1qn, AnonymousClass1qm anonymousClass1qm) {
        this.f30097D = anonymousClass1qn;
        this.f30096C = anonymousClass1qm;
    }

    private void setDomain(String str) {
        Uri parse = str == null ? null : Uri.parse(str);
        if (m15547D(this, parse)) {
            this.f30095B.setVisibility(8);
        } else {
            this.f30095B.setVisibility(0);
        }
        if (parse == null) {
            mo3504K(null, false);
        } else {
            mo3504K(parse.getHost(), parse.getScheme().equals("https"));
        }
        int i = 8;
        if (this.f30097D.PY()) {
            this.f30095B.setVisibility(8);
            return;
        }
        TextView textView = this.f30095B;
        if (AnonymousClass1r5.m13450H(parse)) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setMenuButtonVisibility(boolean z) {
        this.f30104K.setVisibility(z ? 0 : 8);
    }

    public void setTextZoom(int i) {
        WebSettings settings = this.f30115V.getSettings();
        settings.setTextZoom(i);
        LayoutAlgorithm layoutAlgorithm = settings.getLayoutAlgorithm();
        LayoutAlgorithm layoutAlgorithm2 = LayoutAlgorithm.NORMAL;
        if (layoutAlgorithm != layoutAlgorithm2) {
            settings.setLayoutAlgorithm(layoutAlgorithm2);
        }
    }

    public void setTitle(String str) {
        if (str != null) {
            if (this.f30102I.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_TITLE", true)) {
                this.f30112S.setVisibility(0);
                this.f30112S.setText(str);
                return;
            }
        }
        this.f30112S.setVisibility(8);
    }

    private void setTitleBarColorScheme(int i) {
        switch (i) {
            case 1:
                m15552I();
                return;
            case 2:
                m15552I();
                CharSequence spannableString = new SpannableString(this.f30095B.getText());
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
                this.f30095B.setText(spannableString);
                return;
            default:
                return;
        }
    }
}
