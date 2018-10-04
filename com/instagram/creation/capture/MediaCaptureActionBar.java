package com.instagram.creation.capture;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0IL;
import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass0eU;
import X.AnonymousClass0eV;
import X.AnonymousClass0ip;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass177;
import X.AnonymousClass178;
import X.AnonymousClass1SD;
import X.AnonymousClass3B8;
import X.AnonymousClass3DM;
import X.AnonymousClass3DN;
import X.AnonymousClass4HP;
import X.AnonymousClass4HU;
import X.AnonymousClass4IE;
import X.AnonymousClass5SU;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.base.TriangleSpinner;
import java.util.ArrayList;
import java.util.List;

public class MediaCaptureActionBar extends LinearLayout implements OnClickListener, AnonymousClass0QP, AnonymousClass3DN, AnonymousClass4HU, OnItemSelectedListener {
    /* renamed from: B */
    public AnonymousClass1SD f63989B;
    /* renamed from: C */
    public MediaCaptureFragment f63990C;
    /* renamed from: D */
    public final ImageView f63991D;
    /* renamed from: E */
    public AnonymousClass3DM f63992E;
    /* renamed from: F */
    public final Paint f63993F;
    /* renamed from: G */
    public MediaCaptureFragment f63994G;
    /* renamed from: H */
    public final TriangleSpinner f63995H;
    /* renamed from: I */
    public MediaCaptureFragment f63996I;
    /* renamed from: J */
    public boolean f63997J;
    /* renamed from: K */
    public final AnonymousClass0cN f63998K;
    /* renamed from: L */
    public final TextView f63999L;
    /* renamed from: M */
    public final TitleTextView f64000M;
    /* renamed from: N */
    public boolean f64001N;
    /* renamed from: O */
    public final TextView f64002O;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public int getTabCount() {
        return 1;
    }

    public final void lCA(AnonymousClass3DM anonymousClass3DM) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public MediaCaptureActionBar(Context context) {
        this(context, null);
    }

