package com.facebook.react.bridge;

import X.AnonymousClass09A;
import X.AnonymousClass0LR;
import com.facebook.react.bridge.NativeModule.NativeMethod;
import java.lang.reflect.Method;

public final class JavaMethodWrapper implements NativeMethod {
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_ARRAY = new C01356();
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_BOOLEAN = new C01301();
    public static final ArgumentExtractor ARGUMENT_EXTRACTOR_CALLBACK = new C01389();
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_DOUBLE = new C01312();
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_DYNAMIC = new C01367();
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_FLOAT = new C01323();
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_INTEGER = new C01334();
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_MAP = new C01378();
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor() {
        public final int getJSArgumentsNeeded() {
            return 2;
        }

        public static final Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }
    };
    private static final ArgumentExtractor ARGUMENT_EXTRACTOR_STRING = new C01345();
    private static final boolean DEBUG = false;
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType = BaseJavaModule.METHOD_TYPE_ASYNC;

    public abstract class ArgumentExtractor {
        public abstract Object extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$1 */
    public final class C01301 extends ArgumentExtractor {
        public static final Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$2 */
    public final class C01312 extends ArgumentExtractor {
        public static final Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$3 */
    public final class C01323 extends ArgumentExtractor {
        public static final Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$4 */
    public final class C01334 extends ArgumentExtractor {
        public static final Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$5 */
    public final class C01345 extends ArgumentExtractor {
        public static final String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$6 */
    public final class C01356 extends ArgumentExtractor {
        public static final ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$7 */
    public final class C01367 extends ArgumentExtractor {
        public static final Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$8 */
    public final class C01378 extends ArgumentExtractor {
        public static final ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$9 */
    public final class C01389 extends ArgumentExtractor {
        public static final Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        this.mMethod.setAccessible(true);
        Class[] parameterTypes = this.mMethod.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        this.mParamLength = parameterTypes.length;
        if (z) {
            this.mType = BaseJavaModule.METHOD_TYPE_SYNC;
            return;
        }
        int i = this.mParamLength;
        if (i > 0 && parameterTypes[i - 1] == Promise.class) {
            this.mType = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private static ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        for (int i = 0; i < clsArr.length; i += argumentExtractorArr[i].getJSArgumentsNeeded()) {
            Class cls = clsArr[i];
            if (cls != Boolean.class) {
                if (cls != Boolean.TYPE) {
                    if (cls != Integer.class) {
                        if (cls != Integer.TYPE) {
                            if (cls != Double.class) {
                                if (cls != Double.TYPE) {
                                    if (cls != Float.class) {
                                        if (cls != Float.TYPE) {
                                            if (cls == String.class) {
                                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_STRING;
                                            } else if (cls == Callback.class) {
                                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_CALLBACK;
                                            } else if (cls == Promise.class) {
                                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_PROMISE;
                                                boolean z = true;
                                                if (i != clsArr.length - 1) {
                                                    z = false;
                                                }
                                                AnonymousClass0LR.C(z, "Promise must be used as last parameter only");
                                            } else if (cls == ReadableMap.class) {
                                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_MAP;
                                            } else if (cls == ReadableArray.class) {
                                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
                                            } else if (cls == Dynamic.class) {
                                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
                                            } else {
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append("Got unknown argument class: ");
                                                stringBuilder.append(cls.getSimpleName());
                                                throw new RuntimeException(stringBuilder.toString());
                                            }
                                        }
                                    }
                                    argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
                                }
                            }
                            argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
                        }
                    }
                    argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
                }
            }
            argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
        }
        return argumentExtractorArr;
    }

    private static String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(clsArr.length + 2);
        if (z) {
            stringBuilder.append(returnTypeToChar(method.getReturnType()));
            stringBuilder.append('.');
        } else {
            stringBuilder.append("v.");
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == Promise.class) {
                boolean z2 = true;
                if (i != clsArr.length - 1) {
                    z2 = false;
                }
                AnonymousClass0LR.C(z2, "Promise must be used as last parameter only");
            }
            stringBuilder.append(paramTypeToChar(cls));
        }
        return stringBuilder.toString();
    }

    private int calculateJSArgumentsNeeded() {
        int i = 0;
        for (ArgumentExtractor jSArgumentsNeeded : (ArgumentExtractor[]) AnonymousClass0LR.D(this.mArgumentExtractors)) {
            i += jSArgumentsNeeded.getJSArgumentsNeeded();
        }
        return i;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : '\u0000';
    }

    private static String getAffectedRange(int i, int i2) {
        if (i2 > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append("-");
            stringBuilder.append((i + i2) - 1);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(i);
        return stringBuilder2.toString();
    }

    public final String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) AnonymousClass0LR.D(this.mSignature);
    }

    public final String getType() {
        return this.mType;
    }

    public final void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        RuntimeException nativeArgumentsParseException;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mModuleWrapper.getName());
        stringBuilder.append(".");
        stringBuilder.append(this.mMethod.getName());
        String stringBuilder2 = stringBuilder.toString();
        AnonymousClass09A.B(8192, "callJavaModuleMethod").B("method", stringBuilder2).C();
        int i = 0;
        if (DEBUG) {
            Object[] objArr = new Object[]{this.mModuleWrapper.getName(), this.mMethod.getName()};
        }
        try {
            NativeArgumentsParseException error;
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                error = new Error("processArguments failed");
            } else if (this.mJSArgumentsNeeded == readableArray.size()) {
                int i2 = 0;
                while (i < this.mArgumentExtractors.length) {
                    try {
                        this.mArguments[i] = this.mArgumentExtractors[i].extractArgument(jSInstance, readableArray, i2);
                        i2 += this.mArgumentExtractors[i].getJSArgumentsNeeded();
                        i++;
                    } catch (Throwable e) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(e.getMessage());
                        stringBuilder.append(" (constructing arguments for ");
                        stringBuilder.append(stringBuilder2);
                        stringBuilder.append(" at argument index ");
                        stringBuilder.append(getAffectedRange(i2, this.mArgumentExtractors[i].getJSArgumentsNeeded()));
                        stringBuilder.append(")");
                        nativeArgumentsParseException = new NativeArgumentsParseException(stringBuilder.toString(), e);
                    }
                }
                this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                AnonymousClass09A.C(8192).C();
                return;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append(" got ");
                stringBuilder.append(readableArray.size());
                stringBuilder.append(" arguments, expected ");
                stringBuilder.append(this.mJSArgumentsNeeded);
                error = new NativeArgumentsParseException(stringBuilder.toString());
            }
            throw error;
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not invoke ");
            stringBuilder.append(stringBuilder2);
            nativeArgumentsParseException = new RuntimeException(stringBuilder.toString(), e2);
        } catch (Throwable e22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not invoke ");
            stringBuilder.append(stringBuilder2);
            nativeArgumentsParseException = new RuntimeException(stringBuilder.toString(), e22);
        } catch (Throwable e222) {
            if (e222.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e222.getCause());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not invoke ");
            stringBuilder.append(stringBuilder2);
            nativeArgumentsParseException = new RuntimeException(stringBuilder.toString(), e222);
        } catch (Throwable th) {
            AnonymousClass09A.C(8192).C();
        }
        throw nativeArgumentsParseException;
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != '\u0000') {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got unknown param class: ");
        stringBuilder.append(cls.getSimpleName());
        throw new RuntimeException(stringBuilder.toString());
    }

    private void processArguments() {
        if (!this.mArgumentsProcessed) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mModuleWrapper.getName());
            stringBuilder.append(".");
            stringBuilder.append(this.mMethod.getName());
            AnonymousClass09A.B(8192, "processArguments").B("method", stringBuilder.toString()).C();
            try {
                this.mArgumentsProcessed = true;
                this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
                this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
                this.mArguments = new Object[this.mParameterTypes.length];
                this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
            } finally {
                AnonymousClass09A.C(8192).C();
            }
        }
    }

    private static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != '\u0000') {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got unknown return class: ");
        stringBuilder.append(cls.getSimpleName());
        throw new RuntimeException(stringBuilder.toString());
    }
}
