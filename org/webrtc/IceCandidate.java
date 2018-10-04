package org.webrtc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IceCandidate {
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    public IceCandidate(String str, int i, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = JsonProperty.USE_DEFAULT_NAME;
    }

    public IceCandidate(String str, int i, String str2, String str3) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = str3;
    }

    public String getSdp() {
        return this.sdp;
    }

    public String getSdpMid() {
        return this.sdpMid;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.sdpMid);
        stringBuilder.append(":");
        stringBuilder.append(this.sdpMLineIndex);
        stringBuilder.append(":");
        stringBuilder.append(this.sdp);
        stringBuilder.append(":");
        stringBuilder.append(this.serverUrl);
        return stringBuilder.toString();
    }
}
