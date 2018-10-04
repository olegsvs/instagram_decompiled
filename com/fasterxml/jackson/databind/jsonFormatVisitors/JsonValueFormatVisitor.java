package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.Set;

public interface JsonValueFormatVisitor {
    void enumTypes(Set set);

    void format(JsonValueFormat jsonValueFormat);
}
