package com.instagram.react.impl;

import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.instagram.react.modules.base.IgNativeColorsModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactDialogModule;
import com.instagram.react.modules.base.IgReactFunnelLoggerModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;
import com.instagram.react.modules.product.IgReactBrandedContentModule;
import com.instagram.react.modules.product.IgReactCheckpointModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCompassionResourceModule;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.react.modules.product.IgReactInsightsModule;
import com.instagram.react.modules.product.IgReactInsightsStoryPresenterModule;
import com.instagram.react.modules.product.IgReactLeadAdsModule;
import com.instagram.react.modules.product.IgReactPaymentModule;
import com.instagram.react.modules.product.IgReactPostInsightsModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.react.modules.product.IgReactShoppingCatalogSettingsModule;
import com.instagram.react.modules.product.IgReactShoppingSignupReactModule;
import com.instagram.react.views.image.IgReactImageLoaderModule;
import java.util.HashMap;
import java.util.Map;

public class IgReactPackage$$ReactModuleInfoProvider implements ReactModuleInfoProvider {
    public final Map getReactModuleInfos() {
        Map hashMap = new HashMap();
        hashMap.put(AppStateModule.NAME, new ReactModuleInfo(AppStateModule.NAME, "com.facebook.react.modules.appstate.AppStateModule", false, false, false, false));
        hashMap.put(AsyncStorageModule.NAME, new ReactModuleInfo(AsyncStorageModule.NAME, "com.facebook.react.modules.storage.AsyncStorageModule", false, false, false, false));
        hashMap.put(DialogModule.NAME, new ReactModuleInfo(DialogModule.NAME, "com.facebook.react.modules.dialog.DialogModule", false, false, true, false));
        hashMap.put("I18nAssets", new ReactModuleInfo("I18nAssets", "com.facebook.fbreact.i18n.FbReactI18nAssetsModule", false, false, false, true));
        hashMap.put(FbReactI18nModule.NAME, new ReactModuleInfo(FbReactI18nModule.NAME, "com.facebook.fbreact.i18n.FbReactI18nModule", false, false, true, false));
        hashMap.put("I18nManager", new ReactModuleInfo("I18nManager", "com.facebook.react.modules.i18nmanager.I18nManagerModule", false, false, true, false));
        hashMap.put(IgNativeColorsModule.MODULE_NAME, new ReactModuleInfo(IgNativeColorsModule.MODULE_NAME, "com.instagram.react.modules.base.IgNativeColorsModule", false, false, true, false));
        hashMap.put(IgNetworkingModule.MODULE_NAME, new ReactModuleInfo(IgNetworkingModule.MODULE_NAME, "com.instagram.react.modules.base.IgNetworkingModule", false, false, false, false));
        hashMap.put(IgReactAnalyticsModule.MODULE_NAME, new ReactModuleInfo(IgReactAnalyticsModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactAnalyticsModule", false, false, false, false));
        hashMap.put(IgReactBoostPostModule.MODULE_NAME, new ReactModuleInfo(IgReactBoostPostModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactBoostPostModule", false, false, false, false));
        hashMap.put(IgReactBrandedContentModule.MODULE_NAME, new ReactModuleInfo(IgReactBrandedContentModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactBrandedContentModule", false, false, false, false));
        hashMap.put(IgReactCheckpointModule.MODULE_NAME, new ReactModuleInfo(IgReactCheckpointModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactCheckpointModule", false, false, false, false));
        hashMap.put(IgReactCommentModerationModule.MODULE_NAME, new ReactModuleInfo(IgReactCommentModerationModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactCommentModerationModule", false, false, false, false));
        hashMap.put(IgReactCompassionResourceModule.MODULE_NAME, new ReactModuleInfo(IgReactCompassionResourceModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactCompassionResourceModule", false, false, false, false));
        hashMap.put(IgReactDialogModule.MODULE_NAME, new ReactModuleInfo(IgReactDialogModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactDialogModule", false, false, true, false));
        hashMap.put("ExceptionsManager", new ReactModuleInfo("ExceptionsManager", "com.instagram.react.modules.exceptionmanager.IgReactExceptionManager", true, true, false, false));
        hashMap.put(IgReactFunnelLoggerModule.MODULE_NAME, new ReactModuleInfo(IgReactFunnelLoggerModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactFunnelLoggerModule", false, false, false, false));
        hashMap.put(IgReactGeoGatingModule.MODULE_NAME, new ReactModuleInfo(IgReactGeoGatingModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactGeoGatingModule", false, false, false, false));
        hashMap.put(IgReactImageLoaderModule.MODULE_NAME, new ReactModuleInfo(IgReactImageLoaderModule.MODULE_NAME, "com.instagram.react.views.image.IgReactImageLoaderModule", false, false, false, false));
        hashMap.put(IgReactInsightsModule.MODULE_NAME, new ReactModuleInfo(IgReactInsightsModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactInsightsModule", false, false, false, false));
        hashMap.put(IgReactInsightsStoryPresenterModule.MODULE_NAME, new ReactModuleInfo(IgReactInsightsStoryPresenterModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactInsightsStoryPresenterModule", false, false, false, false));
        hashMap.put(IgReactLeadAdsModule.REACT_MODULE_NAME, new ReactModuleInfo(IgReactLeadAdsModule.REACT_MODULE_NAME, "com.instagram.react.modules.product.IgReactLeadAdsModule", false, false, false, false));
        hashMap.put(IgReactNavigatorModule.MODULE_NAME, new ReactModuleInfo(IgReactNavigatorModule.MODULE_NAME, "com.instagram.react.modules.navigator.IgReactNavigatorModule", false, true, true, false));
        hashMap.put(IgReactPaymentModule.REACT_MODULE_NAME, new ReactModuleInfo(IgReactPaymentModule.REACT_MODULE_NAME, "com.instagram.react.modules.product.IgReactPaymentModule", false, false, false, false));
        hashMap.put(IgReactPerformanceLoggerModule.MODULE_NAME, new ReactModuleInfo(IgReactPerformanceLoggerModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactPerformanceLoggerModule", false, true, false, false));
        hashMap.put(IgReactPostInsightsModule.MODULE_NAME, new ReactModuleInfo(IgReactPostInsightsModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactPostInsightsModule", false, false, false, false));
        hashMap.put(IgReactQEModule.MODULE_NAME, new ReactModuleInfo(IgReactQEModule.MODULE_NAME, "com.instagram.react.modules.base.IgReactQEModule", false, false, true, false));
        hashMap.put(IgReactShoppingCatalogSettingsModule.MODULE_NAME, new ReactModuleInfo(IgReactShoppingCatalogSettingsModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactShoppingCatalogSettingsModule", false, false, false, false));
        hashMap.put(IgReactShoppingSignupReactModule.MODULE_NAME, new ReactModuleInfo(IgReactShoppingSignupReactModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactShoppingSignupReactModule", false, false, false, false));
        hashMap.put(IgReactPurchaseExperienceBridgeModule.MODULE_NAME, new ReactModuleInfo(IgReactPurchaseExperienceBridgeModule.MODULE_NAME, "com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule", false, false, false, false));
        hashMap.put(IgSharedPreferencesModule.MODULE_NAME, new ReactModuleInfo(IgSharedPreferencesModule.MODULE_NAME, "com.instagram.react.modules.base.IgSharedPreferencesModule", false, false, false, false));
        hashMap.put("IntentAndroid", new ReactModuleInfo("IntentAndroid", "com.facebook.react.modules.intent.IntentModule", false, false, false, false));
        hashMap.put("LocationObserver", new ReactModuleInfo("LocationObserver", "com.facebook.react.modules.location.LocationModule", false, false, false, false));
        hashMap.put(NativeAnimatedModule.NAME, new ReactModuleInfo(NativeAnimatedModule.NAME, "com.facebook.react.animated.NativeAnimatedModule", false, false, false, false));
        hashMap.put("PermissionsAndroid", new ReactModuleInfo("PermissionsAndroid", "com.facebook.react.modules.permissions.PermissionsModule", false, false, false, false));
        hashMap.put("RelayAPIConfig", new ReactModuleInfo("RelayAPIConfig", "com.instagram.react.modules.base.RelayAPIConfigModule", false, false, true, false));
        hashMap.put("StatusBarManager", new ReactModuleInfo("StatusBarManager", "com.facebook.react.modules.statusbar.StatusBarModule", false, false, true, false));
        hashMap.put(SwipeRefreshLayoutManager.REACT_CLASS, new ReactModuleInfo(SwipeRefreshLayoutManager.REACT_CLASS, "com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager", false, false, false, false));
        hashMap.put("ToastAndroid", new ReactModuleInfo("ToastAndroid", "com.facebook.react.modules.toast.ToastModule", false, false, true, false));
        return hashMap;
    }
}
