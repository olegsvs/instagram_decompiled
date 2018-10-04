package com.facebook.browser.lite.extensions.watchandbrowse;

import X.AnonymousClass1qd;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;

public class BrowserLiteHeaderLoadingScreen extends FrameLayout {
    /* renamed from: B */
    public int f23315B;
    /* renamed from: C */
    public int f23316C;
    /* renamed from: D */
    public int f23317D;
    /* renamed from: E */
    public View f23318E = this.f23324K.findViewById(0);
    /* renamed from: F */
    public TextView f23319F = ((TextView) this.f23324K.findViewById(0));
    /* renamed from: G */
    public View f23320G = this.f23324K.findViewById(0);
    /* renamed from: H */
    public TextView f23321H = ((TextView) this.f23324K.findViewById(0));
    /* renamed from: I */
    public View f23322I = this.f23324K.findViewById(0);
    /* renamed from: J */
    public TextView f23323J = ((TextView) this.f23324K.findViewById(0));
    /* renamed from: K */
    public View f23324K;
    /* renamed from: L */
    public TextView f23325L;
    /* renamed from: M */
    public ObjectAnimator f23326M;
    /* renamed from: N */
    public ImageView f23327N = ((ImageView) this.f23324K.findViewById(0));
    /* renamed from: O */
    public BrowserLiteProgressBar f23328O;
    /* renamed from: P */
    public boolean f23329P;
    /* renamed from: Q */
    public String f23330Q;
    /* renamed from: R */
    public ObjectAnimator f23331R;
    /* renamed from: S */
    public ArrayList f23332S;
    /* renamed from: T */
    public String f23333T;
    /* renamed from: U */
    public int f23334U;
    /* renamed from: V */
    public String f23335V;
    /* renamed from: W */
    public boolean f23336W;
    /* renamed from: X */
    public String f23337X;
    /* renamed from: Y */
    public TextView f23338Y = ((TextView) this.f23324K.findViewById(0));
    /* renamed from: Z */
    public TextView f23339Z = ((TextView) this.f23324K.findViewById(0));
    /* renamed from: a */
    public boolean f23340a;
    /* renamed from: b */
    public boolean f23341b;
    /* renamed from: c */
    private boolean f23342c;

    public BrowserLiteHeaderLoadingScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(getContext()).inflate(0, this, false);
        this.f23324K = inflate;
        addView(inflate);
        TextView textView = (TextView) this.f23324K.findViewById(0);
        this.f23325L = textView;
        textView.setText(0);
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) ((ViewStub) findViewById(0)).inflate();
        this.f23328O = browserLiteProgressBar;
        browserLiteProgressBar.getProgressDrawable().setColorFilter(-1, Mode.SRC_IN);
        this.f23328O.setProgress(0);
        this.f23328O.setVisibility(0);
        this.f23328O.setMax(JsonMappingException.MAX_REFS_TO_LIST);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f23328O, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{0, 990});
        this.f23326M = ofInt;
        ofInt.setDuration(10000);
        this.f23326M.setInterpolator(new DecelerateInterpolator(4.0f));
        this.f23326M.start();
        this.f23324K.setVisibility(0);
        this.f23341b = true;
        this.f23332S = new ArrayList();
        this.f23336W = true;
        this.f23329P = false;
        this.f23317D = JsonMappingException.MAX_REFS_TO_LIST;
        this.f23315B = 2000;
        this.f23316C = 10;
        this.f23340a = false;
    }

    /* renamed from: A */
    public final void m13426A() {
        if (this.f23341b && !this.f23340a) {
            this.f23332S.add(getContext().getString(0));
        }
        String str = this.f23337X;
        if (str != null) {
            if (this.f23329P) {
                this.f23332S.add(0, str);
            } else {
                this.f23332S.add(str);
            }
        }
        str = this.f23333T;
        if (str != null) {
            if (this.f23329P && this.f23337X == null) {
                this.f23332S.add(0, str);
            } else {
                this.f23332S.add(this.f23333T);
            }
        }
        str = this.f23335V;
        if (str != null) {
            if (this.f23329P && this.f23337X == null && this.f23333T == null) {
                this.f23332S.add(0, str);
            } else {
                this.f23332S.add(this.f23335V);
            }
        }
        str = this.f23330Q;
        if (str != null) {
            if (this.f23329P && this.f23337X == null && this.f23333T == null && this.f23335V == null) {
                this.f23332S.add(0, str);
            } else {
                this.f23332S.add(this.f23330Q);
            }
        }
        if (this.f23332S.size() > 1) {
            this.f23334U = 0;
            this.f23323J.setText((CharSequence) this.f23332S.get(this.f23334U));
            this.f23334U++;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23322I, "alpha", new float[]{1.0f, 0.1f});
            this.f23331R = ofFloat;
            ofFloat.setStartDelay((long) this.f23317D);
            this.f23331R.setDuration((long) this.f23315B);
            this.f23331R.setRepeatCount(this.f23316C);
            this.f23331R.setRepeatMode(2);
            this.f23331R.addListener(new AnonymousClass1qd(this));
            this.f23331R.start();
        } else if (this.f23340a && this.f23332S.size() == 1) {
            this.f23323J.setText((CharSequence) this.f23332S.get(0));
        }
    }

    public int getBottomCallToActionButtonHeight() {
        return getContext().getResources().getDimensionPixelSize(0);
    }

    public int getHeaderLoadingScreenProfilePictureHeight() {
        return getContext().getResources().getDimensionPixelSize(0);
    }

    public ImageView getProfilePictureImageView() {
        return this.f23327N;
    }

    public void setAnimationSocialContextFirst(boolean z) {
        this.f23329P = z;
    }

    public void setBottomCallToActionButton(String str, OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(str)) {
            this.f23318E.setVisibility(0);
            this.f23318E.setOnClickListener(onClickListener);
            this.f23319F.setText(str);
            this.f23322I.setVisibility(0);
            if (this.f23341b) {
                this.f23323J.setText(getContext().getString(0));
            }
        }
    }

    public void setCallToActionButton(String str, OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(str)) {
            this.f23320G.setVisibility(0);
            this.f23320G.setOnClickListener(onClickListener);
            this.f23321H.setText(str);
        }
    }

    public void setLoadingScreenDisplayUrlEnabled(boolean z) {
        this.f23342c = z;
    }

    public void setSocialContextCommentString(String str) {
        if (str != null) {
            this.f23330Q = getContext().getString(0, new Object[]{str});
        }
    }

    public void setSocialContextMessageVisibility(int i) {
        this.f23322I.setVisibility(i);
    }

    public void setSocialContextReactionString(String str) {
        if (str != null) {
            this.f23333T = getContext().getString(0, new Object[]{str});
        }
    }

    public void setSocialContextReshareString(String str) {
        if (str != null) {
            this.f23335V = getContext().getString(0, new Object[]{str});
        }
    }

    public void setSocialContextSupplementalString(String str) {
        if (str != null) {
            this.f23337X = str;
        }
    }

    public void setTitleText(String str) {
        if (!this.f23342c) {
            this.f23338Y.setText(str);
            this.f23338Y.setVisibility(0);
            this.f23339Z.setVisibility(0);
            this.f23325L.setVisibility(8);
        }
    }

    public void setURLText(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0010 }
        r0.<init>(r5);	 Catch:{ URISyntaxException -> 0x0010 }
        r5 = r0.getHost();	 Catch:{ URISyntaxException -> 0x0010 }
    L_0x0010:
        r3 = r4.f23325L;
        r2 = r4.getContext();
        r0 = 1;
        r1 = new java.lang.Object[r0];
        r0 = 0;
        r1[r0] = r5;
        r0 = r2.getString(r0, r1);
        r3.setText(r0);
        r0 = r4.f23339Z;
        r0.setText(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.watchandbrowse.BrowserLiteHeaderLoadingScreen.setURLText(java.lang.String):void");
    }

    public void setWatchAndBrowseSocialContextEnabled(boolean z) {
        this.f23340a = z;
    }

    public void setWatchAndInstallDefaultMessageEnabled(boolean z) {
        this.f23341b = z;
    }
}
