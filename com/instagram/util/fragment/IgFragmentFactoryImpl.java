package com.instagram.util.fragment;

import X.AnonymousClass0Cm;
import X.AnonymousClass0FL;
import X.AnonymousClass0IL;
import X.AnonymousClass0IY;
import X.AnonymousClass0P7;
import X.AnonymousClass0Su;
import X.AnonymousClass0iy;
import X.AnonymousClass1Pe;
import X.AnonymousClass1TR;
import X.AnonymousClass1Uz;
import X.AnonymousClass1Vp;
import X.AnonymousClass1XC;
import X.AnonymousClass338;
import X.AnonymousClass3By;
import X.AnonymousClass3ei;
import X.AnonymousClass3f2;
import X.AnonymousClass3g9;
import X.AnonymousClass3gv;
import X.AnonymousClass3gx;
import X.AnonymousClass3i1;
import X.AnonymousClass3mT;
import X.AnonymousClass3y9;
import X.AnonymousClass41r;
import X.AnonymousClass421;
import X.AnonymousClass453;
import X.AnonymousClass4B1;
import X.AnonymousClass4Gk;
import X.AnonymousClass53L;
import X.AnonymousClass5IV;
import X.AnonymousClass5Jq;
import X.AnonymousClass5Rw;
import X.AnonymousClass5SN;
import X.AnonymousClass5SP;
import X.AnonymousClass5gT;
import X.AnonymousClass5hY;
import X.AnonymousClass5hr;
import X.AnonymousClass5hs;
import X.AnonymousClass5hw;
import X.AnonymousClass63i;
import X.AnonymousClass6FR;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.urlhandler.ShortUrlReelLoadingFragment;
import java.util.ArrayList;
import java.util.HashMap;

public final class IgFragmentFactoryImpl extends AnonymousClass0IY {
    /* renamed from: A */
    public final AnonymousClass0IL m28876A() {
        return new AnonymousClass5hs();
    }

    /* renamed from: B */
    public final AnonymousClass0IL m28877B(AnonymousClass0P7 anonymousClass0P7) {
        Bundle bundle = new Bundle();
        bundle.putString("tracking_token", anonymousClass0P7.zR());
        bundle.putBoolean("show_ad_choices", anonymousClass0P7.xA());
        AnonymousClass0IL anonymousClass5hs = new AnonymousClass5hs();
        anonymousClass5hs.setArguments(bundle);
        return anonymousClass5hs;
    }

    /* renamed from: C */
    public final AnonymousClass0IL m28878C(String str) {
        AnonymousClass0IL anonymousClass53L = new AnonymousClass53L();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        anonymousClass53L.setArguments(bundle);
        return anonymousClass53L;
    }

    /* renamed from: D */
    public final AnonymousClass0IL m28879D(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("AdHideReasonsFragment.FEED_ITEM_ID", str);
        bundle.putString("AdHideReasonsFragment.TOKEN", str2);
        bundle.putBoolean("AdHideReasonsFragment.IS_SURVEY", true);
        AnonymousClass0IL anonymousClass1XC = new AnonymousClass1XC();
        anonymousClass1XC.setArguments(bundle);
        return anonymousClass1XC;
    }

    /* renamed from: E */
    public final AnonymousClass0IL m28880E(String str, int i, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("AdHideReasonsFragment.AD_ID", str4);
        bundle.putString("AdHideReasonsFragment.FEED_ITEM_ID", str);
        bundle.putString("AdHideReasonsFragment.TOKEN", str2);
        bundle.putString("AdHideReasonsFragment.SOURCE", str3);
        bundle.putInt("AdHideReasonsFragment.MEDIA_AD_CAROUSEL_INDEX", i);
        AnonymousClass0IL anonymousClass1XC = new AnonymousClass1XC();
        anonymousClass1XC.setArguments(bundle);
        return anonymousClass1XC;
    }

    /* renamed from: F */
    public final AnonymousClass0IL m28881F(AnonymousClass3By anonymousClass3By) {
        AnonymousClass0IL anonymousClass5SN = new AnonymousClass5SN();
        Bundle bundle = new Bundle();
        anonymousClass3By.A(bundle);
        anonymousClass5SN.setArguments(bundle);
        return anonymousClass5SN;
    }

    /* renamed from: G */
    public final AnonymousClass0IL m28882G() {
        return new AnonymousClass3ei();
    }

    /* renamed from: H */
    public final AnonymousClass0IL m28883H(Bundle bundle) {
        AnonymousClass0IL anonymousClass5gT = new AnonymousClass5gT();
        anonymousClass5gT.setArguments(bundle);
        return anonymousClass5gT;
    }

