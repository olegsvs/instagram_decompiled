package com.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;

public interface Annotations {
    Annotation get(Class cls);

    int size();
}
