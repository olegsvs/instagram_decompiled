package com.instagram.react.impl;

import X.AnonymousClass0CB;
import X.AnonymousClass1Rd;
import X.AnonymousClass5rY;
import X.AnonymousClass5rZ;
import X.AnonymousClass5ra;
import X.AnonymousClass5rb;
import X.AnonymousClass5rc;
import X.AnonymousClass5rd;
import X.AnonymousClass5re;
import X.AnonymousClass5rf;
import X.AnonymousClass5rg;
import X.AnonymousClass5rh;
import X.AnonymousClass5ri;
import X.AnonymousClass5rj;
import X.AnonymousClass5rk;
import X.AnonymousClass5rl;
import X.AnonymousClass5rm;
import X.AnonymousClass5rn;
import X.AnonymousClass5ro;
import X.AnonymousClass5rp;
import X.AnonymousClass5rq;
import X.AnonymousClass5rr;
import X.AnonymousClass5rs;
import X.AnonymousClass5rt;
import X.AnonymousClass5ru;
import X.AnonymousClass5rv;
import X.AnonymousClass5rw;
import X.AnonymousClass5rx;
import X.AnonymousClass5ry;
import X.AnonymousClass5rz;
import X.AnonymousClass5s0;
import X.AnonymousClass5s1;
import X.AnonymousClass5s2;
import X.AnonymousClass5s3;
import X.AnonymousClass5s4;
import X.AnonymousClass5s5;
import X.AnonymousClass5s6;
import X.AnonymousClass5s7;
import X.AnonymousClass5s8;
import X.AnonymousClass5s9;
import X.AnonymousClass5sA;
import X.AnonymousClass5t5;
import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.react.LazyReactPackage;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.react.modules.base.IgNativeColorsModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactDialogModule;
import com.instagram.react.modules.base.IgReactFunnelLoggerModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.base.RelayAPIConfigModule;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
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
import com.instagram.react.perf.IgReactPerformanceLoggerFlagManager;
import com.instagram.react.views.custom.IgLoadingIndicatorViewManager;
import com.instagram.react.views.image.IgReactImageLoaderModule;
import com.instagram.react.views.image.IgReactImageManager;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import com.instagram.react.views.switchview.ReactSwitchManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class IgReactPackage extends LazyReactPackage {
    private final AnonymousClass5t5 mReactPerformanceFlagListener = new AnonymousClass5t5();

    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{ARTRenderableViewManager.createARTGroupViewManager(), ARTRenderableViewManager.createARTShapeViewManager(), ARTRenderableViewManager.createARTTextViewManager(), new ARTSurfaceViewManager(), new IgLoadingIndicatorViewManager(), new IgReactImageManager(), new IgStaticMapViewManager(), new ReactHorizontalScrollContainerViewManager(), new ReactHorizontalScrollViewManager(), new ReactModalHostManager(), new ReactProgressBarViewManager(), new ReactRawTextManager(), new ReactScrollViewManager(), new ReactSliderManager(), new ReactSwitchManager(), new ReactTextInputManager(), new ReactTextViewManager(), new ReactViewManager(), new ReactViewPagerManager(), new ReactWebViewManager(), new ReactVirtualTextViewManager(), new ReactDropdownPickerManager(), new ReactDialogPickerManager(), new SwipeRefreshLayoutManager(), new IgReactPerformanceLoggerFlagManager(this.mReactPerformanceFlagListener)});
    }

    public final List getNativeModules(ReactApplicationContext reactApplicationContext) {
        List arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec(IntentModule.class, new AnonymousClass5ri(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(NativeAnimatedModule.class, new AnonymousClass5rt(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(DialogModule.class, new AnonymousClass5s4(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgNetworkingModule.class, new AnonymousClass5s6(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactAnalyticsModule.class, new AnonymousClass5s7(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgNativeColorsModule.class, new AnonymousClass5s8(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactCommentModerationModule.class, new AnonymousClass5s9(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactBrandedContentModule.class, new AnonymousClass5sA(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactCheckpointModule.class, new AnonymousClass1Rd(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactPostInsightsModule.class, new AnonymousClass5rY(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec("I18nAssets", new AnonymousClass5rZ(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(FbReactI18nModule.class, new AnonymousClass5ra(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(I18nManagerModule.class, new AnonymousClass5rb(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactNavigatorModule.class, new AnonymousClass5rc(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactPaymentModule.class, new AnonymousClass5rd(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgSharedPreferencesModule.class, new AnonymousClass5re(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(LocationModule.class, new AnonymousClass5rf(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(PermissionsModule.class, new AnonymousClass5rg(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(AsyncStorageModule.class, new AnonymousClass5rh(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(ToastModule.class, new AnonymousClass5rj(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(RelayAPIConfigModule.class, new AnonymousClass5rk(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactLeadAdsModule.class, new AnonymousClass5rl(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactExceptionManager.class, new AnonymousClass5rm(this)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactFunnelLoggerModule.class, new AnonymousClass5rn(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactDialogModule.class, new AnonymousClass5ro(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactPerformanceLoggerModule.class, new AnonymousClass5rp(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactImageLoaderModule.class, new AnonymousClass5rq(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactInsightsModule.class, new AnonymousClass5rr(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactInsightsStoryPresenterModule.class, new AnonymousClass5rs(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactQEModule.class, new AnonymousClass5ru(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactShoppingCatalogSettingsModule.class, new AnonymousClass5rv(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactShoppingSignupReactModule.class, new AnonymousClass5rw(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactPurchaseExperienceBridgeModule.class, new AnonymousClass5rx(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactCompassionResourceModule.class, new AnonymousClass5ry(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(AppStateModule.class, new AnonymousClass5rz(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactBoostPostModule.class, new AnonymousClass5s0(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(StatusBarModule.class, new AnonymousClass5s1(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(IgReactGeoGatingModule.class, new AnonymousClass5s2(this, reactApplicationContext)));
        if (AnonymousClass0CB.D()) {
            try {
                Class cls = Class.forName("com.facebook.react.modules.websocket.WebSocketModule");
                arrayList.add(ModuleSpec.nativeModuleSpec(cls, new AnonymousClass5s3(this, cls, reactApplicationContext)));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return arrayList;
    }

    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        if (AnonymousClass0CB.D()) {
            return new AnonymousClass5s5(this);
        }
        return new IgReactPackage$$ReactModuleInfoProvider();
    }
}
