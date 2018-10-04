package com.fasterxml.jackson.databind.util;

public final class NameTransformer$3 extends NameTransformer {
    public final /* synthetic */ String val$prefix;

    public NameTransformer$3(String str) {
        this.val$prefix = str;
    }

    public String reverse(String str) {
        return str.startsWith(this.val$prefix) ? str.substring(this.val$prefix.length()) : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[PrefixTransformer('");
        stringBuilder.append(this.val$prefix);
        stringBuilder.append("')]");
        return stringBuilder.toString();
    }

    public String transform(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.val$prefix);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
