package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonAutoDetect {

    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean isVisible(java.lang.reflect.Member r3) {
            /*
            r2 = this;
            r1 = com.fasterxml.jackson.annotation.JsonAutoDetect.C01481.f50706x23d16a11;
            r0 = r2.ordinal();
            r2 = r1[r0];
            r0 = 0;
            r1 = 1;
            switch(r2) {
                case 1: goto L_0x0018;
                case 2: goto L_0x000d;
                case 3: goto L_0x0022;
                case 4: goto L_0x000e;
                case 5: goto L_0x0019;
                default: goto L_0x000d;
            };
        L_0x000d:
            return r0;
        L_0x000e:
            r0 = r3.getModifiers();
            r0 = java.lang.reflect.Modifier.isProtected(r0);
            if (r0 == 0) goto L_0x0019;
        L_0x0018:
            return r1;
        L_0x0019:
            r0 = r3.getModifiers();
            r0 = java.lang.reflect.Modifier.isPublic(r0);
            return r0;
        L_0x0022:
            r0 = r3.getModifiers();
            r0 = java.lang.reflect.Modifier.isPrivate(r0);
            r0 = r0 ^ r1;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.isVisible(java.lang.reflect.Member):boolean");
        }
    }

    Visibility creatorVisibility() default Visibility.DEFAULT;

    Visibility fieldVisibility() default Visibility.DEFAULT;

    Visibility getterVisibility() default Visibility.DEFAULT;

    Visibility isGetterVisibility() default Visibility.DEFAULT;

    Visibility setterVisibility() default Visibility.DEFAULT;
}
