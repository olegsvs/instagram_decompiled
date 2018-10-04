package com.instagram.react.modules.product;

import X.AnonymousClass0Gn;
import X.AnonymousClass0IL;
import X.AnonymousClass0Iy;
import X.AnonymousClass0Qf;
import X.AnonymousClass0q8;
import X.AnonymousClass1Pv;
import X.AnonymousClass34j;
import X.AnonymousClass5st;
import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGInsightsStoryPresenterReactModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.List;

@ReactModule(name = "IGInsightsStoryPresenterReactModule")
public class IgReactInsightsStoryPresenterModule extends NativeIGInsightsStoryPresenterReactModuleSpec {
    public static final String MODULE_NAME = "IGInsightsStoryPresenterReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactInsightsStoryPresenterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private AnonymousClass34j getStoriesReactFragment(String str) {
        StringBuilder stringBuilder;
        Activity currentActivity = getCurrentActivity();
        AnonymousClass1Pv E = AnonymousClass0Iy.E(str);
        if (currentActivity != null) {
            if (E != null) {
                AnonymousClass0IL D = AnonymousClass0Iy.D(currentActivity, E);
                if (D instanceof AnonymousClass34j) {
                    return (AnonymousClass34j) D;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment must be StoriesReactFragment for surface ");
                stringBuilder.append(str);
                logStoryPresenterError(stringBuilder.toString());
                return null;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Story viewer activity can not be null for surface ");
        stringBuilder.append(str);
        logStoryPresenterError(stringBuilder.toString());
        return null;
    }

    private static void logStoryPresenterError(String str) {
        AnonymousClass0Gn.L("IgReactInsightsStoryPresenterModule", new IllegalArgumentException(str));
    }

    private void openStoryViewerForMedia(ReadableArray readableArray, String str, AnonymousClass34j anonymousClass34j, double d, AnonymousClass0Qf anonymousClass0Qf) {
        readableArray = parseMediaIDList(readableArray);
        double d2 = d;
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new AnonymousClass5st(this, d2, anonymousClass34j, readableArray, readableArray.indexOf(str), anonymousClass0Qf));
    }

    public void openStoryViewerForMediaIDs(ReadableArray readableArray, String str, double d, String str2) {
        IgReactInsightsStoryPresenterModule igReactInsightsStoryPresenterModule = this;
        AnonymousClass34j storiesReactFragment = getStoriesReactFragment(str2);
        if (storiesReactFragment != null) {
            openStoryViewerForMedia(readableArray, str, storiesReactFragment, d, AnonymousClass0Qf.BUSINESS_INSIGHTS);
        }
    }

    public void openTutorialViewerForMediaIDs(ReadableArray readableArray, String str, double d, String str2, String str3) {
        IgReactInsightsStoryPresenterModule igReactInsightsStoryPresenterModule = this;
        AnonymousClass34j storiesReactFragment = getStoriesReactFragment(str2);
        if (storiesReactFragment != null) {
            AnonymousClass0q8.f10873D = str3;
            openStoryViewerForMedia(readableArray, str, storiesReactFragment, d, AnonymousClass0Qf.BUSINESS_TUTORIALS);
        }
    }

    private static List parseMediaIDList(ReadableArray readableArray) {
        List arrayList = new ArrayList();
        ArrayList toArrayList = readableArray.toArrayList();
        int size = toArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = toArrayList.get(i);
            if (obj instanceof String) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
