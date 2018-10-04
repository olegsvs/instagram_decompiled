package org.webrtc;

import java.util.Map;

public class RTCStatsReport {
    private final Map stats;
    private final long timestampUs;

    public RTCStatsReport(long j, Map map) {
        this.timestampUs = j;
        this.stats = map;
    }

    private static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public Map getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ timestampUs: ");
        stringBuilder.append(this.timestampUs);
        stringBuilder.append(", stats: [\n");
        Object obj = 1;
        for (RTCStats rTCStats : this.stats.values()) {
            if (obj == null) {
                stringBuilder.append(",\n");
            }
            stringBuilder.append(rTCStats);
            obj = null;
        }
        stringBuilder.append(" ] }");
        return stringBuilder.toString();
    }
}
