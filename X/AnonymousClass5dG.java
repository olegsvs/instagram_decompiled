package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.5dG */
public enum AnonymousClass5dG {
    WEBSITE_URL("website_url"),
    API_ENDPOINT("api_endpoint"),
    PAGE_ID("page_id"),
    SOURCE("source"),
    ERROR_CODE(TraceFieldType.ErrorCode),
    ERROR_MESSAGE("error_message"),
    AD_ID("ad_id"),
    PERMISSION_REQUESTED("permission_requested"),
    APP_ID("app_id"),
    AUTOFILL_FIELDS_REQUESTED("autofill_fields_requested"),
    AUTOFILL_FIELDS_FILLED("autofill_fields_filled"),
    CALLBACK_RESULT("callback_result"),
    OFFER_CLAIM_ERROR("offer_claim_error"),
    SURFACE("surface"),
    ORIGIN_SESSION_ID("origin_session_id"),
    PRODUCT_HISTORY_COUNT("product_history_count"),
    PRODUCT_ITEM_URL("product_item_url"),
    PRODUCT_ITEM_ID("product_id"),
    LOADING("loading"),
    COLLECTION_ITEM_COUNT("collection_item_count"),
    SAVED_ITEMS_COUNT("saved_items_count"),
    PIXEL_EVENT_NAME("pixel_event_name"),
    PIXEL_EVENT_PIXEL_ID("pixel_event_pixel_id"),
    CURRENT_URL("current_url"),
    NATIVE_FORM_FIELDS_REQUESTED("native_form_fields_requested"),
    NATIVE_FORM_SOURCE("native_form_source"),
    IS_IX_LIGHT("is_ix_light"),
    CANCEL_REASON("cancel_reason"),
    ORIGIN("origin"),
    REEFER_UI_SURFACE("referrer_ui_surface"),
    FOOD_AND_DRINK_MERCHANT_PAGE_ID("food_and_drink_merchant_page_id"),
    FOOD_AND_DRINK_FLOW_ENTRY_POINT_TYPE("food_and_drink_flow_entry_point_type"),
    BUSINESS_ID("business_id"),
    HAS_CODE("has_code"),
    ENDPOINT("endpoint"),
    HTTP_STATUS_CODE("http_status_code"),
    HAS_COOKIES("has_cookies");
    
    /* renamed from: B */
    private final String f67616B;

    private AnonymousClass5dG(String str) {
        this.f67616B = str;
    }

    public final String toString() {
        return this.f67616B;
    }
}
