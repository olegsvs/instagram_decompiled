package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.creation.photo.edit.filter.BasicAdjustFilter;
import com.instagram.creation.photo.edit.filter.BlurredLumAdjustFilter;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.IgFilter;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.3z8 */
public final class AnonymousClass3z8 implements AnonymousClass3Cu, OnTouchListener {
    /* renamed from: B */
    public int f47838B;
    /* renamed from: C */
    public IgFilterGroup f47839C;
    /* renamed from: D */
    public AnonymousClass3Ct f47840D;
    /* renamed from: E */
    public boolean f47841E;
    /* renamed from: F */
    public boolean f47842F;
    /* renamed from: G */
    private AnonymousClass3GP f47843G;
    /* renamed from: H */
    private ViewGroup f47844H;
    /* renamed from: I */
    private int f47845I;
    /* renamed from: J */
    private AnonymousClass3ym f47846J;

    /* renamed from: B */
    public static void m21852B(AnonymousClass3z8 anonymousClass3z8, int i) {
        BlurredLumAdjustFilter blurredLumAdjustFilter = (BlurredLumAdjustFilter) anonymousClass3z8.f47839C.m22013B(12);
        BaseFilter B = AnonymousClass3GV.m19207B(anonymousClass3z8.f47839C);
        switch (anonymousClass3z8.f47843G.ordinal()) {
            case 0:
                B.f49496B = i;
                B.invalidate();
                break;
            case 1:
                B.f49498D = i;
                B.invalidate();
                break;
            case 2:
                B.f49502H = i;
                B.invalidate();
                break;
            case 3:
                B.f49505K = i;
                B.invalidate();
                break;
            case 4:
                B.f49516V = i;
                B.invalidate();
                break;
            case 5:
                B.f49500F = i;
                B.invalidate();
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                blurredLumAdjustFilter.m22699D(i);
                break;
            case 8:
                blurredLumAdjustFilter.m22698C(i);
                break;
            case 9:
                blurredLumAdjustFilter.m22697B(i);
                break;
            default:
                break;
        }
        anonymousClass3z8.f47839C.m22018G(13, B.m22695A());
    }

    /* renamed from: C */
    private View m21853C(Context context, int i, float f) {
        View igEditSeekBar = new IgEditSeekBar(context);
        igEditSeekBar.setRootPosition(f);
        igEditSeekBar.setValueRangeSize(i);
        igEditSeekBar.setCurrentValue(this.f47845I);
        igEditSeekBar.setOnSeekBarChangeListener(new AnonymousClass3z7(this));
        return igEditSeekBar;
    }

    public final String CT() {
        return this.f47846J.getTileInfo().getName();
    }

    /* renamed from: D */
    private static int m21854D(IgFilterGroup igFilterGroup, AnonymousClass3GP anonymousClass3GP) {
        BlurredLumAdjustFilter blurredLumAdjustFilter = (BlurredLumAdjustFilter) igFilterGroup.m22013B(12);
        BasicAdjustFilter B = AnonymousClass3GV.m19207B(igFilterGroup);
        switch (anonymousClass3GP.ordinal()) {
            case 0:
                return B.f49496B;
            case 1:
                return B.f49498D;
            case 2:
                return B.f49502H;
            case 3:
                return B.f49505K;
            case 4:
                return B.f49516V;
            case 5:
                return B.f49500F;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return blurredLumAdjustFilter.f49530I;
            case 8:
                return blurredLumAdjustFilter.f49527F;
            case 9:
                return blurredLumAdjustFilter.f49525D;
            default:
                return 0;
        }
    }

    public final void Hd(boolean z) {
        if (z) {
            this.f47845I = this.f47838B;
        }
        this.f47846J.setChecked(this.f47845I != 0);
        AnonymousClass3z8.m21852B(this, this.f47845I);
        this.f47844H.setOnTouchListener(null);
        this.f47844H = null;
        this.f47846J = null;
        this.f47843G = null;
        this.f47839C = null;
        this.f47840D = null;
    }

    public final View MI(Context context) {
        View C;
        View linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(AnonymousClass0G5.F(context, C0164R.attr.creationPrimaryBackgroundTop));
        switch (this.f47843G.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
                C = m21853C(context, 200, 0.5f);
                break;
            case 4:
            case 5:
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                C = m21853C(context, 100, 0.0f);
                break;
            default:
                return null;
        }
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.seek_bar_margins);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        linearLayout.addView(C, layoutParams);
        linearLayout.setImportantForAccessibility(2);
        C.setContentDescription(linearLayout.getResources().getString(C0164R.string.slider_type, new Object[]{this.f47846J.getTileInfo().getName()}));
        return linearLayout;
    }

    public final void SLA() {
        AnonymousClass3z8.m21852B(this, this.f47838B);
        if (this.f47841E) {
            this.f47839C.m22018G(17, false);
            this.f47839C.m22018G(18, false);
        }
    }

    public final void TLA() {
        AnonymousClass3z8.m21852B(this, this.f47845I);
        if (this.f47841E) {
            this.f47839C.m22018G(17, true);
            this.f47839C.m22018G(18, true);
        }
    }

    public final boolean Tz(View view, ViewGroup viewGroup, IgFilter igFilter, AnonymousClass3Ct anonymousClass3Ct) {
        this.f47839C = (IgFilterGroup) igFilter;
        AnonymousClass3ym anonymousClass3ym = (AnonymousClass3ym) view;
        this.f47846J = anonymousClass3ym;
        this.f47843G = ((AnonymousClass1Z6) anonymousClass3ym.getTileInfo()).f20127B;
        this.f47840D = anonymousClass3Ct;
        int D = AnonymousClass3z8.m21854D(this.f47839C, this.f47843G);
        this.f47838B = D;
        this.f47845I = D;
        this.f47844H = viewGroup;
        this.f47844H.setOnTouchListener(this);
        this.f47841E = this.f47839C.m22014C(18);
        return true;
    }

    public final boolean XW(AnonymousClass3ym anonymousClass3ym, IgFilter igFilter) {
        anonymousClass3ym.setChecked(AnonymousClass3z8.m21854D((IgFilterGroup) igFilter, ((AnonymousClass1Z6) anonymousClass3ym.getTileInfo()).f20127B) != 0);
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f47842F = true;
            AnonymousClass3z8.m21852B(this, 0);
            this.f47840D.vJA();
        } else if (motionEvent.getAction() == 1) {
            this.f47842F = false;
            AnonymousClass3z8.m21852B(this, this.f47838B);
            this.f47840D.vJA();
        }
        return true;
    }
}
