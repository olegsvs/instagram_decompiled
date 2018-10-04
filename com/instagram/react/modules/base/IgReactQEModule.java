package com.instagram.react.modules.base;

import X.AnonymousClass09e;
import X.AnonymousClass0CC;
import X.AnonymousClass0CD;
import X.AnonymousClass0CE;
import X.AnonymousClass0Dc;
import X.AnonymousClass0M7;
import com.facebook.fbreact.specs.NativeIGReactQESpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IGReactQE")
public class IgReactQEModule extends NativeIGReactQESpec {
    public static final String MODULE_NAME = "IGReactQE";
    private final Map parameters = new HashMap();

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactQEModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        registerExperimentParameter("IgInsightsContextualEducation", AnonymousClass0CC.OP);
        registerExperimentParameter("IgShoppingCatalogListRedesign", AnonymousClass0CC.ym);
        registerExperimentParameter("IgInsightsCreativeTutorialsNetegoUnit", AnonymousClass0CC.UP);
        registerExperimentParameter("IgInsightsCreativeTutorialsNetegoDismiss", AnonymousClass0CC.TP);
        registerExperimentParameter("IgInsightsMultipleTimeframesGraphs", AnonymousClass0CC.WP);
        registerExperimentParameter("IgInsightsReactNativeStoryCarousel", AnonymousClass0CC.ZP);
        registerExperimentParameter("IgInsightsAccountInsightsRelayOptimization", AnonymousClass0CC.YP);
        registerExperimentParameter("IgInsightsPostEngagementUnit", AnonymousClass0CC.XP);
        registerExperimentParameter("IgShoppingCatalogDoneButton", AnonymousClass0CC.Hd);
        registerExperimentParameter("IgQEShoppingPostInsights", AnonymousClass0CC.Td);
        registerExperimentParameter("IgQEShoppingViewerIntentActions", AnonymousClass0CC.Yd);
        registerExperimentParameter("IgQEShoppingViewerShareAction", AnonymousClass0CC.Zd);
        registerExperimentParameter("IgLeadGenSingleScreen", AnonymousClass0CC.PO);
        registerExperimentParameter("IntegrityPolicyCheck", AnonymousClass0CC.uC);
        registerExperimentParameter("IgBoVExperimentGroup", AnonymousClass0CC.ce);
        registerExperimentParameter("IgBoVEnableNewContent", AnonymousClass0CC.be);
        registerExperimentParameter("IgBoVL2AllocationName", AnonymousClass0CC.de);
        registerExperimentParameter("IgBoVRaiseMinBudget", AnonymousClass0CC.ee);
        registerExperimentParameter("PromotePpeV2ShowNeutralString", AnonymousClass0CC.VZ);
        registerExperimentParameter("PromotePpeV2EnablePpe", AnonymousClass0CC.TZ);
        registerExperimentParameter("PromotePpeV2EnableBrandAwareness", AnonymousClass0CC.SZ);
        registerExperimentParameter("PromoteUnifiedInsightsCutoffLinuxTime", AnonymousClass0CC.WZ);
        registerExperimentParameter("PromotePpeV2EnableVideoViews", AnonymousClass0CC.UZ);
        registerExperimentParameter("PromoteUnifiedInsights", AnonymousClass0CC.YZ);
        registerExperimentParameter("PromoteUnifiedInsightsDiscoveryFirst", AnonymousClass0CC.XZ);
        registerExperimentParameter("PromoteFixExpiredFBAccessTokenAndroid", AnonymousClass0CC.KZ);
        registerExperimentParameter("PromotePoliticalAds", AnonymousClass0CC.RZ);
        registerExperimentParameter("PromoteCanEditAudiences", AnonymousClass0CC.zY);
        registerExperimentParameter("PromoteShowPotentialReach", AnonymousClass0CC.CZ);
        registerExperimentParameter("IgPaymentsPayPalRollout", AnonymousClass0CC.RO);
        registerExperimentParameter("PromoteShowMergedAudience", AnonymousClass0CC.BZ);
        registerExperimentParameter("PromoteAudienceSplitAgeGender", AnonymousClass0CC.EZ);
        registerExperimentParameter("PromoteDefaultToLastUsedAudience", AnonymousClass0CC.AZ);
        registerExperimentParameter("PromoteShowSuggestedInterests", AnonymousClass0CC.DZ);
        registerExperimentParameter("PromoteFeedToStories", AnonymousClass0CC.JZ);
        registerExperimentParameter("PromoteEstimatedClicks", AnonymousClass0CC.IZ);
        registerExperimentParameter("PromoteNetPromoterScore", AnonymousClass0CC.PZ);
        registerExperimentParameter("PromoteNetPromoterScoreQuestion", AnonymousClass0CC.QZ);
        registerExperimentParameter("PromotePublishPageUpsell", AnonymousClass0CC.f1476l);
        registerExperimentParameter("PromoteEnableLowBudgetWarning", AnonymousClass0CC.FZ);
        registerExperimentParameter("PromoteEnableSpendingLimitNotification", AnonymousClass0CC.GZ);
        registerExperimentParameter("IgChallengeVettedDeltaHideWarningBanner", AnonymousClass0CC.eF);
        registerExperimentParameter("IgChallengeVettedDeltaShowStickyButtons", AnonymousClass0CC.dF);
        registerExperimentParameter("IgChallengeVettedDeltaButtonStyle", AnonymousClass0CC.cF);
        registerExperimentParameter("IgNotificationsDoNotDisturbSwitch", AnonymousClass0CC.jh);
        registerExperimentParameter("AdsManagerIsEnabled", AnonymousClass0CC.sZ);
        registerExperimentParameter("PromoteLastUsedDestination", AnonymousClass0CC.MZ);
        registerExperimentParameter("VideoViewsIsEnabled", AnonymousClass0CC.LZ);
        registerExperimentParameter("PromoteDailyBudgetMultiplier", AnonymousClass0CC.HZ);
        registerExperimentParameter("IgShoppingStoriesV2", AnonymousClass09e.f1097C);
        registerExperimentParameter("IgShoppingCheckoutMVPExperimentIsEnabled", AnonymousClass0CC.Kd);
        registerExperimentParameter("PromoteVideoRetryCount", AnonymousClass0CC.ZZ);
        registerExperimentParameter("PromoteVideoRetryDelay", AnonymousClass0CC.aZ);
        registerExperimentParameter("PromoteLotusIsEnabledForAds", AnonymousClass0CC.NZ);
    }

    public boolean booleanValueForConfiguration(String str, String str2, String str3, String str4, boolean z) {
        String E = AnonymousClass0M7.f3347C.E(str, str3, z);
        if (E == null) {
            return false;
        }
        return Boolean.valueOf(E).booleanValue();
    }

    public boolean booleanValueForUniverse(String str, String str2, boolean z) {
        String F = AnonymousClass0M7.f3347C.F(str, str2, z);
        if (F == null) {
            return false;
        }
        return Boolean.valueOf(F).booleanValue();
    }

    public double doubleValueForConfiguration(String str, String str2, String str3, String str4, boolean z) {
        Double d;
        String E = AnonymousClass0M7.f3347C.E(str, str3, z);
        if (E == null) {
            d = null;
        } else {
            d = Double.valueOf(E);
        }
        return d.doubleValue();
    }

    public double doubleValueForUniverse(String str, String str2, boolean z) {
        Double d;
        String F = AnonymousClass0M7.f3347C.F(str, str2, z);
        if (F == null) {
            d = null;
        } else {
            d = Double.valueOf(F);
        }
        return d.doubleValue();
    }

    public boolean exposeValueForBoolExperiment(String str) {
        AnonymousClass0CE experimentParameter = getExperimentParameter(str);
        if (experimentParameter != null) {
            if (AnonymousClass0M7.f3347C != null) {
                if (experimentParameter.f1494E == Boolean.class) {
                    return ((Boolean) experimentParameter.G()).booleanValue();
                }
                AnonymousClass0Dc.H("IGReactQEModule", "Experiment parameter is not boolean: %s", new Object[]{str});
                return false;
            }
        }
        return false;
    }

    public String exposeValueForExperiment(String str) {
        str = getExperimentParameter(str);
        if (str != null) {
            if (AnonymousClass0M7.f3347C != null) {
                return String.valueOf(str.G());
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }

    private AnonymousClass0CD getExperimentParameter(String str) {
        AnonymousClass0CD anonymousClass0CD = (AnonymousClass0CD) this.parameters.get(str);
        if (anonymousClass0CD != null) {
            return anonymousClass0CD;
        }
        AnonymousClass0Dc.H("IGReactQEModule", "Undefined experiment parameter: %s", new Object[]{str});
        return null;
    }

    public Map getTypedExportedConstants() {
        return new HashMap();
    }

    public double integerValueForConfiguration(String str, String str2, String str3, String str4, boolean z) {
        Double d;
        String E = AnonymousClass0M7.f3347C.E(str, str3, z);
        if (E == null) {
            d = null;
        } else {
            d = Double.valueOf(E);
        }
        return d.doubleValue();
    }

    public double integerValueForUniverse(String str, String str2, boolean z) {
        Double d;
        String F = AnonymousClass0M7.f3347C.F(str, str2, z);
        if (F == null) {
            d = null;
        } else {
            d = Double.valueOf(F);
        }
        return d.doubleValue();
    }

    private void registerExperimentParameter(String str, AnonymousClass0CD anonymousClass0CD) {
        this.parameters.put(str, anonymousClass0CD);
    }

    public String stringValueForConfiguration(String str, String str2, String str3, String str4, boolean z) {
        return AnonymousClass0M7.f3347C.E(str, str3, z);
    }

    public String stringValueForUniverse(String str, String str2, boolean z) {
        return AnonymousClass0M7.f3347C.F(str, str2, z);
    }
}
