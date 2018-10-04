package com.instagram.maps.ui;

import X.AnonymousClass0HP;
import X.AnonymousClass0bS;
import X.AnonymousClass3UK;
import X.AnonymousClass40u;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public class IgStaticMapView extends AnonymousClass0bS {
    /* renamed from: B */
    public long f6778B = 0;

    public IgStaticMapView(Context context) {
        super(context);
        m5585B();
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5585B();
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5585B();
    }

    /* renamed from: A */
    public final View mo1404A() {
        View igImageView = new IgImageView(getContext());
        igImageView.setContentDescription(getContext().getString(C0164R.string.map_label));
        return igImageView;
    }

    /* renamed from: B */
    private void m5585B() {
        setReportButtonVisibility(0);
        setMapReporterLauncher(new AnonymousClass40u(getContext()));
    }

    /* renamed from: B */
    public final void mo1405B(View view, Uri uri, String str) {
        IgImageView igImageView = (IgImageView) view;
        if (AnonymousClass0HP.f2624L.m1995C()) {
            this.f6778B = AnonymousClass0HP.m1991B();
            igImageView.setOnLoadListener(new AnonymousClass3UK(this, str, igImageView));
        }
        igImageView.setUrl(uri.toString());
    }

    public CharSequence getReportButtonText() {
        return getContext().getResources().getText(C0164R.string.maps_report_button);
    }
}
