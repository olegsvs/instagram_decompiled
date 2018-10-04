package com.facebook.common.dextricks;

import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.OdexScheme.Compiler;
import java.io.File;

public final class OdexSchemeNoop extends OdexScheme {

    public final class NoopCompiler extends Compiler {
        public void compile(InputDex inputDex) {
        }
    }

    public void configureClassLoader(File file, Configuration configuration) {
    }

    public String getSchemeName() {
        return "OdexSchemeNoop";
    }

    public OdexSchemeNoop() {
        super(16, new String[0]);
    }

    public Compiler makeCompiler(DexStore dexStore, int i) {
        return new NoopCompiler();
    }
}
