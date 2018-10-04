package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest.Dex;
import java.io.Closeable;
import java.util.Iterator;

public abstract class InputDexIterator implements Iterator, Closeable {
    private int mDexPos = 0;
    private final Dex[] mDexes;

    public void close() {
    }

    public abstract InputDex nextImpl(Dex dex);

    public InputDexIterator(DexManifest dexManifest) {
        this.mDexes = dexManifest.dexes;
    }

    public final boolean hasNext() {
        return this.mDexPos < this.mDexes.length;
    }

    public final InputDex next() {
        try {
            Dex[] dexArr = this.mDexes;
            int i = this.mDexPos;
            this.mDexPos = i + 1;
            return nextImpl(dexArr[i]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
