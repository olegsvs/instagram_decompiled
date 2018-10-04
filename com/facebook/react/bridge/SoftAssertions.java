package com.facebook.react.bridge;

public final class SoftAssertions {
    public static void assertCondition(boolean z, String str) {
        if (!z) {
            throw new AssertionException(str);
        }
    }

    public static Object assertNotNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionException("Expected object to not be null!");
    }

    public static void assertUnreachable(String str) {
        throw new AssertionException(str);
    }
}
