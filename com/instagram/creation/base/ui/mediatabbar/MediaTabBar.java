package com.instagram.creation.base.ui.mediatabbar;

import X.AnonymousClass0G5;
import X.AnonymousClass0e8;
import X.AnonymousClass3DM;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

public class MediaTabBar extends LinearLayout {
    /* renamed from: B */
    public final ArgbEvaluator f39207B;
    /* renamed from: C */
    public final int f39208C;
    /* renamed from: D */
    public boolean f39209D;
    /* renamed from: E */
    public final int f39210E;
    /* renamed from: F */
    public float f39211F;
    /* renamed from: G */
    public final List f39212G;
    /* renamed from: H */
    public Paint f39213H;

    public MediaTabBar(Context context) {
        this(context, null);
    }

    public MediaTabBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39212G = new ArrayList();
        this.f39209D = false;
        setOrientation(0);
        Resources resources = getResources();
        this.f39209D = AnonymousClass0e8.D(getContext());
        this.f39207B = new ArgbEvaluator();
        this.f39210E = AnonymousClass0G5.D(context, C0164R.attr.mediaTabTextColor);
        this.f39208C = AnonymousClass0G5.D(context, C0164R.attr.mediaTabTextColorSelected);
        int dimensionPixelSize = resources.getDimensionPixelSize(AnonymousClass0G5.F(getContext(), C0164R.attr.segmentedUnderlineWidth));
        Paint paint = new Paint();
        this.f39213H = paint;
        paint.setStyle(Style.STROKE);
        this.f39213H.setStrokeWidth((float) dimensionPixelSize);
        this.f39213H.setColor(this.f39208C);
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        float width = (this.f39211F * ((float) getWidth())) / ((float) this.f39212G.size());
        float height = ((float) getHeight()) - (this.f39213H.getStrokeWidth() / 2.0f);
        canvas2.drawLine(width, height, width + ((float) (getWidth() / this.f39212G.size())), height, this.f39213H);
    }

    public void setTabs(List list, OnClickListener onClickListener) {
        for (AnonymousClass3DM anonymousClass3DM : list) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0164R.layout.media_tab_bar_tab, this, false);
            textView.setTag(anonymousClass3DM);
            textView.setText(getResources().getString(anonymousClass3DM.f39244C));
            textView.setOnClickListener(onClickListener);
            addView(textView);
            this.f39212G.add(textView);
        }
    }
}
