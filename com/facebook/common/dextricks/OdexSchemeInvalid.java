package com.facebook.common.dextricks;

import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.OdexScheme.Compiler;
import java.io.File;

public final class OdexSchemeInvalid extends OdexScheme {
    public String getSchemeName() {
        return "OdexSchemeInvalid";
    }

    public OdexSchemeInvalid() {
        super(2, new String[0]);
    }

    public void configureClassLoader(File file, Configuration configuration) {
        throw new UnsupportedOperationException("invalid state");
    }

    public Compiler makeCompiler(DexStore dexStore, int i) {
        throw new UnsupportedOperationException("invalid state");
    }
}
