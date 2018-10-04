package com.fasterxml.jackson.core;

public interface TreeNode {
    JsonToken asToken();

    JsonParser$NumberType numberType();
}
