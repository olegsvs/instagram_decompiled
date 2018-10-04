package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public interface VisibilityChecker {

    /* renamed from: com.fasterxml.jackson.databind.introspect.VisibilityChecker$1 */
    public /* synthetic */ class C01521 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.fasterxml.jackson.annotation.PropertyAccessor.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = r0;
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.annotation.PropertyAccessor.GETTER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.annotation.PropertyAccessor.SETTER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = com.fasterxml.jackson.annotation.PropertyAccessor.IS_GETTER;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r2 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0 = com.fasterxml.jackson.annotation.PropertyAccessor.ALL;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r0 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.VisibilityChecker.1.<clinit>():void");
        }
    }

    boolean isCreatorVisible(AnnotatedMember annotatedMember);

    boolean isCreatorVisible(Member member);

    boolean isFieldVisible(AnnotatedField annotatedField);

    boolean isFieldVisible(Field field);

    boolean isGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isGetterVisible(Method method);

    boolean isIsGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isIsGetterVisible(Method method);

    boolean isSetterVisible(AnnotatedMethod annotatedMethod);

    boolean isSetterVisible(Method method);

    VisibilityChecker with(Visibility visibility);

    VisibilityChecker with(JsonAutoDetect jsonAutoDetect);

    VisibilityChecker withCreatorVisibility(Visibility visibility);

    VisibilityChecker withFieldVisibility(Visibility visibility);

    VisibilityChecker withGetterVisibility(Visibility visibility);

    VisibilityChecker withIsGetterVisibility(Visibility visibility);

    VisibilityChecker withSetterVisibility(Visibility visibility);

    VisibilityChecker withVisibility(PropertyAccessor propertyAccessor, Visibility visibility);
}
