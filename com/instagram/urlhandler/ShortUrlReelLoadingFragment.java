package com.instagram.urlhandler;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0IJ;
import X.AnonymousClass0bt;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass2M2;
import X.AnonymousClass5Jk;
import X.AnonymousClass5Jt;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class ShortUrlReelLoadingFragment extends AnonymousClass0IJ implements AnonymousClass0bt {
    /* renamed from: B */
    public final Handler f62199B = new Handler(Looper.getMainLooper());
    /* renamed from: C */
    public AnonymousClass0Cm f62200C;
    public SpinnerImageView mLoadingSpinner;

    public final boolean bW() {
        return true;
    }

    public final String getModuleName() {
        return "short_url_reel_loading_fragment";
    }

    /* renamed from: B */
    public static void m26250B(ShortUrlReelLoadingFragment shortUrlReelLoadingFragment, String str) {
        AnonymousClass0GA B = AnonymousClass5Jk.m26248B(shortUrlReelLoadingFragment.f62200C, str);
        B.f2849B = new AnonymousClass5Jt(shortUrlReelLoadingFragment, str);
        shortUrlReelLoadingFragment.schedule(B);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.X(C0164R.layout.action_bar_title_logo, getResources().getDimensionPixelSize(C0164R.dimen.action_bar_item_padding), 0);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1093598984);
        super.onCreate(bundle);
        this.f62200C = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL");
        if (string != null) {
            m26250B(this, string);
        }
        AnonymousClass0cQ.G(this, 2123274985, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 97141266);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_loading_spinner, viewGroup, false);
        AnonymousClass0cQ.G(this, -2033194381, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -2945900);
        super.onDestroyView();
        ShortUrlReelLoadingFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 428156710, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SpinnerImageView spinnerImageView = (SpinnerImageView) view.findViewById(C0164R.id.loading_spinner);
        this.mLoadingSpinner = spinnerImageView;
        spinnerImageView.setLoadingStatus(AnonymousClass2M2.LOADING);
    }
}