    /* renamed from: I */
    public final AnonymousClass0IL m28884I(Bundle bundle) {
        AnonymousClass0IL anonymousClass5Rw = new AnonymousClass5Rw();
        anonymousClass5Rw.setArguments(bundle);
        return anonymousClass5Rw;
    }

    /* renamed from: J */
    public final AnonymousClass0IL m28885J(String str, AnonymousClass0Cm anonymousClass0Cm) {
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass4B1.f51173E, str);
        AnonymousClass0FL.G(anonymousClass0Cm, bundle);
        AnonymousClass0IL anonymousClass4B1 = new AnonymousClass4B1();
        anonymousClass4B1.setArguments(bundle);
        return anonymousClass4B1;
    }

    /* renamed from: K */
    public final AnonymousClass0IL m28886K(String str, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", parcelable);
        AnonymousClass0IL anonymousClass338 = new AnonymousClass338();
        anonymousClass338.setArguments(bundle);
        return anonymousClass338;
    }

    /* renamed from: L */
    public final AnonymousClass0IL m28887L(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("ImageAnnotationFragment.imagePath", str);
        AnonymousClass0IL anonymousClass1TR = new AnonymousClass1TR();
        anonymousClass1TR.setArguments(bundle);
        return anonymousClass1TR;
    }

    /* renamed from: M */
    public final AnonymousClass0IL m28888M(Bundle bundle) {
        AnonymousClass0IL anonymousClass3i1 = new AnonymousClass3i1();
        anonymousClass3i1.setArguments(bundle);
        return anonymousClass3i1;
    }

    /* renamed from: N */
    public final AnonymousClass0IL m28889N(String str, boolean z) {
        AnonymousClass0IL anonymousClass3y9 = new AnonymousClass3y9();
        Bundle bundle = new Bundle();
        bundle.putString("CanvasFragment.ARGUMENTS_CANVAS_ID", str);
        bundle.putBoolean("CanvasFragment.ARGUMENTS_CANVAS_ANIMATE", false);
        bundle.putBoolean("CanvasFragment.ARGUMENTS_CANVAS_FORCE_REFRESH", z);
        anonymousClass3y9.setArguments(bundle);
        return anonymousClass3y9;
    }

    /* renamed from: O */
    public final AnonymousClass0IL m28890O() {
        return new AnonymousClass4Gk();
    }

    /* renamed from: P */
    public final AnonymousClass0IL m28891P(String str, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", str);
        bundle.putInt("position", i);
        bundle.putInt("carousel_index", i2);
        AnonymousClass0IL anonymousClass5hw = new AnonymousClass5hw();
        anonymousClass5hw.setArguments(bundle);
        return anonymousClass5hw;
    }

    /* renamed from: Q */
    public final AnonymousClass0IL m28892Q() {
        return new AnonymousClass5IV();
    }

    /* renamed from: R */
    public final AnonymousClass0IL m28893R(Bundle bundle) {
        AnonymousClass0IL anonymousClass5SP = new AnonymousClass5SP();
        anonymousClass5SP.setArguments(bundle);
        return anonymousClass5SP;
    }

    /* renamed from: S */
    public final AnonymousClass0IL m28894S(String str, String str2) {
        AnonymousClass0IL anonymousClass6FR = new AnonymousClass6FR();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putString("FeaturedUserFragment.EXTRA_USER_NAME", str2);
        anonymousClass6FR.setArguments(bundle);
        return anonymousClass6FR;
    }

    /* renamed from: T */
    public final AnonymousClass0IL m28895T(String str) {
        AnonymousClass0IL genericSurveyFragment = new GenericSurveyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("GenericSurveyFragment.SURVEY_TYPE", str);
        genericSurveyFragment.setArguments(bundle);
        return genericSurveyFragment;
    }

    /* renamed from: U */
    public final AnonymousClass0IL m28896U(String str, AnonymousClass0iy anonymousClass0iy, String str2) {
        Bundle bundle = new Bundle();
        anonymousClass0iy.A(bundle, str, str2);
        AnonymousClass0IL anonymousClass5SP = new AnonymousClass5SP();
        anonymousClass5SP.setArguments(bundle);
        return anonymousClass5SP;
    }

    /* renamed from: V */
    public final AnonymousClass0IL m28897V() {
        return new AnonymousClass3f2();
    }

    /* renamed from: W */
    public final AnonymousClass0IL m28898W() {
        return new AnonymousClass1Pe();
    }

    /* renamed from: X */
    public final AnonymousClass0IL m28899X(String str) {
        return new AnonymousClass5hY().WPA(str).DD();
    }

    /* renamed from: Y */
    public final AnonymousClass1Vp m28900Y(String str) {
        return new AnonymousClass5hY().WPA(str);
    }

    /* renamed from: Z */
    public final AnonymousClass0IL m28901Z(String str) {
        AnonymousClass0IL adBakeOffFragment = new AdBakeOffFragment();
        Bundle bundle = new Bundle();
        bundle.putString("AdBakeOffFragment.EXTRA_DATA_TOKEN", str);
        adBakeOffFragment.setArguments(bundle);
        return adBakeOffFragment;
    }

    /* renamed from: a */
    public final AnonymousClass0IL m28902a(Bundle bundle) {
        AnonymousClass0IL anonymousClass421 = new AnonymousClass421();
        anonymousClass421.setArguments(bundle);
        return anonymousClass421;
    }

    /* renamed from: b */
    public final AnonymousClass0IL m28903b(AnonymousClass0Cm anonymousClass0Cm, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("PoliticalContextPageFragment.AD_ID", str);
        bundle.putString("PoliticalContextPageFragment.TRACKING_TOKEN", str2);
        AnonymousClass0FL.G(anonymousClass0Cm, bundle);
        AnonymousClass0IL anonymousClass63i = new AnonymousClass63i();
        anonymousClass63i.setArguments(bundle);
        return anonymousClass63i;
    }

    /* renamed from: c */
    public final AnonymousClass0IL m28904c(Bundle bundle) {
        AnonymousClass0IL anonymousClass453 = new AnonymousClass453();
        anonymousClass453.setArguments(bundle);
        return anonymousClass453;
    }

    /* renamed from: d */
    public final AnonymousClass0IL m28905d(Bundle bundle) {
        AnonymousClass0IL anonymousClass3gv = new AnonymousClass3gv();
        anonymousClass3gv.setArguments(bundle);
        return anonymousClass3gv;
    }

    /* renamed from: e */
    public final AnonymousClass0IL m28906e(String str, String str2, String str3, String str4, String str5, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0IL anonymousClass41r = new AnonymousClass41r();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_SERIALIZED_MODEL_DATA", str);
        bundle.putString("ARG_OUTRO_TOAST_TEXT", str2);
        bundle.putString("ARG_INTEGRATION_POINT_ID", str3);
        bundle.putString("ARG_SURVEY_ID", str4);
        bundle.putString("ARG_SESSION_BLOB", str5);
        AnonymousClass0FL.G(anonymousClass0Cm, bundle);
        anonymousClass41r.setArguments(bundle);
        return anonymousClass41r;
    }

    /* renamed from: f */
    public final AnonymousClass0IL m28907f(String str) {
        AnonymousClass0IL anonymousClass3gx = new AnonymousClass3gx();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_TOAST_TEXT", str);
        anonymousClass3gx.setArguments(bundle);
        return anonymousClass3gx;
    }

    /* renamed from: g */
    public final AnonymousClass0IL m28908g() {
        return new AnonymousClass5Jq();
    }

    /* renamed from: h */
    public final AnonymousClass0IL m28909h() {
        return new ShortUrlReelLoadingFragment();
    }

    /* renamed from: i */
    public final AnonymousClass0IL m28910i(Bundle bundle) {
        AnonymousClass0IL anonymousClass3mT = new AnonymousClass3mT();
        anonymousClass3mT.setArguments(bundle);
        return anonymousClass3mT;
    }

    /* renamed from: j */
    public final AnonymousClass0IL m28911j(String str, String str2) {
        Bundle bundle = new Bundle();
        AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su(str);
        anonymousClass0Su.f5039M = str2;
        bundle.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", anonymousClass0Su.A());
        AnonymousClass0IL anonymousClass3g9 = new AnonymousClass3g9();
        anonymousClass3g9.setArguments(bundle);
        return anonymousClass3g9;
    }

    /* renamed from: k */
    public final AnonymousClass0IL m28912k(String str, ArrayList arrayList, String str2, boolean z, String str3, HashMap hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString("StaticContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", str);
        bundle.putStringArrayList("StaticContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", arrayList);
        bundle.putString("StaticContextualFeedFragment.ARGUMENT_FEED_TITLE", str2);
        bundle.putBoolean("StaticContextualFeedFragment.ARGUMENT_IS_EXPLORE_ATTRIBUTION_VISIBLE", z);
        bundle.putString("StaticContextualFeedFragment.ARGUMENT_MODULE_NAME", str3);
        bundle.putSerializable("StaticContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA", hashMap);
        AnonymousClass0IL anonymousClass5hr = new AnonymousClass5hr();
        anonymousClass5hr.setArguments(bundle);
        return anonymousClass5hr;
    }

    /* renamed from: l */
    public final AnonymousClass0IL m28913l(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0IL anonymousClass1Uz = new AnonymousClass1Uz();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
        anonymousClass1Uz.setArguments(bundle);
        return anonymousClass1Uz;
    }
}
