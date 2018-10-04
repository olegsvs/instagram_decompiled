package com.facebook.jni;

import java.util.Iterator;

public class IteratorHelper {
    private Object mElement;
    private final Iterator mIterator;

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
