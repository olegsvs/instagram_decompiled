package com.instagram.ui.widget.bannertoast;

import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass1LW;
import X.AnonymousClass3jK;
import X.AnonymousClass3jL;
import X.AnonymousClass3jM;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.LinkedList;

public class BannerToast extends TextView implements AnonymousClass0QP {
    /* renamed from: B */
    public AnonymousClass1LW f17363B;
    /* renamed from: C */
    public AnonymousClass0cN f17364C;
    /* renamed from: D */
    public final LinkedList f17365D;
    /* renamed from: E */
    private boolean f17366E;
    /* renamed from: F */
    private boolean f17367F;
    /* renamed from: G */
    private AnonymousClass3jM f17368G;

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public BannerToast(Context context) {
        this(context, null, 0);
    }

    public BannerToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17365D = new LinkedList();
    }

    /* renamed from: B */
    public static void m10863B(BannerToast bannerToast) {
        if (!bannerToast.f17367F) {
            AnonymousClass0cN L = AnonymousClass0e6.m6190B().m6193C().m5770O(AnonymousClass0e5.m6189C(1.0d, 3.0d)).m5767L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            L.f7108F = true;
            bannerToast.f17364C = L;
            L.m5756A(bannerToast);
            bannerToast.f17367F = true;
        }
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN.f7106D == 1.0d) {
            setVisibility(0);
        }
    }

    /* renamed from: C */
    public static void m10864C(BannerToast bannerToast, boolean z) {
        m10863B(bannerToast);
        bannerToast.f17366E = z;
        if (bannerToast.getHeight() == 0) {
            bannerToast.postDelayed(new AnonymousClass3jK(bannerToast), 300);
        } else {
            bannerToast.f17364C.m5769N(1.0d);
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN.m5760E() == 1.0d && this.f17366E) {
            postDelayed(new AnonymousClass3jL(this, anonymousClass0cN), 1500);
        } else if (anonymousClass0cN.m5760E() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            setVisibility(8);
            this.f17363B = null;
            m10863B(this);
            if (this.f17363B == null && !this.f17365D.isEmpty()) {
                AnonymousClass1LW anonymousClass1LW = (AnonymousClass1LW) this.f17365D.removeFirst();
                this.f17363B = anonymousClass1LW;
                setText(anonymousClass1LW.f17370C);
                setBackgroundResource(this.f17363B.f17369B);
                m10864C(this, true);
            }
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float C = (float) AnonymousClass0dh.m6103C(anonymousClass0cN.m5760E(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (-getHeight()), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        setTranslationY(C);
        AnonymousClass3jM anonymousClass3jM = this.f17368G;
        if (anonymousClass3jM != null) {
            anonymousClass3jM.SEA(C + ((float) getHeight()));
        }
    }

    public void setListener(AnonymousClass3jM anonymousClass3jM) {
        this.f17368G = anonymousClass3jM;
    }
}
