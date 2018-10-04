package com.instagram.ui.widget.pollresults;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class PollResultsView extends LinearLayout {
    /* renamed from: B */
    public TextView f62048B;
    /* renamed from: C */
    public TextView f62049C;
    /* renamed from: D */
    public ImageView f62050D;
    /* renamed from: E */
    public TextView f62051E;
    /* renamed from: F */
    public ImageView f62052F;
    /* renamed from: G */
    public TextView f62053G;

    public PollResultsView(Context context) {
        super(context);
        m26224B();
    }

    public PollResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26224B();
    }

    public PollResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26224B();
    }

    /* renamed from: B */
    private void m26224B() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.poll_results, this, true);
        this.f62051E = (TextView) inflate.findViewById(C0164R.id.row_newsfeed_winning_poll_percentage);
        this.f62053G = (TextView) inflate.findViewById(C0164R.id.row_newsfeed_winning_poll_option);
        this.f62052F = (ImageView) inflate.findViewById(C0164R.id.row_newsfeed_winning_poll_background);
        this.f62048B = (TextView) inflate.findViewById(C0164R.id.row_newsfeed_losing_poll_percentage);
        this.f62049C = (TextView) inflate.findViewById(C0164R.id.row_newsfeed_losing_poll_option);
        this.f62050D = (ImageView) inflate.findViewById(C0164R.id.row_newsfeed_losing_poll_background);
    }
}
