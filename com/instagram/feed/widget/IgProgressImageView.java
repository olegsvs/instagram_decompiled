package com.instagram.feed.widget;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Gl;
import X.AnonymousClass0Gm;
import X.AnonymousClass0LH;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nm;
import X.AnonymousClass0ag;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass0iY;
import X.AnonymousClass0lV;
import X.AnonymousClass0p8;
import X.AnonymousClass0yy;
import X.AnonymousClass0z0;
import X.AnonymousClass0z2;
import X.AnonymousClass15q;
import X.AnonymousClass15r;
import X.AnonymousClass15s;
import X.AnonymousClass15t;
import X.AnonymousClass15u;
import X.AnonymousClass15v;
import X.AnonymousClass15w;
import X.AnonymousClass19y;
import X.AnonymousClass1AM;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public class IgProgressImageView extends FrameLayout {
    /* renamed from: T */
    public static final Object f9958T = new Object();
    /* renamed from: B */
    public boolean f9959B;
    /* renamed from: C */
    public ColorFilterAlphaImageView f9960C;
    /* renamed from: D */
    public IgImageView f9961D;
    /* renamed from: E */
    public boolean f9962E;
    /* renamed from: F */
    public boolean f9963F;
    /* renamed from: G */
    public AnonymousClass0z0 f9964G;
    /* renamed from: H */
    public final SparseArray f9965H = new SparseArray();
    /* renamed from: I */
    public final SparseArray f9966I = new SparseArray();
    /* renamed from: J */
    public ProgressBar f9967J;
    /* renamed from: K */
    public ScaleType f9968K;
    /* renamed from: L */
    public TextView f9969L;
    /* renamed from: M */
    public final AnonymousClass0Gm f9970M = AnonymousClass0Gl.f2412B;
    /* renamed from: N */
    private float f9971N = 1.0f;
    /* renamed from: O */
    private boolean f9972O = true;
    /* renamed from: P */
    private AnonymousClass15q f9973P = AnonymousClass15q.RETRY_TEXT;
    /* renamed from: Q */
    private boolean f9974Q;
    /* renamed from: R */
    private AnonymousClass15w f9975R;
    /* renamed from: S */
    private String f9976S;

    public IgProgressImageView(Context context) {
        super(context);
        m7584A(null);
    }

    public IgProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7584A(attributeSet);
    }

    /* renamed from: A */
    public final void m7584A(AttributeSet attributeSet) {
        removeAllViews();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.IgProgressImageView);
            this.f9976S = obtainStyledAttributes.getString(3);
            this.f9959B = obtainStyledAttributes.getBoolean(1, false);
            this.f9974Q = obtainStyledAttributes.getBoolean(2, false);
            this.f9968K = ScaleType.values()[obtainStyledAttributes.getInt(0, ScaleType.FIT_XY.ordinal())];
            this.f9973P = AnonymousClass15q.values()[obtainStyledAttributes.getInt(4, 0)];
            obtainStyledAttributes.recycle();
        }
        if (this.f9959B) {
            this.f9961D = new CircularImageView(getContext());
        } else {
            IgImageView igImageView = new IgImageView(getContext());
            this.f9961D = igImageView;
            igImageView.setScaleType(this.f9968K);
        }
        this.f9961D.setProgressListener(new AnonymousClass15r(this));
        this.f9961D.setReportProgress(true);
        this.f9961D.setOnLoadListener(new AnonymousClass15s(this));
        this.f9961D.setProgressiveImageListener(new AnonymousClass15t(this));
        this.f9961D.setMiniPreviewLoadListener(new AnonymousClass15u(this));
        if (((Boolean) AnonymousClass0CC.XU.m845G()).booleanValue()) {
            synchronized (f9958T) {
                this.f9967J = new IgProgressImageViewProgressBar(getContext(), null, 16842872);
            }
        } else {
            this.f9967J = new IgProgressImageViewProgressBar(getContext(), null, 16842872);
        }
        this.f9967J.setIndeterminate(false);
        this.f9967J.setProgressDrawable(AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.feed_image_determinate_progress));
        this.f9967J.setMax(100);
        if (this.f9973P == AnonymousClass15q.RETRY_ICON) {
            ColorFilterAlphaImageView colorFilterAlphaImageView = new ColorFilterAlphaImageView(getContext());
            this.f9960C = colorFilterAlphaImageView;
            colorFilterAlphaImageView.setImageResource(C0164R.drawable.refresh_big);
            this.f9960C.setNormalColorFilter(-1);
            this.f9960C.setOnClickListener(new AnonymousClass15v(this));
        } else {
            TextView textView = new TextView(getContext());
            this.f9969L = textView;
            textView.setText(C0164R.string.tap_to_reload);
            this.f9969L.setGravity(17);
            this.f9969L.setOnClickListener(new AnonymousClass19y(this));
        }
        addView(this.f9961D, new LayoutParams(-1, -1, 17));
        addView(this.f9967J, new LayoutParams(-1, -2, 17));
        if (this.f9973P == AnonymousClass15q.RETRY_ICON) {
            int dimension = (int) this.f9960C.getResources().getDimension(C0164R.dimen.retry_icon_size);
            addView(this.f9960C, new LayoutParams(dimension, dimension, 17));
        } else {
            addView(this.f9969L, new LayoutParams(-1, -2, 17));
        }
        m7583C(this, AnonymousClass15w.LOADING);
        this.f9963F = false;
        this.f9962E = false;
    }

    /* renamed from: B */
    public static void m7582B(IgProgressImageView igProgressImageView) {
        if (igProgressImageView.f9961D.getUrl() != null) {
            IgImageView igImageView = igProgressImageView.f9961D;
            AnonymousClass0LH.m2928F(igImageView.f2566Z, "Cannot retry if url not set");
            igImageView.m1962C(igImageView.f2566Z, false);
            if (igProgressImageView.f9976S != null) {
                AnonymousClass0iY.m6919B(AnonymousClass0NN.m3291B("image_view_retry_click", AnonymousClass0iY.m6920C(igProgressImageView.getContext())).m3298F("category", igProgressImageView.f9976S), igProgressImageView.getContext()).m3310R();
            }
        }
    }

    /* renamed from: B */
    public final boolean m7585B() {
        IgImageView igImageView = this.f9961D;
        if (!(igImageView.f2550J || igImageView.f2548H || igImageView.f2544D > 0)) {
            if (!igImageView.f2555O) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public final void m7586C(int i) {
        this.f9965H.delete(i);
    }

    /* renamed from: C */
    public static void m7583C(IgProgressImageView igProgressImageView, AnonymousClass15w anonymousClass15w) {
        if (igProgressImageView.f9975R != anonymousClass15w) {
            igProgressImageView.f9975R = anonymousClass15w;
            ProgressBar progressBar = igProgressImageView.f9967J;
            int i = 0;
            int i2 = (igProgressImageView.f9975R == AnonymousClass15w.LOADING && igProgressImageView.f9972O) ? 0 : 8;
            progressBar.setVisibility(i2);
            if (igProgressImageView.f9973P == AnonymousClass15q.RETRY_ICON) {
                ColorFilterAlphaImageView colorFilterAlphaImageView = igProgressImageView.f9960C;
                if (igProgressImageView.f9975R != AnonymousClass15w.ERROR) {
                    i = 8;
                }
                colorFilterAlphaImageView.setVisibility(i);
                return;
            }
            TextView textView = igProgressImageView.f9969L;
            if (igProgressImageView.f9975R != AnonymousClass15w.ERROR) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: D */
    public final void m7587D() {
        this.f9970M.m1874D(this, AnonymousClass0lV.Unset);
        this.f9963F = false;
        this.f9962E = false;
        m7583C(this, AnonymousClass15w.LOADING);
        this.f9967J.setProgress(0);
        this.f9961D.m1960A();
    }

    /* renamed from: E */
    public final void m7588E(int i, AnonymousClass0yy anonymousClass0yy) {
        this.f9965H.put(i, anonymousClass0yy);
    }

    /* renamed from: F */
    public final void m7589F(int i, AnonymousClass0z2 anonymousClass0z2) {
        this.f9966I.put(i, anonymousClass0z2);
    }

    /* renamed from: G */
    public final void m7590G(String str, boolean z) {
        this.f9970M.m1874D(this, AnonymousClass0lV.Unset);
        this.f9970M.m1874D(this, AnonymousClass0lV.LoadingData);
        m7583C(this, AnonymousClass15w.LOADING);
        IgImageView igImageView = this.f9961D;
        AnonymousClass0LH.m2927E(str);
        igImageView.f2547G = null;
        igImageView.m1962C(str, z);
    }

    public int getCurrentScans() {
        return this.f9961D.getCurrentScans();
    }

    public IgImageView getIgImageView() {
        return this.f9961D;
    }

    private AnonymousClass0lV getUIContentState() {
        switch (this.f9975R.ordinal()) {
            case 0:
            case 1:
                return AnonymousClass0lV.LoadingData;
            case 2:
                return AnonymousClass0lV.ShowingData;
            case 3:
                return AnonymousClass0lV.FailedToLoad;
            default:
                return AnonymousClass0lV.Unset;
        }
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -144968289);
        super.onAttachedToWindow();
        this.f9970M.m1871A(this, this.f9976S);
        this.f9970M.m1874D(this, getUIContentState());
        AnonymousClass0cQ.m5865O(this, 275576131, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -1485281054);
        super.onDetachedFromWindow();
        this.f9970M.m1873C((View) this);
        AnonymousClass0cQ.m5865O(this, -1860593333, N);
    }

    public final void onMeasure(int i, int i2) {
        if (this.f9974Q) {
            int size = MeasureSpec.getSize(i);
            int i3 = (int) (((float) size) / this.f9971N);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
            this.f9961D.measure(i, makeMeasureSpec);
            this.f9967J.measure(i, (int) AnonymousClass0Nm.m3424C(getContext(), 10));
            if (this.f9973P == AnonymousClass15q.RETRY_ICON) {
                this.f9960C.measure(i, makeMeasureSpec);
            } else {
                this.f9969L.measure(i, makeMeasureSpec);
            }
            setMeasuredDimension(size, i3);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setAdjustViewBounds(boolean z) {
        this.f9961D.setAdjustViewBounds(z);
    }

    public void setAspectRatio(float f) {
        AnonymousClass0LH.m2925C(f > 0.0f, "Aspect ratio must be greater than 0");
        this.f9971N = f;
    }

    public void setEnableProgressBar(boolean z) {
        this.f9972O = z;
        ProgressBar progressBar = this.f9967J;
        int i = (this.f9975R == AnonymousClass15w.LOADING && z) ? 0 : 8;
        progressBar.setVisibility(i);
    }

    public void setFitAspectRatio(boolean z) {
        this.f9974Q = z;
    }

    public void setImageRenderer(AnonymousClass0p8 anonymousClass0p8) {
        this.f9961D.setImageRenderer(anonymousClass0p8);
    }

    public void setMiniPreviewBlurRadius(int i) {
        this.f9961D.setMiniPreviewBlurRadius(i);
    }

    public void setMiniPreviewPayload(String str) {
        this.f9961D.setMiniPreviewPayload(str);
    }

    public void setOnFallbackListener(AnonymousClass0z0 anonymousClass0z0) {
        this.f9964G = anonymousClass0z0;
    }

    public void setPlaceHolderColor(int i) {
        this.f9961D.setPlaceHolderColor(i);
    }

    public void setPlaceHolderColor(ColorDrawable colorDrawable) {
        this.f9961D.setPlaceHolderColor(colorDrawable);
    }

    public void setProgressBarDrawable(Drawable drawable) {
        this.f9967J.setProgressDrawable(drawable);
    }

    public void setProgressiveImageConfig(AnonymousClass0ag anonymousClass0ag) {
        this.f9961D.setProgressiveImageConfig(anonymousClass0ag);
    }

    public void setScaleType(ScaleType scaleType) {
        this.f9961D.setScaleType(scaleType);
    }

    public void setSource(String str) {
        this.f9961D.setSource(str);
    }

    public void setUrl(String str) {
        m7590G(str, false);
    }

    public void setUrlWithFallback(String str, String str2, String str3) {
        this.f9970M.m1874D(this, AnonymousClass0lV.Unset);
        this.f9970M.m1874D(this, AnonymousClass0lV.LoadingData);
        this.f9963F = false;
        m7583C(this, AnonymousClass15w.LOADING);
        this.f9961D.setSource(str3);
        this.f9961D.setUrlWithFallback(str, str2, new AnonymousClass1AM(this));
    }
}
