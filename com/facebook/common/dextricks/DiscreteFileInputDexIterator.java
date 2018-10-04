package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest.Dex;
import java.io.Closeable;

public final class DiscreteFileInputDexIterator extends InputDexIterator {
    private final ResProvider mResProvider;

    public DiscreteFileInputDexIterator(DexManifest dexManifest, ResProvider resProvider) {
        super(dexManifest);
        this.mResProvider = resProvider;
    }

    public InputDex nextImpl(Dex dex) {
        InputDex inputDex = this.mResProvider;
        Closeable open = inputDex.open(dex.assetName);
        try {
            inputDex = new InputDex(dex, open);
            return inputDex;
        } finally {
            Fs.safeClose(open);
        }
    }
}
