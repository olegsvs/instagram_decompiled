package com.instagram.ui.widget.dismissablecallout;

import X.AnonymousClass0eS;
import X.AnonymousClass14H;
import X.AnonymousClass1Ux;
import X.AnonymousClass5JE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

public class DismissableCallout extends FrameLayout {
    /* renamed from: B */
    public int f62017B;
    /* renamed from: C */
    public View f62018C;
    /* renamed from: D */
    public ImageView f62019D;
    /* renamed from: E */
    public AnonymousClass5JE f62020E;
    /* renamed from: F */
    public TextView f62021F;
    /* renamed from: G */
    public boolean f62022G;
    /* renamed from: H */
    private boolean f62023H;

    public DismissableCallout(Context context) {
        this(context, null);
    }

    public DismissableCallout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DismissableCallout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62022G = false;
        this.f62023H = false;
        m26214B(attributeSet);
    }

    public DismissableCallout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f62022G = false;
        this.f62023H = false;
        m26214B(attributeSet);
    }

    /* renamed from: A */
    public final void m26215A() {
        if (this.f62023H) {
            setVisibility(8);
        } else {
            AnonymousClass14H I = AnonymousClass14H.C(this).J().I(getY(), (float) this.f62017B);
            I.f13862b = 8;
            I.K(true).N();
        }
        this.f62022G = false;
    }

    /* renamed from: B */
    private void m26214B(AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(C0164R.layout.dismissable_callout, this);
        this.f62021F = (TextView) findViewById(C0164R.id.dismissable_callout_info_banner);
        this.f62019D = (ImageView) findViewById(C0164R.id.dismiss_imageview);
        View findViewById = findViewById(C0164R.id.dismiss_button);
        this.f62018C = findViewById;
        findViewById.setOnClickListener(new AnonymousClass1Ux(this));
        setBackgroundResource(C0164R.color.grey_1);
        this.f62017B = getResources().getDimensionPixelSize(C0164R.dimen.comment_input_row_directmention_banner_height);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.DismissableCallout);
        this.f62021F.setText(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    public final void m26216B(String str) {
        this.f62021F.setText(str);
        if (this.f62023H) {
            setVisibility(0);
        } else {
            AnonymousClass14H I = AnonymousClass14H.C(this).J().A(getAlpha(), 1.0f).I(getVisibility() == 0 ? getY() : (float) this.f62017B, 0.0f);
            I.f13863c = 0;
            I.K(true).N();
        }
        this.f62022G = true;
    }

    /* renamed from: C */
    public final void m26217C() {
        if (this.f62021F != null) {
            this.f62017B = getResources().getDimensionPixelSize(C0164R.dimen.comment_composer_reply_banner_height_new);
            this.f62021F.getLayoutParams().height = this.f62017B;
            setBackgroundResource(C0164R.color.white);
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(C0164R.attr.textColorTertiary, typedValue, true);
            this.f62021F.setTextColor(typedValue.data);
            getContext().getTheme().resolveAttribute(C0164R.attr.textColorSecondary, typedValue, true);
            this.f62019D.setColorFilter(typedValue.data);
            this.f62023H = true;
        }
    }

    public void setOnDismissListener(AnonymousClass5JE anonymousClass5JE) {
        this.f62020E = anonymousClass5JE;
    }
}
