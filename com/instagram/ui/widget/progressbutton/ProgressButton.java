package com.instagram.ui.widget.progressbutton;

import X.AnonymousClass0Nm;
import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;

public class ProgressButton extends FrameLayout {
    /* renamed from: B */
    private Drawable f43820B;
    /* renamed from: C */
    private Integer f43821C;
    /* renamed from: D */
    private ProgressBar f43822D;
    /* renamed from: E */
    private boolean f43823E;
    /* renamed from: F */
    private TextView f43824F;

    public ProgressButton(Context context) {
        super(context);
        m20534B(context, null);
    }

    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20534B(context, attributeSet);
    }

    public ProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20534B(context, attributeSet);
    }

    /* renamed from: B */
    private void m20534B(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(C0164R.layout.reg_next, this);
        this.f43824F = (TextView) findViewById(C0164R.id.button_text);
        this.f43822D = (ProgressBar) findViewById(C0164R.id.button_progress);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.ProgressButton);
            setText(obtainStyledAttributes.getText(2));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize == -1) {
                dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.font_medium);
            }
            setTextSize(dimensionPixelSize);
            if (obtainStyledAttributes.getBoolean(3, false)) {
                this.f43824F.setSingleLine();
                this.f43824F.setEllipsize(TruncateAt.END);
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            if (dimensionPixelSize2 != -1) {
                View view = this.f43824F;
                int paddingTop = view.getPaddingTop();
                int paddingBottom = this.f43824F.getPaddingBottom();
                Context context2 = view.getContext();
                view.setPadding((int) AnonymousClass0Nm.C(context2, dimensionPixelSize2), (int) AnonymousClass0Nm.C(context2, paddingTop), (int) AnonymousClass0Nm.C(context2, dimensionPixelSize2), (int) AnonymousClass0Nm.C(context2, paddingBottom));
            }
            setBackground(obtainStyledAttributes.getDrawable(1));
            dimensionPixelSize = obtainStyledAttributes.getColor(4, -1);
            if (dimensionPixelSize != -1) {
                setProgressBarColor(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: C */
    private void m20535C(boolean z) {
        if (this.f43821C != null) {
            if (z) {
                this.f43820B = getBackground();
                setBackgroundResource(this.f43821C.intValue());
                return;
            }
            setBackground(this.f43820B);
            Drawable drawable = this.f43820B;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
            this.f43820B = null;
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f43824F.setEnabled(z);
    }

    public void setProgressBackgroundResource(int i) {
        this.f43821C = Integer.valueOf(i);
    }

    public void setProgressBarColor(int i) {
        this.f43822D.getIndeterminateDrawable().mutate().setColorFilter(AnonymousClass0ca.B(i));
    }

    public void setShowProgressBar(boolean z) {
        if (this.f43823E != z) {
            this.f43823E = z;
            int i = 0;
            this.f43822D.setVisibility(z ? 0 : 4);
            TextView textView = this.f43824F;
            if (z) {
                i = 4;
            }
            textView.setVisibility(i);
            m20535C(z);
        }
    }

    public void setText(int i) {
        this.f43824F.setText(i);
    }

    public void setText(CharSequence charSequence) {
        this.f43824F.setText(charSequence);
    }

    public void setTextColor(int i) {
        this.f43824F.setTextColor(i);
    }

    private void setTextSize(int i) {
        this.f43824F.setTextSize(0, (float) i);
    }

    public void setTypeface(int i) {
        this.f43824F.setTypeface(null, i);
    }
}
