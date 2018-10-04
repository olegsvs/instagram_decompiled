package X;

import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5dp */
public final class AnonymousClass5dp extends ClassLoader {
    /* renamed from: E */
    public static final Method f67660E;
    /* renamed from: F */
    private static AnonymousClass5dp f67661F;
    /* renamed from: B */
    public PathClassLoader f67662B;
    /* renamed from: C */
    public File f67663C;
    /* renamed from: D */
    public Map f67664D = new HashMap();

    public final String toString() {
        return "DelegatingClassLoader";
    }

    static {
        try {
            f67660E = ClassLoader.class.getDeclaredMethod("findLoadedClass", new Class[]{String.class});
            f67660E.setAccessible(true);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private AnonymousClass5dp(ClassLoader classLoader) {
        super(classLoader);
    }

    /* renamed from: A */
    public final void m28164A(java.util.List r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r2 = new dalvik.system.PathClassLoader;
        r1 = "";
        r2.<init>(r1, r1, r5);
        r5.f67662B = r2;
        r0 = r5.f67664D;
        r0.clear();
        r4 = r6.iterator();
    L_0x0012:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0018:
        r2 = r4.next();
        r2 = (java.io.File) r2;
        r3 = new java.io.File;	 Catch:{ IOException -> 0x0012 }
        r1 = r5.f67663C;	 Catch:{ IOException -> 0x0012 }
        r0 = r2.getName();	 Catch:{ IOException -> 0x0012 }
        r3.<init>(r1, r0);	 Catch:{ IOException -> 0x0012 }
        r2 = r2.getCanonicalPath();	 Catch:{ IOException -> 0x0012 }
        r1 = r3.getCanonicalPath();	 Catch:{ IOException -> 0x0012 }
        r0 = 0;	 Catch:{ IOException -> 0x0012 }
        r3 = dalvik.system.DexFile.loadDex(r2, r1, r0);	 Catch:{ IOException -> 0x0012 }
        r2 = r3.entries();	 Catch:{ IOException -> 0x0012 }
    L_0x003a:
        r0 = r2.hasMoreElements();	 Catch:{ IOException -> 0x0012 }
        if (r0 == 0) goto L_0x0012;	 Catch:{ IOException -> 0x0012 }
    L_0x0040:
        r1 = r5.f67664D;	 Catch:{ IOException -> 0x0012 }
        r0 = r2.nextElement();	 Catch:{ IOException -> 0x0012 }
        r1.put(r0, r3);	 Catch:{ IOException -> 0x0012 }
        goto L_0x003a;	 Catch:{ IOException -> 0x0012 }
    L_0x004a:
        return;	 Catch:{ IOException -> 0x0012 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5dp.A(java.util.List):void");
    }

    /* renamed from: B */
    public static AnonymousClass5dp m28163B() {
        if (f67661F == null) {
            f67661F = new AnonymousClass5dp(AnonymousClass5dp.class.getClassLoader());
        }
        return f67661F;
    }

    public final Class loadClass(String str, boolean z) {
        Class cls;
        if (this.f67664D.containsKey(str)) {
            PathClassLoader pathClassLoader = this.f67662B;
            if (pathClassLoader != null) {
                StringBuilder stringBuilder;
                try {
                    cls = (Class) f67660E.invoke(pathClassLoader, new Object[]{str});
                    if (cls == null) {
                        DexFile dexFile = (DexFile) this.f67664D.get(str);
                        if (dexFile != null) {
                            cls = dexFile.loadClass(str, this.f67662B);
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to find class ");
                            stringBuilder.append(str);
                            throw new ClassNotFoundException(stringBuilder.toString());
                        }
                    }
                } catch (Exception e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to find class ");
                    stringBuilder.append(str);
                    throw new ClassNotFoundException(stringBuilder.toString(), e.getCause());
                }
            }
            throw new RuntimeException("DelegatingCL was not initialized via ExopackageDexLoader.loadExopackageJars");
        }
        cls = getParent().loadClass(str);
        if (z) {
            resolveClass(cls);
        }
        return cls;
    }
}
