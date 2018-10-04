package com.fasterxml.jackson.databind.deser.impl;

public class ReadableObjectId {
    public final Object id;
    public Object item;

    public ReadableObjectId(Object obj) {
        this.id = obj;
    }

    public void bindItem(Object obj) {
        if (this.item == null) {
            this.item = obj;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Already had POJO for id (");
        stringBuilder.append(this.id.getClass().getName());
        stringBuilder.append(") [");
        stringBuilder.append(this.id);
        stringBuilder.append("]");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
