package com.instagram.debug.log;

import X.AnonymousClass0F6;
import com.instagram.debug.log.tags.DLogTag;

public class DLog$NewLogEvent implements AnonymousClass0F6 {
    public final int logLevel;
    public final DLogTag logTag;
    public final String message;

    public DLog$NewLogEvent(DLogTag dLogTag, int i, String str) {
        this.logTag = dLogTag;
        this.logLevel = i;
        this.message = str;
    }
}
