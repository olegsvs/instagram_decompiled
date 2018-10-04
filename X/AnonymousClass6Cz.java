package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Cz */
public final class AnonymousClass6Cz extends AnonymousClass0IJ implements AnonymousClass0IS {
    /* renamed from: B */
    public AnonymousClass6Cf f72973B;
    /* renamed from: C */
    public IGInstantExperiencesParameters f72974C;
    /* renamed from: D */
    public AnonymousClass6Cn f72975D;
    /* renamed from: E */
    public boolean f72976E = false;
    /* renamed from: F */
    public AnonymousClass0Cm f72977F;
    /* renamed from: G */
    private AnonymousClass5h0 f72978G;
    /* renamed from: H */
    private InstantExperiencesBrowserChrome f72979H;
    /* renamed from: I */
    private AnonymousClass5hJ f72980I;

    public final String getModuleName() {
        return "instant_experiences_browser";
    }

    /* renamed from: B */
    public static boolean m29475B(AnonymousClass6Cz anonymousClass6Cz, boolean z) {
        if (z) {
            if (!anonymousClass6Cz.f72976E) {
                z = AnonymousClass0HV.D(anonymousClass6Cz.f72977F);
                anonymousClass6Cz = "ix_autofill_tooltip";
                if (z.f2646B.getInt(anonymousClass6Cz, 0) < 3) {
                    z.f2646B.edit().putInt(anonymousClass6Cz, z.f2646B.getInt(anonymousClass6Cz, 0) + 1).apply();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private void m29476C() {
        if (this.f72974C != null) {
            AnonymousClass6Cq C = AnonymousClass6Cq.m29461C();
            InstantExperiencesParameters instantExperiencesParameters = this.f72974C;
            C.m29465A(instantExperiencesParameters, AnonymousClass5dF.BROWSER_CLOSED);
            C.f72965C.J(C.f72964B, instantExperiencesParameters.JN());
        }
    }

    public final boolean onBackPressed() {
        return this.f72980I.m28275B();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, 733139151);
        View inflate = layoutInflater.inflate(C0164R.layout.instant_experiences_browser_fragment, viewGroup, false);
        this.f72977F = AnonymousClass0Ce.G(getArguments());
        AnonymousClass6Ck anonymousClass6Ck = new AnonymousClass6Ck(this.f72977F);
        AnonymousClass5cy anonymousClass5cy = new AnonymousClass5cy(getActivity(), AnonymousClass3a3.E(getActivity()).f28032B);
        layoutInflater = new AnonymousClass5cu(Executors.newSingleThreadExecutor(), Executors.newSingleThreadExecutor(), anonymousClass6Ck, new AnonymousClass6Cj(this.f72977F, getArguments(), anonymousClass5cy));
        AnonymousClass0GG.B(layoutInflater.f67461E, new AnonymousClass5ct(layoutInflater, new AnonymousClass6C2(layoutInflater, new AnonymousClass2UL())), 31881504);
        viewGroup = new AnonymousClass5d5(Executors.newSingleThreadExecutor(), anonymousClass6Ck, anonymousClass5cy, layoutInflater);
        Executor anonymousClass5hA = new AnonymousClass5hA(this);
        String string = getArguments().getString(AnonymousClass5dG.WEBSITE_URL.toString());
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{\"whitelisted_domains\": \"https://fbplugins.herokuapp.com\", \"feature_list\": {\"is_autofill_enabled\": true, \"is_autofill_save_enabled\": true, \"is_payment_enabled\": true}, \"page_name\": \"IX Test\",\"business_id\": \"");
            stringBuilder.append(getArguments().getString(AnonymousClass5dG.BUSINESS_ID.toString()));
            stringBuilder.append("\",");
            stringBuilder.append("\"website_uri\": \"");
            stringBuilder.append(string);
            stringBuilder.append("\"");
            stringBuilder.append("}");
            this.f72974C = new IGInstantExperiencesParameters(stringBuilder.toString());
            this.f72974C.f72927D = getArguments().getString(AnonymousClass5dG.SOURCE.toString());
            this.f72974C.f72928E = getArguments().getString(AnonymousClass5dG.SURFACE.toString());
            this.f72974C.f72925B = getArguments().getString(AnonymousClass5dG.APP_ID.toString());
        } catch (Throwable e) {
            AnonymousClass0Dc.C(AnonymousClass6Cz.class, e.getMessage(), e);
        }
        AnonymousClass6Cq C = AnonymousClass6Cq.m29461C();
        InstantExperiencesParameters instantExperiencesParameters = this.f72974C;
        C.f72965C.L(C.f72964B, instantExperiencesParameters.JN());
        AnonymousClass6Cq.m29464F(C, instantExperiencesParameters.JN(), AnonymousClass6Cq.m29462D(instantExperiencesParameters).B(AnonymousClass5dG.WEBSITE_URL.toString(), instantExperiencesParameters.nT().toString()), AnonymousClass5dF.BROWSER_OPEN);
        this.f72979H = (InstantExperiencesBrowserChrome) inflate.findViewById(C0164R.id.instant_experiences_browser_chrome);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0164R.id.instant_experiences_browser_progress_bar);
        this.f72973B = new AnonymousClass6Cf();
        this.f72975D = new AnonymousClass6Cn(anonymousClass5hA, viewGroup);
        this.f72978G = new AnonymousClass5h0(anonymousClass5hA);
        anonymousClass0IL.f72980I = new AnonymousClass5hJ(getContext(), this.f72977F, (InstantExperiencesWebViewContainerLayout) inflate.findViewById(C0164R.id.instant_experiences_webview_container), new AnonymousClass5dn(), new AnonymousClass5cn(), anonymousClass0IL, this.f72974C, layoutInflater, viewGroup, progressBar);
        InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = anonymousClass0IL.f72979H;
        AnonymousClass5hJ anonymousClass5hJ = anonymousClass0IL.f72980I;
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass0IL.f72977F;
        instantExperiencesBrowserChrome.f68182F = anonymousClass5hJ;
        instantExperiencesBrowserChrome.f68187K = anonymousClass0Cm;
        instantExperiencesBrowserChrome.f68186J = new AnonymousClass5h5(instantExperiencesBrowserChrome);
        instantExperiencesBrowserChrome.f68180D = (TextView) instantExperiencesBrowserChrome.findViewById(C0164R.id.instant_experiences_chrome_title);
        instantExperiencesBrowserChrome.f68179C = (TextView) instantExperiencesBrowserChrome.findViewById(C0164R.id.instant_experiences_chrome_subtitle);
        instantExperiencesBrowserChrome.f68178B = (TextView) instantExperiencesBrowserChrome.findViewById(C0164R.id.instant_experiences_chrome_loading);
        instantExperiencesBrowserChrome.f68185I = (ImageView) instantExperiencesBrowserChrome.findViewById(C0164R.id.instant_experiences_overflow_menu);
        instantExperiencesBrowserChrome.f68180D.setVisibility(8);
        instantExperiencesBrowserChrome.f68179C.setVisibility(8);
        instantExperiencesBrowserChrome.f68178B.setVisibility(0);
        AnonymousClass5hJ anonymousClass5hJ2 = instantExperiencesBrowserChrome.f68182F;
        anonymousClass5hJ2.f68208K.add(new AnonymousClass6Cx(instantExperiencesBrowserChrome));
        ((ImageView) instantExperiencesBrowserChrome.findViewById(C0164R.id.instant_experiences_back_button)).setColorFilter(-7829368);
        instantExperiencesBrowserChrome.f68185I.setColorFilter(-7829368);
        ((FrameLayout) instantExperiencesBrowserChrome.findViewById(C0164R.id.instant_experiences_back_button_container)).setOnClickListener(new AnonymousClass5h7(instantExperiencesBrowserChrome));
        instantExperiencesBrowserChrome.f68185I.setOnClickListener(new AnonymousClass5h8(instantExperiencesBrowserChrome));
        anonymousClass0IL.f72979H.setInstantExperiencesBrowserChromeListener(new AnonymousClass6Cy(anonymousClass0IL));
        List<AnonymousClass5h4> arrayList = new ArrayList();
        arrayList.add(anonymousClass0IL.f72973B);
        arrayList.add(anonymousClass0IL.f72975D);
        AnonymousClass5h0 anonymousClass5h0 = anonymousClass0IL.f72978G;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AnonymousClass6Cw anonymousClass6Cw = new AnonymousClass6Cw(anonymousClass5h0, arrayList, atomicBoolean);
        for (AnonymousClass5h4 FS : arrayList) {
            FS.FS().f68170C.add(anonymousClass6Cw);
        }
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass5gx(anonymousClass5h0, inflate, atomicBoolean, anonymousClass6Cw));
        anonymousClass6Cw.m29474A();
        anonymousClass0IL.f72980I.m28274A().loadUrl(string);
        anonymousClass0IL.f72976E = false;
        AnonymousClass0cQ.G(anonymousClass0IL, 997043351, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -584013345);
        super.onDestroy();
        m29476C();
        AnonymousClass0cQ.G(this, -1063733712, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -384031703);
        super.onPause();
        AnonymousClass6Cq.m29461C().m29465A(this.f72974C, AnonymousClass5dF.BROWSER_PAUSED);
        AnonymousClass0cQ.G(this, -1588754703, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1154434063);
        super.onResume();
        AnonymousClass6Cq C = AnonymousClass6Cq.m29461C();
        InstantExperiencesParameters instantExperiencesParameters = this.f72974C;
        C.f72965C.L(C.f72964B, instantExperiencesParameters.JN());
        C.m29465A(instantExperiencesParameters, AnonymousClass5dF.BROWSER_RESUMED);
        AnonymousClass0cQ.G(this, 1216117113, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -646118361);
        super.onStop();
        m29476C();
        AnonymousClass0cQ.G(this, -949994176, F);
    }
}
