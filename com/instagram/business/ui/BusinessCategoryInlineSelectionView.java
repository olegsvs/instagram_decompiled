package com.instagram.business.ui;

import X.AnonymousClass2Xv;
import X.AnonymousClass2Xw;
import X.AnonymousClass35Y;
import X.AnonymousClass35l;
import X.AnonymousClass368;
import X.AnonymousClass3xB;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class BusinessCategoryInlineSelectionView extends LinearLayout implements AnonymousClass35l {
    /* renamed from: B */
    public AnonymousClass2Xw f47337B;
    /* renamed from: C */
    public AnonymousClass3xB f47338C;
    /* renamed from: D */
    public AnonymousClass368 f47339D = AnonymousClass368.CATEGORY;
    /* renamed from: E */
    public AnonymousClass2Xw f47340E;
    /* renamed from: F */
    public View f47341F;
    /* renamed from: G */
    public View f47342G;
    /* renamed from: H */
    private AnonymousClass35Y f47343H;
    /* renamed from: I */
    private String f47344I;
    /* renamed from: J */
    private String f47345J;
    /* renamed from: K */
    private String f47346K;
    /* renamed from: L */
    private TextView f47347L;
    /* renamed from: M */
    private TextView f47348M;

    public BusinessCategoryInlineSelectionView(Context context) {
        super(context);
        m21687C(context);
    }

    public BusinessCategoryInlineSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21687C(context);
    }

    /* renamed from: B */
    public static void m21686B(BusinessCategoryInlineSelectionView businessCategoryInlineSelectionView) {
        AnonymousClass368 anonymousClass368 = businessCategoryInlineSelectionView.f47339D;
        AnonymousClass368 anonymousClass3682 = AnonymousClass368.CATEGORY;
        AnonymousClass2Xw anonymousClass2Xw = anonymousClass368 == anonymousClass3682 ? businessCategoryInlineSelectionView.f47337B : businessCategoryInlineSelectionView.f47340E;
        String str = businessCategoryInlineSelectionView.f47339D == anonymousClass3682 ? businessCategoryInlineSelectionView.f47344I : businessCategoryInlineSelectionView.f47345J;
        AnonymousClass3xB anonymousClass3xB = new AnonymousClass3xB();
        businessCategoryInlineSelectionView.f47338C = anonymousClass3xB;
        if (anonymousClass2Xw != null) {
            anonymousClass3xB.f47363B = anonymousClass2Xw.f31206B;
        }
        businessCategoryInlineSelectionView.f47338C.f47366E = str;
        businessCategoryInlineSelectionView.f47338C.f47365D = businessCategoryInlineSelectionView;
        businessCategoryInlineSelectionView.f47338C.D(((FragmentActivity) businessCategoryInlineSelectionView.getContext()).D(), null);
    }

    /* renamed from: C */
    private void m21687C(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.business_inline_category_selection_view, this);
        this.f47342G = inflate.findViewById(C0164R.id.super_category);
        this.f47341F = inflate.findViewById(C0164R.id.sub_category);
        ((TextView) this.f47342G.findViewById(C0164R.id.label)).setText(C0164R.string.super_category);
        ((TextView) this.f47341F.findViewById(C0164R.id.label)).setText(C0164R.string.sub_category);
        TextView textView = (TextView) this.f47342G.findViewById(C0164R.id.content);
        this.f47348M = textView;
        textView.setText(C0164R.string.choose_page_category);
        textView = (TextView) this.f47341F.findViewById(C0164R.id.content);
        this.f47347L = textView;
        textView.setText(C0164R.string.choose_page_subcategory);
    }

    /* renamed from: D */
    private void m21688D() {
        if (this.f47344I == null && this.f47337B != null && this.f47346K != null) {
            for (int i = 1; i < this.f47337B.f31206B.size(); i++) {
                if (this.f47346K.equals(((AnonymousClass2Xv) this.f47337B.f31206B.get(i)).f31205C)) {
                    this.f47344I = ((AnonymousClass2Xv) this.f47337B.f31206B.get(i)).f31204B;
                    AnonymousClass35Y anonymousClass35Y = this.f47343H;
                    if (anonymousClass35Y != null) {
                        anonymousClass35Y.Pf(this.f47344I, true);
                    }
                }
            }
        }
    }

    public String getSelectedSubcategoryId() {
        return this.f47345J;
    }

    public String getSuperCategory() {
        return this.f47348M.getText().toString();
    }

    public final void ol(AnonymousClass2Xv anonymousClass2Xv) {
        boolean z = false;
        if (this.f47339D == AnonymousClass368.CATEGORY) {
            this.f47348M.setText(anonymousClass2Xv.f31205C);
            if (this.f47344I == null || !(anonymousClass2Xv == null || anonymousClass2Xv.f31204B == null || anonymousClass2Xv.f31204B.equals(this.f47344I))) {
                this.f47345J = null;
                this.f47347L.setText(C0164R.string.choose_page_subcategory);
                z = true;
            }
            this.f47344I = anonymousClass2Xv.f31204B;
        } else {
            this.f47347L.setText(anonymousClass2Xv.f31205C);
            this.f47345J = anonymousClass2Xv.f31204B;
        }
        AnonymousClass35Y anonymousClass35Y = this.f47343H;
        if (anonymousClass35Y != null) {
            anonymousClass35Y.Pf(anonymousClass2Xv.f31204B, z);
        }
    }

    public void setCategory(AnonymousClass2Xw anonymousClass2Xw, AnonymousClass368 anonymousClass368) {
        if (anonymousClass368 == AnonymousClass368.CATEGORY) {
            this.f47342G.setVisibility(0);
            this.f47337B = anonymousClass2Xw;
            m21688D();
            return;
        }
        this.f47341F.setVisibility(0);
        this.f47340E = anonymousClass2Xw;
    }

    public void setDelegate(AnonymousClass35Y anonymousClass35Y) {
        this.f47343H = anonymousClass35Y;
    }

    public void setPrefillCategory(String str, String str2, String str3) {
        this.f47345J = str2;
        this.f47347L.setText(str3);
        this.f47348M.setText(str);
        this.f47346K = str;
        m21688D();
    }
}
