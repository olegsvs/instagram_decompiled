package com.instagram.creation.base.ui.effectpicker;

import X.AnonymousClass0GG;
import X.AnonymousClass0Kq;
import X.AnonymousClass0cQ;
import X.AnonymousClass0g3;
import X.AnonymousClass3B1;
import X.AnonymousClass3B3;
import X.AnonymousClass3Ch;
import X.AnonymousClass3Ci;
import X.AnonymousClass3Cj;
import X.AnonymousClass3Cs;
import X.AnonymousClass3Cv;
import X.AnonymousClass3Cx;
import X.AnonymousClass3Cy;
import X.AnonymousClass3D1;
import X.AnonymousClass3D4;
import X.AnonymousClass3yj;
import X.AnonymousClass3yk;
import X.AnonymousClass3yl;
import X.AnonymousClass3ym;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class FilterPicker extends EffectPicker implements Runnable, AnonymousClass3B3 {
    /* renamed from: B */
    public final List f47747B = new ArrayList();
    /* renamed from: C */
    public final Handler f47748C = new AnonymousClass3Cy(this, Looper.getMainLooper());
    /* renamed from: D */
    public long f47749D;
    /* renamed from: E */
    private View f47750E;
    /* renamed from: F */
    private final Executor f47751F;
    /* renamed from: G */
    private boolean f47752G;
    /* renamed from: H */
    private int f47753H;
    /* renamed from: I */
    private float f47754I;

    public FilterPicker(Context context) {
        super(context);
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "FilterPicker";
        this.f47751F = B.A();
    }

    public FilterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "FilterPicker";
        this.f47751F = B.A();
    }

    public FilterPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "FilterPicker";
        this.f47751F = B.A();
    }

    /* renamed from: B */
    public static void m21819B(FilterPicker filterPicker) {
        int indexFromDrag = filterPicker.getIndexFromDrag();
        View childAt = filterPicker.f39131F.getChildAt(indexFromDrag);
        View view = filterPicker.f47750E;
        if (childAt != view) {
            int i;
            AnonymousClass3ym anonymousClass3ym = (AnonymousClass3ym) view;
            if (anonymousClass3ym.getLayoutParams().width >= 0) {
                i = anonymousClass3ym.getLayoutParams().width;
            } else {
                i = anonymousClass3ym.getWidth();
            }
            if (filterPicker.f47753H > indexFromDrag) {
                i = -i;
            }
            Animation translateAnimation = new TranslateAnimation((float) i, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            childAt.startAnimation(translateAnimation);
            if (filterPicker.f47750E.getAnimation() != null) {
                filterPicker.f47750E.clearAnimation();
            }
            filterPicker.f39131F.removeView(filterPicker.f47750E);
            filterPicker.f39127B.remove(filterPicker.f47750E);
            filterPicker.f39131F.addView(filterPicker.f47750E, indexFromDrag);
            filterPicker.f39127B.add(indexFromDrag, (AnonymousClass3ym) filterPicker.f47750E);
            filterPicker.f39131F.requestLayout();
            int oM = ((AnonymousClass3ym) childAt).getTileInfo().oM();
            int oM2 = anonymousClass3ym.getTileInfo().oM();
            i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < filterPicker.f47747B.size(); i3++) {
                if (((AnonymousClass3Cj) filterPicker.f47747B.get(i3)).f39100D == oM) {
                    i2 = i3;
                } else if (((AnonymousClass3Cj) filterPicker.f47747B.get(i3)).f39100D == oM2) {
                    i = i3;
                }
            }
            filterPicker.f47747B.add(i2, (AnonymousClass3Cj) filterPicker.f47747B.remove(i));
        }
        filterPicker.f47753H = indexFromDrag;
    }

    /* renamed from: C */
    public final boolean mo4779C(int i, AnonymousClass3Cv anonymousClass3Cv) {
        return ((anonymousClass3Cv instanceof AnonymousClass3yj) || i == 0) ? false : true;
    }

    /* renamed from: E */
    public final boolean mo4780E(int i, boolean z) {
        if (z && this.f47752G) {
            if (i == ((AnonymousClass3ym) this.f39131F.getChildAt(this.f39131F.getChildCount() - 2)).getTileInfo().oM()) {
                return false;
            }
        }
        return true;
    }

    public final void Yj(View view, boolean z) {
        this.f47750E = null;
        this.f47748C.removeCallbacksAndMessages(null);
        AnonymousClass3ym anonymousClass3ym = (AnonymousClass3ym) view;
        if (z) {
            this.f39131F.removeView(view);
            this.f39127B.remove(view);
            int oM = anonymousClass3ym.getTileInfo().oM();
            for (AnonymousClass3Cj anonymousClass3Cj : this.f47747B) {
                if (anonymousClass3Cj.f39100D == oM) {
                    anonymousClass3Cj.f39099C = true;
                    AnonymousClass3Ch.m19024B(AnonymousClass0g3.FilterDragHide.A(), this.f47753H, anonymousClass3ym.getTileInfo().getName(), oM, "editor_view");
                    if (anonymousClass3ym.isChecked()) {
                        m19036D(0);
                    }
                }
            }
        } else {
            AnonymousClass3Ch.m19024B(AnonymousClass0g3.FilterDragPlace.A(), this.f47753H, anonymousClass3ym.getTileInfo().getName(), anonymousClass3ym.getTileInfo().oM(), "editor_view");
            view.setVisibility(0);
        }
        AnonymousClass0GG.B(this.f47751F, this, 965145037);
    }

    public AnonymousClass3Cs getConfig() {
        return AnonymousClass3Cs.f39113J;
    }

    private int getIndexFromDrag() {
        int childCount = (this.f39131F.getChildCount() - 1) - this.f47752G;
        int i = 1;
        int i2 = 0;
        while (i <= childCount) {
            i2 = (i + childCount) >>> 1;
            if (this.f47754I >= ((float) ((this.f39132G * i2) - getScrollX()))) {
                if (this.f47754I <= ((float) (((this.f39132G * i2) - getScrollX()) + this.f39132G))) {
                    break;
                }
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
        }
        return i2;
    }

    public List getTileButtons() {
        return this.f39127B;
    }

    public final void ij(View view, float f, float f2) {
        this.f47750E = view;
        this.f47754I = f;
        this.f47753H = getIndexFromDrag();
        AnonymousClass3Cv tileInfo = ((AnonymousClass3ym) view).getTileInfo();
        AnonymousClass3Ch.m19024B(AnonymousClass0g3.FilterDragStart.A(), this.f47753H, tileInfo.getName(), tileInfo.oM(), "editor_view");
        view.setVisibility(4);
    }

    public final void nj() {
        this.f47748C.removeCallbacksAndMessages(null);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 635847959);
        super.onAttachedToWindow();
        AnonymousClass3B1.f38644B.m18848A(AnonymousClass3yk.class, this);
        AnonymousClass0cQ.O(this, -869795041, N);
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -305833034);
        setFilterStateToOld((AnonymousClass3ym) view);
        super.onClick(view);
        AnonymousClass0cQ.L(this, -764275165, M);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -1188940416);
        super.onDetachedFromWindow();
        AnonymousClass3B1.f38644B.m18852E(AnonymousClass3yk.class, this);
        AnonymousClass0cQ.O(this, -581739648, N);
    }

    public final void pj(View view, float f, float f2, boolean z, boolean z2) {
        this.f47754I = f;
        if (((float) (this.f39132G / 2)) + f <= ((float) getWidth()) || getScrollX() == this.f39131F.getWidth() - getWidth()) {
            if (f - ((float) (this.f39132G / 2)) >= 0.0f || getScrollX() == 0) {
                this.f47748C.removeCallbacksAndMessages(null);
            } else if (!this.f47748C.hasMessages(1)) {
                this.f47749D = System.currentTimeMillis();
                this.f47748C.sendEmptyMessage(1);
            }
        } else if (!this.f47748C.hasMessages(2)) {
            this.f47749D = System.currentTimeMillis();
            this.f47748C.sendEmptyMessage(2);
        }
        AnonymousClass3ym anonymousClass3ym = (AnonymousClass3ym) this.f39131F.getChildAt(this.f47753H);
        if (z) {
            anonymousClass3ym.m21827A();
        } else if (anonymousClass3ym.getAnimationState() != AnonymousClass3D1.NONE) {
            m21819B(this);
            anonymousClass3ym.m21828B();
        } else {
            m21819B(this);
        }
    }

    public final void run() {
        AnonymousClass3Ci anonymousClass3Ci = new AnonymousClass3Ci();
        anonymousClass3Ci.f39097B = new ArrayList(this.f47747B);
        AnonymousClass3Cx anonymousClass3Cx = this.f39128C;
        if (anonymousClass3Cx != null) {
            anonymousClass3Cx.VDA(anonymousClass3Ci);
        }
    }

    public void setEffects(List list) {
        this.f47747B.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3Cv anonymousClass3Cv = (AnonymousClass3Cv) it.next();
            if ((anonymousClass3Cv instanceof AnonymousClass3yl) && anonymousClass3Cv.oM() != 0) {
                AnonymousClass3yl anonymousClass3yl = (AnonymousClass3yl) anonymousClass3Cv;
                this.f47747B.add(anonymousClass3yl.f47746B);
                if (anonymousClass3yl.f47746B.f39099C) {
                    it.remove();
                }
            } else if (anonymousClass3Cv.oM() == -1) {
                this.f47752G = true;
            }
        }
        super.setEffects(list);
    }

    public void setFilterStateToOld(AnonymousClass3ym anonymousClass3ym) {
        int oM = anonymousClass3ym.getTileInfo().oM();
        for (AnonymousClass3Cj anonymousClass3Cj : this.f47747B) {
            if (anonymousClass3Cj.f39100D == oM && anonymousClass3Cj.f39101E) {
                Drawable drawable;
                anonymousClass3Cj.f39101E = false;
                AnonymousClass3Cv anonymousClass3Cv = anonymousClass3ym.f47761H;
                Resources resources = anonymousClass3ym.getResources();
                AnonymousClass3D4 anonymousClass3D4 = anonymousClass3ym.f47758E;
                if (anonymousClass3D4 != null) {
                    drawable = anonymousClass3D4.f39146B;
                } else {
                    drawable = null;
                }
                anonymousClass3ym.f47758E = anonymousClass3Cv.vH(resources, drawable, anonymousClass3ym.f47755B);
                AnonymousClass3ym.m21824D(anonymousClass3ym);
                anonymousClass3ym.postInvalidate();
                AnonymousClass0GG.B(this.f47751F, this, 1250320974);
                return;
            }
        }
    }
}
