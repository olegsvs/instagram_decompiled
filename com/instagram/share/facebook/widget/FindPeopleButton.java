package com.instagram.share.facebook.widget;

import X.AnonymousClass0Ca;
import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class FindPeopleButton extends LinearLayout {
    /* renamed from: B */
    private TextView f43130B;
    /* renamed from: C */
    private String f43131C;
    /* renamed from: D */
    private String f43132D;
    /* renamed from: E */
    private ImageView f43133E;
    /* renamed from: F */
    private ImageView f43134F;
    /* renamed from: G */
    private Integer f43135G;
    /* renamed from: H */
    private TextView f43136H;
    /* renamed from: I */
    private TextView f43137I;

    public FindPeopleButton(Context context) {
        super(context);
        m20353B(context, null);
    }

    public FindPeopleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20353B(context, attributeSet);
    }

    public FindPeopleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        m20353B(context, attributeSet);
    }

    /* renamed from: B */
    private void m20353B(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.layout_find_people_button, this);
        this.f43134F = (ImageView) inflate.findViewById(C0164R.id.find_people_imageview);
        this.f43137I = (TextView) inflate.findViewById(C0164R.id.find_people_title);
        this.f43136H = (TextView) inflate.findViewById(C0164R.id.find_people_subtitle);
        this.f43130B = (TextView) inflate.findViewById(C0164R.id.find_people_action_button);
        this.f43133E = (ImageView) inflate.findViewById(C0164R.id.find_people_dismiss_button);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.FindPeopleButton);
            if (obtainStyledAttributes.hasValue(2)) {
                this.f43134F.setImageDrawable(obtainStyledAttributes.getDrawable(2));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.f43135G = Integer.valueOf(obtainStyledAttributes.getColor(3, 0));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.f43132D = obtainStyledAttributes.getString(1);
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.f43131C = obtainStyledAttributes.getString(0);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int C = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_9);
        int C2 = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5);
        this.f43137I.setTextColor(C);
        this.f43137I.getPaint().setFakeBoldText(true);
        this.f43136H.setTextColor(C2);
        this.f43137I.setText(this.f43132D);
        this.f43136H.setText(this.f43131C);
        if (this.f43135G != null) {
            this.f43134F.getDrawable().mutate().setColorFilter(AnonymousClass0ca.B(this.f43135G.intValue()));
        }
    }

    public void setActionButtonOnClickListener(OnClickListener onClickListener) {
        this.f43130B.setOnClickListener(onClickListener);
    }

    public void setButtonText(int i) {
        this.f43130B.setText(i);
    }

    public void setDismissButtonEnabled(boolean z) {
        this.f43133E.setVisibility(z ? 0 : 8);
    }

    public void setDismissButtonOnClickListener(OnClickListener onClickListener) {
        this.f43133E.setOnClickListener(onClickListener);
    }

    public void setIcon(int i) {
        this.f43134F.setImageDrawable(AnonymousClass0Ca.E(getContext(), i));
    }

    public void setSubtitle(int i) {
        this.f43131C = getContext().getString(i);
        this.f43136H.setText(i);
    }

    public void setTitle(int i) {
        this.f43132D = getContext().getString(i);
        this.f43137I.setText(i);
    }
}
