package com.instagram.creation.video.ui;

import X.AnonymousClass0CC;
import X.AnonymousClass0Nm;
import X.AnonymousClass3Hi;
import X.AnonymousClass3pF;
import X.AnonymousClass3pG;
import X.AnonymousClass3zj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class CamcorderBlinker extends ColorFilterAlphaImageView implements AnonymousClass3Hi {
    /* renamed from: B */
    public Animation f48125B;
    /* renamed from: C */
    private AnonymousClass3zj f48126C;
    /* renamed from: D */
    private int f48127D = AnonymousClass0Nm.J(getContext());

    public final void ax() {
    }

    public final void ig(AnonymousClass3pG anonymousClass3pG) {
    }

    public CamcorderBlinker(Context context) {
        super(context);
        m21959C();
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21959C();
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m21959C();
    }

    /* renamed from: B */
    public final void m21961B() {
        if (this.f48126C.m21890G()) {
            clearAnimation();
            setVisibility(8);
            return;
        }
        startAnimation(this.f48125B);
        setVisibility(0);
        m21960D();
    }

    /* renamed from: C */
    private void m21959C() {
        this.f48125B = AnimationUtils.loadAnimation(getContext(), C0164R.anim.camcorder_blinker);
    }

    /* renamed from: D */
    private void m21960D() {
        if (this.f48126C != null) {
            getDrawable().getIntrinsicWidth();
            double E = (double) this.f48126C.m21888E();
            double intValue = (double) (((Integer) AnonymousClass0CC.Ck.G()).intValue() * JsonMappingException.MAX_REFS_TO_LIST);
            Double.isNaN(E);
            Double.isNaN(intValue);
            E /= intValue;
            intValue = (double) this.f48127D;
            Double.isNaN(intValue);
            E *= intValue;
            intValue = (double) AnonymousClass0Nm.E(getResources().getDisplayMetrics(), 1);
            Double.isNaN(intValue);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
            marginLayoutParams.setMargins((int) Math.max(E - intValue, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED), 0, 0, 0);
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void jg(AnonymousClass3pG anonymousClass3pG, AnonymousClass3pF anonymousClass3pF) {
        if (anonymousClass3pF != AnonymousClass3pF.SOFT_DELETED) {
            if (anonymousClass3pF != AnonymousClass3pF.RECORDING) {
                startAnimation(this.f48125B);
                setVisibility(0);
                return;
            }
        }
        clearAnimation();
        setVisibility(8);
    }

    public final void kg(AnonymousClass3pG anonymousClass3pG) {
        m21960D();
    }

    public final void mg(AnonymousClass3pG anonymousClass3pG) {
        startAnimation(this.f48125B);
        setVisibility(0);
        m21960D();
    }

    public final void ng() {
        clearAnimation();
        setVisibility(8);
    }

    public void setClipStackManager(AnonymousClass3zj anonymousClass3zj) {
        this.f48126C = anonymousClass3zj;
        m21960D();
    }
}
