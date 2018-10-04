package com.instagram.ui.widget.fixedtabbar;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0e8;
import X.AnonymousClass0mS;
import X.AnonymousClass1Ar;
import X.AnonymousClass1LP;
import X.AnonymousClass2LV;
import X.AnonymousClass2LW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

public class FixedTabBar extends FrameLayout implements AnonymousClass1Ar {
    /* renamed from: B */
    public AnonymousClass0mS f17429B;
    /* renamed from: C */
    public LayoutInflater f17430C;
    /* renamed from: D */
    public boolean f17431D;
    /* renamed from: E */
    public int f17432E;
    /* renamed from: F */
    public boolean f17433F;
    /* renamed from: G */
    public float f17434G;
    /* renamed from: H */
    public List f17435H;
    /* renamed from: I */
    public LinearLayout f17436I;
    /* renamed from: J */
    private FixedTabBarIndicator f17437J;
    /* renamed from: K */
    private boolean f17438K;
    /* renamed from: L */
    private Integer f17439L;
    /* renamed from: M */
    private int f17440M = 0;
    /* renamed from: N */
    private boolean f17441N;

    public final void onPageSelected(int i) {
    }

    public FixedTabBar(Context context) {
        super(context);
        m10897B(context);
    }

    public FixedTabBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10897B(context);
    }

    public FixedTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10897B(context);
    }

    /* renamed from: A */
    public final void m10899A(int i) {
        int size = this.f17431D ? (this.f17435H.size() - 1) - i : i;
        int i2 = 0;
        while (i2 < this.f17435H.size()) {
            ((View) this.f17435H.get(i2)).setSelected(i2 == size);
            i2++;
        }
        if (this.f17440M == 0) {
            FixedTabBarIndicator fixedTabBarIndicator = this.f17437J;
            fixedTabBarIndicator.f29294D = i;
            AnonymousClass1LP anonymousClass1LP = (AnonymousClass1LP) fixedTabBarIndicator.f29295E.get(i);
            if (anonymousClass1LP.f17335E != -1) {
                i2 = anonymousClass1LP.f17335E;
            } else {
                i2 = AnonymousClass0G5.m1725F(fixedTabBarIndicator.getContext(), C0164R.attr.textColorSelected);
            }
            fixedTabBarIndicator.f29293C.setColor(AnonymousClass0Ca.m937C(fixedTabBarIndicator.getContext(), i2));
            if (fixedTabBarIndicator.f29292B) {
                fixedTabBarIndicator.A(i, 0.0f);
            } else {
                fixedTabBarIndicator.post(new AnonymousClass2LW(fixedTabBarIndicator));
            }
            return;
        }
        this.f17439L = Integer.valueOf(i);
    }

    /* renamed from: B */
    private void m10897B(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f17430C = from;
        from.inflate(C0164R.layout.fixed_tabbar_layout, this);
        this.f17436I = (LinearLayout) findViewById(C0164R.id.fixed_tabbar_tabs_container);
        this.f17437J = (FixedTabBarIndicator) findViewById(C0164R.id.selected_tab_indicator);
        this.f17438K = true;
        this.f17431D = AnonymousClass0e8.m6200D(getContext());
    }

    /* renamed from: C */
    private void m10898C() {
        if (this.f17440M == 0 && this.f17439L != null) {
            float f = this.f17434G;
            if ((f - ((float) ((int) f)) != 0.0f ? 1 : null) == null) {
                m10899A(this.f17439L.intValue());
                this.f17439L = null;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f17433F) {
            boolean z = this.f17436I.getMeasuredWidth() / this.f17435H.size() <= this.f17432E;
            if (this.f17438K || z != this.f17441N) {
                this.f17438K = false;
                this.f17441N = z;
                for (View view : this.f17435H) {
                    int i3 = 8;
                    view.findViewById(C0164R.id.tab_button_name_text).setVisibility(z ? 8 : 0);
                    View findViewById = view.findViewById(C0164R.id.tab_button_fallback_icon);
                    if (z) {
                        i3 = 0;
                    }
                    findViewById.setVisibility(i3);
                }
                super.onMeasure(i, i2);
            }
        }
    }

    public final void onPageScrollStateChanged(int i) {
        this.f17440M = i;
        m10898C();
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.f17434G = f;
        this.f17437J.A(i, f);
        m10898C();
    }

    public void setDelegate(AnonymousClass0mS anonymousClass0mS) {
        this.f17429B = anonymousClass0mS;
    }

    public void setMaybeUseIconFallbackTabs(boolean z) {
        this.f17433F = z;
    }

    public void setTabs(List list) {
        int size = list.size();
        int i = 0;
        Object obj = size > 2 ? 1 : null;
        this.f17436I.removeAllViews();
        this.f17435H = new ArrayList(size);
        this.f17432E = 0;
        while (i < size) {
            View view;
            AnonymousClass1LP anonymousClass1LP = (AnonymousClass1LP) list.get(i);
            if (anonymousClass1LP.f17333C != null) {
                view = anonymousClass1LP.f17333C;
            } else {
                TextView textView;
                view = this.f17430C.inflate(this.f17433F ? C0164R.layout.tabbar_button_with_fallback_icon : C0164R.layout.fixed_tabbar_button, this.f17436I, false);
                if (this.f17433F) {
                    textView = (TextView) view.findViewById(C0164R.id.tab_button_name_text);
                    textView.setText(anonymousClass1LP.m10846A(getContext()));
                    textView.measure(0, 0);
                    if (this.f17432E < textView.getMeasuredWidth()) {
                        this.f17432E = textView.getMeasuredWidth();
                    }
                    ((ImageView) view.findViewById(C0164R.id.tab_button_fallback_icon)).setImageDrawable(AnonymousClass0Ca.m939E(getContext(), anonymousClass1LP.f17334D));
                } else {
                    textView = (TextView) view;
                    textView.setText(anonymousClass1LP.m10846A(getContext()));
                }
                if (obj != null) {
                    textView.setTextSize(0, getResources().getDimension(C0164R.dimen.font_medium));
                }
                if (anonymousClass1LP.f17336F != -1) {
                    textView.setTextColor(AnonymousClass0Ca.m938D(textView.getContext(), anonymousClass1LP.f17336F));
                }
                view.setOnClickListener(new AnonymousClass2LV(this, i));
                if (anonymousClass1LP.f17332B != -1) {
                    view.setBackground(AnonymousClass0Ca.m939E(getContext(), anonymousClass1LP.f17332B));
                }
            }
            this.f17435H.add(view);
            this.f17436I.addView(view);
            i++;
        }
        this.f17437J.setTabs(list);
        this.f17437J.requestLayout();
    }
}
