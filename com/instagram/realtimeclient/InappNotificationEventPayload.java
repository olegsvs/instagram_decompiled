package com.instagram.realtimeclient;

public class InappNotificationEventPayload {
    public String mExtraInfo;
    public String mInappUrl;
    public String mMessageOnBanner;
    public String mNotificationType;

    public String getExtraInfo() {
        return this.mExtraInfo;
    }

    public String getInappUrl() {
        return this.mInappUrl;
    }

    public String getMessageOnBanner() {
        return this.mMessageOnBanner;
    }

    public String getNotificationType() {
        return this.mNotificationType;
    }
}
