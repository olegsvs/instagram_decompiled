package com.instagram.business.ui;

import X.AnonymousClass0Nm;
import X.AnonymousClass0lA;
import X.AnonymousClass2Xj;
import X.AnonymousClass2Xk;
import X.AnonymousClass2Xv;
import X.AnonymousClass2Xw;
import X.AnonymousClass35V;
import X.AnonymousClass35W;
import X.AnonymousClass35X;
import X.AnonymousClass35Y;
import X.AnonymousClass35l;
import X.AnonymousClass368;
import X.AnonymousClass3xB;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class BusinessCategorySelectionView extends LinearLayout implements AnonymousClass35l {
    /* renamed from: B */
    public AnonymousClass2Xw f47349B;
    /* renamed from: C */
    public AnonymousClass3xB f47350C;
    /* renamed from: D */
    public TextView f47351D;
    /* renamed from: E */
    public AnonymousClass368 f47352E = AnonymousClass368.CATEGORY;
    /* renamed from: F */
    public AnonymousClass35Y f47353F;
    /* renamed from: G */
    public String f47354G;
    /* renamed from: H */
    public String f47355H;
    /* renamed from: I */
    public AnonymousClass2Xw f47356I;
    /* renamed from: J */
    public TextView f47357J;
    /* renamed from: K */
    public ViewGroup f47358K;
    /* renamed from: L */
    public View f47359L;
    /* renamed from: M */
    public int f47360M;
    /* renamed from: N */
    public View f47361N;
    /* renamed from: O */
    private View f47362O;

    public BusinessCategorySelectionView(Context context) {
        super(context);
        m21690C(context);
    }

    public BusinessCategorySelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21690C(context);
    }

    /* renamed from: A */
    public final void m21691A(String str, AnonymousClass2Xk anonymousClass2Xk) {
        AnonymousClass0lA B = AnonymousClass0lA.B();
        if (!(anonymousClass2Xk == null || anonymousClass2Xk.f31197B == null)) {
            if (!anonymousClass2Xk.f31197B.isEmpty()) {
                this.f47358K.removeAllViews();
                int i = 0;
                this.f47359L.setVisibility(0);
                this.f47361N.setVisibility(0);
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(C0164R.dimen.location_suggestion_right_margin), 0);
                while (i < anonymousClass2Xk.f31197B.size()) {
                    AnonymousClass2Xj anonymousClass2Xj = (AnonymousClass2Xj) anonymousClass2Xk.f31197B.get(i);
                    Button button = (Button) LayoutInflater.from(getContext()).inflate(C0164R.layout.suggested_location_button, this.f47358K, false);
                    button.setMaxWidth(this.f47360M);
                    button.setText(anonymousClass2Xj.f31194C);
                    button.setOnClickListener(new AnonymousClass35X(this, anonymousClass2Xj));
                    this.f47358K.addView(button, layoutParams);
                    B.C(anonymousClass2Xj.f31194C);
                    i++;
                }
                return;
            }
        }
        this.f47359L.setVisibility(8);
        this.f47361N.setVisibility(8);
    }

    /* renamed from: B */
    public final void m21692B() {
        this.f47351D.setOnClickListener(new AnonymousClass35V(this));
        this.f47357J.setOnClickListener(new AnonymousClass35W(this));
    }

    /* renamed from: B */
    public static void m21689B(BusinessCategorySelectionView businessCategorySelectionView) {
        AnonymousClass368 anonymousClass368 = businessCategorySelectionView.f47352E;
        AnonymousClass368 anonymousClass3682 = AnonymousClass368.CATEGORY;
        AnonymousClass2Xw anonymousClass2Xw = anonymousClass368 == anonymousClass3682 ? businessCategorySelectionView.f47349B : businessCategorySelectionView.f47356I;
        String str = businessCategorySelectionView.f47352E == anonymousClass3682 ? businessCategorySelectionView.f47354G : businessCategorySelectionView.f47355H;
        AnonymousClass3xB anonymousClass3xB = new AnonymousClass3xB();
        businessCategorySelectionView.f47350C = anonymousClass3xB;
        if (anonymousClass2Xw != null) {
            anonymousClass3xB.f47363B = anonymousClass2Xw.f31206B;
        }
        businessCategorySelectionView.f47350C.f47366E = str;
        businessCategorySelectionView.f47350C.f47365D = businessCategorySelectionView;
        businessCategorySelectionView.f47350C.D(((FragmentActivity) businessCategorySelectionView.getContext()).D(), null);
    }

    /* renamed from: C */
    private void m21690C(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.business_category_selection_view, this);
        this.f47351D = (TextView) inflate.findViewById(C0164R.id.page_category);
        this.f47357J = (TextView) inflate.findViewById(C0164R.id.page_subcategory);
        this.f47362O = inflate.findViewById(C0164R.id.subcategory_divider);
        double J = (double) AnonymousClass0Nm.J(getContext());
        Double.isNaN(J);
        this.f47360M = (int) Math.max(J / 2.5d, (double) getResources().getDimension(C0164R.dimen.location_suggestion_min_width));
        this.f47359L = inflate.findViewById(C0164R.id.horizontal_scroll_view);
        this.f47358K = (ViewGroup) inflate.findViewById(C0164R.id.suggested_categories_container);
        this.f47361N = inflate.findViewById(C0164R.id.suggest_divider);
    }

    public String getSelectedSubcategoryId() {
        return this.f47355H;
    }

    public String getSubCategory() {
        return this.f47357J.getText().toString();
    }

    public String getSuperCategory() {
        return this.f47351D.getText().toString();
    }

    public final void ol(AnonymousClass2Xv anonymousClass2Xv) {
        boolean z = false;
        if (this.f47352E == AnonymousClass368.CATEGORY) {
            this.f47351D.setText(anonymousClass2Xv.f31205C);
            if (this.f47354G == null || !(anonymousClass2Xv == null || anonymousClass2Xv.f31204B == null || anonymousClass2Xv.f31204B.equals(this.f47354G))) {
                this.f47357J.setText(C0164R.string.choose_page_subcategory);
                this.f47355H = null;
                z = true;
            }
            this.f47354G = anonymousClass2Xv.f31204B;
        } else {
            this.f47357J.setText(anonymousClass2Xv.f31205C);
            this.f47355H = anonymousClass2Xv.f31204B;
        }
        this.f47353F.Pf(anonymousClass2Xv.f31204B, z);
    }

    public void setCategory(AnonymousClass2Xw anonymousClass2Xw, AnonymousClass368 anonymousClass368) {
        if (anonymousClass368 == AnonymousClass368.CATEGORY) {
            this.f47351D.setVisibility(0);
            this.f47349B = anonymousClass2Xw;
            return;
        }
        this.f47357J.setVisibility(0);
        this.f47362O.setVisibility(0);
        this.f47356I = anonymousClass2Xw;
    }

    public void setDelegate(AnonymousClass35Y anonymousClass35Y) {
        this.f47353F = anonymousClass35Y;
    }
}
