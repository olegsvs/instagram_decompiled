package com.facebook.proxygen;

public class RewriteRule {
    private String format;
    private String matcher;

    public RewriteRule(String str, String str2) {
        this.matcher = str;
        this.format = str2;
    }

    public String getFormat() {
        return this.format;
    }

    public String getMatcher() {
        return this.matcher;
    }
}
