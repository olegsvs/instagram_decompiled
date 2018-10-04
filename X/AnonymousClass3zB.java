package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.creation.photo.edit.luxfilter.LuxFilter;
import com.instagram.filterkit.filter.IgFilter;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;

/* renamed from: X.3zB */
public final class AnonymousClass3zB implements AnonymousClass3Cu, OnTouchListener {
    /* renamed from: B */
    public int f47848B;
    /* renamed from: C */
    public IgFilterGroup f47849C;
    /* renamed from: D */
    public IgEditSeekBar f47850D;
    /* renamed from: E */
    public AnonymousClass3Ct f47851E;
    /* renamed from: F */
    public int f47852F;
    /* renamed from: G */
    public boolean f47853G;
    /* renamed from: H */
    public boolean f47854H;
    /* renamed from: I */
    private ViewGroup f47855I;

    public final String CT() {
        return "Lux";
    }

    public final boolean XW(AnonymousClass3ym anonymousClass3ym, IgFilter igFilter) {
        return false;
    }

    /* renamed from: B */
    public static void m21855B(AnonymousClass3zB anonymousClass3zB, int i) {
        ((LuxFilter) anonymousClass3zB.f47849C.m22013B(9)).m23023F(i);
        anonymousClass3zB.f47849C.m22018G(9, i > 0);
    }

    public final void Hd(boolean z) {
        if (z) {
            this.f47852F = this.f47848B;
        }
        AnonymousClass3zB.m21855B(this, this.f47852F);
        this.f47855I.setOnTouchListener(null);
        this.f47855I = null;
        this.f47849C = null;
        this.f47851E = null;
        this.f47850D = null;
    }

    public final View MI(Context context) {
        View linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(AnonymousClass0G5.F(context, C0164R.attr.creationPrimaryBackgroundTop));
        IgEditSeekBar igEditSeekBar = new IgEditSeekBar(context);
        igEditSeekBar.setRootPosition(0.0f);
        igEditSeekBar.setValueRangeSize(100);
        int i = this.f47852F;
        if (i == -1) {
            i = 50;
        }
        igEditSeekBar.setCurrentValue(i);
        igEditSeekBar.setOnSeekBarChangeListener(new AnonymousClass3zA(this));
        this.f47850D = igEditSeekBar;
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.seek_bar_margins);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        linearLayout.addView(this.f47850D, layoutParams);
        linearLayout.setContentDescription(linearLayout.getResources().getString(C0164R.string.slider_type, new Object[]{CT()}));
        return linearLayout;
    }

    public final void SLA() {
        AnonymousClass3zB.m21855B(this, this.f47848B);
        if (this.f47853G) {
            this.f47849C.m22018G(17, false);
            this.f47849C.m22018G(18, false);
        }
    }

    public final void TLA() {
        AnonymousClass3zB.m21855B(this, this.f47852F);
        if (this.f47853G) {
            this.f47849C.m22018G(17, true);
            this.f47849C.m22018G(18, true);
        }
    }

    public final boolean Tz(View view, ViewGroup viewGroup, IgFilter igFilter, AnonymousClass3Ct anonymousClass3Ct) {
        IgFilterGroup igFilterGroup = (IgFilterGroup) igFilter;
        this.f47849C = igFilterGroup;
        this.f47851E = anonymousClass3Ct;
        int i = ((LuxFilter) igFilterGroup.m22013B(9)).f50068C;
        this.f47852F = i;
        this.f47848B = i;
        this.f47855I = viewGroup;
        this.f47855I.setOnTouchListener(this);
        this.f47853G = this.f47849C.m22014C(18);
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f47854H = true;
            AnonymousClass3zB.m21855B(this, 0);
            this.f47851E.vJA();
        } else if (motionEvent.getAction() == 1) {
            this.f47854H = false;
            AnonymousClass3zB.m21855B(this, this.f47848B);
            this.f47851E.vJA();
        }
        return true;
    }
}
