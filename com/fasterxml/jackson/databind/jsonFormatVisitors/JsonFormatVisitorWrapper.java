package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;

public interface JsonFormatVisitorWrapper extends JsonFormatVisitorWithSerializerProvider {
    JsonAnyFormatVisitor expectAnyFormat(JavaType javaType);

    JsonArrayFormatVisitor expectArrayFormat(JavaType javaType);

    JsonBooleanFormatVisitor expectBooleanFormat(JavaType javaType);

    JsonIntegerFormatVisitor expectIntegerFormat(JavaType javaType);

    JsonMapFormatVisitor expectMapFormat(JavaType javaType);

    JsonNullFormatVisitor expectNullFormat(JavaType javaType);

    JsonNumberFormatVisitor expectNumberFormat(JavaType javaType);

    JsonObjectFormatVisitor expectObjectFormat(JavaType javaType);

    JsonStringFormatVisitor expectStringFormat(JavaType javaType);
}
