package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.1ss */
public enum AnonymousClass1ss {
    UserInteraction("user"),
    System("system"),
    Unknown(JsonProperty.USE_DEFAULT_NAME);
    
    /* renamed from: B */
    private final String f23746B;

    private AnonymousClass1ss(String str) {
        this.f23746B = str;
    }

    public final String toString() {
        return this.f23746B;
    }
}
