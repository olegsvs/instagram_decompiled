package com.instagram.ui.widget.loadmore;

import X.AnonymousClass0Ca;
import X.AnonymousClass0EE;
import X.AnonymousClass0NN;
import X.AnonymousClass0PY;
import X.AnonymousClass0Ro;
import X.AnonymousClass0eS;
import X.AnonymousClass16z;
import X.AnonymousClass170;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.facebook.C0164R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class LoadMoreButton extends ViewAnimator {
    /* renamed from: B */
    public AnonymousClass0Ro f14625B;
    /* renamed from: C */
    private final float f14626C;

    public LoadMoreButton(Context context) {
        this(context, null);
    }

    public LoadMoreButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.LoadMoreButton);
        this.f14626C = obtainStyledAttributes.getFloat(0, -1.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public final void m9457A(AnonymousClass0Ro anonymousClass0Ro) {
        m9458B(anonymousClass0Ro, null);
    }

    /* renamed from: B */
    public static View m9455B(Context context, ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(C0164R.layout.row_load_more, viewGroup, false);
        LoadMoreButton loadMoreButton = (LoadMoreButton) inflate.findViewById(C0164R.id.row_load_more_button);
        View inflate2 = from.inflate(i, loadMoreButton, false);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View spinnerImageView = new SpinnerImageView(context);
        spinnerImageView.setBackgroundResource(C0164R.drawable.spinner_large);
        spinnerImageView.setLayoutParams(layoutParams);
        View imageView = new ImageView(context);
        imageView.setImageDrawable(AnonymousClass0Ca.m939E(context, C0164R.drawable.loadmore_add_compound));
        imageView.setLayoutParams(layoutParams);
        View imageView2 = new ImageView(context);
        imageView2.setImageDrawable(AnonymousClass0Ca.m939E(context, C0164R.drawable.loadmore_icon_refresh_compound));
        imageView2.setLayoutParams(layoutParams);
        loadMoreButton.addView(inflate2, 0);
        loadMoreButton.addView(spinnerImageView, 1);
        loadMoreButton.addView(imageView, 2);
        loadMoreButton.addView(imageView2, 3);
        return inflate;
    }

    /* renamed from: B */
    public final void m9458B(AnonymousClass0Ro anonymousClass0Ro, AnonymousClass0PY anonymousClass0PY) {
        this.f14625B = anonymousClass0Ro;
        getChildAt(2).setOnClickListener(new AnonymousClass16z(this, anonymousClass0Ro, anonymousClass0PY));
        getChildAt(3).setOnClickListener(new AnonymousClass170(this, anonymousClass0Ro, anonymousClass0PY));
        if (m9456C(anonymousClass0Ro)) {
            setVisibility(0);
            setViewType(this, anonymousClass0Ro, anonymousClass0PY);
            return;
        }
        setVisibility(8);
    }

    /* renamed from: C */
    public static boolean m9456C(AnonymousClass0Ro anonymousClass0Ro) {
        return anonymousClass0Ro.tX() && (anonymousClass0Ro.uX() || anonymousClass0Ro.UX() || anonymousClass0Ro.QV() || !anonymousClass0Ro.NV());
    }

    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.f14626C == -1.0f) {
            measuredHeight = getMeasuredHeight();
        } else {
            measuredHeight = Math.round(((float) getMeasuredWidth()) / this.f14626C);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public static void setViewType(LoadMoreButton loadMoreButton, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass0PY anonymousClass0PY) {
        if (anonymousClass0Ro.uX()) {
            if (anonymousClass0PY != null) {
                AnonymousClass0NN B = AnonymousClass0NN.m3291B("main_feed_loading_more", (AnonymousClass0EE) anonymousClass0PY).m3294B("position", anonymousClass0PY.f4079B.m6850O());
                if (anonymousClass0PY.f4089L.f8722F != null) {
                    B.m3295C("last_feed_update_time", anonymousClass0PY.f4089L.f8722F.longValue());
                }
                B.m3310R();
            }
            loadMoreButton.setDisplayedChild(1);
        } else if (anonymousClass0Ro.UX()) {
            loadMoreButton.setDisplayedChild(3);
        } else if (!anonymousClass0Ro.NV()) {
            loadMoreButton.setDisplayedChild(0);
        } else if (anonymousClass0Ro.QV()) {
            loadMoreButton.setDisplayedChild(2);
        }
    }
}
