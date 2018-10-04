package com.instagram.react.modules.product;

import X.AnonymousClass0GA;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Iu;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass5sk;
import X.AnonymousClass5sl;
import X.AnonymousClass5sm;
import android.support.v4.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.model.comments.ParcelableCommenterDetails;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

@ReactModule(name = "IGCommentModerationReactModule")
public class IgReactCommentModerationModule extends NativeIGCommentModerationReactModuleSpec {
    private static final String ERROR_SERVER_ERR = "E_SERVER_ERR";
    public static final String MODULE_NAME = "IGCommentModerationReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactCommentModerationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void fetchBlockedCommenters(Promise promise) {
        promise.resolve(null);
    }

    public void fetchCommentAudienceControlType(Promise promise) {
        promise.resolve(null);
    }

    public void fetchCommentCategoryFilterDisabled(Promise promise) {
        promise.resolve(null);
    }

    public void fetchCommentFilter(Promise promise) {
        promise.resolve(null);
    }

    public void fetchCommentFilterKeywords(Promise promise) {
        promise.resolve(null);
    }

    public void fetchCurrentUser(Promise promise) {
        promise.resolve(null);
    }

    private static ParcelableCommenterDetails getParcelableCommenterDetails(HashMap hashMap) {
        return new ParcelableCommenterDetails((Double) hashMap.get("pk"), ((Boolean) hashMap.get("is_verified")).booleanValue(), ((Boolean) hashMap.get("is_private")).booleanValue(), (String) hashMap.get("username"), (String) hashMap.get("full_name"), (String) hashMap.get("profile_pic_url"), (String) hashMap.get("profile_pic_id"));
    }

    public void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        ArrayList toArrayList = readableArray.toArrayList();
        int size = toArrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(getParcelableCommenterDetails((HashMap) toArrayList.get(i)));
        }
        UiThreadUtil.runOnUiThread(new AnonymousClass5sl(this, fragmentActivity, arrayList, callback));
    }

    private void scheduleTask(AnonymousClass0Iu anonymousClass0Iu, Promise promise) {
        anonymousClass0Iu.f2849B = new AnonymousClass5sm(this, promise);
        AnonymousClass0Ix.D(anonymousClass0Iu);
    }

    public void setBlockedCommenters(ReadableMap readableMap, Promise promise) {
        try {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (readableMap.hasKey("block")) {
                str = "block";
                jSONObject.put(str, new JSONArray(readableMap.getArray(str).toArrayList()));
            }
            if (readableMap.hasKey("unblock")) {
                str = "unblock";
                jSONObject.put(str, new JSONArray(readableMap.getArray(str).toArrayList()));
            }
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "accounts/set_blocked_commenters/";
            scheduleTask(anonymousClass0Pt.G("commenter_block_status", jSONObject.toString()).M(AnonymousClass0Pv.class).N().H(), promise);
        } catch (Throwable e) {
            AnonymousClass0Gn.E("IgReactCommentModerationModule", "Failed to send block commenter request", e);
        }
    }

    public void setCommentAudienceControlType(String str, Promise promise) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/set_comment_audience_control_type/";
        AnonymousClass0GA H = anonymousClass0Pt.D("audience_control", str).M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass5sk(this, str, promise);
        AnonymousClass0Ix.D(H);
    }

    public void setCommentCategoryFilterDisabled(boolean z, Promise promise) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/set_comment_category_filter_disabled/";
        scheduleTask(anonymousClass0Pt.D("disabled", z ? "1" : "0").M(AnonymousClass0Pv.class).N().H(), promise);
    }

    public void setCustomKeywords(String str, Promise promise) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/set_comment_filter_keywords/";
        scheduleTask(anonymousClass0Pt.D("keywords", str).M(AnonymousClass0Pv.class).N().H(), promise);
    }

    public void setUseDefaultKeywords(boolean z, Promise promise) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/set_comment_filter/";
        scheduleTask(anonymousClass0Pt.D("config_value", z ? "1" : "0").M(AnonymousClass0Pv.class).N().H(), promise);
    }
}
