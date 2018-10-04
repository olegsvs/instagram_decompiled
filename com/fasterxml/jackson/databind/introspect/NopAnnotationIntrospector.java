package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.Serializable;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final NopAnnotationIntrospector instance = new C01631();
    private static final long serialVersionUID = 1;

    /* renamed from: com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1 */
    public final class C01631 extends NopAnnotationIntrospector {
        private static final long serialVersionUID = 1;

        public Version version() {
            return PackageVersion.VERSION;
        }
    }

    public Version version() {
        return Version.unknownVersion();
    }
}
