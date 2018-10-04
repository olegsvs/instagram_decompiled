package com.facebook.browser.lite.chrome.container;

import X.AnonymousClass1qL;
import X.AnonymousClass1qM;
import X.AnonymousClass1qN;
import X.AnonymousClass1qO;
import X.AnonymousClass1qP;
import X.AnonymousClass1qQ;
import X.AnonymousClass1qS;
import X.AnonymousClass1qX;
import X.AnonymousClass1qZ;
import X.AnonymousClass1qm;
import X.AnonymousClass1qn;
import X.AnonymousClass1rN;
import X.AnonymousClass2PO;
import X.AnonymousClass2PP;
import X.AnonymousClass2PR;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.secure.webkit.WebView;
import java.util.ArrayList;

public class DefaultBrowserLiteChrome extends RelativeLayout implements AnonymousClass1qO {
    /* renamed from: B */
    public AnonymousClass1qm f30189B;
    /* renamed from: C */
    public AnonymousClass1qn f30190C;
    /* renamed from: D */
    public String f30191D;
    /* renamed from: E */
    public TextView f30192E;
    /* renamed from: F */
    public Bundle f30193F;
    /* renamed from: G */
    private String f30194G;
    /* renamed from: H */
    private Intent f30195H;
    /* renamed from: I */
    private ImageView f30196I;
    /* renamed from: J */
    private AnonymousClass1qQ f30197J;
    /* renamed from: K */
    private BrowserLiteProgressBar f30198K;
    /* renamed from: L */
    private TextView f30199L;

    public final void Ky(String str) {
    }

    public final void XWA(String str, AnonymousClass1qZ anonymousClass1qZ) {
    }

    public final void ks(AnonymousClass1rN anonymousClass1rN) {
    }

    public DefaultBrowserLiteChrome(Context context) {
        this(context, null);
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intent intent = ((Activity) context).getIntent();
        this.f30195H = intent;
        this.f30193F = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
    }

    /* renamed from: B */
    public static void m15592B(DefaultBrowserLiteChrome defaultBrowserLiteChrome, ArrayList arrayList) {
        WebView IT = defaultBrowserLiteChrome.f30190C.IT();
        if (IT != null) {
            if (!TextUtils.isEmpty(IT.getUrl())) {
                AnonymousClass1qP anonymousClass1qP = new AnonymousClass1qP();
                if (defaultBrowserLiteChrome.f30190C.mD() || defaultBrowserLiteChrome.f30190C.nD()) {
                    AnonymousClass1qP anonymousClass1qP2 = new AnonymousClass1qP("navigation");
                    anonymousClass1qP.m13405A(anonymousClass1qP2);
                    AnonymousClass1qP anonymousClass2PP = new AnonymousClass2PP();
                    anonymousClass2PP.f23273C = defaultBrowserLiteChrome.f30190C.mD();
                    anonymousClass1qP2.m13405A(anonymousClass2PP);
                    anonymousClass2PP = new AnonymousClass2PR();
                    anonymousClass2PP.f23273C = defaultBrowserLiteChrome.f30190C.nD();
                    anonymousClass1qP2.m13405A(anonymousClass2PP);
                }
                AnonymousClass1qS.m13412B(defaultBrowserLiteChrome.getContext(), defaultBrowserLiteChrome.f30190C, defaultBrowserLiteChrome.f30189B, anonymousClass1qP, arrayList, null);
                if (anonymousClass1qP.m13406B()) {
                    AnonymousClass1qQ anonymousClass1qQ = new AnonymousClass1qQ(defaultBrowserLiteChrome.getContext(), anonymousClass1qP.f23276F, new AnonymousClass2PO(defaultBrowserLiteChrome), false);
                    defaultBrowserLiteChrome.f30197J = anonymousClass1qQ;
                    anonymousClass1qQ.m13410A(C0164R.drawable.browser_menu_bg);
                    defaultBrowserLiteChrome.f30197J.setAnchorView(defaultBrowserLiteChrome.f30196I);
                    defaultBrowserLiteChrome.f30197J.show();
                    ListView listView = defaultBrowserLiteChrome.f30197J.getListView();
                    listView.setOverScrollMode(2);
                    listView.setVerticalScrollBarEnabled(false);
                    listView.setDivider(null);
                    listView.setOnKeyListener(new AnonymousClass1qM(defaultBrowserLiteChrome));
                }
            }
        }
    }

    /* renamed from: C */
    public static boolean m15593C(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        AnonymousClass1qQ anonymousClass1qQ = defaultBrowserLiteChrome.f30197J;
        if (anonymousClass1qQ == null || !anonymousClass1qQ.isShowing()) {
            return false;
        }
        defaultBrowserLiteChrome.f30197J.dismiss();
        defaultBrowserLiteChrome.f30197J = null;
        return true;
    }

    /* renamed from: D */
    private void m15594D() {
        Context context = getContext();
        ArrayList parcelableArrayListExtra = this.f30195H.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null) {
            if (!parcelableArrayListExtra.isEmpty()) {
                ImageView imageView = (ImageView) findViewById(C0164R.id.ig_browser_menu_button);
                this.f30196I = imageView;
                imageView.setVisibility(0);
                this.f30196I.setImageDrawable(AnonymousClass1qX.m13418C(context, C0164R.drawable.browser_more_button));
                this.f30196I.setOnClickListener(new AnonymousClass1qL(this, parcelableArrayListExtra));
            }
        }
    }

    public final void MW() {
        LayoutInflater.from(getContext()).inflate(C0164R.layout.ig_browser_chrome, this);
        this.f30192E = (TextView) findViewById(C0164R.id.ig_browser_text_title);
        this.f30199L = (TextView) findViewById(C0164R.id.ig_browser_text_subtitle);
        ImageView imageView = (ImageView) findViewById(C0164R.id.ig_browser_close_button);
        imageView.setClickable(true);
        imageView.setImageDrawable(AnonymousClass1qX.m13418C(getContext(), C0164R.drawable.browser_close_button));
        imageView.setOnClickListener(new AnonymousClass1qN(this));
        m15594D();
    }

    public final void NW() {
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) findViewById(C0164R.id.ig_browser_chrome_progress_bar);
        this.f30198K = browserLiteProgressBar;
        browserLiteProgressBar.setVisibility(0);
        this.f30198K.setProgress(0);
    }

    public int getHeightPx() {
        int height = getHeight();
        return height > 0 ? height : (int) getResources().getDimension(C0164R.dimen.browser_chrome_height);
    }

    public void setControllers(AnonymousClass1qm anonymousClass1qm, AnonymousClass1qn anonymousClass1qn) {
        this.f30189B = anonymousClass1qm;
        this.f30190C = anonymousClass1qn;
    }

    public void setProgress(int i) {
        this.f30198K.setProgress(i);
        this.f30198K.setVisibility(i == 100 ? 8 : 0);
    }

    private void setSubtitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f30199L.setVisibility(4);
        } else if (!str.equals(this.f30194G)) {
            Uri parse = Uri.parse(str);
            this.f30199L.setVisibility(0);
            this.f30199L.setText(parse.getHost());
            this.f30194G = str;
        }
    }

    public final void wEA(String str) {
        Object CT = this.f30190C.CT();
        if (TextUtils.isEmpty(CT)) {
            this.f30192E.setText(C0164R.string.ig_browser_chrome_title_loading_text);
        } else if (!CT.equals(this.f30191D)) {
            this.f30192E.setText(CT);
            this.f30191D = CT;
        }
        setSubtitle(str);
    }
}
