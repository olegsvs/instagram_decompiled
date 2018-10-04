package com.instagram.ui.widget.wheelview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass1Pd;
import X.AnonymousClass34e;
import X.AnonymousClass3kd;
import X.AnonymousClass3ke;
import X.AnonymousClass3kf;
import X.AnonymousClass3x7;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class WheelView extends ScrollView {
    /* renamed from: B */
    public Context f44033B;
    /* renamed from: C */
    public int f44034C;
    /* renamed from: D */
    public int f44035D;
    /* renamed from: E */
    public int f44036E = 0;
    /* renamed from: F */
    public List f44037F;
    /* renamed from: G */
    public int f44038G = 1;
    /* renamed from: H */
    public Paint f44039H;
    /* renamed from: I */
    public int[] f44040I;
    /* renamed from: J */
    public int f44041J = 1;
    /* renamed from: K */
    public int f44042K;
    /* renamed from: L */
    public int f44043L;
    /* renamed from: M */
    public int f44044M;
    /* renamed from: N */
    public LinearLayout f44045N;
    /* renamed from: O */
    public Runnable f44046O;
    /* renamed from: P */
    private int f44047P;
    /* renamed from: Q */
    private int f44048Q;
    /* renamed from: R */
    private int f44049R;
    /* renamed from: S */
    private int f44050S;
    /* renamed from: T */
    private int f44051T;
    /* renamed from: U */
    private AnonymousClass3x7 f44052U;

    public WheelView(Context context) {
        super(context);
        m20570F(context, null, 0);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20570F(context, attributeSet, 0);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20570F(context, attributeSet, i);
    }

    /* renamed from: B */
    public static void m20566B(WheelView wheelView, TextView textView, String str, int i) {
        Paint paint = new Paint();
        float f = (float) i;
        paint.setTextSize(f);
        float measureText = paint.measureText(str, 0, str.length());
        if (wheelView.f44044M == 0) {
            wheelView.f44044M = ((Activity) wheelView.f44033B).getWindowManager().getDefaultDisplay().getWidth();
        }
        int i2 = wheelView.f44044M;
        int i3 = wheelView.f44042K;
        float f2 = (float) (i2 - i3);
        if (measureText <= f2) {
            textView.setPadding(i3 / 2, i3, i3 / 2, i3);
            textView.setTextSize(0, f);
            return;
        }
        f2 = (f2 * f) / measureText;
        int ceil = (int) Math.ceil((double) ((f - f2) / 2.0f));
        int i4 = wheelView.f44042K;
        textView.setPadding(i4 / 2, i4 + ceil, i4 / 2, i4 + ceil);
        measureText = 20.0f;
        if (f2 < 20.0f) {
            textView.setEllipsize(TruncateAt.END);
        } else {
            measureText = f2;
        }
        textView.setTextSize(0, measureText);
    }

    /* renamed from: C */
    public static int[] m20567C(WheelView wheelView) {
        if (wheelView.f44040I == null) {
            int[] iArr = new int[2];
            wheelView.f44040I = iArr;
            int i = wheelView.f44036E;
            int i2 = wheelView.f44038G;
            iArr[0] = i * i2;
            iArr[1] = i * (i2 + 1);
        }
        return wheelView.f44040I;
    }

    /* renamed from: D */
    public static void m20568D(WheelView wheelView) {
        AnonymousClass3x7 anonymousClass3x7 = wheelView.f44052U;
        if (anonymousClass3x7 != null) {
            int i = wheelView.f44041J;
            String str = (String) wheelView.f44037F.get(i);
            int i2 = i - 2;
            if (i2 >= 0 && i2 < anonymousClass3x7.f47326B.f37577E.size()) {
                AnonymousClass34e.m18437C(anonymousClass3x7.f47326B.f37579G, (List) anonymousClass3x7.f47326B.f37577E.get(i2), anonymousClass3x7.f47326B.f37579G.getSeletedIndex());
            }
        }
    }

    /* renamed from: E */
    public static void m20569E(WheelView wheelView, int i) {
        int i2 = wheelView.f44036E;
        int i3 = i % i2;
        int i4 = i / i2;
        int i5 = wheelView.f44038G;
        i4 += i5;
        if (i3 > i2 / 2) {
            i4 = ((i / i2) + i5) + 1;
        }
        int childCount = wheelView.f44045N.getChildCount();
        i2 = 0;
        while (i2 < childCount) {
            TextView textView = (TextView) wheelView.f44045N.getChildAt(i2);
            if (textView != null) {
                if (i4 == i2) {
                    textView.setTextColor(wheelView.f44047P);
                    m20566B(wheelView, textView, (String) wheelView.f44037F.get(i2), wheelView.f44048Q);
                } else {
                    textView.setTextColor(wheelView.f44051T);
                    m20566B(wheelView, textView, (String) wheelView.f44037F.get(i2), wheelView.f44043L);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    private void m20570F(Context context, AttributeSet attributeSet, int i) {
        this.f44033B = context;
        setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44045N = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.f44045N);
        this.f44051T = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5);
        this.f44047P = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_9);
        this.f44049R = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_2);
        this.f44050S = getResources().getDimensionPixelSize(C0164R.dimen.selectorWidth);
        this.f44043L = getResources().getDimensionPixelSize(C0164R.dimen.font_medium);
        this.f44042K = getResources().getDimensionPixelSize(C0164R.dimen.textPadding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.WheelView, i, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f44051T = obtainStyledAttributes.getColor(1, this.f44051T);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.f44047P = obtainStyledAttributes.getColor(2, this.f44047P);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.f44049R = obtainStyledAttributes.getColor(4, this.f44049R);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.f44050S = obtainStyledAttributes.getDimensionPixelSize(5, this.f44050S);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f44043L = obtainStyledAttributes.getDimensionPixelSize(0, this.f44043L);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f44042K = obtainStyledAttributes.getDimensionPixelSize(6, this.f44042K);
        }
        this.f44048Q = obtainStyledAttributes.getDimensionPixelSize(3, this.f44043L);
        obtainStyledAttributes.recycle();
        this.f44046O = new AnonymousClass3kd(this);
    }

    public final void fling(int i) {
        super.fling(i / 3);
    }

    public int getOffset() {
        return this.f44038G;
    }

    public int getSeletedIndex() {
        return this.f44041J - this.f44038G;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m20569E(this, i2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1616491277);
        super.onSizeChanged(i, i2, i3, i4);
        this.f44044M = i;
        setBackgroundDrawable(null);
        AnonymousClass0cQ.O(this, 1052833682, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1485503782);
        if (motionEvent.getAction() == 1) {
            this.f44035D = getScrollY();
            postDelayed(this.f44046O, 50);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, -2136235628, M);
        return onTouchEvent;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f44044M == 0) {
            this.f44044M = ((Activity) this.f44033B).getWindowManager().getDefaultDisplay().getWidth();
        }
        if (this.f44039H == null) {
            Paint paint = new Paint();
            this.f44039H = paint;
            paint.setColor(this.f44049R);
            this.f44039H.setStrokeWidth((float) this.f44050S);
        }
        super.setBackgroundDrawable(new AnonymousClass3kf(this));
    }

    public void setItems(List list) {
        int i;
        if (this.f44037F == null) {
            this.f44037F = new ArrayList();
        }
        this.f44037F.clear();
        this.f44037F.addAll(list);
        for (i = 0; i < this.f44038G; i++) {
            List list2 = this.f44037F;
            String str = JsonProperty.USE_DEFAULT_NAME;
            list2.add(0, str);
            this.f44037F.add(str);
        }
        this.f44034C = (this.f44038G * 2) + 1;
        this.f44045N.removeAllViews();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f44037F.size(); i3++) {
            LinearLayout linearLayout = this.f44045N;
            String str2 = (String) this.f44037F.get(i3);
            View textView = new TextView(this.f44033B);
            textView.setLayoutParams(new LayoutParams(-1, -2));
            textView.setSingleLine(true);
            textView.setTextSize(0, (float) this.f44043L);
            textView.setText(str2);
            textView.setGravity(17);
            textView.setEllipsize(TruncateAt.END);
            i = this.f44042K;
            int i4 = i / 2;
            textView.setPadding(i4, i, i4, i);
            if (!TextUtils.isEmpty(str2)) {
                textView.setOnClickListener(new AnonymousClass3ke(this, i3));
            }
            if (this.f44036E == 0) {
                textView.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                this.f44036E = textView.getMeasuredHeight();
                this.f44045N.setLayoutParams(new LayoutParams(-1, this.f44036E * this.f44034C));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                setLayoutParams(new LinearLayout.LayoutParams(layoutParams.width, this.f44036E * this.f44034C, layoutParams.weight));
            }
            m20566B(this, textView, str2, this.f44043L);
            linearLayout.addView(textView);
        }
        if (getSeletedIndex() > 0) {
            i2 = getSeletedIndex() * this.f44036E;
        }
        m20569E(this, i2);
    }

    public void setOffset(int i) {
        this.f44038G = i;
    }

    public void setOnWheelViewListener(AnonymousClass3x7 anonymousClass3x7) {
        this.f44052U = anonymousClass3x7;
    }

    public void setSelection(int i) {
        this.f44041J = this.f44038G + i;
        post(new AnonymousClass1Pd(this, i));
    }
}
