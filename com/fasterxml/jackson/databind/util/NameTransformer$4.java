package com.fasterxml.jackson.databind.util;

public final class NameTransformer$4 extends NameTransformer {
    public final /* synthetic */ String val$suffix;

    public NameTransformer$4(String str) {
        this.val$suffix = str;
    }

    public String reverse(String str) {
        return str.endsWith(this.val$suffix) ? str.substring(0, str.length() - this.val$suffix.length()) : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[SuffixTransformer('");
        stringBuilder.append(this.val$suffix);
        stringBuilder.append("')]");
        return stringBuilder.toString();
    }

    public String transform(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.val$suffix);
        return stringBuilder.toString();
    }
}
