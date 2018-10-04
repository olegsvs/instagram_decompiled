package com.facebook.proxygen;

import java.util.Random;

public class TraceEventContext {
    private static final Random RAND = new Random();
    private TraceEventObserver[] mObservers;
    private int mParentID;
    private final SamplePolicy mSamplePolicy;

    public TraceEventContext(SamplePolicy samplePolicy) {
        this(new TraceEventObserver[0], samplePolicy);
    }

    public TraceEventContext(TraceEventObserver[] traceEventObserverArr) {
        this(traceEventObserverArr, new TraceEventContext$1());
    }

    public TraceEventContext(TraceEventObserver[] traceEventObserverArr, SamplePolicy samplePolicy) {
        this.mParentID = RAND.nextInt(Integer.MAX_VALUE);
        this.mObservers = traceEventObserverArr;
        this.mSamplePolicy = samplePolicy;
    }

    public int getParentID() {
        return this.mParentID;
    }

    public void informAllObservers(TraceEvent[] traceEventArr) {
        for (TraceEventObserver traceEventAvailable : this.mObservers) {
            traceEventAvailable.traceEventAvailable(traceEventArr);
        }
    }

    public boolean needPublishEvent() {
        return this.mSamplePolicy.isSampled();
    }
}
