package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

@JsonAutoDetect(creatorVisibility = Visibility.ANY, fieldVisibility = Visibility.PUBLIC_ONLY, getterVisibility = Visibility.PUBLIC_ONLY, isGetterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.ANY)
public class VisibilityChecker$Std implements VisibilityChecker, Serializable {
    public static final VisibilityChecker$Std DEFAULT = new VisibilityChecker$Std((JsonAutoDetect) VisibilityChecker$Std.class.getAnnotation(JsonAutoDetect.class));
    private static final long serialVersionUID = -7073939237187922755L;
    public final Visibility _creatorMinLevel;
    public final Visibility _fieldMinLevel;
    public final Visibility _getterMinLevel;
    public final Visibility _isGetterMinLevel;
    public final Visibility _setterMinLevel;

    public VisibilityChecker$Std(Visibility visibility) {
        if (visibility == Visibility.DEFAULT) {
            VisibilityChecker$Std visibilityChecker$Std = DEFAULT;
            this._getterMinLevel = visibilityChecker$Std._getterMinLevel;
            this._isGetterMinLevel = visibilityChecker$Std._isGetterMinLevel;
            this._setterMinLevel = visibilityChecker$Std._setterMinLevel;
            this._creatorMinLevel = visibilityChecker$Std._creatorMinLevel;
            this._fieldMinLevel = visibilityChecker$Std._fieldMinLevel;
            return;
        }
        this._getterMinLevel = visibility;
        this._isGetterMinLevel = visibility;
        this._setterMinLevel = visibility;
        this._creatorMinLevel = visibility;
        this._fieldMinLevel = visibility;
    }

    public VisibilityChecker$Std(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
        this._getterMinLevel = visibility;
        this._isGetterMinLevel = visibility2;
        this._setterMinLevel = visibility3;
        this._creatorMinLevel = visibility4;
        this._fieldMinLevel = visibility5;
    }

    public VisibilityChecker$Std(JsonAutoDetect jsonAutoDetect) {
        this._getterMinLevel = jsonAutoDetect.getterVisibility();
        this._isGetterMinLevel = jsonAutoDetect.isGetterVisibility();
        this._setterMinLevel = jsonAutoDetect.setterVisibility();
        this._creatorMinLevel = jsonAutoDetect.creatorVisibility();
        this._fieldMinLevel = jsonAutoDetect.fieldVisibility();
    }

    public static VisibilityChecker$Std defaultInstance() {
        return DEFAULT;
    }

    public boolean isCreatorVisible(AnnotatedMember annotatedMember) {
        return isCreatorVisible(annotatedMember.getMember());
    }

    public boolean isCreatorVisible(Member member) {
        return this._creatorMinLevel.isVisible(member);
    }

    public boolean isFieldVisible(AnnotatedField annotatedField) {
        return isFieldVisible(annotatedField.getAnnotated());
    }

    public boolean isFieldVisible(Field field) {
        return this._fieldMinLevel.isVisible(field);
    }

    public boolean isGetterVisible(AnnotatedMethod annotatedMethod) {
        return isGetterVisible(annotatedMethod.getAnnotated());
    }

    public boolean isGetterVisible(Method method) {
        return this._getterMinLevel.isVisible(method);
    }

    public boolean isIsGetterVisible(AnnotatedMethod annotatedMethod) {
        return isIsGetterVisible(annotatedMethod.getAnnotated());
    }

    public boolean isIsGetterVisible(Method method) {
        return this._isGetterMinLevel.isVisible(method);
    }

    public boolean isSetterVisible(AnnotatedMethod annotatedMethod) {
        return isSetterVisible(annotatedMethod.getAnnotated());
    }

    public boolean isSetterVisible(Method method) {
        return this._setterMinLevel.isVisible(method);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[Visibility:");
        stringBuilder.append(" getter: ");
        stringBuilder.append(this._getterMinLevel);
        stringBuilder.append(", isGetter: ");
        stringBuilder.append(this._isGetterMinLevel);
        stringBuilder.append(", setter: ");
        stringBuilder.append(this._setterMinLevel);
        stringBuilder.append(", creator: ");
        stringBuilder.append(this._creatorMinLevel);
        stringBuilder.append(", field: ");
        stringBuilder.append(this._fieldMinLevel);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public VisibilityChecker$Std with(Visibility visibility) {
        if (visibility == Visibility.DEFAULT) {
            return DEFAULT;
        }
        return new VisibilityChecker$Std(visibility);
    }

    public VisibilityChecker$Std with(JsonAutoDetect jsonAutoDetect) {
        return jsonAutoDetect != null ? withGetterVisibility(jsonAutoDetect.getterVisibility()).withIsGetterVisibility(jsonAutoDetect.isGetterVisibility()).withSetterVisibility(jsonAutoDetect.setterVisibility()).withCreatorVisibility(jsonAutoDetect.creatorVisibility()).withFieldVisibility(jsonAutoDetect.fieldVisibility()) : this;
    }

    public VisibilityChecker$Std withCreatorVisibility(Visibility visibility) {
        Visibility visibility2 = visibility;
        if (visibility == Visibility.DEFAULT) {
            visibility2 = DEFAULT._creatorMinLevel;
        }
        if (this._creatorMinLevel == visibility2) {
            return this;
        }
        return new VisibilityChecker$Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, visibility2, this._fieldMinLevel);
    }

    public VisibilityChecker$Std withFieldVisibility(Visibility visibility) {
        if (visibility == Visibility.DEFAULT) {
            visibility = DEFAULT._fieldMinLevel;
        }
        if (this._fieldMinLevel == visibility) {
            return this;
        }
        return new VisibilityChecker$Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, visibility);
    }

    public VisibilityChecker$Std withGetterVisibility(Visibility visibility) {
        Visibility visibility2 = visibility;
        if (visibility == Visibility.DEFAULT) {
            visibility2 = DEFAULT._getterMinLevel;
        }
        if (this._getterMinLevel == visibility2) {
            return this;
        }
        return new VisibilityChecker$Std(visibility2, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
    }

    public VisibilityChecker$Std withIsGetterVisibility(Visibility visibility) {
        Visibility visibility2 = visibility;
        if (visibility == Visibility.DEFAULT) {
            visibility2 = DEFAULT._isGetterMinLevel;
        }
        if (this._isGetterMinLevel == visibility2) {
            return this;
        }
        return new VisibilityChecker$Std(this._getterMinLevel, visibility2, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
    }

    public VisibilityChecker$Std withSetterVisibility(Visibility visibility) {
        Visibility visibility2 = visibility;
        if (visibility == Visibility.DEFAULT) {
            visibility2 = DEFAULT._setterMinLevel;
        }
        if (this._setterMinLevel == visibility2) {
            return this;
        }
        return new VisibilityChecker$Std(this._getterMinLevel, this._isGetterMinLevel, visibility2, this._creatorMinLevel, this._fieldMinLevel);
    }

    public VisibilityChecker$Std withVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
        switch (propertyAccessor.ordinal()) {
            case 0:
                return withGetterVisibility(visibility);
            case 1:
                return withSetterVisibility(visibility);
            case 2:
                return withCreatorVisibility(visibility);
            case 3:
                return withFieldVisibility(visibility);
            case 4:
                return withIsGetterVisibility(visibility);
            case 6:
                return with(visibility);
            default:
                return this;
        }
    }
}
