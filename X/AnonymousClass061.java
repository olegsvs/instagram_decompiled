package X;

/* renamed from: X.061 */
public enum AnonymousClass061 {
    ADDRESSES("address", false),
    ANALYTICS("analytics", true),
    FBNS_NOTIFICATION_STORE("fbns_notification_store", true),
    FBNS_SHARED_IDS("shared_ids", true),
    FBNS_STATE("fbns_state", true),
    FLAGS("flags", true),
    IDS("ids", true),
    OXYGEN_FBNS_CONFIG("oxygen_fbns_config", false),
    REGISTRATIONS("registrations", true),
    RETRY("retry", false),
    GATEKEEPERS("gk", false),
    MQTT_RADIO_ACTIVE_TIME("mqtt_radio_active_time", false),
    TOKEN_STORE("token_store", false),
    RUNTIME_PARAMS("runtime_params", false),
    DEBUG("mqtt_debug", false),
    MQTT_CONFIG("mqtt_config", false);
    
    /* renamed from: B */
    private final String f238B;
    /* renamed from: C */
    private final boolean f239C;

    private AnonymousClass061(String str, boolean z) {
        this.f238B = str;
        this.f239C = z;
    }

    /* renamed from: A */
    public final String m356A() {
        return this.f238B;
    }

    /* renamed from: B */
    public final boolean m357B() {
        return this.f239C;
    }
}
