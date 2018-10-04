package com.facebook.proxygen;

public class RequestStatsObserver implements TraceEventObserver {
    private TraceEvent[] mEvents;

    public RequestStats getRequestStats() {
        TraceEvent[] traceEventArr = this.mEvents;
        if (traceEventArr != null) {
            if (traceEventArr.length != 0) {
                return new RequestStats(traceEventArr);
            }
        }
        return null;
    }

    public void traceEventAvailable(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }
}
