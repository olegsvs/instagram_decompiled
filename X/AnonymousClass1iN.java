package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

/* renamed from: X.1iN */
public class AnonymousClass1iN {
    private final AnonymousClass1ih mEmptyAnalyticsLogger = new AnonymousClass2lt(this);
    private volatile String mMqttConnectionConfig = "{}";
    private volatile String mPreferredSandbox = JsonProperty.USE_DEFAULT_NAME;
    private volatile String mPreferredTier = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;

    public Map getAppSpecificInfo() {
        return null;
    }

    public String getCustomAnalyticsEventNameSuffix() {
        return null;
    }

    public long getEndpointCapabilities() {
        return 0;
    }

    public int getHealthStatsSamplingRate() {
        return 1;
    }

    public String getRequestRoutingRegion() {
        return null;
    }

    public AnonymousClass1ih getAnalyticsLogger() {
        return this.mEmptyAnalyticsLogger;
    }

    public AnonymousClass1ij getKeepaliveParams() {
        return new AnonymousClass2lu(900, 60, 60);
    }

    public String getMqttConnectionConfig() {
        return this.mMqttConnectionConfig;
    }

    public String getMqttConnectionPreferredSandbox() {
        return this.mPreferredSandbox;
    }

    public String getMqttConnectionPreferredTier() {
        return this.mPreferredTier;
    }

    public void setMqttConnectionConfig(String str) {
        AnonymousClass1DG.m10047C(str);
        this.mMqttConnectionConfig = str;
    }

    public void setPreferredSandbox(String str) {
        AnonymousClass1DG.m10047C(str);
        this.mPreferredSandbox = str;
    }

    public void setPreferredTier(String str) {
        if (!"sandbox".equals(str)) {
            if (!GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(str)) {
                throw new RuntimeException("Preferred tier must be either 'sandbox' or 'default'");
            }
        }
        this.mPreferredTier = str;
    }
}
