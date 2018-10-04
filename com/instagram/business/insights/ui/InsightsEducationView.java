package com.instagram.business.insights.ui;

import X.AnonymousClass34k;
import X.AnonymousClass34n;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class InsightsEducationView extends LinearLayout {
    /* renamed from: B */
    public TextView f37599B;
    /* renamed from: C */
    public View f37600C;
    /* renamed from: D */
    public boolean f37601D;
    /* renamed from: E */
    public ViewGroup f37602E;
    /* renamed from: F */
    public NestedScrollView f37603F;

    public InsightsEducationView(Context context) {
        super(context);
        m18440C(context);
    }

    public InsightsEducationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18440C(context);
    }

    /* renamed from: B */
    private void m18439B(Context context, String str, String str2) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(C0164R.layout.education_title, this.f37602E, false);
        TextView textView2 = (TextView) LayoutInflater.from(context).inflate(C0164R.layout.education_subtitle, this.f37602E, false);
        textView.setText(str);
        textView2.setText(str2);
        this.f37602E.addView(textView);
        this.f37602E.addView(textView2);
    }

    /* renamed from: C */
    private void m18440C(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.business_education_unit, this);
        this.f37600C = inflate;
        this.f37599B = (TextView) inflate.findViewById(C0164R.id.education_button);
        NestedScrollView nestedScrollView = (NestedScrollView) this.f37600C.findViewById(C0164R.id.education_text_container);
        this.f37603F = nestedScrollView;
        this.f37602E = (LinearLayout) nestedScrollView.findViewById(C0164R.id.education_text_in_scroll);
    }

    public void setupEducationButton(View view) {
        this.f37599B.setOnClickListener(new AnonymousClass34k(this, view));
    }

    public void setupStoriesEducationView(Context context) {
        Resources resources = context.getResources();
        m18439B(context, resources.getString(C0164R.string.impressions), resources.getString(C0164R.string.story_impressions_explanation));
        m18439B(context, resources.getString(C0164R.string.reach), resources.getString(C0164R.string.story_reach_explanation));
        m18439B(context, resources.getString(C0164R.string.forward), resources.getString(C0164R.string.story_forward_explanation));
        m18439B(context, resources.getString(C0164R.string.story_back), resources.getString(C0164R.string.story_back_explanation));
        m18439B(context, resources.getString(C0164R.string.exited), resources.getString(C0164R.string.story_exited_explanation));
        m18439B(context, resources.getString(C0164R.string.replies), resources.getString(C0164R.string.story_replies_explanation));
        m18439B(context, resources.getString(C0164R.string.next_story), resources.getString(C0164R.string.story_next_story_explanation));
        m18439B(context, resources.getString(C0164R.string.link_opens), resources.getString(C0164R.string.story_link_opens_explanation));
    }

    public void setupTopPostsEducationView(Context context, String str) {
        Resources resources = context.getResources();
        m18439B(context, resources.getString(C0164R.string.impressions), resources.getString(C0164R.string.impressions_explanation));
        m18439B(context, resources.getString(C0164R.string.reach), resources.getString(C0164R.string.reach_explanation));
        m18439B(context, resources.getString(C0164R.string.engagement), resources.getString(C0164R.string.engagement_explanation));
        m18439B(context, resources.getString(C0164R.string.saved), resources.getString(C0164R.string.saved_explanation));
        m18439B(context, resources.getString(C0164R.string.profile_visits), resources.getString(C0164R.string.prfile_visits_explanation));
        m18439B(context, resources.getString(C0164R.string.follows), resources.getString(C0164R.string.follows_explanation));
        if (AnonymousClass34n.f37611H[4].equals(str)) {
            m18439B(context, resources.getString(C0164R.string.product_opens), resources.getString(C0164R.string.product_opens_explanation));
            m18439B(context, resources.getString(C0164R.string.outbound_clicks), resources.getString(C0164R.string.outbound_clicks_explanation));
        }
    }
}
