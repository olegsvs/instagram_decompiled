package com.facebook.proxygen.utils;

import java.nio.charset.Charset;

public class GLogHandler {
    private BLogHandler handler;
    private final GLogHandler$GLogSeverity[] severities = GLogHandler$GLogSeverity.values();

    public GLogHandler(BLogHandler bLogHandler) {
        this.handler = bLogHandler;
    }

    public void log(int i, String str) {
        if (i >= 0) {
            GLogHandler$GLogSeverity[] gLogHandler$GLogSeverityArr = this.severities;
            if (i < gLogHandler$GLogSeverityArr.length) {
                this.handler.log(gLogHandler$GLogSeverityArr[i], str);
            }
        }
    }

    public void log(int i, byte[] bArr) {
        log(i, new String(bArr, Charset.forName("UTF-8")));
    }
}
