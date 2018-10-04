package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EmptyIterator implements Iterator {
    private static final EmptyIterator instance = new EmptyIterator();

    public boolean hasNext() {
        return false;
    }

    private EmptyIterator() {
    }

    public static Iterator instance() {
        return instance;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
