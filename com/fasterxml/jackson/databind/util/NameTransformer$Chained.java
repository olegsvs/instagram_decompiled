package com.fasterxml.jackson.databind.util;

public class NameTransformer$Chained extends NameTransformer {
    public final NameTransformer _t1;
    public final NameTransformer _t2;

    public NameTransformer$Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        this._t1 = nameTransformer;
        this._t2 = nameTransformer2;
    }

    public String reverse(String str) {
        String reverse = this._t1.reverse(str);
        return reverse != null ? this._t2.reverse(reverse) : reverse;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ChainedTransformer(");
        stringBuilder.append(this._t1);
        stringBuilder.append(", ");
        stringBuilder.append(this._t2);
        stringBuilder.append(")]");
        return stringBuilder.toString();
    }

    public String transform(String str) {
        return this._t1.transform(this._t2.transform(str));
    }
}
