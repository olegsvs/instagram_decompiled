package X;

/* renamed from: X.225 */
public final class AnonymousClass225 {
    /* renamed from: B */
    private static final Object f25356B;

    static {
        Object E = AnonymousClass225.m14222E();
        f25356B = E;
        if (E != null) {
            AnonymousClass225.m14219B("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (f25356B != null) {
            AnonymousClass225.m14219B("getStackTraceDepth", Throwable.class);
        }
    }

    /* renamed from: B */
    public static java.lang.reflect.Method m14219B(java.lang.String r3, java.lang.Class... r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = 0;
        r1 = "sun.misc.JavaLangAccess";	 Catch:{ ThreadDeath -> 0x000e, Throwable -> 0x000d }
        r0 = 0;	 Catch:{ ThreadDeath -> 0x000e, Throwable -> 0x000d }
        r0 = java.lang.Class.forName(r1, r0, r2);	 Catch:{ ThreadDeath -> 0x000e, Throwable -> 0x000d }
        r0 = r0.getMethod(r3, r4);	 Catch:{ ThreadDeath -> 0x000e, Throwable -> 0x000d }
        return r0;	 Catch:{ ThreadDeath -> 0x000e, Throwable -> 0x000d }
    L_0x000d:
        return r2;
    L_0x000e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.225.B(java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: C */
    public static void m14220C(Throwable th, Class cls) {
        if (th != null) {
            AnonymousClass1Cy.G(th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        if (th != null) {
            AnonymousClass225.m14221D(th);
        }
    }

    /* renamed from: D */
    public static void m14221D(Throwable th) {
        AnonymousClass1Cy.G(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: E */
    private static java.lang.Object m14222E() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = 0;
        r0 = "sun.misc.SharedSecrets";	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        r3 = 0;	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        r2 = java.lang.Class.forName(r0, r3, r4);	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        r1 = "getJavaLangAccess";	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        r0 = new java.lang.Class[r3];	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        r1 = r2.getMethod(r1, r0);	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        r0 = new java.lang.Object[r3];	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        r0 = r1.invoke(r4, r0);	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
        return r0;	 Catch:{ ThreadDeath -> 0x0018, Throwable -> 0x0017 }
    L_0x0017:
        return r4;
    L_0x0018:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.225.E():java.lang.Object");
    }
}