    public MediaCaptureActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaCaptureActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0164R.layout.media_capture_action_bar, this);
        getResources();
        AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5);
        setBackgroundResource(AnonymousClass0G5.F(getContext(), C0164R.attr.modalActionBarBackground));
        this.f63997J = AnonymousClass0e8.D(getContext());
        Paint paint = new Paint();
        this.f63993F = paint;
        paint.setColor(AnonymousClass0G5.D(getContext(), C0164R.attr.creationDividerColor));
        this.f63993F.setStyle(Style.STROKE);
        this.f63993F.setStrokeWidth(1.0f);
        AnonymousClass0cN A = AnonymousClass0e6.B().C().A(this);
        A.f7108F = true;
        this.f63998K = A;
        ImageView imageView = (ImageView) findViewById(C0164R.id.action_bar_cancel);
        this.f63991D = imageView;
        imageView.setBackground(new AnonymousClass0eU(getContext().getTheme(), AnonymousClass0eV.MODAL));
        this.f63991D.setOnClickListener(this);
        this.f63995H = (TriangleSpinner) findViewById(C0164R.id.gallery_folder_menu);
        this.f63999L = (TextView) findViewById(C0164R.id.photo_title);
        this.f64002O = (TextView) findViewById(C0164R.id.video_title);
        TitleTextView titleTextView = (TitleTextView) findViewById(C0164R.id.next_button_textview);
        this.f64000M = titleTextView;
        titleTextView.setVisibility(0);
        this.f64000M.setOnClickListener(this);
        setLayoutParams(new LayoutParams(-1, AnonymousClass0ip.B(context)));
    }

    /* renamed from: A */
    public final void m26737A() {
        AnonymousClass3DM anonymousClass3DM = this.f63992E;
        boolean z = false;
        if (anonymousClass3DM == null) {
            m26735B(this, false, false, false);
            return;
        }
        if (anonymousClass3DM == AnonymousClass4HP.f52330C) {
            m26735B(this, false, false, true);
        } else if (this.f63992E == AnonymousClass4HP.f52331D) {
            MediaCaptureFragment mediaCaptureFragment = this.f63994G;
            boolean z2 = (mediaCaptureFragment == null || mediaCaptureFragment.mCaptureProvider.MY()) ? false : true;
            mediaCaptureFragment = this.f63994G;
            if (mediaCaptureFragment != null && mediaCaptureFragment.mCaptureProvider.JV()) {
                z = true;
            }
            m26735B(this, z2, z, true);
        } else if (this.f63992E == AnonymousClass4HP.f52329B) {
            Object obj = ((float) getHeight()) - getTranslationY() > 0.0f ? 1 : null;
            if (m26736C() && obj != null) {
                z = true;
            }
            m26735B(this, true, z, true);
        }
    }

    /* renamed from: B */
    public static void m26735B(MediaCaptureActionBar mediaCaptureActionBar, boolean z, boolean z2, boolean z3) {
        AnonymousClass0cN anonymousClass0cN = mediaCaptureActionBar.f63998K;
        if (anonymousClass0cN != null) {
            if (mediaCaptureActionBar.f64001N) {
                anonymousClass0cN.L(1.0d);
                return;
            }
            if (z3) {
                anonymousClass0cN.N((double) z2);
            } else {
                anonymousClass0cN.L((double) z2);
            }
            mediaCaptureActionBar.f64000M.setEnabled(z);
        }
    }

    /* renamed from: C */
    private boolean m26736C() {
        MediaCaptureFragment mediaCaptureFragment = this.f63996I;
        if (mediaCaptureFragment == null) {
            return false;
        }
        return mediaCaptureFragment.mGalleryPickerView.B();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        this.f64000M.setAlpha((float) anonymousClass0cN.E());
    }

    public final boolean bm(AnonymousClass3B8 anonymousClass3B8, int i) {
        if (this.f63996I == null || anonymousClass3B8.f38661B != -4) {
            return false;
        }
        if (i == 1) {
            this.f63996I.m26741c(this, anonymousClass3B8);
        }
        return true;
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        int left = getLeft();
        float bottom = (float) (getBottom() - 1);
        canvas2.drawLine((float) left, bottom, (float) getRight(), bottom, this.f63993F);
    }

    public AnonymousClass3B8 getCurrentFolder() {
        MediaCaptureFragment mediaCaptureFragment = this.f63996I;
        if (mediaCaptureFragment == null) {
            return null;
        }
        return mediaCaptureFragment.mGalleryPickerView.getCurrentFolder();
    }

    public List getFolders() {
        MediaCaptureFragment mediaCaptureFragment = this.f63996I;
        if (mediaCaptureFragment == null) {
            return new ArrayList();
        }
        return mediaCaptureFragment.mGalleryPickerView.getFolders();
    }

    public final void jCA(float f, float f2) {
        if (f <= ((float) AnonymousClass4HP.f52329B.f39243B)) {
            this.f63995H.setAlpha(1.0f);
            this.f63995H.setEnabled(true);
            this.f63999L.setAlpha(0.0f);
            this.f64002O.setAlpha(0.0f);
        } else if (f <= ((float) AnonymousClass4HP.f52330C.f39243B)) {
            this.f63995H.setAlpha(((float) AnonymousClass4HP.f52330C.f39243B) - f);
            this.f63995H.setEnabled(false);
            this.f63999L.setAlpha(1.0f - (((float) AnonymousClass4HP.f52330C.f39243B) - f));
            this.f64002O.setAlpha(0.0f);
        } else if (f <= ((float) AnonymousClass4HP.f52330C.f39243B) || f > ((float) AnonymousClass4HP.f52331D.f39243B)) {
            this.f63995H.setAlpha(0.0f);
            this.f63995H.setEnabled(false);
            this.f63999L.setAlpha(0.0f);
            this.f64002O.setAlpha(1.0f);
        } else {
            this.f63995H.setAlpha(0.0f);
            this.f63995H.setEnabled(false);
            this.f63999L.setAlpha(((float) AnonymousClass4HP.f52331D.f39243B) - f);
            this.f64002O.setAlpha(1.0f - (((float) AnonymousClass4HP.f52331D.f39243B) - f));
        }
        m26737A();
    }

    public final void kCA(AnonymousClass3DM anonymousClass3DM, AnonymousClass3DM anonymousClass3DM2) {
        this.f63992E = anonymousClass3DM2;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1695429392);
        AnonymousClass0IL anonymousClass0IL = this.f63990C;
        if (anonymousClass0IL == null) {
            AnonymousClass0cQ.L(this, -1698785214, M);
            return;
        }
        if (view != this.f63991D) {
            if (view == this.f64000M) {
                if ((this.f63998K.f7106D == 1.0d ? 1 : null) != null) {
                    MediaCaptureFragment mediaCaptureFragment = this.f63990C;
                    switch (mediaCaptureFragment.mCaptureProvider.getCaptureMode().ordinal()) {
                        case 0:
                            if (mediaCaptureFragment.mGalleryPickerView.B()) {
                                mediaCaptureFragment.mGalleryPickerView.A();
                                mediaCaptureFragment.f64006E.A();
                                break;
                            }
                            break;
                        case 2:
                            if (!mediaCaptureFragment.mCaptureProvider.WV()) {
                                AnonymousClass5SU anonymousClass5SU = (AnonymousClass5SU) mediaCaptureFragment.mCaptureProvider;
                                AnonymousClass173 C = new AnonymousClass173((Activity) anonymousClass5SU.getContext(), new AnonymousClass174(anonymousClass5SU.getContext().getString(C0164R.string.video_minimum_warning))).C(anonymousClass5SU.f63962O);
                                C.f14648N = AnonymousClass178.f14655F;
                                C.f14642H = AnonymousClass177.ABOVE_ANCHOR;
                                View rootView = anonymousClass5SU.getRootView();
                                if (rootView != null) {
                                    rootView.post(new AnonymousClass4IE(anonymousClass5SU, C));
                                }
                                AnonymousClass5SU.m26715C(anonymousClass5SU, true);
                                break;
                            }
                            mediaCaptureFragment.mCaptureProvider.yHA();
                            mediaCaptureFragment.f64006E.A();
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        anonymousClass0IL.f64005D = true;
        ((Activity) anonymousClass0IL.getContext()).onBackPressed();
        AnonymousClass0cQ.L(this, 438122751, M);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass3B8 anonymousClass3B8 = (AnonymousClass3B8) getFolders().get(i);
        if (this.f63996I != null && anonymousClass3B8.f38661B != getCurrentFolder().f38661B) {
            this.f63996I.m26741c(this, anonymousClass3B8);
        }
    }

    public void setBaseDelegate(MediaCaptureFragment mediaCaptureFragment) {
        this.f63990C = mediaCaptureFragment;
        if (mediaCaptureFragment != null) {
            m26737A();
        }
    }

    public void setFeedCaptureDelegate(MediaCaptureFragment mediaCaptureFragment) {
        this.f63994G = mediaCaptureFragment;
        if (mediaCaptureFragment != null) {
            m26737A();
        }
    }

    public void setGalleryDelegate(MediaCaptureFragment mediaCaptureFragment) {
        this.f63996I = mediaCaptureFragment;
        this.f63989B = new AnonymousClass1SD(this, getResources(), getTabCount());
        this.f63995H.setAdapter(this.f63989B);
        this.f63995H.setOnItemSelectedListener(this);
        if (this.f63996I != null) {
            m26737A();
        }
    }

    public void setNextEnabledWithColor(boolean z) {
        int C;
        this.f64000M.setEnabled(z);
        TitleTextView titleTextView = this.f64000M;
        if (z) {
            C = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5);
        } else {
            C = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_4);
        }
        titleTextView.setTextColor(C);
    }

    public void setSelectedFolder(AnonymousClass3B8 anonymousClass3B8) {
        for (int i = 0; i < getFolders().size(); i++) {
            if (((AnonymousClass3B8) getFolders().get(i)).f38661B == anonymousClass3B8.f38661B) {
                this.f63995H.setSelection(i);
                return;
            }
        }
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        m26737A();
    }
}
