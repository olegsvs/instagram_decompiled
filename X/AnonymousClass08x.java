package X;

import dalvik.system.BaseDexClassLoader;

/* renamed from: X.08x */
public final class AnonymousClass08x {
    private AnonymousClass08x() {
    }

    /* renamed from: B */
    public static String m560B() {
        ClassLoader classLoader = AnonymousClass0CF.class.getClassLoader();
        if (classLoader instanceof BaseDexClassLoader) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Throwable e) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClassLoader ");
        stringBuilder.append(classLoader.getClass().getName());
        stringBuilder.append(" should be of type BaseDexClassLoader");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
