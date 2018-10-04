package com.fasterxml.jackson.databind.util;

public final class NameTransformer$2 extends NameTransformer {
    public final /* synthetic */ String val$prefix;
    public final /* synthetic */ String val$suffix;

    public NameTransformer$2(String str, String str2) {
        this.val$prefix = str;
        this.val$suffix = str2;
    }

    public String reverse(String str) {
        if (str.startsWith(this.val$prefix)) {
            String substring = str.substring(this.val$prefix.length());
            if (substring.endsWith(this.val$suffix)) {
                return substring.substring(0, substring.length() - this.val$suffix.length());
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[PreAndSuffixTransformer('");
        stringBuilder.append(this.val$prefix);
        stringBuilder.append("','");
        stringBuilder.append(this.val$suffix);
        stringBuilder.append("')]");
        return stringBuilder.toString();
    }

    public String transform(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.val$prefix);
        stringBuilder.append(str);
        stringBuilder.append(this.val$suffix);
        return stringBuilder.toString();
    }
}
